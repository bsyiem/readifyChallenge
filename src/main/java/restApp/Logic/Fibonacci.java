package restApp.Logic;

/**
 * Created by brandon on 17/11/17.
 */
public class Fibonacci {

    /*
    returns the fibonacci number at position n
    @param n represents the position of the fibonacci number
     */
    public static Integer getFibonacciNumberAt(Integer n) throws ArithmeticException
    {
        Integer a = 0;
        Integer b = 1;

        if(n < 0){
            return generateFibonacciNegative(-a,-b,n);
        }
        return generateFibonacciPositive(a,b,n);
    }

    /*
    helper function for getFibonacciNumberAt
     */
    private static Integer generateFibonacciPositive(int a, int b, int n) throws ArithmeticException{

        if(n == 0){
            return a;
        }
        return generateFibonacciPositive(b, a+b, n-1);
    }

    private static Integer generateFibonacciNegative(int a, int b, int n) throws ArithmeticException{

        if(n == 0){
            return a;
        }
        return generateFibonacciNegative(b, a+b, n+1);
    }
}
