package TheLinkedListChallenge;

import java.util.*;

/**
 * @author Will Dufresne
 * @Date: 2023-01-30 20:16
 * @Description: The linkedList challenge class in this section
 */
public class TheLinkedListChallenge {
    private static boolean isStop = false;
    private static boolean forward = true;
    private static boolean backward = false;

    public static void main(String[] args) {
        linkedListChallenge();
    }

    private static void linkedListChallenge() {
        List<String> places = new LinkedList<>(List.of("Adelaide", "Alice Springs", "Brisbane",
                "Darwin", "Melbourne", "Perth"));
        Scanner scanner = showMenu();
        StringBuilder stringBuilder = new StringBuilder("Sydney");
        ListIterator<String> iterator = places.listIterator();
        travel(scanner, stringBuilder, iterator);
    }

    private static Scanner showMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Available actions (select word or letter):
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit\s""");
        return scanner;
    }

    private static void travel(Scanner scanner,
                                  StringBuilder stringBuilder,
                                  ListIterator<String> iterator) {
        while (!isStop) {
            String option = scanner.nextLine().toUpperCase();
            switch (option) {
                case "F" -> {
                    if (iterator.hasNext()) {
                        if (backward) {
                            iterator.next();
                            movingForward(stringBuilder, iterator);
                        } else if (forward) {
                            movingForward(stringBuilder, iterator);
                        }
                    } else {
                        System.out.println("Now you are at Perth");
                    }
                }
                case "B" -> {
                    if (iterator.hasPrevious()) {
                        if (forward) {
                            iterator.previous();
                            movingBackward(stringBuilder, iterator);
                        } else if (backward) {
                            movingBackward(stringBuilder, iterator);
                        }
                    } else {
                        if (backward) {
                            stringBuilder.append(" -----> Sydney");
                            forward = true;
                            backward = false;
                        }
                        System.out.println("Now you are at Sydney");
                    }
                }
                case "L" -> {
                    System.out.println(stringBuilder);
                }
                case "M" -> showMenu();
                case "Q" -> isStop = true;
                default -> System.out.println("Invalid Option!");
            }
        }
    }

    private static void movingBackward(StringBuilder stringBuilder, ListIterator<String> iterator) {
        if (iterator.hasPrevious()) {
            String previous = iterator.previous();
            stringBuilder.append(" -----> ").append(previous);
            System.out.println("Now you are at " + previous);
        } else {
            stringBuilder.append(" -----> Sydney");
            System.out.println("Now you are at Sydney");
        }
        backward = true;
        forward = false;
    }

    private static void movingForward(StringBuilder stringBuilder, ListIterator<String> iterator) {
        if (iterator.hasNext()) {
            String next = iterator.next();
            stringBuilder.append(" -----> ").append(next);
            System.out.println("Now you are at " + next);
        } else {
            stringBuilder.append(" -----> Perth");
            System.out.println("Now you are at Perth");
        }
        forward = true;
        backward = false;
    }
}