package AbstractClassChallenge;

import java.util.List;

/**
 * @author Will Dufresne
 * @Date: 2023-02-07 16:02
 * @Description: The store class in abstract class challenge
 */
public class Store {
    private List<ProductForSale> productForSaleList;

    private void addItemToOrder(ProductForSale productForSale) {
        this.productForSaleList.add(productForSale);
    }

    public void printOrder() {
        System.out.println(this.productForSaleList);
    }
}