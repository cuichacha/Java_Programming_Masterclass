package GenericsChallenge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Will Dufresne
 * @Date: 2023-02-22 08:13
 * @Description: The main class in generics challenge
 */
public class Main {
    public static void main(String[] args) {
        List<League<BasketballTeam>> basketballLeagues = new ArrayList<>();
        List<League<BasetballTeam>> baseballLeagues = new ArrayList<>();

        League<BasketballTeam> basketballTeamLeague1 = new League<>();
        basketballLeagues.add(basketballTeamLeague1);
        // baseballLeagues.add(basketballTeamLeague1);
    }
}