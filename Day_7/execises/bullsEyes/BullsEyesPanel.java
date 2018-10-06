package Day_7.execises.bullsEyes;

import java.awt.Graphics;

import javax.swing.JPanel;

public class BullsEyesPanel extends JPanel{
	public void paintComponent(Graphics g) {

		// call paintComponent to ensure panel displays correctly
		super.paintComponent(g);
		
		int width = getWidth();
		int height = getHeight();
		/*
		 * To draw an oval we use function drawOval( int X, int Y, int width, int height )
		 * http://chortle.ccsu.edu/java5/notes/chap36/ch36_5.html
		 */
		g.drawOval(width/2 -50, height/2 - 50, 100, 100);
	}
}
