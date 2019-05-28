package s02;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        int x = requestNumber();
        double a = 0.0;
        if (x>0){
            double y = Math.pow(Math.sin(a),2)*x;
            System.out.println("Y равен:" + y);
        }else{
            double y = 1-2*Math.sin(a)* Math.pow(x,2);
            System.out.println("Y равен:" + y);
        }
    }
    static int requestNumber() {
        Scanner scanner = new Scanner(System.in
        System.out.println("Введите число:");
        return scanner.nextInt();
    }
}
