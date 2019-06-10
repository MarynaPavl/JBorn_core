package s03;

import java.util.Scanner;

public class Task5 {
    static boolean isPalindrom(char[] s) {

        for (int i = 0; i < s.length / 2; i++) {
            if (s[i] != s[s.length - i - 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str = line();
        char[] s = str.toCharArray();
        System.out.println(isPalindrom(s));

    }

    static String line() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        return scanner.nextLine();
    }
}
