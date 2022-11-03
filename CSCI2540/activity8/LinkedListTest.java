/*
 * class to test linked list
 * @author - Madeleine Saucier and Owen Fallahee
 */
package activity8;


public class LinkedListTest{

	public static void main(String[] args) {
	
		
		Node head = new Node(null, null);
		
		for(int i = 10; i > 0; i--) {
			if(i==10) {
				head.next = new Node(i);
			}
			else {
			head.next = new Node(i, head.next);
			}
		}
		
		Node current = null;
		for(current = head.next; current != null; current = current.next) {
			System.out.println(current.item + "\t");
		}
		
		System.out.print("\n");
		oddElementsIterative(head);
		System.out.print("\n");
		oddElementsRecursive(head);
		
		System.out.print("\n");
		evenElementsIterative(head);
		System.out.print("\n");
		evenElementsRecursive(head);
		
		
	}



		public static void oddElementsIterative(Node first) {
			Node print = first;
			for(print = first.next; print != null; print = print.next) {
				if(print.item % 2 == 1) {
					System.out.println(print.item + "\t");
				}
			}
		
		
		}
	
		public static void oddElementsRecursive(Node first) {
			Node print = first.next;
			if(print != null) {
				System.out.println(print.item + "\t");
				oddElementsRecursive(print.next);
			}
	}
		
		public static void evenElementsIterative(Node first) {
			Node print = first;
			for(print = first.next; print != null; print = print.next) {
				if(print.item % 2 == 0) {
					System.out.println(print.item + "\t");
				}
			}
		}
		
		public static void evenElementsRecursive(Node first) {
			Node print = first.next;
			if(print != null) {
				System.out.println(print.item+1+"\t");
				evenElementsRecursive(print.next);
			}
		}

}
