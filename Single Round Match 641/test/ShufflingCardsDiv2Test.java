import org.junit.Test;
import static org.junit.Assert.*;

public class ShufflingCardsDiv2Test {
	
	@Test(timeout=2000)
	public void test0() {
		int[] permutation = new int[] {1,2,3,4};
		assertEquals("Possible", new ShufflingCardsDiv2().shuffle(permutation));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] permutation = new int[] {4,3,2,1};
		assertEquals("Possible", new ShufflingCardsDiv2().shuffle(permutation));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] permutation = new int[] {1,3,2,4};
		assertEquals("Impossible", new ShufflingCardsDiv2().shuffle(permutation));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] permutation = new int[] {1,4,2,5,3,6};
		assertEquals("Impossible", new ShufflingCardsDiv2().shuffle(permutation));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] permutation = new int[] {8,5,4,9,1,7,6,10,3,2};
		assertEquals("Possible", new ShufflingCardsDiv2().shuffle(permutation));
	}
}
