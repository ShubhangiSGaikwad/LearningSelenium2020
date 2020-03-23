package testngpackage;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
/* refer the testng_learnparameter.xml*/
/* single time the test case has to be executed with the details : username /password*/

public class LearnParameters {
	
	@Test
    @Parameters({"username","password"})
	public void test(String username,String password)
	{ 
	 System.out.println(""+username + "Enter Username");
	 System.out.println("" +password+ "Enter Password");
	 
	}
	


	

}
	
