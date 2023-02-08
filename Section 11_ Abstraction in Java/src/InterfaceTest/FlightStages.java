package InterfaceTest;

/**
 * @author Will Dufresne
 * @Date: 2023-02-08 09:21
 * @Description: The flight stages calss in interface test
 */
public enum FlightStages implements Trackable {

    GROUNDED, LAUNCH, CRUISE, DATA_COLLECTION;

    @Override
    public void track() {

    }
}