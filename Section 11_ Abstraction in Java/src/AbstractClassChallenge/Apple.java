package AbstractClassChallenge;

/**
 * @author Will Dufresne
 * @Date: 2023-02-07 19:11
 * @Description: The apple class in abstract class challenge
 */
public class Apple extends ProductForSale {

    public Apple(ProductType productType, double price, String description) {
        super(productType, price, description);
    }

    @Override
    protected String showDetails() {
        return "One " + getClass().getSimpleName() + " (" + super.productType + ") " + " is " + super.price;
    }
}