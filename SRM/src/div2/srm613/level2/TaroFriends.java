package div2.srm613.level2;

import java.util.Arrays;

/**
 * Created by hideo on 2/26/14.
 */
public class TaroFriends {

    public int getNumber(int[] coordinates, int X) {
        Arrays.sort(coordinates);
        final int OUT_OF_RANGE = 300000001;

        if (coordinates[0] - X;
        coordinates[0] + X;
        coordinates[coordinates.length] - X;
        coordinates[coordinates.length] + X;

        int leftmost = OUT_OF_RANGE;
        int rightmost = OUT_OF_RANGE * -1;
        System.out.println("init:" + Arrays.toString(coordinates));
        for (int coordinate : coordinates) {
            if (coordinate + X < leftmost) {
                leftmost = coordinate + X;
                System.out.println("leftmost:" + leftmost);
            } else {
                if (coordinate - X > rightmost) {
                    rightmost = coordinate - X;
                    System.out.println("rightmost:" + rightmost);
                } else {
                    rightmost = coordinate + X;
                }

            }
        }

        return rightmost - leftmost;

    }
}
