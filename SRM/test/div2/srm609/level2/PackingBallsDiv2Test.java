package div2.srm609.level2;

import div2.srm609.level2.PackingBallsDiv2;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by hideo on 2/19/14.
 */
public class PackingBallsDiv2Test {
    @Test
    public void example0() throws Exception {
        PackingBallsDiv2 a = new PackingBallsDiv2();
        int pack = a.minPacks(4, 2, 4);
        Assert.assertEquals(4, pack);

    }

    @Test
    public void example1() throws Exception {
        PackingBallsDiv2 a = new PackingBallsDiv2();
        int pack = a.minPacks(1, 7, 1);
        Assert.assertEquals(3, pack);

    }

    @Test
    public void example2() throws Exception {
        PackingBallsDiv2 a = new PackingBallsDiv2();
        int pack = a.minPacks(2, 3, 5);
        Assert.assertEquals(4, pack);

    }

    @Test
    public void example3() throws Exception {
        PackingBallsDiv2 a = new PackingBallsDiv2();
        int pack = a.minPacks(78, 53, 64);
        Assert.assertEquals(66, pack);

    }

    @Test
    public void example4() throws Exception {
        PackingBallsDiv2 a = new PackingBallsDiv2();
        int pack = a.minPacks(100, 100, 100);
        Assert.assertEquals(100, pack);

    }
}
