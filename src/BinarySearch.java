
public class BinarySearch {

	public int search(int[] a, int k, int l, int r) {
		
		if (r >= l) {
			int m = l + (r - l)/2;
			
			if (k == a[m])
				return m;
			if (k < a[m])
				return search(a, k, l, m - 1);
			if (k > a[m])
				return search(a, k, m + 1, r);
		}
		return -1;
	}
	
	public static void main(String[] args) {
		BinarySearch ob = new BinarySearch();
		int arr[] = {2, 3, 4, 10, 40};
		int n = arr.length;
		int x = 10;
		int result = ob.search(arr, x, 0, n-1);
		if (result == -1)
			System.out.println("Not present.");
		else
			System.out.println("Present");

	}

}
