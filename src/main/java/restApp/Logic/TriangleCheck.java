package restApp.Logic;

/**
 * Created by brandon on 17/11/17.
 */
public class TriangleCheck {

    public static String checkTriangle(int a, int b, int c) {
        if (((a + b) < c) || ((a + c) < b) || ((b + c) < a)) {
            return "error";
        }
        if ((a == b) && (b == c)) {
            return "equilateral";
        }
        if ((a == b) || (b == c) || (a == c)) {
            return "isosceles";
        }
        return "scalene";
    }
}
