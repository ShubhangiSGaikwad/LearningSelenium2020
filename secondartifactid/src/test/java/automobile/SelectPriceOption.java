package automobile;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SelectPriceOption extends Browser {
	@Test

	public void PriceOption() throws InterruptedException {
		// Select option
		Thread.sleep(4000);
		dr.findElement(By.xpath("//label[@class=\"choosePrice ideal-radiocheck-label\"][2]/span")).click();
		Thread.sleep(4000);
		// Next
		dr.findElement(By.xpath("//button[@id='nextsendquote']")).click();
	}
}
