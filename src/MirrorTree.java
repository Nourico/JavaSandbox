
public class MirrorTree {

	static class Node {
		int data;
		Node left;
		Node right;
		public Node(int d) {
			data = d;
			left = right = null;
		}
	}
	
	public Node mirror (Node root) {
		if (root != null) {
			Node temp;
			temp = root.left;
			root.left = root.right;
			root.right = temp;
			mirror (root.left);
			mirror (root.right);
			
		}
		return root;
	}
	
	public static void main(String[] args) {
		Node node = new Node(1);
		node.left = new Node(3);
		node.right = new Node(2);
		node.right.left = new Node(5);
		node.right.right = new Node(4);
		MirrorTree mt = new MirrorTree();
		Node answer = mt.mirror(node);
		System.out.println("");
		

	}

}
