package Day_7.UI_1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

		final Shape2 shape = new Shape2();
		
		// Adding Components to the frame.
		frame.getContentPane().add(BorderLayout.SOUTH, panel);
		frame.getContentPane().add(BorderLayout.CENTER, shape);
		
		drawOvalbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				shape.setChoice(1);
				shape.revalidate();
				shape.repaint();
			}
		});
		
		drawRectbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				shape.setChoice(2);
				shape.revalidate();
				shape.repaint();
			}
		});

		frame.setVisible(true);
	}
}
