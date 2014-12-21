import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class NumberGameAgain {
    private static final long INITIAL_NUMBER = 1;

    private static int K;
    private static final List<Long> TABLE = new ArrayList<Long>();

    public long solve(int k, long[] table) {
        K = k;
        for (long forbiddenNumber : table) {
            TABLE.add(forbiddenNumber);
        }

        long countOfGoalToWin = -1; // This is -1 since "1", the initial value, is not counted.

        Queue<State> queue = new ArrayDeque<State>();
        queue.offer(new State(INITIAL_NUMBER));
        while (!queue.isEmpty()) {
            State thisState = queue.poll();
            if (thisState.isEndCondition()) break;

            if (thisState.isLose()) {
                continue;
            } else {
                System.out.println(thisState);
                countOfGoalToWin++;
            }

            // Note: Looping over an ArrayList. So get items in the order they were inserted.
            // Need to check 2x before 2x+1 for the isEndCondition;
            for (State nextState : thisState.getNextStates()) {
                queue.offer(nextState);
            }
        }

        return countOfGoalToWin;
    }


    private class State {
        Long x;

        public State(long x) {
            this.x = x;
        }

        @Override
        public String toString() {
            return "X = " + x;
        }

        public State[] getNextStates() {
            State[] nextStates = new State[2];

            nextStates[0] = new State(2 * x);
            nextStates[1] = new State(2 * x + 1);

            return nextStates;
        }

        public boolean isLose() {
            return TABLE.contains(x);
        }

        public boolean isEndCondition() {
            return (x > Math.pow(2, K) - 1);
        }
    }
}
