package Day_6.basicUi;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowV2 {
	public static void main(String[] args) {
		// Creating the Frame
		JFrame frame = new JFrame("Chat Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);

		// Creating the panel at bottom and adding components
		JPanel panel = new JPanel(); // the panel is not visible in output
		JButton drawOvalbtn = new JButton("Draw Oval");
		JButton drawRectbtn = new JButton("Draw Rectangle");

		panel.add(drawOvalbtn);
		panel.add(drawRectbtn);


		// Adding Components to the frame.
		frame.getContentPane().add(BorderLayout.SOUTH, panel);

		frame.setVisible(true);
	}
}
