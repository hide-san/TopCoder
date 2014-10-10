public class ShoppingSurveyDiv2 {
    public int minValue(int N, int[] s) {
        int missingItems = 0;

        for (int value : s) {
            missingItems = missingItems + (N - value);
        }

        return Math.max(0, N - missingItems);

    }
}
