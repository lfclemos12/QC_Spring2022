import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class FileMenuHandler implements ActionListener {
	WordGUI wordGUI;
	
	/**
	 * Default Constructor for a <code>FileMenuHandler</code>
	 * @param gui	the gui on which the handler acts.
	 */
	public FileMenuHandler (WordGUI gui) {
		wordGUI = gui;
	}
	
	public void actionPerformed(ActionEvent event) {
		String menuName = event.getActionCommand();
		if (menuName.equals("Open")) {
			wordGUI.clearAll();
			openFile();
		}
		else if (menuName.equals("Quit")) {
			System.exit(0);
		}
	}
	
	/**
	 * Opens a JFileChooser prompt to allow users to select a file to print onto
	 * the WordGUI.
	 */
	private void openFile() {
		JFileChooser chooser = new JFileChooser();
		chooser.showOpenDialog(null);
		readSource(chooser.getSelectedFile());
	}
	
	/**
	 * Reads contents of file chosen in JFileChooser prompt and prints contents to gui.
	 * @param chosen	File selected by the user.
	 */
	private void readSource (File chosen) {
		String chosenFileName = chosen.getPath();
		TextFileInput myFile = new TextFileInput(chosenFileName);
		wordGUI.printToGUI(myFile);
	}
}
