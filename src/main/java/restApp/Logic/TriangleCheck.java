package restApp.Logic;

/**
 * Created by brandon on 17/11/17.
 */
public class TriangleCheck {

    private static final String ERROR = "\"Error\"";
    private static final String EQUILATERAL = "\"Equilateral\"";
    private static final String ISOSCELES = "\"Isosceles\"";
    private static final String SCALENE = "\"Scalene\"";

    public static String checkTriangle(int a, int b, int c) {
        if (((a + b) <= c) || ((a + c) <= b) || ((b + c) <= a)) {
            return ERROR;
        }
        if ((a == b) && (b == c)) {
            return EQUILATERAL;
        }
        if ((a == b) || (b == c) || (a == c)) {
            return ISOSCELES;
        }
        return SCALENE;
    }
}
