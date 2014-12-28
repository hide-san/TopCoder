import java.util.ArrayList;
import java.util.List;

public class TheKingsFactorization {

    public long[] getVector(long N, long[] primes) {
        List<Long> answerList = new ArrayList<Long>();

        for (int i = 0; i < primes.length; i++) {
            answerList.add(primes[i]);
            N = N / primes[i];

            if (i == primes.length - 1) {
                if (N != 1) answerList.add(N);
                break;
            }

            if (N % primes[i] == 0) {
                answerList.add(primes[i]);
                N = N / primes[i];
                continue;
            }

            for (long thisNumber = primes[i]; thisNumber <= N; thisNumber++) {
                if (N % thisNumber == 0) {
                    answerList.add(thisNumber);
                    N = N / thisNumber;
                    break;
                }
            }
        }

        long[] answerArray = new long[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) answerArray[i] = answerList.get(i);

        return answerArray;
    }
}
