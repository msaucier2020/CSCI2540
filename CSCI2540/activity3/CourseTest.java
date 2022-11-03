package activity3;

public class CourseTest {
	
	public static void main(String[] args){
		
		
		System.out.println("Test course class: \n");
		
		Course c1 = new Course("MATH1010", "Algebra 1");
		Course c2 = new Course("CSCI3000", "Python Basics", 4);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		c1.setTitle("Calculus");
		c1.setCred(4);
		
		System.out.println("New Title: " + c1.getTitle());
		System.out.println("New Credit Value: " + c1.getCred());
		
		System.out.println("\n");
		
		c1.printInfo();
		c2.printInfo();
	}

}
