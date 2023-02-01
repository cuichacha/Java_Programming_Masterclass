package OOPMasterChallenge;

/**
 * @author Will Dufresne
 * @Date: 2023-01-23 16:11
 * @Description: The food class in oop master challenge
 */
public class Food {
    private final String name;
    private final Enum type;
    private final double price;

    protected Food(String name, Enum type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Enum getType() {
        return type;
    }

    protected double getPrice() {
        return price;
    }

    protected void printOrder() {
        System.out.printf("%10s:%2.2f%n", getName().toUpperCase(), getPrice());
    }
}