package suite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteIntilizationAndTearDown {

	@BeforeSuite
	public void suiteInitilaztion() {
			System.out.println("Start Services");
			System.out.println("Delete log");
			System.out.println("Reports Initialization");
		}
	@AfterSuite
		public void suiteTeardown() {
			System.out.println("Report Closing");
		}
}
