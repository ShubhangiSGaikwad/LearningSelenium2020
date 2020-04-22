package casestestpackage;

import static org.junit.Assert.assertTrue;

import org.testng.annotations.Test;
import com.cogemnto.driver.Driver;
import com.cogemnto.pageshost.PageHost;

public class TestCasesNewButton extends Driver {

	// Global variables
	PageHost pages;

	@Test
	public void verifyClickNewButton() throws InterruptedException {

		pages = new PageHost(dr);

		Thread.sleep(5000);
		pages.cases.casesnew.clickCasesMenu();

		Thread.sleep(5000);
		pages.cases.casesnew.clickCasesNewButton();
		
		//pages.cases.casesnew.checkTitleonNewCasePage();
		
		// Added Assertion for Cases 
		boolean b = dr.getTitle().contains("Cogmento CRM");
		assertTrue(b);
		System.out.println("Value of b" +b);
	

		pages.cases.casesnew.addDataTitle("Shubhangi");

		pages.cases.casesnew.addAssignedTo();

		pages.cases.casesnew.addCompany();

		pages.cases.casesnew.addType();

//pages.cases.casesnew.addCloseDate();     
//all send keys to add here with string as constructor 

		pages.cases.casesnew.addDescription();

		pages.cases.casesnew.addPriority();

		pages.cases.casesnew.addIdentifier();

		// pages.cases.casesnew.addAccess();

		pages.cases.casesnew.addContact();

		pages.cases.casesnew.addDeal();

		pages.cases.casesnew.addTag();

		pages.cases.casesnew.addStatus();
		
		pages.cases.casesnew.Save();
		/*
		 * pages.cases.casesnew.clickaddType(); pages.cases.casesnew.
		 * pages.cases.casesnew.
		 */

		/* System.out.println("In Test for TestCasesNewButton "); */

	}

}
