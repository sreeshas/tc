import org.junit.Test;
import static org.junit.Assert.*;

public class PeriodicJumpingTest {
	
	@Test(timeout=2000)
	public void test0() {
		int x = 15;
		int[] jumpLengths = new int[] {1,2,3,4,5,6,7,8,9,10};
		assertEquals(5, new PeriodicJumping().minimalTime(x, jumpLengths));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int x = 5;
		int[] jumpLengths = new int[] {5};
		assertEquals(1, new PeriodicJumping().minimalTime(x, jumpLengths));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int x = 1;
		int[] jumpLengths = new int[] {10};
		assertEquals(2, new PeriodicJumping().minimalTime(x, jumpLengths));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int x = -10;
		int[] jumpLengths = new int[] {2,3,4,500,6,7,8};
		assertEquals(11, new PeriodicJumping().minimalTime(x, jumpLengths));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int x = -1000000000;
		int[] jumpLengths = new int[] {1};
		assertEquals(1000000000, new PeriodicJumping().minimalTime(x, jumpLengths));
	}
	
	@Test(timeout=2000)
	public void test5() {
		int x = 0;
		int[] jumpLengths = new int[] {19911120};
		assertEquals(0, new PeriodicJumping().minimalTime(x, jumpLengths));
	}
}
