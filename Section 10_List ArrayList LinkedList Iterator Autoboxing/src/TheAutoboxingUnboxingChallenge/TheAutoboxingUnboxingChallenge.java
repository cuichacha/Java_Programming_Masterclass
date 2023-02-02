package TheAutoboxingUnboxingChallenge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Will Dufresne
 * @Date: 2023-02-02 19:56
 * @Description: The autoboxing & unboxing challenge in this section
 */
public class TheAutoboxingUnboxingChallenge {
    public static void main(String[] args) {
        Customer customer1 = new Customer("1", new ArrayList<>(List.of(-1.0, 2.0)));
        Customer customer2 = new Customer("2", new ArrayList<>(List.of(-2.0, 3.0)));
        Customer customer3 = new Customer("3", new ArrayList<>(List.of(-2.0, 3.0)));

        Bank bank = new Bank("Bank", new ArrayList<>());
        bank.addCustomer(customer1);
        bank.addCustomer(customer2);
        bank.addTransactions(customer1, 5.0);
        bank.printTransactions(customer1);
        bank.printTransactions(customer2);
        bank.printTransactions(customer3);
    }
}