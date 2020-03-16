package com.inputforms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleCheckboxDemo {

	public static WebDriver drv;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\3_Personal\\Java_Selenium\\chromedriver_win32\\chromedriver.exe");
		drv = new ChromeDriver();

		// launch browser
		drv.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");

		// input forms
		drv.findElement(By.xpath("//li[@class=\"dropdown\"]/a[contains(text(),'Input Forms')]")).click();
		// input[contains(text(),'Click on this check box')]
		// checkbox demo
		drv.findElement(By.xpath("//ul[@class='dropdown-menu']/li/a[@href='./basic-checkbox-demo.html']")).click();

		// select the check box
		drv.findElement(By.xpath("//div[@class='checkbox']/label/input[@id='isAgeSelected']")).click();
		
		// select the multiple check box : check and uncheck
		drv.findElement(By.xpath("//input[@value='Check All']")).click();
				
		drv.findElement(By.xpath("//input[@value='Uncheck All']")).click();
		
		//select OPtion4 and verify the button text is "Check All"
		drv.findElement(By.xpath("//div[@class=\"checkbox\"]/label[contains(.,\"Option 4\")]")).click();
	
		/* TBD : Validation of text which appear after clicking the checkbox */
		
		
	}

}
