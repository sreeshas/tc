import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class TheTournamentDivTwo {
	
	public int find(int[] points) {
		int result = 0;
		for( int point :points){
			result += point;
		}
		if(result ==0){
			return 0;
		}
		if(result %2 ==0){
			return result/2;
		}
		return -1;
	}
}
