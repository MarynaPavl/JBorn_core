package s06;

public class Rectangle extends Shape {
    private double sideA;
    private double sideB;

    Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }


    @Override
    public double calculatePerimeter() {
        return p = (sideA + sideB) * 2;
    }

    @Override
    public double calculateArea() {
        return s = sideA * sideB;
    }
}
