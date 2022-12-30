package activity13;

import java.io.*;
import java.util.*;

public class MapPractice {

	public static void main(String[] args) {
		HashMap<String, String> dictionary = new HashMap<String, String>();
		String filename = "activity13_input.txt";
		String inputA, inputB, search, searchFind;
		Scanner input = null;
		char option;
		Scanner kbd = new Scanner(System.in);
		
		
		try {
			input = new Scanner(new File(filename));
		}
		catch(FileNotFoundException e) {
			System.out.println("Error opening file " + filename);
			System.exit(0);
		}
		
		while(input.hasNext()) {
			
			inputA = input.nextLine();
			inputB = inputA.substring(inputA.indexOf("\t"));
			inputA = inputA.substring(0, inputA.indexOf("\t"));
			
			dictionary.put(inputA, inputB);
		}
		
		do {
			System.out.println("1. Display all airports/cities");
			System.out.println("2. Add a new airport");
			System.out.println("3. Search for an airport");
			System.out.println("4. Exit");
			System.out.print("Enter an option: ");
			option = kbd.next().charAt(0);
			
			switch(option) {
			case '1':
				//Iterator<String> airportIter = dictionary.emptySet().iterator();
			
				break;
				
			case '2':
				System.out.println("Enter airport code: ");
				inputA = kbd.nextLine();
				System.out.println("Enter airport city: ");
				inputB = kbd.nextLine();
				dictionary.put(inputA, inputB);
				break;
				
			case '3':
				System.out.println("Enter code to search: ");
				search = kbd.nextLine();
				
				searchFind = dictionary.get(search);
				System.out.println("Airport with code " + search + " goes to " + searchFind);
				break;
				
			case '4':
				System.exit(1);
				break;
				
			}
			
		}while(option!=4);
		
		kbd.close();
	}
	
	
}
