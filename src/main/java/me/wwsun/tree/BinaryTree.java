package me.wwsun.tree;

/**
 * Created by Weiwei on 2015/3/28.
 */
public interface BinaryTree<E> extends Tree<E> {

    /**
     *
     * @param p
     * @return the Position of p's left child (or null if no child exists)
     * @throws IllegalArgumentException
     */
    Position<E> left(Position<E> p) throws IllegalArgumentException;

    /**
     *
     * @param p
     * @return the Position of p's right child (or null if no child exists)
     * @throws IllegalArgumentException
     */
    Position<E> right(Position<E> p) throws IllegalArgumentException;

    /**
     *
     * @param p
     * @return the Position of p's sibling (or null if no child exists)
     * @throws IllegalArgumentException
     */
    Position<E> sibling(Position<E> p) throws IllegalArgumentException;
}
