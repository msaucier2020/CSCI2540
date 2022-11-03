/*
 * main method for infix to postfix calculator
 * @author- Madeleine Saucier
 */

package assg7_saucierm20;

import java.util.*;

public class CalculatorDemo {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		String inExp, postExp;
		Integer x;
		
		System.out.println("Enter an infix expression using integers: ");
		inExp = kbd.nextLine();
		
		Calculator calc = new Calculator(inExp);
		postExp = calc.getPostfix();
		
		x = calc.evaluate();
		
		System.out.println("Postfix expression is: " + postExp);
		System.out.println("Answer is: " + x);
		
		
		kbd.close();
	}
}
