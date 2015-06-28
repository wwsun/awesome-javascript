package me.wwsun.queues;

/**
 * Created by Weiwei on 2015/3/27.
 */
public class ArrayQueue<E> implements Queue<E> {

    // instance variables
    public static final int CAPACITY = 1000; //default array capacity
    private E[] data; // generic array used for storage
    private int f = 0; // index of the front element
    private int sz = 0; // current number of elements

    public ArrayQueue() {
        this(CAPACITY);
    }

    public ArrayQueue(int capacity) {
        data = (E[]) new Object[capacity];
    }

    @Override
    public int size() {
        return sz;
    }

    @Override
    public boolean isEmpty() {
        return sz == 0;
    }

    /**
     * Insert and element at the rear of the queue
     *
     * @param e is the element you want to add to the tail of the queue
     */
    public void enqueue(E e) {
        if (sz == data.length) throw new IllegalStateException("Queue is full!");
        int avail = (f + sz) % data.length; // use modular arithmetic
        data[avail] = e;
        sz++;
    }

    @Override
    public E first() {
        if (isEmpty()) return null;
        return data[f];
    }

    @Override
    public E dequeue() {
        if (isEmpty()) return null;
        E answer = data[f];
        data[f] = null; //deference to help garbage collection
        f = (f+1) % data.length;
        sz--;
        return answer;
    }
}
