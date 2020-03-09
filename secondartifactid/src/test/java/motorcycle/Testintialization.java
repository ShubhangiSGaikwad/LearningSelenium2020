package motorcycle;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import testngAnnotations.SuiteIntilizationAndTearDown;

public class Testintialization  extends SuiteIntilizationAndTearDown {

	@BeforeTest
	public void motorcyleInitialztion() {
		System.out.println("Preconditions of Motorcycle module");
	}
	@AfterTest
	public void motorcyledown() {
		System.out.println("Revert back changes made in initilization");
	}
	
}
