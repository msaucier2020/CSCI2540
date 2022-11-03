package activity7;

public class Student {

	private String id;
	private String name;
	private String standing;
	private String major;
	
	public Student(String stuID, String stuName, String stuStand, String stuMaj) {
		id = stuID;
		name = stuName;
		standing = stuStand;
		major = stuMaj;
	}
	
	public String toString() {
		return "ID: " + id +"\nName: " + name + "\nStanding: " + standing + "\nMajor: " + major + "\n";
	}
	
}
