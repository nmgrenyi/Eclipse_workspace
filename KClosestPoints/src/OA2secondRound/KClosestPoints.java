package OA2secondRound;

import java.util.*;
class Point {
	double x;
	double y;
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
}

public class KClosestPoints {
	
	static class NewComparator implements Comparator<Point>{
		public int compare(Point p1, Point p2) {
			if (distance(p1) < distance(p2)) {
				return 1;
			}
			else if (distance(p1) == distance(p2)){
				return 0;
			}
			else {
				return -1;
			}
			//return distance(p1) - distance(p2);
		}
	}
	
	public static double distance (Point p) {
		return Math.sqrt(p.x * p.x + p.y * p.y);
	}
	public static double getDistance (Point a, Point b) {
		return Math.sqrt((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y));
	}
	
	public static Point[] getKNearestPoints(Point[] array, int k) {
		// write your code here
		Point[] rvalue = new Point[k];
		Point origin = new Point(0, 0);
		/*
		if (array == null || array.length == 0) {
			return array;
		}
		if (k <= 0) {
			return new Point[0];
		}
		if (k > array.length) {
			k = array.length;
		}
		int index = k - 1;
		//PriorityQueue<Point> pq = new PriorityQueue<Point> (k+1, new Comparator<Point>()) {
		PriorityQueue<Point> pq = new PriorityQueue<Point> (k + 1, new Comparator<Point> () {
			//最大堆
			public int compare (Point a, Point b) {
				if (getDistance(b, origin) >= getDistance(a, origin)) {
					return 1;
				} else if (getDistance(b, origin) == getDistance(a, origin)) {
					return 0;
				} else {
					return -1;
				}
			}
		});
		
		for (int i = 0; i < array.length; i++) {
			pq.offer(array[i]);
			if (pq.size() > k) {
				pq.poll();
			}
		}
		
		while (!pq.isEmpty()) {
			rvalue[index--] = pq.poll();
		}
		return rvalue;
		*/
		
		
		
		if (k > array.length) {
			return array;
		}
		if (k <= 0) {
			return new Point[0];
		}
		NewComparator cmp = new NewComparator();
		//Collections.sort(points, cmp);
		
		Queue<Point> pq = new PriorityQueue<Point>(k, cmp); 
		for (Point p : array) {
			pq.offer(p);
			if (pq.size() > k) {
				pq.poll();
			}
		}
		Point[] res = new Point[k];
		int i = k - 1;
		while(pq.size() != 0) {
			res[i] = pq.poll();
			i--;
		}
		return res;
		
	}
	
	public static void main(String[] argc) {
		KClosestPoints s = new KClosestPoints();
		
		// Test case 1
		Point[] test1 = new Point[5];
		test1[0] = new Point(0, 1);
		test1[1] = new Point(7, 8);
		test1[2] = new Point(2, 6);
		test1[3] = new Point(3, 7);
		test1[4] = new Point(-2, 8);
		Point[] results = s.getKNearestPoints(test1, 3);
		System.out.println(results[0].x + " " + results[0].y);
		System.out.println(results[1].x + " " + results[1].y);
		System.out.println(results[2].x + " " + results[2].y);
		if(results[0] == test1[0] && results[1] == test1[2] && results[2] == test1[3]) {
			System.out.println("test case 1 correct!");
		} else {
			System.out.println("test case 1 wrong!");
		}
		// s.print(results);
		
		// Test case 2
		Point[] test2 = new Point[4];
		test2[0] = new Point(0, 4);
		test2[1] = new Point(4, 0);
		test2[2] = new Point(0, -4);
		test2[3] = new Point(-4, 0);
		results = s.getKNearestPoints(test2, 3);
//		System.out.println(results[0].x + " " + results[0].y);
//		System.out.println(results[1].x + " " + results[1].y);
//		System.out.println(results[2].x + " " + results[2].y);
		if(results[0] == test2[1] && results[1] == test2[2] && results[2] == test2[3]) {
			System.out.println("test case 2 correct!");
		} else {
			System.out.println("test case 2 wrong!");
		}
		// s.print(results);
		
		// Test case 3
		Point[] test3 = new Point[3];
		test3[0] = new Point(0, 4);
		test3[1] = new Point(0, 2);
		test3[2] = new Point(0, 1);
		results = s.getKNearestPoints(test3, 5);
		if(results[0] == test3[2] && results[1] == test3[1] && results[2] == test3[0]) {
			System.out.println("test case 3 correct!");
		} else {
			System.out.println("test case 3 wrong!");
		}
		// s.print(results);
		
		// Test case 4
		Point[] test4 = new Point[0];
		results = s.getKNearestPoints(test4, 8);
		if(results.length == 0) {
			System.out.println("test case 4 correct!");
		} else {
			System.out.println("test case 4 wrong!");
		}
		// s.print(results);
		
		// Test case 5
		Point[] test5 = new Point[2];
		test5[0] = new Point(0, 1);
		test5[1] = new Point(1, 0);
		results = s.getKNearestPoints(test5, 0);
		if(results.length == 0) {
			System.out.println("test case 5 correct!");
		} else {
			System.out.println("test case 5 wrong!");
		}
		// s.print(results);
		
//		// Test case 6
//		Point[] test6 = new Point[3];
//		test6[0] = new Point(Double.MIN_VALUE, Double.MAX_VALUE);
//		test6[1] = new Point(Double.MIN_VALUE, Double.MIN_VALUE);
//		test6[1] = new Point(Double.MAX_VALUE, Double.MAX_VALUE);
//		results = s.getKNearestPoints(test5, 2);
//		if(results[0] == test6[0] && results[1] == test6[1]) {
//			System.out.println("test case 6 correct!");
//		} else {
//			System.out.println("test case 6 wrong!");
//		}
//		// s.print(results);
		
	}
	
//	private void print(Point[] ps) {
//		for(Point p : ps) {
//			System.out.println("[x: " + p.x + " y: " + p.y + "]");
//		}
//		System.out.println("Done!");
//	}
}
