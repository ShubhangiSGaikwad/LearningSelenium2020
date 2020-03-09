package basicselenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class practise {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");

		ChromeDriver drv = new ChromeDriver();
		drv.manage().window().maximize();
		drv.get("file:///C:/Users/HP/Downloads/Practice%20(2).html");
		//drv.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		//Thread.sleep(4000);
		
/*		Select sel1 = new Select(drv.findElement(By.id("anand"));
*/
		
		WebElement ele = drv.findElement(By.id("anand"));
		Select sel1 = new Select(ele);
		sel1.selectByIndex(0);
		sel1.selectByIndex(2);
		sel1.selectByIndex(3);
		sel1.selectByIndex(5);
		Thread.sleep(2000);
		sel1.deselectByIndex(0);
		
		
	}

}
