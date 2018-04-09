
public class PreorderBST {

	class Node {
		int key;
		Node left, right;
		
		public Node(int item) {
			key = item;
			left = right = null;
		}
	}
	
	Node root;
	
	public PreorderBST() {
		root = null;
	}
	
	// This method mainly calls insertRec()
	void insert(int key) {
		root = insertRec(root, key);
	}
	
	// A recursive function to insert a new key in BST
	Node insertRec(Node root, int key) {
		if (root == null) {
			root = new Node(key);
			return root;
		}
		
		if (key < root.key)
			root.left = insertRec(root.left, key);
		if (key > root.key)
			root.right = insertRec(root.right, key);
		
		return root;
	}
	
	// This method mainly calls deleteRec()
	void deleteKey(int key) {
		root = deleteRec(root, key);
	}
	
	// A recursive function to delete key in BST
	Node deleteRec(Node root, int key) {
		// Base case: If the tree is empty
		if (root == null) return root;
		
		// Otherwise, recur down the tree
		if (key < root.key)
			root.left = deleteRec(root.left, key);
		else if (key > root.key)
			root.right = deleteRec(root.right, key);
		
		// if key is same as root's key, then this is the node to be deleted
		else {
			//node with only one child or no child
			if (root.left == null)
				return root.right;
			else if (root.right == null)
				return root.left;
			
			// node with two children: Get the inorder successor (smallest in the right subtree)
			root.key = minValue(root.right);
			
			// Delete the in order successor
			root.right = deleteRec(root.right, root.key);
		}
		
		return root;
	}
	
	int minValue(Node root) {
		int minv = root.key;
		while (root.left != null) {
			minv = root.left.key;
			root = root.left;
		}
		return minv;
	}
	
	void inorder() {
		inorderRec(root);
	}
	
	// A utility function to do inorder traversal of BST
	void inorderRec(Node root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.println(root.key);
			inorderRec(root.right);
		}
	}
	
	public static void main(String[] args) {
		PreorderBST tree = new PreorderBST();
		tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
 
        // print inorder traversal of the BST
        tree.inorder();
	

	}

}
