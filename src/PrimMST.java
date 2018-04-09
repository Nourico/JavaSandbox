
public class PrimMST {

	// Number of vertices in the graph
	private static final int V = 5;
	
	// A utility function to find the vertex with minimum key value
	// from the set of vertices not yet included on MST
	int minKey(int key[], Boolean mstSet[]) {
		// Initialize min value
		int min = Integer.MAX_VALUE, min_index = -1;
		
		for (int v = 0; v < V; v++)
			if (mstSet[v] == false && key[v] < min) {
				min = key[v];
				min_index = v;
			}
		
		return min_index;
	}

	// A utility function to print the constructed MST stored in parent[]
	void printMST(int parent[], int n, int graph[][]) {
		System.out.println("Edge weight");
		for (int i = 1; i < V; i++)
			System.out.println(parent[i] + " - " + i+ " " + graph[i][parent[i]]);
	}
	
	// Function to construct and print MST for a graph represented using adjacency matrix representation
	void primMST(int graph[][]) {
		// Array to store constructed MST
		int parent[] = new int[V];
		
		// Key values use to pick minimum weight edge in cut
		int key[] = new int[V];
		
		// To represent set of vertices not yet included in MST
		Boolean mstSet[] = new Boolean[V];
		
		// Initialize all keys as INFINITE
		for (int i = 0; i < V; i++) {
			key[i] = Integer.MAX_VALUE;
			mstSet[i] = false;
		}
		
		key[0] = 0;
 		parent[0] = -1;
 		
 		for (int count = 0; count < V-1; count++) {
 			int u = minKey(key, mstSet);
 			mstSet[u] = true;
 			
 			for (int v = 0; v < V; v++) {
 				if (graph[u][v] != 0 && mstSet[v] == false && graph[u][v] < key[v]) {
 					parent[v] = u;
 					key[v] = graph[u][v];
 				}
 			}
 		}
 		
 		printMST(parent, V, graph);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
