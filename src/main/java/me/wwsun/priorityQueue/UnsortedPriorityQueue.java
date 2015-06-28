package me.wwsun.priorityQueue;

/**
 * Created by Weiwei on 2015/3/31.
 */
public class UnsortedPriorityQueue<K,V> extends AbstractPriorityQueue<K,V> {

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Entry<K, V> insert(K key, V value) throws IllegalArgumentException {
        return null;
    }

    @Override
    public Entry<K, V> min() {
        return null;
    }

    @Override
    public Entry<K, V> removeMin() {
        return null;
    }
}
