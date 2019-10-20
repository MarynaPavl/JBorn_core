package s06;

public class Task1 {
    public static void main(String[] args) {
        Square square = new Square(5,5);
        Rectangle rectangle = new Rectangle(5, 7);
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Периметр квадрата = " + square.calculatePerimeter() +
                ", Площадь квадрата = " + square.calculateArea() + ";");
        System.out.println("Периметр прямоугольника = " + rectangle.calculatePerimeter() +
                ", Площадь прямоугольника = " + rectangle.calculateArea() + ";");
        System.out.println("Периметр треугольника = " + triangle.calculatePerimeter() +
                ", Площадь треугольника =  " + triangle.calculateArea() + ";");
    }
}
