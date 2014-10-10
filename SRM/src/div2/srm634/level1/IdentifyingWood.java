package div2.srm635.level1;

/**
 * Created by hideo on 14/09/28.
 */
public class IdentifyingWood {
    String WOOD = "Yep, it's wood.";
    String NOT_WOOD = "Nope.";

    public String check(String s,  String t) {

        int matchCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t.charAt(matchCount)){
                matchCount++;
            }

            if (t.length() == matchCount) {
                return WOOD;
            }

        }
        return NOT_WOOD;
    }

}
