//import java.util.ArrayList;
//import java.util.LinkedList;
//
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
//
//public class TreeLevelLinkList {
//
//	void createLevelLinkList(TreeNode root, ArrayList<LinkedList<TreeNode>> lists, int level) {
//		if (root == null) return; // base case
//		LinkedList<TreeNode> list = null;
//		if (lists.size() == level) { // Level not contained in list
//			list = new LinkedList<TreeNode>();
//			/* Levels are always traversed in order. So, if this is the
//			 * first time we've visited level i, we must have seen levels
//			 * 0 through i-1. We can therefore safely add the level at 
//			 * the end.
//			 */
//			lists.add(list);
//		} else {
//			list = lists.get(level);
//		}
//		list.add(root);
//		createLevelLinkList(root.left, lists, level+1);
//		createLevelLinkList(root.right, lists, level+1);
//	}
//	
//	
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
