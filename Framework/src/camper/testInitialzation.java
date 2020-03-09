package camper;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import testsuite.suiteinitialization;

public class testInitialzation extends suiteinitialization {

	@BeforeTest
	public void camperTestInitialization()
	{System.out.println("Execute Preconditions for Camper module");}
	
	@AfterTest
	public void camperTestTearDown()
	{System.out.println("Revert Preconditions for Camper module");}
	
	
}
