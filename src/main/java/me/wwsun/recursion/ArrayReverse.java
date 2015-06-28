package me.wwsun.recursion;

/**
 * Created by Weiwei on 2015/3/27.
 */
public class ArrayReverse {

    /**
     * @param data is the target array you want to reverse
     * @param low  is the beginning index of current reverse
     * @param high in the ending index of current reverse
     */
    public static void reverseArray(int[] data, int low, int high) {
        if (low < high) {
            int temp = data[low];
            data[low] = data[high];
            data[high] = temp;
            reverseArray(data, low + 1, high - 1);
        }
    }
}
