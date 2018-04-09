import java.util.Stack;

public class SortStack {

	
	public static Stack sort(Stack<Integer> s){
		
		if (!s.isEmpty()) {
			int v = s.pop();
			sort(s);
			sink (v, s);
		}
		
		return s;
		
	}
	
	public static void sink(int num, Stack<Integer> s) {
		if (!s.isEmpty() && num < s.peek()) {
			int v = s.pop();
			sink(num, s);
			s.push(v);
		}
		if (s.isEmpty() || num > s.peek())
			s.push(num);
	}
	
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(11);
		s.push(2);
		s.push(32);
		s.push(3);
		s.push(41);
		sort(s);
		System.out.println();
	}

}
