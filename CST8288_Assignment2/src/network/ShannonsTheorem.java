/*
 *  @(#)ShannonsTheorem.java   1.0 YY/MM/DD
 *
 *
 *  This software contains confidential and proprietary information
 *  of Dyer Consulting ("Confidential Information").  You shall not disclose
 *  such Confidential Information and shall use it only in accordance with the
 *  terms of the license agreement you entered into with Dyer Consulting.
 *
 *  This software is provided "AS IS,".  No warrantee of any kind, express
 *  or implied, is included with this software; use at your own risk, responsibility
 *  for damages (if any) to anyone resulting from the use of this software rests
 *  entirely with the user even if Dyer Consulting has been advised of the
 *  possibility of such damages.
 *
 *  This software is not designed or intended for use in on-line control of
 *  aircraft, air traffic, aircraft navigation or aircraft communications; or in
 *  the design, construction, operation or maintenance of any nuclear
 *  facility. Licensee represents and warrants that it will not use or
 *  redistribute the Software for such purposes.
 *
 *  Distribute freely, except: don't remove my name from the source or
 *  documentation, mark your changes (don't blame me for your possible bugs),
 *  don't alter or remove any of this notice.
 */

package network;													/*	Package for class placement	*/

import javax.swing.JOptionPane;



/**
 * Description of this class.
 * @author   Shehma Shaikh
 * @version   1.0.0 
 */

public class ShannonsTheorem	{

	private ShannonsModel model;
	private double Bandwidth;
	private double signalToNoise;
	private double maximumDataRate;
	/**
	 *	Default construtor.
	 */
	public ShannonsTheorem()	{	
		super();	
		model = new ShannonsModel();
	}

	/**
	 * Accessor for bandwidth 
	 * @return Bandwidth in hertz
	 */
	public double getBandwidth(){
		return model.getBandwidth();
	}

	/**
	 * Accessor for signalToNoise 
	 * @return Signal to Noise ratio in decibels
	 */
	public double getsignalToNoise(){
		return model.getsignalToNoise();

	}

	/**
	 * Mutator for Bandwidth 
	 * @param Bandwidth in hertz
	 *  
	 */
	public void setBandwidth(double Bandwidth){
		model.setBandwidth(Bandwidth);
	}
	/**
	 * Mutator for Signal To Noise
	 * @param signalToNoise in decibels
	 *  
	 */
	public void setsignalToNoise(double signalToNoise){
		model.setsignalToNoise (signalToNoise);
	}
	/**
	 *	Acessor which generates value for Maximum Data Rate
	 * it depends on Bandwidth and SignalToNoise
	 * @return Maximum Data Rate	
	 */

	public double maximumDataRate(){
		return model.maximumDataRate();

	}

	/**
	 * Entry point "main()" as required by the JVM.
	 * @param  args   Standard command line parameters (arguments) as a
	 *	string array.
	 */
	public static void main (String args[]) {
		ShannonsTheorem app = new ShannonsTheorem();
		String c = "";
		do {
			try{

				JOptionPane.showMessageDialog(null, "Shannon's Theorem Using Java \n Click OK to proceed", "Shannon's Theorem", JOptionPane.INFORMATION_MESSAGE);
				double Bandwidth = Double.parseDouble(
						JOptionPane.showInputDialog("Please enter the bandwidth in Hertz"));
				double signalToNoise = Double.parseDouble(
						JOptionPane.showInputDialog("Please enter the signal to Noise ratio in decibels"));		
				app.setBandwidth(Bandwidth);
				app.setsignalToNoise(signalToNoise);
				String comment = String.format("[Maximum data rate is %.2f,%s",
						app.maximumDataRate(), "Bps]");
				JOptionPane.showMessageDialog(null, comment , "Shannon's Theorem Result", JOptionPane.INFORMATION_MESSAGE);
			}catch (Exception e){
				JOptionPane.showMessageDialog(null, "Enter only numbers", "Error", JOptionPane.ERROR_MESSAGE);
			}
			c = JOptionPane.showInputDialog("Continue? Enter Y to continue. N/n to exit");
		} while(!c.toUpperCase().equals("N"));


	}


}	/*	End of CLASS:	ShannonsTheorem.java			*/