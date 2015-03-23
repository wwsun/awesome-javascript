package me.wwsun;

import junit.framework.TestCase;

/**
 * Created by Weiwei on 2015/3/19.
 */
public class FibonacciTest extends TestCase {

    int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n-1) + fib(n-2);
    }

    public void testFibonacci() {

        int cases[][] = {{0,0}, {1,1}, {2,1}, {3,2}};

        for (int i=0; i< cases.length; i++)
            assertEquals(cases[i][1], fib(cases[i][0]));
    }
}
