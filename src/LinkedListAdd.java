
public class LinkedListAdd {

	class node {
		int val;
		node next;
		
		public node(int val) {
			this.val = val;
		}
	}
	
	void printlist(node head) {
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
	}
	
	node head1, head2, result;
	int carry;
	
	/* A utility function to push a value to linked list */
	void push(int val, int list) {
		node newnode = new node(val);
		if (list == 1) {
			newnode.next = head1;
			head1 = newnode;
		}
		else if (list == 2) {
			newnode.next = head2;
			head2 = newnode;
		}
		else {
			newnode.next = result;
			result = newnode;
		}
	}
	
	/* Adds two linked list of the same size represented by head1 and head2 and returns head of the resultant link list */
	void addsamesize(node n, node m) {
		if (n == null)
			return;
		
		addsamesize(n.next, m.next);
		int sum = n.val + m.val + carry;
		carry = sum / 10;
		sum = sum % 10;
		
		push(sum, 3);
	}
	
	//This function is called after the smaller list is added to the bigger list's sublist of same size.
	void propogatecarry(node head1) {
		if (head1 != cur) {
			propogatecarry(head1.next);
			int sum = carry + head1.val;
			carry = sum / 10;
			sum %= 10;
			push(sum, 3);
		}
	}
	
	int getsize(node head) {
		int count = 0;
		while (head != null) {
			count++;
			head = head.next;
		}
		return count;
	}
	
	node cur;
	// The main function that adds two linked lists represented by head1 and head2. The sum of the two lists is stored in a list referred by result
	void addlists() {
		// First list is empty
		if (head1 == null) {
			result = head2;
			return;
		}
		
		// Second list is empty
		if (head2 == null) {
			result = head1;
			return;
		}
		
		int size1 = getsize(head1);
		int size2 = getsize(head2);
		
		//Add same size lists
		if (size1 == size2)
			addsamesize(head1, head2);
		else {
			//First list should always be larger then second otherwise swap pointers
			if (size1 < size2) {
				node temp = head1;
				head1 = head2;
				head2 = temp;
			}
			int diff = Math.abs(size1 - size2);
			node temp = head1;
			while (diff-- >= 0) {
				cur = temp;
				temp = temp.next;
			}
			
			addsamesize(cur, head2);
			propogatecarry(head1);
		}
		
		if (carry > 0)
			push(carry, 3);
			
		
	}
	
	public static void main(String[] args) {
		LinkedListAdd list = new LinkedListAdd();
		list.head1 = null;
		list.head2 = null;
		list.result = null;
		list.carry = 0;
		int arr1[] = {9, 9, 9};
		int arr2[] = {1, 8};
		
		for (int i = arr1.length - 1; i >= 0; --i)
			list.push(arr1[i], 1);
		
		for (int i = arr2.length - 1; i >= 0; --i)
			list.push(arr2[i], 2);
		
		list.addlists();
		list.printlist(list.result);
		

	}

}
