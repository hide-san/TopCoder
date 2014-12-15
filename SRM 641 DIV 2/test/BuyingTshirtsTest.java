import org.junit.Test;
import static org.junit.Assert.*;

public class BuyingTshirtsTest {
	
	@Test(timeout=2000)
	public void test0() {
		int T = 5;
		int[] Q = new int[] {1,2,3,4,5};
		int[] P = new int[] {5,4,3,2,1};
		assertEquals(2, new BuyingTshirts().meet(T, Q, P));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int T = 10;
		int[] Q = new int[] {10,10,10};
		int[] P = new int[] {10,10,10};
		assertEquals(3, new BuyingTshirts().meet(T, Q, P));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int T = 2;
		int[] Q = new int[] {1,2,1,2,1,2,1,2};
		int[] P = new int[] {1,1,1,1,2,2,2,2};
		assertEquals(5, new BuyingTshirts().meet(T, Q, P));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int T = 100;
		int[] Q = new int[] {1,2,3};
		int[] P = new int[] {4,5,6};
		assertEquals(0, new BuyingTshirts().meet(T, Q, P));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int T = 10;
		int[] Q = new int[] {10,1,10,1};
		int[] P = new int[] {1,10,1,10};
		assertEquals(0, new BuyingTshirts().meet(T, Q, P));
	}
}
