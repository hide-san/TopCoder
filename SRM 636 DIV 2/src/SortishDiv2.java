import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class SortishDiv2 {

    private static final int ERASED = 0;

    public int ways(int sortedness, int[] seq) {
        int ways = 0;

        for (int[] thisSeq : getPossibleSeq(seq)) {
            if (getSortedness(thisSeq) == sortedness) {
                ways++;
            }
        }

        return ways;
    }

    private int getSortedness(final int[] thisSeq) {
        int sortedness = 0;

        for (int i = 0; i < thisSeq.length; i++) {
            for (int j = i + 1; j < thisSeq.length; j++) {
                if (thisSeq[i] < thisSeq[j]) sortedness++;
            }
        }

        return sortedness;
    }

    private List<int[]> getPossibleSeq(final int[] seq) {
        List<int[]> possibleSeq = new ArrayList<int[]>();

        Queue<int[]> queue = new ArrayDeque<int[]>();
        queue.offer(seq);
        while (!queue.isEmpty()) {
            int[] thisSeq = queue.poll();
            if (!hasSpecificSeq(thisSeq, ERASED)) {
                possibleSeq.add(thisSeq);
                continue;
            }
            for (int[] nextSeq : getNextSeq(thisSeq)) {
                queue.offer(nextSeq);
            }
        }

        return possibleSeq;
    }

    private boolean hasSpecificSeq(final int[] seq, final int targetSeq) {
        for (int thisSeq : seq) {
            if (thisSeq == targetSeq) {
                return true;
            }
        }
        return false;
    }

    private List<int[]> getNextSeq(final int[] seq) {
        List<int[]> nextSeqList = new ArrayList<int[]>();

        int indexOfErasedSeq = 0;
        while (seq[indexOfErasedSeq] != ERASED) {
            indexOfErasedSeq++;
        }

        for (int erasedSeq = 1; erasedSeq < seq.length + 1; erasedSeq++) {
            if (hasSpecificSeq(seq, erasedSeq)) {
                continue;
            }

            int[] nextSeq = new int[seq.length];
            System.arraycopy(seq, 0, nextSeq, 0, seq.length);
            nextSeq[indexOfErasedSeq] = erasedSeq;
            nextSeqList.add(nextSeq);
        }

        return nextSeqList;
    }
}
