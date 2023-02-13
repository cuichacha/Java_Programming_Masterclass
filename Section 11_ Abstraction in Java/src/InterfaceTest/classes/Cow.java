package InterfaceTest.classes;

/**
 * @author Will Dufresne
 * @Date: 2023-02-10 20:11
 * @Description: The cow class in interface test
 */
public class Cow extends Mammal {

    @Override
    public String action() {
        return super.action() == null ? "No actions" : getClass().getSimpleName() + super.action();
    }

}