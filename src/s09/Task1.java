package s09;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        Path tmp = Path.of("C:\\Users\\admin\\IdeaProjects\\JBorn_Core_11_Pavlytska");
        StringBuilder result = findFile(tmp, "Task1.java");
        String[] strings = result.toString().split(" ");
        System.out.println(Arrays.toString(strings));

    }

    public static StringBuilder findFile(Path path, String fileName) {
        StringBuilder result = new StringBuilder();
        try (DirectoryStream<Path> dirstrm = Files.newDirectoryStream(path)) {
            for (Path newpath : dirstrm) {
                if (Files.isDirectory(newpath)) {
                    result.append(findFile(newpath, fileName));
                } else {
                    if (newpath.toString().contains(fileName)) {
                        result.append(newpath.toAbsolutePath()).append("\n");
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}


