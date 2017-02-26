package networktest;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import network.ShannonsTheorem;

public class Test_ShannonsTheorem extends TestCase {


	public Test_ShannonsTheorem(String name) { super(name);	}

	public static TestSuite suite() { return new TestSuite(Test_ShannonsTheorem.class);		}

	protected void setUp() throws Exception { System.out.println("Test_ShannonsTheorem Begin");	}

	protected void tearDown() throws Exception { System.out.println("Test_ShannonsTheorem End");	}

 	/**
 	 * Test the constructors.
 	 */
	public void testConstructors() {
      System.out.println("\tExecuting Test_ShannonsTheorem.testConstructors");
		shannonsTheorem = new ShannonsTheorem();
		assertNotNull("\t\tTest_ShannonsTheorem.testConstructors: ShannonsTheorem is null", shannonsTheorem);}

		
		/**
		 * Test the accessors.
		 */
		public void testAccessors() {
	      System.out.println("\tExecuting Test_ShannonsTheorem.testAccessors");
			shannonsTheorem = new ShannonsTheorem();
			assertNotNull("\t\tTest_ShannonsTheorem.testAccessors: ShannonsTheorem is null", shannonsTheorem);}
	@Test
	public void getBandwidthTest(){

		double Bandwidth;

		ShannonsTheorem test = new ShannonsTheorem();

		Bandwidth = test.getBandwidth();
		assertTrue(Bandwidth == 10.0);
		test.setBandwidth(10.0);
		Bandwidth = test.getBandwidth();
		assertTrue(Bandwidth == 10.0);
	}
	
	@Test
	public void getSignalToNoiseTest(){

		double signalToNoise ;

		ShannonsTheorem test = new ShannonsTheorem();

		signalToNoise = test.getsignalToNoise();
		assertTrue(signalToNoise == 10.0);
		test.setBandwidth(10.0);
		signalToNoise = test.getsignalToNoise();
		assertTrue (signalToNoise == 10.0);
	}
	

	/**
	 * Test the mutators/modifiers.
	 */
	public void testMutators(ShannonsTheorem shannonsTheorem) {
      System.out.println("\tExecuting Test_ShannonsTheorem.testMutators");
		shannonsTheorem = new ShannonsTheorem();
		assertNotNull("\t\tTest_ShannonsTheorem.testMutators: ShannonsTheorem is null", shannonsTheorem);}

		/*
		 *	TODO:	Add tests for your mutators here.
		 */		
	@Test			
	public void setBandwidthTest(){

		double Bandwidth;
		ShannonsTheorem test = new ShannonsTheorem();

		test.setBandwidth(10.0);
		Bandwidth = test.getBandwidth();
		assertTrue(Bandwidth ==10.0);

	}
	@Test			
	public  void setsignalToNoiseTest(){

		double signalToNoise ;
		ShannonsTheorem test = new ShannonsTheorem();

		test.setsignalToNoise(10.0);
		signalToNoise = test.getsignalToNoise();
		assertTrue(signalToNoise == 10.0);

	}

	/**
	 * Test behaviors.
	 */
	public void testBehaviors() {
      System.out.println("\tExecuting Test_ShannonsTheorem.testBehaviors");
		shannonsTheorem = new ShannonsTheorem();
		assertNotNull("\t\tTest_ShannonsTheorem.testBehaviors: ShannonsTheorem is null", shannonsTheorem);
	}


	
	@Test
	public void maximumDataRateTest(){

		double maximumDataRate;
		ShannonsTheorem test = new ShannonsTheorem();
		maximumDataRate = test.maximumDataRate();
		test.setBandwidth(10.0);
		test.setsignalToNoise(10.0);

		maximumDataRate = test.maximumDataRate();
		assertTrue(maximumDataRate == 34.59);
	}
	/*	STAND-ALONE ENTRY POINT -----------------------------------------	*/
	/**
	 *	Main line for standalone operation.
	 *	@param	args	Standard string command line parameters.
	 */
	public static void main(String[] args) {
      System.out.println("Executing Test_ShannonsTheorem suite");
  }



   /* ATTRIBUTES	-----------------------------------------------	*/
   private ShannonsTheorem shannonsTheorem = null;


}	/*	End of CLASS:	Test_ShannonsTheorem.java				*/