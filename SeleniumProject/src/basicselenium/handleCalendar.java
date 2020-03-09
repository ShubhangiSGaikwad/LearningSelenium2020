package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class handleCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");

		ChromeDriver drv = new ChromeDriver();
		drv.manage().window().maximize();
		drv.get("http://sampleapp.tricentis.com/101/");

		// a[id ='nav_automobile']
		WebElement automobile = drv.findElementByCssSelector("a[id ='nav_automobile']");
		automobile.click();
		Select sel = new Select(drv.findElement(By.id("make")));
		sel.selectByIndex(3); // select ford from the drop down

		// WebElement automobile = drv.findElement(By.id("engineperformance"));
		drv.findElement(By.id("engineperformance")).sendKeys("1200");
		Actions act = new Actions(drv);
		act.moveToElement(drv.findElement(By.id("opendateofmanufacturecalender"))).build().perform();
		drv.findElement(By.id("opendateofmanufacturecalender")).click();

		// get current month and year

		String monthtext = drv.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String yeartext = drv.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

		System.out.println(monthtext);
		System.out.println(yeartext);

		while (!drv.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText().equals("July"))
			drv.findElement(By.xpath("//a[@title='Next']")).click();

		// dynamic no of columns in calendar
		// ://table[@class='ui-datepicker-calendar']/tbody/tr[1]/td/a
		// no of rows in calendar //table[@class='ui-datepicker-calendar']/tbody/tr
		// pick date ://table[@class='ui-datepicker-calendar']/tbody/tr[1]/td[4]/a

		int rows = drv.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr")).size();
		//   columns =drv.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[1]/td/a")).size();

		System.out.println("no of rows :" + rows);
		//System.out.println("no of columns :" +columns);

		for (int r = 1; r <= rows; r++) {
			int columns = drv.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[" + r + "]/td"))
					.size();
			for (int c = 1; c <= columns; c++) {
				//String text = drv.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr["+r+"]/td["+c+"]")).getText();
				//System.out.println(text);
				WebElement dateText = drv.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr["+r+"]/td["+c+"]"));
				
				if (dateText.getText().equals("July"))
				{
					System.out.println("date selected");
				}
				//System.out.println(WebElement);

				
				System.out.println(dateText);
				
			}
		}

		// String year =drv.findElement(By.xpath(""))

	}

}

//using while loop and enchanced for loop - collections  xpath for list 
