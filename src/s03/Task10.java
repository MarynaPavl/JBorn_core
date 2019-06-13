package s03;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = scanner.nextLine();
        str = str.toLowerCase();

        String[] strings = str.split(" ");

        for (int i = 0; i < str.length(); i++) {

            System.out.println(strings[i]);
            if (strings[i].contains("жы") | strings[i].contains("шы")) {
                System.out.println("Жи/Ши пиши с буквой 'и'");
            } else {
                System.out.println("Правильно");

            }
        }
    }
}



