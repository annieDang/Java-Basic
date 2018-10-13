package Day_8;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class AMan extends JFrame {
	public AMan() {
		// pass title to super class
		super("A Man");
		// set size of the jframe
		setSize(500, 500);

	}

	public void paint(Graphics g) {
		super.paint(g);
		// draw face
		g.setColor(Color.YELLOW);
		g.fillOval(35, 120, 70, 60);

		g.fillRect(48, 90, 48, 30);
		g.fillRect(30, 120, 80, 15);

		// draw eyes
		g.setColor(Color.GREEN);
		g.fillOval(55, 140, 10, 10);
		g.fillOval(75, 140, 10, 10);

	}
	public static void main(String[] args) {
		AMan man = new AMan();
		man.setVisible(true);

	}
}
