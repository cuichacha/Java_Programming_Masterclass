package InterfaceTest.classes;

import InterfaceTest.interfaces.actions.moves.Move;
import InterfaceTest.interfaces.states.Breathe;
import InterfaceTest.interfaces.states.Sleep;

/**
 * @author Will Dufresne
 * @Date: 2023-02-07 20:08
 * @Description: The abstract animal class in interface test
 */
public abstract class Animal extends Animalia implements Move, Sleep, Breathe {

}