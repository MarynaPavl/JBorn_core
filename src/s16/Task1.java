package s16;

public class Task1 {
    public static void printDriver(Driver driver, Validator<Driver> validator) {
        if (validator.isValid(driver)) {
            System.out.println(driver);
        }
    }

    public static void main(String[] args) {
        Driver[] drivers = {
                new Driver("Jacob Smith", 15),
                new Driver("William Davis", 9),
                new Driver("Isabella Brown", 14),
                new Driver("Michael Taylor", 5),
                new Driver("Sophia Wilson", 21),
                new Driver("Mia Robinson", 3)
        };
        for (Driver driver : drivers) {
            printDriver(driver, Driver::isSuitable);
        }

    }
}
