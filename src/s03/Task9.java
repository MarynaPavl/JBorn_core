package s03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) throws IOException {
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        int n = requestNumber();
        String[] list = new String[n];
        for (int i = 0; i < list.length; i++) {
            System.out.println("Строка" + i + ":");
            String s = reader.readLine();
            list[i] = s;
        }

        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + ",");
        }
    }

    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        return scanner.nextInt();
    }
}
