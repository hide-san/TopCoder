package srm609.division2.level2;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by hideo on 2/19/14.
 */
public class PackingBallsDiv2Test {
    @Test
    public void example0() throws Exception {
        PackingBallsDiv2 a = new PackingBallsDiv2();
        int pack = a.minPacks(4,2,4);
        Assert.assertEquals(pack, 4);

    }
    @Test
    public void example1() throws Exception {
        PackingBallsDiv2 a = new PackingBallsDiv2();
        int pack = a.minPacks(1,7,1);
        Assert.assertEquals(pack, 3);

    }
    @Test
    public void example2() throws Exception {
        PackingBallsDiv2 a = new PackingBallsDiv2();
        int pack = a.minPacks(2,3,5);
        Assert.assertEquals(pack, 4 );

    }
    @Test
    public void example3() throws Exception {
        PackingBallsDiv2 a = new PackingBallsDiv2();
        int pack = a.minPacks(78,53,64);
        Assert.assertEquals(pack, 66);

    }
    @Test
    public void example4() throws Exception {
        PackingBallsDiv2 a = new PackingBallsDiv2();
        int pack = a.minPacks(100,100,100);
        Assert.assertEquals(pack, 100);

    }
}
