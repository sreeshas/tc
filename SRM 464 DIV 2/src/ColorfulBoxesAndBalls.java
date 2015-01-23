import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ColorfulBoxesAndBalls {
	
	public int getMaximum(int numRed, int numBlue, int onlyRed, int onlyBlue, int bothColors) {

		int redballs = numRed;
		int blueballs= numBlue;
        //fill redballs
		int result1 =  (numRed*onlyRed) + (numBlue*onlyBlue);
		int result2 = 0;
		if (numRed > numBlue) {
			result2 = (numRed - numBlue)*onlyRed + numBlue * bothColors + numBlue*bothColors;
		} else if (numBlue > numRed){
			result2 = (numBlue -numRed)*onlyBlue + numRed * bothColors + numRed *bothColors;
		} else {
			result2 = numBlue*bothColors+numBlue*bothColors;
		}

 		return max(result1, result2);
	}
}
