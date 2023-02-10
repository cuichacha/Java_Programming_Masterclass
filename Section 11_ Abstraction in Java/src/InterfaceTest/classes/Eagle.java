package InterfaceTest.classes;

import InterfaceTest.interfaces.Action;

import java.util.List;

/**
 * @author Will Dufresne
 * @Date: 2023-02-10 08:49
 * @Description: The eagle class in interface test
 */
public class Eagle extends Bird {

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

    @Override
    public List<Action> getActions() {
        return super.getActions();
    }

    @Override
    public void setActions(List<Action> actions) {
        super.setActions(actions);
    }

    @Override
    public void addAction(Action action) {
        super.addAction(action);
    }

    @Override
    public void fly() {
        super.fly();
    }

    @Override
    public void walk() {
        super.walk();
    }
}