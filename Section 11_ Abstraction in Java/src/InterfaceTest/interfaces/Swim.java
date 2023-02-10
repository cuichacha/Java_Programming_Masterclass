package InterfaceTest.interfaces;

/**
 * @author Will Dufresne
 * @Date: 2023-02-10 08:35
 * @Description: The swim interface in interface test
 */
public interface Swim extends Move{

    @Override
    default String action() {
        return swim();
    }

    private String swim() {
        return " is swimming";
    }
}