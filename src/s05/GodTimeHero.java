package s05;

import java.util.concurrent.TimeUnit;

public class GodTimeHero extends Hero {
    private int godMinutes;
    private long vulnerableTime;


    public GodTimeHero(int godMinutes) {
        this.godMinutes = godMinutes;
    }

    public void vulnerableTime() {
        vulnerableTime = System.currentTimeMillis() + TimeUnit.MINUTES.toMillis(godMinutes);
    }

    public long getVulnerableTime() {
        return vulnerableTime;
    }

    public void sleep() {
        try {
            Thread.sleep(180000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void isVulnerable() {
        long hitTime = System.currentTimeMillis();
        if (hitTime < getVulnerableTime()) {
            this.health = INITIAL_HEALTH;
        }
    }

    @Override
    public void hit2(int power) {
        super.hit2(power);
        isVulnerable();
    }
}


