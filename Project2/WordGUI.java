import javax.swing.*;
import java.awt.*;

/**
 * Contains constructors for the WordGUI object -- essentially, a JFrame made with 2x3 GridLayout.
 * 
 * @author Luiz Felipe Lemos
 *
 */
public class WordGUI extends JFrame {
	
	public WordGUI () {
		setTitle("Word GUI");
		setSize(400, 400);
		setLocation(100, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2,3));
	}
	
	public WordGUI (String title, int width, int height, int x, int y) {
		setTitle(title);
		setSize(width, height);
		setLocation(x, y);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2,3));
	}
	
}
