/**
 * Exception to be thrown if a given character sequence
 * represents an invalid <code>Word</code>. Extends
 * <code>IllegalArgumentException</code>.
 * 
 * @author Luiz Felipe Lemos
 */
public class IllegalWordException extends IllegalArgumentException {
	public IllegalWordException(String message) {
		super(message);
	}
}
