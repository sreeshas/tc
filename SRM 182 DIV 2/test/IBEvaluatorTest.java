import org.junit.Test;
import static org.junit.Assert.*;

public class IBEvaluatorTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] predictedGrades = new int[] {1,5,7,3};
		int[] actualGrades = new int[] {3,5,4,5};
		assertArrayEquals(new int[] { 25,  0,  50,  25,  0,  0,  0 }, new IBEvaluator().getSummary(predictedGrades, actualGrades));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] predictedGrades = new int[] {1,1,1};
		int[] actualGrades = new int[] {5,6,7};
		assertArrayEquals(new int[] { 0,  0,  0,  0,  33,  33,  33 }, new IBEvaluator().getSummary(predictedGrades, actualGrades));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] predictedGrades = new int[] {3};
		int[] actualGrades = new int[] {3};
		assertArrayEquals(new int[] { 100,  0,  0,  0,  0,  0,  0 }, new IBEvaluator().getSummary(predictedGrades, actualGrades));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] predictedGrades = new int[] {1,5,3,5,6,4,2,5,7,6,5,2,3,4,1,4,6,5,4,7,6,6,1};
		int[] actualGrades = new int[] {5,1,3,2,6,4,1,7,5,2,7,4,2,6,5,7,3,1,4,6,3,1,7};
		assertArrayEquals(new int[] { 17,  13,  21,  17,  21,  4,  4 }, new IBEvaluator().getSummary(predictedGrades, actualGrades));
	}
}
