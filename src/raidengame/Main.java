package raidengame;

// Imports
import raidengame.configuration.ConfigManager;
import raidengame.connection.Encryption;
import raidengame.database.DatabaseManager;
import raidengame.misc.CustomLogger;
import raidengame.misc.WordFilter;
import raidengame.server.GameServer;
import lombok.Getter;
import org.reflections.Reflections;

public class Main {
    @Getter private static final CustomLogger logger = new CustomLogger();
    @Getter private static GameServer gameServer;
    public static Reflections reflector = new Reflections("raidengame");

    public static void main(String[] args) {
        ConfigManager.loadConfig();
        Encryption.loadCryptoKeys();
        DatabaseManager.initialize();
        WordFilter.loadWordFilter();

        gameServer = new GameServer();
    }
}