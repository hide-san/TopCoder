import java.util.ArrayList;
import java.util.List;

public class NumberGameAgain {
    private final long INITIAL_NUMBER = 1;

    private int K;
    private List<Long> TABLE = new ArrayList<Long>();

    public long solve(int k, long[] table) {
        K = k;
        for (long forbiddenNumber : table) {
            TABLE.add(forbiddenNumber);
        }

        long numbers = (long) Math.pow(2, K) - 1;
        numbers -= 1; // No count "1"

        cleanupTable();

        for (long forbiddenNumber : TABLE) {
            int n = Math.getExponent((double) forbiddenNumber);
            numbers -= (long) Math.pow(2, K - n) - 1;
        }

        return numbers;

    }

    void cleanupTable() {
        List<Long> newTable = new ArrayList<Long>();
        for (Long i : TABLE) newTable.add(i);

        for (Long i : TABLE) {
            boolean isRemoved = false;
            int devideCont = 0;
            for (Long j : TABLE) {

                Long temp = i;
                while (temp >= 2) {
                    temp = temp / 2;
                    devideCont++;
                    if (temp.equals(j)) {
//                        System.out.println("i:" + i + "\tj:" + j + "\td:" + devideCont);
                        newTable.remove(i);
                        isRemoved = true;
                    }
                    if (isRemoved) break;
                }
                if (isRemoved) break;
            }
        }

        TABLE = newTable;
    }

}
