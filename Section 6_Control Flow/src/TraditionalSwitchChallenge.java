/**
 * @author Will Dufresne
 * @Date: 2023-01-05 18:50
 * @Description: The traditional switch challenge in this section
 */
public class TraditionalSwitchChallenge {
    public static void main(String[] args) {
        System.out.println(changeLetterToWord('A'));
    }

    public static String changeLetterToWord(char letter) {
        switch (letter) {
            case 'A':
                return "Able";
            case 'B':
                return "Baker";
            default:
                return "";
        }
    }
}