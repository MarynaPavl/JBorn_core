package s07;

import java.time.LocalDate;

public class Driver {
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private String seriesNumber;
    private LocalDate dayOfIssue;

    Driver(String firstName, String lastName, int year, int month,
           int dayOfMonth, String seriesNumber, int years, int months, int days) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = LocalDate.of(year, month, dayOfMonth);
        this.seriesNumber = seriesNumber;
        this.dayOfIssue = LocalDate.of(years, months, days);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
