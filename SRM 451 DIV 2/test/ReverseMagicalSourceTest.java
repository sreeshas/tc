import org.junit.Test;
import static org.junit.Assert.*;

public class ReverseMagicalSourceTest {
	
	@Test(timeout=2000)
	public void test0() {
		int source = 19;
		int A = 200;
		assertEquals(209, new ReverseMagicalSource().find(source, A));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int source = 19;
		int A = 18;
		assertEquals(19, new ReverseMagicalSource().find(source, A));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int source = 333;
		int A = 36963;
		assertEquals(369963, new ReverseMagicalSource().find(source, A));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int source = 1234;
		int A = 1000000;
		assertEquals(1370974, new ReverseMagicalSource().find(source, A));
	}
}
