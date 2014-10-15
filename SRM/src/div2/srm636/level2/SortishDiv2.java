import java.util.ArrayList;
import java.util.List;

/**
 * Created by hideo on 14/09/28.
 */
public class SortishDiv2 {
    private static int THE_SORTEDNESS = 0;
    private static int POSSIBLE_NUMBER = 0;

    public int ways(int sortedness, int[] seq) {
        THE_SORTEDNESS = sortedness;

        fillNumber(seq, -1);

        return POSSIBLE_NUMBER;
    }

    private void fillNumber(int[] seq, int depth) {
        if (depth == seq.length - 1) {
            if (getSoredness(seq) == THE_SORTEDNESS) POSSIBLE_NUMBER++;
            return;
        }

        int[] nextSeq = new int[seq.length];
        System.arraycopy(seq, 0, nextSeq, 0, seq.length);

        depth++;
        for (int nextNumber : getNextNumbers(nextSeq, depth)) {
            int temp = seq[depth];
            seq[depth] = nextNumber;
            fillNumber(seq, depth);
            seq[depth] = temp;
        }
    }

    private int[] getNextNumbers(int[] seq, int depth) {
        int[] nextNumbers;
        if (seq[depth] != 0) {
            nextNumbers = new int[1];
            nextNumbers[0] = seq[depth];
            return nextNumbers;
        }

        List<Integer> nextNumberList = new ArrayList<Integer>();
        for (int i = 1; i < seq.length + 1; i++) {
            boolean addFlag = true;
            for (int aSeq : seq) {
                if (i == aSeq) addFlag = false;
            }
            if (addFlag) nextNumberList.add(i);
        }

        nextNumbers = new int[nextNumberList.size()];
        for (int i = 0; i < nextNumberList.size(); i++) {
            nextNumbers[i] = nextNumberList.get(i);
        }

        return nextNumbers;
    }

    private int getSoredness(int[] seq) {
        int count = 0;
        for (int i = 0; i < seq.length; i++) {
            for (int j = i; j < seq.length; j++) {
                if (seq[i] < seq[j] && i < j) count++;
            }
        }
        return count;
    }
}
