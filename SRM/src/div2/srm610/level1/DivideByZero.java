package div2.srm610.level1;
import java.util.*;

/**
 * Created by hideo on 2/26/14.
 */
public class DivideByZero {
    public int CountNumbers(int[] numbers) {
        List numberList = new ArrayList();
        for (int i = 0; i < numbers.length; i++){
            numberList.add(numbers[i]);
        }

        int A, B, C;

        for (int i = 0; i < numberList.size(); i++) {
            A = (int) numberList.get(i);
            for (int j = 0; j < numberList.size(); j++) {
                B = (int) numberList.get(j);
                System.out.println("A:" + A + "\tB:" + B);

                if (A <= B) continue;
                C = A / B;
                System.out.println("A:" + A + "\tB:" + B + "\tC:" + C);

                if (! numberList.contains(C) ){
                    System.out.println("ADD:" + C);
                    numberList.add(C);
                    i = -1;
                    j = -1;
                }
            }
        }
        return numberList.size();
    }
}
