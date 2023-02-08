package InterfaceTest;

/**
 * @author Will Dufresne
 * @Date: 2023-02-07 20:10
 * @Description: The main class in interface test
 */
public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Animal animal = bird;
        Truck truck = new Truck();
        Jet jet = new Jet();
        // animal.move();
        // FlightEnabled flightEnabled = bird;
        // flightEnabled.takeOff();
        // Trackable trackable = bird;
        // trackable.track();
        inFlight(bird);
        // inFlight(truck);
        inFlight(jet);

    }

    private static void inFlight(FlightEnabled flier) {
        flier.takeOff();
        if (flier instanceof Trackable trackable) {
            trackable.track();
            Trackable.track("");
        }
    }
}