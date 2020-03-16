package com.inputforms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwoInputFields {

public static WebDriver drv;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\3_Personal\\Java_Selenium\\chromedriver_win32\\chromedriver.exe");
		drv = new ChromeDriver();
		
		//launch browser
		drv.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		
		//enter a
		drv.findElement(By.xpath("//input[@id=\"sum1\"]")).sendKeys("10");
	
		//enter b
		drv.findElement(By.xpath("//input[@id=\"sum2\"]")).sendKeys("20");
		
		
		//get message on console
		drv.findElement(By.xpath("//button[@onclick=\"return total()\"]")).click();
					

	}
}
