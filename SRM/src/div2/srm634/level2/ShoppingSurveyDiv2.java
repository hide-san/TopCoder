/**
 * Created by hideo on 14/09/28.
 */
public class ShoppingSurveyDiv2 {
    public int minValue(int N, int[] s) {
        int missingItems = 0;

        for (int i = 0; i < s.length; i++) {
            missingItems = missingItems + (N - s[i]);
        }

        if (missingItems > N) return 0;

        return N - missingItems;

    }
}
