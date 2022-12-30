package activity14;

import java.util.*;

public class AdjacentList {

	public static void main(String[] args) {
		 LinkedList<LinkedList<Character>> list = new LinkedList<LinkedList<Character>>();
		 Scanner kbd = new Scanner(System.in);
		 String vertices, edges;
		 char current, first, second;
		
		 
		 System.out.println("Enter the vertices separated by comma: ");
		 vertices = kbd.nextLine();
		 
		 while(!vertices.equals("")) {
			 current = vertices.charAt(0);
			 LinkedList<Character> head = new LinkedList<Character>();
			 head.add(current);
			 
			 list.add(head);
			 
			 if(vertices.length() > 1) {
				 vertices = vertices.substring(2); //get rid of first and comma
			 }
			 else {
				 vertices = "";
			 }
		 }
		 
		 
		 System.out.println("Enter the edges separated by comma: ");
		 edges = kbd.nextLine();
		 
		 while(!edges.equals("")) {
			 
			 first = edges.charAt(0);
			 second = edges.charAt(1);
			 
			 for(int i = 0; i < list.size(); i++) {
				 if(list.get(i).getFirst() == first) {
					 list.get(i).add(second);
				 }
			 }
			 
			 
			 if(edges.length() > 2) {
				 edges = edges.substring(3); //get rid of first and comma
			 }
			 else {
				 edges = "";
			 }
		 }
		 
		 System.out.println(list.toString());
		 
		 
		 
		 kbd.close();
	}
}

