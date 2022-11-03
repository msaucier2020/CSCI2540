/*
 * class for a Node
 * @author - Madeleine Saucier and Owen Fallahee
 */
package activity8;

public class Node{

	Integer item;
	Node next;
	
	
	public Node(Integer givenItem) {
		item = givenItem;
		next = null;
	}
	
	public Node(Integer givenItem, Node givenNode) {
		item = givenItem;
		next = givenNode;
	}
}
