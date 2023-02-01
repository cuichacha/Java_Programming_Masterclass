/**
 * @author Will Dufresne
 * @Date: 2023-01-04 14:11
 * @Description: Seconds and minutes challenge in this section
 */
public class SecondsAndMinutesChallenge {

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Error";
        }
        return seconds / 3600 + "h " + getDuration((seconds % 3600) / 60, seconds % 60);
    }

    public static String getDuration(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0) {
            return "Error";
        }
        return minutes + "m " + seconds + "s";
    }

    public static void main(String[] args) {
        System.out.println(getDurationString(1));
    }
}