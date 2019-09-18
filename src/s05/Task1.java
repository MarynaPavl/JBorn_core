package s05;


public class Task1 {
    public static void main(String[] args) {
        Hero rox = new Hero();
        GodTimeHero nyx = new GodTimeHero(2);
        nyx.vulnerableTime();
        nyx.printStatus();
        nyx.sleep();
        nyx.hit2(40);
        nyx.printStatus();

    }
}
