package TheArrayListChallenge;

import java.util.*;

/**
 * @author Will Dufresne
 * @Date: 2023-01-27 07:24
 * @Description: The arrayList challenge class in this section
 */
public class TheArrayListChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        boolean flag = true;
        while (flag) {
            System.out.println(
                    """
                            Available actions:
                            0 - to shutdown
                            1 - to add item(s) to list (comma delimited list)
                            2 - to remove any items (comma delimited list)
                            3 - to show current list
                            Enter a number for which action you want to do:
                            """
            );
            switch (Integer.parseInt(scanner.nextLine())) {
                case 0 -> {
                    flag = false;
                }
                case 1 -> {
                    String[] split = scanner.nextLine().split(",");
                    Set<String> set = new HashSet<>();
                    set.addAll(List.of(split));
                    set.addAll(list);
                    list = new ArrayList<>(set);
                }
                case 2 -> {
                    String[] split = scanner.nextLine().split(",");
                    list.removeAll(List.of(split));
                }
                case 3 -> {
                    list.sort(Comparator.naturalOrder());
                    System.out.println(list);
                }
            }
        }
    }
}