import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class TheQuestionsAndAnswersDivTwo {
	
	public int find(String[] questions) {
		HashMap<String ,String> questionMap = new HashMap<String, String>();
		for(String question: questions) {
			questionMap.put(question," ");
		}
		return (int) Math.pow(2, questionMap.size());
	}
}
