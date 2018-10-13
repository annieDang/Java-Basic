package Day_8;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TwoBoxes extends JPanel{
	Box box1 = new Box();
	Box box2 = new Box();
	
	public TwoBoxes() {
		setFocusable(true);
		
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		box1.paint(g2d);
		box2.paint(g2d);
	}
	private void move() {
		box1.move();
		box2.move();
	}
	
	public static void main(String[] args) throws InterruptedException {
		JFrame frame = new JFrame("Two boxes!!!");
		TwoBoxes game = new TwoBoxes();
		frame.add(game);
		frame.setSize(300, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		while (true) {
			game.move();
			game.repaint();
			Thread.sleep(10);
		}
	}
}
