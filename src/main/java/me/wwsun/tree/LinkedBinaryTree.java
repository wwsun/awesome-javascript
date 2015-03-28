package me.wwsun.tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Weiwei on 2015/3/28.
 */
public class LinkedBinaryTree<E> extends AbstractBinaryTree<E> {

    // nested Node class
    protected static class Node<E> implements Position<E> {

        private E element;
        private Node<E> parent;
        private Node<E> left;
        private Node<E> right;

        public Node(E e, Node<E> above, Node<E> leftChild, Node<E> rightChild) {
            element = e;
            parent = above;
            left = leftChild;
            right = rightChild;
        }

        @Override
        public E getElement() throws IllegalStateException {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getParent() {
            return parent;
        }

        public void setParent(Node<E> parent) {
            this.parent = parent;
        }

        public Node<E> getLeft() {
            return left;
        }

        public void setLeft(Node<E> left) {
            this.left = left;
        }

        public Node<E> getRight() {
            return right;
        }

        public void setRight(Node<E> right) {
            this.right = right;
        }
    }


    private class ElementIterator implements Iterator<E> {

        Iterator<Position<E>> posIterator = positions().iterator();

        @Override
        public boolean hasNext() {
            return posIterator.hasNext();
        }

        @Override
        public E next() {
            return posIterator.next().getElement();
        }

        @Override
        public void remove() {
            posIterator.remove();
        }
    }

    // Factory function to create new node storing element e
    protected Node<E> createNode(E e, Node<E> parent, Node<E> left, Node<E> right) {
        return new Node<E>(e, parent, left, right);
    }

    // instance variables
    protected Node<E> root = null;
    private int size = 0;

    protected Node<E> validate(Position<E> p) throws IllegalArgumentException {
        if(!(p instanceof Node)) throw new IllegalArgumentException("Not valid position type");
        Node<E> node = (Node<E>) p;
        if(node.getParent() == node) throw new IllegalArgumentException("p is no longer in the tree");
        return node;
    }


    public Position<E> addRoot(E e) throws IllegalStateException {
        if(!isEmpty()) throw new IllegalStateException("Tree is not empty");
        root = createNode(e, null, null, null);
        size = 1;
        return root;
    }

    public Position<E> addLeft(Position<E> p, E e) throws IllegalArgumentException {
        Node<E> parent = validate(p);
        if(parent.getParent()!=null)
            throw new IllegalArgumentException("p already has a left child");
        Node<E> child = createNode(e, parent, null, null);
        parent.setLeft(child);
        size++;
        return child;
    }

    public Position<E> addRight(Position<E> p, E e) throws IllegalArgumentException {
        Node<E> parent = validate(p);
        if(parent.getParent() != null)
            throw new IllegalArgumentException("p already has a right child");
        Node<E> child = createNode(e, parent, null, null);
        parent.setRight(child);
        size++;
        return child;
    }

    /**
     * Replaces the element at Position p with e and returns the replaced element
     * @param p
     * @param e
     * @return
     * @throws IllegalArgumentException
     */
    public E set(Position<E> p, E e) throws IllegalArgumentException {
        Node<E> node = validate(p);
        E temp = node.getElement();
        node.setElement(e);
        return temp;
    }

    /**
     * Attach tree t1 and t2 as left and right subtrees of external p.
     * @param p
     * @param t1
     * @param t2
     * @throws IllegalArgumentException
     */
    public void attach(Position<E> p, LinkedBinaryTree<E> t1, LinkedBinaryTree<E> t2) throws IllegalArgumentException {
        Node<E> node = validate(p);
        if (isInternal(p)) throw new IllegalArgumentException("p must be a leaf");
        size += t1.size + t2.size();
        if(!t1.isEmpty()) {
            t1.root.setParent(node);
            node.setLeft(t1.root);
            t1.root = null;
            t1.size = 0;
        }
        if(!t2.isEmpty()) {
            t2.root.setParent(node);
            node.setRight(t2.root);
            t2.root = null;
            t2.size = 0;
        }
    }

    /**
     * remove the node at Position p and replaces it with its child, if any
     * @param p
     * @return
     * @throws IllegalArgumentException
     */
    public E remove(Position<E> p) throws IllegalArgumentException {
        Node<E> node = validate(p);
        if(numChildren(p) == 2)
            throw new IllegalArgumentException("p has two children");
        Node<E> child = (node.getLeft() !=null ? node.getLeft() : node.getRight());
        if(child !=null ) child.setParent(node.getParent());
        if(node==root) root = child;
        else {
            Node<E> parent = node.getParent();
            if(node==parent.getLeft())
                parent.setLeft(child);
            else
                parent.setRight(child);
        }
        size--;
        E temp = node.getElement();
        node.setElement(null);
        node.setLeft(null);
        node.setRight(null);
        node.setParent(node);
        return temp;
    }


    @Override
    public Position<E> left(Position<E> p) throws IllegalArgumentException {
        Node<E> node = validate(p);
        return node.getLeft();
    }

    @Override
    public Position<E> right(Position<E> p) throws IllegalArgumentException {
        Node<E> node = validate(p);
        return node.getRight();
    }

    @Override
    public Position<E> root() {
        return root;
    }

    @Override
    public Position<E> parent(Position<E> p) throws IllegalArgumentException {
        Node<E> node = validate(p);
        return node.getParent();
    }

    @Override
    public int size() {
        return size;
    }

    /**
     *
     * @return an iterator of the elements stored in the tree
     */
    @Override
    public Iterator<E> iterator() {
        return new ElementIterator();
    }

    @Override
    public Iterable<Position<E>> positions() {
        return preorder();
    }

    private Iterable<Position<E>> preorder() {
        List<Position<E>> snapshot = new ArrayList<>();
        if(!isEmpty())
            preorderSubtree(root(), snapshot);
        return snapshot;
    }

    /**
     * Adds positions of the subtree rooted at Position p to the given snapshot
     * @param p
     * @param snapshot
     */
    private void preorderSubtree(Position<E> p, List<Position<E>> snapshot) {
        snapshot.add(p);
        for (Position<E> c: children(p))
            preorderSubtree(c, snapshot);
    }
}
