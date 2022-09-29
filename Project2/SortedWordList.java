/**
 * A WordList such that all of its elements are sorted in
 * alphabetical order. Includes a modified append operation that maintains
 * the sorting of the list.
 * 
 * @author Luiz Felipe Lemos
 *
 */
public class SortedWordList extends WordList{
	/**
	 * Appends a word to the list such that it maintains the sorting of the list.
	 * 
	 * @param w		The word to be added to the list. 
	 */
	public void add(Word w) {
		if (length == 0) {
			append(w);
		} // No words in the list previously => append to list
		else {
			WordListNode prevNode = first;
			while(prevNode != null) { //prevNode == null when @ end of list
				WordListNode nextNode = prevNode.next;
				
				if(w.compareTo(nextNode.getData()) <= 0) {
					WordListNode inserted = new WordListNode(w);
					inserted.next = nextNode;
					prevNode.next = inserted;
					length++;
					break;
				} // Position of w is found => insert & exit loop
				else if (nextNode.next != null) {
					prevNode = nextNode;
				} // Position of w is not found => move to next node
				else {
					append(w);
				} // At end of the list => append
				
			}			
		}
	}
}
