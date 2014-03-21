package div2.srm611.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by hideo on 2/26/14.
 */
public class LCMSetEasy {
    static String POSSIBLE = "Possible";
    static String IMPOSSIBLE = "Impossible";

    public String include(int S[], int x) {
        List numbers = new ArrayList<Integer>();
        boolean[] flag;
        flag = new boolean[S.length];

        for (int i = 0; i < S.length; i++ ){
            flag

        }

        System.out.println(lcm(S));


        return IMPOSSIBLE;
    }

    private static int lcm(int a, int b)
    {
        return a * (b / gcd(a, b));
    }

    private static int lcm(int[] input)
    {
        int result = input[0];
        for(int i = 1; i < input.length; i++) result = lcm(result, input[i]);
        return result;
    }

    private static int gcd(int a, int b)
    {
        while (b > 0)
        {
            int temp = b;
            b = a % b; // % is remainder
            a = temp;
        }
        return a;
    }
}
