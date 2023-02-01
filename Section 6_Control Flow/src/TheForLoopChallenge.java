/**
 * @author Will Dufresne
 * @Date: 2023-01-06 07:53
 * @Description: The for loop challenge in this section
 */
public class TheForLoopChallenge {

    public static void main(String[] args) {
        findPrimeNumber(100);
    }

    public static void findPrimeNumber(int endNumber) {
        if (endNumber > 1000) {
            System.out.println("Error");
        }
        int counter = 0;
        for (int i = 0; i < endNumber; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                counter++;
                if (counter == 3) {
                    break;
                }
            }
        }
    }

    private static boolean isPrime(int number) {
        if (number <= 2) {
            return number == 2;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}