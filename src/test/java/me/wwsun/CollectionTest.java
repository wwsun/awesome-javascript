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
        Collection<String> copy = new ArrayList<>(c);

        // remove elements from a collection
        c.remove("zero");
        c.removeAll(e);
        c.retainAll(d); // remove all elements that are not in d
        c.clear(); // remove all

        // querying collection size
        boolean b = c.isEmpty(); // c is not empty, so b is true
        assertTrue(b);

        int s = c.size();

        // restore collection from the copy we made
        c.addAll(copy);

        // membership test, membership is based on the equals method!
        b = c.contains("zero");
        assertTrue(b);

        b = c.containsAll(d);
        assertTrue(b);

        // toString()
        System.out.println(c);

        // obtain an array of collection elements
        // the array is a copy, not a reference to an internal data structure
        Object[] elements = c.toArray();

        // if we want the elements in a String[], we must pass on in
        String[] strings = c.toArray(new String[c.size()]);

        // or we can pass an empty String[] just to specify the type and
        // the toArray method will allocate an array for us
        strings = c.toArray(new String[0]);
        for (String string : strings) {
            System.out.println("-\t" +string);
        }
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

    // a List is an ordered collection of objects
    public void testList() {
        String[] args = {"hello", "mr", "sun", "it's", "a", "good", "news"};

        // create lists to work with
        List<String> l = new ArrayList<>(Arrays.asList(args));
        List<String> words = Arrays.asList("hello", "world");

        // querying and setting elements by index
        String first = l.get(0);
        String last = l.get(l.size() - 1);
        System.out.println("First:\t" + first);
        System.out.println("Last:\t" + last);

        l.set(0, last);
        System.out.println(l); // toString()

        // adding and inserting elements
        l.add(first); // append the first word at the end of list
        l.add(0, first); // insert first at the start of the list again
        l.addAll(words);
        l.addAll(1, words);

        System.out.println(l);

        // sublists: backed by the original list
        // Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.
        List<String> sub = l.subList(1, 3); // second and third element
        System.out.println(sub);

        // sublists can restrict operations to a subrange of backing list
        String s = Collections.min(l.subList(0, 4));
        Collections.sort(l.subList(0,4));

        // independent copies of a sublist don't affect the parent list
        List<String> subcopy = new ArrayList<>(l.subList(1, 3));
        System.out.println(subcopy);

        // searching lists
        int p = l.indexOf(last); // where does the last word first appear
        System.out.println(p);
        p = l.lastIndexOf(last); // search backward
        System.out.println(p);

        // print the index of all occurrences of last in l.
        int n = l.size();
        p = 0;
        do {
            // get a view of the list that includes only the elements we haven't searched yet
            List<String> list = l.subList(p, n);
            int q = list.indexOf(last);
            if (q==-1) break;
            System.out.printf("Found '%s' at index %d%n", last, p + q);
            p += q +1;
        } while(p<n);

        // removing elements from a list
        l.remove(last);
        l.remove(0);
        l.subList(0, 2).clear();
        l.retainAll(words); // remove all but elements in words
        l.removeAll(words);
        l.clear(); // remove everything
        System.out.println(l);
    }
}
