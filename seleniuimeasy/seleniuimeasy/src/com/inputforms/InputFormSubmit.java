package com.inputforms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class InputFormSubmit {

	public static WebDriver drv;

	public static void main(String args[]) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\\\3_Personal\\\\Java_Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		drv = new ChromeDriver();
		drv.manage().window().maximize();
		// launch browser
		drv.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");

		// input forms
		drv.findElement(By.xpath("//li[@class=\"dropdown\"]/a[contains(text(),'Input Forms')]")).click();

		// go to Input Form Submit Drop Down
		drv.findElement(By.xpath("//ul[@class='dropdown-menu']/li/a[@href='./input-form-demo.html']")).click();
		
		//FirstName
		drv.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Shubhangi");
		
		//Last Name
		drv.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Gaikwad");

		//Email
		drv.findElement(By.xpath("//input[@name='email']")).sendKeys("Gaikwad@gmail.com");
		
		//Phone
		drv.findElement(By.xpath("//input[@name='phone']")).sendKeys("9665088222");
				
		//Address
		drv.findElement(By.xpath("//input[@name='address']")).sendKeys("Wadgaonsheri,Sunitanagar,Pune");
		
		//City
		drv.findElement(By.xpath("//input[@name='city']")).sendKeys("Pune");
		
		//select
		Select state = new Select(drv.findElement(By.xpath("//select[@class='form-control selectpicker']")));
		state.selectByVisibleText("Alaska");
		
		//zip
		drv.findElement(By.xpath("//input[@name='zip']")).sendKeys("411003");
		
		//website
	    drv.findElement(By.xpath("//input[@name='website']")).sendKeys("www.cybage.com");
	    
	    //hosting ?
	    drv.findElement(By.xpath("//div[@class='col-md-4']/div[@class='radio']/label/input[@value='no']")).click();
		
		
	    //placeholder="Project Description
	    drv.findElement(By.xpath("//textarea[@placeholder='Project Description']")).sendKeys("This area consists of Data for Text");;
	    
	    Thread.sleep(5000);
	    
	    //click on sendkey 
	    drv.findElement(By.xpath("//button[@type='submit']")).click();
	    
	    
	    
	    	
	    
		
		}
}
