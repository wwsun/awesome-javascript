package me.wwsun.queues;

/**
 * Created by Weiwei on 2015/3/28.
 */
public interface CircularQueue<E> extends Queue<E> {

    /**
     * Rotates the front element of the queue to the back of the queue
     * This does nothing if the queue is empty.
     */
    void rotate();
}
