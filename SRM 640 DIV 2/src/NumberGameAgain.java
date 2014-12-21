import java.util.ArrayList;
import java.util.List;

public class NumberGameAgain {

    public long solve(int k, long[] table) {
        long numbers = (long) Math.pow(2, k) - 1;
        numbers -= 1; // No count "1"

        table = cleanupTable(table);

        for (long forbiddenNumber : table) {
            int n = Math.getExponent((double) forbiddenNumber);
            numbers -= (long) Math.pow(2, k - n) - 1;
        }

        return numbers;
    }

    long[] cleanupTable(long[] table) {
        List<Long> newTable = new ArrayList<Long>();
        for (Long i : table) newTable.add(i);

        for (Long i : table) {
            for (Long j : table) {

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

        long[] cleanTable = new long[newTable.size()];
        for (int i = 0; i < newTable.size(); i++) cleanTable[i] = newTable.get(i);

        return cleanTable;
    }

}
