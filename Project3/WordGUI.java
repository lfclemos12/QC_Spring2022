import javax.swing.*;
import java.awt.*;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/**
 * Contains constructors for the WordGUI object -- essentially, a JFrame made with 2x3 GridLayout.
 * 
 * @author Luiz Felipe Lemos
 *
 */
public class WordGUI extends JFrame {
	
	private TextArea a_Section, e_Section,
					 i_Section, o_Section,
					 u_Section, other_Section; 
	
	public WordGUI () {
		setTitle("Word GUI");
		setSize(400, 400);
		setLocation(100, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2,3));
		createMenu();
		addTextAreas();
	}
	
	public WordGUI (String title, int width, int height, int x, int y) {
		setTitle(title);
		setSize(width, height);
		setLocation(x, y);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2,3));
		createMenu();
		addTextAreas();
	}
	
	/**
	 * Creates a menu called "File" with drop-down items "Open"
	 * and "Quit," appends them to a menuBar on the WordGUI.
	 * 
	 */
	private void createMenu() {
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenuItem item;
		FileMenuHandler fmh = new FileMenuHandler(this);
		
		item = new JMenuItem("Open");
		item.addActionListener(fmh);
		fileMenu.add(item);
		
		fileMenu.addSeparator();
		
		item = new JMenuItem("Quit");
		item.addActionListener(fmh);
		fileMenu.add(item);
		
		setJMenuBar(menuBar);
		menuBar.add(fileMenu);
	}
	
	/**
	 * Appends the 5 verb text areas and 1 "other" text area to the WordGUI
	 * 
	 */
	private void addTextAreas(){
		// Gets ContentPane
		Container myContentPane = getContentPane();
		
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
	 * Appends a String to a specific section of the WordGUI depending on
	 * it's first letter.
	 * 
	 * @param data		The String to be appended to the wordGUI
	 */
	public void appendToSections(String data) {
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
	}
	
	/**
	 * Prints input from text file onto a wordGUI.
	 * 
	 * @param input		The file to read from
	 */
	public void printToGUI(TextFileInput input) {
		// Parses Strings to proper section in WordGUI
		String in = input.readLine();
		TreeMap<Word, Word> list = new TreeMap<Word, Word>(new WordComparator());
		while (in != null) { // in = null when @ end of file
			try {
				Word word = new Word(in);
				list.put(word, null);
			}
			catch (IllegalWordException iwe) {
				System.err.println(iwe);
			}
			in = input.readLine();
		} // adds Words into a Tree Map
		
		Set<Word> s = list.keySet();
		Iterator<Word> i = s.iterator();
		Word key;
		
		while (i.hasNext()) {
			key = i.next();
			appendToSections(key.toString());
		}
	}
	
	/**
	 * Clears the five sections of the <code>WordGUI</code>.
	 * 
	 */
	public void clearSections () {
		a_Section.setText(null);
		e_Section.setText(null);
		i_Section.setText(null);
		o_Section.setText(null);
		u_Section.setText(null);
		other_Section.setText(null);
	}

}
