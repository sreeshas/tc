import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class WaiterTipping {
	
	public int maxPercent(int total, int taxPercent, int money) {
		int result = 0;
        float tax = (total * taxPercent)/100;
		float cost = total + tax;
		if (money < cost) {
			return -1;
		}
		float tip = money - cost;
		int tipp = Math.round((tip /total) * 100);

		return tipp;
	}
}
