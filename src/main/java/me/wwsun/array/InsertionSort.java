package me.wwsun.array;

/**
 * Created by Weiwei on 2015/3/24.
 */
public class InsertionSort {

    /**
     * @param data is the character array
     */
    public static void insertionSort(char[] data) {
        int n = data.length;

        for (int k = 1; k < n; k++) { //begin with the second character
            char cur = data[k];
            int j = k; // find correct index j for cur
            while (j > 0 && data[j - 1] > cur) {
                data[j] = data[j-1]; // slide data[j-1] rightward
                j--;
            }
            data[j] = cur; // this is the proper place for cur
        }
    }
}
