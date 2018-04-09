
public class MergeLinkedList {

	Node head;
	
	class Node {
		int data;
		Node next;
		Node(int d) {data = d; next = null;}
	}
	
	/* Inserts a new node at the front of the list */
	void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	
	// Main function that inserts nodes of linked list q into p at alternate positions. Since head of first list never changes and head of second list may 
	// change, we need single pointer from first list and double pointer from second
	void merge(MergeLinkedList q) {
		Node p_curr = head, q_curr = q.head;
		Node p_next, q_next;
		
		//While there are available positions in p;
		while (p_curr != null && q_curr != null) {
			
			// Save next pointers
			p_next = p_curr.next;
			q_next  = q_curr.next;
			
			q_curr.next = p_next;
			p_curr.next = q_curr;
			
			p_curr = p_next;
			q_curr = q_next;
		}
		q.head = q_curr;
	}
	
	void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	
	
	public static void main(String[] args) {
		MergeLinkedList l1 = new MergeLinkedList();
		MergeLinkedList l2 = new MergeLinkedList();
		l1.push(3);
		l1.push(2);
		l1.push(1);
		
		l1.printList();
		
		l2.push(8);
		l2.push(7);
		l2.push(6);
		l2.push(5);
		l2.push(4);
		
		l1.merge(l2);
		
		l1.printList();
		l2.printList();

	}

}
