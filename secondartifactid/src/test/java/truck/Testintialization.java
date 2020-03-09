package truck;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import testngAnnotations.SuiteIntilizationAndTearDown;

public class Testintialization  extends SuiteIntilizationAndTearDown {

	@BeforeTest
	public void truckInitialztion() {
		System.out.println("Preconditions of truck module");
	}
	@AfterTest
	public void truckTeardown() {
		System.out.println("Revert back changes made in initilization");
	}
	
}
