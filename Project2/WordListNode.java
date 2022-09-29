/**
 * A class for creating nodes to be used in a WordList;
 * Each node contains a Word object and reference to the
 * next node in the list.
 * 
 * @author Luiz Felipe Lemos
 *
 */
public class WordListNode {
	private Word data;
	public WordListNode next;

	public WordListNode(Word data)
	{
		this.data = data;
		next = null;
	}  // constructor
	
	public Word getData() {
		return data;
	}
}
