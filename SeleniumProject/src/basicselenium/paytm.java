package basicselenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;

public class paytm {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");

		ChromeDriver drv = new ChromeDriver();
		drv.manage().window().maximize();
		drv.get("https://paytm.com/");
		drv.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Thread.sleep(4000);
		drv.findElement(By.xpath("//div[text()='Log In/Sign Up']")).click();
		
		Thread.sleep(5000);
		//drv.switchTo().frame(0);
		drv.switchTo().frame(drv.findElementByTagName("iframe"));
		drv.findElement(By.xpath("//span[text()='Login/Signup with mobile number and password']")).click();
		
	}

}
