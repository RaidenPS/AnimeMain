package raidengame.misc;

// Imports
import raidengame.Main;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public final class WordFilter {
    private static final String CONST_CONFIG_FILE_NAME_PATH = "./resources/bad_words.json";
    private static List<String> badWords;

    /**
     * Loads the bad word (filter) simple detection class.
     */
    public static void loadWordFilter() {
        try (FileReader reader = new FileReader(CONST_CONFIG_FILE_NAME_PATH)) {
            Type listType = new TypeToken<List<String>>() {}.getType();
            badWords = Json.loadToClass(reader, listType);
            Main.getLogger().debug("Loaded total bad words: %d", badWords.size());

        } catch (IOException e) {
            badWords = new ArrayList<>();
        }
        Main.getLogger().info("Filter initialized successfully.");
    }

    /**
     * Checks if a given word is blacklisted.
     * @param word The given word.
     */
    public static boolean checkIsBadWord(String word) {
        if(!checkIsValidUTF8(word)) return true;

        boolean isBadWordDetected = false;
        for(String badword : badWords) {
            if (word.contains(badword)) {
                isBadWordDetected = true;
                break;
            }
        }
        return isBadWordDetected;
    }

    /**
     * Checks if a word contains only ascii characters.
     * @param word The given word.
     */
    public static boolean checkIsValidUTF8(String word) {
        return word.matches("[a-zA-Z0-9]+");
    }
}
