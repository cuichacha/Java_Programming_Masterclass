package TheAutoboxingUnboxingChallenge;

import java.util.List;

/**
 * @author Will Dufresne
 * @Date: 2023-02-02 19:48
 * @Description: The customer class in the autoboxing & unboxing challenge
 */
public record Customer(String name, List<Double> transactions) {
}