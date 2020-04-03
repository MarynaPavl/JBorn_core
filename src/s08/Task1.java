package s08;

import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;

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
        } catch (FileNotFoundException f) {
            System.out.println("Файл не найден");
        } catch (Exception e) {
            e.printStackTrace();
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
        ArrayList<Integer> arrayList = new ArrayList<>();
        int sum = 0;

        for (String number : array) {
            try {
                arrayList.add(Integer.parseInt(number));
            } catch (NumberFormatException nfe) {
                System.out.println("Не допустимый формат числа");
            }
        }

        for (int num : arrayList) {
            sum += num;
        }

        String value = String.valueOf(sum);
        BigInteger bigInt = new BigInteger(value);
        if (bigInt.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0) {
            throw new Exception(value + ": сумма привышает допустимое значение");
        }

        writeToFirst(file2, value);
    }
}
