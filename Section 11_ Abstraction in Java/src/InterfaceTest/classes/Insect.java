package InterfaceTest.classes;

import InterfaceTest.interfaces.*;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Will Dufresne
 * @Date: 2023-02-10 20:06
 * @Description: The abstract insect class in interface test
 */
public abstract class Insect implements Move, Breathe, Sleep, Eat {
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