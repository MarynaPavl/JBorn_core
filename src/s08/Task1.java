package s08;

import java.io.*;
import java.math.BigInteger;


public class Task1 {
    static String readFirstLine(File file) throws IOException {
        FileInputStream stream = new FileInputStream(file);
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
        String first = reader.readLine();
        reader.close();
        stream.close();
        return first;
    }

    static void writeToFirst(File file, String value) throws IOException {
        FileWriter writer = new FileWriter(file, false);
        writer.write(value);
        writer.flush();
        writer.close();
    }

    public static void main(String[] args) {
        File file1 = new File("test1");
        File file2 = new File("test2");

        try {
            calculate(file1, file2);
        } catch (Exception f) {
            f.printStackTrace();
        }
    }

    static void calculate(File file1, File file2) throws Exception {
        if (file1.canRead()) {
            throw new FileNotFoundException("Файл не доступен");
        }

        String firstLine = readFirstLine(new File(String.valueOf(file1)));

        if (firstLine == null) {
            throw new NullPointerException("Не верный формат файла");
        }

        String[] array = firstLine.split(" ");
        BigInteger sum = BigInteger.valueOf(0);

        for (String number : array) {
            try {
                BigInteger x = new BigInteger(number);
                sum = sum.add(x);
            } catch (NumberFormatException nfe) {
                throw new NumberFormatException("Не допустимый формат числа");
            }
        }

        if (sum.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0) {
            throw new Exception(sum + ": сумма привышает допустимое значение");
        }

        String value = String.valueOf(sum);
        writeToFirst(file2, value);
    }
}