import java.util.LinkedList;
import java.util.Queue;

public class JumpingNumbers {

	static void printJumpingNumbers(int startNum, int x) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(startNum);
		
		while(!queue.isEmpty()) {
			startNum = queue.remove();
			int lastDigit = startNum % 10;
			
			if (startNum <= x) {
				System.out.println(startNum + "");
				
				if (lastDigit == 0) {
					queue.add(startNum * 10 + (lastDigit + 1));
				} else if (lastDigit == 9) {
					queue.add(startNum * 10 + (lastDigit - 1));
				} else {
					queue.add(startNum * 10 + (lastDigit + 1));
					queue.add(startNum * 10 + (lastDigit - 1));
				}
			}
		}
	}
	
	public static void main(String[] args) {
		printJumpingNumbers(1, 500);

	}

}
