package InterfaceTest.interfaces.actions.moves;

import InterfaceTest.interfaces.actions.Action;

/**
 * @author Will Dufresne
 * @Date: 2023-02-10 07:22
 * @Description: The move interface in interface test
 */
public interface Move extends Action {

    @Override
    default String action() {
        return " is moving";
    }
}