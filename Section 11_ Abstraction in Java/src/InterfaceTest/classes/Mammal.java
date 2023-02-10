package InterfaceTest.classes;

import InterfaceTest.interfaces.*;

import java.util.List;

/**
 * @author Will Dufresne
 * @Date: 2023-02-10 08:37
 * @Description: The mammal class in interface test
 */
public abstract class Mammal extends Animal implements Walk, Run {

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

    @Override
    public void walk() {
        Walk.super.walk();
    }


}