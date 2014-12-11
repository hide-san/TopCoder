public class BuyingTshirts {

    public int meet(int T, int[] Q, int[] P) {
        int moneyQ = 0;
        int moneyP = 0;
        int countOfShoppingTogether = 0;

        for (int day = 0; day < Q.length; day++) {
            boolean visitShopQ = false;
            boolean visitShotP = false;
            moneyQ += Q[day];
            moneyP += P[day];

            while (moneyQ >= T) {
                moneyQ -= T;
                visitShopQ = true;
            }

            while (moneyP >= T) {
                moneyP -= T;
                visitShotP = true;
            }

            if (visitShotP && visitShopQ) countOfShoppingTogether++;
        }

        return countOfShoppingTogether;
    }
}
