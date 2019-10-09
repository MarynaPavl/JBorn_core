package s06;

public class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;

    }



    @Override
    public double calculatePerimeter() {
        return p = sideA + sideB + sideC;
    }

    @Override
    public double calculateArea() {
        double a = 0.5 * (sideA + sideB + sideC);
        return s = Math.sqrt(a * (a - sideA) * (a - sideB) * (a - sideC));
    }
}
