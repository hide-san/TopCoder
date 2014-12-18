import java.util.*;

public class LightSwitchingPuzzle {
    private final char ON = 'Y';
    private final char OFF = 'N';
    private final int NO_ANSWER = -1;

    public int minFlips(String state) {
        State initialState = new State();
        initialState.state = state.toCharArray();
        initialState.depth = 0;

        Queue<State> queue = new ArrayDeque<State>();
        queue.offer(initialState);

        while (!queue.isEmpty()) {
            State thisState = queue.poll();
            System.out.println("CurrentState" + Arrays.toString(thisState.state));
            if (!new String(thisState.state).contains(String.valueOf(ON))) {
                return thisState.depth;
            }
            for (State nextState : thisState.getChildrenBfs()) {
                if (nextState != null) queue.offer(nextState);
            }
        }

        return NO_ANSWER;
    }

    static List<String> statePatterns = new ArrayList<String>();

    public class State {
        public char[] state;
        public int depth;

        public State[] getChildrenBfs() {
            final char[] currentState = state;

            State[] childStates = new State[currentState.length - 1];
            for (int i = 1; i < childStates.length + 1; i++) {
                childStates[i - 1] = toggleSwitch(i);
            }


            return childStates;
        }

        public State toggleSwitch(int switchId) {
            State nextState = new State();
            nextState.state = new String(this.state).toCharArray();
            nextState.depth = this.depth + 1;

            for (int i = 0; i < nextState.state.length; i++) {
                if ((i + 1) % switchId == 0) {
                    if (nextState.state[i] == ON) {
                        nextState.state[i] = OFF;
                    } else {
                        nextState.state[i] = ON;
                    }
                }
            }

            if (statePatterns.contains(new String(nextState.state))) {
                return null;
            }

            statePatterns.add(new String(nextState.state));
            return nextState;
        }

    }
}
