import java.util.Stack;

public class LeafsPreorder {

	static void leafNode(int preorder[], int n) {
		Stack<Integer> s = new Stack<>();
		for(int i = 0, j = 1; j < n; i++, j++) {
			Boolean found = false;
			if (preorder[i] > preorder[j])
				s.push(preorder[i]);
			else {
				while (!s.empty()) {
					if (preorder[j] > s.peek()) {
						s.pop();
						found = true;
					}
					else
						break;
				}
			}
			
			if (found)
				System.out.println(preorder[i]);
		}
		
		System.out.println(preorder[n-1]);
	}
	
	public static void main(String[] args) {
		int preorder[] = { 100, 50, 20, 65 };	 
	    leafNode(preorder, 4);

	}

}
