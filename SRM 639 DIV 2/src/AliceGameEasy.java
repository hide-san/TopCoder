public class AliceGameEasy {
    final long NO_ANSWER = -1;

    public long findMinimumValue(long x, long y) {
        Score initScore = new Score();

        long minimumValue = dfsRecursiveCall(initScore, x, y);
        if (minimumValue == Long.MAX_VALUE) {
            return NO_ANSWER;
        } else {
            return minimumValue;
        }
    }

    public long dfsRecursiveCall(Score s, final long x, final long y) {
        if (s.alicePoint > x || s.kiritoPoint > y) {
            return Long.MAX_VALUE;
        } else if (s.alicePoint == x && s.kiritoPoint == y) {
            return s.aliceWinCount;
        }

        long retval = Long.MAX_VALUE;
        for (Score nextScore : s.getNextScores()) {
            long aliceWinCount = dfsRecursiveCall(nextScore, x, y);
            if (aliceWinCount != Long.MAX_VALUE) {
                retval = Math.min(retval, aliceWinCount);
            }

        }
        return retval;
    }

    public class Score {
        long turn;
        long aliceWinCount;
        long alicePoint;
        long kiritoPoint;

        private Score[] getNextScores() {
            Score aliceWin = new Score();
            aliceWin.turn = this.turn + 1;
            aliceWin.aliceWinCount = this.aliceWinCount + 1;
            aliceWin.alicePoint = this.alicePoint + aliceWin.turn;
            aliceWin.kiritoPoint = this.kiritoPoint;

            Score kirotoWin = new Score();
            kirotoWin.turn = this.turn + 1;
            kirotoWin.aliceWinCount = this.aliceWinCount;
            kirotoWin.alicePoint = this.alicePoint;
            kirotoWin.kiritoPoint = this.kiritoPoint + kirotoWin.turn;

            return new Score[]{kirotoWin, aliceWin};
        }

    }
}
