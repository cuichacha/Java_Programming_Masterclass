package InterfaceTest.classes;

import InterfaceTest.interfaces.*;

import java.util.List;

/**
 * @author Will Dufresne
 * @Date: 2023-02-07 20:09
 * @Description: The abstract bird class in interface test
 */
public abstract class Bird extends Animal implements Walk, Fly {

    @Override
    public String action() {
        return super.action();
    }

    @Override
    protected List<Action> getActions() {
        return super.getActions();
    }

    @Override
    protected void setActions(List<Action> actions) {
        super.setActions(actions);
    }

    @Override
    protected void addAction(Action action) {
        super.addAction(action);
    }
}