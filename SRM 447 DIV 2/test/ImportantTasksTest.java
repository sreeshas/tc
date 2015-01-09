import org.junit.Test;
import static org.junit.Assert.*;

public class ImportantTasksTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] complexity = new int[] {1,2,3};
		int[] computers = new int[] {2,2,2};
		assertEquals(2, new ImportantTasks().maximalCost(complexity, computers));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] complexity = new int[] {1,2,3};
		int[] computers = new int[] {3};
		assertEquals(1, new ImportantTasks().maximalCost(complexity, computers));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] complexity = new int[] {3,5,1,7};
		int[] computers = new int[] {9,4,1,1,1};
		assertEquals(3, new ImportantTasks().maximalCost(complexity, computers));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] complexity = new int[] {5,2,7,8,6,4,2,10,2,3};
		int[] computers = new int[] {4,1,3,6,2,10,11,1,1,3,4,2};
		assertEquals(8, new ImportantTasks().maximalCost(complexity, computers));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] complexity = new int[] {100};
		int[] computers = new int[] {100,100};
		assertEquals(1, new ImportantTasks().maximalCost(complexity, computers));
	}
}
