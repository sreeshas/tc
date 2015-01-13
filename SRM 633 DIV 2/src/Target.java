import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class Target {

	public String[]  draw(int n) {
		char[][] target = new char[n][n];
		init(target,n);
		for(int i=0; i< n; i++) {
			for(int j=0;j<n;j++) {
				if(max(abs(i-(n/2)), abs(j-(n/2))) %2 == 0) {
					target[i][j] = '#';
				}
			}
		}
		return draw2(target, n);
	}

	public String[] draw1(int n) {
		char[][] target = new char[n][n];
		init(target, n);
		char[] symbol = new char[]{'#', ' '};
		int sym = 0;
		int k = 0 ;
		target[n/2][n/2] = '#';
		while(k < n/2) {
			drawAround(target,k, n-1-k, k, n-1-k,symbol[k%2], n);
			k++;

		}
		return draw2(target, n);
	}
	public static void drawAround(char[][] target, int row1, int row2, int col1, int col2, char symbol, int n) {
		for(int i=col1; i<=col2; i++) {
			target[row1][i] = symbol;
		}
		for(int i= row1; i<=row2; i++) {
			target[i][col2] = symbol;
		}
		for(int i=col1; i<=col2; i++) {
			target[row2][i] = symbol;
		}
		for(int i=row1; i<=row2; i++) {
			target[i][col1] = symbol;
		}

	}

	public static String[] draw2(char[][] target, int n) {
		String[] result = new String[n];
		for(int i=0; i< n; i++) {
			String answer = "";
			for(int j=0;j<n;j++) {
				answer += target[i][j];
			}
			result[i] = answer;
		}
		return result;
	}
	public static void init(char[][] target, int n) {
		for(int i=0; i< n; i++) {
			for(int j=0;j<n;j++) {
				target[i][j] = ' ';
			}

		}
	}
}
