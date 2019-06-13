package s03;

import java.util.Locale;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = scanner.nextLine();
        System.out.println("Введите символ");
        char c = scanner.next().charAt(0);
        System.out.println("Количество вхождений: " + countChar(str, c));
        String s = Character.toString(c);

        System.out.println("Преобразованная строка " + str.replace(s, s.toUpperCase()));
    }

    static int countChar(String str, char c) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c)
                count++;
        }

        return count;
    }

}
