package s06;

public class Square extends Shape {

    Square(double sideA) {
        this.sideA = sideA;
    }

    @Override
    public double calculatePerimeter() {
        return p = sideA * 4;
    }

    @Override
    public double calculateArea() {

        return s = Math.pow(sideA, 2);
    }

}