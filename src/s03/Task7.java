package s03;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        String line = line();
        char[] chars = line.toCharArray();
        for (char c : chars) {
            if (Character.isUpperCase(c))
                System.out.print(Character.toString(c).toLowerCase());
            else
                System.out.print(Character.toString(c).toUpperCase());
        }
    }

    static String line() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку содеражащую символы верхнего и нижнего регистра:");
        return scanner.nextLine();
    }
}
