public class BuyingTshirts {

    public int meet(int T, int[] Q, int[] P) {
        int moneyQ = 0;
        int moneyP = 0;
        int countOfShoppingTogether = 0;

        for (int day = 0; day < Q.length; day++) {
            moneyQ += Q[day];
            moneyP += P[day];

            if (moneyQ >= T && moneyP >= T) countOfShoppingTogether++;

            while (moneyQ >= T) {
                moneyQ -= T;
            }

            while (moneyP >= T) {
                moneyP -= T;
            }
        }

        return countOfShoppingTogether;
    }
}
