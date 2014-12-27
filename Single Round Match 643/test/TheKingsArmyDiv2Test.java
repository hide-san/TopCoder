import org.junit.Test;
import static org.junit.Assert.*;

public class TheKingsArmyDiv2Test {
	
	@Test(timeout=2000)
	public void test0() {
		String[] state = new String[] {"SSSSS",
 "SSHHS",
 "SSSSS"};
		assertEquals(0, new TheKingsArmyDiv2().getNumber(state));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String[] state = new String[] {"SSSSS",
 "SSHSH",
 "HSSSS"};
		assertEquals(1, new TheKingsArmyDiv2().getNumber(state));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String[] state = new String[] {"SSS",
 "SSS",
 "SSS"};
		assertEquals(2, new TheKingsArmyDiv2().getNumber(state));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String[] state = new String[] {"HSHSHSH", "SSSHSSS", "SSHSHSS", "SHSHSHS"};
		assertEquals(1, new TheKingsArmyDiv2().getNumber(state));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String[] state = new String[] {"HHSH", "HHHS", "HSSS", "SHSH", "HHHS", "HSHH", "SSSH"};
		assertEquals(0, new TheKingsArmyDiv2().getNumber(state));
	}
}
