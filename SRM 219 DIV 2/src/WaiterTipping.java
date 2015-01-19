import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class WaiterTipping {
	public int maxPercent(int total, int taxPercent, int money) {

		int tip =0;
		while(total + Math.floor(total*taxPercent/100) + Math.floor(total*tip/100) <=money){
			tip++;
		}
		return tip-1;
	}
}
