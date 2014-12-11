import org.junit.Test;
import static org.junit.Assert.*;

public class TrianglesContainOriginEasyTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] x = new int[] {-1,-1,1};
		int[] y = new int[] {1,-1,0};
		assertEquals(1, new TrianglesContainOriginEasy().count(x, y));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] x = new int[] {-1,-1,1,2};
		int[] y = new int[] {1,-1,2,-1};
		assertEquals(2, new TrianglesContainOriginEasy().count(x, y));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] x = new int[] {-1,-2,3,3,2,1};
		int[] y = new int[] {-2,-1,1,2,3,3};
		assertEquals(8, new TrianglesContainOriginEasy().count(x, y));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] x = new int[] {1,5,10,5,-5,7,-9,-6,-3,0,8,8,1,-4,7,-3,10,9,-6};
		int[] y = new int[] {5,-6,-3,4,-2,-8,-7,2,7,4,2,0,-4,-8,7,5,-5,-2,-9};
		assertEquals(256, new TrianglesContainOriginEasy().count(x, y));
	}
}
