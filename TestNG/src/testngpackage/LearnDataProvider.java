package testngpackage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
/* refer the testng_learnparameter.xml*/
/* multiple time the test case has to be executed with the details : username /password , pick data from xls file*/
public class LearnDataProvider {

	@BeforeClass
	@Parameters("browser")
	public void intilize(String browser)
	{
	System.out.println(""+browser+ "Open Browser");
	}
	
	@Test(dataProvider="getData")
    public void test(String username,String password)
	{ 
	 System.out.println(""+username + "Enter Username");
	 System.out.println(""+password+ "Enter Password");
	 
	}
	  
	@DataProvider
	public String [][] getData()
	{
		String[][] data= new String[2][2];
		
		data[0][0]="Username1";
		data[0][1]="Password1";

		data[1][0]="Username1";
		data[1][1]="Password2";
		
		return data;
		}
 
  // refer the exclude method in xml (if two cases (firefox and chrome) one test case will run other skip the test case as exlcude in not added in xml)
  @Test
  public void testskip()
  {
	  System.out.println("Skipp this test case");
  }

  //This is used to skip the test case for all test runs 
  @Test(enabled=false)
  public void testskip1()
  {
	  System.out.println("Skipp this test case");
  }
  
  
  
  
  
  
}
