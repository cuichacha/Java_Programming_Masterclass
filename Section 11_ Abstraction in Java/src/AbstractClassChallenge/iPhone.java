package AbstractClassChallenge;

/**
 * @author Will Dufresne
 * @Date: 2023-02-07 19:14
 * @Description: The iphone class in abstract class challenge
 */
public class iPhone extends ProductForSale{

    public iPhone(ProductType productType, double price, String description) {
        super(productType, price, description);
    }

    @Override
    protected String showDetails() {
        return "One " + getClass().getSimpleName() + " (" + super.productType + ") " + " is " + super.price;
    }
}