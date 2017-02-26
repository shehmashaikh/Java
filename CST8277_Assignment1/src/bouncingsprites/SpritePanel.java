package bouncingsprites;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JPanel;

public class SpritePanel extends JPanel {
	/** ArrayList of Sprite objects. */
	ArrayList<Sprite> sprites = new ArrayList<>();
	private int numberOfSpotsRemaining = 2;
	
	/** 
	 * Default constructor.
	 */
	public SpritePanel() {
		addMouseListener(new Mouse());
	}

	// method for creating a new ball
	private void newSprite(MouseEvent event) {
		Sprite sprite = new Sprite(this); // create new thread for the new Sprite object and
		sprites.add(sprite); //add it to the ArrayList of Sprite objects
		(new Thread(sprite)).start();
		System.out.println("New ball created");
	}

	/**
	 * Void method that animates the program. 
	 */
	
	public void animate() {
		while (true) {
			repaint();

			try {
				Thread.sleep(40);
			} catch (InterruptedException exception) {
				exception.printStackTrace();
			}
		}
	}

	private class Mouse extends MouseAdapter {
		@Override
		public void mousePressed(final MouseEvent event) {
			newSprite(event);
		}
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.YELLOW);
		g.fillRect(150, 150, 300, 300); //dimensions of the rectangle
		for (Sprite s : sprites) { //for loop for the sprites
			s.draw(g);
		}
	}

	public boolean spriteIsInside(int x, int y) {
		if (x >= 150 && x <= 450 && y >= 150 && y <= 450) {
			return true;
		}
		return false;
	}

	public synchronized void enterTheBox() {
		while(numberOfSpotsRemaining == 0){ 
			try{
				wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		numberOfSpotsRemaining--; 
		notifyAll();
	}

	public synchronized void exitTheBox() {
		while(numberOfSpotsRemaining == 3){
			try{
				wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		numberOfSpotsRemaining++;
		notifyAll();
	}
}
