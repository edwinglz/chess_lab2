public class Chessboard {
    public static final int MIN_ROW = 1;
    public static final int MAX_ROW = 8;
    public static final char MIN_COL = 'a';
    public static final char MAX_COL = 'h';

    public Chessboard() {
    }

    public boolean withinChessboard(char column, int row) {
        char colLower = Character.toLowerCase(column);
        return (colLower >= MIN_COL && colLower <= MAX_COL) && 
               (row >= MIN_ROW && row <= MAX_ROW);
    }
}
