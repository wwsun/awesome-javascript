package me.wwsun;

import junit.framework.TestCase;
import me.wwsun.array.GameEntry;
import me.wwsun.array.ScoreBoard;

public class ArrayTest extends TestCase {
    public void testArrays() {
        ScoreBoard sb = new ScoreBoard(5); // init a score board with 5 positions

        GameEntry p1 = new GameEntry("Weiwei", 20);
        GameEntry p2 = new GameEntry("Lili", 10);
        GameEntry p3 = new GameEntry("Lulu", 30);
        sb.add(p1);
        sb.add(p2);
        sb.add(p3);

        System.out.println(sb);

        sb.remove(1);
        System.out.println(sb);
    }
}
