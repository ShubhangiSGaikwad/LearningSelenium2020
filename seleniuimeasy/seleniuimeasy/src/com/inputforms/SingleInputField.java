package com.inputforms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleInputField {

	public static WebDriver drv;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\3_Personal\\Java_Selenium\\chromedriver_win32\\chromedriver.exe");
		drv = new ChromeDriver();
		
		//launch browser
		drv.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		
		//send message
		drv.findElement(By.xpath("//input[@placeholder=\"Please enter your Message\"]")).sendKeys("Hello All");
		
		
		//get message on console
		drv.findElement(By.xpath("//button[@onclick=\"showInput();\"]")).click();
					

	}

}
