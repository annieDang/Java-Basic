package Day_7.UI_1;

// Demonstrates drawing different shapes.
import java.awt.Graphics;
import javax.swing.JPanel;

public class Shape2 extends JPanel {

	private int choice = 1; // user's choice of which shape to draw
	
	// draws a cascade of shapes starting from the top left corner

	public void setChoice(int choice) {
		this.choice = choice;
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (int i = 0; i < 10; i++)
			// pick the shape based on the user's choice
			switch (choice) {
			case 1: // draw rectangles
				g.drawRect(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
				break;
			case 2: // draw ovals
				g.drawOval(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
				break;
			} // end switch } // end for
	} // end method paintComponent } // end class Shapes
	
	
}