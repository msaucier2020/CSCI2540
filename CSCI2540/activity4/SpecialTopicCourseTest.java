package activity4;

public class SpecialTopicCourseTest {

	public static void main(String[] args) {
		
		SpecialTopicCourse c1 = new SpecialTopicCourse("CSCI3090", "Special Topic in Computer Science", "Web Processing");
		SpecialTopicCourse c2 = new SpecialTopicCourse("CSCI4205", "Special Topic in Computer Science", 4, "Cybersecurity");
		Course c3 = new SpecialTopicCourse("CSCI2500", "Data Structures with Java", "Data Structures");

		c1.setTopic("Data Analysis");
		System.out.println(c1.getTopic());
		
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
	
		c1.printInfo();
		c2.printInfo();
		c3.printInfo();
		
		
		if(c1.equals(c2)) {
			System.out.println("C1 equals C2");
		}
		else {
			System.out.println("C1 does not equal C2");
		}
		
		if(c1.equals(c3)) {
			System.out.println("C1 equals C3");
		}
		else {
			System.out.println("C1 does not equal C3");
		}
	
	}
}
