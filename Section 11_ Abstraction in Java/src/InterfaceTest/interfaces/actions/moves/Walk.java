package InterfaceTest.interfaces.actions.moves;

/**
 * @author Will Dufresne
 * @Date: 2023-02-10 08:53
 * @Description: The walk interface in interface test
 */
public interface Walk extends Move {

    @Override
    default String action() {
        return walk();
    }

    default String walk() {
        return " is walking";
    }
}