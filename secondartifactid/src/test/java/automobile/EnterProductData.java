package automobile;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class EnterProductData extends Browser  {

	@Test
	public void ProductData() throws InterruptedException{
		Thread.sleep(2000);
		//Start Date 
				dr.findElement(By.xpath("//input[@id='startdate']")).sendKeys("05/04/2020");
				
				//Insurance Sum
				Select insurance = new Select(dr.findElement(By.xpath("//select[@id='insurancesum']")));
				insurance.selectByIndex(4);
				
				
				//Merit Rating
				
				Select Merit = new Select(dr.findElement(By.xpath("//select[@id ='meritrating']")));
				Merit.selectByIndex(4);
				
				//Damage Insurance
				Select Damage  = new Select(dr.findElement(By.xpath("//select[@id='damageinsurance']")));
				Damage.selectByIndex(1);
				
				//Optional Products
				dr.findElement(By.xpath("//label[contains(.,'Euro')]")).click();
				dr.findElement(By.xpath("//label[contains(.,'Legal')]")).click();
				
				//Car
				Select Car  = new Select(dr.findElement(By.xpath("//select[@id ='courtesycar']")));
				Car.selectByIndex(1);
				
				// Next
				dr.findElement(By.xpath("//button[@id='nextselectpriceoption']")).click();	
	}
}
