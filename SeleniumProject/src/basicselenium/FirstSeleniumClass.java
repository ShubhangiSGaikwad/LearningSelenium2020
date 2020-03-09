package basicselenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Always Constructor is called first.
		// two ways to set the driver one via environment variables , second setting it
		// in the code as below.
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");

		
		ChromeDriver drv = new ChromeDriver();
		drv.manage().window().maximize();
		drv.get("https://yahoo.co.in");
	}

	/*
	 * public FirstSeleniumClass() { System.out.print("Testing Constructor");
	 * 
	 * }
	 */

	
	
}