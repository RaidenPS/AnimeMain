package raidengame.database;

// Imports
import raidengame.configuration.ConfigManager;
import dev.morphia.annotations.*;

@Entity(value = "counters", useDiscriminator = false)
public class DatabaseCounter {
    @Id private String id;
    private int count;

    public DatabaseCounter() {}

    public DatabaseCounter(String id) {
        this.id = id;
        this.count = ConfigManager.serverConfig.databaseInfo.startPlayerCounterPosition;
    }

    public int getNextId() {
        int id = ++count;
        return id;
    }
}
