package s04;

import java.util.Collections;

public class Hero {
    static int INITIAL_HEALTH = 100;

    public int getHealth() {
        return health;
    }

    private int health;

    public int getPower() {
        return power;
    }

    private final int power;

    public int getSpeed() {
        return speed;
    }

    private final int speed;

    public Hero() {
        health = INITIAL_HEALTH;
        power = 50;
        speed = 50;
    }

    public Hero(int power) {
        this.health = INITIAL_HEALTH;
        this.power = power % 100;
        this.speed = 100 - this.power;
    }

    public void hit(Hero hero) {
        hero.health = hero.health - this.power;
    }

    public void printStatus() {
        System.out.println("health \t" + repeatAsterics(health / 10) + "\n"
                + "power \t" + repeatAsterics(power / 10) + "\n"
                + "speed \t" + repeatAsterics(speed / 10) + "\n");
    }

    private static String repeatAsterics(int times) {
        return String.join("", Collections.nCopies(times, "*"));
    }
}
