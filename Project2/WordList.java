/**
 * A linked list that contains Word objects; includes an operation to append 
 * words to the list
 * 
 * @author Luiz Felipe Lemos
 *
 */
public class WordList {
	
	/** First node in the <code>WordList</code> - dummy node*/
	protected WordListNode first = new WordListNode(null);
	
	/** Last node in <code>WordList</code>*/
	protected WordListNode last = first;
	
	/** Number of <code>Word</code> objects in the list*/
	protected int length = 0;
	
	/**
	 * Appends a <code>Word</code> element to the <code>WordList</code>
	 * 
	 * @param w
	 * 			the <code>Word</code> to be appended
	 */
	public void append(Word w) {
		WordListNode appended = new WordListNode(w);
		last.next = appended;
		last = appended;
		length++;
	}
	
}
