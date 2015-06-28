package me.wwsun.recursion;

/**
 * Created by Weiwei on 2015/3/27.
 */
public class ArraySum {

    /**
     * @param data is the target array you want to sum
     * @param n    is the array length in current recursion
     * @return the sum of data array
     */
    public static int linearSum(int[] data, int n) {
        if (n == 0) return 0;
        else return linearSum(data, n - 1) + data[n - 1];
    }

    /**
     *
     * @param data is the target array you want to sum
     * @param low is the beginning index in current recursion
     * @param high is the ending index in current recursion
     * @return the sum of data array
     */
    public static int binarySum(int[] data, int low, int high) {
        if (low > high) return 0;
        else if (low == high) return data[low];
        else {
            int mid = (low + high) / 2;
            return binarySum(data, low, mid) + binarySum(data, mid + 1, high);
        }
    }
}
