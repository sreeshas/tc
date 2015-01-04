import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class SimpleWordGame {
	
	public int points(String[] player, String[] dictionary) {

		HashMap<String, Integer> dict = new HashMap<String, Integer>();
		HashMap<String, Integer> pdict = new HashMap<String, Integer>();

		for(String s: dictionary) {
			dict.put(s, s.length() *s.length());
		}
		for(String s:player) {
			pdict.put(s, s.length()*s.length());
		}
		int result = 0;
		Iterator it  = pdict.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<String, Integer> pairs = (Map.Entry<String, Integer>) it.next();
			if(dict.containsKey(pairs.getKey())) {
				result =  result+ pairs.getValue();
			}

		}

		return result;
	}
}
