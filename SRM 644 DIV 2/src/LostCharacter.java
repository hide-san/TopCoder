public class LostCharacter {
    final char A = 'a';
    final char Z = 'z';
    final char QUESTION_MARK = '?';

    public int[] getmins(String[] str) {
        int[] answers = new int[str.length];

        for (int i = 0; i < str.length; i++) {
            answers[i] = getMin(i, str);
        }

        return answers;
    }

    private int getMin(int target, String[] str) {
        final String targetString = str[target].replace(QUESTION_MARK, A);
        int count = 0;

        for (String aString : str) {
            if (aString.replace(QUESTION_MARK, Z).compareTo(targetString) < 0) {
                count++;
            }
        }
        return count;
    }
}
