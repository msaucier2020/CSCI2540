package assg1_saucierm20;

import java.util.Scanner;

public class CountFamilies {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter number of families: ");
		int numOfFamilies = keyboard.nextInt();
		
		//set up and fill array
		int[] income = new int[numOfFamilies];
		for(int i = 0; i < numOfFamilies; i++)
		{
			System.out.println("Enter an income: ");
			income[i] = keyboard.nextInt();
		}
		
		//find the max income and print to screen
		int max = 0;
		for(int i = 0; i < numOfFamilies; i++)
		{
			max = (max > income[i])?max:income[i];
		}
		
		System.out.println("The maximum income is: " + max);
		
		//calculate what 10% of max is and find how many families income is below that value
		double lessThan10 = max * 0.10;
		int[] lessThan10Array = new int [numOfFamilies];
		//used keeps track of how many spots in the array are taken up
		int used = 0;
		
		for(int i = 0; i < numOfFamilies; i++)
		{
			if(income[i] < lessThan10)
			{
				lessThan10Array[used] = income[i];
				used++;
			}
		}
		
		//print the values 
		System.out.println("The incomes of families making less than 10% of the maximum are: ");
		for(int i = 0; i < used; i++)
		{
			System.out.println(lessThan10Array[i]);
		}
		System.out.println("For a total of " + used + " families");
		
		
		keyboard.close();
	}

	
}
