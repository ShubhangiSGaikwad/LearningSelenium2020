package com.cogemnto.driver;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
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

			ChromeDriverService.Builder builder = new ChromeDriverService.Builder();
			ChromeDriverService srvc = builder
					.usingDriverExecutable(new File(configurations.browserPath + "chromedriver.exe")).usingPort(9515)
					.build();
			try {
				srvc.start();
			} catch (IOException e) {
				e.printStackTrace();
			}

			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
			ChromeOptions op = new ChromeOptions();
			op.addArguments("--disable-infobars");
			op.addArguments("--start-maximized");
			dr = new ChromeDriver(op);

			// dr.get("https://freecrm.co.in");
			dr.get(configurations.url);

			dr.manage().window().maximize();
			Thread.sleep(5000);

			String actualTitle = "Free CRM #1 cloud software for any business large or small";
			Assert.assertEquals(dr.getTitle(), actualTitle);
			Thread.sleep(2000);

			dr.findElement(By.xpath("//span[@class=\"icon icon-xs mdi-chart-bar\"]")).click();
			// drv.findElementsBy

			// LOGIN TO FREECRM
			dr.findElement(By.xpath("//input[@placeholder=\"E-mail address\"]"))
					.sendKeys("freecrmselenium123@gmail.com");
			Thread.sleep(1000);
			dr.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Test@1234");
			dr.findElement(By.xpath("//div[@class=\"ui fluid large blue submit button\"]")).click();

			Thread.sleep(3000);
			/* dr.findElement(By.xpath("//span[contains(text(),'Cases')]")).click(); */

		} else {
			System.out.println("No Browser Selected");
		}

	}

}
