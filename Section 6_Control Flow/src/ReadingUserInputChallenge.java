import java.util.Scanner;

/**
 * @author Will Dufresne
 * @Date: 2023-01-10 18:29
 * @Description: The reading user input challenge in this section
 */
public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        double sum = 0;
        do {
            System.out.print("Enter number #" + count + ": ");
            String nextLine = scanner.nextLine();
            try {
                sum += Double.parseDouble(nextLine);
            } catch (NumberFormatException e) {
                System.out.println("Wrong Number Format!");
                continue;
            }
            count++;
        } while (count <= 5);
        System.out.println(sum);
    }
}