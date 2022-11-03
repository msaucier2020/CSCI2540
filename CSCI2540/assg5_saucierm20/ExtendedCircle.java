/*
 * @author - Madeleine Saucier
 * A class for a Circle
 */
package assg5_saucierm20;

public class ExtendedCircle {

	double radius;
	Point center = new Point();
	public static final double PI = 3.14;
	
	/*
	 * default constructor
	 * sets radius to 1 and center to (0,0)
	 */
	public ExtendedCircle() {
		radius = 1;
		center.setX(0);
		center.setY(0);
		
	}
	
	/*
	 * one-parameter constructor
	 * sets center to (0,0)
	 * @param radius
	 */
	public ExtendedCircle(double r) {
		radius = r;
		center.setX(0);
		center.setY(0);
		
	}
	
	/*
	 * two-parameter constructor
	 * @param radius r and center point c
	 */
	public ExtendedCircle(double r, Point c) {
		radius = r;
		center.setX(c.getX());
		center.setY(c.getY());
		
	}
	
	/*
	 * get the circle's radius value
	 * @return a double of the radius
	 */
	public double getRadius() {
		return radius;
	}
	
	/*
	 * change the radius of a certain circle
	 * @param the new radius for the circle
	 */
	public void setRadius(double newR) {
		radius = newR;
	}
	
	/*
	 * return the center point of a circle
	 * @return the center of the circle as a Point
	 */
	public Point getCenter() {
		return center;
	}
	
	/*
	 * change the center point of a circle
	 * @param new x and y values for the center of the circle
	 */
	public void setCenter(int newX, int newY) {
		center.setX(newX);
		center.setY(newY);
	}
	
	/*
	 * compute the area of the circle
	 * @return double value of the area
	 */
	public double compArea() {
		return PI*radius*radius;
	}
	
	/*
	 * compute the circumference of the circle
	 * @return double value of the circumference
	 */
	public double compCircumference() {
		return 2*PI*radius;
	}
	
	/*
	 * give a string with information about the circle
	 * @return string including circle's radius and center point
	 */
	public String toString() {
		return "Radius: " + radius + "\nCenter: " + center.toString();
	}
	
	/*
	 * determine where a point is in relation to the circle
	 * @param the point to be tested
	 * @return -1 if inside circle, 0 if on the circle, 1 if outside the circle
	 */
	public int positionToCircle(Point p) {
		double dist = this.center.distance(p);
		
		if (dist > radius) {
			return 1;
		}
		else if (dist < radius) {
			return -1;
		}
		return 0;
	}
	
	/*
	 * create a new circle that is shifted from an original circle using given x and y values
	 * @param distances to shift horizontally (x) and vertically (y)
	 * @return a new circle
	 */
	public ExtendedCircle shift(int xShift, int yShift) {
		Point shiftPoint = new Point(this.center.getX() + xShift, this.center.getY() + yShift);
		ExtendedCircle shiftCircle = new ExtendedCircle(this.radius, shiftPoint);
		
		return shiftCircle;
	}
	
	/*
	 * create a new circle based off of an old circle with the radius scaled by a factor
	 * @param factor to scale the circle by
	 * @return the new circle
	 */
	public ExtendedCircle scale(double scale) {
		double scaleR = this.radius*scale;
		ExtendedCircle scaleCircle = new ExtendedCircle(scaleR, this.center);
		
		return scaleCircle;
	}
	
	/*
	 * check to see if 2 circles overlap
	 * @param circle to check overlap with
	 * @return 0 if false (Distance btwn centers > sum of radius), 1 if true (distance < sum)
	 */
	public boolean overlap(ExtendedCircle c) {
		double overlapDist = this.center.distance(c.center);
		double radiusSum = this.radius + c.radius;
		
		return overlapDist <= radiusSum;
			
	}
	
	/*
	 * check to see if 2 circles are the same
	 * @param circle as an object
	 * @return true if radius and center are the same, false if not
	 */
	public boolean equals(Object c) {
		
		if(c instanceof ExtendedCircle) {
			ExtendedCircle temp = (ExtendedCircle)c;
			
			if(this.radius == temp.radius) {
				return this.center.equals(temp.center);
			}
		}
		
		return false;
	}
}


