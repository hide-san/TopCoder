import org.junit.Test;
import static org.junit.Assert.*;

public class ChristmasTreeDecorationDiv2Test {
	
	@Test(timeout=2000)
	public void test0() {
		int[] col = new int[] {1,2,3,3};
		int[] x = new int[] {1,2,3};
		int[] y = new int[] {2,3,4};
		assertEquals(2, new ChristmasTreeDecorationDiv2().solve(col, x, y));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] col = new int[] {1,3,5};
		int[] x = new int[] {1,3};
		int[] y = new int[] {2,2};
		assertEquals(2, new ChristmasTreeDecorationDiv2().solve(col, x, y));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] col = new int[] {1,1,3,3};
		int[] x = new int[] {1,3,2};
		int[] y = new int[] {2,1,4};
		assertEquals(2, new ChristmasTreeDecorationDiv2().solve(col, x, y));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] col = new int[] {5,5,5,5};
		int[] x = new int[] {1,2,3};
		int[] y = new int[] {2,3,4};
		assertEquals(0, new ChristmasTreeDecorationDiv2().solve(col, x, y));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] col = new int[] {9,1,1};
		int[] x = new int[] {3,2};
		int[] y = new int[] {2,1};
		assertEquals(1, new ChristmasTreeDecorationDiv2().solve(col, x, y));
	}
}
