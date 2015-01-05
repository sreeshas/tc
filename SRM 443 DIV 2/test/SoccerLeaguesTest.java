import org.junit.Test;
import static org.junit.Assert.*;

public class SoccerLeaguesTest {
	
	@Test(timeout=2000)
	public void test0() {
		String[] matches = new String[] {"-WW",
 "W-W",
 "WW-"};
		assertArrayEquals(new int[] {6, 6, 6 }, new SoccerLeagues().points(matches));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String[] matches = new String[] {"-DD",
 "L-L",
 "WD-"};
		assertArrayEquals(new int[] {5, 2, 8 }, new SoccerLeagues().points(matches));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String[] matches = new String[] {"-DWWD",
 "L-WLL",
 "DD-WD",
 "DDL-L",
 "DDLL-"};
		assertArrayEquals(new int[] {14, 7, 12, 8, 10 }, new SoccerLeagues().points(matches));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String[] matches = new String[] {"-LWWLWDLDWWWWWWDDWDW",
 "D-WWLDDWDWDLWDDWLWDD",
 "LL-DLDWDLDLDWWWLWDDW",
 "LDD-LLLDLWLWWWWDWDWL",
 "LWWW-DWDLWDWDWWWDWDW",
 "DLLWD-WWLLDDDLWWDWWW",
 "WWLWDL-LLDWWWWWDWWLW",
 "LLLLLDW-LDLWDDLLLDWL",
 "DWWWWDDD-DWWWWDWWWDW",
 "WWWWLLLWL-LWWWWWLWWW",
 "DWWWWWWWLW-WDWWWWWWW",
 "DDDLLLDWWWL-DDWDWLDD",
 "LWLWLDLLLDLW-DDDWWDD",
 "LLWWLWDDLWLWL-WWWDLL",
 "WWWWLLDDDWLWDD-WWWLW",
 "DLDLLLWWLLLWWLW-DWLL",
 "DLWWWLDLWWDWWDWL-WWD",
 "LLDDLLWLLWLWLDLWW-WW",
 "LLWLLLWWLWLWWDWWLD-W",
 "LLWDLWDWDWLLWWDDWWL-"};
		assertArrayEquals(new int[] {72, 62, 41, 41, 83, 63, 53, 35, 86, 50, 90, 32, 34, 41, 45, 36, 51, 32, 51, 45 }, new SoccerLeagues().points(matches));
	}
}
