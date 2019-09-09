package s04;

public class Task04 {
    public static void main(String[] args) {
        Circle c1 = new Circle(3, 2);

        System.out.println(c1.square());

        Circle c2 = new Circle(-6, -4);

        System.out.println("Есть ли пересечения хотя бы в 1 точке" +
                " с другой окружностью - " + c1.crossing(c2));

        System.out.println(c1.distance(c2));


    }

}



