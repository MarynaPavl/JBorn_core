package s04;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String str = line();
        System.out.println(reverseString(str));

    }

    static String line() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        return scanner.nextLine();
    }

    private static String reverseString(String str) {
        if (str.length() == 0 || str.length() == 1) {
            return str;
        }

        return reverseString(str.substring(1))+ str.charAt(0);
    }
}
