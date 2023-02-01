import ClassesChallengeExercise.BankAccount;
import ConstructorChallengeExercise.Customer;

import java.math.BigDecimal;

/**
 * @author Will Dufresne
 * @Date: 2023-01-11 08:26
 * @Description: The main class of all challenges in this section
 */
public class ChallengeMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(BigDecimal.TEN);
        bankAccount.withdraw(BigDecimal.TEN);
        System.out.println(bankAccount.getBalance());
        Customer customer = new Customer("Test", "test");
        System.out.println(customer.getName() + customer.getCreditLimit() + customer.getAddress());

    }
}