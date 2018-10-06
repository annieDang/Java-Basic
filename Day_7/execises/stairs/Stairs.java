package Day_7.execises.stairs;

import javax.swing.JFrame;


public class Stairs {
	public static void main( String args[] ) {
		 // create a panel that contains our drawing
		StairsPanel panel = new StairsPanel();
		
		// create a new frame to hold the panel
		JFrame application = new JFrame();
		
		// set the frame to exit when it is closed
		application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		application.setTitle("My app"); //set Title showing on the top the the frame
		application.add( panel ); // add the panel to the frame
		application.setSize( 500, 500 ); // set the size of the frame
		application.setLocationRelativeTo(null); // set panel in the middle of the screen
		application.setResizable(false); //disable resizable
		
		application.setVisible( true ); // make the frame visible
	} // end main
}
