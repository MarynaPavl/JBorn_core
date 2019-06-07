package s03;

import javax.sound.sampled.Line;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите государство:");
        String str1 = scanner.nextLine();
        System.out.println("Введите столицу:");
        String str2 = scanner.nextLine();

        System.out.println("'Столица государства " + str1 + " - город " + str2 + "'");
    }
}