package PolymorphismChallenge;

/**
 * @author Will Dufresne
 * @Date: 2023-01-23 10:27
 * @Description: The electric cat in polymorphism challenge
 */
public class ElectricCar extends Car {
    private double avgKmPerCharge;
    private int batterySize;

    @Override
    protected void runEngine() {
        System.out.println(getClass().getSimpleName() + "'s engine in running");
    }
}