package automobile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class EnterInsurantData extends Browser {
	@Test
	public void InsurantData() throws InterruptedException {

		Thread.sleep(3000);
		// First Name
		dr.findElement(By.name("First Name")).sendKeys("Shashank");

		// Last Name
		dr.findElement(By.id("lastname")).sendKeys("sase");

		// Date of Birth
		dr.findElement(By.id("birthdate")).sendKeys("02/25/1995");

		// Radio button
		dr.findElement(By.xpath("(//span[@class='ideal-radio'])[1]")).click();
		// System.out.println(dr.findElement(By.xpath("(// label[text()='Male']/input"))
		// .isSelected());

		// Street Address
		dr.findElement(By.xpath("//input[@id='streetaddress']")).sendKeys("Pune");

		// Countrycc
		Select country = new Select(dr.findElement(By.id("country")));
		country.selectByVisibleText("Aruba");

		// Hobbies
		dr.findElement(By.xpath("//label[contains(.,'Bungee')]")).click();
		dr.findElement(By.xpath("//label[contains(.,'Skydiving')]")).click();

		// Zip Code
		dr.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("411014");

		// City
		dr.findElement(By.xpath("//input[@id='city']")).sendKeys("Pin");

		// Occupation
		Select Occu = new Select(dr.findElement(By.xpath("//select[@id='occupation']")));
		Occu.selectByVisibleText("Employee");

		// Website
		dr.findElement(By.xpath("//input[@id='website']")).sendKeys("www.google.com");

		// Picture
		// J:\Shashank_Bharati_Wedding\Wedding_Photo\FInal_Photo_Wedding\DSC_9386.JPG
		WebElement choosefile = dr.findElement(By.xpath("//button[@class='ideal-file-upload']"));
		choosefile.sendKeys("J:\\Shashank_Bharati_Wedding\\Wedding_Photo\\FInal_Photo_Wedding\\DSC_9386.JPG");

		// Next
		dr.findElement(By.xpath("//button[@id='nextenterproductdata']")).click();

	}
}
