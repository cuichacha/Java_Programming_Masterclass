/**
 * @author Will Dufresne
 * @Date: 2023-01-06 14:39
 * @Description: The digit sum challenge in this section
 */
public class DigitSumChallenge {
    public static int sumDigits(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        do {
            int remainder = number % 10;
            sum += remainder;
            number /= 10;
        } while (number > 0);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(123));
    }
}