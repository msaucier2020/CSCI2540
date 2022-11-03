package activity6;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCourse {

	private Course c1, c2;
	
	@Before
	public void setUp() {
		c1 = new Course("CS100", "Computer Science Intro");
		c2 = new Course("CS200", "Advanced Comp Sci", 4);
	}
	
	@Test
	public void testConstructorTwo() {
		assertEquals("Course number: ", "CS100", c1.getNo());
		assertEquals("Course title: ", "Computer Science Intro", c1.getTitle());
		assertEquals("Course credit: ", 3, c1.getCred());
	}
	
	@Test
	public void testConstructorThree() {
		assertEquals("Course number: ", "CS200", c2.getNo());
		assertEquals("Course title: ", "Advanced Comp Sci", c2.getTitle());
		assertEquals("Course credit: ", 4, c2.getCred());
	}
	
	@Test
	public void testSetTitle() {
		c1.setTitle("Intro to Comp Sci");
		assertEquals("Course title: ", "Intro to Comp Sci", c1.getTitle());
	}
	
	@Test
	public void testSetCred() {
		c1.setCred(2);
		c2.setCred(5);
		assertEquals("Course credit: ", 2, c1.getCred());
		assertEquals("Course credit: ", 5, c2.getCred());
	}
	
	@Test
	public void testToString(){
		assertEquals("String: ", "CS100 - Computer Science Intro(3)\n", c1.toString());
		assertEquals("String: ", "CS200 - Advanced Comp Sci(4)\n", c2.toString());
	}

}
