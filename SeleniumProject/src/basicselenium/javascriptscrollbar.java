package basicselenium;

import java.lang.invoke.SwitchPoint;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class javascriptscrollbar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver drv = new ChromeDriver();
		drv.manage().window().maximize();
		drv.get("file:///C:/Users/HP/Downloads/Practice%20(2).html");
		JavascriptExecutor js = (JavascriptExecutor)drv;
		WebElement ele = drv.findElement(By.tagName("button"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();",ele);
		ele.click();
		Alert alt = drv.switchTo().alert();
		System.out.println(alt.getText());
		
		
		
	}

}
