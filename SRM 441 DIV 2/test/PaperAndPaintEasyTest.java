import org.junit.Test;
import static org.junit.Assert.*;

public class PaperAndPaintEasyTest {
	
	@Test(timeout=2000)
	public void test0() {
		int width = 5;
		int height = 6;
		int xfold = 2;
		int cnt = 2;
		int x1 = 1;
		int y1 = 1;
		int x2 = 3;
		int y2 = 2;
		assertEquals(21L, new PaperAndPaintEasy().computeArea(width, height, xfold, cnt, x1, y1, x2, y2));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int width = 3;
		int height = 13;
		int xfold = 1;
		int cnt = 0;
		int x1 = 1;
		int y1 = 8;
		int x2 = 2;
		int y2 = 12;
		assertEquals(35L, new PaperAndPaintEasy().computeArea(width, height, xfold, cnt, x1, y1, x2, y2));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int width = 12;
		int height = 12;
		int xfold = 7;
		int cnt = 3;
		int x1 = 3;
		int y1 = 1;
		int x2 = 6;
		int y2 = 2;
		assertEquals(124L, new PaperAndPaintEasy().computeArea(width, height, xfold, cnt, x1, y1, x2, y2));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int width = 4;
		int height = 5;
		int xfold = 4;
		int cnt = 0;
		int x1 = 0;
		int y1 = 0;
		int x2 = 1;
		int y2 = 1;
		assertEquals(19L, new PaperAndPaintEasy().computeArea(width, height, xfold, cnt, x1, y1, x2, y2));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int width = 4;
		int height = 8;
		int xfold = 4;
		int cnt = 3;
		int x1 = 0;
		int y1 = 1;
		int x2 = 2;
		int y2 = 2;
		assertEquals(24L, new PaperAndPaintEasy().computeArea(width, height, xfold, cnt, x1, y1, x2, y2));
	}
	
	@Test(timeout=2000)
	public void test5() {
		int width = 4;
		int height = 8;
		int xfold = 3;
		int cnt = 0;
		int x1 = 1;
		int y1 = 1;
		int x2 = 3;
		int y2 = 2;
		assertEquals(30L, new PaperAndPaintEasy().computeArea(width, height, xfold, cnt, x1, y1, x2, y2));
	}
}
