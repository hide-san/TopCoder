import org.junit.Test;
import static org.junit.Assert.*;

public class ForgetfulAdditionTest {
	
	@Test(timeout=2000)
	public void test0() {
		String expression = "22";
		assertEquals(4, new ForgetfulAddition().minNumber(expression));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String expression = "123";
		assertEquals(15, new ForgetfulAddition().minNumber(expression));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String expression = "1289";
		assertEquals(101, new ForgetfulAddition().minNumber(expression));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String expression = "31415926";
		assertEquals(9067, new ForgetfulAddition().minNumber(expression));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String expression = "98765";
		assertEquals(863, new ForgetfulAddition().minNumber(expression));
	}
}
