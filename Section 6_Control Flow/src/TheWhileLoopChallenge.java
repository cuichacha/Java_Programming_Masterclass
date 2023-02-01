/**
 * @author Will Dufresne
 * @Date: 2023-01-06 14:29
 * @Description: The while loop challenge in this section
 */
public class TheWhileLoopChallenge {
    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        int num = 5;
        int count = 0;
        while (num <= 20) {
            if (isEvenNumber(num)) {
                count++;
                System.out.println(num);
            }
            if (count >= 5) {
                break;
            }
            num++;
        }
    }
}