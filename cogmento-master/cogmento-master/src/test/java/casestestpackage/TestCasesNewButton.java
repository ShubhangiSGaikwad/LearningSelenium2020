package casestestpackage;

import org.testng.annotations.Test;
import com.cogemnto.driver.Driver;
import com.cogemnto.pageshost.PageHost;

public class TestCasesNewButton extends Driver{

	//Global variables
		PageHost pages;
		
		@Test
		public void verifyClickNewButton() throws InterruptedException
		{
			
			pages= new PageHost(dr);
			
			Thread.sleep(5000);
			pages.cases.casesnew.clickCasesMenu();
			
			Thread.sleep(5000);
			pages.cases.casesnew.clickCasesNewButton();
			
			pages.cases.casesnew.addDataTitle("Shubhangi");
			
			
/*			System.out.println("In Test for TestCasesNewButton ");*/   
		
			
			
			
		}
		
}





