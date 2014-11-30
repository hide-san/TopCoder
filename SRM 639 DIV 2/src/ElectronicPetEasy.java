import java.util.ArrayList;
import java.util.List;

public class ElectronicPetEasy {
    static final String EASY = "Easy";
    static final String DIFFICULT = "Difficult";

    public String isDifficult(int st1, int p1, int t1, int st2, int p2, int t2) {
        List<Integer> feedTimings = new ArrayList<Integer>();

        for (int i = 0; i < t1; i++) {
            feedTimings.add(st1 + p1 * i);
        }

        for (int i = 0; i < t2; i++) {
            if (feedTimings.contains(st2 + p2 * i)) return DIFFICULT;
        }

        return EASY;
    }
}
