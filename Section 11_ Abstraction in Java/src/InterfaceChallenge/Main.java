package InterfaceChallenge;

import InterfaceChallenge.enums.UsageType;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Will Dufresne
 * @Date: 2023-02-16 19:33
 * @Description: The main class in interface challenge
 */
public class Main {
    public static void main(String[] args) {
        List<Mappable> mappables = new LinkedList<>();
        mappables.add(new Building("Sydney Town Hall", UsageType.GOVERNMENT));
        mappables.add(new Building("Sydney Opera House", UsageType.ENTERTAINMENT));
        mappables.add(new Building("Stadium Australia", UsageType.SPORT));

        for (Mappable mappable : mappables) {
            Mappable.mapIt(mappable);
        }
    }
}