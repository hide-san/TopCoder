public class TheKingsArmyDiv2 {
    final char HAPPY = 'H';
    final int SHIFT = 1;

    public int getNumber(String[] state) {
        int countOfHappySolders = 0;
        final int R = state.length;
        final int C = state[0].length();

        for (int row = 0; row < R; row++) {
            for (int column = 0; column < C; column++) {
                if (state[row].charAt(column) == HAPPY) countOfHappySolders++;
            }
        }
        if (countOfHappySolders == 0) return 2;

        char[][] charState = new char[R + SHIFT * 2][C + SHIFT * 2];
        for (int row = 0; row < R; row++) {
            for (int column = 0; column < C; column++) {
                charState[row + SHIFT][column + SHIFT] = state[row].charAt(column);
            }
        }

        for (int row = SHIFT; row < R + SHIFT; row++) {
            for (int column = SHIFT; column < C + SHIFT; column++) {
                if (charState[row][column] == HAPPY && (charState[row - 1][column] == HAPPY ||
                                                        charState[row + 1][column] == HAPPY ||
                                                        charState[row][column - 1] == HAPPY ||
                                                        charState[row][column + 1] == HAPPY)) return 0;

            }
        }

        return 1;
    }
}

