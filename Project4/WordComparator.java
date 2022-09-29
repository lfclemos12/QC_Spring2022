import java.util.Comparator;

/**
 * A class that allows for different data structures to order <code>Word</code>
 * objects
 * @author Luiz Felipe Lemos
 *
 */
public class WordComparator implements Comparator<Word> {
	public int compare(Word word1, Word word2) {
		return word1.compareTo(word2);
	}
}
