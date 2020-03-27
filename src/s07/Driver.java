package s07;

import java.time.LocalDate;

class Driver {


    private String firstName;
    private String middleName;
    private String lastName;
    private LocalDate birthday;
    private String seriesNumber;
    private LocalDate dayOfIssue;

    Driver(String firstName, String middleName, String lastName, int year, int month,
           int dayOfMonth, String seriesNumber, int years, int months, int days) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.birthday = LocalDate.of(year, month, dayOfMonth);
        this.seriesNumber = seriesNumber;
        this.dayOfIssue = LocalDate.of(years, months, days);
    }

    LocalDate getBirthday() {
        return birthday;
    }

    LocalDate getDayOfIssue() {
        return dayOfIssue;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
