package s02;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int n = requestNumber();
        int a = n /10;
        int b = n /1;
        int c = n % 10 + a;
        int d = a * (c-a);
        System.out.println("Число десятков ="+a+"; число единиц="+b+"; сумма цифр ="+c+"; произведение цифр ="+d);

    }
    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        return scanner.nextInt();
    }
}
