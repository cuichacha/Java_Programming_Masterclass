package InterfaceTest.interfaces;

/**
 * @author Will Dufresne
 * @Date: 2023-02-10 07:22
 * @Description: The move interface in interface test
 */
public interface Move extends Action {

    default String action() {
        return " is moving";
    }
}