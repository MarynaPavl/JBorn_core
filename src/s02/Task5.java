package s02;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        double x = requestNumber();
        double y = requestNumber();
        double z = requestNumber();
        x = Math.pow(x, 2);
        y = Math.pow(y, 2);
        z = Math.pow(z, 2);
        if(x == y + z)
            System.out.println("Числа являются тройкой Пифгора, гипотинуза x");
        else if (y == x + z)
        System.out.println("Числа являются тройкой Пифгора, гипотинуза y");
        else if (z == x + y)
            System.out.println("Числа являются тройкой Пифгора, гипотинуза z");
        else
            System.out.println("Не являются");
    }
    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        return scanner.nextInt();
    }
}
