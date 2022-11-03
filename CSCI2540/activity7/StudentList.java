package activity7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentList implements StudentListInterface{

	private ArrayList<Student> studentRoster;
	Scanner input;
	private String line;
	
	public StudentList() {
		studentRoster = new ArrayList<Student>();
		line = null;
		input = null;
	}
	
	public void loadData(String filename) {
		try {
			input = new Scanner(new File(filename));
		}
		catch(FileNotFoundException e) {
			System.out.println("Error opening file " + filename);
			System.exit(0);
		}
		
		while(input.hasNextLine()) {
			line = input.nextLine();
			
			int index = line.indexOf(',');
			String id = line.substring(0,index);
			line = line.substring(index+1);
			
			index = line.indexOf(',');
			String name = line.substring(0, index);
			line = line.substring(index+1);
			
			index = line.indexOf(',');
			String stand = line.substring(0, index);
			line = line.substring(index+1);
			
			String major = line;
			
			studentRoster.add(new Student(id, name, stand, major));
		}
		input.close();
	}
	
	public void displayRoster() {
		for(int i = 0; i < studentRoster.size(); i++) {
			System.out.println(studentRoster.get(i).toString());
		}
	}
}
