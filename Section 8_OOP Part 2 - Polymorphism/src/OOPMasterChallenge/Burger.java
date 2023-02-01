package OOPMasterChallenge;

import java.util.Arrays;

/**
 * @author Will Dufresne
 * @Date: 2023-01-23 16:08
 * @Description: The burger class in the oop master challenge
 */
public class Burger extends Food {
    private BurgerTopping[] burgerToppings;

    public Burger() {
        super(BurgerType.Chicken.name(), BurgerType.Chicken, BurgerType.Chicken.getPrice());
    }

    public Burger(BurgerTopping[] burgerToppings) {
        this();
        this.burgerToppings = burgerToppings;
    }

    public Burger(BurgerType burgerType) {
        super(burgerType.name(), burgerType, burgerType.getPrice());
    }

    public Burger(BurgerType burgerType, BurgerTopping[] burgerToppings) {
        super(burgerType.name(), burgerType, burgerType.getPrice() + Arrays.stream(burgerToppings).mapToDouble(BurgerTopping::getPrice).sum());
        this.burgerToppings = burgerToppings;
    }

    @Override
    public String getName() {
        return BurgerType.getType(getType());
    }

    public BurgerTopping[] getBurgerToppings() {
        return burgerToppings;
    }

    public double getToppingPrice() {
        return getBurgerToppings() == null || getBurgerToppings().length == 0 ? 0 : Arrays.stream(burgerToppings).mapToDouble(BurgerTopping::getPrice).sum();
    }

    @Override
    public void printOrder() {
        System.out.printf("%20s: %2.2f%n", getName().toUpperCase(), getPrice());
        if (getBurgerToppings() != null && getBurgerToppings().length >= 1) {
            for (BurgerTopping burgerTopping : getBurgerToppings()) {
                System.out.printf("%20s: %2.2f%n", burgerTopping.name().toUpperCase(), burgerTopping.getPrice());
            }
        }
    }
}