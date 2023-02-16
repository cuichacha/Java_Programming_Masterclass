package InterfaceChallenge;

import InterfaceChallenge.enums.Color;
import InterfaceChallenge.enums.Geometry;
import InterfaceChallenge.enums.PointMarker;
import InterfaceChallenge.enums.UsageType;

/**
 * @author Will Dufresne
 * @Date: 2023-02-15 19:36
 * @Description: The building class in interface challenge
 */
public record Building(String name, UsageType usageType) implements Mappable {

    @Override
    public String getLabel() {
        return name + " (" + usageType + ")";
    }

    @Override
    public Geometry getGeometryType() {
        return Geometry.POINT;
    }

    @Override
    public String getIconType() {
        return switch (usageType) {
            case ENTERTAINMENT -> Color.GREEN + " " + PointMarker.TRIANGLE;
            case GOVERNMENT -> Color.RED + " " + PointMarker.STAR;
            case RESIDENTIAL -> Color.BLUE + " " + PointMarker.SQUARE;
            case SPORT -> Color.ORANGE + " " + PointMarker.PUSH_PIN;
            default -> Color.BLACK + " " + PointMarker.CIRCLE;
        };
    }

    @Override
    public String toJson() {
        return Mappable.super.toJson() + """
                , "name": "%s", "usage": "%s" """.formatted(name, usageType);
    }
}