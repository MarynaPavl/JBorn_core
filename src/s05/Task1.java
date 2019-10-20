package s05;


public class Task1 {
    public static void main(String[] args) {
        Hero rox = new Hero();
        GodTimeHero nyx = new GodTimeHero(5);
        nyx.vulnerableTime();
        nyx.printStatus();
        nyx.impact(40);
        nyx.printStatus();

    }
}
