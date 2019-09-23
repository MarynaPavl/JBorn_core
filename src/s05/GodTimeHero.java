package s05;

import java.util.concurrent.TimeUnit;

public class GodTimeHero extends Hero {
    private int godMinutes;
    private long vulnerableTime;
    private long creation;


    public GodTimeHero(int godMinutes) {

        this.godMinutes = godMinutes;
        this.creation = System.currentTimeMillis();

    }

    public void vulnerableTime() {
        vulnerableTime = creation + TimeUnit.MINUTES.toMillis(godMinutes);
    }

    public long getVulnerableTime() {
        return vulnerableTime;
    }


    @Override
    public void impact(int power) {
        long hitTime = System.currentTimeMillis();
        if (hitTime < getVulnerableTime()) {
            super.impact(power);
        }
    }
}

