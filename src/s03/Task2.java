package s03;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Random rand = new Random();
        int n = requestNumber();
        int [] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
            System.out.print("Результат:"+array[i]);
        }
    }

    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        return scanner.nextInt();
    }
}

