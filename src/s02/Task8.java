package s02;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        int N = requestNumber();
        for (int i = 1; i <= 10; i++) {
            System.out.println(N + "*" + i + "=" + N * 1);

        }

    }

    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        return scanner.nextInt();
    }
}
