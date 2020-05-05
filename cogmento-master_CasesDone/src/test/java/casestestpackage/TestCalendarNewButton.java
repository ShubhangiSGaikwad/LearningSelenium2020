package casestestpackage;


import org.testng.annotations.Test;
import com.cogemnto.driver.Driver;
import com.cogemnto.pageshost.PageHost;

public class TestCalendarNewButton extends Driver {

	// Global variables
	PageHost pages;

	@Test
	public void verifyClickNewButton() throws InterruptedException {

		pages = new PageHost(dr);

		Thread.sleep(5000);
		pages.calendar.Calendarnew.clickCalenderMenu();
		Thread.sleep(7000);
		pages.calendar.Calendarnew.clickNewbutton();	
		Thread.sleep(4000);
		pages.calendar.Calendarnew.addDataTitle("Shashank"); 
		 
	}

}