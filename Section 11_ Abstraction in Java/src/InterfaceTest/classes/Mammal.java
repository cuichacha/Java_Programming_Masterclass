package InterfaceTest.classes;

import InterfaceTest.interfaces.actions.moves.Run;
import InterfaceTest.interfaces.actions.moves.Walk;

/**
 * @author Will Dufresne
 * @Date: 2023-02-10 08:37
 * @Description: The mammal class in interface test
 */
public abstract class Mammal extends Animal implements Run, Walk {

    @Override
    public String action() {
        return super.action();
    }

}