import java.util.Stack;

class Result {
	public LNode node;
	public boolean result;
	
	public Result(LNode node, boolean result) {
		this.node = node;
		this.result = result;
	}
}

public class LNode {
	LNode next = null;
	int data;
	
	public LNode(int d) {
		data = d;
	}
	
	static Result isPalindromeRecurse(LNode head, int length) {
		if (head == null || length == 0) {
			return new Result(head, true);
		} else if (length == 1) {
			return new Result(head.next, true);
		} else if (length == 2) {
			return new Result(head.next.next, head.data == head.next.data);
		}
		Result res = isPalindromeRecurse(head.next, length-2);
		if (!res.result || res.node == null)
			return res;
		else {
			res.result = head.data == res.node.data;
			res.node = res.node.next;
			return res;
		}
	}
		
	static boolean isPalindrome(LNode head) {
		Result p = isPalindromeRecurse(head, listSize(head));
		return p.result;
	}
	
	static int listSize(LNode head) {
		int count = 0;
		LNode node = head;
		while (node != null) {
			count++;
			node = node.next;
		}
		return count;
	}
	
	public static void main(String[] args) {
		LNode h = new LNode(4);
		h.next = new LNode(2);
		h.next.next = new LNode(3);
		h.next.next.next = new LNode(3);
		h.next.next.next.next = new LNode(2);
		h.next.next.next.next.next = new LNode(4);
		System.out.println(isPalindrome(h));
	}

}
