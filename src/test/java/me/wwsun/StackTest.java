package me.wwsun;

import junit.framework.TestCase;
import me.wwsun.stacks.ArrayStack;
import me.wwsun.stacks.Stack;

/**
 * Created by Weiwei on 2015/3/27.
 */
public class StackTest extends TestCase {

    public void testArrayStack() {
        Stack<Integer> stack = new ArrayStack<>();
        stack.push(5);
        stack.push(3);

        assertEquals(2, stack.size());
        assertEquals(new Integer(3), stack.top());
        stack.pop();
        assertEquals(new Integer(5), stack.top());
    }
}
