package InterfaceTest.interfaces.actions.moves;

/**
 * @author Will Dufresne
 * @Date: 2023-02-07 20:09
 * @Description: The flight enabled interface in interface test
 */
public interface Fly extends Move {

    void takeOff();

    void gilde();

    @Override
    default String action() {
        return fly();
    }

    default String fly() {
        return " is flying";
    }
}