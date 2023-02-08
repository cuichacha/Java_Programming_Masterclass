package InterfaceTest;

/**
 * @author Will Dufresne
 * @Date: 2023-02-07 20:09
 * @Description: The flight enabled interface in interface test
 */
public interface FlightEnabled {

    void takeOff();

    default void gilde() {

    }

    private void test() {

    }
}