/*
 * @author - Madeleine Saucier and Noah Warren
 */

package activity10;

import java.util.*;

public class QueuePractice {	
	
	public static Node listGenerator(int n) {
		Node head = new Node(null, null);
		int x;

		Random rand = new Random();

		for(int i = 0; i < n; i++) {
			x = rand.nextInt(50); 
			if(i == 0) {
				head.next = new Node(x);
			}
			else {
				head.next = new Node(x, head.next);
			}
		}
		
		return head;
	}

	public static void queueTest(Node head) {
		
		ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
		Iterator<Integer> itr;
		
		head = head.next;
		
		while(head.next != null) {
			head.item = head.item*2;
			queue.add(head.item);
			head = head.next;
		} 
		
		head.item = head.item*2;
		queue.add(head.item);
		
		itr = queue.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next() + "\t");
		}
	}


	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
	
		System.out.println("Enter an integer: ");
		int number = kbd.nextInt();
	
		Node list = listGenerator(number);
	
		for(Node print = list.next; print != null; print = print.next) {
			System.out.print(print.item + "\t");
		}
	
		System.out.println("");
	
		queueTest(list);
	
		kbd.close();
	}

}
