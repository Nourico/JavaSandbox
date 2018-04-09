
public class SwapSpecial {

	static void sortRec(int arr[], int index, int k, int n) {
		if (k == 0) {
			for (int i = 1; i < n; i++)
				System.out.print(arr[i] + " ");
			System.out.print(999);
			
			return;
		}
		
		else if (k > 0 && index == 0) {
			index = n - 2;
			for (int i = 1; i <= index; i++)
				arr[i-1] = arr[i];
			arr[index] = 999;
		}
		
		if (index - 1 >= 0 && index + 1 < n && arr[index - 1] > arr[index + 1]) {
			swap(arr, index, index + 1);
			swap(arr,index-1, index+1);
		}
		else
			swap(arr, index, index-1);
		
		sortRec(arr, index - 1, k - 1, n);
	}
	
	static void sort(int arr[], int n) {
		int index = -1;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 999) {
				index = i;
				break;
			}
		}
		
		if (index == -1)
			return;
		
		sortRec(arr, index, n, n);
	}
	
	static void swap(int[] arr, int i, int j) {
		int temp;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void main(String[] args) {
		int arr[] = {1, 5, 4, 999, 3, 2};
		int n = arr.length;
		sort(arr, n);
	}

}
