package s05;

public class Task3{
    public static void main(String[] args) {
        ComplexNumber x = new ComplexNumber(5, 4.2);
        ComplexNumber y = new ComplexNumber(5, 4.2);

        System.out.println(x.equals(y));
        System.out.println(x.hashCode());
        System.out.println(y.hashCode());

    }

}
