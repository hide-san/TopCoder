public class PathGameDiv2 {

    public static final char BLACK = '#';
    public static final char WHITE = '.';

    public int calc(String[] board) {
        int retval = 0;
        int previousBlackRow = getFirstBlackRow(board);
        for (int column = 0; column < board[0].length(); column++) {
            if (board[0].charAt(column) == WHITE && board[1].charAt(column) == WHITE) {
                retval++;
            } else if (board[0].charAt(column) == BLACK && board[1].charAt(column) == WHITE) {
                if (previousBlackRow == 1) {
                    previousBlackRow = 0;
                    retval--;
                }
            } else if (board[0].charAt(column) == WHITE && board[1].charAt(column) == BLACK) {
                if (previousBlackRow == 0) {
                    previousBlackRow = 1;
                    retval--;
                }
            }
        }
        return retval;
    }

    private int getFirstBlackRow(String[] board) {
        for (int column = 0; column < board[0].length(); column++) {
            for (int row = 0; row < board.length; row++) {
                if (board[row].charAt(column) == BLACK) return row;
            }
        }
        return 0;
    }
}
