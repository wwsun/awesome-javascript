package me.wwsun.tree;

/**
 * Created by Weiwei on 2015/3/28.
 */
public interface Position<E> {

    /**
     * Return the element stored at this position
     * @return the stored element
     * @throws IllegalStateException if position no longer valid
     */
    E getElement() throws IllegalStateException;
}
