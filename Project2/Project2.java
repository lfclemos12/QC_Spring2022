import java.awt.Container;
import java.awt.TextArea;

/*
 * Name: Project2
 * Author: Luiz Felipe Lemos
 * Date: 04/06/22
 */

/**
 * Reads input from a text file and displays content onto a WordGUI
 * in the form of a 2x3 grid, categorizing the inputs based their starting
 * letter.
 * 
 * @author Luiz Felipe Lemos
 *
 */
public class Project2 {
	private static WordGUI wordGUI;
	private static TextFileInput myFile;
	private static TextArea a_Section, e_Section,
							i_Section, o_Section,
							u_Section, other_Section;
	/**
	 * Appends the 5 verb text areas and 1 "other" text area to the WordGUI
	 * 
	 * @param gui		The GUI to append the text areas to.
	 */
	public static void addTextAreas(WordGUI gui) {
		// Gets ContentPane
		Container myContentPane = gui.getContentPane();
		
		// Creates TextAreas for each category
		a_Section = new TextArea();
		e_Section = new TextArea();
		i_Section = new TextArea();
		o_Section = new TextArea();
		u_Section = new TextArea();
		other_Section = new TextArea();
		
		// Adds TextAreas to ContentPane
		myContentPane.add(a_Section);
		myContentPane.add(e_Section);
		myContentPane.add(i_Section);
		myContentPane.add(o_Section);
		myContentPane.add(u_Section);
		myContentPane.add(other_Section);
	}
	
	/**
	 * Prints input from text file onto a wordGUI.
	 * 
	 * @param input		The file to read from
	 * @param gui		The GUI on which to print the file's contents
	 */
	public static void printToGUI(TextFileInput input, WordGUI gui) {
		// Parses Strings to proper section in WordGUI
		String in = input.readLine();
		SortedWordList list = new SortedWordList();
		while (in != null) { // in = null when @ end of file
			Word word = new Word(in);
			list.add(word);
			in = input.readLine();
		} // adds Words into a sorted list
		
		WordListNode currNode = list.first.next;
		for (int i = 0; i < list.length; i++) {
			String data = currNode.getData().toString();
			switch ((data.toLowerCase()).charAt(0)) {
			case 'a':
				a_Section.append(data + "\n");
				break;
			case 'e':
				e_Section.append(data + "\n");
				break;
			case 'i':
				i_Section.append(data + "\n");
				break;
			case 'o':
				o_Section.append(data + "\n");
				break;
			case 'u':
				u_Section.append(data + "\n");
				break;
			default:
				other_Section.append(data + "\n");
			}
			currNode = currNode.next;	
		}
	}
	
	public static void main(String[] args) {
		myFile = new TextFileInput("input.txt");
		wordGUI = new WordGUI();
		
		addTextAreas(wordGUI);
		printToGUI(myFile, wordGUI);
		
		wordGUI.setVisible(true);
	}
}
