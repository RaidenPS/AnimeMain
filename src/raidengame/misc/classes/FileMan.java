package raidengame.misc.classes;

// Imports
import java.nio.file.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class FileMan {
    /**
     * Retrieves a list of all paths in a directory and its subdirectories.
     * @param folder Folder the path to the directory from which to retrieve paths
     * @return List representing all files/subfolders.
     * @throws java.io.IOException Directory/Folder is not found.
     */
    public static List<Path> getPathsFromResource(String folder) throws java.io.IOException {
        try (Stream<Path> paths = Files.walk(Paths.get(folder))) {
            return paths.collect(Collectors.toList());
        }
    }

    /**
     * Reads the content of a file into a bytearray.
     * @param filePath The path to the file to be read.
     * @return The bytes of given file.
     * @throws java.io.IOException The file is not found.
     */
    public static byte[] readFile(String filePath) throws java.io.IOException {
        Path path = Paths.get(filePath);
        return Files.readAllBytes(path);
    }
}
