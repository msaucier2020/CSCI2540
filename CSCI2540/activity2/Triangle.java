package activity2;

import java.util.Scanner;

public class Triangle {
	
	public static void printLine(int number) {
		
		for(int i = 1; i <= number; i++)
		{
			System.out.print("*");
		}
		
		System.out.println("");
	}

	public static void printTriangle(int size) {
		
		for(int i = 1; i <= size; i++)
		{
			printLine(i);
		}
		for(int i = size - 1; i >= 1; i--)
		{
			printLine(i);
		}
	}
	public static void main (String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter triangle size: ");
		
		int size = keyboard.nextInt();
		
		printTriangle(size);
		
		keyboard.close();
	}
}
