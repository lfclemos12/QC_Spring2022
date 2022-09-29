import java.awt.Container;
import java.awt.TextArea;

/*
 * Name: Project1
 * Author: Luiz Felipe Lemos
 * Date: 03/07/22
 */

/**
 * Reads input from a text file and displays content onto a WordGUI
 * in the form of a 2x3 grid, categorizing the inputs based their starting
 * letter.
 * 
 * @author Luiz Felipe Lemos
 *
 */
public class Project1 {
	private static WordGUI wordGUI;
	private static TextFileInput myFile;
	private static TextArea a_Section, e_Section,
							i_Section, o_Section,
							u_Section, other_Section;
	
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
	
	public static void printToGUI(TextFileInput input, WordGUI gui) {
		// Parses Strings to proper section in WordGUI
		String in = input.readLine();
		while (in != null) { // in = null when @ end of file
			switch ((in.toLowerCase()).charAt(0)) {
			case 'a':
				a_Section.append(in + "\n");
				break;
			case 'e':
				e_Section.append(in + "\n");
				break;
			case 'i':
				i_Section.append(in + "\n");
				break;
			case 'o':
				o_Section.append(in + "\n");
				break;
			case 'u':
				u_Section.append(in + "\n");
				break;
			default:
				other_Section.append(in + "\n");
			}
			
			in = input.readLine();
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
