package activity4;

public class SpecialTopicCourse extends Course {
	
	String topic;

	public SpecialTopicCourse(String courseNo, String title, String givenTopic) {
		super(courseNo, title);
		topic = givenTopic;
	}
	
	public SpecialTopicCourse(String courseNo, String title, int credit, String givenTopic) {
		super(courseNo, title, credit);
		topic = givenTopic;
	}
	
	public String getTopic() {
		return topic;
	}
	
	public void setTopic(String newTopic) {
		topic = newTopic;
	}
	
	public String toString() {
		return this.getNo() + " - " + this.getTitle() + "(" + this.getCred() + ")" + "(Topic: " + topic + ")";
	}
	
	public void printInfo() {
		System.out.println(this.getNo() + " - " + this.getTitle() + "(Topic: " + topic + ")");
	}
	
	public boolean equals(Object courseTest) {
		if(courseTest instanceof SpecialTopicCourse) {
			SpecialTopicCourse temp = (SpecialTopicCourse)courseTest;
			if(this.getNo().equals(temp.getNo())) {
				if(this.getTopic().equals(temp.getTopic())) {
					return true;
				}
			}
		}
		return false;
	}
}
