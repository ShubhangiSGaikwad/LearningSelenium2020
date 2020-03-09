package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");

		ChromeDriver drv = new ChromeDriver();
		drv.manage().window().maximize();
		drv.get("http://sampleapp.tricentis.com/101/");

		// a[id ='nav_automobile']
		WebElement automobile = drv.findElementByCssSelector("a[id ='nav_automobile']");
		automobile.click();
		Select sel = new Select(drv.findElement(By.id("make")));
		sel.selectByIndex(3); // select ford from the drop down

		// WebElement automobile = drv.findElement(By.id("engineperformance"));
		drv.findElement(By.id("engineperformance")).sendKeys("1200");
		drv.findElement(By.id("dateofmanufacture")).sendKeys("04/04/2019");

		Select sel1 = new Select(drv.findElement(By.id("numberofseats")));
		sel1.selectByIndex(3); // select ford from the drop down

		Select sel2 = new Select(drv.findElement(By.id("fuel")));
		sel2.selectByIndex(3); // select ford from the drop down
		
		drv.findElement(By.id("listprice")).sendKeys("1500");
		drv.findElement(By.id("licenseplatenumber")).sendKeys("100");

		drv.findElement(By.id("annualmileage")).sendKeys("1000");

		drv.findElement(By.id("nextenterinsurantdata")).click(); // click next();
		
		// page 2
		drv.findElement(By.id("firstname")).sendKeys("Shubhangi");
		drv.findElement(By.id("lastname")).sendKeys("Gaikwad");
		drv.findElement(By.id("birthdate")).sendKeys("04/19/1981");
		
		//gender
		//drv.findElement(By.xpath("//span[@class='ideal-radio']")); not working
		
		System.out.println(drv.findElement(By.xpath("//label[text()='Female']/input")).isSelected());
		drv.findElement(By.xpath("//label[text()='Female']/span")).click();
		System.out.println(drv.findElement(By.xpath("//label[text()='Female']/input")).isSelected());
		
		drv.findElement(By.id("streetaddress")).sendKeys("Pune");
		// xpath using contains
		//label[contains(.,'Bungee')]
		
		drv.findElement(By.xpath("//label[contains(.,'Bungee')]")).click();
		drv.findElement(By.xpath("//label[contains(.,'Sky')]")).click();
		drv.findElement(By.xpath("//label[contains(.,'Other')]")).click();
		drv.findElement(By.xpath("//label[contains(.,'Clif')]")).click();
		
		
		

		
		
		
		
		
		
		

	}

}
