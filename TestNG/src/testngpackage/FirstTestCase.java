package testngpackage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTestCase extends TestInitializationAndTearDown {
	

	@BeforeClass
	public void beforeClass()
	{
		System.out.println("First Test Case Precondition for DependOnMethod class");
				
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("First Test Case After for DependOnMethod class");
				
	}
	
	
	@BeforeMethod
	public void beforeMethod()
	{System.out.println("First Test Case Precondition for every test case");}
	
	@AfterMethod
	public void afterMethod()
	{System.out.println("First Test Case Postbcondition for every test case");}
	
	
	
	@Test(priority=1)
	public void test1()
	{
		System.out.println("Test Case 1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Test Case 2");
	}
	
	@Test(priority=0)
	public void test3()
	{
		System.out.println("Test Case 3");
	}

// result will be  test2 , test3 and then test 1
// reason becos 1. test2 is by default at priority 0
// reason becos 2. it will execute in  alphabetic order.
	

}
