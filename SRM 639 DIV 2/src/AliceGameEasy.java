public class AliceGameEasy {
    final long NO_ANSWER = -1;

    public long findMinimumValue(final long x, final long y) {
        long totalScore = 0;
        long turn = 0;
        while (true) {
            if (totalScore > x + y) return NO_ANSWER;
            if (totalScore == x + y) break;
            turn++;
            totalScore += turn;
        }

        long aliceWinCount = 0;
        long alicePoint = x;
        for (long i = turn; i > 0; i--) {
            if (i <= alicePoint) {
                aliceWinCount++;
                alicePoint -= i;
            }
        }

        return aliceWinCount;
    }
}
