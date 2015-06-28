package me.wwsun.stacks;

import me.wwsun.list.SinglyLinkedList;

/**
 * Created by Weiwei on 2015/3/27.
 */
public class LinkedStack<E> implements Stack<E> {

    // using the adapter adapter
    private SinglyLinkedList<E> list = new SinglyLinkedList<>(); // an empty list
    public LinkedStack() {}

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void push(E e) {
        list.addFirst(e);
    }

    @Override
    public E top() {
        return list.first();
    }

    @Override
    public E pop() {
        return list.removeFirst();
    }
}
