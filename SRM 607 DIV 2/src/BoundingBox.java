import java.util.Arrays;

public class BoundingBox {
    public int smallestArea(int[] X, int[] Y) {
        Arrays.sort(X);
        Arrays.sort(Y);

        int maxX = X[X.length - 1];
        int minX = X[0];
        int maxY = Y[Y.length - 1];
        int minY = Y[0];

        return (maxX - minX) * (maxY - minY);
    }
}
