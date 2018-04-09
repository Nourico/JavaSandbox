import java.util.LinkedList;
import java.util.Queue;

//Given a 2D screen, location of a pixel in the screen ie(x,y) and a color(K), 
//your task is to replace color of the given pixel and all adjacent(excluding 
//diagonally adjacent) same colored pixels with the given color K.
public class FloodFill {
	
	Queue<Node> q;
	
	public FloodFill() {
		
	}
	void fill(int x, int y, int K){
		Node n = new Node(x, y);
		q = new LinkedList<>();
		q.add(n);
		Node m = q.remove();
		System.out.println(m.x);
	}
	
	public static void main(String[] args) {
			int mat[][] = 	{{1, 1, 1, 1, 1, 1, 1, 1},
				             {1, 1, 1, 1, 1, 1, 0, 0},
				             {1, 0, 0, 1, 1, 0, 1, 1},
				             {1, 2, 2, 2, 2, 0, 1, 0},
				             {1, 1, 1, 2, 2, 0, 1, 0},
				             {1, 1, 1, 2, 2, 2, 2, 0},
				             {1, 1, 1, 1, 1, 2, 1, 1},
				             {1, 1, 1, 1, 1, 2, 2, 1},
				             };
			FloodFill ff = new FloodFill();
			ff.fill(3,4,3);
			
//			for (int i=0; i<mat[0].length; i++)
//		    {
//		      for (int j=0; j<mat.length; j++)
//		          System.out.print(mat[i][j] + " "); 
//		      System.out.println();
//		    }

	}

}

class Node {
	int x;
	int y;
	
	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
}