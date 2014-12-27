import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TheKingsFactorization {

    public long[] getVector(long N, long[] primes) {
        List<Long> answers = new ArrayList<Long>();
        Arrays.sort(primes);

        for (int i = primes.length - 1; i >= 0; i--) {
            while (N % primes[i] == 0) {
                N = N / primes[i];
                answers.add(primes[i]);
            }
        }

        if (N != 0) {
            while (N % 2 == 0) {
                N = N / 2;
                answers.add(2L);
            }
            for (long i = 3; i <= N; i += 2) {
                while (N % i == 0) {
                    N = N / i;
                    answers.add(i);
                }
            }
        }


        long[] longArrayAnswers = new long[answers.size()];
        for (int i = 0; i < answers.size(); i++) longArrayAnswers[i] = answers.get(i);

        Arrays.sort(longArrayAnswers);
        return longArrayAnswers;
    }
}
