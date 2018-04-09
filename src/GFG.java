import java.util.HashMap;

public class GFG {

	public static void findPairs(int arr1[], int arr2[], int n, int m, int x) {
		HashMap<Integer, Integer> s = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < n; i++)
			s.put(arr1[i], 0);
		
		for (int j = 0; j < m; j++)
			if(s.containsKey(x - arr2[j]))
				System.out.println(x - arr2[j] + " " + arr2[j]);
	}
	
	public static void main(String[] args) {
		int arr1[] = {1, 0, -4, 7, 6, 4};
		int arr2[] = {0, 2, 4, -3, 2, 1};
		int x = 8;
		
		findPairs(arr1, arr2, arr1.length, arr2.length, x);
	}

}
