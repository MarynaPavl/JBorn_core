package s02;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
     int n = requestNumber();
     int h = 60 * 60;
     int a = n / h;
     int b = (n - h *a) / 60;
     int c = (n - h *a) - (b * 60);
        System.out.println("Часов = "+a+"; Минут = "+b+"; Секунд= "+c);
    }
    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        return scanner.nextInt();
    }
}
