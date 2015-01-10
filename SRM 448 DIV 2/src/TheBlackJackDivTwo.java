import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class TheBlackJackDivTwo {
	
	public int score(String[] cards) {
		int count = 0;

		for(String s: cards) {
			if(Character.isDigit(s.charAt(0))) {
				count = count + (int) Character.getNumericValue(s.charAt(0));
			} else {
				if(s.charAt(0) != 'A') {
					count += 10;
				} else {
					count += 11;
				}
			}
		}
		return count;
	}
}
