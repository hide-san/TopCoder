public class IdentifyingWood {
    static final String WOOD = "Yep, it's wood.";
    static final String NOT_WOOD = "Nope.";

    public String check(String s, String t) {
        int matchCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t.charAt(matchCount)) {
                matchCount++;
            }

            if (matchCount == t.length()) {
                return WOOD;
            }
        }

        return NOT_WOOD;
    }
}
