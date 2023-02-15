package InterfaceTest;

import InterfaceTest.classes.Eagle;
import InterfaceTest.classes.Jet;
import InterfaceTest.interfaces.actions.moves.Fly;
import InterfaceTest.interfaces.actions.moves.Walk;
import InterfaceTest.interfaces.states.Breathe;

import java.util.Set;

/**
 * @author Will Dufresne
 * @Date: 2023-02-07 20:10
 * @Description: The main class in interface test
 */
public class Main {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        System.out.println(eagle.action());
        eagle.addStates(Set.of(new Breathe() {
        }));
        eagle.addActions(Set.of(new Fly() {
            @Override
            public void takeOff() {
            }

            @Override
            public void glide() {
            }
        }, new Walk() {
        }));
        System.out.println(eagle.action());
        System.out.println(eagle.fly());
        Jet jet = new Jet();
        System.out.println(jet.fly());
    }

    private static void inFlight(Fly flier) {

    }
}