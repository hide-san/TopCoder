public class GreaterGameDiv2 {
    int calc(int[] snuke, int[] sothe) {
        final int N = snuke.length;
        int snukePoint = 0;

        for (int i = 0; i < N; i++) {
            if (snuke[i] > sothe[i]) snukePoint++;
        }

        return snukePoint;
    }
}