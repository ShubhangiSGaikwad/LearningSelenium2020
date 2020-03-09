package testngpackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestInitializationAndTearDown extends SuiteInitializationAndTearDown{
	
	@BeforeTest
	public void automobileTestInitialization()
	{System.out.println("Execute Preconditions for Automobile module");}
	
	@AfterTest
	public void automobileTestTearDown()
	{System.out.println("Revert Preconditions for Automobile module");}
	
}
