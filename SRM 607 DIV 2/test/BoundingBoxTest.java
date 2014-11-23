import org.junit.Test;
import static org.junit.Assert.*;

public class BoundingBoxTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] X = new int[] {0,1};
		int[] Y = new int[] {1,0};
		assertEquals(1, new BoundingBox().smallestArea(X, Y));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] X = new int[] {0,-2,-1};
		int[] Y = new int[] {-1,-1,-2};
		assertEquals(2, new BoundingBox().smallestArea(X, Y));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] X = new int[] {0,0,1,0,-1,2};
		int[] Y = new int[] {0,1,2,-2,0,-1};
		assertEquals(12, new BoundingBox().smallestArea(X, Y));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] X = new int[] {9,-88,-40,98,-55,41,-38};
		int[] Y = new int[] {-65,56,-67,7,-58,33,68};
		assertEquals(25110, new BoundingBox().smallestArea(X, Y));
	}
}
