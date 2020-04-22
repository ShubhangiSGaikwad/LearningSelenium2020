package com.cogemnto.pages.cases;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Cases_New {

	// Click on Cases Icon
	@FindBy(xpath = "//span[contains(text(),'Cases')]")
	WebElement Cases;

	// Click on Cases New
	WebDriver dr;
	@FindBy(xpath = "//a[@href=\"/cases/new\"]/button[@class=\"ui linkedin button\"]")
	WebElement CasesNew;

	// Add Title to New Cases

	@FindBy(xpath = "//input[@name=\"title\"]")
	WebElement Title;

	@FindBy(xpath = "//div[@aria-disabled=\"false\"]/i")
	WebElement AssignTo;

	@FindBy(xpath = "//div[@role='listbox' and @class='ui active visible fluid selection dropdown']/div[@class='visible menu transition']/div")
	WebElement DropdownList;

	@FindBy(xpath = "//div[@name='company']/input[@aria-autocomplete=\"list\"]")
	WebElement Company;

	@FindBy(xpath = "//div[@name=\"company\"]/div[@aria-multiselectable=\"false\"]/div[@role=\"option\"]/span")
	WebElement Companyadd;

	@FindBy(xpath = "//div[@name=\"type\"]")
	WebElement ClickType;

	@FindBy(xpath = "//div[@role=\"option\"]/span[contains(text(),'General Support')]")
	WebElement SelectType;

	@FindBy(xpath = "//*[contains(text(),'Close Date')]")
	WebElement ClickCalendarCloseDate;

	@FindBy(xpath = "//textarea[@name=\"description\"]")
	WebElement Description;

	@FindBy(xpath = "//div[@name=\"priority\"]")
	WebElement Priority;

	@FindBy(xpath = "//span[contains(text(),'Normal')]")
	WebElement SelectPriorityNormal;

	@FindBy(xpath = "//input[@name=\"identifier\"]")
	WebElement Identifier;

	@FindBy(xpath = "//button[@class=\"ui small fluid positive toggle button\"]")
	// @FindBy(xpath = "//i[@class=\"unlock icon\"]")
	WebElement ChangePublicButton;

	@FindBy(xpath = "//div[contains(text(),'Select users allowed access')]")
	WebElement ClickSelectUsers;

	@FindBy(xpath = "//div[@class=\"visible menu transition\"]/div[@role=\"option\"]/span[contains(text(),\"freecrmselenium freecrmselenium\")]")
	WebElement AccessUserSelection;

	@FindBy(xpath = "//div[@name=\"contact\"]/input[@class=\"search\"]")
	WebElement Contact;

	@FindBy(xpath = "//div[@name=\"contact\"]/div[@aria-multiselectable=\"false\"]/div[@data-additional=\"true\"]/span")
	WebElement ContactAdd;

	@FindBy(xpath = "//div[@name=\"deal\"]/i")
	WebElement Deal;

	@FindBy(xpath = "//div[@name=\"deal\"]/input[@aria-autocomplete=\"list\"]")
	WebElement DealSendData;

	@FindBy(xpath = "//div[@name=\"deal\"]/div[@aria-multiselectable=\"false\"]/div[@data-additional=\"true\"]/span")
	WebElement DealAdd;

	@FindBy(xpath = "//label[@for=\"tags\"]/div[@role=\"combobox\"]")
	WebElement Tag;

	@FindBy(xpath = "//label[@for=\"tags\"]/div[@role=\"combobox\"]/input[@aria-autocomplete=\"list\"]")
	WebElement TagAdd;

	@FindBy(xpath = "//label[@for=\"tags\"]/div[@role=\"combobox\"]/div[@aria-multiselectable=\"true\"]/div[@data-additional=\"true\"]/span")
	WebElement TagSelect;

	@FindBy(xpath = "//div[@name=\"status\"]")
	WebElement Status;

	@FindBy(xpath = "//span[contains(text(),'Reviewing')]")
	WebElement StatusValue;

	@FindBy(xpath = "//div[@class=\"item\"]/button[@class=\"ui linkedin button\"]")
	WebElement SaveButton;

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

	/*public void checkTitleonNewCasePage() throws InterruptedException
	{
		boolean b = dr.getTitle().contains("Cogmento CRM");
		assertTrue(b);
		System.out.println("Value of b" +b);
		//returns True;
		Thread.sleep(2000);
	}
	*/
	public void addDataTitle(String TitleData) throws InterruptedException {
		/*String actualTitle = "Cogmento CRM";
		Assert.assertEquals(dr.getTitle(), actualTitle);
		Thread.sleep(2000);
	*/	Title.sendKeys(TitleData);
	}

	public void addAssignedTo() throws InterruptedException {
		// TODO Auto-generated method stub
		AssignTo.click();
		Thread.sleep(5000);
		DropdownList.click();

	}

	
	
	public void addCompany() { // TODO Auto-generated
		// Company.sendKeys(companyname);
		Company.click();
		Company.sendKeys("New");
		Companyadd.click();
	}

	public void addType() {
		ClickType.click();
		SelectType.click();
	}

	public void addCloseDate() {
		ClickCalendarCloseDate.click();
	}

	public void addDescription() {
		Description.sendKeys("Adding Description");
	}

	public void addPriority() {
		Priority.click();
		SelectPriorityNormal.click();
	}

	public void addIdentifier() {
		Identifier.click();
		Identifier.sendKeys("freecrmselenium @gmail.com");
	}

	public void addAccess() {
		ChangePublicButton.click();
		ClickSelectUsers.click();
		AccessUserSelection.click();
		// ChangePublicButton.sendKeys("freecrmselenium@gmail.com");
	}

	public void addContact() {
		Contact.click();
		Contact.sendKeys("NewContact");
		ContactAdd.click();
	}

	public void addDeal() {
		Deal.click();
		DealSendData.sendKeys("Newdeal");
		DealAdd.click();
	}

	public void addTag() {
		Tag.click();
		TagAdd.sendKeys("NewTag");
		TagSelect.click();

	}

	public void addStatus() {
		Status.click();
		StatusValue.click();
	}

	public void Save() {

		SaveButton.click();

	}
}
