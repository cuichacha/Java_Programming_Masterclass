package CompositionChallenge;

/**
 * @author Will Dufresne
 * @Date: 2023-01-18 07:37
 * @Description: The smart kitchen class in composition challenge
 */
public class SmartKitchen {
    private CoffeeMaker coffeeMaker;
    private DishWasher dishWasher;
    private Refrigerator refrigerator;

    public SmartKitchen(CoffeeMaker coffeeMaker, DishWasher dishWasher, Refrigerator refrigerator) {
        this.coffeeMaker = coffeeMaker;
        this.dishWasher = dishWasher;
        this.refrigerator = refrigerator;
    }

    private void powerUpOrOff(boolean power, Appliance appliance) {
        appliance.setPower(power);
    }

    private void powerUpOrOff(boolean power) {
        coffeeMaker.setPower(true);
        dishWasher.setPower(true);
        refrigerator.setPower(true);
    }

    private void addWater() {
        if (coffeeMaker.isPower()) {
            coffeeMaker.setHasWorkToDo(true);
        } else {
            System.out.println("Power is off");
        }
    }

    private void pourMilk() {
        if (refrigerator.isPower()) {
            refrigerator.setHasWorkToDo(true);
        } else {
            System.out.println("Power is off");
        }
    }

    private void loadDishWasher() {
        if (dishWasher.isPower()) {
            dishWasher.setHasWorkToDo(true);
        } else {
            System.out.println("Power is off");
        }
    }
}