package ReverseArrayChallenge;

import java.util.Arrays;

/**
 * @author Will Dufresne
 * @Date: 2023-01-25 16:57
 * @Description: The reverse array challenge in this section
 */
public class ReverseArrayChallenge {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(1, 2, 3, 4, 5)));
    }

    private static int[] reverse(int... intArr) {
        String join = String.join(",", Arrays.stream(intArr).boxed().map(String::valueOf).toList());
        StringBuilder reverse = new StringBuilder(join).reverse();
        String[] split = new String(reverse).split(",");
        return Arrays.stream(split).mapToInt(Integer::parseInt).toArray();
    }
}