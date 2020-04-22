package com.cogemnto.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.cogemnto.configurations.configurations;

public class Driver {
	public WebDriver dr;

	// @Test
	@BeforeTest()
	@Parameters({ "browser" })
	public void browserOpen(String browser) throws InterruptedException {

		if (browser.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver", configurations.browserPath + "chromedriver.exe");
		// dr.manage().timeouts().implicitlyWait(configurations.implicitWait,TimeUnit.SECONDS);

		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-infobars");
		op.addArguments("--start-maximized");
		dr = new ChromeDriver(op);

		// dr.get("https://freecrm.co.in");
		dr.get(configurations.url);

		dr.manage().window().maximize();
		Thread.sleep(5000);
		dr.findElement(By.xpath("//span[@class=\"icon icon-xs mdi-chart-bar\"]")).click();
		//drv.findElementsBy

		//LOGIN TO FREECRM
		dr.findElement(By.xpath("//input[@placeholder=\"E-mail address\"]")).sendKeys("freecrmselenium123@gmail.com");
		Thread.sleep(1000);
		dr.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Test@1234");
		dr.findElement(By.xpath("//div[@class=\"ui fluid large blue submit button\"]")).click();
		
		Thread.sleep(3000);
		/*dr.findElement(By.xpath("//span[contains(text(),'Cases')]")).click();*/
		
		}
		else {
			System.out.println("No Browser Selected");
		}
			
		}

	}

