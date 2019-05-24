package s02;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int n = requestNumber();
        int m = n/100;
        System.out.println(m);
    }
    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        return scanner.nextInt();
    }
}
