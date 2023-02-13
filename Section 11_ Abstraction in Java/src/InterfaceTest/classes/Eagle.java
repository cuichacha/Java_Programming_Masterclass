package InterfaceTest.classes;

import InterfaceTest.interfaces.actions.Action;
import InterfaceTest.interfaces.states.State;

import java.util.Set;

/**
 * @author Will Dufresne
 * @Date: 2023-02-10 08:49
 * @Description: The eagle class in interface test
 */
public class Eagle extends Bird {

    @Override
    public void takeOff() {

    }

    @Override
    public void gilde() {

    }

    @Override
    public Set<Action> getActions() {
        return super.getActions();
    }

    @Override
    public void addActions(Set<Action> actions) {
        super.addActions(actions);
    }

    @Override
    public void removeActions(Set<Action> actions) {
        super.removeActions(actions);
    }

    @Override
    public Set<State> getStates() {
        return super.getStates();
    }

    @Override
    public void addStates(Set<State> states) {
        super.addStates(states);
    }

    @Override
    public void removeStates(Set<State> states) {
        super.removeStates(states);
    }

    @Override
    public String action() {
        return super.action() == null ? "No actions" : getClass().getSimpleName() + super.action();
    }

    @Override
    public String fly() {
        return getClass().getSimpleName() + super.fly();
    }
}