package InterfaceTest.classes;

/**
 * @author Will Dufresne
 * @Date: 2023-02-08 09:20
 * @Description: The fragonfly class in interface test
 */
public class DragonFly extends Insect {

    @Override
    public String action() {
        return super.action() == null ? "No actions" : getClass().getSimpleName() + super.action();
    }
}