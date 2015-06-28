package me.wwsun;

import junit.framework.TestCase;
import me.wwsun.recursion.ArrayReverse;
import me.wwsun.recursion.ArraySum;
import me.wwsun.recursion.DiskSpace;
import me.wwsun.recursion.Factorial;

import java.io.File;
import java.util.Arrays;

/**
 * Created by Weiwei on 2015/3/26.
 */
public class RecursionTest extends TestCase {

    public void testFactorial() {
        int n = 4;
        System.out.println("Factorial("+n+")= " + Factorial.factorial(n));
        assertEquals(1, Factorial.factorial(0));
        assertEquals(2, Factorial.factorial(2));
    }

    public void testDiskUsage() {
        String path = "d:\\Movie";
        DiskSpace.diskUsage(new File(path));
    }

    public void testArraySum() {
        int data[] = {1, 4, 5, 20, 23};
        int sum = ArraySum.linearSum(data, data.length);
        int sum2 = ArraySum.binarySum(data, 0, data.length-1);
        System.out.println(sum);
        System.out.println(sum2);
    }

    public void testArrayReverse() {
        int data[] = {1, 4, 5, 20, 23};
        ArrayReverse.reverseArray(data, 0, data.length-1);

        System.out.println(Arrays.toString(data));
    }
}
