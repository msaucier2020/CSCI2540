/*
 * @author - Madeleine Saucier
 * A class to test ExtendedCircle and Point classes
 */

package assg2_saucierm20;

public class ExtendedCircleTest {
	
	public static void main (String[]args) {
		
		Point p1 = new Point();
		Point p2 = new Point(5,8);
		
		System.out.println("Point 1: " + p1.toString());
		System.out.println("Point 2: " + p2.toString());
		System.out.println("\n");
		
		System.out.println("The x value of Point 1 is " + p1.getX());
		p1.setX(3);
		System.out.println("The new x value of Point 1 is " + p1.getX());
		System.out.println("\n");
		
		System.out.println("The y value of Point 2 is " + p2.getY());
		p2.setY(1);
		System.out.println("The new y value of Point 2 is " + p2.getY());
		System.out.println("\n");
		
		System.out.println("Point 1: " + p1.toString());
		System.out.println("Point 2: " + p2.toString());
		System.out.println("\n");
		
		System.out.println("The distance bewteen Point 1 and Point 2: " + p1.distance(p2));
		System.out.println("\n");
		
		
		
		Point p3 = new Point(p2.getX(), p2.getY());
		Point p4 = new Point();
		
		System.out.println("Point 3: " + p3.toString());
		System.out.println("Point 4: " + p4.toString());
		System.out.println("\n");
		
		if(p1.equals(p4)) {
			System.out.println("Point 1 and Point 4 are the same");
		}
		else {
			System.out.println("Point 1 and Point 4 are not the same");
		}
		System.out.println("\n");
		
		if(p2.equals(p3)) {
			System.out.println("Point 2 and Point 3 are the same");
		}
		else {
			System.out.println("Point 2 and Point 3 are not the same");
		}
		System.out.println("\n");
		
		
		
		ExtendedCircle c1 = new ExtendedCircle();
		ExtendedCircle c2 = new ExtendedCircle(5.2);
		ExtendedCircle c3 = new ExtendedCircle(8.2, p3);
		ExtendedCircle c4 = new ExtendedCircle();
		
		
		if(c1.equals(c4)) {
			System.out.println("Circle 1 and Circle 4 are the same \n");
		}
		else
		{
			System.out.println("Circle 1 and Circle 4 are not the same \n");
		} 

		System.out.println("The center of Circle 1 is: " + c1.getCenter());
		c1.setCenter(5, 2);
		System.out.println("The new center of Circle 1 is: " + c1.getCenter() + "\n");
		
		System.out.println("The radius of Circle 2 is: " + c2.getRadius());
		c2.setRadius(3);
		System.out.println("The new radius of Circle 2 is: " + c2.getRadius() + "\n");
		
		if(c1.equals(c4)) {
			System.out.println("Circle 1 and Circle 4 are the same \n");
		}
		else
		{
			System.out.println("Circle 1 and Circle 4 are not the same \n");
		}
	
		
		System.out.println("Circle 1: \n" + c1.toString() + "\n");
		System.out.println("Circle 2: \n" + c2.toString() + "\n");
		System.out.println("Circle 3: \n" + c3.toString() + "\n");
		System.out.println("Circle 4: \n" + c4.toString() + "\n");
		
		System.out.println("Circle 5 will be a new circle based on Circle 4, shifted 4 horizontally and 1 vertically.\n");
		ExtendedCircle c5 = c4.shift(4, 1);
		System.out.println("Circle 5: \n" + c5.toString() + "\n");
		
		System.out.println("Circle 6 will be a new circle based on Circle 3, scaled by 0.5");
		ExtendedCircle c6 = c3.scale(0.5);
		System.out.println("Circle 6: \n" + c6.toString() + "\n");
		
		System.out.println("The area of Circle 3 is: " + c3.compArea());
		System.out.println("The circumference of Circle 3 is: " + c3.compCircumference() + "\n");
		
		switch(c2.positionToCircle(p1)) {
		
			case -1:
				System.out.println("Point 1 is inside of Circle 2\n");
				break;
			
			case 1:
				System.out.println("Point 1 is outside of Circle 2\n");
				break;
				
			case 0:
				System.out.println("Point 1 is on Circle 2\n");
				break;
		}
		
		switch(c1.positionToCircle(p4)) {
		
		case -1:
			System.out.println("Point 4 is inside of Circle 1\n");
			break;
		
		case 1:
			System.out.println("Point 4 is outside of Circle 1\n");
			break;
			
		case 0:
			System.out.println("Point 4 is on Circle 1\n");
			break;
	}
		
		switch(c3.positionToCircle(p1)) {
		
		case -1:
			System.out.println("Point 4 is inside of Circle 3\n");
			break;
		
		case 1:
			System.out.println("Point 4 is outside of Circle 3\n");
			break;
			
		case 0:
			System.out.println("Point 4 is on Circle 3\n");
			break;
	}
		
		if(c1.overlap(c5)) {
			System.out.println("Circle 1 and Circle 5 overlap");
		}
		else
		{
			System.out.println("Circle 1 and Circle 5 do not overlap");
		}
		
		if(c1.overlap(c2)) {
			System.out.println("Circle 1 and Circle 2 overlap");
		}
		else
		{
			System.out.println("Circle 1 and Circle 2 do not overlap");
		}
		
		
	
	}

}
