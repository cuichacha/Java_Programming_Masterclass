package CompositionChallenge;

/**
 * @author Will Dufresne
 * @Date: 2023-01-18 07:30
 * @Description: The appliance class in composition challenge
 */
public class Appliance {
    private boolean power;
    private boolean hasWorkToDo;

    public Appliance(boolean power, boolean hasWorkToDo) {
        this.power = power;
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}