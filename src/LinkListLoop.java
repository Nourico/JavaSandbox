
public class LinkListLoop {

	static Node head;
	
	static class Node {
		int data;
		Node next;
		
		Node(int d) {
			data = d;
			next = null;
		}
	}
	
	// Function that detects loop in the list
	void detectAndRemoveLoop(Node node) {
		
		// If list is empty or has only one node without loop
		if (node == null || node.next == null)
			return;
		
		Node slow = node, fast = node;
		
		// Move slow and fast 1 and 2 steps ahead respectively
		slow = slow.next;
		fast = fast.next.next;
		
		// Search for loop using slow and fast pointers
		while (fast != null && fast.next != null) {
			if (slow == fast)
				break;
			
			slow = slow.next;
			fast = fast.next.next;
		}
		
		/* If loop exists */
		if (slow == fast) {
			slow = node;
			while (slow.next != fast.next) {
				slow = slow.next;
				fast = fast.next;
			}
			
			fast.next = null;
		}
	}
	
	// Function to print the linked list
	void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
