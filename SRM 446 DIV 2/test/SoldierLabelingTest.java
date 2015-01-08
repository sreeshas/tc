import org.junit.Test;
import static org.junit.Assert.*;

public class SoldierLabelingTest {
	
	@Test(timeout=2000)
	public void test0() {
		int n = 100;
		int lowerBound = 2;
		int upperBound = 2;
		assertEquals(90, new SoldierLabeling().count(n, lowerBound, upperBound));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int n = 31;
		int lowerBound = 2;
		int upperBound = 3;
		assertEquals(22, new SoldierLabeling().count(n, lowerBound, upperBound));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int n = 1;
		int lowerBound = 2;
		int upperBound = 8;
		assertEquals(0, new SoldierLabeling().count(n, lowerBound, upperBound));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int n = 10000000;
		int lowerBound = 8;
		int upperBound = 8;
		assertEquals(1, new SoldierLabeling().count(n, lowerBound, upperBound));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int n = 2718317;
		int lowerBound = 3;
		int upperBound = 7;
		assertEquals(2718218, new SoldierLabeling().count(n, lowerBound, upperBound));
	}
}
