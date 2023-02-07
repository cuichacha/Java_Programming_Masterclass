package AbstractClassTest;

/**
 * @author Will Dufresne
 * @Date: 2023-02-06 20:17
 * @Description: The cat class in abstract class test
 */
public class Cat extends Animal{

    @Override
    protected void move() {
        System.out.println("Cat moving");
    }
}