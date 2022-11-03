package activity5;

@SuppressWarnings("serial")
public class NegativeNumberException extends Exception{

	/*
	 * default constructor
	 */
	public NegativeNumberException() {
		super("Number can't be negative.\n");
	}
	
	/*
	 * 1-parameter constructor
	 * @param the given message
	 */
	public NegativeNumberException(String msg) {
		super(msg);
	}
}

