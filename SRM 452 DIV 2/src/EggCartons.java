import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class EggCartons {

	public int minCartons(int n) {
		if(n % 2 !=0 || n < 6) {
			return -1;
		}
		else if(n%8 ==0){
			return n/8;
		} else if(n%6 ==0) {
			return n/6;
		} else {
			int count = solve(n);
			return count;
		}
	}

	public static int solve(int n) {
		int count = 0;
		int i=1;
		int j=1;
		for(;(6*i)<n;++i){
			j=1;
			while((6*i) + (8*j)<n){
				++j;
			}
			if((6*i)+(8*j) == n) {
				count = i+j;
				break;
			}

		}
		for(i=1;8*i<n;i++){
			j=1;
			while((8*i) +(6*j) <n) {
				++j;
			}
			if((6*j)+(8*i) == n ){
				if(count > (i+j)){
					count = i+j;
				}
			}
		}
		return count == 0?-1:count;
	}
}
