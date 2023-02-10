package InterfaceTest.interfaces;

/**
 * @author Will Dufresne
 * @Date: 2023-02-10 18:37
 * @Description: The sleep interface in interface test
 */
public interface Sleep extends Action {

    @Override
    default String action() {
        return " is sleeping";
    }
}