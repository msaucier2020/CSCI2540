package assg1_saucierm20;

import java.util.*;

public class NumberGame {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		//generate random number
		int secret;
		Random generator = new Random();
		secret = generator.nextInt(100);
		
		//allow user to guess
		System.out.println("Enter a number to guess:");
		int guess = keyboard.nextInt();
		int numGuesses = 1;
		
		//compare guess to the number:
		while(guess != secret) {
			if (guess < secret)
			{
				System.out.println("Secret number is higher than " + guess);
			}
			else if (guess > secret)
			{
				System.out.println("Secret number is lower than " + guess);
			}
			
			System.out.println("Guess again: ");
			guess = keyboard.nextInt();
			numGuesses++;
		}
		
	
		System.out.println("You got it right! It took you " + numGuesses + " guesses.");
		
		keyboard.close();
		
	}
}
