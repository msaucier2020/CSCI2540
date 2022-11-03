/*
 * @author - Madeleine Saucier
 * A class for a point on a circle
 */
package assg2_saucierm20;

public class Point {
	
	private int x;
	private int y;
	
	
	/*
	 * default constructor
	 */
	public Point() {
		x = 0;
		y = 0;
	}
	
	/*
	 * 2-parameter constructor
	 * @param x and y coordinates
	 */
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/*
	 * get the x coordinate
	 * @return value of x
	 */
	public int getX() {
		return x;
	}

	/*
	 * get the y coordinate
	 * @return value of y
	 */
	public int getY() {
		return y;
	}
	
	/*
	 * set a new value for the x-coordinate
	 * @param the new x value
	 */
	public void setX(int newX) {
		x = newX;
	}
	
	/*
	 * set a new value for the y-coordinate
	 * @param the new y value
	 */
	public void setY(int newY) {
		y = newY;
	}
	
	/*
	 * return x and y coordinates in the format (x,y)
	 * @return string with x and y
	 */
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

	/*
	 * calculate the distance between 2 given points
	 * Square root of ((x2-x1)^2 + (y2-y1)^2)
	 * @param the second point
	 * @return distance
	 */
	public double distance(Point p2) {
		int xDist = this.x - p2.getX();
		int yDist = this.y - p2.getY();
		
		xDist *= xDist;
		yDist *= yDist;
		
		double distance = xDist + yDist;
		distance = Math.sqrt(distance);
		
		return distance;
	}
	
	/*
	 * see if two points are the same
	 * @param the point to compare as an Object
	 * @return true of the points have same x and y, false if not
	 */
	public boolean equals(Object p2) {
		
		if(p2 instanceof Point) {
			Point temp = (Point)p2;
			if(this.x == temp.x) {
				return (this.y == temp.y);
			}
		}
		return false;
	}
	
	
}
