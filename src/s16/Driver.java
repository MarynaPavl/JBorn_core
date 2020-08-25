package s16;

public class Driver {
    String FirstAndLastName;
    int DrivingExperience;

    public Driver(String firstAndLastName, int drivingExperience) {
        FirstAndLastName = firstAndLastName;
        DrivingExperience = drivingExperience;
    }

    public String getFirstAndLastName() {
        return FirstAndLastName;
    }

    public int getDrivingExperience() {
        return DrivingExperience;
    }

    public boolean isSuitable() {
        return getDrivingExperience() > 10;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "FirstAndLastName='" + FirstAndLastName + '\'' +
                ", DrivingExperience=" + DrivingExperience +
                '}';
    }

}
