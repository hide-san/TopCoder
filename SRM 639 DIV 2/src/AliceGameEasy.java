public class AliceGameEasy {
    final long NO_ANSWER = -1;

    public long findMinimumValue(long x, long y) {
        long situation = 0;
        Score score = new Score();
        while (score.alicePoint <= x || score.kiritoPoint <= y) {
            score = getScore(situation);
            if (score.alicePoint == x && score.kiritoPoint == y) {
                return score.aliceWinCount;
            }
            situation++;
        }

        return NO_ANSWER;
    }

    private Score getScore(long situation) {
        Score score = new Score();

        while (situation > 0) {
            long aliceWinBit = situation % 2;
            situation = situation / 2;

            score.turn++;
            if (aliceWinBit == 1L) {
                score.alicePoint = score.alicePoint + score.turn;
                score.aliceWinCount++;
            } else {
                score.kiritoPoint = score.kiritoPoint + score.turn;
            }
        }

        return score;
    }


    public class Score {
        long turn;
        long aliceWinCount;
        long alicePoint;
        long kiritoPoint;
    }
}
