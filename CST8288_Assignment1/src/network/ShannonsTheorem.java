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
 * @version   1.0.0 Date 25/9/2016
 */
public class ShannonsTheorem	{

	
	/**
	 *	Bandwidth in Hertz
	 */
	private double bandwith; 
	/**
	 *	signalToNoise in decibels 
	 */
	private double signalToNoise; 

	private double MaximumDataRate; 


	public ShannonsTheorem()	{	super();		}

	/**
	 *	Paramertized constructor.
	 *	@param	value	Some attribute value.
	 */
	public ShannonsTheorem(String value)	{
		super();
		
	}
	

	/**
	 * Mutator for Bandwidth 
	 * @param bandwith in Hertz
	 *  
	 */
	public void setBandwith(double bandwith) {
		this.bandwith = bandwith;
	}
	/**
	 * Accessor for bandwidth 
	 * @return Bandwidth in hertz
	 */
	public double getBandwith() {
		return bandwith;
	}
	/**
	 * Mutator for Signal To Noise
	 * @param signalToNoise in decibels 
	 *  
	 */
	public void setSignalToNoise(double signalToNoise) {
		this.signalToNoise = signalToNoise;
	}
	/**
	 * Accessor for signalToNoise 
	 * @return Signal to Noise ratio in decibels
	 */
	public double getSignalToNoise() {
		return signalToNoise;
	}

	/**
	 *	Acessor which generates value for Maximum Data Rate
	 * it depends on Bandwidth and SignalToNoise
	 * @param Bandwith 
	 * @param signalToNoise 
	 * @return Maximum Data Rate	
	 */
	
	public double getMaximumDataRate() {
		return getMaximumDataRate (bandwith, signalToNoise);
	} 



	/*	NORMAL BEHAVIOR -------------------------------------------------	*/
	/**
	 *	Document all behavior.
	 */
	public void someBehavior()	{
		System.out.println("Here is some behavior, not much but some.");
	}


	/**
	 *	Convert this class to a meaningful string.
	 *	@return	This class as a meaningful string.
	 */
	public String toString()	{
		StringBuilder sb = new StringBuilder();
		sb.append("MaximumDataRate = ").append(String.format("%2f", getMaximumDataRate())).append("Bps");
		return sb.toString();
	}


	/* HELPER METHODS	--------------------------------------------------	*/
	/* TODO:	Place helper methods here.												*/

	private double getMaximumDataRate(double bandwidth, double signalToNoise){
		return bandwidth* (Math.log(1 + Math.pow(10, signalToNoise/10))/Math.log(2));
	}

	
	/*	ENTRY POINT for STAND-ALONE OPERATION ---------------------------	*/
	/**
	 * Entry point "main()" as required by the JVM.
	 * @param  args   Standard command line parameters (arguments) as a
	 *	string array.
	 */
	public static void main (String args[]) {
		ShannonsTheorem app = new ShannonsTheorem();
		try{
		JOptionPane.showMessageDialog(null, "Shannon's Theorem Using Java \n Click OK to proceed", "Shannon's Theorem", JOptionPane.INFORMATION_MESSAGE);
		double Bandwidth = Double.parseDouble(
		JOptionPane.showInputDialog("Please enter the bandwidth in Hertz"));
		double signalToNoise = Double.parseDouble(
		JOptionPane.showInputDialog("Please enter the signal to Noise ratio in decibels"));		
		app.setBandwith(Bandwidth);
		app.setSignalToNoise(signalToNoise);
		String comment = String.format("[Maximum data rate is %.2f,%s",
				app.getMaximumDataRate(), "Bps]");
		JOptionPane.showMessageDialog(null, comment , "Shannon's Theorem Result", JOptionPane.INFORMATION_MESSAGE);
	}catch (Exception e){
		JOptionPane.showMessageDialog(null, "Enter only numbers", "Error", JOptionPane.ERROR_MESSAGE);
	}
	}



	/* ATTRIBUTES	-----------------------------------------------------	*/
	/* TODO:	Place Attributes here.													*/
	private String someAttribute;


}	/*	End of CLASS:	ShannonsTheorem.java			*/