package OOPMasterChallenge;

/**
 * @author Will Dufresne
 * @Date: 2023-01-23 16:35
 * @Description: The side item enum in oop master challenge
 */
public enum SideItemType {
    Fries("Fries", 3.0),
    Salad("Salad", 2.0),
    Nuggets("Nuggets", 5.0);

    private final String type;
    private final double price;

    SideItemType(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}