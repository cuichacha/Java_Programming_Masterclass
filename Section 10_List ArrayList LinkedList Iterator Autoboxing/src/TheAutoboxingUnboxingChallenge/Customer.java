package TheAutoboxingUnboxingChallenge;

import java.util.List;
import java.util.UUID;

/**
 * @author Will Dufresne
 * @Date: 2023-02-02 19:48
 * @Description: The customer class in the autoboxing & unboxing challenge
 */
public record Customer(UUID Id, String name, List<Double> transactions) {
    public Customer(UUID Id, String name, List<Double> transactions) {
        this.Id = UUID.randomUUID();
        this.name = name;
        this.transactions = transactions;
    }

    public Customer(String name, List<Double> transactions) {
        this(null, name, transactions);
    }
}