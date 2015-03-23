package me.wwsun.tree;

/**
 * Created by Weiwei on 2015/3/23.
 */
public class Node {
    public Node left;
    public Node right;
    public int data;

    public Node(int newData) {
        left = null;
        right = null;
        data = newData;
    }
}
