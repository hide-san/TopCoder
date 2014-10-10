/**
 * Created by hideo on 14/09/28.
 */
public class MountainRanges {
    public int countPeaks(int[] heights) {
        int peak = 0;

        int thisPeak = -1;
        int previosPeak = -1;
        int nextPeak = -1;
        for (int i = 0; i < heights.length; i++) {
            thisPeak = heights[i];

            if (i == 0) {
                previosPeak = heights[i] - 1;
            } else {
                previosPeak = heights[i - 1];
            }
            if (i == heights.length - 1) {
                nextPeak = heights[i] - 1;
            } else {
                nextPeak = heights[i + 1];
            }

            System.out.println(previosPeak +","+ i +","+  nextPeak);
            if (previosPeak < thisPeak && thisPeak > nextPeak) {
                peak++;
            }

        }
        return peak;
    }
}