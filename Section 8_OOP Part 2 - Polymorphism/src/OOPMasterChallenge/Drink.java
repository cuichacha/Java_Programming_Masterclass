package OOPMasterChallenge;

/**
 * @author Will Dufresne
 * @Date: 2023-01-23 16:09
 * @Description: The drink class in the oop master challenge
 */
public class Drink extends Food {

    public Drink(DrinkType drinkType, DrinkSize drinkSize) {
        super(drinkSize.name() + "_" + drinkType.name(), drinkType, drinkSize.getPrice() * drinkType.getPrice());
    }

    @Override
    protected void printOrder() {
        System.out.printf("%20s: %2.2f%n", getName().toUpperCase(), getPrice());
    }
}