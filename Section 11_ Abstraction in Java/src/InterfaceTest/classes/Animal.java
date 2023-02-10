package InterfaceTest.classes;

import InterfaceTest.interfaces.*;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Will Dufresne
 * @Date: 2023-02-07 20:08
 * @Description: The abstract animal class in interface test
 */
public abstract class Animal implements Move, Breathe, Sleep, Eat {

    private List<Action> actions = new LinkedList<>();

    protected List<Action> getActions() {
        return actions;
    }

    protected void setActions(List<Action> actions) {
        this.actions = actions;
    }

    protected void addAction(Action action) {
        this.actions.add(action);
    }

    @Override
    public String action() {
        if (getActions().size() == 0) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder(" is");
        for (Action action : getActions()) {
            stringBuilder.append(action.action());
        }
        return stringBuilder.toString();
    }


}