package s07;

import java.time.LocalDate;
import java.time.Period;

public class HiredDriver implements Validator<Driver> {

    @Override
    public boolean isValid(Driver obj) {
        LocalDate x = obj.getBirthday();
        LocalDate y = obj.getDayOfIssue();
        return (Period.between(x, LocalDate.now()).getYears() >= 30
                && Period.between(y, LocalDate.now()).getYears() >= 5);
    }
}