import OOPMasterChallenge.*;

/**
 * @author Will Dufresne
 * @Date: 2023-01-18 07:46
 * @Description: The main class for all challenges in this section
 */
public class ChallengeMain {
    public static void main(String[] args) {
        Meal meal1 = new Meal();
        meal1.printOrder();
        System.out.println();

        Meal meal2 = new Meal(new Burger[]{new Burger(new BurgerTopping[]{BurgerTopping.Extra_Cheese, BurgerTopping.Extra_Pickles})});
        meal2.printOrder();
        System.out.println();

        Meal meal3 = new Meal(
                new Burger[]{new Burger(BurgerType.Double_Fish), new Burger(BurgerType.Beef,
                        new BurgerTopping[]{BurgerTopping.Extra_Pickles, BurgerTopping.Extra_Tomatoes})},
                new Drink[]{new Drink(DrinkType.Coke, DrinkSize.Large)},
                new SideItem[]{new SideItem(SideItemType.Nuggets)}
        );
        meal3.printOrder();
    }
}