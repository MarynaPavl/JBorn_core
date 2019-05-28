package s02;

import java.util.Scanner;

public class Task6 {
    static void squareCircle (double r, double p, double s, double n) {
        s = p * Math.pow(r,2);
        n = 2 * p *r;
        System.out.println("Площадь круга равна:" + s);
        System.out.println("Длина окружности равна:" + n);
    }

    public static void main(String[] args) {
        int y = requestNumber();
        double r;
        r = y;
        double p = 3.14;
        int x = 0;
        double s;
        s = x;
        int z = 0;
        double n;
        n = z;
        squareCircle(r,p,s,n);
    }
    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        return scanner.nextInt();
    }
}

