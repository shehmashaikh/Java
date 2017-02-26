package networktest;


import org.junit.Test;

import junit.framework.TestSuite;
import network.*;
import static org.junit.Assert.*;

public class Test_ShannonsModel{

	public static TestSuite suite() { return new TestSuite(Test_ShannonsModel.class);		}

protected void setUp() throws Exception { System.out.println("Test_ShannonsModel Begin");	}

protected void tearDown() throws Exception { System.out.println("Test_ShannonsModel End");	}

	/**
	 * Test the constructors.
	 */
public void testConstructors() {
  System.out.println("\tExecuting Test_ShannonsModel.testConstructors");
	model = new ShannonsModel();
	assertNotNull("\t\tTest_ShannonsModel.testConstructors: ShannonsModel is null", model);}

	
	/**
	 * Test the accessors.
	 */
	public void testAccessors() {
      System.out.println("\tExecuting Test_ShannonsModel.testAccessors");
		model = new ShannonsModel();
		assertNotNull("\t\tTest_ShannonsModel.testAccessors: ShannonsModel is null", model);}
	@Test
	public void getBandwidthTest(){

		double Bandwidth;
		ShannonsModel model;
		model = new ShannonsModel();
		Bandwidth = model.getBandwidth();
		assertTrue(Bandwidth == 0.0);
		model.setBandwidth(10.0);
		Bandwidth = model.getBandwidth();
		assertTrue(Bandwidth == 10.0);		
	}
	
	@Test
	public void getsignalToNoiseTest(){

		double signalToNoise = 0;
		ShannonsModel model;
		model = new ShannonsModel();
		assertTrue(signalToNoise == 0.0);
		model.setsignalToNoise(10.0);
		signalToNoise = model.getsignalToNoise();
		assertTrue (signalToNoise == 10.0);

	}
	

	/**
	 * Test the mutators/modifiers.
	 * @param model 
	 */
	public void testMutators(ShannonsModel model) {
      System.out.println("\tExecuting Test_ShannonsModel.testMutators");
		model = new ShannonsModel();
		assertNotNull("\t\tTest_ShannonsModel.testMutators: ShannonsModel is null", model);}

		/*
		 *	TODO:	Add tests for your mutators here.
		 */		
	@Test
	public void setBandwidthTest(){
		double Bandwidth;
		ShannonsModel model;
		model = new ShannonsModel();
		model.setBandwidth(10.0);
		Bandwidth = model.getBandwidth();
		assertTrue(Bandwidth == 10.0);
	}
	@Test
	public void setsignalToNoiseTest(){

		double signalToNoise;
		ShannonsModel model;
		model = new ShannonsModel ();
		model.setsignalToNoise(10.0);
		signalToNoise = model.getsignalToNoise();
		assertTrue(signalToNoise == 10.0);
	}
	
	/**
	 * Test behaviors.
	 */
	public void testBehaviors() {
      System.out.println("\tExecuting Test_ShannonsModel.testBehaviors");
		model = new ShannonsModel();
		assertNotNull("\t\tTest_ShannonsModel.testBehaviors: ShannonsModel is null", model);
	}


	
	@Test
	public void maximumDataRateTest(){
		double maximumDataRate = 0;
		ShannonsModel model;
		model = new ShannonsModel();
		assertTrue(maximumDataRate == 0.0);
		model.setBandwidth(10.0);
		model.setsignalToNoise(10.0);
		maximumDataRate = model.maximumDataRate();
		assertTrue(maximumDataRate == 34.59);
	}

	@Test
	public void toStringTest(){
		String s;
		ShannonsModel model;
		model = new ShannonsModel();
		s = model.toString();
		assertTrue(s.equals(""));
	}

	/*	STAND-ALONE ENTRY POINT -----------------------------------------	*/
	/**
	 *	Main line for standalone operation.
	 *	@param	args	Standard string command line parameters.
	 */
	public static void main(String[] args) {
      System.out.println("Executing Test_ShannonsModel suite");
    
  }



   /* ATTRIBUTES	-----------------------------------------------	*/
   private ShannonsModel model = null;


}


