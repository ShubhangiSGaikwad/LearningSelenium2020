package com.cogemnto.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;


public class Login {
	
	public WebDriver dr;
	
	@BeforeTest
	public void Login() throws InterruptedException{
		Thread.sleep(7000);
		
		dr.findElement(By.xpath("//span[@class=\"icon icon-xs mdi-chart-bar\"]")).click();
		//drv.findElementsBy
		
		dr.findElement(By.xpath("//input[@placeholder=\"E-mail address\"]")).sendKeys("freecrmselenium123@gmail.com");
		Thread.sleep(1000);
		dr.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Test@1234");
		dr.findElement(By.xpath("//div[@class=\"ui fluid large blue submit button\"]")).click();
		
		Thread.sleep(3000);
		dr.findElement(By.xpath("//span[contains(text(),'Cases')]")).click();
	}
		
	}
	//Thread.sleep(10000);	
	

