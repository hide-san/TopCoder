public class LightSwitchingPuzzle {
    private static final char ON = 'Y';
    private static final char OFF = 'N';
    private static final int NO_ANSWER = -1;

    public int minFlips(String state) {
        int count = 0;

        for (int switchID = 1; switchID < state.length() + 1; switchID++) {
            if (state.charAt(switchID - 1) == ON) {
                count++;
                state = getNextStae(state, switchID);
            }
        }

        if (state.contains("" + ON))
            return NO_ANSWER;

        return count;
    }

    private String getNextStae(String state, int switchID) {
        char[] charState = state.toCharArray();
        for (int lightID = 1; lightID < state.length() + 1; lightID++) {
            if (lightID % switchID == 0) {
                if (charState[lightID - 1] == ON) {
                    charState[lightID - 1] = OFF;
                } else {
                    charState[lightID - 1] = ON;
                }
            }
        }
        return new String(charState);
    }

}
