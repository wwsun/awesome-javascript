package me.wwsun.recursion;

/**
 * Created by Weiwei on 2015/3/26.
 */
public class Factorial {

    /**
     * @param n
     * @return the factorial of parameter n
     */
    public static int factorial(int n) {
        if (n < 0) throw new IllegalArgumentException(); // arguments must be nonnegative
        else if (n == 0) return 1;
        else return n * factorial(n - 1);
    }
}
