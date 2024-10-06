package raidengame.configuration;

// Imports
import raidengame.Main;
import raidengame.configuration.containers.*;
import raidengame.misc.classes.FileMan;
import java.io.IOException;

public final class ConfigManager {
    private static final String CONST_CONFIG_FILE_NAME_PATH = "./resources/settings.json";

    // Configs
    public static SettingsContainer serverConfig;

    public static void loadConfig() {
        try {
            serverConfig = FileMan.loadFromJsonFile(CONST_CONFIG_FILE_NAME_PATH, SettingsContainer.class);
            Main.getLogger().info("The config was loaded successfully.");
        }
        catch (IOException e) {
            Main.getLogger().warn("Unable to load the config. Using a remake one!");
            serverConfig = new SettingsContainer();
            saveConfig();
        }
    }

    public static void saveConfig() {
        try {
            FileMan.saveFromJsonFile(CONST_CONFIG_FILE_NAME_PATH, serverConfig);
        }catch (IOException ignored) {}
    }
}
