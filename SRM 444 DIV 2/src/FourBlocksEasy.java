import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class FourBlocksEasy {
	
	public int maxScore(String[] grid) {
		int length = grid[0].length();
		int[][] result = new int[2][length];

		int j=0;
		while( j < length) {
			if ( (j+1 < length) && grid[0].charAt(j) == '.' && grid[0].charAt(j + 1) == '.'
					&& grid[1].charAt(j) == '.' && grid[1].charAt(j + 1) == '.') {
				result[0][j] = 4;
				result[0][j+1] = 4;
				result[1][j] = 4;
				result[1][j+1] = 4;
				j += 2;

			} else if(grid[0].charAt(j) == '1' || grid[1].charAt(j) == '1') {
				result[0][j] = 1;
				result[1][j] = 1;
				j += 1;
			} else if(grid[0].charAt(j) == '.' || grid[1].charAt(j) == '.'){
				result[0][j] = 1;
				result[1][j] = 1;
				j++;
			}

		}

		return findSum(result);


	}

	public static int findSum(int[][] data) {
		int sum = 0;
		for(int i = 0; i < 2; i++) {
			for(int j = 0;j < data[0].length; j++) {
				sum = sum + data[i][j];
			}
		}
		return sum;
	}
}
