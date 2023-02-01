package ArrayChallenge;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Will Dufresne
 * @Date: 2023-01-25 14:57
 * @Description: The array challenge class in this section
 */
public class ArrayChallenge {
    public static void main(String[] args) {
        Random random = new Random();
        int[] intArr = new int[10];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(intArr));
        Object[] copiedArr = Arrays.copyOf(Arrays.stream(intArr).boxed().toArray(), intArr.length);
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));
        Arrays.sort(copiedArr, (o1, o2) -> (int) o2 - (int) o1);
        System.out.println(Arrays.toString(copiedArr));
    }
}