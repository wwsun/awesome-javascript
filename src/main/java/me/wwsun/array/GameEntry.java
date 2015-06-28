package me.wwsun.array;

/**
 * Created by Weiwei on 2015/3/24.
 */
public class GameEntry {
    private String name; // player name
    private int score;   // score value

    public GameEntry(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "(" + name + ", " + score + ")";
    }
}
