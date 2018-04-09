import java.util.Arrays;

public class PythagoreanTriplet {

	static boolean isTriplet(int arr[], int n) {
		// Square array elements
		for (int i = 0; i < n; i++)
			arr[i] = arr[i]*arr[i];
		
		Arrays.sort(arr);
		
		for (int i = n-1; i >= 2; i--) {
			int l = 0;
			int r = i-1;
			while (l < r) {
				// A triplet found
				if (arr[l] + arr[r] == arr[i])
					return true;
				
				if (arr[l] + arr[r] < arr[i])
					l++;
				else 
					r--;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		int arr[] = {3, 1, 4, 6, 5};
		int arr_size = arr.length;
		if (isTriplet(arr, arr_size) == true)
			System.out.println("Yes");
		else 
			System.out.println("No");

	}

}
