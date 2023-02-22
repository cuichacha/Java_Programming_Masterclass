package GenericsChallenge;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Will Dufresne
 * @Date: 2023-02-22 15:21
 * @Description: The league class in generics challenge
 */
public class League<T extends Team> {
    private String name;
    private List<T> teams = new LinkedList<>();
}