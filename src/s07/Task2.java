package s07;

public class Task2 {
    public static void main(String[] args) {
        Driver driver = new Driver("Иван", "Иванович","Иванов",
                1984, 12, 24, "ADC 003526", 2006, 3, 15);
        DriverToPersonConverter converter = new DriverToPersonConverter();

        System.out.println(converter.conversion(driver).getName() +
                " " + converter.conversion(driver).getSurname());
    }
}
