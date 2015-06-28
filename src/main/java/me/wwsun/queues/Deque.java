package me.wwsun.queues;

/**
 * Created by Weiwei on 2015/3/28.
 */
public interface Deque<E> {

    int size();

    boolean isEmpty();

    E first();

    E last();

    void addFirst(E e);

    void addLast(E e);

    E removeFirst();

    E removeLast();
}
