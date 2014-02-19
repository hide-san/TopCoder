package div2.srm608.level1;

/**
 * Created by hideo on 2/19/14.
 */
public class OneDimensionalRobotEasy {
    public int finalPosition(String commands, int A, int B) {
        int position = 0;

        for (int i = 0; i < commands.length(); i++) {
            if (position == -A && commands.charAt(i) == 'L') continue;
            if (position == B && commands.charAt(i) == 'R') continue;
            if (commands.charAt(i) == 'L') position--;
            if (commands.charAt(i) == 'R') position++;
        }

        return position;
    }
}
