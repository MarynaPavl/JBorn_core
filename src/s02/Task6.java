package s02;

import java.util.Scanner;

public class Task6 {
    static void squareCircle(double r) {
        double square = Math.PI * Math.pow(r, 2);
        double circle = 2 * Math.PI * r;
        System.out.println("Площадь круга равна:" + square);
        System.out.println("Длина окружности равна:" + circle);
    }

    public static void main(String[] args) {
        int y = requestNumber();
        double r;
        r = y;
        squareCircle(r);
    }

    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        return scanner.nextInt();
    }
}

