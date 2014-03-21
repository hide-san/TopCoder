package div2.srm613.level1;

/**
 * Created by hideo on 2/26/14.
 */
public class TaroString {
    static String POSSIBLE = "Possible";
    static String IMPOSSIBLE = "Impossible";
    static String CAT = "CAT";

    public String getAnswer(String X) {
        StringBuilder check = new StringBuilder();
        for (int i = 0; i < X.length(); i++) {
            if (X.charAt(i) == 'C' || X.charAt(i) == 'A' || X.charAt(i) == 'T'){
                check.append(X.charAt(i));
                System.out.println("YES CAT:" + X.charAt(i));

            }
        }

        if (CAT.equals(check.toString())){
            return POSSIBLE;
        } else{
            return IMPOSSIBLE;
        }
    }
}
