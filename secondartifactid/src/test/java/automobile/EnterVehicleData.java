package automobile;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class EnterVehicleData extends Browser {

	@Test
	public void VehicleData() throws InterruptedException {
		
		// automobile selection
		dr.findElement(By.cssSelector("a#nav_automobile")).click();

		// Select make
		Select sel = new Select(dr.findElement(By.id("make")));
		sel.selectByVisibleText("Honda");

		Thread.sleep(4000);
		// Selection of engineperformance
		dr.findElement(By.id("engineperformance")).sendKeys("1200");
		Thread.sleep(2000);
		// Selection of date
		dr.findElement(By.id("dateofmanufacture")).sendKeys("02/25/2020");

		// Selection of Number of Seats dropdown
		sel = new Select(dr.findElement(By.xpath("//select[@name='Number of Seats']")));
		sel.selectByVisibleText("4");

		// Selection of fuel
		sel = new Select(dr.findElement(By.id("fuel")));
		sel.selectByVisibleText("Gas");

		// List price
		dr.findElement(By.id("listprice")).sendKeys("100000");

		// Selection of Licences plate
		dr.findElement(By.id("licenseplatenumber")).sendKeys("1231323");

		// annualmileage
		dr.findElement(By.id("annualmileage")).sendKeys("231");

		// Next
		dr.findElement(By.id("nextenterinsurantdata")).click();
	}

}
