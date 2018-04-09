import java.util.HashMap;

class CNode {
	int key;
	int value;
	CNode pre;
	CNode next;
	
	public CNode(int key, int value) {
		this.key = key;
		this.value = value;
	}
}

public class LRUCache {

	int capacity;
	HashMap<Integer, CNode> map = new HashMap<Integer, CNode>();
	CNode head = null;
	CNode end = null;
	
	public LRUCache(int capacity) {
		this.capacity = capacity;
	}

	
	
	int get(int key) {
		if (map.containsKey(key)) {
			CNode n = map.get(key);
			remove(n);
			setHead(n);
			return n.value;
		}
		return -1;
	}
	
	public void remove(CNode n) {
		if (n.pre != null) {
			n.pre.next = n.next;
		} else {
			head = n.next;
		}
		
		if (n.next != null) {
			n.next.pre = n.pre;
		} else {
			end = n.pre;
		}
	}
	
	public void setHead(CNode n) {
		n.next = head;
		n.pre = null;
		
		if (head != null)
			head.pre = n;
		
		if (end == null)
			end = head;
	}
	
	void set(int key, int value) {
		if (map.containsKey(key)) {
			CNode old = map.get(key);
			old.value = value;
			remove(old);
			setHead(old);
		} else {
			CNode created = new CNode(key, value);
			if (map.size() >= capacity) {
				map.remove(end.key);
				remove(end);
				setHead(created);
			} else {
				setHead(created);
			}
			map.put(key, created);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
