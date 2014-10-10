package div2.srm478.level1;

/**
 * Created by hideo on 14/09/28.
 */
public class KiwiJuiceEasy {
    public int[] thePouring(int[] capacities, int[] bottles, int[] fromId, int[] toId) {
        for (int i = 0; i < bottles.length; i++) {
            operation(capacities, bottles, fromId[i], toId[i]);
        }

        return bottles;
    }

    private void operation(int[] capacity, int[] bottle, int fromId, int toId) {
        System.out.println(capacity.toString());
        System.out.println(bottle.toString());
        System.out.println(fromId);
        System.out.println(toId);
        int sum = bottle[fromId] + bottle[toId];
        bottle[fromId] = 0;
        bottle[toId] = 0;

        if (sum <= capacity[toId]) {
            bottle[toId] = sum;
        } else {
            bottle[toId] = capacity[toId];
            bottle[fromId] = sum - bottle[toId];
        }
    }
}
