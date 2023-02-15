package InterfaceChallenge;

/**
 * @author Will Dufresne
 * @Date: 2023-02-14 21:28
 * @Description: The mappable interface in interface challenge
 */
public interface Mappable {
    String JSON_PROPERTY = """
            "properties":{%s}
            """;

    /**
     * Get Label
     * @return Label
     */
    String getLabel();

    /**
     * Get Geometry Type
     * @return Geometry type
     */
    String getGeometryType();

    /**
     * Get Icon Type
     * @return Icon type
     */
    String getIconType();

    /**
     * Convert String to Json
     */
    default void toJson() {
        System.out.println();
    }

    /**
     * Just a test
     * @param mappable param
     */
    private static void test(Mappable mappable) {
        System.out.println();
    }
}