//class tNode {
//	int data;
//	tNode left, right;
//	
//	public tNode(int d) {
//		data = d;
//		left = right = null;
//	}
//}
//public class MedianBST {
//
//	public static tNode insert (tNode node, int key) {
//		if (node == null) return new tNode(key);
//		
//		if (key < node.data)
//			node.left = insert(node.left, key);
//		else if (key > node.data)
//			node.right = insert(node.right, key);
//		
//		return node;
//	}
//	
//	static int counNodes(tNode root) {
//		tNode current, pre;
//		int count = 0;
//		
//		if (root == null)
//			return count;
//		
//		current = root;
//		while (current != null) {
//			if (current.left == null) {
//				count++;
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
//					count ++;
//					current = current.right;
//				}
//			}
//		}
//		return count;
//		
//	}
//	
//	static int findMedian(tNode root) {
//		if (root == null)
//			return 0;
//		
//		int count = counNodes(root);
//		int currCount = 0;
//		tNode current = root;
//		tNode pre = null;
//		tNode prev = null;
//		
//		while (current != null) {
//			if (current.left == null) {
//				currCount++;
//				if (count % 2 != 0 && currCount == (count+1)/2)
//					return (prev.data + current.data)/2;
//				
//				prev = current;
//				current = current.right;
//			} else {
//				pre = current.left;
//				while (pre.right != null && pre.right != current)
//					pre = pre.right;
//				
//				if (pre.right == null) {
//					pre.right = current;
//					current = current.left;
//				} else {
//					pre.right = null;
//					prev = pre;
//					currCount++;
//					
//					if (count % 2 != 0 && currCount == (count+1)/2)
//						return current.data;
//					else if (count % 2 == 0 && currCount == (count/2)+1)
//						return (prev.data + current.data)/2;
//					
//					prev = current;
//					current = current.right;
//				}
//			}
//		}
//		return currCount;
//	}
//	
//	
//	public static void main(String[] args) {
//		tNode root = null;
//		root = insert(root, 50);
//		insert(root, 30);
//		insert(root, 20);
//		insert(root, 40);
//		insert(root, 70);
//		insert(root, 60);
//		insert(root, 80);
//		
//		System.out.println(findMedian(root));
//		
//
//	}
//
//}
