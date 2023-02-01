package PolymorphismChallenge;

/**
 * @author Will Dufresne
 * @Date: 2023-01-23 10:26
 * @Description: The gas powered car in polymorphism challenge
 */
public class GasPoweredCar extends Car {
    private double avgKmPerLiter;
    private int cylinders;

    @Override
    protected void runEngine() {
        System.out.println(getClass().getSimpleName() + "'s engine in running");
    }
}