package InterfaceTest.interfaces.actions;

/**
 * @author Will Dufresne
 * @Date: 2023-02-10 18:44
 * @Description: The eat interface in interface test
 */
public interface Eat extends Action {

    /**
     * The action method in Eat
     * @return " is eating"
     */
    @Override
    default String action() {
        return " is eating";
    }
}