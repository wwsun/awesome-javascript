package me.wwsun.priorityQueue;

import java.util.Comparator;

/**
 * Created by Weiwei on 2015/3/31.
 */
public class DefaultComparator<E> implements Comparator<E> {
    @Override
    public int compare(E a, E b) {
        return ((Comparable<E>)a).compareTo(b);
    }
}
