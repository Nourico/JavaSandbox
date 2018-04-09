

public class PathDelete {

	static class Node {
		int data;
		Node left, right;
		
		public Node(int item) {
			data = item;
			left = right = null;
		}
	}

	
	Node root;
	
	Node removeShortPathNodesUtil(Node node, int level, int k) {
		if (node == null)
			return null;
		
		node.left = removeShortPathNodesUtil(node.left, level+1, k);
		node.right = removeShortPathNodesUtil(node.right, level+1, k);
		
		if (node.left == null && node.right == null && level < k)
			return null;
		
		return node;
	}
	
	Node removeShortPathNodes(Node node, int k) {
		int pathlen = 0;
		return removeShortPathNodesUtil(node, 1, k);
	}
	
	void printInorder(Node node) {
		if (node != null) {
			printInorder(node.left);
			System.out.print(node.data + " ");
			printInorder(node.right);
		}
	}
	
	public static void main(String[] args) {
		PathDelete tree = new PathDelete();
		int k = 4;
		tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.left.left = new Node(7);
        tree.root.right.right = new Node(6);
        tree.root.right.right.left = new Node(8);
        System.out.println("The inorder traversal of original tree is : ");
        tree.printInorder(tree.root);
        Node res = tree.removeShortPathNodes(tree.root, k);
        System.out.println("");
        System.out.println("The inorder traversal of modified tree is : ");
        tree.printInorder(res);

	}

}
