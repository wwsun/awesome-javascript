package me.wwsun.array;

/**
 * Created by Weiwei on 2015/3/24.
 */
public class ScoreBoard {
    private int numEntries = 0; // number of actual entries
    private GameEntry[] board;  // array of game entries

    public ScoreBoard(int capacity) {
        board = new GameEntry[capacity];
    }

    /**
     * Attempt to add a new score to the collection (if it is high enough)
     *
     * @param e is the element you want to insert
     */
    public void add(GameEntry e) {
        int newScore = e.getScore();
        // is the new entry e really a high score?
        if (numEntries < board.length || newScore > board[numEntries - 1].getScore()) {
            if (numEntries < board.length) numEntries++;
            // shift any lower scores rightward to make room for the new entry
            int j = numEntries - 1;
            while (j > 0 && board[j - 1].getScore() < newScore) {
                board[j] = board[j - 1];
                j--;
            }
            board[j] = e;
        }
    }


    /**
     * @param i is index of score which you want to remove
     * @return the high score at index i
     * @throws IndexOutOfBoundsException
     */
    public GameEntry remove(int i) throws IndexOutOfBoundsException {
        if (i < 0 || i >= numEntries)
            throw new IndexOutOfBoundsException("Invalid index: " + i);

        GameEntry temp = board[i];
        for (int j = i; j < numEntries - 1; j++) board[j] = board[j + 1]; //move one cell to the left
        board[numEntries - 1] = null;
        numEntries--;

        return temp;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("[");
        for (int j = 0; j < numEntries; j++) {
            if (j > 0)
                stringBuilder.append(", ");                   // separate entries by commas
            stringBuilder.append(board[j]);
        }
        stringBuilder.append("]");

        return stringBuilder.toString();
    }
}
