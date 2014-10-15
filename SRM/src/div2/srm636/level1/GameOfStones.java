/**
 * Created by hideo on 14/09/28.
 */
public class GameOfStones {
    public int count(int[] stones) {
        double finalStoneCount = 0;
        for (int stone : stones) {
            finalStoneCount += stone;
        }
        finalStoneCount = finalStoneCount / stones.length;

        double moveCount = 0;
        double moveOkay = 0;
        for (int stone : stones) {
            moveCount += Math.abs((finalStoneCount - stone) / 2);
            moveOkay += (finalStoneCount - stone) / 2;

            if (moveCount % 1 != 0) return -1;
            if (moveOkay % 1 != 0) return -1;
        }

        return (int) moveCount / 2;
    }
}
