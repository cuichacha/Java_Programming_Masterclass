package OOPMasterChallenge;

/**
 * @author Will Dufresne
 * @Date: 2023-01-23 16:30
 * @Description: The burger type enum in oop master challenge
 */
public enum BurgerType {
    Chicken("Chicken_Burger", 5.0),
    Beef("Beef_Burger", 8.0),
    Fish("Fish_Burger", 10.0),
    Double_Chicken("Double_Chicken_Burger", 8.0),
    Double_Fish("Double_Fish_Burger", 15.0),
    Double_Beef("Double_Beef_Burger", 18.0);

    private final String type;
    private final double price;

    BurgerType(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public static String getType(Enum burgerType) {
        return ((BurgerType) burgerType).getType();
    }

    public double getPrice() {
        return price;
    }
}