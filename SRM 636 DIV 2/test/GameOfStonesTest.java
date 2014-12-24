import org.junit.Test;
import static org.junit.Assert.*;

public class GameOfStonesTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] stones = new int[] {7, 15, 9, 5};
		assertEquals(3, new GameOfStones().count(stones));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] stones = new int[] {10, 16};
		assertEquals(-1, new GameOfStones().count(stones));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] stones = new int[] {2, 8, 4};
		assertEquals(-1, new GameOfStones().count(stones));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] stones = new int[] {17};
		assertEquals(0, new GameOfStones().count(stones));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] stones = new int[] {10, 15, 20, 12, 1, 20};
		assertEquals(-1, new GameOfStones().count(stones));
	}
}
