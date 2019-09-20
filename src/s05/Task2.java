package s05;

public class Task2 {
    public static void main(String[] args) {
        Operation o = new Operation();
        Addition ad = new Addition();
        Multiplication m = new Multiplication();

        System.out.println(ad.calculate(5,6));
        System.out.println(m.calculate(5,5));
        System.out.println(ad.returnPrevious());
        System.out.println(m.returnPrevious());

    }
}
