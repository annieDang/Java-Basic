package Day_5;

import java.awt.Graphics;

import javax.swing.JPanel;

/*
 * Java is an object oriented development language meaning everything that we write will
 * be in a class and we see we have a public class DrawPanel declaration right here.
 * Extending class JPanel basically means the class DrawPanel is now a panel with a 
 * reference or access to all of the methods in the JPanel class 
 * You can think of JPanel as a component. Basically a container for multiple components. 
 * Those components can be text boxes. Those components can be buttons. 
 * Those components can be drawn objects like the objects such as a ball or a rectangle
 */
public class DrawPanel extends JPanel {

	// draws an X from the corners of the panel
	public void paintComponent( Graphics g )
	{
		// call paintComponent to ensure the panel displays correctly
		super.paintComponent( g );

		int width = getWidth(); // total width
		int height = getHeight(); // total height
	
		// draw a line from the upper-left to the lower-right
		g.drawLine( 0, 0, width, height );
	
		// draw a line from the lower-left to the upper-right
		g.drawLine( 0, height, width, 0 );
	 } // end method paintComponent

}
