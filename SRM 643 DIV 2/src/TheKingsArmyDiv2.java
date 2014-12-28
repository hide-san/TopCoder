public class TheKingsArmyDiv2 {
	final char HAPPY = 'H';
	final char SAD = 'S';

	public int getNumber(String[] state) {
		int countOfHappySolders = 0;
		char[][] charState = new char[state.length][state[0].length()];
		for (int row = 0; row < state.length; row++) {
			for (int column = 0; column < state[0].length(); column++) {
				charState[row][column] = state[row].charAt(column);
				if (charState[row][column] == HAPPY) countOfHappySolders++;
			}
		}
		if (countOfHappySolders == 0) return 2;

		for (int row = 1; row < charState.length - 1; row++) {
			for (int column = 1; column < charState[0].length - 1; column++) {
				if (charState[row][column] == HAPPY) {
					if (charState[row - 1][column] == HAPPY ||
							charState[row + 1][column] == HAPPY ||
							charState[row][column - 1] == HAPPY ||
							charState[row][column + 1] == HAPPY) return 0;
				}
			}
		}

		return 1;
	}
}
