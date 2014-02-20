package div2.srm607.level1;

import java.util.Arrays;

/**
 * Created by hideo on 2/20/14.
 */
public class BoundingBox {
    public int smallestArea(int[] X, int[] Y) {
        Arrays.sort(X);
        Arrays.sort(Y);
        
        int maxX = X[X.length];
        int minX = X[0];
        int maxY = Y[Y.length];
        int minY = Y[0];
                        
        return (maxX -minX) * (maxY - minY);

    }

}
