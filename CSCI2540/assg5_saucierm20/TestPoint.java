package assg5_saucierm20;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestPoint {

	private Point p1, p2;
	
	@Before
	public void setUp() {
		p1 = new Point();
		p2 = new Point(3,6);
	}
	
	@Test
	public void testDefaultConstructor() {
		assertEquals("X-Value Point 1: ", 0, p1.getX());
		assertEquals("Y-Value Point 1: ", 0, p1.getY());
	}
	
	@Test
	public void testConstructorTwo() {
		assertEquals("X-Value Point 2: ", 3, p2.getX());
		assertEquals("Y-Value Point 2: ", 6, p2.getY());
	}
	
	@Test
	public void testSetX() {
		p1.setX(9);
		assertEquals("X-Value Point 1: ", 9, p1.getX());
	}
	
	@Test
	public void testSetY() {
		p2.setY(5);
		assertEquals("Y-Value Point 1: ", 5, p2.getY());
	}
	
	@Test
	public void testToString() {
		assertEquals("P1 to String: ", "(0, 0)", p1.toString());
		assertEquals("P2 to String: ", "(3, 6)", p2.toString());
	}
	
	@Test
	public void testDistance() {
		assertEquals("Distance between P1 and P2", Math.sqrt(45), p1.distance(p2), 0.0001);
		assertEquals("Distance between P1 and (0,4)", 4, p1.distance(new Point(0,4)), 0.001);
		assertEquals("Distance between P2 and (7,6)", 4, p2.distance(new Point(7,6)), 0.001);
	}
	
	@Test 
	public void testEquals() {
		assertFalse("P1 and P2 should not be equal", p1.equals(p2));
		assertTrue("P1 and (0, 0) should be equal", p1.equals(new Point(0,0)));
	}
}
