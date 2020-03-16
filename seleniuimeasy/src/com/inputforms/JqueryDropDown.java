package com.inputforms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class JqueryDropDown {

	public static WebDriver drv;

	public static void main(String args[]) {

		System.setProperty("webdriver.chrome.driver",
				"D:\\3_Personal\\Java_Selenium\\chromedriver_win32\\chromedriver.exe");
		drv = new ChromeDriver();
		drv.get("https://www.seleniumeasy.com/test/");
		drv.manage().window().maximize();

		// input forms
		drv.findElement(By.xpath("//li[@class=\"dropdown\"]/a[contains(text(),'Input Forms')]")).click();

		// jQuery
		drv.findElement(By.xpath("//ul[@class='dropdown-menu']/li/a[@href='./jquery-dropdown-search-demo.html']"))
				.click();

		// Select Country
		WebElement mySelectElement =drv.findElement(By.xpath("//select[@id='country']"));
		Select select = new Select(mySelectElement);
		select.selectByVisibleText("India");
		
		
		 WebElement select1 = drv.findElement(By.xpath("//option[@value='AL']"));
	     WebElement select2 = drv.findElement(By.xpath("//option[@value='CA']"));
	     WebElement select3 = drv.findElement(By.xpath("//option[@value='KY']"));
		
		
	/*	WebElement mySelectElementcountry =drv.findElement(By.xpath("//select[@class='js-example-basic-multiple select2-hidden-accessible']"));
		Select selectmulticountry = new Select(mySelectElementcountry);
		select.selectByVisibleText("Alabama");
		select.selectByVisibleText("California");
		select.selectByVisibleText("Massachusetts");*/
		
		

		// Select Mulitple Country

		
		
		/*drv.findElement(
				By.xpath("//span[@class='select2-selection select2-selection--multiple']/ul/li[@title='Arizona']"))
				.click();

		drv.findElement(
				By.xpath("//span[@class='select2-selection select2-selection--multiple']/ul/li[@title='Arkansas']"))
				.click();

		drv.findElement(
				By.xpath("//span[@class='select2-selection select2-selection--multiple']/ul/li[@title='Hawaii']"))
				.click();*/

	}

}