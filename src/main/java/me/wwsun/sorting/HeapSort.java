package me.wwsun.sorting;

/**
 * Created by Weiwei on 2015/3/12.
 */
public class HeapSort {
    private static int[] arr;
    private static int n;
    private static int left;
    private static int right;
    private static int larget;

    public static void buildHeap(int[] arr) {
        n = arr.length - 1;
        for(int i=n/2; i>=0; i--) {
            maxHeap(arr, i);
        }
    }

    private static void maxHeap(int[] arr, int i) {
        left = 2*i;
        right = 2*i + 1;

        if(left <= n && arr[left] > arr[i]) {
            larget = left;
        } else {
            larget = i;
        }

        if(right <= n && arr[right] > arr[larget]) {
            larget = right;
        }

        if(larget != i) {
            exchange(i, larget);
            maxHeap(arr, larget);
        }
    }

    public static void sort(int[] array) {
        arr = array;
        buildHeap(arr);

        for(int i=n; i>0; i--) {
            exchange(0, i);
            n--;
            maxHeap(arr, 0);
        }
    }

    private static void exchange(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
