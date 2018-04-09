
public class ReverseLinkedList {

	Node head;
	 
	class Node{
		int data;
		Node next;
		Node(int d){data = d; next = null;}
	}
	
	Node reverse(Node head, int k) {
		Node current = head;
		Node next = null;
		Node previous = null;
		
		int count = 0;
		
		/*Reverse first node in Linked List */
		while (count < k && current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
			count++;
		}
		
		/* next is now a pointer to (k + 1)th node. Recursively call for the list starting from current. And make rest of list as next of first node */
		if (next != null)
			head.next = reverse(next, k);
		
		return previous;
	}
	
	/* Utility functions */
	/* Inserts a new Node at front of the list */
	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	
	/* Function to print Linked List */
	void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		ReverseLinkedList llist = new ReverseLinkedList();
		llist.push(9);
		llist.push(8);
		llist.push(7);
		llist.push(6);
		llist.push(5);
		llist.push(4);
		llist.push(3);
		llist.push(2);
		llist.push(1);
		
		System.out.println("Given linked list:");
		llist.printList();
		
		llist.head = llist.reverse(llist.head, 3);
		System.out.println("Reversed list");
		llist.printList();

	}

}
