
public class CountingElementsInTwoArrays {

	
	int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = (low-1);
		for (int j = low; j < high; j++) {
			if (arr[j] <= pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		
		return i+1;
	}
	
	
	void quickSort(int arr[], int low, int high){
		if (low < high) {
			int pi = partition(arr, low, high);
			quickSort(arr, low, pi-1);
			quickSort(arr, pi+1, high);
		}
	}
	
	int binarySearch(int arr[], int x, int low, int high) {
			int mid = low + (high - low)/2;
			if (high == low)
				if (x >= arr[high])
					return high+1;
				else
					return high;
			if (x >= arr[mid])
				return binarySearch(arr, x, mid + 1, high);
			if (x < arr[mid])
				return binarySearch(arr, x, low, mid - 1);
		
			return -1;
	}
	
	void countLess(int arr1[], int arr2[]) {
		quickSort(arr2, 0, arr2.length-1);
		for (int i = 0; i < arr1.length; i++) {
			int count = binarySearch(arr2, arr1[i], 0, arr2.length-1);
			System.out.print(count + " ");
		}
		
	}
	
	public static void main(String[] args) {
		int arr1[] = {4, 8, 7, 5, 1};
		int arr2[] = {4, 48, 3, 0, 1, 1, 5};
		CountingElementsInTwoArrays ce = new CountingElementsInTwoArrays();
		ce.countLess(arr1, arr2);

	}

}
