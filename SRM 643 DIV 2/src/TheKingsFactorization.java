import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TheKingsFactorization {

    public long[] getVector(long N, long[] primes) {
        List<Long> answerList = new ArrayList<Long>();

        for (long prime : primes) {
            answerList.add(prime);
            N = N / prime;
        }

        for (int i = 0; i < primes.length; i++) {
            if (i == primes.length - 1) {
                if (N != 1) answerList.add(N);
                break;
            }

            for (long thisNumber = primes[i]; thisNumber <= primes[i + 1]; thisNumber++) {
                if (N % thisNumber == 0) {
                    answerList.add(thisNumber);
                    N = N / thisNumber;
                    break;
                }
                if (primes[i + 1] * thisNumber > N) break;
                if (thisNumber != 2) thisNumber++; // Do not check even numbers;
            }
        }

        long[] answerArray = new long[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) answerArray[i] = answerList.get(i);
        Arrays.sort(answerArray);
        return answerArray;
    }
}
