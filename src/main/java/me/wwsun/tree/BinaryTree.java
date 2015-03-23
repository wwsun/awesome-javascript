package me.wwsun.tree;

/**
 * Created by Weiwei on 2015/3/23.
 */
public class BinaryTree {

    // Root node pointer. Will be null for an empty tree.
    private Node root;

    /**
     * Create an empty binary tree -- a null root pointer.
     */
    public BinaryTree() {
        root = null;
    }

    /**
     *
     * @param data
     * @return true if the given target is in the binary tree.
     */
    public boolean lookup(int data) {
        return lookup(root, data);
    }

    /**
     * Recursive lookup
     * @param node
     * @param data
     * @return
     */
    private boolean lookup(Node node, int data) {
        if (node==null) return false;
        if (data == node.data) return true;
        else if(data < node.data) return lookup(node.left, data);
        else return lookup(node.right, data);
    }

    /**
     * Inserts the given data into the binary tree.
     * Use a recursive helper.
     * @param data
     */
    public void insert(int data) {
        root = insert(root, data);
    }

    private Node insert(Node node, int data) {
        if (node==null) node = new Node(data);
        else {
            if (data <= node.data) {
                node.left = insert(node.left, data);
            } {
                node.right = insert(node.right, data);
            }
        }
        return node;
    }

    /**
     *
     * @return the number of nodes in the tree.
     */
    public int size(){
        return size(root);
    }

    private int size(Node node) {
        if (node == null) return 0;
        else return size(node.left) + 1 + size(node.right);
    }

    public void printTree() {
        printTree(root);
        System.out.println();
    }

    private void printTree(Node node) {
        if (node==null) return;
        printTree(node.left);
        System.out.println(node.data + " ");
        printTree(node.right);
    }
}
