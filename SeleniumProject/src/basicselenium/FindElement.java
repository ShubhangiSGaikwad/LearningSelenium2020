package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Always Constructor is called first.
		// two ways to set the driver one via environment variables , second setting it
		// in the code as below.
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");

		ChromeDriver drv = new ChromeDriver();
		drv.manage().window().maximize();
		drv.get("http://sampleapp.tricentis.com/101/");

		// by id
		// WebElement automobile = drv.findElement(By.id("nav_automobile"));
		// automobile.click();

		// by name
		// WebElement automobile = drv.findElement(By.name("Navigation Automobile"));
		// automobile.click();

		// by link
		// WebElement automobile = drv.findElement(By.linkText("Automobile"));
		// automobile.click();

		// by partial link
		// WebElement automobile = drv.findElement(By.partialLinkText("tomobile"));
		// automobile.click();

		// tagname[@AttributeName
		//// a[@id ='nav_automobile'][@name='Navigation
		// Automobile'][text()='Automobile']

		// by xpath
		// a[@id ='nav_automobile'][@name='Navigation Automobile'][text()='Automobile']
		// WebElement automobile = drv.findElement(By.xpath("//a[@id='nav_automobile']"));
		// automobile.click();

		// css selector

		// a[id ='nav_automobile']
		//WebElement automobile = drv.findElementByCssSelector("a[id ='nav_automobile']");
		//automobile.click();
		
//		WebElement automobile = drv.findElementByCssSelector("a[name ='Navigation Automobile']");
//		String actual = automobile.getText();
//		System.out.println("Text:" +actual);
//		automobile.click();
//
		//WebElement automobile = drv.findElementByCssSelector("a[id ='nav_automobile']");
		
		//WebElement automobile = drv.findElement(By.xpath("//input[@id='engineperformance']")).sendKeys("1200");  	
		WebElement automobile = drv.findElement(By.xpath("//a[@id ='nav_automobile']"));
		automobile.click();
		drv.findElement(By.xpath("//input[@id='engineperformance']")).sendKeys("1200");

		
		

	}

	/*
	 * public FirstSeleniumClass() { System.out.print("Testing Constructor");
	 * 
	 * }
	 */

}