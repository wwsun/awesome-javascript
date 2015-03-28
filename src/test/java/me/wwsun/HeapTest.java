package me.wwsun;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import me.wwsun.sorting.HeapSort;

/**
 * Unit test for simple App.
 */
public class HeapTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public HeapTest(String testName)
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( HeapTest.class );
    }

    public void testHeapSort() {
        int[] arr= {4,1,3,2,16,9,10,14,8,7};
        HeapSort.sort(arr);
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] +" -> ");
        }
        assertEquals(1, arr[0]);
        assertEquals(16, arr[arr.length - 1]);
    }
}
