package restApp.Logic;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by brandon on 17/11/17.
 */
public class TriangleCheckTest {
    @Test
    public void checkTriangle() throws Exception {
        int a1 = 4;
        int b1 = 2;
        int c1 = 3;

        int a2 = 2;
        int b2 = 2;
        int c2 = 3;

        int a3 = 2;
        int b3 = 2;
        int c3 = 2;

        int a4 = 2;
        int b4 = 2;
        int c4 = 5;

        assertEquals(TriangleCheck.checkTriangle(a1,b1,c1),"Scalene");
        assertEquals(TriangleCheck.checkTriangle(a2,b2,c2),"Isosceles");
        assertEquals(TriangleCheck.checkTriangle(a3,b3,c3),"Equilateral");
        assertEquals(TriangleCheck.checkTriangle(a4,b4,c4),"Error");
    }

}