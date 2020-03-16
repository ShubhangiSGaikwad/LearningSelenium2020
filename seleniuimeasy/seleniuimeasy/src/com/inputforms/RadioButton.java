package com.inputforms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static WebDriver drv;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"D:\\\\3_Personal\\\\Java_Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		drv = new ChromeDriver();

		// launch browser
		drv.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");

		// input forms
		drv.findElement(By.xpath("//li[@class=\"dropdown\"]/a[contains(text(),'Input Forms')]")).click();

		// select the radio button page
		drv.findElement(By.xpath("//ul[@class='dropdown-menu']/li/a[@href='./basic-radiobutton-demo.html']")).click();
		
		//Radio Button Demo : Select the radio button : Male
		drv.findElement(By.xpath("//div[@class='panel-body']/label/input[@value='Male'][1]")).click();
		
		//click GetCheckedValue button
		drv.findElement(By.xpath("//button[@id='buttoncheck']")).click();
		
		// Group Radio Buttons Demo : select gender 
		drv.findElement(By.xpath("//div[h4]/label[@class='radio-inline']/input[@value='Female']")).click();
	
		//
		drv.findElement(By.xpath("//div[h4]/label[@class='radio-inline']/input[@value='5 - 15']")).click();
		
		//click the GetValue button
		drv.findElement(By.xpath("//button[@onclick='getValues();']")).click();
		
		
	}

}
