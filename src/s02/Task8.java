package s02;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        int N = requestNumber();
        if (N >= 1 & N <= 10){
            System.out.println(N+"*1="+N*1);
            System.out.println(N+"*2="+N*2);
            System.out.println(N+"*3="+N*3);
            System.out.println(N+"*4="+N*4);
            System.out.println(N+"*5="+N*5);
            System.out.println(N+"*6="+N*6);
            System.out.println(N+"*7="+N*7);
            System.out.println(N+"*8="+N*8);
            System.out.println(N+"*9="+N*9);
            System.out.println(N+"*10="+N*10);
        }

    }
    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        return scanner.nextInt();
    }
}
