//import java.awt.Point;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class QuickHull {
//
//	public ArrayList<Point> quickHull(ArrayList<Point> points){
//		ArrayList<Point> convexHull = new ArrayList<Point>();
//		if (points.size() < 3)
//			return (ArrayList) points.clone();
//
//		int minPoint = -1, maxPoint = -1;
//		int minX = Integer.MAX_VALUE;
//		int maxX = Integer.MIN_VALUE;
//		for (int i = 0; i < points.size(); i++) {
//			if (points.get(i).x < minX) {
//				minX = points.get(i).x;
//				minPoint = i;
//			}
//			if (points.get(i).x > maxX) {
//				maxX = points.get(i).x;
//				maxPoint = i;
//			}
//		}
//
//		Point A = points.get(minPoint);
//		Point B = points.get(maxPoint);
//		convexHull.add(A);
//		convexHull.add(B);
//		points.remove(A);
//		points.remove(B);
//
//		ArrayList<Point> leftSet = new ArrayList<Point>();
//		ArrayList<Point> rightSet = new ArrayList<Point>();
//
//		for (int i = 0; i < points.size(); i++) {
//			Point p = points.get(i);
//			if (pointLocation(A, B, p) == -1)
//				leftSet.add(p);
//			else if (pointLocation(A, B, p) == 1)
//				rightSet.add(p);
//		}
//		hullSet(A, B, rightSet, convexHull);
//		hullSet(A, B, leftSet, convexHull);
//
//		return convexHull;
//	}
//
//	public int distance(Point A, Point B, Point C) {
//
//	}
//
//	public void hullSet(Point A, Point B, ArrayList<Point> set, ArrayList<Point> hull) {
//		int insertPosition = hull.indexOf(B);
//		if (set.size() == 0)
//			return;
//		if (set.size() == 1) {
//
//		}
//	}
//
//	public int pointLocation(Point A, Point B, Point C) {
//
//	}
//
//	public static void main(String[] args) {
//		System.out.println("Quick Hull Test");
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number of points");
//		int N = sc.nextInt();
//
//		ArrayList<Point> points = new ArrayList<Point>();
//		System.out.println("Enter the coordinates of each points: <x> <y>");
//		for(int i = 0; i < N; i++) {
//			int x = sc.nextInt();
//			int y = sc.nextInt();
//			Point e = new Point(x, y);
//			points.add(i, e);
//		}
//
//		QuickHull qh = new QuickHull();
//		ArrayList<Point> p = qh.quickHull(points);
//		System.out.println("The points in the Convex hull using Quick hull are: ");
//		for (int i = 0; i < p.size(); i++)
//			System.out.println("(" + p.get(i).x + ", " + p.get(i).y + ")");
//		sc.close();
//	}
//
//}
