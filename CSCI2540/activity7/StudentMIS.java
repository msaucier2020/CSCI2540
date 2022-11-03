package activity7;

public class StudentMIS {

	public static void main(String[] args) {
		
		StudentList l1 = new StudentList();
		
		l1.loadData("assg6_data.txt");
		l1.displayRoster();
	}
}
