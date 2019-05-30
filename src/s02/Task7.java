package s02;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        double x = requestNumber();
        if (x > 0) {
            double y = Math.pow(Math.sin(x), 2);
            System.out.println("Y равен:" + y);
        } else {
            double y = 1 - 2 * Math.sin(Math.pow(x, 2));
            System.out.println("Y равен:" + y);
        }
    }

    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        return scanner.nextInt();
    }
}
