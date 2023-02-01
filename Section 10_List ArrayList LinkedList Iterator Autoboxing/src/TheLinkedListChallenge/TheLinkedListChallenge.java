package TheLinkedListChallenge;

import java.util.*;

/**
 * @author Will Dufresne
 * @Date: 2023-01-30 20:16
 * @Description: The linkedList challenge class in this section
 */
public class TheLinkedListChallenge {
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
        Map<String, Boolean> flags = new HashMap<>(8);
        flags.put("isStop", false);
        flags.put("forward", true);
        flags.put("backward", false);
        while (!flags.get("isStop")) {
            String option = scanner.nextLine().toUpperCase();
            switch (option) {
                case "F" -> {
                    if (iterator.hasNext()) {
                        if (flags.get("backward")) {
                            iterator.next();
                            movingForward(stringBuilder, iterator, flags);
                        } else if (flags.get("forward")) {
                            movingForward(stringBuilder, iterator, flags);
                        }
                    } else {
                        System.out.println("Now you are at Perth");
                    }
                }
                case "B" -> {
                    if (iterator.hasPrevious()) {
                        if (flags.get("forward")) {
                            iterator.previous();
                            movingBackward(stringBuilder, iterator, flags);
                        } else if (flags.get("backward")) {
                            movingBackward(stringBuilder, iterator, flags);
                        }
                    } else {
                        if (flags.get("backward")) {
                            stringBuilder.append(" -----> Sydney");
                            flags.put("forward", true);
                            flags.put("backward", false);
                        }
                        System.out.println("Now you are at Sydney");
                    }
                }
                case "L" -> {
                    System.out.println(stringBuilder);
                }
                case "M" -> showMenu();
                case "Q" -> flags.put("isStop", true);
                default -> System.out.println("Invalid Option!");
            }
        }
    }

    private static void movingBackward(StringBuilder stringBuilder,
                                       ListIterator<String> iterator,
                                       Map<String, Boolean> flags) {
        if (iterator.hasPrevious()) {
            String previous = iterator.previous();
            stringBuilder.append(" -----> ").append(previous);
            System.out.println("Now you are at " + previous);
        } else {
            stringBuilder.append(" -----> Sydney");
            System.out.println("Now you are at Sydney");
        }
        flags.put("backward", true);
        flags.put("forward", false);
    }

    private static void movingForward(StringBuilder stringBuilder,
                                      ListIterator<String> iterator,
                                      Map<String, Boolean> flags) {
        if (iterator.hasNext()) {
            String next = iterator.next();
            stringBuilder.append(" -----> ").append(next);
            System.out.println("Now you are at " + next);
        } else {
            stringBuilder.append(" -----> Perth");
            System.out.println("Now you are at Perth");
        }
        flags.put("forward", true);
        flags.put("backward", false);
    }
}