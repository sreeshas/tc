import org.junit.Test;
import static org.junit.Assert.*;

public class SimpleWordGameTest {
	
	@Test(timeout=2000)
	public void test0() {
		String[] player = new String[] { "apple", "orange", "strawberry" };
		String[] dictionary = new String[] { "strawberry", "orange", "grapefruit", "watermelon" };
		assertEquals(136, new SimpleWordGame().points(player, dictionary));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String[] player = new String[] { "apple" };
		String[] dictionary = new String[] { "strawberry", "orange", "grapefruit", "watermelon" };
		assertEquals(0, new SimpleWordGame().points(player, dictionary));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String[] player = new String[] { "orange", "orange" };
		String[] dictionary = new String[] { "strawberry", "orange", "grapefruit", "watermelon" };
		assertEquals(36, new SimpleWordGame().points(player, dictionary));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String[] player = new String[] { "lidi", "o", "lidi", "gnbewjzb", "kten",
  "ebnelff", "gptsvqx", "rkauxq", "rkauxq", "kfkcdn"};
		String[] dictionary = new String[] { "nava", "wk", "kfkcdn", "lidi", "gptsvqx",
  "ebnelff", "hgsppdezet", "ulf", "rkauxq", "wcicx"};
		assertEquals(186, new SimpleWordGame().points(player, dictionary));
	}
}
