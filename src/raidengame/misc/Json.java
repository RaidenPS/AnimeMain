package raidengame.misc;

// Imports
import com.google.gson.*;
import java.io.FileReader;
import java.io.Reader;
import java.lang.reflect.Type;

public final class Json {
    private static final Gson gson_resources = new GsonBuilder()
            .setPrettyPrinting()
            .disableHtmlEscaping()
            .create();

    /**
     * Loads a class from given json file.
     * @param fileReader Json file represented as Reader.
     * @param classType Class to load
     */
    public static <T> T loadToClass(Reader fileReader, Class<T> classType) {
        return gson_resources.fromJson(fileReader, classType);
    }

    /**
     * Loads a class from given json file.
     * @param fileReader Json file represented as Reader.
     * @param classType Class to load
     */
    public static <T> T loadToClass(FileReader fileReader, Type classType) {
        return gson_resources.fromJson(fileReader, classType);
    }

    /**
     * Converts an object to json.
     */
    public static String encode(Object object) {
        return gson_resources.toJson(object);
    }
}