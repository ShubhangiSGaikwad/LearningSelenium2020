package com.cogemnto.pages.cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cases_New {

	// Click on Cases Icon
	@FindBy(xpath = "//span[contains(text(),'Cases')]")
	WebElement Cases;

	// Click on Cases New
	WebDriver dr;
	@FindBy(xpath = "//a[@href=\"/cases/new\"]/button[@class=\"ui linkedin button\"]")
	WebElement CasesNew;
	
	// Add Title to New Cases
	
	@FindBy(xpath="//input[@name=\"title\"]")
	WebElement Title;
	
	
	public Cases_New(WebDriver dr) {
		PageFactory.initElements(dr, this);

	}

	public Cases_New clickCasesMenu() {
		Cases.click();
		System.out.println("*********clickCasesMenu clicked*********");
		return new Cases_New(dr);
	}

	public Cases_New clickCasesNewButton() {
		CasesNew.click();
		System.out.println("*********clickCasesNewButton clicked*********");
				
		return new Cases_New(dr);
	}

	public void addDataTitle(String TitleData)
	{
		Title.sendKeys(TitleData);
	
	}
	
			
	
	
	/*
	 * public Cases_New clickCasesMenu() { Cases.click();
	 * System.out.println("*********clickCasesMenu clicked*********");
	 * 
	 * return new Cases_New(dr); }
	 */

	/*
	 * public Cases_New() {
	 * 
	 * CasesNew.click();
	 * 
	 * }
	 */
}

// initialize page element on that page ==>PageFactory

/*
 * public Automobile_EnterVehicleData(WebDriver dr) {
 * PageFactory.initElements(dr, this); }
 * 
 * //add elements
 * 
 * public void enterengineperformance(String performanceKW) {
 * engineperformance.sendKeys(performanceKW); }
 */
