package restApp.Logic;

/**
 * Created by brandon on 17/11/17.
 */
public class Fibonacci {

    /*
    returns the fibonacci number at position n
    @param n represents the position of the fibonacci number
     */
    public static int getFibonacciNumberAt(int n)
    {
        int a = 0;
        int b = 1;

        if(n < 0){
            return generateFibonacciNegative(-a,-b,n);
        }
        return generateFibonacciPositive(a,b,n);
    }

    /*
    helper function for getFibonacciNumberAt
     */
    private static int generateFibonacciPositive(int a, int b, int n){

        if(n == 0){
            return a;
        }
        return generateFibonacciPositive(b, a+b, n-1);
    }

    private static int generateFibonacciNegative(int a, int b, int n){

        if(n == 0){
            return a;
        }
        return generateFibonacciNegative(b, a+b, n+1);
    }
}
