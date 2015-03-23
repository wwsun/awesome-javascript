package me.wwsun;

import junit.framework.TestCase;

import java.util.*;

/**
 * Created by Weiwei on 2015/3/22.
 */
public class CollectionTest extends TestCase {

    public void testCollection() {

        Collection<String> c = new HashSet<>(); // an empty set

        // using utility methods
        Collection<String> d = Arrays.asList("one", "two");
        Collection<String> e = Collections.singleton("three");

        // add elements to a collection
        c.add("zero");
        c.addAll(d);

        // copy a collection: most implementations have a copy constructor
        Collection<String> copy = new ArrayList<String>(c);
    }

    public void testSortedSet() {
        String[] args = {"hello", "new", "weiwei", "algorithm"};
        SortedSet<String> s = new TreeSet<>(Arrays.asList(args));

        // iterate set: elements are automatically sorted
        for (String word: s) {
            System.out.println(word);
        }

        // special elements
        String first = s.first();
        String last = s.last();
        System.out.println("First: "+first + "\tLast: " + last);

        // all elements but first
        SortedSet<String> tail = s.tailSet(first + '\0');
        System.out.println(tail);

        // all elements but last
        SortedSet<String> head = s.headSet(last);
        System.out.println(head);

        SortedSet<String> middle = s.subSet(first + '\0', last);
        System.out.println(middle);
    }
}
