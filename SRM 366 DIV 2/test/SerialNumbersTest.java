import org.junit.Test;
import static org.junit.Assert.*;

public class SerialNumbersTest {
	
	@Test(timeout=2000)
	public void test0() {
		String[] serialNumbers = new String[] {"ABCD","145C","A","A910","Z321"};
		assertArrayEquals(new String[] {"A", "ABCD", "Z321", "145C", "A910" }, new SerialNumbers().sortSerials(serialNumbers));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String[] serialNumbers = new String[] {"Z19", "Z20"};
		assertArrayEquals(new String[] {"Z20", "Z19" }, new SerialNumbers().sortSerials(serialNumbers));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String[] serialNumbers = new String[] {"34H2BJS6N","PIM12MD7RCOLWW09","PYF1J14TF","FIPJOTEA5"};
		assertArrayEquals(new String[] {"FIPJOTEA5", "PYF1J14TF", "34H2BJS6N", "PIM12MD7RCOLWW09" }, new SerialNumbers().sortSerials(serialNumbers));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String[] serialNumbers = new String[] {"ABCDE", "BCDEF", "ABCDA", "BAAAA", "ACAAA"};
		assertArrayEquals(new String[] {"ABCDA", "ABCDE", "ACAAA", "BAAAA", "BCDEF" }, new SerialNumbers().sortSerials(serialNumbers));
	}
}
