import org.junit.Test;
import static org.junit.Assert.*;

public class MinimalDifferenceTest {
	
	@Test(timeout=2000)
	public void test0() {
		int A = 1;
		int B = 9;
		int C = 10;
		assertEquals(1, new MinimalDifference().findNumber(A, B, C));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int A = 11;
		int B = 20;
		int C = 20;
		assertEquals(11, new MinimalDifference().findNumber(A, B, C));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int A = 1;
		int B = 1;
		int C = 999;
		assertEquals(1, new MinimalDifference().findNumber(A, B, C));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int A = 100;
		int B = 1000;
		int C = 99;
		assertEquals(189, new MinimalDifference().findNumber(A, B, C));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int A = 1987;
		int B = 9123;
		int C = 1;
		assertEquals(2000, new MinimalDifference().findNumber(A, B, C));
	}
}
