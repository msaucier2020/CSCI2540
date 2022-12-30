/*
 * main method to test bank simulation
 * @author - Madeleine Saucier
 */
package assg8_saucierm20;

import java.io.*;
import java.util.*;

public class Simulation {

	public static void main (String[] args) {
		String filename = "assg8_input.txt";
		ArrayDeque<Event> bankQueue = new ArrayDeque<Event>();
		EventList list = new EventList();
		int currentTime;
		boolean atFront; //use to check status of queue
		Event newEvent; 
		double waitTime = 0, count = 0; //for final stats
		Scanner input = null; 
		int inputA, inputT, depart; //for creating new events
		
		
		try {
			input = new Scanner(new File(filename));
		}
		catch(FileNotFoundException e) {
			System.out.println("Error opening file " + filename);
			System.exit(0);
		}
		
		//initialize first event into event list
		inputA = input.nextInt();
		inputT = input.nextInt();
		list.addArrive(inputA, inputT);
		count++;
		
		
		System.out.println("Simulation begins");
		
		
		while(!list.isEmpty()) {
			
			currentTime = list.retrieve().getETime();
			
			newEvent = list.retrieve();
			
			if(newEvent.isArrive()) {
				System.out.println("Processing arrival event at time: \t" + currentTime);
				atFront = bankQueue.isEmpty();
				bankQueue.add(newEvent);
				list.delete();
				
				//if queue now only has 1 event
				if(atFront) {
					depart = currentTime + newEvent.getTransact();
					list.addDepart(depart);		
					waitTime += (currentTime - bankQueue.peek().getETime());
				}
				
				//if there is another event in the input
				if(input.hasNext()) {
					inputA = input.nextInt();
					inputT = input.nextInt();
					list.addArrive(inputA, inputT);
					count++;
				}
				
			}
			
			else {
				System.out.println("Processing a departure at time: \t" + currentTime);
				bankQueue.remove();
				list.delete();
				
				//move the next customer to the front of the line
				if(!bankQueue.isEmpty()) {
					depart = currentTime + bankQueue.peek().getTransact();
					list.addDepart(depart);	
					waitTime += (currentTime - bankQueue.peek().getETime());
				}
			}
			
		}
		
		System.out.println("Simulation ends");
		
		waitTime /= count;
		
		System.out.println("\nFinal Statistics: ");
		System.out.println("Total number of people processed: " + count);
		System.out.println("Average wait time: " + waitTime);
		
		input.close();
	}

}
