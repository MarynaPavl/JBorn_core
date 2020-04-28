package s09;

import java.io.*;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        File file1 = new File("numbers");
        File file2 = new File("positive_numbers");
        File file3 = new File("negative_numbers");

        try {
            file1.createNewFile();
            file2.createNewFile();
            file3.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        writeToFile(file1);
        readWriteToFile(file1, file2, file3);
//        file1.delete();
//        file2.delete();
//        file3.delete();

    }

    static void writeToFile(File file1) {
        Random random = new Random();

        int[] array1 = new int[100];
        for (int i = 0; i < array1.length; ++i)
            array1[i] = random.nextInt(1001);

        int[] array2 = new int[100];
        for (int i = 0; i < array2.length; ++i)
            array2[i] = random.nextInt(1000) - 1001;

        try (FileWriter writer = new FileWriter(file1)) {
            for (int value : array1) {
                String s = Integer.toString(value);
                writer.write(s + " ");
            }
            for (int value : array2) {
                String s = Integer.toString(value);
                writer.write(s + " ");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    static void readWriteToFile(File file1, File file2, File file3) {
        try (BufferedReader in = new BufferedReader(new FileReader(file1));
             FileWriter writer1 = new FileWriter(file2);
             FileWriter writer2 = new FileWriter(file3)) {
            String string = in.readLine();
            String[] stringarray = string.trim().split(" ");
            int[] array = new int[stringarray.length];
            for (int i = 0; i < stringarray.length; i++) {
                array[i] = Integer.parseInt(stringarray[i]);
            }
            for (int value : array) {
                if (0 < value) {
                    String a = Integer.toString(value);
                    writer1.write(a + " ");
                } else {
                    String b = Integer.toString(value);
                    writer2.write(b + " ");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
