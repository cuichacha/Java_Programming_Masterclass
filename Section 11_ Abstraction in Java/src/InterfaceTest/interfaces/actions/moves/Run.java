package InterfaceTest.interfaces.actions.moves;

/**
 * @author Will Dufresne
 * @Date: 2023-02-10 08:35
 * @Description: The run interface in interface test
 */
public interface Run extends Move {

    /**
     * The action method in Run calls run() by default
     * @return Run action
     */
    @Override
    default String action() {
        return run();
    }

    /**
     * The run method in Run
     * @return " is running"
     */
    default String run() {
        return " is running";
    }
}