import org.junit.Test;
import static org.junit.Assert.*;

public class SortishDiv2Test {
	
	@Test(timeout=2000)
	public void test0() {
		int sortedness = 5;
		int[] seq = new int[] {4, 0, 0, 2, 0};
		assertEquals(2, new SortishDiv2().ways(sortedness, seq));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int sortedness = 4;
		int[] seq = new int[] {0, 0, 0, 0};
		assertEquals(5, new SortishDiv2().ways(sortedness, seq));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int sortedness = 2;
		int[] seq = new int[] {1, 3, 2};
		assertEquals(1, new SortishDiv2().ways(sortedness, seq));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int sortedness = 2;
		int[] seq = new int[] {1, 2, 0, 5, 0, 0};
		assertEquals(0, new SortishDiv2().ways(sortedness, seq));
	}
}
