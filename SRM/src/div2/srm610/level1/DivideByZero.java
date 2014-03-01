package div2.srm610.level1;
import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

/**
 * Created by hideo on 2/26/14.
 */
public class DivideByZero {
    public int CountNumbers(int[] numbers) {
        Vector<Integer> numberVector = new Vector<Integer>();
        for (int i = 0; i < numbers.length; i++){
            numberVector.add(numbers[i]);
        }

        int count = numbers.length;
        int A, B, C;

        for (int i = 0; i < numberVector.size(); i++) {
            A = numberVector.get(i);
            for (int j = 0; j < numberVector.size(); j++) {
                B = numberVector.get(j);
                System.out.println("A:" + A + "\tB:" + B);

                if (A <= B) continue;
                C = A / B;
                System.out.println("A:" + A + "\tB:" + B + "\tC:" + C);

                if (! numberVector.contains(C) ){
                    System.out.println("ADD:" + C);
                    count++;
                    numberVector.add(C);
                }
            }
        }
        return count;
    }
}
