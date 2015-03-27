package me.wwsun.stacks;

/**
 * Created by Weiwei on 2015/3/27.
 */
public interface Stack<E> {

    /**
     *
     * @return number of elements in the stack
     */
    int size();

    /**
     *
     * @return true if the stack is empty, false otherwise
     */
    boolean isEmpty();

    /**
     *
     * @param e the element to be inserted
     */
    void push(E e);

    /**
     *
     * @return top element in the stack (or null if empty)
     */
    E top();

    /**
     *
     * @return element removed (or null if empty)
     */
    E pop();
}
