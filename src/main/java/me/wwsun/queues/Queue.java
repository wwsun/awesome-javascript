package me.wwsun.queues;

/**
 * Created by Weiwei on 2015/3/27.
 */
public interface Queue<E> {

    /**
     * return the number of elements in the queue
     */
    int size();

    /**
     *
     * @return true if the queue is empty
     */
    boolean isEmpty();

    /**
     *
     * @param e is the element you want to add to the tail of the queue
     */
    void enqueue(E e);

    /**
     *
     * @return the first element of the queue
     */
    E first();

    /**
     *
     * @return the first element of the queue with remove this element from the queue
     */
    E dequeue();
}
