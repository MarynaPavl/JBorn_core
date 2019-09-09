package s04;

import static java.lang.Math.PI;

public class Circle {
    double x;
    double y;
    double r = 3;

    public Circle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double square() {
        double square = PI * Math.pow(r, 2);
        return square;
    }

    public void move(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Circle c2) {
        return Math.sqrt(Math.pow(c2.getx() - x, 2) + Math.pow((c2.gety() - y), 2));

    }

    public double gety() {
        return y;
    }

    public double getx() {
        return x;
    }

    public boolean crossing(Circle c2) {

        return (distance(c2) > r + r || distance(c2) < r - r);


    }
}
    