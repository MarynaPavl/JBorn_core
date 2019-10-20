package s06;

public class Task3 {
    public static void main(String[] args) {
        Wagon[] wagons = new Wagon[3];
        wagons[0] = new Wagon(56);
        wagons[1] = new Wagon(47);
        wagons[2] = new Wagon(51);
        Train trains = new Train(wagons);
        System.out.println(trains.tonnage());
        System.out.println(trains.middleTonnage());
    }
}
