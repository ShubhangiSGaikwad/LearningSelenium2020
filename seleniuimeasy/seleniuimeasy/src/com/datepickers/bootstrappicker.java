package com.datepickers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class bootstrappicker {

	public static WebDriver drv;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"D:\\3_Personal\\Java_Learning\\chromedriver_win32\\chromedriver.exe");

		drv = new ChromeDriver();

		// System.setProperty("webdriver.chrome.driver","D:\\3_Personal\\Java_Selenium\\chromedriver_win32\\chromedriver.exe");

		// launch browser
		drv.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		
		drv.manage().window().maximize();

		// input forms
		drv.findElement(By.xpath("//li[@class=\"dropdown\"]/a[contains(text(),'Date pickers')]")).click();

		// Date pickers
		drv.findElement(By.xpath("//ul[@class='dropdown-menu']/li/a[@href='./bootstrap-date-picker-demo.html']")).click();
		

		drv.findElement(By.xpath("//div[@class='input-group date']/input[@placeholder='dd/mm/yyyy']")).click();
		drv.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
		
		drv.findElement(By.xpath("//div[@class='datepicker-days']/table[@class='table-condensed']/tfoot/tr/th[@class='today']")).click();
		
		
		
		// Create object of Action class
	//	Actions action = new Actions(drv);

		// Double click to select the datepicker using actions class 
		
		//WebElement element = drv.findElement(By.xpath("//div[@class='input-group date']/input[@placeholder='dd/mm/yyyy']"));
		//drv.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
	//	action.doubleClick(element).perform();
	//	action.click(element).perform();
		
		//drv.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
		
		// Perform Double click operation using action (object) on element.
		
	/*	drv.findElement(By.xpath("//div[@class='datepicker-days']/table[@class='table-condensed']/tfoot/tr/th[@class='today']")).click();*/
				
//		Thread.sleep(4000);
		
		// delay and then clear
		/*WebElement elementclear = drv.findElement(By.xpath("//div[@class='input-group date']/input[@placeholder='dd/mm/yyyy']"));
		action.doubleClick(elementclear).perform();
		drv.findElement(By.xpath("//div[@class='datepicker-days']/table/tfoot/tr/th[@class='clear']")).click();*/
		//drv.close();
	}

}
