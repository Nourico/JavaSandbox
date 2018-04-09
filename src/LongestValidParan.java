import java.util.Stack;

//Given a string consisting of opening and closing parenthesis, find length of the longest valid parenthesis substring.
public class LongestValidParan {

	static int findMaxLength(String str) {
		int n = str.length();
		Stack<Integer> stk = new Stack<>();
		stk.push(-1);
		
		int result = 0;
		
		for (int i=0; i<n; i++) {
			if(str.charAt(i) == '(')
				stk.push(i);
			else {
				stk.pop();
				if (!stk.empty())
					result = Math.max(result, i - stk.peek());
				else stk.push(i);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		String str = "((()()";
		System.out.println(findMaxLength(str));

	}

}
