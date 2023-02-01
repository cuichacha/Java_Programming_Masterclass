package OOPMasterChallenge;

/**
 * @author Will Dufresne
 * @Date: 2023-01-23 16:09
 * @Description: The side item class in the oop master challenge
 */
public class SideItem extends Food {

    public SideItem(SideItemType sideItemType) {
        super(sideItemType.name(), sideItemType, sideItemType.getPrice());
    }

    @Override
    protected void printOrder() {
        System.out.printf("%20s: %2.2f%n", getName().toUpperCase(), getPrice());
    }
}