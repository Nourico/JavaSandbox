import java.util.Vector;

class Point {
	int x, y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}


public class ConvexHull {

	// To find orientation of ordered triplet (p, q, r). 
	// The function returns following values
	// 0 --> p, q and r are co-linear
	// 1 --> Clockwise
	// 2 --> Counterclockwise
	public static int orientation(Point p, Point q, Point r) {
		int val = (q.y - p.y) * (r.x - q.x) - (q.x - p.x) * (r.y - q.y);
		if (val == 0) return 0;
		return (val > 0) ? 1:2;
	}
	
	// Prints convex hull of a set of n points
	public static void convexHull(Point points[], int n) {
		// There must be at least 3 points
		if (n < 3) return;
		
		// Initialize Result
		Vector<Point> hull = new Vector<Point>();
		
		// Find the leftmost point
		int l = 0;
		for (int i = 1; i < n; i++)
			if (points[i].x < points[l].x)
				l = i;
		
		// Start from the leftmost point, keep moving 
		// counterclockwise until reach the start point
		// again. This loop runs O(h) times where h is
		// number of points in result or output.
		int p = l, q;
		do {
			// Add current point to result
			hull.add(points[p]);
			// Search for a point 'q' such that orientation(p, x, q) is counterclockwise
			// for all points 'x'. The idea is to keep track of last visited most counterclockwise
			// point in q. If any point 'i' is more counterclockwise than q, then update q.
			q = (p + 1) % n;
			
			for (int i = 0; i < n; i++) {
				if (orientation(points[p], points[i], points[q]) == 2)
					q = i;
			}
			p = q;
		} while (p != l);
		
		for (Point temp : hull)
			System.out.println("(" + temp.x + ", " + temp.y + ")");
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
