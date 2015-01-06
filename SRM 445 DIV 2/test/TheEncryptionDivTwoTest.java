import org.junit.Test;
import static org.junit.Assert.*;

public class TheEncryptionDivTwoTest {
	
	@Test(timeout=2000)
	public void test0() {
		String message = "hello";
		assertEquals("abccd", new TheEncryptionDivTwo().encrypt(message));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String message = "abcd";
		assertEquals("abcd", new TheEncryptionDivTwo().encrypt(message));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String message = "topcoder";
		assertEquals("abcdbefg", new TheEncryptionDivTwo().encrypt(message));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String message = "encryption";
		assertEquals("abcdefghib", new TheEncryptionDivTwo().encrypt(message));
	}
}
