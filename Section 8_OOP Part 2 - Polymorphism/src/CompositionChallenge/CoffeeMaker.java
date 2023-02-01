package CompositionChallenge;

/**
 * @author Will Dufresne
 * @Date: 2023-01-18 07:32
 * @Description: The coffeemaker class in composition challenge
 */
public class CoffeeMaker extends Appliance{

    public CoffeeMaker(boolean power, boolean hasWorkToDo) {
        super(power, hasWorkToDo);
    }

    private void brewCoffee() {
        System.out.println("Brewing coffee...");
        setHasWorkToDo(false);
    }


}