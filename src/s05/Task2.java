package s05;

public class Task2 {
    public static void main(String[] args) {
        Addition ad = new Addition();
        Multiplication m = new Multiplication();

        System.out.println(m.calculate(10,2));
        System.out.println(m.calculate(5,5));
        System.out.println(m.returnPrevious());
        System.out.println(ad.calculate(3,5));
        System.out.println(ad.calculate(2,2));
        System.out.println(ad.returnPrevious());


    }
}
