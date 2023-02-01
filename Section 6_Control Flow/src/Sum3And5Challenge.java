/**
 * @author Will Dufresne
 * @Date: 2023-01-06 08:08
 * @Description: The sum 3 and 5 challenge in this section
 */
public class Sum3And5Challenge {
    public static void main(String[] args) {
        int sum = 0;
        int counter = 0;
        for (int i = 1; i <= 1000 && counter < 5; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
                counter++;
            }
        }
        System.out.println(sum);
    }
}