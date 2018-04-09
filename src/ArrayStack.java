// StackData is a simple class that holds a set of data about each stack
// It does not hold the actual items in the stack.
class StackData {
	public int start;
	public int pointer;
	public int size = 0;
	public int capacity;
	public StackData(int _start, int _capacity) {
		start = _start;
		pointer = _start - 1;
		capacity = _capacity;
	}
	
	public boolean isWithinStack(int index, int total_size) {
		// Note: if stack wraps, the head(right side) wraps around to the left
		if (start <= index && index < start + capacity) {
			// non-wrapping, or "head" (right side) of wrapping case
			return true;
		} else if (start + capacity > total_size && index < (start + capacity) % total_size) {
			// tail (left side) of wrapping case
			return true;
		}
		return false;
	}
}

public class ArrayStack {
	static int number_of_stacks = 3;
	static int default_size = 4; 
	static int total_size = default_size * number_of_stacks;
	static StackData [] stacks = {new StackData(0, default_size), new StackData(default_size, default_size), new StackData(default_size * 2, default_size)};
	static int[] buffer = new int[total_size];
	
	public static int numberOfElements() {
		return stacks[0].size + stacks[1].size + stacks[2].size;
	}
	
	public static int nextElement(int index) {
		if (index + 1 == total_size) return 0;
		else return index + 1;
	}
	
	public static int previousElement(int index) {
		if (index == 0) return total_size - 1;
		else return index - 1;
	}
	
	public static void shift(int stackNum) {
		StackData stack = stacks[stackNum];
		if (stack.size >= stack.capacity) {
			int nextStack = (stackNum + 1) % number_of_stacks;
			shift(nextStack);
			stack.capacity++;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
