package me.wwsun.list;

/**
 * Created by Weiwei on 2015/3/24.
 */
public class SinglyLinkedList<E> {

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

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public SinglyLinkedList() {}

    public int size() { return size; }

    public boolean isEmpty() { return size==0; }

    public E first() {
        if(isEmpty()) return null;
        return head.getElement();
    }

    public E last() {
        if(isEmpty()) return null;
        return tail.getElement();
    }

    /**
     *
     * @param e is the element you want to add to the front of the list
     */
    public void addFirst(E e) {
        head = new Node<>(e, head);
        if (size ==0) tail = head;
        size ++;
    }

    /**
     *
     * @param e is the element you want to add to the end of the list
     */
    public void addLast(E e) {
        Node<E> newest = new Node<>(e, null);

        if(isEmpty()) head = newest;
        else tail.setNext(newest);

        tail = newest;
        size++;
    }

    /**
     *
     * @return the list without the original header element
     */
    public E removeFirst() {
        if (isEmpty()) return null;
        E answer = head.getElement();
        head = head.getNext();
        size--;
        if(size==0) tail=null;
        return answer;
    }
}
