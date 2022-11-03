package activity5;

import java.util.Scanner;

public class ExceptionPractice {

	public static void main(String[] args) {
		
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		int n = kbd.nextInt();
		
		kbd.close();
		
		try {
			if(n<0) {
				throw new NegativeNumberException();
			}
		}
		catch(NegativeNumberException e) {
			System.out.println(e.getMessage());
			System.exit(1);
		}
		
		 System.out.println(Math.sqrt(n));
		
	}
}
