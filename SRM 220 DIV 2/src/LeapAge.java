import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class LeapAge {
	
	public int getAge(int year, int born) {
		int count = 0;

		born++;
		while(born <=year) {
			if((born % 4 == 0)) {
				if((born %100 ==0 && born%400 !=0)) {

				} else {
					count++;
				}

			}

			born++;
		}
		return count;
	}
}
