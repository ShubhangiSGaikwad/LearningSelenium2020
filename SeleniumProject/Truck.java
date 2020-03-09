package tricentis;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Truck {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		ChromeDriver drv = new ChromeDriver();
		drv.manage().window().maximize();
		Thread.sleep(10000);
		drv.get("http://sampleapp.tricentis.com/101/");
		Thread.sleep(10000);

		// click Truck
		WebElement truck = drv.findElementByCssSelector("a[id ='nav_truck']");
		truck.click();
		Thread.sleep(4000);

		// Page 1 : Enter Vehicle Data page : Select Make
		Select sel = new Select(drv.findElement(By.id("make")));
		Thread.sleep(4000);
		sel.selectByIndex(3); // select Ford.

		// Page 1 :Enter Vehicle Data page : Select Engine Performance
		Thread.sleep(4000);

		drv.findElement(By.xpath("//input[@id='engineperformance']")).sendKeys("1200");
		Thread.sleep(4000);

		drv.findElement(By.xpath("//input[@id='dateofmanufacture']")).sendKeys("04/10/2000");
		Thread.sleep(4000);

		Select Sel1 = new Select(drv.findElement(By.xpath("//select[@id='numberofseats']")));
		Sel1.selectByIndex(4);

		Thread.sleep(4000);

		Select Sel2 = new Select(drv.findElement(By.xpath("//select[@id='fuel']")));
		Sel2.selectByIndex(2);

		drv.findElement(By.xpath("//input[@id='payload']")).sendKeys("3");

		Thread.sleep(4000);
		drv.findElement(By.xpath("//input[@id='totalweight']")).sendKeys("200");

		Thread.sleep(4000);
		drv.findElement(By.xpath("//input[@id='listprice']")).sendKeys("2000");

		Thread.sleep(4000);
		drv.findElement(By.xpath("//input[@id='licenseplatenumber']")).sendKeys("347853");

		Thread.sleep(4000);
		drv.findElement(By.xpath("//input[@id='annualmileage']")).sendKeys("344");

		Thread.sleep(4000);
		drv.findElement(By.xpath("//button[@id='nextenterinsurantdata']")).click();

		// Page 2 :Enter Insurant Data
		Thread.sleep(4000);
		drv.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Shubhangi");

		Thread.sleep(4000);
		drv.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Gaikwad");

		Thread.sleep(4000);
		drv.findElement(By.xpath("//input[@id='birthdate']")).sendKeys("02/12/1981");

		Thread.sleep(4000);
		/* drv.findElement(By.xpath("//label[text()='Male']")).click(); */

		drv.findElement(By.xpath("//label[text()='Female']")).click();
		Thread.sleep(4000);

		drv.findElement(By.xpath("//input[@id='streetaddress']")).sendKeys("Sunitanagar");
		Thread.sleep(4000);

		Select sel3 = new Select(drv.findElement(By.xpath("//select[@id='country']")));
		sel3.selectByIndex(3);

		Thread.sleep(4000);
		drv.findElement(By.xpath("//input[@id='zipcode']"));

		Thread.sleep(4000);
		drv.findElement(By.xpath("//input[@id='city']")).sendKeys("Pune");

		Select sel4 = new Select(drv.findElement(By.xpath("//select[@id='occupation']")));
		sel4.selectByIndex(3);

		Thread.sleep(4000);
		drv.findElement(By.xpath("//label[contains(.,'Speeding')]")).click();
		drv.findElement(By.xpath("//label[contains(.,'Bun')]")).click();
		drv.findElement(By.xpath("//label[contains(.,'Skydiving')]")).click();
		drv.findElement(By.xpath("//label[contains(.,'Other')]")).click();

		Thread.sleep(4000);
		drv.findElement(By.xpath("//input[@id='website']")).sendKeys("www.google.com");
		WebElement choosefile = drv.findElement(By.xpath("//input[@class='ideal-file-filename']"));
		choosefile.sendKeys("C:\\Users\\HP\\first.java");
		
		/* drv.findElement(By.xpath("//button[@class='ideal-file-upload']")).click(); */

		drv.findElement(By.xpath("//button[@id='nextenterproductdata']")).click();

		drv.findElement(By.xpath("//input[@id=\"startdate\"]")).sendKeys("5/22/2020");

		Select sel5 = new Select(drv.findElement(By.xpath("//select[@id='insurancesum']")));
		sel5.selectByIndex(3);

		Select sel6 = new Select(drv.findElement(By.xpath("//select[@id='damageinsurance']")));
		sel6.selectByIndex(2);

		drv.findElement(By.xpath("//label[text()=\"Euro Protection\"]")).click();
		drv.findElement(By.xpath("//label[text()=\'Legal Defense Insurance']")).click();
		drv.findElement(By.xpath("//button[@id='nextselectpriceoption']"));

		drv.findElement(By.xpath("//button[@id='nextselectpriceoption']")).click();

		WebElement element = drv.findElement(By.xpath("//input[@id='selectsilver']"));

		((JavascriptExecutor) drv).executeScript("arguments[0].click();", element);

	}

}
