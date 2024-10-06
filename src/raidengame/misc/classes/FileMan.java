package raidengame.misc.classes;

// Imports
import raidengame.misc.Json;
import java.io.*;
import java.nio.file.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class FileMan {
    /**
     * Retrieves a list of all paths in a directory and its subdirectories.
     * @param folder Folder the path to the directory from which to retrieve paths
     * @return List representing all files/subfolders.
     * @throws IOException Directory/Folder is not found.
     */
    public static List<Path> getPathsFromResource(String folder) throws IOException {
        try (Stream<Path> paths = Files.walk(Paths.get(folder))) {
            return paths.collect(Collectors.toList());
        }
    }

    /**
     * Reads the content of a file into a bytearray.
     * @param filePath The path to the file to be read.
     * @return The bytes of given file.
     * @throws IOException The file is not found.
     */
    public static byte[] readFile(String filePath) throws IOException {
        Path path = Paths.get(filePath);
        return Files.readAllBytes(path);
    }

    /**
     * Loads a file to class.
     * @param filePath File path
     * @param clazz Class name
     * @return Instance of the class.
     * @throws IOException The file is not found.
     */
    public static <T> T loadFromJsonFile(String filePath, Class<T> clazz) throws IOException {
        try (var fileReader = Files.newBufferedReader(new File(filePath).toPath(), java.nio.charset.StandardCharsets.UTF_8)) {
            return Json.loadToClass(fileReader, clazz);
        }
    }

    /**
     * Saves to file from given class.
     * @param filePath File path.
     * @param object Class name.
     * @throws IOException The file is not found.
     */
    public static void saveFromJsonFile(String filePath, Object object) throws IOException {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(Json.encode(object));
        }
    }
}
