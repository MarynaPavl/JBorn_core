package s02;

import java.util.Arrays;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        int n = requestNumber();
        int[] mass = new int[n];
        int a = 0;
        int i = 0;
        int s = 1;
        int b = 0;

        for (i = 0; i <= n - 1; i++) {
            mass[i] = b = requestNumber();
        }
        System.out.println(Arrays.toString(mass));

        for (i = 0; i < n; i++) {
            if (i % 2 == 0) {
                a += mass[i];
            } else
                s *= mass[i];
        }
        System.out.println("Сумма = " + a + ", Произведение = " + s);
    }

    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        return scanner.nextInt();
    }
}
