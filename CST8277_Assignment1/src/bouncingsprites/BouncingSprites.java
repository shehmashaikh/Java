package bouncingsprites;
//%W%	%G%
/*
 This app bounces a blue ball inside a JPanel.  The ball is created and begins
 moving with a mousePressed event.  When the ball hits the edge of
 the JPanel, it bounces off the edge and continues in the opposite
 direction.  
*/

import javax.swing.JFrame;


public class BouncingSprites {
	/**JFrame Object*/
    private JFrame frame;
    /**Sprite Panel Object*/
    private SpritePanel panel = new SpritePanel(); 

    
    /**Default Constructor*/
    public BouncingSprites() {
        frame = new JFrame("Bouncing Sprite");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setVisible(true);
    }
    public void start(){
    	panel.animate();  // never returns due to infinite loop in animate method
    }

    public static void main(String[] args) {
    	new BouncingSprites().start();
    } // end of main method
} // end of class BouncingSprites
