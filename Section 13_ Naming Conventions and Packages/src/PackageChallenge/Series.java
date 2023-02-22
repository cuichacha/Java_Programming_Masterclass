package PackageChallenge;

/**
 * @author Will Dufresne
 * @Date: 2023-02-22 18:04
 * @Description: The series class in package challenge
 */
public class Series {

    public static int nSum(int n) {
        return n * (n + 1) / 2;
    }

    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}