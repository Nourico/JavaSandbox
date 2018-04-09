//Given an unsorted array of non-negative integers, find a continuous sub-array which adds to a given number.
public class SubarraySum {

	static int findSubarray(int arr[], int n, int sum) {
		int curr_sum = arr[0], start = 0, i;
		
		for (i = 1; i <= n; i++) {
			while(curr_sum > sum && start < i - 1) {
				curr_sum = curr_sum - arr[start];
				start ++;
			}
			
			if (curr_sum == sum) {
				int p = i - 1;
				System.out.println("Sum found between " + start + " and" + p);
				return 1;
			}
			
			if (i < n)
				curr_sum = curr_sum + arr[i];
		}
		
		System.out.println("No subarray found");
		return 0;
	}
	
	public static void main(String[] args) {
		int arr[] = {15, 2, 4, 8, 9, 5, 10, 23};
		int n = arr.length;
		int sum = 23;
		findSubarray(arr, n, sum);

	}

}
