package network;

public class ShannonsModel {

	private double Bandwidth;
	private double signalToNoise;

	public ShannonsModel()
	{
		this.Bandwidth = 0.0;
		this.signalToNoise = 0.0;
	}

	/**
	 * Accessor for bandwidth
	 * @return Bandwidth in Hertz
	 */
	public double getBandwidth(){
		return Bandwidth;
	}

	/**
	 * Mutator for bandwidth
	 * @param Bandwidth in hertz
	 */
	public void setBandwidth(double Bandwidth){
		this.Bandwidth = Bandwidth;
	}

	/**
	 * Accessor for signalToNoise
	 * @return signalToNoisw ratio in decibels
	 */
	public double getsignalToNoise(){
		return signalToNoise;
	}
	/**
	 * Mutator for signalToNoise
	 * @param signalToNoise in decibels
	 */
	public void setsignalToNoise(double signalToNoise){
		this.signalToNoise = signalToNoise;
	}
	public double maximumDataRate(){
		return maximumDataRate(Bandwidth,signalToNoise);
	}

	/** This method actually performs the calculation of maximum data rate
	 * @param bandwidth
	 * @param signalToNoise
	 * @return Maximum Data Rate in Bps (bits per second)
	 */
	private double maximumDataRate(double Bandwidth, double signalToNoise){
		return Bandwidth* (Math.log(1 + Math.pow(10, signalToNoise/10))/Math.log(2));
	}
	/**
	 *	Convert this class to a meaningful string.
	 *	@return	Maximum Data Rate in Bps
	 */

	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("MaximumDataRate = ").append(String.format("%.2f", maximumDataRate())).append("Bps");
		return sb.toString();
		}
	
}