package s02;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        double x1 = requestNumber();
        double y1 = requestNumber();
        double x2 = requestNumber();
        double y2 = requestNumber();
        double a = Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)));

        System.out.println("Расстояние между точками равно :" + a);
    }
    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        return scanner.nextInt();
    }
}
