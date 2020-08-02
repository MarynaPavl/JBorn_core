package s14;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("Task14"); // сделала для удаления файла в конце, не соображу как по другому
        String aString = " Подсчитать в 33 потоков сколько раз встречается каждая буква в русском тексте (текст выбрать самим).\n"
                + "Каждому потоку передается весь текст. Отсортировать буквы в порядке уменьшения частоты символа, используя Comparator.\n"
                + "Текст прочитать из файла. Кодировка файла - UTF-8.\n";
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Task14"), StandardCharsets.UTF_8))) {
            bw.write(aString);
//            InputStreamReader r = new InputStreamReader(new FileInputStream("Task14"));
//            System.out.println(r.getEncoding());
        } catch (IOException e) {
            e.printStackTrace();
        }
        char[] contains = readFile(new File("Task14")).toCharArray();
        System.out.println(contains);
        SumLetters[] s = new SumLetters[]{
                new SumLetters(contains, 'а'),
                new SumLetters(contains, 'б'),
                new SumLetters(contains, 'в'),
                new SumLetters(contains, 'г'),
                new SumLetters(contains, 'д'),
                new SumLetters(contains, 'е'),
                new SumLetters(contains, 'ё'),
                new SumLetters(contains, 'ж'),
                new SumLetters(contains, 'з'),
                new SumLetters(contains, 'и'),
                new SumLetters(contains, 'й'),
                new SumLetters(contains, 'к'),
                new SumLetters(contains, 'л'),
                new SumLetters(contains, 'м'),
                new SumLetters(contains, 'н'),
                new SumLetters(contains, 'о'),
                new SumLetters(contains, 'п'),
                new SumLetters(contains, 'р'),
                new SumLetters(contains, 'с'),
                new SumLetters(contains, 'т'),
                new SumLetters(contains, 'у'),
                new SumLetters(contains, 'ф'),
                new SumLetters(contains, 'х'),
                new SumLetters(contains, 'ц'),
                new SumLetters(contains, 'ч'),
                new SumLetters(contains, 'ш'),
                new SumLetters(contains, 'щ'),
                new SumLetters(contains, 'ъ'),
                new SumLetters(contains, 'ы'),
                new SumLetters(contains, 'ь'),
                new SumLetters(contains, 'э'),
                new SumLetters(contains, 'ю'),
                new SumLetters(contains, 'я')
        };
        Thread[] threads = new Thread[s.length];
        for (int i = 0; i < s.length; i++) {
            Thread thread = new Thread(s[i]);
            thread.start();
            threads[i] = thread;
        }
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        Arrays.sort(s, new LettersComparator());
        for (SumLetters sumLetters : s) {
            System.out.println(sumLetters.getaChar() + " - " + sumLetters.getResult());
        }

        file.delete();

    }

    private static String readFile(File file) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return sb.toString().toLowerCase();
    }
}

