package div2.srm611.level1;

/**
 * Created by hideo on 2/26/14.
 */
public class InterestingNumber {
    static String INTERESTING = "Interesting";
    static String NOT_INTERESTING = "Not interesting";

    public String isInteresting(String X) {
        String isInteresting = NOT_INTERESTING;

        for (int D = 0; D < 10; D++) {
            int first = -1;
            int second = -1;
            for (int i = 0; i < X.length(); i++) {
                if (X.charAt(i) == Integer.toString(D).charAt(0)) {
                    if (first == -1) {
                        System.out.println("First:" + D + "\ti:" + i);
                        first = i;
                    } else {
                        second = i;
                        System.out.println("Second:" + D + "\ti:" + i);
                        if (second - first == D + 1) {
                            System.out.println(INTERESTING);
                            isInteresting = INTERESTING;
                            continue;
                        } else {
                            System.out.println(NOT_INTERESTING);
                            return NOT_INTERESTING;
                        }
                    }
                }
            }
        }

        return isInteresting;
    }
}
