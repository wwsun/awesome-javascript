package me.wwsun.recursion;

/**
 * Created by Weiwei on 2015/3/27.
 */
public class Fibonacci {

    public static long fibonacciBad(int n) {
        if (n <= 1) return n;
        else return fibonacciBad(n - 1) + fibonacciBad(n - 2);
    }

    public static long[] fibonacciGood(int n) {
        if (n <= 1) {
            long[] answer = {n, 0};
            return answer;
        } else {
            long[] temp = fibonacciGood(n - 1);
            long[] answer = {temp[0] + temp[1], temp[0]};
            return answer;
        }

    }
}
