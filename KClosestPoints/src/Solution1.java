import java.util.*;

class Point {
	double x;
	double y;
	public Point (double x, double y) {
		this.x = x;
		this.y = y;
	}
}

public class Solution1 {
	
	public Point[] Solution (Point[] array, Point origin, int k) {
		Point[] rvalue = new Point[k];
		int index = 0;
		//PriorityQueue<Point> pq = new PriorityQueue<Point> (k+1, new Comparator<Point>()) {
		PriorityQueue<Point> pq = new PriorityQueue<Point> (k, new Comparator<Point> () {
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
			rvalue[index++] = pq.poll();
		}
		
		return rvalue;
	}
	
	public double getDistance (Point a, Point b) {
		return Math.sqrt((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point origin = new Point(1.0, 1.0);
		Point p1 = new Point(0.0, 0.0);
		Point p2 = new Point(0.5, 0.5);
		Point p3 = new Point(0.0, 0.5);
		Point p4 = new Point(0.5, 0.0);
		Point p5 = new Point(1.0, 0.0);
		Point p6 = new Point(1.0, 1.0);
		Point p7 = new Point(0.0, 1.0);
		Point p8 = new Point(0.0, 0.8);
		Point p9 = new Point(0.8, 0.0);
		Point p10 = new Point(0.8, 0.8);
		Point[] array = new Point[10];
		array[0] = p1;
		array[1] = p2;
		array[2] = p3;
		array[3] = p4;
		array[4] = p5;
		array[5] = p6;
		array[6] = p7;
		array[7] = p8;
		array[8] = p9;
		array[9] = p10;
		Solution1 sls = new Solution1();
		Point[] res = sls.Solution(array, origin, 4);
		for (Point p : res) {
			System.out.println(p.x + ", " + p.y );
		}
	}

}
