package InterfaceTest.classes;

import InterfaceTest.interfaces.Fly;
import InterfaceTest.interfaces.Walk;

/**
 * @author Will Dufresne
 * @Date: 2023-02-08 09:20
 * @Description: The fragonfly class in interface test
 */
public class DragonFly extends Insect implements Walk, Fly {

    @Override
    public void breatheIn() {

    }

    @Override
    public void breatheOut() {

    }

    @Override
    public void takeOff() {

    }

    @Override
    public void gilde() {

    }

    @Override
    public String action() {
        return super.action() == null ? "No actions" : getClass().getSimpleName() + super.action();
    }
}