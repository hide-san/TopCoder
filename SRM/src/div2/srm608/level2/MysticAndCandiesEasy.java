package div2.srm608.level2;

import java.util.Arrays;

public class MysticAndCandiesEasy {
    public int minBoxes(int C, int X, int[] high) {
        Arrays.sort(high);
        int sum = 0;
        int totalBoxCount = high.length;

        for (int i = 0; i < totalBoxCount; i++) {
            sum += high[i];
            if (C - sum < X) return totalBoxCount - i;
        }

        return 0;
    }
}
