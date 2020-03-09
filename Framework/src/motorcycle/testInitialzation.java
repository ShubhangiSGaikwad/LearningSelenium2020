package motorcycle;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import testsuite.suiteinitialization;


	public class testInitialzation extends suiteinitialization {

		@BeforeTest
		public void motorcycleTestInitialization()
		{System.out.println("Execute Preconditions for motorcycle module");}
		
		@AfterTest
		public void motorcycleTestTearDown()
		{System.out.println("Revert Preconditions for motorcycle module");}
			
	
}
