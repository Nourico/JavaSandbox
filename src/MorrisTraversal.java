//class tNode {
//	int data;
//	tNode left, right;
//	
//	tNode(int item){
//		data = item;
//		left = right = null;
//	}
//}
//
//
//public class MorrisTraversal {
//
//	tNode root;
//	
//	void morrisTrav(tNode root) {
//		tNode current, pre;
//		
//		if (root == null)
//			return;
//		
//		current = root;
//		while (current != null) {
//			if (current.left == null) {
//				System.out.print(current.data + " ");
//				current = current.right;
//			}
//			else {
//				pre = current.left;
//				while (pre.right != null && pre.right != current)
//					pre = pre.right;
//				
//				if (pre.right == null) {
//					pre.right = current;
//					current = current.left;
//				}
//				
//				else {
//					pre.right = null;
//					System.out.print(current.data + " ");
//					current = current.right;
//					
//				}
//			}
//		}
//	}
//	
//	public static void main(String[] args) {
//		MorrisTraversal tree = new MorrisTraversal();
//		tree.root = new tNode(1);
//		tree.root.left = new tNode(2);
//		tree.root.right = new tNode(3);
//		tree.root.left.left = new tNode(4);
//		tree.root.left.right = new tNode(5);
//		
//		tree.morrisTrav(tree.root);
//
//	}
//
//}
