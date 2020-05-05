package com.cogemnto.pages.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cogemnto.pages.cases.Cases_New;

public class Homes {

	// Click on Home Icon
	WebDriver dr;
	@FindBy(xpath = "//span[contains(text(),'Home')]")
	WebElement Home;

	/*// Click on Cases Icon
	@FindBy(xpath = "//span[contains(text(),'Cases')]")
	WebElement Cases;
*/
	public Homes(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);

	}

/*	public Cases_New clickCasesMenu() {
		Cases.click();
		System.out.println("*********clickCasesMenu clicked*********");

		return new Cases_New(dr);
	}
*/
}