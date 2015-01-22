import org.junit.Test;
import static org.junit.Assert.*;

public class BunnyPuzzleTest {
	
//	@Test(timeout=2000)
//	public void test0() {
//		int[] bunnies = new int[] {5, 8};
//		assertEquals(2, new BunnyPuzzle().theCount(bunnies));
//	}
//
//	@Test(timeout=2000)
//	public void test1() {
//		int[] bunnies = new int[] {-1, 0, 1};
//		assertEquals(2, new BunnyPuzzle().theCount(bunnies));
//	}
//
//	@Test(timeout=2000)
//	public void test2() {
//		int[] bunnies = new int[] {0, 1, 3};
//		assertEquals(3, new BunnyPuzzle().theCount(bunnies));
//	}
//
//	@Test(timeout=2000)
//	public void test3() {
//		int[] bunnies = new int[] {-677, -45, -2, 3, 8, 29, 384, 867};
//		assertEquals(7, new BunnyPuzzle().theCount(bunnies));
//	}
//
	@Test
	public void test4() {
		int[] bunnies = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		assertEquals(2, new BunnyPuzzle().theCount(bunnies));
	}
}
