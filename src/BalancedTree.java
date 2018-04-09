class Tnode {
	Tnode left;
	Tnode right;
	int data;
	
	public Tnode(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}

public class BalancedTree {

	public static boolean isBalanced(Tnode root) {
		if (root == null) return true;
		int heightDiff = getHeight(root.left) - getHeight(root.right);
		if (Math.abs(heightDiff) > 1) {
			return false;
		} else {
			return isBalanced(root.left) && isBalanced(root.right);
		}
	}
	
	public static int getHeight(Tnode root) {
		if (root == null) return 0;
		return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
