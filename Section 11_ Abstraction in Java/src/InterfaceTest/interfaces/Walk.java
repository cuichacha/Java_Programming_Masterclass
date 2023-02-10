package InterfaceTest.interfaces;

/**
 * @author Will Dufresne
 * @Date: 2023-02-10 08:53
 * @Description: The walk interface in interface test
 */
public interface Walk extends Move {

    default void walk() {
        System.out.println(getClass().getSimpleName() + " is walking");
    }
}