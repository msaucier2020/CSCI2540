/*
 * 3 different methods to reverse a string and return the reversed string
 * @author- Madeleine Saucier
 */
package activity9;

import java.util.Scanner;
import java.util.Stack;

public class StackPractice {
	
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		String str;
		
		System.out.println("Enter a string to be reversed:");
		str = kbd.nextLine();
		
		System.out.println("Reversed string using stack:");
		System.out.println(strRevStack(str));
		
		System.out.println("Reversed string using loop:");
		System.out.println(strRevIterative(str));
		
		System.out.println("Reversed string using recursion:");
		System.out.println(strRevRecursive(str));
		
		kbd.close();
	}
	
	
	public static String strRevStack(String str) {
		String newStr = "";
		Stack<Character> strStack = new Stack<Character>();
		for(int i=0; i < str.length(); i++) {
			strStack.push(str.charAt(i));
		}
		
		while(!strStack.empty()) {
			newStr = newStr + strStack.pop();
		}
		
		return newStr;
	}

	public static String strRevIterative(String str) {
		String newStr = "";
		
		for(int i = str.length()-1; i >= 0; i--) {
			newStr += str.charAt(i);
		}
		
		return newStr;
	}
	
	public static String strRevRecursive(String str) {
		
		if(str == null || str.equals("")) {
			return str;
		}
		else {
			return str.charAt(str.length()-1) + strRevRecursive(str.substring(0, str.length()-1));
		}
	}
}
