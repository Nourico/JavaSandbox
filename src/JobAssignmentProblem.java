//import java.lang.reflect.Array;
//import java.util.Arrays;
//
//class JNode {
//	JNode parent;
//	int pathCost;
//	int cost;
//	int workerID;
//	int jobID;
//	boolean[] assigned;
//	
//	public JNode(int x, int y, boolean[] assigned, JNode parent) {
//		int N = assigned.length;
//		for(int j = 0; j < N; j++)
//			this.assigned[j] = assigned[j];
//		this.assigned[y] = true;
//		this.parent = parent;
//		this.workerID = x;
//		this.jobID = y;
//	}
//}
//
//
//
//public class JobAssignmentProblem {
//
//	int calculateCost(int costMatrix[][], int x, int y, boolean[] assigned) {
//		int cost = 0;
//		int N = costMatrix[0].length;
//		boolean available[] = new boolean[N];
//		Arrays.fill(available, true);
//		
//		for (int i = x + 1; i < N; i++) {
//			int min = Integer.MAX_VALUE, minIndex = -1;
//			for (int j = 0; j < N; j++) {
//				if (!assigned[j] && available[j] && costMatrix[i][j] < min) {
//					minIndex = j;
//					min = costMatrix[i][j];
//				}
//			}
//			
//			cost += min;
//			available[minIndex] = false;
//		}
//		
//		return cost;
//	}
//	
//	void printAssignments(JNode min) {
//		if (min.parent == null)
//			return;
//		printAssignments(min.parent);
//		System.out.println("Assign worker "+ min.workerID + "A to job" + min.jobID);
//	}
//	
//	int findMinCost(int costMatrix[][]) {
//		int N = costMatrix[0].length;
//	}
//	
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
