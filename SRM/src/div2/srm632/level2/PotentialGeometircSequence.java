package div2.srm632.level2;

import java.util.Arrays;

/**
 * Created by hideo on 2/26/14.
 */
public class PotentialGeometircSequence {


    public int numberOfSequences(int[] d) {
        int num;
        num = getNumberOfSequences(d);
        return num;
    }

    private int getNumberOfSequences(int[] d) {
        for (int i = 0; i < d.length; i++){
            getPossibleNumbers(d[i]);
        }
    }

    private void getPossibleNumbers(int i) {

    }
}
