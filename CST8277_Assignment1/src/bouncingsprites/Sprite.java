package bouncingsprites;

//%W%	%G%
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class Sprite implements Runnable {

	/**Random object*/
	public final static Random random = new Random();
	/**Size of the sprint*/
	final static int SIZE = 10; 
	/**Speed of the sprint*/
	final static int MAX_SPEED = 5;

	SpritePanel panel;
	/**Position on x axis*/
	private int x;
	/**Position on y axis*/
	private int y;
	/**directional x axis*/
	private int dx;
	/**directional y axis*/
	private int dy;
	/**Color object for sprite*/
	private Color color = Color.BLUE;
	
	Boolean inBox;
	
	 
public Sprite (SpritePanel panel) {
		this.panel = panel;
		x = random.nextInt(panel.getWidth());
		y = random.nextInt(panel.getHeight());
		dx = random.nextInt(2 * MAX_SPEED) - MAX_SPEED;
		dy = random.nextInt(2 * MAX_SPEED) - MAX_SPEED;
		if(panel.spriteIsInside(x,y)){
			panel.enterTheBox();
			inBox = true;
		}
		else{
			panel.exitTheBox();
			inBox=false;
		}
	}

	public void draw(Graphics g) {
		g.setColor(color);
		g.fillOval(x, y, SIZE, SIZE);
	}

	public void move() {

		// check for bounce and make the ball bounce if necessary
		//
		if (x < 0 && dx < 0) {
			// bounce off the left wall
			x = 0;
			dx = -dx;
		}
		if (y < 0 && dy < 0) {
			// bounce off the top wall
			y = 0;
			dy = -dy;
		}
		if (x > panel.getWidth() - SIZE && dx > 0) {
			// bounce off the right wall
			x = panel.getWidth() - SIZE;
			dx = -dx;
		}
		if (y > panel.getHeight() - SIZE && dy > 0) {
			// bounce off the bottom wall
			y = panel.getHeight() - SIZE;
			dy = -dy;
		}

		// make the ball move by incrementing sprite position
		x += dx;
		y += dy;
		if (panel.spriteIsInside(x, y) && inBox == false) {
			panel.enterTheBox();
			inBox = true;
		} else if (!panel.spriteIsInside(x, y) && inBox == true) {
			panel.exitTheBox();
			inBox = false;
		}
	}

	@Override
	public void run() {

		while (true) {
			move();
			// moveInsideBox();
			try {
				Thread.sleep(40);
			} catch (InterruptedException exception) {
				exception.printStackTrace();
			}
		}

	}
}
