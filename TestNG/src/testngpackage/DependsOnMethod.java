package testngpackage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DependsOnMethod extends TestInitializationAndTearDown {

	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Precondition for DependOnMethod class");
				
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After for DependOnMethod class");
				
	}
	
	/* before method would be executed for all test cases */ 
	@BeforeMethod
	public void beforeMethod()
	{System.out.println("Precondition for every test case");}
	
	@AfterMethod
	public void afterMethod()
	{System.out.println("Postbcondition for every test case");}
	
	
	
	
	
	@Test
	public void login()
	{
		System.out.println("verify login");
	}
	
	@Test(dependsOnMethods =("login"))
	public void homepage()
	{
		System.out.println("verify homepage");
		//System.out.println(10/0);
	}

	@Test(dependsOnMethods =("homepage"))   
      
	public void logout()
	{
		System.out.println("verify logout");
	}

}
