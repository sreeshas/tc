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

		while( i >= 0 && j>=0) {
			if( complexity[i] <= computers[j] ) {
				result++;
				i--;
				j--;
			} else {
				i--;
			}
		}
		return result;
	}

}
