package activity2;

import java.util.Scanner;

public class SentenceProcessor {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a sentence:");
		String str = keyboard.nextLine();
		
		int length = str.length();
		
		
		switch(str.charAt(length-1)) {
		
		case '?':
			if(length % 2 == 0)
			{
				System.out.println("That's an even question.");
			}
			else
			{
				System.out.println("That's an odd question.");
			}
			break;
		
		case '!':
			System.out.println("Wow!");
			break;
		
		case ',':
			System.out.println("More to come!");
			break;
			
		default:
			System.out.println("You always say, \" " + str + "\"");
			break;
		}
		
		
		keyboard.close();
	}
}
