import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class BunnyPuzzle {
	
	public int theCount(int[] bunnies) {
		int count = 0;
		for(int i=0; i< bunnies.length; i++) {
			for(int j=i+1; j<bunnies.length;j++){
				if(findbunnies(bunnies, i, j) == true) {
					count++;
				}
				if(findbunniesreverse(bunnies, j,i) == true) {
					count++;
				}

			}
		}

		return count;
	}

	public static boolean findbunnies(int[] bunnies, int a, int b) {
		int finalplace = 2*bunnies[b] -bunnies[a];
		int c = b+1;

		while( c < bunnies.length) {
			if(bunnies[c] <= finalplace){
				return false;
			}
			c++;
		}
		return true;
	}
	public static boolean findbunniesreverse(int[] bunnies, int a, int b) {
		int finalplace = 2*bunnies[b] - bunnies[a];
		int c = a-1;
		if (finalplace >= bunnies[a]) {
			return false;
		}
		while( c > -1) {
			if(bunnies[c] <= finalplace){
				return false;
			}
			c--;
		}
		return true;
	}

}
