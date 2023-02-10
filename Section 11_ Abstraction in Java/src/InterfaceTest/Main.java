package InterfaceTest;

import InterfaceTest.classes.Cow;
import InterfaceTest.classes.DragonFly;
import InterfaceTest.classes.Eagle;
import InterfaceTest.interfaces.Eat;
import InterfaceTest.interfaces.Fly;
import InterfaceTest.interfaces.Sleep;

/**
 * @author Will Dufresne
 * @Date: 2023-02-07 20:10
 * @Description: The main class in interface test
 */
public class Main {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        System.out.println(eagle.action());
        eagle.fly();
        eagle.walk();
        eagle.addAction(new Eat() {});
        System.out.println(eagle.action());
        System.out.println("-".repeat(20));
        Cow cow = new Cow();

        cow.addAction(new Sleep() {});
        System.out.println(cow.action());
        System.out.println("-".repeat(20));
        DragonFly dragonFly = new DragonFly();
        System.out.println(dragonFly.action());
    }

    private static void inFlight(Fly flier) {

    }
}