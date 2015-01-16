import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class MinimalDifference {
	
	public int findNumber(int A, int B, int C) {
		int sum = findSum(C);
		int min = Integer.MAX_VALUE;
		int minx = 0;
		for(int i=A; i<=B; i++){
			int fsum = findSum(i);
			if( sum == fsum){
				return i;
			}
			else if( abs(sum -fsum) < min) {
				min = abs(sum -fsum);
				minx = i;
			}
		}
		return minx;

	}

	public static int findSum(int x) {
		int sum= 0;
		int temp = x;
		while(temp !=0){
			sum += temp % 10;
			temp =temp/ 10;
		}
		return sum;

	}
}
