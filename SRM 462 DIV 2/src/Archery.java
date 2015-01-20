import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class Archery {
	
	public double expectedPoints(int N, int[] ringPoints) {
		double totalarea = (N+1)*(N+1);
		double sum = 0;
		for(int i=0;i<=N;i++){
			double area = ((i+1)*(i+1)-(i*i))/totalarea;
			sum+= area* ringPoints[i];
		}


		return sum;
	}
}
