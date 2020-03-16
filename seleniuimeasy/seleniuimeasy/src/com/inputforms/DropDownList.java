package com.inputforms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropDownList {

	public static WebDriver drv;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\3_Personal\\Java_Selenium\\chromedriver_win32\\chromedriver.exe");
		drv = new ChromeDriver();
		drv.manage().window().maximize();

		// launch browser
		drv.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");

		// input forms
		drv.findElement(By.xpath("//li[@class=\"dropdown\"]/a[contains(text(),'Input Forms')]")).click();

		// Select List Demo : Select the Drop Down
		drv.findElement(By.xpath("//ul[@class='dropdown-menu']/li/a[@href='./basic-select-dropdown-demo.html']"))
				.click();

		// Select by day
		Select day = new Select(drv.findElement(By.id("select-demo")));
		day.selectByIndex(2);

		Thread.sleep(2000);
		Select day2 = new Select(drv.findElement(By.id("select-demo")));
		day2.selectByIndex(4);

		//MultiSelect
		Actions actions = new Actions(drv);
		actions.keyDown(Keys.LEFT_CONTROL).click(drv.findElement(By.xpath("//option[@value='California']")))
				.click(drv.findElement(By.xpath("//option[@value='New Jersey']")))
				.click(drv.findElement(By.xpath("//option[@value='Ohio']")))
				.click(drv.findElement(By.xpath("//option[@value='Pennsylvania']"))).build().perform();

		drv.findElement(By.xpath("//button[@id='printMe']")).click();
		Thread.sleep(4000);
		drv.findElement(By.xpath("//button[@id='printAll']")).click();

	}

	}

//In this example select class did not work.

//Multiple Select List Demo

		/*
		 * Select multilist = new Select(drv.findElement(By.id("multi-select")));
		 * multilist.selectByVisibleText("California");
		 * 
		 * Select multilist2 = new Select(drv.findElement(By.id("multi-select")));
		 * multilist2.selectByVisibleText("New Jersey");
		 * 
		 * Select multilist3 = new Select(drv.findElement(By.id("multi-select")));
		 * multilist3.selectByVisibleText("Ohio");
		 * 
		 * Select multilist4 = new Select(drv.findElement(By.id("multi-select")));
		 * multilist4.selectByVisibleText("Pennsylvania");
		 * 
		 * drv.findElement(By.id("value='California'"))
		 */
