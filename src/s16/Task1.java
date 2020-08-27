package s16;

import java.util.Comparator;
import java.util.List;

import static java.util.Arrays.asList;

public class Task1 {

    public static void main(String[] args) {
        List<Driver> drivers = asList(
                new Driver("Jacob Smith", 15),
                new Driver("William Davis", 9),
                new Driver("Isabella Brown", 14),
                new Driver("Michael Taylor", 5),
                new Driver("Sophia Wilson", 21),
                new Driver("Mia Robinson", 3)
        );

        Validator<Driver> validator = d -> d.DrivingExperience > 10; // не понимаю, как этот validator использовать дальше????
        // в фильтре??? тогда не могу понять как это записать

        drivers.stream()
                .filter(driver -> driver.DrivingExperience > 10)
                .sorted(Comparator.comparing(o -> o.FirstAndLastName))
                .map(d -> new Driver(d.FirstAndLastName, d.DrivingExperience))
                .forEach(System.out::println);

    }
}
