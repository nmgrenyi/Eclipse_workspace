import java.util.*;

/*
class Rectangle {
	Point leftTop;
	Point bottomRight;
	public Rectangle (Point leftTop, Point bottomRight) {
		this.leftTop = leftTop;
		this.bottomRight = bottomRight;
	}
}
*/

class Point {
	int x, y;
	public Point (int x, int y) {
		this.x = x;
		this.y = y;
	}
}
public class Solution2 {
	
	public static boolean isOverLap (Rectangle a, Rectangle b) {
		//top or down
		if ((a.bottomRight.y > b.leftTop.y) || (b.bottomRight.y > a.leftTop.y)) {
			return false;
		}
		//left or right
		if ((a.bottomRight.x < b.leftTop.x) || (b.bottomRight.x < a.leftTop.x)) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//rec a 
		Point a_leftTop = new Point(0, 10);
		Point a_bottomRight = new Point(10, 0);
		Point b_leftTop = new Point(12, 9);
		Point b_bottomRight = new Point(19, 1);
		
		Rectangle a = new Rectangle(a_leftTop, a_bottomRight);
		Rectangle b = new Rectangle(b_leftTop, b_bottomRight);
		
		System.out.println(isOverLap(a, b));

	}

}
