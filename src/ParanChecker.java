import java.util.HashMap;
import java.util.Stack;

public class ParanChecker {

	public static boolean check(String exp) {
		HashMap<Character, Character> hm = new HashMap<>();
		hm.put(')', '(');
		hm.put('}', '{');
		hm.put(']', '[');
		Stack<Character> st = new Stack<>();
		int n = exp.length();
		Character top = null;
		for (int i = 0; i < n; i++) {
			Character stchar = exp.charAt(i);;
			if (!st.empty()) {
				top = st.peek();
				if (hm.get(stchar) == top)
					st.pop();
				else
					st.push(stchar);
			}
			else
				st.push(stchar);
		}
		if (st.empty())
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		String exp = "[(])";
		System.out.println(check(exp));

	}

}
