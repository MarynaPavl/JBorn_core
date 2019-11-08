package s07;

public class Task1 {
    public static void main(String[] args) {
        Driver driver = new Driver("Иванов", "Иван", "Иванович",
                1984, 12, 24,
                "ADC 003526", 2016, 3, 15);
        HiredDriver hiredDriver = new HiredDriver();

        System.out.println("Имеет ли водитель возраст больше 30 лет и права больше 5 лет: "
                + hiredDriver.isValid(driver));

    }
}
