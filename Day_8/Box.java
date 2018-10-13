package Day_8;

import java.awt.Graphics2D;

public class Box {
	private static final int TALl = 30;
	int x = 0;
	int y = 0;
	int xa = 1;
	int ya = 1;

	void move() {
		x = x + xa;
		y = y + ya;
	}

	public void paint(Graphics2D g) {
		g.fillRect(x, y, TALl, TALl);
	}
}