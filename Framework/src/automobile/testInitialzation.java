package automobile;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import testsuite.suiteinitialization;

public class testInitialzation extends suiteinitialization{

	@BeforeTest
	public void automobileTestInitialization()
	{System.out.println("Execute Preconditions for Automobile module");}
	
	@AfterTest
	public void automobileTestTearDown()
	{System.out.println("Revert Preconditions for Automobile module");}
	
}
