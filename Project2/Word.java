/**
 * A class that encapsulates a String.  
 * 
 * @author Luiz Felipe Lemos
 *
 */
public class Word implements Comparable<Word>{
	private String word;
	
	/**
	 * Constructor for the <code>Word</code> object.
	 * 
	 * @param word 		The String that comprises the object.
	 */
	public Word(String word) {
		this.word = word;
	}
	
	/**
	 * Returns the <code>word</code> that comprises the object.
	 * 
	 * @return		The String that comprises the object.
	 */
	public String getWord() {
		return word;
	}
	
	/**
	 * Method to set the <code>Word</code> object to a String of the user's choice.
	 * 
	 * @param word		The String to set the property <code>word</code> to.
	 */
	public void setWord(String word) {
		this.word = word;
	}
	
	public int compareTo(Word other) {
		return getWord().compareTo(other.getWord());
	}
	
	/**
	 * Method that checks whether or not the two <code>Word</code> objects are equal to each other.
	 * 
	 * @param other		The <code>Word</code> object to compare <code>this</code> to.
	 * @return			<code>true</code> if the objects represent the same character 
	 * 					sequence; <code>false</code> otherwise.
	 */
	public boolean equals (Object other) {
		if (other == null || getClass() != other.getClass() || 
				((Word)this).getWord().length() != ((Word)other).getWord().length())
			return false;
		else
			return this.compareTo((Word)other) == 0;
	}
	
	/**
	 * Returns a String representation of the <code>Word</code> object.
	 * 
	 * @return		The object's <code>word</code> property.
	 */
	public String toString() {
		return getWord();
	}
}
