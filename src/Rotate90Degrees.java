//Given a square matrix, turn it by 90 degrees in anti-clockwise direction without using any extra space.
public class Rotate90Degrees {

	public void rotate(int[][] matrix, int n) {
		for (int layer = 0; layer < n/2; ++layer) {
			int first = layer;
			int last = n - 1 - layer;
			for (int i  = first; i < last; ++i) {
				int offset = i - first;
				int top = matrix[first][i];
				matrix[first][i] = matrix[last - offset][first];
				matrix[last-offset][first] = matrix[last][last-offset];
				matrix[last][last-offset] = matrix[i][last];
				matrix[i][last] = top;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
