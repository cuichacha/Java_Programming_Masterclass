package InterfaceChallenge;

import InterfaceChallenge.enums.Geometry;

/**
 * @author Will Dufresne
 * @Date: 2023-02-14 21:28
 * @Description: The mappable interface in interface challenge
 */
public interface Mappable {

    String JSON_PROPERTY = """
            "properties": {%s}
            """;

    String getLabel();

    Geometry getGeometryType();

    String getIconType();

    default String toJson() {
        return """
                "type": "%s", "label": "%s", "marker": "%s" """.formatted(getGeometryType(), getLabel(), getIconType());
    }

    static void mapIt(Mappable mappable) {
        System.out.printf(JSON_PROPERTY + "%n", mappable.toJson());
    }
}