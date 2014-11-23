import java.util.ArrayList;
import java.util.List;

public class NarrowPassage2Easy {
    public int count(final int[] size, final int maxSizeSum) {
        List<Integer> wolves = new ArrayList<Integer>();
        for (int i = 0; i < size.length; i++) wolves.add(i);

        return getPermutationCount(new ArrayList<Integer>(), wolves, size, maxSizeSum);
    }

    static int getPermutationCount(List<Integer> currentWolves, List<Integer> remainingWolves, final int originalSize[], final int maxSizeSum) {
        int remainingWolfCount = remainingWolves.size();
        if (remainingWolfCount == 0) return 1;

        int count = 0;
        for (int i = 0; i < remainingWolfCount; i++) {
            List<Integer> nextWolves = new ArrayList<Integer>(currentWolves);
            List<Integer> nextRemainingWolves = new ArrayList<Integer>(remainingWolves);

            nextWolves.add(nextRemainingWolves.get(i));
            nextRemainingWolves.remove(i);

            if (checkPossibleToMove(nextWolves, originalSize, maxSizeSum) == 0) continue;
            count += getPermutationCount(nextWolves, nextRemainingWolves, originalSize, maxSizeSum);
        }

        return count;
    }

    static int checkPossibleToMove(List<Integer> currentWolves, final int originalSize[], final int maxSizeSum) {
        for (int i = 0; i < currentWolves.size(); i++) {
            for (int j = i; j < currentWolves.size(); j++) {
                if (currentWolves.get(i) > currentWolves.get(j)
                        && originalSize[currentWolves.get(i)] + originalSize[currentWolves.get(j)] > maxSizeSum) {
                    return 0;
                }
            }
        }
        return 1;
    }
}