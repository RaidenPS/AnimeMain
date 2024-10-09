package raidengame.database;

import static dev.morphia.query.experimental.filters.Filters.eq;
// Imports
import raidengame.Main;
import raidengame.configuration.ConfigManager;
import com.mongodb.client.*;
import dev.morphia.*;
import dev.morphia.annotations.Entity;
import dev.morphia.mapping.Mapper;
import dev.morphia.mapping.MapperOptions;
import lombok.Getter;

public final class DatabaseManager {
    @Getter private static MongoClient mongoClient;
    @Getter private static Datastore gameDatastore;

    public static MongoDatabase getGameDatabase() {
        return getGameDatastore().getDatabase();
    }

    public static void initialize()  {
        mongoClient = MongoClients.create(ConfigManager.serverConfig.databaseInfo.mongourl);

        // Set mapper options.
        MapperOptions mapperOptions = MapperOptions.builder().storeEmpties(true).storeNulls(false).build();
        gameDatastore = Morphia.createDatastore(mongoClient, ConfigManager.serverConfig.databaseInfo.databasename, mapperOptions);

        // Map classes.
        var entities =
                Main.reflector.getTypesAnnotatedWith(Entity.class).stream()
                        .filter(
                                cls -> {
                                    Entity e = cls.getAnnotation(Entity.class);
                                    return e != null && !e.value().equals(Mapper.IGNORED_FIELDNAME);
                                })
                        .toArray(Class<?>[]::new);

        gameDatastore.getMapper().map(entities);
        gameDatastore.ensureIndexes();
        Main.getLogger().info("Database initialized successfully.");
    }

    public static synchronized int getNextId(Class<?> c) {
        DatabaseCounter counter =
                getGameDatastore()
                        .find(DatabaseCounter.class)
                        .filter(eq("_id", c.getSimpleName()))
                        .first();
        if (counter == null) {
            counter = new DatabaseCounter(c.getSimpleName());
        }

        try {
            return counter.getNextId();
        } finally {
            DatabaseHelper.saveGameAsync(counter);
        }
    }

    public static synchronized int getNextId(Object o) {
        return getNextId(o.getClass());
    }
}
