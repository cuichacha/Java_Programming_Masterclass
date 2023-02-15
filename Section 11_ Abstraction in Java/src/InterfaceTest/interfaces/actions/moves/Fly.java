package InterfaceTest.interfaces.actions.moves;

/**
 * @author Will Dufresne
 * @Date: 2023-02-07 20:09
 * @Description: The flight enabled interface in interface test
 */
public interface Fly extends Move {

    /**
     * The take off method
     */
    void takeOff();

    /**
     * The glide method
     */
    void glide();

    /**
     * The action method in Fly calls fly() by default
     * @return Fly action
     */
    @Override
    default String action() {
        return fly();
    }

    /**
     * The fly method in Fly
     * @return " is flying"
     */
    default String fly() {
        return " is flying";
    }
}