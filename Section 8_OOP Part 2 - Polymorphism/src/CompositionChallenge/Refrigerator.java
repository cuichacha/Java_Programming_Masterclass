package CompositionChallenge;

/**
 * @author Will Dufresne
 * @Date: 2023-01-18 07:31
 * @Description: The refrigerator class in composition challenge
 */
public class Refrigerator extends Appliance{

    public Refrigerator(boolean power, boolean hasWorkToDo) {
        super(power, hasWorkToDo);
    }

    private void orderFood() {
        System.out.println("Ordering food...");
        setHasWorkToDo(false);
    }
}