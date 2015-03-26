package me.wwsun.list;

/**
 * Created by Weiwei on 2015/3/26.
 */
public class CircularlyLinkedList<E> {

    private static class Node<E> {
        private E element;  //element stored at this node
        private Node<E> next; // subsequent node in the list

        public Node(E e, Node<E> node) {
            element = e;
            next = node;
        }

        public E getElement() { return element; }
        public Node<E> getNext() { return next; }

        public void setNext(Node<E> n) { next = n; }
    }

    private Node<E> tail = null; // we store tail but not head
    private int size = 0;
    public CircularlyLinkedList() {}

    // access method
    public int size() { return size; }
    public boolean isEmpty() { return size == 0; }
    public E first() {
        if(isEmpty()) return null;
        return tail.getNext().getElement(); // the head is after the tail
    }
    public E last() {
        if(isEmpty()) return null;
        return tail.getElement();
    }

    // update methods

    /**
     * rotate the first element to the back of the list
     */
    public void rotate() {
        if (tail!=null) tail.getElement();
    }

    /**
     *
     * @param e is element you want to add to the front of list
     */
    public void addFirst(E e) {
        if(size==0) {
            tail = new Node<>(e, null);
            tail.setNext(tail);
        } else {
            Node<E> newest = new Node<>(e, tail.getNext());
            tail.setNext(newest);
        }
        size++;
    }

    /**
     *
     * @param e is element you want to add to the end of the list
     */
    public void addLast(E e) {
        addFirst(e);
        tail = tail.getNext();
    }

    /**
     *
     * @return the original first element with remove this element
     */
    public E removeFirst() {
        if (isEmpty()) return null;
        Node<E> head = tail.getNext();

        if(head==tail) tail=null;
        else tail.setNext(head.getNext());

        size--;

        return head.getElement();
    }

}
