import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class MountainRoad {

	public double findDistance1(int[] start, int[] finish) {
		final int oo = 1 << 30;
		System.out.println(oo);
		sort(start, finish);
		int currentstart = start[0];
		int currentfinish = finish[0];
		int latestfinish =finish[0];
		double result = 2 * getside(currentstart, currentfinish);
		for(int i=1; i<start.length; i++) {
			currentstart = start[i];
			currentfinish = finish[i];
			if( currentstart < latestfinish && currentfinish < latestfinish) {
				continue;
			}else {
				if(currentstart < latestfinish) {
					result += (2*getside(currentstart, currentfinish)) - (2 * getside(currentstart, latestfinish));
					latestfinish = currentfinish;
				}
			}
		}
		return result;
	}


	public static double getside(int start, int finish) {
		int  hypotenuse = Math.abs(finish - start);
		return hypotenuse/ (Math.sqrt(2));

	}

	public static void sort(int[] start, int[] finish) {
		for(int i= 0;i<start.length; i++) {
			for(int j=i+1;j<start.length;j++) {
				if(start[i] > start[j]) {
					int temp = start[i];
					start[i] = start[j];
					start[j] = temp;
					temp = finish[i];
					finish[i] = finish[j];
					finish[j] = temp;

				}
			}
		}
		int a= 0;
	}

	/* this is justforlaugh's beautiful solution */
	public double findDistance(int[]  start, int[] finish) {
		final int oo = 999;
		double r= 0,a =oo, b = -oo;
		for(int i=0; i< start.length; ++i){
			a = Math.min(a, start[i]);
			b = Math.max(b, finish[i]);
		}

		return (Math.abs(a-b)/Math.sqrt(2))*2;
	}
}
