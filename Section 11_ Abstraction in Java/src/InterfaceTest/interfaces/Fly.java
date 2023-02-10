package InterfaceTest.interfaces;

/**
 * @author Will Dufresne
 * @Date: 2023-02-07 20:09
 * @Description: The flight enabled interface in interface test
 */
public interface Fly extends Move {

    void takeOff();

    void gilde();

    default void fly() {
        System.out.println(getClass().getSimpleName() + " is flying");
    }
}