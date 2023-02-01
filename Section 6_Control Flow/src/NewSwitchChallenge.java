/**
 * @author Will Dufresne
 * @Date: 2023-01-05 19:00
 * @Description: The new switch challenge in this section
 */
public class NewSwitchChallenge {
    public static void main(String[] args) {
        System.out.println(printDayOfWeek(1));
        System.out.println(printNumberPlusOne(1));
        printNumberInWord(1);
        System.out.println(getDaysInMonth(1, 2020));
    }

    public static String printDayOfWeek(int numberOfDay) {
        return switch (numberOfDay) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> "Invalid";
        };
    }

    public static String printNumberPlusOne(int num) {
        return switch (num) {
            case 1 -> {
                int result = num + 1;
                yield result + "";
            }
            case 2 -> {
                int result = num + 2;
                yield result + "";
            }
            default -> "0";
        };
    }

    public static void printNumberInWord(int number) {
        switch (number) {
            case 1 -> System.out.println("One");
            case 2 -> System.out.println("Two");
            case 3 -> System.out.println("Three");
            case 4 -> System.out.println("Four");
            case 5 -> System.out.println("Five");
            case 6 -> System.out.println("Six");
            case 7 -> System.out.println("Seven");
            case 8 -> System.out.println("Eight");
            case 9 -> System.out.println("Nine");
            default -> System.out.println("Other");
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            return -1;
        }
        if (year < 1 || year > 9999) {
            return -1;
        }
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                return 31;
            }
            case 2 -> {
                if (isLeapYear(year)) {
                    return 29;
                }
                return 28;
            }
            case 4, 6, 9, 11 -> {
                return 30;
            }
        }
        return 0;
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        if (year % 400 == 0) {
            return true;
        }
        return year % 4 == 0 && year % 100 != 0;
    }
}