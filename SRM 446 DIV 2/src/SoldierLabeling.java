import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class SoldierLabeling {
	
	public int count(int n, int lowerBound, int upperBound) {

		int[] bound = {0, 1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000};

		int lb = bound[lowerBound];
		int ub = 0;
		if(upperBound == lowerBound) {
			ub = bound[upperBound+1] - 1;
		} else {
			ub = bound[upperBound+1];
		}

		int i = lb;
		int count = 0;
		while(i <= n && i <= ub) {
			count++;
			i++;
		}
		return count;
	}
}
