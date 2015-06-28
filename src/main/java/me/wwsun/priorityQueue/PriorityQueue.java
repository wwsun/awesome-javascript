package me.wwsun.priorityQueue;

/**
 * Created by Weiwei on 2015/3/31.
 */
public interface PriorityQueue<K, V> {
    int size();
    boolean isEmpty();
    Entry<K, V> insert(K key, V value) throws IllegalArgumentException;
    Entry<K, V> min();
    Entry<K, V> removeMin();
}
