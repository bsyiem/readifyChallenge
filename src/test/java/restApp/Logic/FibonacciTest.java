package restApp.Logic;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by brandon on 17/11/17.
 */
public class FibonacciTest {

    @Test
    public void getFibonacciNumberAtTest(){
        int n1 = 4;
        int n2 = 38;
        int n3 = -37;

        assertEquals(Fibonacci.getFibonacciNumberAt(n1),3);
        assertEquals(Fibonacci.getFibonacciNumberAt(n2),39088169);
        assertEquals(Fibonacci.getFibonacciNumberAt(n3),24157817);
    }

}