package AbstractClassChallenge;

/**
 * @author Will Dufresne
 * @Date: 2023-02-07 15:53
 * @Description: The product for sale class in abstract class challenge
 */
public abstract class ProductForSale {
    protected ProductType productType;
    protected double price;
    protected String description;

    public ProductForSale(ProductType productType, double price, String description) {
        this.productType = productType;
        this.price = price;
        this.description = description;
    }

    private double getSalesPrice(int quantity) {
        return quantity * this.price;
    }

    private void printPricedLineItem(int quantity) {

    }

    protected abstract String showDetails();
}