package s07;

public class Task1 {
    public static void main(String[] args) {
        Driver driver = new Driver("Иванов", "Иван", "Иванович",
                1984, 12, 24,
                "ADC 003526", 2006, 3, 15);
        HiredDriver hiredDriver = new HiredDriver(30,10);

        System.out.println("Имеет ли водитель возраст больше " + hiredDriver.getYears() +
                " лет и права больше " + hiredDriver.getExperience() + " лет? - "
                + hiredDriver.isValid(driver));

    }
}
