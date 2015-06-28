package me.wwsun.priorityQueue;

import java.util.Comparator;

/**
 * Created by Weiwei on 2015/3/31.
 */
public abstract class AbstractPriorityQueue<K, V> implements PriorityQueue<K, V> {

    // neted PQEntry class
    protected static class PQEntry<K, V> implements Entry<K, V> {

        private K k;
        private V v;

        public PQEntry(K key, V value) {
            k = key;
            v = value;
        }

        @Override
        public K getKey() {
            return k;
        }

        @Override
        public V getValue() {
            return v;
        }

        protected void setKey(K key) {
            k = key;
        }

        protected void setValue(V value) {
            v = value;
        }
    }

    private Comparator<K> comp;
    protected AbstractPriorityQueue(Comparator<K> c) { comp = c;}
    protected AbstractPriorityQueue() { this(new DefaultComparator<K>());}

    protected int compare(Entry<K,V> a,Entry<K,V> b){return comp.compare(a.getKey(), b.getKey());}

    protected boolean checkKey(K key) {
        return comp.compare(key, key)==0; // see if key can be compared to itself

    }

    @Override
    public boolean isEmpty() {
        return size() ==0;
    }
}
