import java.util.Iterator;
import java.util.LinkedList;

public class Bridge {

	private int V;
	
	// Array of lists for Adjacency list representation
	private LinkedList<Integer> adj[];
	int time = 0;
	static final int NIL = -1;
	
	Bridge(int v) {
		V = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; i++) {
			adj[i] = new LinkedList();
		}
	}
	
	void addEdge(int v, int w) {
		adj[v].add(w);
		adj[w].add(v);
	}
	
	// A recursive function that finds and prints bridges using DFS traversal.
	// u --> The vertex to be visited next. visited[] --> keeps track of visited vertices
	// disc[] --> Stores discovery times of visited vertices
	// parent[] --> Stores parent vertices in DFS tree
	void bridgeUtil(int u, boolean visited[], int disc[], int low[], int parent[]) {
		int children = 0;
		visited[u] = true;
		disc[u] = low[u] = ++time;
		
		Iterator<Integer> i = adj[u].iterator();
		while (i.hasNext()) {
			int v = i.next();
			if (!visited[v]) {
				parent[v] = u;
				bridgeUtil(v, visited, disc, low, parent);
			}
		}
	}
	
	void bridge() {
		boolean visited[] = new boolean[V];
		int disc[] = new int[V];
		int low[] = new int[V];
		int parent[] = new int[V];
		
		for (int i = 0; i < V; i++) {
			parent[i] = NIL;
			visited[i] = false;
		}
		
		for (int i = 0; i < V; i++)
			if (visited[i] == false)
				bridgeUtil(i, visited, disc, low, parent);
	}
	
	
	public static void main(String[] args) {
		Bridge g1 = new Bridge(5);
		g1.addEdge(1, 0);
        g1.addEdge(0, 2);
        g1.addEdge(2, 1);
        g1.addEdge(0, 3);
        g1.addEdge(3, 4);
        g1.bridge();		

	}

}
