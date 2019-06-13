package s03;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int a = requestNumber();
        int b = requestNumber();

        for (int i = 0; i < a; ++i)
            for (int j = 0; j <= b; ++j)
                System.out.print((j == b ? '\n' : (i == 0 || i == a - 1 || j == 0 || j == b - 1) ? '*' : ' '));

        System.out.println();

    }

    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        return scanner.nextInt();
    }
}
