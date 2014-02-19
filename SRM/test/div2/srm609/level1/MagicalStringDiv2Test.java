package div2.srm609.level1;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hideo on 2/18/14.
 */
public class MagicalStringDiv2Test {
    @Test
    public void example0() throws Exception {
        div2.srm609.level1.MagicalStringDiv2 a = new MagicalStringDiv2();
        int move = a.minimalMoves(">><<><");
        Assert.assertEquals(2, move);

    }

    @Test
    public void example1() throws Exception {
        MagicalStringDiv2 a = new MagicalStringDiv2();
        int move = a.minimalMoves(">>>><<<<");
        Assert.assertEquals(0, move);

    }

    @Test
    public void example2() throws Exception {
        MagicalStringDiv2 a = new MagicalStringDiv2();
        int move = a.minimalMoves("<<>>");
        Assert.assertEquals(4, move);

    }

    @Test
    public void example3() throws Exception {
        MagicalStringDiv2 a = new MagicalStringDiv2();
        int move = a.minimalMoves("<><<<>>>>><<>>>>><>><<<>><><><><<><<<<<><<>>><><><");
        Assert.assertEquals(20, move);

    }
}
