/*
 * @author - Madeleine Saucier
 * use recursion to search a string for a given character
 */

package activity6;

import java.util.*;

public class RecursionPractice {

	public static void main(String[] args) {
		char character;
		String str;
		
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("Enter a character: ");
		character = kbd.nextLine().charAt(0);
		
		System.out.println("Enter a string: ");
		str = kbd.nextLine();
		
		if(searchFirst(character, str) < 0 && searchLast(character, str) < 0) {
			System.out.println(character + " is not found in string " + str + " \n");
		}
		else {
			System.out.println(character + " is first found at letter number " + searchFirst(character, str) + " of the string " + str + "\n");
			System.out.println(character + " is last found at letter number " + searchLast(character, str) + " of the string " + str + "\n");
		}
		
		kbd.close();
	}
	
	public static int searchFirst(char character, String str) {

		if(str.equals("") || str == null) {
			return -1;
		}
		else if (str.length() > 0) {
			if (str.charAt(0) == character) {
				return 1;
			}
			else {
				int index = searchFirst(character, str.substring(1));
				return index == -1 ? -1: index+1;
			}
		}
		else {
			return 0;
		}
		
		
	}
	
	public static int searchLast(char character, String str) {
		
		if(str.equals("") || str == null) {
			return -1;
		}
		else if (str.length() > 0) {
			if (str.charAt(str.length()-1) == character) {
				return str.length();
			}
			else {

				int index = searchLast(character, str.substring(0, str.length()-1));
				return index == -1 ? -1: index;
			}
		}
		else {
			return 0;
		}
		
	}
	
}
