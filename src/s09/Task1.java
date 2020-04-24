package s09;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;


public class Task1 {
    public static void main(String[] args) {
        Path tmp = Path.of("C:\\Users\\admin\\IdeaProjects\\JBorn_Core_11_Pavlytska");
        ArrayList<Path> arrayList = findFile(tmp, "Task1.java");

        System.out.println(arrayList.toString());

    }

    public static ArrayList<Path> findFile(Path path, String fileName) {
        ArrayList<Path> arrayList = new ArrayList<>();
        try (DirectoryStream<Path> dirstrm = Files.newDirectoryStream(path)) {
            for (Path newpath : dirstrm) {
                if (Files.isDirectory(newpath)) {
                    arrayList.addAll(findFile(newpath, fileName));
                } else {
                    if (newpath.toString().contains(fileName)) {
                        arrayList.add(newpath.toAbsolutePath());
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arrayList;
    }
}


