package assg5_saucierm20;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestExtendedCircle {

	private ExtendedCircle c1, c2, c3;
	private Point p1 = new Point(3,3);
	
	@Before
	public void setUp() {
		c1 = new ExtendedCircle();
		c2 = new ExtendedCircle(8.5);
		c3 = new ExtendedCircle(3.2, p1);
	}
	
	@Test
	public void testDefaultConstructor() {
		assertEquals("C1 center x-value: ", 0, c1.getCenter().getX());
		assertEquals("C1 center y-value: ", 0, c1.getCenter().getY());
		assertEquals("C1 radius: ", 1, c1.getRadius(), 0.0001);
	}
	
	@Test
	public void testConstructorOne() {
		assertEquals("C2 center x-value: ", 0, c2.getCenter().getX());
		assertEquals("C2 center y-value: ", 0, c2.getCenter().getY());
		assertEquals("C2 radius: ", 8.5, c2.getRadius(), 0.0001);
	}
	
	@Test
	public void testConstructorThree() {
		assertEquals("C3 center x-value: ", 3, c3.getCenter().getX());
		assertEquals("C3 center y-value: ", 3, c3.getCenter().getY());
		assertEquals("C3 radius: ", 3.2, c3.getRadius(), 0.0001);
	}
	
	@Test
	public void testSetRadius() {
		c1.setRadius(5.6);
		assertEquals("C1 radius: ", 5.6, c1.getRadius(), 0.0001);
		c2.setRadius(9.2);
		assertEquals("C2 radius: ", 9.2, c2.getRadius(), 0.0001);
	}
	
	@Test 
	public void testSetCenter() {
		c1.setCenter(2, 1);
		c2.setCenter(4, 5);
		c3.setCenter(8, 0);
		
		assertEquals("C1 center: ", new Point(2,1), c1.getCenter());
		assertEquals("C2 center:", new Point(4,5), c2.getCenter());
		assertEquals("C3 center: ", new Point(8,0), c3.getCenter());	
	}
	
	@Test
	public void testCompArea() {
		assertEquals("C1 area: ", 3.14, c1.compArea(), 0.0001);
		assertEquals("C2 area: ", 226.865, c2.compArea(), 0.0001);
		assertEquals("C3 area: ", 32.1536, c3.compArea(), 0.0001);	
	}
	
	@Test
	public void testCompCircumference() {
		assertEquals("C1 circumference: ", 6.28, c1.compCircumference(), 0.0001);
		assertEquals("C2 circumference: ", 53.38, c2.compCircumference(), 0.0001);
		assertEquals("C3 circumference: ", 20.096, c3.compCircumference(), 0.0001);
	}

	@Test
	public void testToString() {
		assertEquals("C1 to String: ", "Radius: 1.0\nCenter: (0, 0)", c1.toString());
		assertEquals("C2 to String: ", "Radius: 8.5\nCenter: (0, 0)", c2.toString());
		assertEquals("C3 to String: ", "Radius: 3.2\nCenter: (3, 3)", c3.toString());
	}
	
	@Test
	public void testPositionToCircle() {
		assertEquals("(1, 0) in relation to C1: ", 0, c1.positionToCircle(new Point(1,0)));
		assertEquals("(1, 0) in relation to C2: ", -1, c2.positionToCircle(new Point(1,0)));
		assertEquals("(3, 9) in relation to C3: ", 1, c3.positionToCircle(new Point(3,9)));
	}
	
	@Test
	public void testShift() {
		ExtendedCircle s1 = c1.shift(7, 8);
		ExtendedCircle s2 = c3.shift(-2, -1);
		
		assertEquals("C1 shifted right 7 and up 8: ", new ExtendedCircle(1, new Point(7,8)), s1);
		assertEquals("C3 shifted left 2 and down 1: ", new ExtendedCircle(3.2, new Point(1,2)), s2);
	}
	
	@Test
	public void testScale() {
		ExtendedCircle s1 = c1.scale(4);
		ExtendedCircle s2 = c2.scale(0.5);
		
		assertEquals("C1 scaled by 4: ", new ExtendedCircle(4), s1);
		assertEquals("C2 scaled by 0.5: ", new ExtendedCircle(4.25), s2);
	}
	
	@Test 
	public void testOverlap() {
		ExtendedCircle o1 = new ExtendedCircle(2, new Point(2,1));
		
		assertTrue("C1 overlap circle with radius = 2 and center = (2, 1)", c1.overlap(o1));
		assertFalse("C1 overlap with C3: ", c1.overlap(c3));
	}
	
	@Test
	public void testEquals() {
		ExtendedCircle e1 = new ExtendedCircle(3.2, p1);
		
		assertFalse("C2 equals C3: ", c2.equals(c3));
		assertFalse("C1 equals C2: ", c1.equals(c2));
		assertTrue("C3 equals circle with radius = 3.2 and center (3, 3): ", c3.equals(e1));
	}
}
