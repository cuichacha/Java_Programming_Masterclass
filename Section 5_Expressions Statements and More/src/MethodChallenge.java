/**
 * @author Will Dufresne
 * @Date: 2023-01-03 19:23
 * @Description: Method challenge in this section
 */
public class MethodChallenge {

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the light score list.");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        }
        return 4;
    }

    public static void main(String[] args) {
        displayHighScorePosition("Tim", calculateHighScorePosition(1500));
        displayHighScorePosition("Tim", calculateHighScorePosition(1000));
        displayHighScorePosition("Tim", calculateHighScorePosition(500));
        displayHighScorePosition("Tim", calculateHighScorePosition(100));
        displayHighScorePosition("Tim", calculateHighScorePosition(25));
    }
}