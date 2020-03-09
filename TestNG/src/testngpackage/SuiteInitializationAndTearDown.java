package testngpackage;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteInitializationAndTearDown {
	@BeforeSuite
	public void suiteInitialization()
	{
		System.out.println("Services Start");
		System.out.println("Delete Logs");
		System.out.println("Deploy Dependencies or Application");
		System.out.println("Report Initialzation");
	}
	@AfterSuite
	public void suiteTearDown()
	{
		System.out.println("Report Closing");
		
	}
	

}
