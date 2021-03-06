package es.uvigo.ei.sing.bew.exceptions;

/**
 * Custom exception.
 * 
 * @author Gael P�rez Rodr�guez
 * 
 */
public class RepeatedMethodNameException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor with custom message.
	 * 
	 * @param message
	 *            String, custom message.
	 */
	public RepeatedMethodNameException(String message) {
		super(message);
	}

	/**
	 * Default constructor.
	 */
	public RepeatedMethodNameException() {
		super();
	}
}
