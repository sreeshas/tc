import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class DifferentStrings {
	
	public int minimize(String A, String B) {
		char a[] = A.toCharArray();
		char b[] = B.toCharArray();
		if (A.length() < B.length()) {
			if  (B.contains(A)) {
				return 0;
			}
		}
		if ( A.length() == B.length()) {
			return findDiff(A,B);
		}
		if ( A.length() < B.length()) {
			int diff = B.length() - A.length();
			while(diff != 0) {
				int i = findIndex(A, B);
				A = A.substring(0,i) + B.charAt(i) + A.substring(i, A.length());
				diff--;
			}
			return findDiff(A, B);

		}
		return 0;
	}

	public static int findDiff(String A, String B) {
		char a[] = A.toCharArray();
		char b[] = B.toCharArray();
		int count = 0,i = 0;
		while(i < A.length()) {
			if(a[i] != b[i]) {
				count++;
			}
			i++;
		}
		return count;
	}

	public static int findIndex(String A, String B) {
		char a[] = A.toCharArray();
		char b[] = B.toCharArray();
		int count = 0,i = 0;
		while(i < B.length()) {
			if(a[i] != b[i]) {
				return i;
			}
			i++;
		}
		return count;
	}
}
