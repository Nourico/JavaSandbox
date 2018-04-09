class BSTNode {
	int data;
	BSTNode left;
	BSTNode right;
	BSTNode parent;
	
	public BSTNode(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}

public class BST {

	public BSTNode inorderSucc(BSTNode n) {
		if (n == null) return null;
		
		// Found right children -> return leftmost node of right subtree
		if (n.right != null) {
			return leftMostChild(n.right);
		} else {
			BSTNode q = n;
			BSTNode x = q.parent;
			// Go up until we're on left instead of right
			while (x != null && x.left != q) {
				q = x;
				x = x.parent;
			}
			return x;
		}
	}
	
	public BSTNode leftMostChild(BSTNode n) {
		if (n == null)
			return null;
		while (n.left != null)
			n = n.left;
		return n;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
