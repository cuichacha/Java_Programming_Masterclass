package OOPMasterChallenge;

/**
 * @author Will Dufresne
 * @Date: 2023-01-23 16:13
 * @Description: The drink type enum in oop master challenge
 */
public enum DrinkType {
    Coke("Coke", 1.0),
    Sprint("Sprint", 1.0);

    private final String type;
    private final double price;

    DrinkType(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}