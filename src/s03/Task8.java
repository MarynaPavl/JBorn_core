package s03;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        String str = line();
        StringBuilder result = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            result.append(str.charAt(i));
        }
        System.out.println(result);
    }

    static String line() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        return scanner.nextLine();
    }

}
