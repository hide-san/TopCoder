public class GameOfStones {
    private static final int IMPOSSIBLE = -1;
    private static final int COUNT_OF_HANDS = 2;

    public int count(int[] stones) {
        final int piles = stones.length;
        int totalStones = 0;
        for (int stone : stones) totalStones += stone;

        if (totalStones % piles != 0) {
            return IMPOSSIBLE;
        }


        final int targetStonesForPile = totalStones / piles;
        int removedStones = 0;
        for (int stonesForThisPile : stones) {
            int thisMovedStones = stonesForThisPile - targetStonesForPile;
            if (thisMovedStones % COUNT_OF_HANDS != 0) {
                return IMPOSSIBLE;
            } else if (thisMovedStones > 0) {
                removedStones += thisMovedStones;
            }
        }

        return removedStones / COUNT_OF_HANDS;
    }
}
