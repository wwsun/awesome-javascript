package me.wwsun.priorityQueue;

import java.util.Comparator;

/**
 * Created by Weiwei on 2015/3/31.
 */
public class StringLengthComparator implements Comparator<String> {

    /**
     *
     * @param a
     * @param b
     * @return -1 if a < b; 1 if a > b; 0 if a==b
     */
    @Override
    public int compare(String a, String b) {
        if(a.length() < b.length()) return -1;
        else if(a.length() == b.length()) return 0;
        else return 1;
    }
}
