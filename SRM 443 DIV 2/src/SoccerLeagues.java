import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class SoccerLeagues {

	public int[] points(String[] matches) {
		int[]  points = new int[matches[0].length()];
		for(int p=0; p< points.length; p++) {
			points[p] = 0;
		}

		for(int i=0;i<matches.length; i++) {
			char[] work = matches[i].toCharArray();
			for(int j=0; j<work.length; j++) {
				if( work[j] == 'L') {
					points[j] = points[j] + 3;
				} else if(work[j] == 'W'){
					points[i] = points[i] + 3;
				} else if(work[j] == 'D') {
					points[i]++;
					points[j]++;
				}
			}

		}


		return points;
	}
}
