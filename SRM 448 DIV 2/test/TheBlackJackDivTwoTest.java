import org.junit.Test;
import static org.junit.Assert.*;

public class TheBlackJackDivTwoTest {
	
	@Test(timeout=2000)
	public void test0() {
		String[] cards = new String[] {"4S", "7D"};
		assertEquals(11, new TheBlackJackDivTwo().score(cards));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String[] cards = new String[] {"KS", "TS", "QC"};
		assertEquals(30, new TheBlackJackDivTwo().score(cards));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String[] cards = new String[] {"AS", "AD", "AH", "AC"};
		assertEquals(44, new TheBlackJackDivTwo().score(cards));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String[] cards = new String[] {"3S", "KC", "AS", "7C", "TC", "9C", "4H", "4S", "2S"};
		assertEquals(60, new TheBlackJackDivTwo().score(cards));
	}
}
