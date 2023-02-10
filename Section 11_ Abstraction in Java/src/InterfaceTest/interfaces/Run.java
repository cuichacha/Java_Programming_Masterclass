package InterfaceTest.interfaces;

/**
 * @author Will Dufresne
 * @Date: 2023-02-10 08:35
 * @Description: The run interface in interface test
 */
public interface Run extends Move {

    @Override
    default String action() {
        return run();
    }

    private String run() {
        return " is running";
    }
}