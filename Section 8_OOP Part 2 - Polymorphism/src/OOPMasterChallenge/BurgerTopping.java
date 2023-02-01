package OOPMasterChallenge;

/**
 * @author Will Dufresne
 * @Date: 2023-01-23 16:14
 * @Description: The burger topping enum in oop master challenge
 */
public enum BurgerTopping {
    Extra_Lettuce("Extra_Lettuce", 1.0),
    Extra_Onions("Extra_Onions", 1.0),
    Extra_Cheese("Extra_Cheese", 1.0),
    Extra_Pickles("Extra_Pickles", 1.0),
    Extra_Tomatoes("Extra_Tomatoes", 1.0);

    private final String type;
    private final double price;

    BurgerTopping(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}