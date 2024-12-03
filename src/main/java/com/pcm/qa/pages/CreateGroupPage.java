package com.pcm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pcm.qa.base.TestBase;

public class CreateGroupPage extends TestBase {

	@FindBy(xpath = "//span[contains(text(),'Access Management')]")
	public WebElement AccessManagementClick;

	@FindBy(xpath = "//span[contains(text(),'Create Group')]")
	public WebElement createGroupClick;
	
	@FindBy(xpath = "//span[contains(text(),'Manage Group')]")
	public WebElement manageGroupClick;

	@FindBy(xpath = "//input[@formcontrolname='groupName']")
	public WebElement GroupNameData;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	public WebElement CreateGroupButton;

	@FindBy(xpath = "//button[@class='btn btn-info']")
	public WebElement CancelButton;

	@FindBy(xpath = "//button[contains(text(),'Yes, cancel it!')]")
	public WebElement yesCancelitButton;
	
	@FindBy(xpath = "(//button[@class='mat-button-toggle-button'])[2]")
	public WebElement MoveSelectedClick;

	@FindBy(xpath = "(//button[@class='mat-button-toggle-button'])[3]")
	public WebElement RemoveSelectedClick;

	@FindBy(xpath = "(//button[@class='mat-button-toggle-button'])[1]")
	public WebElement MoveAllClick;

	@FindBy(xpath = "(//button[@class='mat-button-toggle-button'])[4]")
	public WebElement RemoveAllClick;

	@FindBy(xpath = "//input[@formcontrolname='availableSearchInput']")
	public WebElement Filter1Data;

	@FindBy(xpath = "//input[@formcontrolname='selectedSearchInput']")
	public WebElement Filter2Data;

	@FindBy(xpath = "//div[@id='swal2-content']")
	public WebElement ActionMsg;

	@FindBy(xpath = "//div[@id='swal2-content']")
	public WebElement ActionMsgcancel;

	@FindBy(xpath = "//div[@id='swal2-content']")
	public WebElement Errormsg;

	@FindBy(xpath = "//ul[@class='errorMessage']/li")
	public WebElement Errormsg1;

	@FindBy(xpath = "(//h3)[1]")
	public WebElement AccessManagementpagetitle;

	@FindBy(xpath = "(//h4)[1]")
	public WebElement CreateGrouptitle;
	
	@FindBy(xpath = "(//h4)[1]")
	public WebElement SearchGrouptitle;

	public CreateGroupPage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyAccessManagementpagetitle() throws InterruptedException {

	
		AccessManagementClick.click();
		Thread.sleep(1000);
		createGroupClick.click();
		Thread.sleep(3000);
		return AccessManagementpagetitle.getText();

	}

	public String CreateGroupPageTitleVerification() throws InterruptedException {
		
		Thread.sleep(2000);
	//	AccessManagementClick.click();
		Thread.sleep(2000);
		createGroupClick.click();
		Thread.sleep(3000);
		return AccessManagementpagetitle.getText();
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////

	public void ValidateCreateGroupwithvaliddata() throws InterruptedException {

		Thread.sleep(1000);
		GroupNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "PCMSOFTWARE");
		Thread.sleep(2000);
		MoveAllClick.click();
		Thread.sleep(2000);
		CreateGroupButton.click();

	}

	public void ValidateCreateGroupwithOnlyMandatoryField() throws InterruptedException {
		
		Thread.sleep(1000);
		GroupNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "PCMSOFTWARE1");
		Thread.sleep(2000);
		MoveAllClick.click();
		Thread.sleep(2000);
		CreateGroupButton.click();
	}

	public void ValidateCreateGroupwithOutOnlyMandatoryField() throws InterruptedException {
		
		
		Thread.sleep(1000);
		MoveAllClick.click();
		Thread.sleep(2000);
		CreateGroupButton.click();
		
	}

	public void ValidateCreateGroupwithInvalidOrExistingData() throws InterruptedException {
		
		
		Thread.sleep(1000);
		GroupNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "PCMSOFTWARE1");
		Thread.sleep(2000);
		MoveAllClick.click();
		Thread.sleep(2000);
		CreateGroupButton.click();
		
	}

	public void ValidateCreateGroupwithCancelButton() throws InterruptedException {
	
		
		Thread.sleep(2000);
		
		CancelButton.click();
		Thread.sleep(1000);
		yesCancelitButton.click();
		
	}

	public void ValidateCreateGroupWithFilter1Search() throws InterruptedException {
		Thread.sleep(2000);
		createGroupClick.click();
		Thread.sleep(2000);
		GroupNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "PCMSOFTWARE2");
		Thread.sleep(1000);
		Filter1Data.sendKeys("AJPRODUCTION ");
		Thread.sleep(1000);
		MoveAllClick.click();
		Thread.sleep(1000);
		CreateGroupButton.click();
	}

	public void ValidateCreateGroupWithFilter2Search() throws InterruptedException {
		Thread.sleep(2000);
	
		createGroupClick.click();
		Thread.sleep(2000);
		GroupNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "PCMSOFTWARE3");
		Thread.sleep(1000);
		MoveAllClick.click();
		Thread.sleep(1000);
		Filter2Data.sendKeys("AJPRODUCTION ");
		//RemoveAllClick.click();
		RemoveSelectedClick.click();
		Thread.sleep(1000);
		CreateGroupButton.click();
	}



}
