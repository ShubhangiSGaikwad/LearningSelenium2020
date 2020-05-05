package com.cogemnto.pages.calendar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calendar_new {

	WebDriver dr;
	// Click on Cases Icon
	@FindBy(xpath = "//span[contains(text(),'Calendar')]")
	WebElement Calendar;

	/*
	 * @FindBy(xpath =
	 * "//a[@href=\"/calendar/new\"]/button[@class=\"ui linkedin button\"]")
	 */
	// @FindBy(xpath = "//button[@class='ui linkedin button']")
	@FindBy(xpath = "//div[@class='item ']/a[@href=\"/calendar/new\"]/button[@class=\"ui linkedin button\"]")
	WebElement New;

	// Add Title to New Cases
	@FindBy(xpath = "//input[@name=\"title\"]")
	WebElement Title;

	public Calendar_new(WebDriver dr) {
		PageFactory.initElements(dr, this);

	}

	public Calendar_new clickCalenderMenu() {
		Calendar.click();
		System.out.println("**clickCalender**");
		return new Calendar_new(dr);
	}

	public Calendar_new clickNewbutton() {
		New.click();
		// dr.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

		System.out.println("***clickCalenderNewbuttonclicked****");

		return new Calendar_new(dr);
	}

	@SuppressWarnings("unused")
	public void addDataTitle(String TitleData) {
		System.out.println("***Title Data 1 ****");
		// Create object of WebDriverWait class
		WebDriverWait wait = new WebDriverWait(dr, 20);
		// Wait till the element is not visible
		WebElement element = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"title\"]")));
		System.out.println("***Title Data 2 ****");
		Title.sendKeys(TitleData);

	}
}