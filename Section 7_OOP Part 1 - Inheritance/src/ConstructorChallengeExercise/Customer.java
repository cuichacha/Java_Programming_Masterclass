package ConstructorChallengeExercise;

import java.math.BigDecimal;

/**
 * @author Will Dufresne
 * @Date: 2023-01-11 16:03
 * @Description: The customer class in constructor challenge exercise
 */
public class Customer {
    private String name;
    private BigDecimal creditLimit;
    private String address;

    public Customer() {
        this("default name", BigDecimal.ZERO, "default address");
    }

    public Customer(String name, BigDecimal creditLimit, String address) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.address = address;
    }

    public Customer(String name, String address) {
        this(name, BigDecimal.ZERO, address);
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public String getAddress() {
        return address;
    }
}