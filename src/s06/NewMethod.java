package s06;

public class NewMethod {




    static double figures(Shape[]shapes) {
        double sum = 0;
        for (Shape shape : shapes) {
            sum += shape.calculateArea();
        }
        return sum;
    }



}