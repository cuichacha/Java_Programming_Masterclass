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

    /**
     * Get Label
     *
     * @return Label
     */
    String getLabel();

    /**
     * Get Geometry Type
     *
     * @return Geometry type
     */
    Geometry getGeometryType();

    /**
     * Get Icon Type
     *
     * @return Icon type
     */
    String getIconType();

    /**
     * To Json
     *
     * @return Json String
     */
    default String toJson() {
        return """
                "type": "%s", "label": "%s", "marker": "%s" """.formatted(getGeometryType(), getLabel(), getIconType());
    }

    /**
     * Output method
     *
     * @param mappable param
     */
    static void mapIt(Mappable mappable) {
        System.out.printf(JSON_PROPERTY + "%n", mappable.toJson());
    }
}