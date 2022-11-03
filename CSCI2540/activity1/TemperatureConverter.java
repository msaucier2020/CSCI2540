package activity1;


import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args)
	
	{
		
	Scanner scannerObject = new Scanner(System.in);
	
	int farenheit;
	double celsius;
	
	System.out.println("Please enter a temperature in Farenheit:");
	
	farenheit = scannerObject.nextInt();
	
	celsius = ((double)farenheit - 32) * (5.0/9.0);
	
	System.out.println("The equivalent temperature is " + celsius + " degrees Celsius.");
	
	
	scannerObject.close();
	
	}
}
