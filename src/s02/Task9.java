package s02;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        int n = requestNumber();
        int c = 10;
        int d, i = 0;
        for (; n > 1; n = n / c) {
            d = n % 10;
            i = i + d;
        }
        System.out.println("Сумма цифр числа равна: " + i);

    }

    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        return scanner.nextInt();
    }
}
