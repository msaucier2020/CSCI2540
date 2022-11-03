package activity6;

public class Course {
	
	private String courseNo;
	private String title;
	private int credit;
	
	/*
	 * 2 parameter constructor
	 */
	public Course(String givenNo, String givenTitle) {
		courseNo = givenNo;
		title = givenTitle;
		credit = 3;
	}

	/*
	 * 3 parameter constructor
	 */
	public Course(String givenNo, String givenTitle, int givenCred) {
		courseNo = givenNo;
		title = givenTitle;
		credit = givenCred;
	}
	
	/*
	 * retrieve course number
	 * @return course number
	 */
	public String getNo() {
		return courseNo;
	}
	
	/*
	 * retrieve course name
	 * @return title of course
	 */
	public String getTitle() {
		return title;
	}
	
	/*
	 * retrieve number of credits course is worth
	 * @return credit number
	 */
	public int getCred() {
		return credit;
	}
	
	/*
	 * Modify title of course
	 * @param new course name
	 */
	public void setTitle(String newName) {
		title = newName;
	}
	
	/*
	 * Modify number of credits course is worth
	 * @param new credit value
	 */
	public void setCred(int newCred) {
		credit = newCred;
	}
	
	/*
	 * return string with course information
	 * @return string with course number, name, and credit value 
	 */
	public String toString() {
		return courseNo + " - " + title + "(" + credit + ")\n";
	}
	
	/*
	 * print course information
	 */
	public void printInfo() {
		System.out.println(courseNo + " - " + title);
	}
}
