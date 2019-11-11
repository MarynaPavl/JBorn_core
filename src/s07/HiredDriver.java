package s07;

import java.time.LocalDate;
import java.time.Period;

public class HiredDriver implements Validator<Driver> {
    private int years;
    private int experience;

    public HiredDriver(int years, int experience) {
        this.years = years;
        this.experience = experience;
    }

    public int getYears() {
        return years;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public boolean isValid(Driver obj) {
        LocalDate x = obj.getBirthday();
        LocalDate y = obj.getDayOfIssue();
        return (Period.between(x, LocalDate.now()).getYears() >= years
                && Period.between(y, LocalDate.now()).getYears() >= experience);
    }
}