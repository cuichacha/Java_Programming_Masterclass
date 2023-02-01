package ClassesChallengeExercise;

import java.math.BigDecimal;

/**
 * @author Will Dufresne
 * @Date: 2023-01-11 08:20
 * @Description: The bank account class in classes challenge exercise
 */
public class BankAccount {
    private String account;
    private BigDecimal balance = BigDecimal.ZERO;
    private String customerName;
    private String email;
    private String phoneNumber;

    public void deposit(BigDecimal amount) {
        this.balance = this.balance.add(amount);
    }

    public void withdraw(BigDecimal amount) {
        if (balance.subtract(amount).compareTo(BigDecimal.ZERO) < 0) {
            System.out.println("Insufficient Balance");
        } else {
            this.balance = this.balance.subtract(amount);
        }
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}