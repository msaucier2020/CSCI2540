/*
 * class for a calculator to convert an infix expression to postfix and calculate the answer
 * @author- Madeleine Saucier
 */
package assg7_saucierm20;

import java.util.*;

public class Calculator {

	String infix;
	String postfix;
	Integer x;
	boolean state;
	Stack<String> aStack;
	Stack<Integer> evalStack;
	
	/*
	 * constructor for calculator
	 * @param infix expression to be converted
	 */
	public Calculator(String exp) {
		infix = exp;
		state = false;
		aStack = new Stack<String>();
		postfix = "";
		evalStack = new Stack<Integer>();
	} 
	
	
	/*
	 * retrieve the infix expression as a string
	 * @return infix
	 */
	public String toString() {
		return infix;
	} 
	
	/*
	 * convert infix expression to postfix
	 * @return true if able to be converted, false if not
	 */
	private boolean convertPostfix() {
		String current;
		int parenCount = 0;
		char test;
		
		//add spaces in between operators and operands for tokenizer
		for(int i = 0; i < infix.length(); i++) {
			if(infix.charAt(i) == '(' || infix.charAt(i) == ')' || infix.charAt(i) == '+' || infix.charAt(i) == '-' 
					|| infix.charAt(i) == '*' || infix.charAt(i) == '/') {
				//if the first char is an operator, add a space after it
				if(i==0) {
					infix = infix.charAt(0) + " " + infix.substring(1);
				}
				//if the second char is an operator, put a space between it and the first char, and a space between it and the rest of the string
				else if (i==1) {
					infix = infix.charAt(0) + " " + infix.charAt(1) + " " + infix.substring(2);
				}
				//for the rest of the operator chars, add a space before and after, with substrings on either end
				else {
					infix = infix.substring(0,i) + " " + infix.charAt(i) + " " + infix.substring(i+1);
					
				}
				//skips the new spaces added so it doesnt go into infinite loop
				i++;
			}
		}
		
		StringTokenizer st = new StringTokenizer(infix);
		
		while(st.hasMoreTokens()) {
		
			current = st.nextToken();
	
			switch(current) {
			
			case "(":
				aStack.push(current);
				break;
				
			case ")":
				while(!aStack.peek().equals("(")) {
					postfix = postfix + " " + aStack.pop();//take whatever is in the stack (what was in parentheses in the infix) 
															//and add it to the end of the postfix
				}
				while(!aStack.isEmpty()) {
					aStack.pop(); //remove '('
				}
				break;
				
			case "+":
			case "-":
			case "*":
			case "/":
				while(!aStack.isEmpty() && !aStack.contains("(") && precedence(current) >= precedence(aStack.peek())) {
					postfix = postfix + " " + aStack.pop(); 
				}
				aStack.push(current); //put the current operator into the stack
				break;
				
			//add operands to the end of the postfix expression
			default:
				postfix += " " + current;
				
			}
	
		}
		
		//empty whatever is left in the stack
		while(!aStack.isEmpty()) {
			postfix = postfix + " " + aStack.pop();
		}
		
		//check to make sure there is a valid number of parentheses
		for(int i = 0; i < infix.length(); i++) {
			test = infix.charAt(i);
			if(test == '(' || test == ')') {
				parenCount++;
			}
		}
		if (parenCount % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/*
	 * class to organize precednece for operators
	 * @param mathematic operator 
	 * @return precedence value: * and / = 1 because they are done first; + and - = 2 because they have lower precedence
	 */
	public int precedence(String op) {
		switch(op) {
		case "+":
			return 2;
			
		case "-":
			return 2;
			
		case "*":
			return 1;
			
		case "/":
			return 1;
		
		default:
			return -1;
		}
	}
	
	/*
	 * retrieve postfix expression
	 * @return postfix
	 */
	public String getPostfix() throws IllegalStateException {
		//make sure the calculator is in a valid state before returning the expression
		try {
			state = this.convertPostfix();
			if(state == false) {
				throw new IllegalStateException("Error: Invalid # of Parentheses");
			}
		}
		catch(IllegalStateException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		
		return postfix;
	}
	
	/*
	 * evaluate the answer to the postfix expression
	 * @return integer x; the answer to the expression
	 */
	public int evaluate() throws IllegalStateException {
		String postEval = "";
		String current;
		int a, b, c;
		
		//make sure calculator is in a valid state before returning the expression
		try {
			postEval = postfix;
			if(state == false) {
				throw new IllegalStateException("Error: Need to convert to postfix");
			}
		}
		catch(IllegalStateException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		
		StringTokenizer st = new StringTokenizer(postEval);
		
		while(st.hasMoreTokens()) {
	
			current = st.nextToken();
			
			switch(current) {
				case "+":
					b = evalStack.pop();
					a = evalStack.pop();
					c = a + b;
					evalStack.push(c);
					break;
				case "-":
					b = evalStack.pop();
					a = evalStack.pop();
					c = a - b;
					evalStack.push(c);
					break;
				case "*":
					b = evalStack.pop();
					a = evalStack.pop();
					c = a * b;
					evalStack.push(c);
					break;
				case "/":
					b = evalStack.pop();
					a = evalStack.pop();
					c = a / b;
					evalStack.push(c);
					break;
				default:
					evalStack.push(Integer.parseInt(current));
					break;
			}
			
		}
		
		x = evalStack.pop();
		
		return x;
	}
}
