import java.util.HashMap;
import java.util.HashSet;

public class UnionIntersectionLinkedList {

	Node head;
	
	class Node {
		int data;
		Node next;
		
		Node(int data){ this.data = data; next = null;}
	}
	
	/* Utility function to print list */
	void printList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(head.data);
			temp = temp.next;
		}
	}
	
	/* Insert a node at the start of a Linked List */
	void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	
	public void append(int new_data) {
		if (this.head == null) {
			Node n = new Node(new_data);
			this.head = n;
			return;
		}
		Node n1 = this.head;
		Node n2 = new Node(new_data);
		while (n1.next != null)
			n1 = n1.next;
		
		n1.next = n2;
		n2.next = null;
	}
	
	/* A utility function that returns true if data is present in linked list else returns false  */
	boolean isPresent(Node head, int data) {
		Node temp = head;
		while (temp != null) {
			if (data == temp.data)
				return true;
			temp = temp.next;
		}
		return false;
	}
	
	UnionIntersectionLinkedList getIntersection(Node head1, Node head2) {
		HashSet<Integer> hset = new HashSet<>();
		Node n1 = head1;
		Node n2 = head2;
		UnionIntersectionLinkedList result = new UnionIntersectionLinkedList();
		
		//loop store all the elements of list1 in hset
		while (n1 != null) {
			if (hset.contains(n1.data))
				hset.add(n1.data);
			else
				hset.add(n1.data);
			
			n1 = n1.next;
		}
		
		//For every element of list2 present in hset
		//loop inserts the element into the result
		while (n2 != null) {
			if (hset.contains(n2.data))
				result.push(n2.data);
			n2 = n2.next;
			
		}
		return result;
		
	}
	
	UnionIntersectionLinkedList getUnion(Node head1, Node head2) {
		//HashMap that will store the elements of the lists with their counts
		HashMap<Integer, Integer> hmap = new HashMap<>();
		Node n1 = head1;
		Node n2 = head2;
		UnionIntersectionLinkedList result = new UnionIntersectionLinkedList();
		
		//loop inserts the elements and the count of that element of list1 into the hmap
		while (n1 != null) {
			if (hmap.containsKey(n1.data)) {
				int val = hmap.get(n1.data);
				hmap.put(n1.data, val + 1);
			}
			else {
				hmap.put(n1.data, 1);
			}
			n1 = n1.next;
		}
		
		//loop further adds the elements of list2 with their counts into the hmap
		while (n2 != null) {
			if (hmap.containsKey(n2.data)) {
				int val = hmap.get(n2.data);
				hmap.put(n2.data, val + 1);
			}
			else {
				hmap.put(n2.data, 1);
			}
			n2 = n2.next;
		}
		
		// Eventually add all the elements into the result that are present int the hmap
		for (int a:hmap.keySet())
			result.append(a);
		
		return result;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
