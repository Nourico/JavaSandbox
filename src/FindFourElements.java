import java.util.Arrays;

public class FindFourElements {

	void findFourNumbers(int A[], int n, int x) {
		int l, r;
		Arrays.sort(A);
		for (int i = 0; i < n-3; i++) {
			for(int j = i + 1; j < n-2; j++) {
				l = j + 1;
				r = n - 1;
				while (l < r) {
					if (A[i] + A[j] + A[l] + A[r] == x) {
						System.out.println(A[i] + "+" + A[j] + "+" + A[l] + "+" + A[r]);
						l++;
						r--;
					}
					else if (A[i] + A[j] + A[l] + A[r] < x)
						l++;
					else
						r--;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		FindFourElements find4 = new FindFourElements();
		int A[] = {1, 4, 45, 6, 10, 12};
		int n = A.length;
		int X = 32;
		find4.findFourNumbers(A, n, X);

	}

}
 