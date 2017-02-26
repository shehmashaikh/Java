
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;



/**
 * @author Shehma
 * 
 *
 */
public class CalculatorSwing{
	
	
	
	public static void main(String args[]){
		JFrame calculator = new JFrame();
		calculator.setTitle("Calculator");
		calculator.setSize(400, 200);
		calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calculator.setResizable(true);
		calculator.setLayout(new BorderLayout());
		
		calculator.add(new JTextField(), BorderLayout.NORTH); // adding the text field at the top
		
		JPanel panelButtons = new JPanel(new GridLayout(4,4)); // add the grid 
		calculator.add(panelButtons, BorderLayout.CENTER); // adding buttons to the calculator 
		JButton one = new JButton("7");
		panelButtons.add(one);
		JButton two = new JButton("8");
		panelButtons.add(two);
		JButton three = new JButton("9");
		panelButtons.add(three);
		JButton four = new JButton("/");
		panelButtons.add(four);
		
		JButton five = new JButton("4");
		panelButtons.add(five);
		JButton six = new JButton("5");
		panelButtons.add(six);
		JButton seven = new JButton("6");
		panelButtons.add(seven);
		JButton eight= new JButton("*");
		panelButtons.add(eight);
		
		
		JButton nine = new JButton("7");
		panelButtons.add(nine);
		JButton ten = new JButton("8");
		panelButtons.add(ten);
		JButton eleven = new JButton("9");
		panelButtons.add(eleven);
		JButton twelve = new JButton("-");
		panelButtons.add(twelve);
		
		
		JButton thirteen= new JButton("7");
		panelButtons.add(thirteen);
		JButton fourteen = new JButton("8");
		panelButtons.add(fourteen);
		JButton fifteen = new JButton("9");
		panelButtons.add(fifteen);
		JButton sixteen = new JButton("+");
		panelButtons.add(sixteen);

		
		calculator.setVisible(true);

	}

	private static Object panelButtons() {
		// TODO Auto-generated method stub
		return null;
	}
}


	
	
