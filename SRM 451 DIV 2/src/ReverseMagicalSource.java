import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ReverseMagicalSource {
	
	public int find(int source, int A) {
		int i=1;
		int result = source;
		while( result <= A) {
			result += (source )* Math.pow(10, i);
			i++;
		}
		return result;

	}
}
