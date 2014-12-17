public class ForgetfulAddition {

    public int minNumber(String expression) {
        int exp = new Integer(expression);
        int result = Integer.MAX_VALUE;

        for (int i = 1; i < expression.length(); i++) {
            int a = exp / (int) (Math.pow(10, i));
            int b = exp % (int) (Math.pow(10, i));

            int thisResult = a + b;

            result = Math.min(result, thisResult);
        }

        return result;
    }
}
