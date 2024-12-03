package com.pcm.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pcm.qa.base.TestBase;

public class ManageGroupPage extends TestBase {

	@FindBy(xpath = "//span[contains(text(),'Access Management')]")
	public WebElement AccessManagementClick;

	@FindBy(xpath = "//span[contains(text(),'Manage Group')]")
	public WebElement ManageGroupClick;

	@FindBy(xpath = "//input[@formcontrolname='groupName']")
	public WebElement GroupNameData;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	public WebElement SearchClick;

	@FindBy(xpath = "//button[@class='btn btn-info']")
	public WebElement ResetSearchClick;

	@FindBy(xpath = "(//mat-icon[@svgicon='menu-bar'])[1]")
	public WebElement ActionIconClick;

	@FindBy(xpath = "//button[contains(text(),'EDIT')]")
	public WebElement EditIconClick;

	@FindBy(xpath = "//button[contains(text(),'DELETE')]")
	public WebElement DeleteIconClick;

	// @FindBy(xpath="//button[@id='searchTradingPartner_viewTPActivity']")
	// public WebElement ViewActivity;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	public WebElement UpdateGroupClick;

	@FindBy(xpath = "//div//h4")
	public WebElement Actionmsg1;

	@FindBy(xpath = "//div[@id='swal2-content']")
	public WebElement ActionMsg;

	@FindBy(xpath = "(//h3)[2]")
	public WebElement ErrorMsg;

	@FindBy(xpath = "(//select/option)[1]")
	public WebElement chooseOption;

	@FindBy(xpath = "(//button[@class='mat-button-toggle-button'])[2]")
	public WebElement Moveselect;

	@FindBy(xpath = "(//button[@class='mat-button-toggle-button'])[1]")
	public WebElement Moveallselect;

	@FindBy(xpath = "(//select/option)[1]")
	public WebElement chooseOptionRemove;

	@FindBy(xpath = "(//button[@class='mat-button-toggle-button'])[3]")
	public WebElement Removeselect;

	@FindBy(xpath = "(//button[@class='mat-button-toggle-button'])[4]")
	public WebElement Removeallselect;

	@FindBy(xpath = "//mat-select[@role='listbox']")
	public WebElement ShowEntriesDropdown;

	@FindBy(xpath = "(//h3)[1]")
	public WebElement AccessManagementpagetitle;

	@FindBy(xpath = "(//h4)[1]")
	public WebElement ManageGrouptitle;

	@FindBy(xpath = "//button[@class='btn btn-info']")
	public WebElement CancelButtonclick;
	
	@FindBy(xpath = "//button[contains(text(),'Yes, cancel it!')]")
	public WebElement yescancelitButton;

	@FindBy(xpath = "//button[@class='btn btn-pcm-1']")
	public WebElement ConfigurecolumnsButtonclick;

	@FindBy(xpath = "//button[contains(text(),'Yes, delete it!')]")
	public WebElement yesdeleteitButton;

	public ManageGroupPage() {
		PageFactory.initElements(driver, this);

	}

	public String verifyAccessManagementpagetitle() throws InterruptedException {

		// Actionselection(driver,AccessManagementClick);
		AccessManagementClick.click();
		Thread.sleep(1000);
		ManageGroupClick.click();
		Thread.sleep(1000);
		return AccessManagementpagetitle.getText();

	}

	// Actions:
	public String validateManageGroupPageTitle() throws InterruptedException {
	
//		AccessManagementClick.click();

		Thread.sleep(2000);
		
		ManageGroupClick.click();
		Thread.sleep(2000);
		return ManageGrouptitle.getText();
	}

	public void ValidateManageGroupPagewithValidData() throws InterruptedException {
		
		Thread.sleep(1000);
		GroupNameData.sendKeys("PCMSOFTWARE");
		SearchClick.click();
		Thread.sleep(1000);

	}

	public void ValidateManageGroupPagewithValidDataAndEditGroupWithMoveselect() throws InterruptedException {
		
		Thread.sleep(1000);
		GroupNameData.sendKeys("PCMSOFTWARE");
		SearchClick.click();
		Thread.sleep(1000);
		ActionIconClick.click();
		Thread.sleep(1000);
		
		EditIconClick.click();
		Thread.sleep(2000);
		
		chooseOption.click();
		Thread.sleep(1000);
		Moveselect.click();
		Thread.sleep(1000);
		Moveallselect.click();
		Thread.sleep(1000);
		UpdateGroupClick.click();
		
	}

	public void ValidateManageGroupPagewithValidDataAndEditGroupWithRemoveselect() throws InterruptedException {
		
		Thread.sleep(1000);
		GroupNameData.sendKeys("PCMSOFTWARE");
		SearchClick.click();
		Thread.sleep(1000);
		ActionIconClick.click();
		Thread.sleep(1000);
		
		EditIconClick.click();
		Thread.sleep(1000);
		chooseOptionRemove.click();
		Thread.sleep(1000);
		Removeselect.click();
		Thread.sleep(1000);
		Removeallselect.click();
		Thread.sleep(1000);
		UpdateGroupClick.click();
		Thread.sleep(1000);
	}

	public void ValidateManageGroupPagewithValidDataAndDeleteGroup() throws InterruptedException { // Actionselection(driver,AccessManagementClick);

		
		Thread.sleep(1000);
		GroupNameData.sendKeys("PCMSOFTWARE");
		SearchClick.click();
		Thread.sleep(1000);
		ActionIconClick.click();
		Thread.sleep(1000);
		DeleteIconClick.click();
		Thread.sleep(1000);
		yesdeleteitButton.click();
		
		Thread.sleep(2000);
	}

	public void ValidateManageGroupPageWithInvalidData() throws InterruptedException {
		
		Thread.sleep(1000);

		GroupNameData.sendKeys("Test1");
		Thread.sleep(1000);
		SearchClick.click();
		Thread.sleep(1000);
		
	}

	public void ValidateManageGroupPagewithResetSearch() throws InterruptedException {
		
		Thread.sleep(1000);
		SearchClick.click();
		Thread.sleep(2000);
		ResetSearchClick.click();
	}

	public void ValidateManageGroupPagewithShowEntries() throws Throwable {
		// Actionselection(driver,AccessManagementClick);

		// Thread.sleep(2000);
		// Actionselection(driver, ManageGroupClick);
		Thread.sleep(1000);
		SearchClick.click();
		Thread.sleep(3000);
		// ResetSearchClick.click();
		DropDownSelection(ShowEntriesDropdown, "50");
		Thread.sleep(2000);
		// SearchClick.click();
	}

	public void ValidateManageGroupPagewithcancelButton() throws InterruptedException {
		
		Thread.sleep(2000);
		GroupNameData.sendKeys("WeestFargo10");
		SearchClick.click();
		Thread.sleep(2000);
		ActionIconClick.click();
		Thread.sleep(1000);
		EditIconClick.click();
		Thread.sleep(2000);
		CancelButtonclick.click();
		Thread.sleep(1000);
		yescancelitButton.click();
		
	}

	

	public void Deletefunctionality() throws InterruptedException {
		// AccessManagementClick.click();
		// Actionselection(driver, ManageGroupClick);
		// ManageFileNamePatternClick.click(); SearchClick.click();
		GroupNameData.sendKeys("Testing123");
		SearchClick.click();
		ActionIconClick.click();
		// Actionselection(driver, DeleteIconClick);
		DeleteIconClick.click();
		Thread.sleep(1000);
		yesdeleteitButton.click();

	}

}
