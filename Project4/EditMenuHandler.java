import java.awt.event.*;
import javax.swing.*;

public class EditMenuHandler implements ActionListener {
	WordGUI wordGUI;
	
	/**
	 * Default Constructor for an <code>EditMenuHandler</code>
	 * @param gui	The gui on which the handler acts.
	 */
	public EditMenuHandler (WordGUI gui) {
		wordGUI = gui;
	}
	
	public void actionPerformed(ActionEvent event) {
		String menuName = event.getActionCommand();
		if (menuName.equals("Add")) {
			try {
				String input = JOptionPane.showInputDialog("Please enter a word.");
				Word word = new Word(input);
				wordGUI.addWord(word);
			}
			catch(IllegalWordException iwe) {
				System.err.println(iwe);
			}
		}
	}
}
