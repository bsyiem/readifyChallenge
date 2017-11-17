package restApp.Logic;

/**
 * Created by brandon on 17/11/17.
 */
public class Fibonacci {

    /*
    returns the fibonacci number at position n
    @param n represents the position of the fibonacci number
     */
    public static long getFibonacciNumberAt(long n) throws ArithmeticException
    {
        long a = 0;
        long b = 1;

        if(n < 0){
            return generateFibonacciNegative(a,b,n);
        }
        return generateFibonacciPositive(a,b,n);
    }

    /*
    helper function for getFibonacciNumberAt
     */
    private static long generateFibonacciPositive(long a, long b, long n) throws ArithmeticException{
        if(n == 0){
            return a;
        }

        return generateFibonacciPositive(b, Math.addExact(a,b), n-1);
    }

    private static long generateFibonacciNegative(long a, long b, long n) throws ArithmeticException{

        if(n == 0){
            return a;
        }
        return generateFibonacciNegative(b, Math.subtractExact(a,b), n+1);
    }
}
