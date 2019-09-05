package s04;

public class Task1 {
    public static void main(String[] args) {
        Hero rox = new Hero(20);
        Hero nyx = new Hero(40);

        nyx.printStatus();

        rox.hit(nyx);

        nyx.printStatus();

        System.out.println("Health Hero rox = " + rox.getHealth());
        System.out.println("Health Hero nyx = " + nyx.getHealth());
        System.out.println("Power Hero rox = " + rox.getPower());
        System.out.println("Power Hero nyx = " + nyx.getPower());
        System.out.println("Speed Hero rox = " + rox.getSpeed());
        System.out.println("Speed Hero nyx = " + nyx.getSpeed());
    }
}
