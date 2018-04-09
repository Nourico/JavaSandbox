//class TreeNode {
//	int data;
//	TreeNode left;
//	TreeNode right;
//
//	public TreeNode(int data) {
//		this.data = data;
//		left = null;
//		right = null;
//	}
//}
//
//public class Ancestor {
//
//	// Returns true if p is a descendant of root
//	boolean covers(TreeNode root, TreeNode p) {
//		if (root == null) return false;
//		if (root == p) return true;
//		return covers(root.left, p) || covers(root.right, p);
//	}
//	
//	TreeNode commonAncestorHelper(TreeNode root, TreeNode p, TreeNode q) {
//		if (root == null) return null;
//		if (root == p || root == q) return root;
//		
//		boolean is_p_on_left = covers(root.left, p);
//		boolean is_q_on_left = covers(root.left, q);
//		
//		// If p and q are on different sides, return root.
//		if (is_p_on_left != is_q_on_left) return root;
//		
//		// Else, they are on the same side. Traverse this side
//		TreeNode child_side = is_p_on_left ? root.left : root.right;
//		return commonAncestorHelper(child_side, p, q);
//	}
//	
//	TreeNode commonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//		if (!covers(root, p) || !covers(root, q)) 
//			return null;
//		return commonAncestorHelper(root, p, q);
//	}
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
