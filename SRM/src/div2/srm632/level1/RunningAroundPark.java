package div2.srm632.level1;

/**
 * Created by hideo on 2/26/14.
 */
public class RunningAroundPark {
    public int numberOfLap(int N, int[] d) {
        int lap = 1;
        int currentPosition;
        int nextPosition = 0;
        for (int i = 0; i < d.length; i++) {
            currentPosition = nextPosition;
            nextPosition = d[i];
            if (nextPosition > currentPosition) {
                continue;
            }
            lap++;
        }

        return lap;
    }
}
