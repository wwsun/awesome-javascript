package me.wwsun;

import junit.framework.TestCase;
import me.wwsun.stacks.ArrayStack;
import me.wwsun.stacks.MatchDelimiters;
import me.wwsun.stacks.ReverseWithStack;
import me.wwsun.stacks.Stack;

import java.util.Arrays;

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

    public void testArrayReverseWithStack() {
        Integer[] a = {4, 8, 15, 16, 23, 42};  // autoboxing allows this
        String[] s = {"Jack", "Kate", "Hurley", "Jin", "Michael"};
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("s = " + Arrays.toString(s));
        System.out.println("Reversing...");
        ReverseWithStack.reverse(a);
        ReverseWithStack.reverse(s);
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("s = " + Arrays.toString(s));
    }

    public void testMatchDelimiters() {
        String[] valid = {
                "()(()){([()])}",
                "( ) ( ( ) ) {( [ ( )  ] ) } ",
                "(3) (3 + (4 - 5) ) {( [ ( )  ] ) } ",
                "((()(()){([()])}))",
                "[(5+x)-(y+z)]"
        };

        String[] invalid = {
                ")(()){([()])}",
                "({[])}",
                "("
        };

        for (String s : valid)
            if (!MatchDelimiters.isMatched(s))
                System.out.println("Error evaluating valid: " + s);

        for (String s : invalid)
            if (MatchDelimiters.isMatched(s))
                System.out.println("Error evaluating invalid: " + s);
    }
}
