package InterfaceTest.classes;

import InterfaceTest.interfaces.actions.Action;
import InterfaceTest.interfaces.states.State;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Will Dufresne
 * @Date: 2023-02-13 08:30
 * @Description: The animalia class in interface test
 */
public class Animalia implements Action, State {

    private Set<Action> actions = new HashSet<>();
    private Set<State> states = new HashSet<>();

    protected Set<Action> getActions() {
        return actions;
    }

    protected void addActions(Set<Action> actions) {
        this.actions.addAll(actions);
    }

    protected void removeActions(Set<Action> actions) {
        this.actions.removeAll(actions);
    }

    protected Set<State> getStates() {
        return states;
    }

    protected void addStates(Set<State> states) {
        this.states.addAll(states);
    }

    protected void removeStates(Set<State> states) {
        this.states.removeAll(states);
    }

    @Override
    public String action() {
        if (getActions().size() == 0) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Action action : getActions()) {
            stringBuilder.append(action.action());
        }
        return stringBuilder.toString().replaceAll("is", ",").replaceFirst(",", "is");
    }

}