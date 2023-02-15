package InterfaceTest.interfaces.actions.moves;

/**
 * @author Will Dufresne
 * @Date: 2023-02-10 08:35
 * @Description: The swim interface in interface test
 */
public interface Swim extends Move {

    /**
     * The action method in Swim calls swim() by default
     * @return Swim action
     */
    @Override
    default String action() {
        return swim();
    }

    /**
     * The swim method in Swim
     * @return " is swimming"
     */
    default String swim() {
        return " is swimming";
    }
}