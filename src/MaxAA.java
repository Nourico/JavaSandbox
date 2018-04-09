
public class MaxAA {

	static int findOptimal(int N) {
		if (N <= 6)
			return N;
		
		int max = 0;
		int b;
		for (b = N - 3; b >= 1; b--) {
			int curr = (N - b - 1) * findOptimal(b);
			if (curr > max)
				max = curr;
		}
		return max;
		
	}
	
	public static void main(String[] args) {
		System.out.println(findOptimal(11));

	}

}
