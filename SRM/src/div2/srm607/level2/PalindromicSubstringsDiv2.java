package div2.srm607.level2;

/**
 * Created by hideo on 2/20/14.
 */
public class PalindromicSubstringsDiv2 {

    public int count(String[] S1, String[] S2) {
        int count = 0;
        String S = new String();
        for (int i = 0; i < S1.length; i++) {
            S = S + S1[i];
        }

        for (int i = 0; i < S2.length; i++) {
            S = S + S2[i];
        }


        for (int length = 1; length <= S.length(); length++) {
            for (int i = 0; i + length < S.length(); i++) {
                if (isPalindromic(S.substring(i, i + length))) {
                    count++;
                }
            }

        }


        return 0;
    }

    private boolean isPalindromic(String substring) {
        for (int i = 0; i < substring.length(); i++) {
            if (substring.charAt(i) != substring.charAt(substring.length() - i)) return false;
        }

        return true;
    }
}
