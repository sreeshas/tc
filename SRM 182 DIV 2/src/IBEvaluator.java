import java.util.*;


public class IBEvaluator {
	
	public int[] getSummary(int[] predictedGrades, int[] actualGrades) {
		int length = predictedGrades.length;
		int[] diff =  new int[length];
		int[] result = new int[7];
		if(length ==0 ){
			return result;
		}
		for(int i=0; i<length; i++) {
			diff[i] = Math.abs(predictedGrades[i] - actualGrades[i]);

		}
		Arrays.sort(diff);
		int i = 0;
		int count = 1;
		if(length == 1) {
			result[diff[0]] = 100;
			return result;
		}
		while(i < length -1) {
			count = 1;
			while( (i < length -1) && diff[i] == diff[i+1]) {
				count++;
				i++;
			}
			if ( i == length -1) {
				count++;
			}
			result[diff[i]] =  (count *100)/length;
			i++;
		}
		if (diff[i] == diff[i-1]) {
			count++;
			result[diff[i]] =  (count * 100)/length;
		} else {
			result[diff[i-1]] =  (count* 100)/length;
			result[diff[i]] =  ( 100)/length;
		}


		return result;

	}
}
