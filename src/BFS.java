//import java.util.LinkedList;
//
//enum State {
//	Unvisited, Visited, Visiting;
//}
//
//
//
//public class BFS {
//
//	public static boolean search(Graph g, Node start, Node end) {
//		// operates as a queue
//		LinkedList<Node> q = new LinkedList<Node>();
//		for(Node u: g.getNodes()) {
//			u.state = State.Unvisited;
//		}
//		start.state = State.Visiting;
//		q.add(start);
//		Node u;
//		while(!q.isEmpty()) {
//			u.removeFirst();
//			if (u != null) {
//				for(Node v: u.getAdjacent()) {
//					if (v.state == State.Unvisited) {
//						if (v == end)
//							return true;
//						else {
//							v.state = State.Visiting;
//							q.add(v);
//						}
//					}
//				}
//				u.state = State.Visited;
//			}
//		}
//		return false;
//	}
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
