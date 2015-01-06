import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class TheEncryptionDivTwo {
	
	public String encrypt(String message) {

		char[]  msgArray = message.toCharArray();
		String token = "abcdefghijklmnopqrstuvwxyz";

		HashMap<Character, Character> msgMap =  new HashMap<Character, Character>();

		String result = "";
		int i =0;
		for(char c: msgArray) {
			if(msgMap.containsKey(c)) {
				char cipherKey = msgMap.get(c);
				result = result + cipherKey;
			} else {
				msgMap.put(c,token.charAt(i));
				result = result + token.charAt(i);
				i++;
			}
		}

		return result;
	}
}
