/**
 * @author Will Dufresne
 * @Date: 2023-01-06 18:35
 * @Description: The Number Palindrome coding exercise in this section that worth noting
 */
public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-222));
    }

    public static boolean isPalindrome(int number) {
        if (number < 0) {
            number *= -1;
        }
        int copiedNumber = number;
        int reverse = 0;
        while (copiedNumber > 0) {
            int remainder = copiedNumber % 10;
            reverse = reverse * 10 + remainder;
            copiedNumber /= 10;
        }
        return number == reverse;
    }
}