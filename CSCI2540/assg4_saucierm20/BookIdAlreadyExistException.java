
/*
 * @author - Madeleine Saucier
 * An exception class for a Book ID already existing
 */
package assg4_saucierm20;

@SuppressWarnings("serial")
public class BookIdAlreadyExistException extends Exception{

	/*
	 * default constructor
	 */
	public BookIdAlreadyExistException() {
		super("Book ID already exists.\n");
	}
	
	/*
	 * 1-parameter constructor
	 * @param the given message
	 */
	public BookIdAlreadyExistException(String msg) {
		super(msg);
	}
}
