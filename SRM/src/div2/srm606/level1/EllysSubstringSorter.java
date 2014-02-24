package div2.srm606.level1;

import java.util.Arrays;

/**
 * Created by hideo on 2/20/14.
 */
public class EllysSubstringSorter {
    public String getMin(String S, int L) {
        String minS = "";
        String nextS;

        for (int i = 0; i + L <= S.length(); i++) {
            String first = S.substring(0, i);
            char[] chars = S.substring(i, i + L).toCharArray();
            Arrays.sort(chars);
            String middle = new String(chars);
            String last = S.substring(i + L, S.length());

            nextS = first + middle + last;
            if (minS.isEmpty() || nextS.compareTo(minS) < 0) {
                minS = nextS;
            }
        }
        return minS;
    }
}
