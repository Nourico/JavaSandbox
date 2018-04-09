
public class UniqueBST {

	
	int ubt(int[] arr, int start, int end) {
		int sum = 0;
		
		if (start >= end)
			return 1;
		
		for (int i = start; i <= end; i++)
			sum += ubt(arr, start, i-1) * ubt(arr, i+1, end);
		
		return sum;
	}
	
	int uniqueBST(int n) {
		int[] numbers = new int[n];
		for (int i = 0; i < n; i++)
			numbers[i] = i+1;
		return ubt(numbers, 0, n-1);
	}
	
	public static void main(String[] args) {
		UniqueBST ub = new UniqueBST();
		System.out.println(ub.uniqueBST(3));

	}

}
