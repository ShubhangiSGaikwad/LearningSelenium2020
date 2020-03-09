package truck;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import testsuite.suiteinitialization;

public class testInitialzation extends suiteinitialization {

	@BeforeTest
	public void truckTestInitialization() {
		System.out.println("Execute Preconditions for truck module");
	}

	@AfterTest
	public void motorcycleTestTearDown() {
		System.out.println("Revert Preconditions for truck module");
	}

}
