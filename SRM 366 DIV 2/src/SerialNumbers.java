import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class SerialNumbers {

	public String[] sortSerials(String[] serialNumbers) {
		Arrays.sort(serialNumbers, new MyComparator());
		return serialNumbers;
	}

	public class MyComparator implements Comparator<String> {

		@Override
		public int compare(String o1, String o2) {
			if (o1.length() < o2.length()) {
				return -1;
			} else if (o1.length() > o2.length()){
				return 1;
			} else {
				char[] o1array = o1.toCharArray();
				char[] o2array = o2.toCharArray();
				int o1sum = 0;
				int o2sum = 0;
				for (char a : o1array) {
					if (Character.isDigit(a)) {
						o1sum = o1sum + a;
					}
				}
				for (char b : o2array) {
					if (Character.isDigit(b)) {
						o2sum = o2sum + b;
					}
				}
				if (o1sum < o2sum) {
					return -1;
				} else if (o1sum > o2sum) {
					return 1;
				} else {
					if (o1.equals(o2)) {
						return 0;
					}
					for (int i = 0; i < o1array.length; i++) {
						if (o1array[i] == o2array[i]) {
							continue;
						}
						if (!Character.isDigit(o1array[i]) && !Character.isDigit(o2array[i])) {
							if (o1array[i] < o2array[i]) {
								return -1;
							} else {
								return 1;
							}
						} else if (Character.isDigit(o1array[i]) && !Character.isDigit(o2array[i])) {
							return -1;
						} else if (!Character.isDigit(o1array[i]) && Character.isDigit(o2array[i])) {
							return 1;
						} else if (Character.isDigit(o1array[i]) && Character.isDigit(o2array[i])) {
							if (o1array[i] < o2array[i]) {
								return -1;
							} else if (o1array[i] > o2array[i]) {
								return 1;
							} else {
								return 0;
							}
						}
					}
					return 0;
				}
			}
		}
	}
}
