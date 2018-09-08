package Day_5;

import java.awt.Graphics;

import javax.swing.JPanel;

public class FunPanel1 extends JPanel{
		public void paintComponent(Graphics g) {

			// call paintComponent to ensure panel displays correctly
			super.paintComponent(g);
			
			// First 2 arguments (X, Y) -> start, Last 2 arguments (X, Y) -> end
			g.drawLine(0, 3, 200, 200);
			g.drawLine(200, 200, 0, 400);
			
		}
}
