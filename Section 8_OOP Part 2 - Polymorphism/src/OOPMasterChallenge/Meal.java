package OOPMasterChallenge;

import java.util.Arrays;

/**
 * @author Will Dufresne
 * @Date: 2023-01-23 14:16
 * @Description: The meal class in the oop master challenge
 */
public class Meal {
    private Burger[] burgers;
    private Drink[] drinks;
    private SideItem[] sideItems;

    public double getPrice() {
        double burgerPrice = Arrays.stream(burgers).mapToDouble(Burger::getPrice).sum() + Arrays.stream(burgers).mapToDouble(Burger::getToppingPrice).sum();
        double drinkPrice = Arrays.stream(drinks).mapToDouble(Drink::getPrice).sum();
        double sideItemPrice = Arrays.stream(sideItems).mapToDouble(SideItem::getPrice).sum();
        return burgerPrice + drinkPrice + sideItemPrice;
    }

    public Meal() {
        this(new Burger[]{new Burger(BurgerType.Chicken)},
                new Drink[]{new Drink(DrinkType.Coke, DrinkSize.Medium)},
                new SideItem[]{new SideItem(SideItemType.Fries)});
    }

    public Meal(Burger[] burgers) {
        this();
        this.burgers = burgers;
    }

    public Meal(Drink[] drinks) {
        this();
        this.drinks = drinks;
    }

    public Meal(SideItem[] sideItems) {
        this();
        this.sideItems = sideItems;
    }

    public Meal(Burger[] burgers, Drink[] drinks, SideItem[] sideItems) {
        this.burgers = burgers;
        this.drinks = drinks;
        this.sideItems = sideItems;
    }

    public Burger[] getBurgers() {
        return burgers;
    }

    public Drink[] getDrinks() {
        return drinks;
    }

    public SideItem[] getSideItems() {
        return sideItems;
    }

    public void printOrder() {
        if (getBurgers() != null && getBurgers().length >= 1) {
            for (Burger burger : getBurgers()) {
                burger.printOrder();
            }
        }
        if (getDrinks() != null && getDrinks().length >= 1) {
            for (Drink drink : getDrinks()) {
                drink.printOrder();
            }
        }
        if (getSideItems() != null && getSideItems().length >= 1) {
            for (SideItem sideItem : getSideItems()) {
                sideItem.printOrder();
            }
        }
        System.out.println("-".repeat(30));
        System.out.printf("%20s: %2.2f%n", "TOTAL", getPrice());
    }
}