package InterfaceTest.classes;

import InterfaceTest.interfaces.Action;

import java.util.List;

/**
 * @author Will Dufresne
 * @Date: 2023-02-10 20:11
 * @Description: The cow class in interface test
 */
public class Cow extends Mammal {

    @Override
    public String action() {
        return super.action() == null ? "No actions" : getClass().getSimpleName() + super.action();
    }

    @Override
    public void breatheIn() {

    }

    @Override
    public void breatheOut() {

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
}