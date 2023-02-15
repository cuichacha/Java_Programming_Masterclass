package InterfaceTest.interfaces.actions.moves;

/**
 * @author Will Dufresne
 * @Date: 2023-02-10 08:53
 * @Description: The walk interface in interface test
 */
public interface Walk extends Move {

    /**
     * The action method in Walk calls walk() by default
     * @return Walk action
     */
    @Override
    default String action() {
        return walk();
    }

    /**
     * The walk method in Walk
     * @return " is walking"
     */
    default String walk() {
        return " is walking";
    }
}