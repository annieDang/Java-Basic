package Day_7.execises.stairs;

import java.awt.Graphics;

import javax.swing.JPanel;
/*
 * Apply loop (for loop in this case) to draw stairs
 */
 
public class StairsPanel extends JPanel{
	public void paintComponent(Graphics g) {

		// call paintComponent to ensure panel displays correctly
		super.paintComponent(g);
		
		/*
		 * To draw a line we use function drawLine(x1,y1,x2,y2)
		 * first 2 arguments (X, Y) -> started point, Last 2 arguments (X, Y) -> ended point
		 */
		g.drawLine(0, 50, 50, 50);
		g.drawLine(50, 50, 50, 50);
		g.drawLine(50, 100, 100, 100);
		g.drawLine(100, 150, 150, 150);
		g.drawLine(150, 200, 200, 200);
	}
}
