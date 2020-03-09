package basicselenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;

public class flipkartAllRelatedtoMouse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");

		ChromeDriver drv = new ChromeDriver();
		drv.manage().window().maximize();
		drv.get("https://www.flipkart.com/");
		drv.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		drv.findElement(By.xpath("//button[@class=\"_2AkmmA _29YdH8\"]")).click();
		/*
		 * 
		 * // mouse => Actions class.
		 */// div[@class='_3G9WVX oVjMho']/div[@class='_3aQU3C']
		Actions act = new Actions(drv);

		/*
		 * // WebElement ele = drv.findElement(By.xpath("//span[@class=\"_1QZ6fC //
		 * _3Lgyp8\"]"));
		 */
		WebElement ele = drv.findElement(By.xpath("//span[text()='Men']"));
		act.moveToElement(ele).build().perform();
		drv.findElement(By.xpath("//a[text()='Shirts']")).click();
		Thread.sleep(2000);
		ele = drv.findElement(By.xpath("//div[@class='_3G9WVX oVjMho']/div[@class='_3aQU3C']"));
		act.dragAndDropBy(ele, 50, 0).build().perform();
		Thread.sleep(2000);

		String parent = drv.getWindowHandle();
		Set<String> wins = drv.getWindowHandles();

		drv.switchTo().window("");

		for (String w : wins) {
			if (!w.equals(parent))
				drv.switchTo().window(w);
		}
		drv.close();
		System.out.println(drv.findElements(By.xpath("//div[@class='edKlv2']")).size());
		drv.findElement(By.xpath("//img[@class='_3togXc']")).click();
		
	
	}

}
