package CompositionChallenge;

/**
 * @author Will Dufresne
 * @Date: 2023-01-18 07:32
 * @Description: The dishwasher class in composition challenge
 */
public class DishWasher extends Appliance{

    public DishWasher(boolean power, boolean hasWorkToDo) {
        super(power, hasWorkToDo);
    }

    private void doDishes() {
        System.out.println("Washing dishes...");
        setHasWorkToDo(false);
    }
}