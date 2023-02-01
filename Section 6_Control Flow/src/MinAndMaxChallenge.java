import java.util.Scanner;

/**
 * @author Will Dufresne
 * @Date: 2023-01-10 19:42
 * @Description: The min and max challenge in this section
 */
public class MinAndMaxChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        do {
            System.out.print("Enter Number: ");
            try {
                double num = Double.parseDouble(scanner.nextLine());
                if (num <= min) {
                    min = num;
                }
                if (num >= max) {
                    max = num;
                }
                System.out.println("Min: " + min + " --- Max: " + max);
            } catch (NumberFormatException e) {
                break;
            }
        } while (true);
    }
}