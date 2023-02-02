package TheAutoboxingUnboxingChallenge;

import java.util.List;

/**
 * @author Will Dufresne
 * @Date: 2023-02-02 19:49
 * @Description: The bank class in the autoboxing & unboxing challenge
 */
public class Bank {
    private String name;
    private List<Customer> customers;

    public Bank(String name, List<Customer> customers) {
        this.name = name;
        this.customers = customers;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    void addCustomer(Customer customer) {
        List<Customer> customerList = getCustomers();
        if (!customerList.contains(customer)) {
            customerList.add(customer);
            setCustomers(customerList);
        }
    }

    void addTransactions(Customer customer, double amount) {
        List<Customer> customersList = getCustomers();
        if (customersList.contains(customer)) {
            customer.transactions().add(amount);
        }
    }

    void printTransactions(Customer customer) {
        List<Customer> customerList = getCustomers();
        if (customerList.contains(customer)) {
            System.out.println("-".repeat(20));
            System.out.println("Customer Name: " + customer.name());
            System.out.println("Transactions");
            for (Double transaction : customer.transactions()) {
                System.out.printf("$%10.2f (%s)%n", transaction, transaction < 0 ? "Debit" : "Credit");
            }
            return;
        }
        System.out.printf("Customer %s not found%n", customer.name());
    }
}