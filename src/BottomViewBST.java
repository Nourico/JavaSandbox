import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;

public class BottomViewBST {

	// Tree node class
	class Node {
		int data;
		int hd;
		Node left, right;
		
		public Node(int key) {
			data = key;
			hd = Integer.MAX_VALUE;
			left = right = null;
		}
	}
	
	Node root;
	
	public BottomViewBST() {}
	
	public BottomViewBST(Node node) {
		root = node;
	}
	
	// Method that prints the bottom view
	public void bottomView() {
		int hd = 0;
		
		Map<Integer, Integer> map = new TreeMap<>();
		
		Queue<Node> myQueue = new java.util.LinkedList<Node>();
		
		root.hd = hd;
		myQueue.add(root);
		
		while (!myQueue.isEmpty()) {
			Node temp = myQueue.remove();
			hd = temp.hd;
			map.put(hd, temp.data);
			if (temp.left != null) {
				temp.left.hd = hd-1;
				myQueue.add(temp.left);
			}
			
			if (temp.right != null) {
				temp.right.hd = hd +1;
				myQueue.add(temp.right);
			}
		}
		
		Set<Entry<Integer, Integer>> set = map.entrySet();
		Iterator<Entry<Integer, Integer>> iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer, Integer> me = iterator.next();
			System.out.print(me.getValue() + " ");
		}
	}
	
	public static void main(String[] args) {
		

	}

}
