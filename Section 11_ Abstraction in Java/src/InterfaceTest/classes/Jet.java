package InterfaceTest.classes;

import InterfaceTest.interfaces.actions.moves.Fly;
import InterfaceTest.interfaces.actions.moves.Move;

/**
 * @author Will Dufresne
 * @Date: 2023-02-08 08:01
 * @Description: The jet class in interface test
 */
public class Jet implements Move, Fly {


    @Override
    public void takeOff() {

    }

    @Override
    public void gilde() {

    }

    @Override
    public String fly() {
        return getClass().getSimpleName() + Fly.super.fly();
    }
}