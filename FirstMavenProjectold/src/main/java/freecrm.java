import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class freecrm {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
			ChromeDriver drv = new ChromeDriver();
			drv.manage().window().maximize();
			
			drv.get("https://freecrm.co.in");
			
			Thread.sleep(10000);	
			drv.findElement(By.xpath("//span[@class=\"icon icon-xs mdi-chart-bar\"]")).click();
			//drv.findElementsBy
			
			drv.findElement(By.xpath("//input[@placeholder=\"E-mail address\"]")).sendKeys("freecrmselenium123@gmail.com");
			Thread.sleep(1000);
			drv.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Test@1234");
			drv.findElement(By.xpath("//div[@class=\"ui fluid large blue submit button\"]")).click();
			
			Thread.sleep(3000);
			drv.findElement(By.xpath("//span[contains(text(),'Cases')]")).click();
			
	}

}
