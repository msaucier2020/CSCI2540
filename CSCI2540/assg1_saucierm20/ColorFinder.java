package assg1_saucierm20;

import java.util.Scanner;

public class ColorFinder {

	//Create method to compare words from input sentence with Primary colors
	public static String Test(String str) {
		
		if(str.contains("green") || str.contains("red") || str.contains("blue"))
		{
			return "Additive Primary color found";
		}
		else if (str.contains("magenta") || str.contains("yellow") || str.contains("cyan"))
		{
			return "Subtractive Primary color found";
		}
		else
		{
			return "No Primary colors found.";
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		//holds result string
		String result;
			
		//get the sentence from user
		System.out.println("Enter a sentence: ");
		String str = keyboard.nextLine();
		str = str.toLowerCase();
		
		//test the string
		result = Test(str);
		
			
		System.out.println(result);
		
		keyboard.close();

	}
}
