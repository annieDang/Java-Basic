package Day_5;

import java.awt.Graphics;

import javax.swing.JPanel;

public class FunPanel4 extends JPanel{
	// Draws specific pattern of lines coming from single point in top-left corner
	public void paintComponent(Graphics g) {

		// call paintComponent to ensure panel displays correctly
		super.paintComponent(g);

		int width = 0; // starting width
		int height = getHeight(); // total height
		int wstep = getWidth() / 15; // one step of width
		int hstep = height / 15; // one step of height

		// Loop drawing specific pattern of lines
		while (height >= 0) {
			width = width + wstep;
			g.drawLine(0, getHeight() - height, width, getHeight());
			g.drawLine(getWidth() - width, 0, getWidth(), height);
			g.drawLine(getWidth(), getHeight() - height, getWidth() - width, getHeight());
			g.drawLine(0, height, width, 0);
			height = height - hstep;
		}
	}
}
