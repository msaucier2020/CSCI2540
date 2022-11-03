/*
 * @author - Madeleine Saucier
 * An exception class for a Book ID not being found
 */
package assg4_saucierm20;

@SuppressWarnings("serial")
public class BookNotFoundException extends Exception{
	/*
	 * default constructor
	 */
	public BookNotFoundException() {
		super("Book ID not found.\n");
	}
	
	/*
	 * 1-parameter constructor
	 * @param the given message
	 */
	public BookNotFoundException(String msg) {
		super(msg);
	}
}
