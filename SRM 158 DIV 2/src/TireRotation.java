import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class TireRotation {
	
	public int getCycle(String initial, String current) {
		if( initial.equals(current)){
			return 1;

		}
		int count = 1;
		String r = initial;
		while(count < 4) {
			r = rotate(r);
			count++;
			if (r.equals(current)) {
				return count;
			}
		}
		if( !r.equals(current)) {
			return -1;
		} else {
			return count;
		}


	}
	public static String rotate(String initial) {
		char[] rotate = new char[initial.length()];
		rotate[2] = initial.charAt(0);
		rotate[3] = initial.charAt(1);
		rotate[0] = initial.charAt(3);
		rotate[1] = initial.charAt(2);
		return new String(rotate);

	}
}
