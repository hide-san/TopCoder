package div2.srm480.level1;

/**
 * Created by hideo on 14/09/28.
 */
public class Cryptography {
    public long encrypt(int[] numbers) {
        long maxProduct = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += 1;
            maxProduct = Math.max(maxProduct, calculateProduct(numbers));
            numbers[i] -= 1;
        }

        return maxProduct;
    }

    private long calculateProduct(int[] numbers) {
        long product = 1;
        for (int number : numbers) {
            product = product * number;
        }
        return product;
    }
}
