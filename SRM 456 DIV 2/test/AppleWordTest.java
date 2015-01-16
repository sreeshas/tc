import org.junit.Test;
import static org.junit.Assert.*;

public class AppleWordTest {
	
	@Test(timeout=2000)
	public void test0() {
		String word = "Apple";
		assertEquals(0, new AppleWord().minRep(word));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String word = "apPpPPlE";
		assertEquals(0, new AppleWord().minRep(word));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String word = "APLE";
		assertEquals(-1, new AppleWord().minRep(word));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String word = "TopCoder";
		assertEquals(7, new AppleWord().minRep(word));
	}
}
