import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ImportantTasks {
	
	public int maximalCost(int[] complexity, int[] computers) {
		 Arrays.sort(complexity);
		 Arrays.sort(computers);
		int complexLength =  complexity.length;
		int compLength = computers.length;
		int i = complexLength -1;
		int j = compLength - 1;
		int result = 0;
		boolean decremented = false;
		while( i >= 0 && j>=0) {
			decremented = false;
			if( complexity[i] <= computers[j] ) {
				result++;
				i--;
				j--;
			}
			for(int k = j; k>=0; k--) {
				if(i>=0 && complexity[i]<=computers[k]) {
					result++;
					i--;
					j=k-1;
					decremented = true;
					break;
				}
			}
			if(!decremented) {
				i--;
			}

		}



		return result;
	}
}
