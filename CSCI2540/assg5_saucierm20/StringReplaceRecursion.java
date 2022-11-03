/*
 * @author - Madeleine Saucier
 * A class for main method and recursive methods replace and replaceAll
 */
package assg5_saucierm20;

import java.util.Scanner;

public class StringReplaceRecursion {

	public static void main(String[] args) {
		String str;
		char newChar, oldChar;
		Scanner kbd = new Scanner(System.in);
		Integer option;
		
		/*
		 * main method
		 * give user a menu and allow them to input string, old char, and new char until they exit
		 */
		do {
			System.out.println("1. Test replace method");
			System.out.println("2. Test replaceAll method");
			System.out.println("3. Exit");
			
			option = Integer.parseInt(kbd.nextLine());
			
			switch(option) {
				case 1:
					System.out.println("Enter string: ");
					str = kbd.nextLine();
					System.out.println("Enter old character: ");
					oldChar = kbd.nextLine().charAt(0);
					System.out.println("Enter new character: ");
					newChar = kbd.nextLine().charAt(0);
					
					System.out.println(replace(str, oldChar, newChar));
					break;
				case 2: 
					System.out.println("Enter string: ");
					str = kbd.nextLine();
					System.out.println("Enter old character: ");
					oldChar = kbd.nextLine().charAt(0);
					System.out.println("Enter new character: ");
					newChar = kbd.nextLine().charAt(0);
					
					System.out.println(replaceAll(str, oldChar, newChar));
					break;
				case 3:
					break;
			}
					
			
		}while(option != 3);
	
	
		kbd.close();
	}
	
	/*
	 * replace the first old char with new char
	 * @param string, char to be replaced, char to replace with
	 * @return string with chars replaced
	 */
	public static String replace(String str, char oldChar, char newChar) {
		
		if(str.equals("") || str == null) {
			return str;
		}
		else if(str.charAt(0) == oldChar) {
			return newChar + str.substring(1);
			}
		else {
			return str.charAt(0) + replace(str.substring(1), oldChar, newChar);
		}
	}
	
	/*
	 * replace all old chars with new chars
	 * @param string, char to be replaced, char to replace with
	 * @return string with chars replaced
	 */
	public static String replaceAll(String str, char oldChar, char newChar) {
		if(str.equals("") || str == null) {
			return str;
		}
		else if(str.charAt(0) == oldChar) {
			return newChar + replaceAll(str.substring(1), oldChar, newChar);
			}
		else {
			return str.charAt(0) + replaceAll(str.substring(1), oldChar, newChar);
		}
	}
}
