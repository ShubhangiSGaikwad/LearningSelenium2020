package automobile;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SendQuote extends Browser  {
	@Test

	public void Quote() {

		//Email
				dr.findElement(By.id("email")).sendKeys("shasha@gmail.com");
				
				//Phone 
				dr.findElement(By.xpath("//input[@id='phone']")).sendKeys("342424223");
				
				//username
				dr.findElement(By.xpath("//input[@id='username']")).sendKeys("omgindia");
				
				//Password
				dr.findElement(By.xpath("//input[@id='password']")).sendKeys("Qwer1234");
				
				//confirm password
				dr.findElement(By.xpath("//input[@id='confirmpassword']")).sendKeys("Qwer1234");
				
				//Comment
				dr.findElement(By.xpath("//textarea[@id='Comments']")).sendKeys("Who are you");
				
				//Send
				dr.findElement(By.xpath("//button[@id='sendemail']")).click();
	}
}
