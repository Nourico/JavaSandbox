
public class RecursiveExamples {
//	Given a length n, count the number of strings of length n that can be made using ‘a’, ‘b’ and ‘c’ with at-most one ‘b’ and two ‘c’s allowed.
	public static int countStr(int n, int bCount, int cCount) {
		if (bCount < 0 || cCount < 0) return 0;
		if (n == 0) return 1;
		if (bCount == 0 && cCount == 0) return 1;
		
		int res = countStr(n-1, bCount, cCount);
		res += countStr(n-1, bCount - 1, cCount);
		res += countStr(n-1, bCount, cCount - 1);
		
		return res;
	}
	
	
	
	
}
