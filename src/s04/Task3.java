package s04;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int n = requestNumber();
        System.out.println(fibonacci(n));

    }

    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число n:");
        return scanner.nextInt();
    }

    public static int fibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else if (n < 0)
            return fibonacci(n + 2) - fibonacci(n + 1);
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
