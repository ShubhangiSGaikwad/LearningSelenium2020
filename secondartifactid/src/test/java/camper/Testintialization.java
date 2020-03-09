package camper;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import testngAnnotations.SuiteIntilizationAndTearDown;

public class Testintialization  extends SuiteIntilizationAndTearDown {

	@BeforeTest
	public void camperInitialztion() {
		System.out.println("Preconditions of Camper module");
	}
	@AfterTest
	public void CamperTeardown() {
		System.out.println("Revert back changes made in initilization");
	}
	
}
