package InterfaceTest.classes;

import InterfaceTest.interfaces.actions.moves.Fly;
import InterfaceTest.interfaces.actions.moves.Run;
import InterfaceTest.interfaces.actions.moves.Walk;

/**
 * @author Will Dufresne
 * @Date: 2023-02-07 20:09
 * @Description: The abstract bird class in interface test
 */
public abstract class Bird extends Animal implements Fly, Run, Walk {

}