package com.inputforms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjaxFormSubmit {

	public static WebDriver drv;

	public static void main(String args[]) {

		System.setProperty("webdriver.chrome.driver",
				"D:\\3_Personal\\Java_Selenium\\chromedriver_win32\\chromedriver.exe");
		drv = new ChromeDriver();
		drv.get("https://www.seleniumeasy.com/test/");
		drv.manage().window().maximize();
		// input forms
		drv.findElement(By.xpath("//li[@class=\"dropdown\"]/a[contains(text(),'Input Forms')]")).click();
		drv.findElement(By.xpath("//ul[@class='dropdown-menu']/li/a[@href='./ajax-form-submit-demo.html']")).click();
		
		//Ajax Form Enter Name
        drv.findElement(By.xpath("//div[@class='form-group']/input[@id='title']")).sendKeys("Name is fame");
        
        drv.findElement(By.xpath("//div[@class='form-group']/textarea[@id='description']")).sendKeys("This area to add data .......");
        
        drv.findElement(By.xpath("//div[@id='submit-control']/input[@name='btn-submit']")).click();
        
        
      //div[@id='submit-control']/input[@name='btn-submit']
	}

}