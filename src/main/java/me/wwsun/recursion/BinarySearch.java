package me.wwsun.recursion;

/**
 * Created by Weiwei on 2015/3/26.
 */
public class BinarySearch {

    /**
     * @param data   is the target array with numbers
     * @param target is the number you want to search
     * @param low    is the beginning index of current search range
     * @param high   is the ending index of current search range
     * @return true if the target value if found in the indicated portion of the data array
     */
    public static boolean binarySearch(int[] data, int target, int low, int high) {
        if (low < high) return false;
        else {
            int mid = (low + high) / 2;
            if (target == data[mid]) return true;
            else if (target < data[mid]) return binarySearch(data, target, low, mid - 1);
            else return binarySearch(data, target, mid + 1, high);
        }
    }

    public static boolean binarySearch(int[] data, int target) {
        return binarySearch(data, target, 0, data.length-1);
    }
}
