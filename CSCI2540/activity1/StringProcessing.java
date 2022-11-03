package activity1;

import java.util.Scanner;

public class StringProcessing {

	public static void main(String[] args) 
	{
		Scanner scannerObject = new Scanner(System.in);
		
		char char1, charLast;
		int strLength;
		String str2;
		
		System.out.println("Enter a string with at least 2 characters: ");
		String str = scannerObject.next();
		
		char1 = str.charAt(0);
		System.out.println("The first character is: " + char1);
		
		strLength = str.length();
		charLast = str.charAt(strLength-1);
		System.out.println("The last character is: " + charLast);
		
		str2 = str.substring(1, strLength-1);
		System.out.println("The rest of the characters are: " + str2);
		
		scannerObject.close();
	}
}
