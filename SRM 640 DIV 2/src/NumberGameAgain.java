import java.util.ArrayList;
import java.util.List;

public class NumberGameAgain {
    private List<Long> TABLE = new ArrayList<Long>();

    public long solve(int k, long[] table) {
        for (long forbiddenNumber : table) TABLE.add(forbiddenNumber);

        long numbers = (long) Math.pow(2, k) - 1;
        numbers -= 1; // No count "1"

        cleanupTable();

        for (long forbiddenNumber : TABLE) {
            int n = Math.getExponent((double) forbiddenNumber);
            numbers -= (long) Math.pow(2, k - n) - 1;
        }

        return numbers;
    }

    void cleanupTable() {
        List<Long> newTable = new ArrayList<Long>();
        for (Long i : TABLE) newTable.add(i);

        for (Long i : TABLE) {
            for (Long j : TABLE) {

                boolean isRemoved = false;
                Long baseNumber = i;
                while (baseNumber >= 2) {
                    baseNumber = baseNumber / 2;
                    if (baseNumber.equals(j)) {
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
