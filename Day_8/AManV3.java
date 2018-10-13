package Day_8;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class AManV3 extends JFrame implements ActionListener {
	public int bodyParts = 0;
	public AManV3() {
		// pass title to super class
		super("A Man");
		// set size of the jframe
		setSize(500, 500);

		// add a main panel
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(2, 0));
		mainPanel.setBackground(Color.WHITE);

		JPanel drawPanel = new JPanel();
		mainPanel.add(drawPanel, BorderLayout.NORTH);

		JPanel bottomPanel = new JPanel();
		bottomPanel.setLayout(new GridLayout(0, 2));
		bottomPanel.setBackground(Color.GRAY);
		// add the bottom panel which contains Jbuttons
		mainPanel.add(bottomPanel, BorderLayout.SOUTH);

		JButton draw = new JButton("Draw");
		JButton back = new JButton("Back");
		bottomPanel.add(draw);
		bottomPanel.add(back);

		// add action commands to buttons
		draw.setActionCommand("Draw");
		draw.addActionListener(this);

		back.setActionCommand("Back");
		back.addActionListener(this);

		add(mainPanel);
	}

	public void paint(Graphics g) {
		super.paint(g);
		if (bodyParts >= 1) {
			// draw face
			g.setColor(Color.YELLOW);
			g.fillOval(35, 120, 70, 60);
		}
		if (bodyParts >= 2) {
			// hat
			g.setColor(Color.RED);
		}

		if (bodyParts >= 3) {
			g.fillRect(48, 90, 48, 30);
			g.fillRect(30, 120, 80, 15);
		}
		
		if (bodyParts >= 4) {
			// draw eyes
			g.setColor(Color.GREEN);
			g.fillOval(55, 140, 10, 10);
			g.fillOval(75, 140, 10, 10);
		}
		if (bodyParts >= 5) {
			// smile
			g.setColor(Color.RED);
			g.drawArc(50, 155, 40, 10, -10, -180);
		}

	}

	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();

		if (command.equals("Draw")) {
			bodyParts++;
			repaint();
		}
		
		if (command.equals("Back")) {
			JOptionPane.showMessageDialog(null, "you clicked draw!");
		}
	}

	public static void main(String[] args) {
		AManV3 man = new AManV3();
		man.setVisible(true);

	}
}
