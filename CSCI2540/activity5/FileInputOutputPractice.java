package activity5;

import java.util.*;
import java.io.*; 

public class FileInputOutputPractice {

	public static void main(String[] args) {
		
		Scanner inputStream = null;
		PrintWriter outputStream = null;
		
		String file1 = "activity5_input1.txt";
		String file2 = "activity5_input2.txt";
		String file3 = "activity5_output1.txt";
		String line;

		try {
			outputStream = new PrintWriter(file3);
		}
		catch(IOException e) {
			System.out.println("Error opening file " + file3);
			System.exit(0);
		}
		
		try {
			inputStream = new Scanner(new File(file1));
		}
		catch(FileNotFoundException e) {
			System.out.println("Error opening file " + file1);
			System.exit(0);
		}
		
		while(inputStream.hasNextLine()) {
			line = inputStream.nextLine();
			outputStream.println(line);
		}
		
		try {
			inputStream = new Scanner(new File(file2));
		}
		catch(FileNotFoundException e) {
			System.out.println("Error opening file " + file2);
			System.exit(0);
		}
		
		while(inputStream.hasNextLine()) {
			line = inputStream.nextLine();
			outputStream.println(line);
		}

		inputStream.close();
		outputStream.close();
		
		System.out.println("Lines written to " + file3);
		
	}
}

