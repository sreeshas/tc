import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class MountainRoad {
	
	public double findDistance(int[] start, int[] finish) {

		int i= 0;
		double newresult = 0;
		while(i <start.length) {
			if( i+1 <start.length && finish[i] > start[i+1]) {
				//there is overlap.
				double side = getside(start[i], finish[i]);
				double firstmountainlength = side * 2;
				side = getside(start[i+1], finish[i+1]);
				int border = finish[i+1];
				double secondmountainlength = side * 2;
				double negateside = getside(start[i+1], finish[i]);
				newresult = newresult + firstmountainlength + secondmountainlength - (negateside * 2);
                int k = i + 2;
				while(k <start.length && start[k] <= border && finish[k] <= border) {
					k++;
				}
				i = k;
			} else {
				double side = getside(start[i], finish[i]);
				newresult += (side * 2);
				i++;
			}
		}

		return newresult;

	}

	public static double getside(int start, int finish) {
		int  hypotenuse = Math.abs(finish - start);
		return hypotenuse/ (Math.sqrt(2));
//		int hypsquare = hypotenuse * hypotenuse;
//		return  Math.sqrt(hypsquare /2);


	}
}
