import org.junit.Test;
import static org.junit.Assert.*;

public class FourBlocksEasyTest {
	
	@Test(timeout=2000)
	public void test0() {
		String[] grid = new String[] {".....1..1..",
 "..1.....1.."};
		assertEquals(70, new FourBlocksEasy().maxScore(grid));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String[] grid = new String[] {"....................",
 "...................."}
;
		assertEquals(160, new FourBlocksEasy().maxScore(grid));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String[] grid = new String[] {".1.........11.........",
 "..1.1......11........."}
;
		assertEquals(128, new FourBlocksEasy().maxScore(grid));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String[] grid = new String[] {"......1.....1...1.",
 ".................."};
		assertEquals(108, new FourBlocksEasy().maxScore(grid));
	}
}
