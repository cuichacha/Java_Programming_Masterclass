/**
 * @author Will Dufresne
 * @Date: 2023-01-04 14:05
 * @Description: Overloaded method challenge in this section
 */
public class OverloadedMethodChallenge {

    public static void main(String[] args) {
        System.out.println(convertToCentimeters(1, 1));
    }

    public static double convertToCentimeters(int inches) {
        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches) {
        return convertToCentimeters(feet * 12 + inches);
    }
}