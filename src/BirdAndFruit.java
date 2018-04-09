
public class BirdAndFruit {

	public static int maxint(int[] arr, int time) {
		int max = 0;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = 0; j < time; j++)
				sum += arr[(i + j) % n];
			if (sum > max)
				max = sum;
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		int[] a  = {1, 6, 2, 5, 3, 4};
		int t = 2;
		System.out.println(maxint(a, t));

	}

}
