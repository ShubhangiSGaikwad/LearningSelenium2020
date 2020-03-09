package samplePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestScript1 {

	WebDriver dr;

	@Test
	public void test1() {

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://sampleapp.tricentis.com/101/");
		
	}

	@Test
	public void test2() {
		System.out.println("Test Case 2");
	}

	@Test
	public void test3() {
		System.out.println("Test Case 3 ");
	}

}
