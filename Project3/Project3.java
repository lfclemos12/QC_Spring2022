import java.util.*;

/*
 * Name: Project3
 * Author: Luiz Felipe Lemos
 * Date: 04/17/22
 */

/**
 * Reads input from a text file and displays content onto a WordGUI
 * in the form of a 2x3 grid, categorizing the inputs based their starting
 * letter.
 * 
 * @author Luiz Felipe Lemos
 *
 */
public class Project3 extends TreeMap<Word, Word>{
	private static WordGUI wordGUI;
		
	public static void main(String[] args) {
		wordGUI = new WordGUI();
		wordGUI.setVisible(true);
	}
	
}
