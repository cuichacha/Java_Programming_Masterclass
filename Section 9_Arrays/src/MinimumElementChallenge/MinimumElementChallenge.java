package MinimumElementChallenge;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Will Dufresne
 * @Date: 2023-01-25 16:30
 * @Description: The minimum element challenge in this section
 */
public class MinimumElementChallenge {
    public static void main(String[] args) {
        int[] intArr = readIntegers();
        System.out.println(Arrays.toString(intArr));
        System.out.println(findMin(intArr));
    }

    private static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        String nextLine = scanner.nextLine();
        String[] strings = nextLine.split(",");
        return Arrays.stream(strings).mapToInt(value -> Integer.parseInt(value.trim())).toArray();
    }

    private static int findMin(int... intArr) {
        return Arrays.stream(intArr).summaryStatistics().getMin();
    }
}