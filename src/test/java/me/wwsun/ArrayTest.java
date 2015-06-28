package me.wwsun;

import junit.framework.TestCase;
import me.wwsun.array.GameEntry;
import me.wwsun.array.InsertionSort;
import me.wwsun.array.ScoreBoard;

import java.util.Arrays;
import java.util.Random;

public class ArrayTest extends TestCase {
    public void testArrays() {
        ScoreBoard sb = new ScoreBoard(5); // init a score board with 5 positions

        GameEntry p1 = new GameEntry("Weiwei", 20);
        GameEntry p2 = new GameEntry("Lili", 10);
        GameEntry p3 = new GameEntry("Lulu", 30);
        sb.add(p1);
        sb.add(p2);
        sb.add(p3);

        System.out.println(sb);

        sb.remove(1);
        System.out.println(sb);
    }

    public void testInsertionSort() {
        char[] a = {'C', 'E', 'B', 'D', 'A', 'I', 'J', 'L', 'K', 'H', 'G', 'F'};
        System.out.println(java.util.Arrays.toString(a));

        InsertionSort.insertionSort(a);
        System.out.println(java.util.Arrays.toString(a));
    }

    public void testRandomNumberGenerator() {
        int data[] = new int[10];

        Random rand = new Random();
        rand.setSeed(System.currentTimeMillis()); // use current time as a seed

        // fill the data array with presudo-random numbers from 0 to 99
        for (int i = 0; i < data.length; i++) {
            data[i] = rand.nextInt(100);
        }

        int[] origin = Arrays.copyOf(data, data.length); //make a copy of data array
        System.out.println("Arrays equal before sort:\t" + Arrays.equals(data, origin));
        Arrays.sort(data);
        System.out.println("Arrays equal after sort:\t" + Arrays.equals(data, origin));
        System.out.println("Origin:\t" + Arrays.toString(origin));
        System.out.println("Data:\t" + Arrays.toString(data));

    }
}
