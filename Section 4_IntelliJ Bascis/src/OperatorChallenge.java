/**
 * @author Will Dufresne
 * @Date: 2023-01-02 11:14
 * @Description: The challenge of this section
 */
public class OperatorChallenge {
    public static void main(String[] args) {
        double num1 = 20.00;
        double num2 = 80.00;
        double sum = (num1 + num2) * 100;
        boolean isNoRemainder = sum % 40 == 0;
        System.out.println(isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Get some remainder");
        }
    }
}