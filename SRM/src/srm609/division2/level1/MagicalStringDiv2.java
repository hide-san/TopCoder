package srm609.division2.level1;

/**
 * Created by hideo on 2/18/14.
 */
public class MagicalStringDiv2 {
    public int minimalMoves(String S) {
        int move = 0;
        for (int i = 0; i < S.length() / 2; i++) {
            if (S.charAt(i) == '<') move++;
        }

        for (int i = S.length() / 2; i < S.length(); i++) {
            if (S.charAt(i) == '>') move++;
        }
        return move;
    }
}
