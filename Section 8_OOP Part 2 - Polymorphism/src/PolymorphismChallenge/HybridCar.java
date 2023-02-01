package PolymorphismChallenge;

/**
 * @author Will Dufresne
 * @Date: 2023-01-23 10:28
 * @Description: The hybrid car in polymorphism challenge
 */
public class HybridCar extends Car {
    private double avgKmPerLiter;
    private int batterySize;
    private int cylinders;

    @Override
    protected void runEngine() {
        System.out.println(getClass().getSimpleName() + "'s engine in running");
    }
}