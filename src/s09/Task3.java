package s09;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("Test");
        try (InputStream inputStream = new FileInputStream(file)) {

            String str = readAsString(inputStream, StandardCharsets.UTF_8);

            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        String string;
        int a;

        Reader reader = new InputStreamReader(inputStream, charset);
        StringWriter sw = new StringWriter();

        while ((a = reader.read()) != -1) {
            sw.write(a);
        }
        string = sw.toString();

        return string;
    }
}

