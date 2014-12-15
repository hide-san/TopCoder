public class TrianglesContainOriginEasy {

    public int count(int[] x, int[] y) {
        final int N = x.length;
        int count = 0;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    count += checkOriginInside(x[i], y[i], x[j], y[j], x[k], y[k]);
                }
            }
        }

        return count;
    }

    private int checkOriginInside(int x0, int y0, int x1, int y1, int x2, int y2) {
        double s1 = triangleSize(x0, y0, x1, y1);
        double s2 = triangleSize(x1, y1, x2, y2);
        double s3 = triangleSize(x2, y2, x0, y0);

        double s = triangleSize(x0, y0, x1, y1, x2, y2);

        if (s1 + s2 + s3 > s) {
            return 0;
        } else {
            return 1;
        }
    }

    private static double triangleSize(int x0, int y0, int x1, int y1) {
        return triangleSize(x0, y0, x1, y1, 0, 0);
    }

    private static double triangleSize(int x0, int y0, int x1, int y1, int x2, int y2) {
        return Math.abs(x0 * y1 + x1 * y2 + x2 * y0 - y0 * x1 - y1 * x2 - y2 * x0) / 2.0d;
    }
}
