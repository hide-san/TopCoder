/**
 * Created by hideo on 14/09/28.
 */
public class QuadraticLaw {
    public long getTime(long d) {
        long t;

        for (t = 0; d >= t + t * t; t++) {
        }
        return t-1;
    }
}