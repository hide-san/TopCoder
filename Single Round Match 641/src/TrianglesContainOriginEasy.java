public class TrianglesContainOriginEasy {

    public int count(int[] x, int[] y) {
        final int N = x.length;
        int count = 0;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    System.out.println(i + "\t" + j + "\t" + k);
                    count += check(x[i], y[i], x[j], y[j], x[k], y[k]);
                }
            }
        }

        return count;
    }

    private int check(int x0, int y0, int x1, int y1, int x2, int y2) {
        double[] arr = new double[2];
        if (x0 * y1 - x1 * y0 == 0) {
            arr[0] = Double.NaN;
            arr[1] = Double.NaN;
        } else {
            arr[0] = (y1 * x2 - x1 * y2) / (x0 * y1 - x1 * y0);
            arr[1] = (x0 * y2 - y0 * x2) / (x0 * y1 - x1 * y0);
        }

        if (arr[0] > 0 && arr[1] > 0 && arr[0] + arr[1] < 1) {
            return 1;
        }
        return 0;
    }
}
