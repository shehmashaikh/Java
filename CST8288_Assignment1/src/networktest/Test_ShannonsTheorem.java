/*
 *  @(#)Test_ShannonsTheorem.java	Feb 17, 2005
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
 *
 */

package networktest;

import junit.framework.*;

import network.ShannonsTheorem;


/**
 *	JUnit tests for the ShannonsTheorem class from the "network" project.
 * @author Shehma Shaikh 
 * @version 1.0.0
 */
public class Test_ShannonsTheorem extends TestCase {


	public Test_ShannonsTheorem(String name) { super(name);	}

	public static Test suite() { return new TestSuite(Test_ShannonsTheorem.class);		}

	protected void setUp() throws Exception { System.out.println("Test_ShannonsTheorem Begin");	}

	protected void tearDown() throws Exception { System.out.println("Test_ShannonsTheorem End");	}

 	/**
 	 * Test the constructors.
 	 */
	public void testConstructors() {
      System.out.println("\tExecuting Test_ShannonsTheorem.testConstructors");
		shannonsTheorem = new ShannonsTheorem();
		assertNotNull("\t\tTest_ShannonsTheorem.testConstructors: ShannonsTheorem is null", shannonsTheorem);

		shannonsTheorem = new ShannonsTheorem("Some attribute value");
		assertNotNull("\t\tTest_ShannonsTheorem.testConstructors: ShannonsTheorem is null", shannonsTheorem);
		/*
		 *	TODO:	Add tests for your parameterized constructors here
		 */
	}


	/**
	 * Test the accessors.
	 */
	public void testAccessors() {
      System.out.println("\tExecuting Test_ShannonsTheorem.testAccessors");
		shannonsTheorem = new ShannonsTheorem();
		assertNotNull("\t\tTest_ShannonsTheorem.testAccessors: ShannonsTheorem is null", shannonsTheorem);}
		/*
		 *	TODO:	Add tests for your accessors
		 */
		public void testgetBandwidthTest(){
			
			double Bandwidth;
			
			ShannonsTheorem test = new ShannonsTheorem();
			
			Bandwidth = test.getBandwith();
			 } 
			
			public void testgetSignalToNoiseTest(){
				
				double signalToNoise ;
				
				ShannonsTheorem test = new ShannonsTheorem();
				signalToNoise  = test.getSignalToNoise();	
			}

	
	/**
	 * Test the mutators/modifiers.
	 */
	public void testMutators() {
      System.out.println("\tExecuting Test_ShannonsTheorem.testMutators");
		shannonsTheorem = new ShannonsTheorem();
		assertNotNull("\t\tTest_ShannonsTheorem.testMutators: ShannonsTheorem is null", shannonsTheorem);}

		/*
		 *	TODO:	Add tests for your mutators here.
		 */		
	public  void testsetsignalToNoiseTest(){
		
//		double signalToNoise ;
		ShannonsTheorem test = new ShannonsTheorem();
		
//		signalToNoise  = test.setSignalToNoise(10);
//		assertTrue(signalToNoise == 10);
		}
		
	public void testsetBandwidthTest(){
		
//		double Bandwidth;
		ShannonsTheorem test = new ShannonsTheorem();
		
//		Bandwidth = test.setBandwith(10);
//		assertTrue(Bandwidth == 10);
		
	}
		

	

	/**
	 * Test behaviors.
	 */
	public void testBehaviors() {
      System.out.println("\tExecuting Test_ShannonsTheorem.testBehaviors");
		shannonsTheorem = new ShannonsTheorem();
		assertNotNull("\t\tTest_ShannonsTheorem.testBehaviors: ShannonsTheorem is null", shannonsTheorem);
	}

		/*
		 *	TODO:	Add tests for you behavior here.
		 */
		
			public void testGetMaximumDataRate(){
			double maximumDataRate;
			ShannonsTheorem test = new ShannonsTheorem();
			
			test.setBandwith(10.0);
			test.setSignalToNoise(10.0);
			
			maximumDataRate = test.getMaximumDataRate();
	
		}
	



	/*	STAND-ALONE ENTRY POINT -----------------------------------------	*/
	/**
	 *	Main line for standalone operation.
	 *	@param	args	Standard string command line parameters.
	 */
	public static void main(String[] args) {
      System.out.println("Executing Test_ShannonsTheorem suite");
      junit.textui.TestRunner.run(suite());
  }



   /* ATTRIBUTES	-----------------------------------------------	*/
   private ShannonsTheorem shannonsTheorem = null;


}	/*	End of CLASS:	Test_ShannonsTheorem.java				*/
