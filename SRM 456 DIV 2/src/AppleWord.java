import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class AppleWord {
	
	public int minRep(String word) {

		if( word.toLowerCase().equals("apple")) {
			return 0;
		} else if(word.length() <5){
			return -1;
		} else {
           return findint(word.toLowerCase());
		}


	}

	public static int findint(String word) {
		char[] wordArr = word.toCharArray();
		char[] pattern = {'a', 'p','p','l','e'};
		int length = word.length();
		int count = 0;


		if(word.charAt(word.length()-1) != 'e') {
			count++;
		}
		if(word.charAt(word.length()-2) != 'l') {
			count++;
		}
		if(word.charAt(0) != 'a') {
			count++;
		}
		for(int i=1;i<word.length() -2;i++){
			if(word.charAt(i) != 'p'){
				count++;
			}
		}
		return count;
	}
}
