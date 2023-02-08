package InterfaceTest;

/**
 * @author Will Dufresne
 * @Date: 2023-02-08 09:20
 * @Description: The fragonfly class in interface test
 */
public record DragonFly(String name, String type) implements FlightEnabled {

    @Override
    public void takeOff() {

    }
}