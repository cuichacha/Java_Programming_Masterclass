package InterfaceTest.interfaces;

/**
 * @author Will Dufresne
 * @Date: 2023-02-10 18:44
 * @Description: The eat interface in interface test
 */
public interface Eat extends Action{

    @Override
    default String action() {
        return " is eating";
    }
}