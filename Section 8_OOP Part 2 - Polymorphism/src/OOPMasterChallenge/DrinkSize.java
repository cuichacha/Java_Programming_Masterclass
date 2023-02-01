package OOPMasterChallenge;

/**
 * @author Will Dufresne
 * @Date: 2023-01-23 16:59
 * @Description: The drink size enum in oop master challenge
 */
public enum DrinkSize {
    Small("Small", 1.0),
    Medium("Medium", 2.0),
    Large("Large", 3.0);

    private final String size;
    private final double price;

    DrinkSize(String size, double price) {
        this.size = size;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}