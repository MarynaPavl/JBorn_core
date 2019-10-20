package s05;

import java.util.Collections;

public class Hero {
    static int INITIAL_HEALTH = 100;
    int health;
    protected final int power;
    private final int speed;


    public int getHealth() {

        return health;
    }


    public int getPower() {
        return power;
    }


    public int getSpeed() {
        return speed;
    }


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
        hero.impact(hero.power);
    }

    public void impact(int power) {
        this.health = this.health - power;
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
