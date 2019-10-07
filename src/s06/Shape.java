package s06;

public abstract class Shape {
    protected double sideA;
    protected double sideB;
    protected double p;
    protected double s;


    public abstract double calculatePerimeter();

    public abstract double calculateArea();


    public double getSideA() {
        return sideA;

    }

    public double getSideB() {
        return sideB;
    }
}

