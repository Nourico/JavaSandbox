import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
	int key;
	TreeNode left, right;
	
	public TreeNode(int key) {
		this.key = key;
		left = right = null;
	}
}

// A class to represent a queue item. The queue is used to do Level order traversal. Every Queue item contains node and 
// horizontal distance of node from root.
class QItem {
	TreeNode node;
	int hd;
	public QItem(TreeNode n, int h) {
		node = n;
		hd = h;
	}
}


public class TopView {

	TreeNode root;
	public TopView() {root = null;}
	public TopView(TreeNode n) { root = n; }
	
	// This method prints nodes in top view of binary tree
	public void printTopView() {
		// base case
		if (root == null) { return; }
		
		// Creates an empty hashset
		HashSet<Integer> set = new HashSet<>();
		
		// Create a queue and add root to it
		Queue<QItem> Q = new LinkedList<QItem>();
		Q.add(new QItem(root, 0));
		
		while (!Q.isEmpty()) {
			// Remove the front item and get its details
			QItem qi = Q.remove();
			int hd = qi.hd;
			TreeNode n = qi.node;
			
			if (!set.contains(hd)) {
				set.add(hd);
				System.out.print(n.key + " ");
			}
			
			if (n.left != null)
				Q.add(new QItem(n.left, hd-1));
			if (n.right != null)
				Q.add(new QItem(n.right, hd+1));
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
