import java.util.HashSet;

public class LargestFibonacciSubset {

	static void findFibSubset(int arr[], int n) {
		int max = getMax(arr);
		int a = 0, b = 1;
		HashSet<Integer> jash = new HashSet<Integer>();
		jash.add(a);
		jash.add(b);
		while (b < max) {
			int c = a + b;
			a = b;
			b = c;
			jash.add(c);
		}
		for (int i = 0; i < n; i++) {
			if (jash.contains(arr[i]))
				System.out.print(arr[i] + " ");
		}
	}
	
	static int getMax(int arr[]) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		return max;
	}
	
	public static void main(String[] args) {
		int[] arr = {4, 2, 8, 5, 20, 1, 40, 13, 23};
		findFibSubset(arr, 9);

	}

}
