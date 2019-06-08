package s03;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        int n = 1;
        String str = scanner.nextLine();
        String[] split = str.split("");
        for (String s : split) {
            System.out.println(s.repeat(n++));

        }

    }
}