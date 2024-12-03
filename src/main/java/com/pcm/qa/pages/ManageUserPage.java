package com.pcm.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pcm.qa.base.TestBase;

public class ManageUserPage extends TestBase {

	@FindBy(xpath = "//span[contains(text(),'Access Management')]")
	public WebElement AccessManagementClick;

	@FindBy(xpath = "//span[contains(text(),'Create User')]")
	public WebElement createUserClick;

	@FindBy(xpath = "//span[contains(text(),'Manage User')]")
	public WebElement ManageUserClick;

	@FindBy(xpath = "//input[@name='userId']")
	public WebElement UserIdData;

	@FindBy(xpath = "//mat-select[@aria-label='Role']")
	public WebElement RoleDropDown;

	@FindBy(xpath = "//input[@name='firstName']")
	public WebElement FirstNameData;

	@FindBy(xpath = "//input[@name='lastName']")
	public WebElement LastNameData;

	@FindBy(xpath = "//input[@name='email']")
	public WebElement EmailData;

	@FindBy(xpath = "//mat-select[@aria-label='Status']")
	public WebElement StatusDropDown;

	@FindBy(xpath = "//mat-select[@aria-label='Status']")
	public WebElement EditStatus;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	public WebElement SearchUserClick;

	@FindBy(xpath = "//button[@id='submitBtn']")
	public WebElement SaveUserInfoClick;

	@FindBy(xpath = "//button[@class='btn btn-info']")
	public WebElement ResetSearchClick;

	@FindBy(xpath = "(//*[@svgicon='menu-bar'])[1]")
	public WebElement IconMenu;

	@FindBy(xpath = "(//button[@class='mat-button-toggle-button'])[1]")
	public WebElement MoveAllPartnerClick;

	@FindBy(xpath = "(//button[@class='mat-button-toggle-button'])[5]")
	public WebElement MoveAllGroupClick;

	@FindBy(xpath = "//select[@id='bootstrap-duallistbox-nonselected-list_userBean.addedPartners']/option[2]")
	public WebElement SelectAssignPartners;

	@FindBy(xpath = "//select[@id='bootstrap-duallistbox-nonselected-list_userBean.addedGroups']/option[1]")
	public WebElement SelectAssignGroups;

	@FindBy(xpath = "//div[@id='swal2-content']")
	public WebElement ActionMsg;

	@FindBy(xpath = "(//h3)[2]")
	public WebElement ErrorMsg;

	@FindBy(xpath = "(//*[@svgicon='menu-bar'])[1]")
	public WebElement Actionsicon;

	@FindBy(xpath = "//button[@class='btn btn-pcm-edit']")
	public WebElement EditClick;

	@FindBy(xpath = "//select[@id='editUser_userBean_status']")
	public WebElement StatusUpdateDropDown;

	@FindBy(xpath = "//button[contains(text(),'UPDATE USER')]")
	public WebElement UpdateClick;

	@FindBy(xpath = "//button[@class='btn btn-pcm-delete']")
	public WebElement DeleteClick;

	@FindBy(xpath = "//button[contains(text(),'Yes, delete it!')]")
	public WebElement yesDeleteitClick;

	@FindBy(xpath = "//button[text()='DEACTIVATE']")
	public WebElement DeactivateClick;

	@FindBy(xpath = "//button[contains(text(),'Yes, deactivate it!')]")
	public WebElement yesDeactivateitClick;

	@FindBy(xpath = "//button[text()='ACTIVATE']")
	public WebElement ActivateClick;

	@FindBy(xpath = "//button[contains(text(),'Yes, activate it!')]")
	public WebElement yesActivateitClick;

	@FindBy(xpath = "//select[@id='userType']")
	public WebElement UserTypeDD;

	@FindBy(xpath = "//ul[@class='errorMessage']/li")
	public WebElement Error1;

	@FindBy(xpath = "(//div//h4)[1]")
	public WebElement ManageUsertitle;

	// Initializing the Page Objects:
	public ManageUserPage() {
		PageFactory.initElements(driver, this);
	}

	public String validateManageUserPageTitle() throws InterruptedException {

	//	AccessManagementClick.click();
		Thread.sleep(1000);
		ManageUserClick.click();
		Thread.sleep(3000);
		return ManageUsertitle.getText();
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////

	public void ValidateManageUserPagewithvaliddata() throws Throwable {

		Thread.sleep(3000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingbuser");
		Thread.sleep(3000);
		DropDownSelection(RoleDropDown, "Business User");
		Thread.sleep(3000);

		FirstNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "TestFirstName");
		LastNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "TestLastName");
		Thread.sleep(3000);
		DropDownSelection(StatusDropDown, "Inactive"); // Inactive //Active
		Thread.sleep(3000);
		SearchUserClick.click();

	}

	public void ValidateManageUserWithValiddataAndEdittheUser() throws Throwable {

		Thread.sleep(3000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingbuser");
		Thread.sleep(3000);
		DropDownSelection(RoleDropDown, "Business User");
		Thread.sleep(3000);

		FirstNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "TestFirstName");
		LastNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "TestLastName");
		Thread.sleep(3000);
		DropDownSelection(StatusDropDown, "Inactive");
		Thread.sleep(3000);
		SearchUserClick.click();
		Thread.sleep(3000);
		IconMenu.click();
		Thread.sleep(1000);
		EditClick.click();
		Thread.sleep(4000);
		FirstNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Testfname");
		LastNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Testlname");
		Thread.sleep(1000);
		DropDownSelection(EditStatus, "Active");

		Thread.sleep(3000);

		MoveAllPartnerClick.click();
		Thread.sleep(3000);

		MoveAllGroupClick.click();
		Thread.sleep(3000);

		UpdateClick.click();

	}

	public void ValidateManageUserWithValiddataAndDeactivatetheUser() throws Throwable {

		Thread.sleep(3000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingbuser");
		Thread.sleep(3000);
		DropDownSelection(RoleDropDown, "Business User");
		Thread.sleep(3000);

		FirstNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Testfname");
		LastNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Testlname");

		Thread.sleep(3000);
		SearchUserClick.click();

		IconMenu.click();
		Thread.sleep(1000);
		DeactivateClick.click();
		Thread.sleep(1000);
		yesDeactivateitClick.click();
		Thread.sleep(1000);

	}

	public void ValidateManageUserWithValiddataAndActivatetheUser() throws Throwable {

		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingbuser");
		Thread.sleep(3000);
		DropDownSelection(RoleDropDown, "Business User");
		Thread.sleep(3000);

		FirstNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Testfname");
		LastNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Testlname");

		Thread.sleep(3000);
		SearchUserClick.click();
		Thread.sleep(3000);
		IconMenu.click();
		Thread.sleep(1000);
		ActivateClick.click();
		Thread.sleep(1000);
		yesActivateitClick.click();
		Thread.sleep(1000);

	}

	public void ValidateManageUserWithValiddataAndDeletetheUser() throws Throwable {

		Thread.sleep(1000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingbuser");
		Thread.sleep(3000);
		DropDownSelection(RoleDropDown, "Business User");
		Thread.sleep(3000);

		FirstNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Testfname");
		LastNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Testlname");

		Thread.sleep(3000);
		SearchUserClick.click();

		Thread.sleep(3000);
		IconMenu.click();
		Thread.sleep(1000);

		DeleteClick.click();
		yesDeleteitClick.click();
		Thread.sleep(1000);

	}

	///////////////////////////////////////////////////////////////////////////////

	public void ValidateManageUserPagewithRoleasAdminOfvaliddata() throws Throwable {

		Thread.sleep(3000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingadmin");
		Thread.sleep(3000);
		DropDownSelection(RoleDropDown, "Admin");
		Thread.sleep(3000);
		FirstNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "adminfirstname");
		LastNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "adminlastname");
		Thread.sleep(3000);
		DropDownSelection(StatusDropDown, "Inactive");
		Thread.sleep(3000);
		SearchUserClick.click();

	}

	public void ValidateManageUserWithRoleasAdminAndEdittheUser() throws Throwable {

		Thread.sleep(1000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingadmin");
		Thread.sleep(3000);
		DropDownSelection(RoleDropDown, "Admin");
		Thread.sleep(3000);

		FirstNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "adminfirstname");
		LastNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "adminlastname");

		Thread.sleep(1000);
		SearchUserClick.click();
		Thread.sleep(1000);
		IconMenu.click();
		Thread.sleep(1000);
		EditClick.click();
		Thread.sleep(5000);

		FirstNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "adminfname");
		LastNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "adminlname");
		Thread.sleep(3000);
		DropDownSelection(EditStatus, "Active");
		Thread.sleep(3000);

		UpdateClick.click();

	}

	public void ValidateManageUserWithRoleasAdminAndDeactivatetheUser() throws Throwable {

		Thread.sleep(1000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingadmin");
		Thread.sleep(3000);
		DropDownSelection(RoleDropDown, "Admin");
		Thread.sleep(3000);

		FirstNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "adminfname");
		LastNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "adminlname");

		Thread.sleep(3000);
		SearchUserClick.click();
		Thread.sleep(1000);
		IconMenu.click();
		Thread.sleep(1000);

		DeactivateClick.click();
		Thread.sleep(1000);
		yesDeactivateitClick.click();
		Thread.sleep(1000);

	}

	public void ValidateManageUserWithRoleasAdminAndActivatetheUser() throws Throwable {

		Thread.sleep(1000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingadmin");
		Thread.sleep(3000);
		DropDownSelection(RoleDropDown, "Admin");
		Thread.sleep(3000);

		FirstNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "adminfname");
		LastNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "adminlname");

		Thread.sleep(3000);
		SearchUserClick.click();
		Thread.sleep(1000);
		IconMenu.click();
		Thread.sleep(1000);

		ActivateClick.click();
		Thread.sleep(1000);
		yesActivateitClick.click();
		Thread.sleep(1000);

	}

	public void ValidateManageUserWithRoleasAdminAndDeletetheUser() throws Throwable {

		Thread.sleep(1000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingadmin");
		Thread.sleep(3000);
		DropDownSelection(RoleDropDown, "Admin");
		Thread.sleep(3000);

		FirstNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "adminfname");
		LastNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "adminlname");

		Thread.sleep(3000);
		SearchUserClick.click();

		Thread.sleep(1000);
		IconMenu.click();
		Thread.sleep(1000);

		DeleteClick.click();

		yesDeleteitClick.click();
		Thread.sleep(1000);

	}

	///////////////////////////////////////////////////////////////////////////////

	public void ValidateManageUserPagewithRoleasOnBoarderOfvaliddata() throws Throwable {

		Thread.sleep(3000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingonboarder");
		Thread.sleep(3000);
		DropDownSelection(RoleDropDown, "On Boarder");
		Thread.sleep(3000);
		FirstNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "onboarderfirstname");
		LastNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "onboarderlastname");
		DropDownSelection(StatusDropDown, "Inactive");
		Thread.sleep(3000);
		SearchUserClick.click();

	}

	public void ValidateManageUserWithRoleasOnBoarderAndEdittheUser() throws Throwable {

		Thread.sleep(1000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingonboarder");
		Thread.sleep(3000);
		DropDownSelection(RoleDropDown, "On Boarder");
		Thread.sleep(3000);

		FirstNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "onboarderfirstname");
		LastNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "onboarderlastname");

		Thread.sleep(1000);
		SearchUserClick.click();
		Thread.sleep(1000);
		IconMenu.click();
		Thread.sleep(1000);
		EditClick.click();
		Thread.sleep(5000);

		FirstNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "onboarderfname");
		LastNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "onboarderlname");
		Thread.sleep(3000);
		DropDownSelection(EditStatus, "Active");
		Thread.sleep(3000);

		UpdateClick.click();

	}

	public void ValidateManageUserWithRoleasOnBoarderAndDeactivatetheUser() throws Throwable {

		Thread.sleep(1000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingonboarder");
		Thread.sleep(3000);
		DropDownSelection(RoleDropDown, "On Boarder");
		Thread.sleep(3000);

		FirstNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "onboarderfname");
		LastNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "onboarderlname");

		Thread.sleep(3000);
		SearchUserClick.click();
		Thread.sleep(1000);
		IconMenu.click();
		Thread.sleep(1000);

		DeactivateClick.click();
		Thread.sleep(1000);
		yesDeactivateitClick.click();
		Thread.sleep(1000);

	}

	public void ValidateManageUserWithRoleasOnBoarderAndActivatetheUser() throws Throwable {

		Thread.sleep(1000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingonboarder");
		Thread.sleep(3000);
		DropDownSelection(RoleDropDown, "On Boarder");
		Thread.sleep(3000);

		FirstNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "onboarderfname");
		LastNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "onboarderlname");

		Thread.sleep(3000);
		SearchUserClick.click();
		Thread.sleep(1000);
		IconMenu.click();
		Thread.sleep(1000);

		ActivateClick.click();
		Thread.sleep(1000);
		yesActivateitClick.click();
		Thread.sleep(1000);

	}

	public void ValidateManageUserWithRoleasOnBoarderAndDeletetheUser() throws Throwable {

		Thread.sleep(1000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingonboarder");
		Thread.sleep(3000);
		DropDownSelection(RoleDropDown, "On Boarder");
		Thread.sleep(3000);

		FirstNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "onboarderfname");
		LastNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "onboarderlname");

		Thread.sleep(3000);
		SearchUserClick.click();

		Thread.sleep(1000);
		IconMenu.click();
		Thread.sleep(1000);

		DeleteClick.click();

		yesDeleteitClick.click();
		Thread.sleep(1000);

	}
	
	///////////////////////////////////////////////////////////////////////////////

	public void ValidateManageUserPagewithRoleasBAdminOfvaliddata() throws Throwable {

		Thread.sleep(3000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingbusinessadmin");
		Thread.sleep(3000);
		DropDownSelection(RoleDropDown, "Business Admin");
		Thread.sleep(3000);
		FirstNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "businessadminfirstname");
		LastNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "businessadminlastname");
		DropDownSelection(StatusDropDown, "Inactive");
		Thread.sleep(3000);
		SearchUserClick.click();

	}

	public void ValidateManageUserWithRoleasBAdminAndEdittheUser() throws Throwable {

		Thread.sleep(1000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingbusinessadmin");
		Thread.sleep(3000);
		DropDownSelection(RoleDropDown, "Business Admin");
		Thread.sleep(3000);

		FirstNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "businessadminfirstname");
		LastNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "businessadminlastname");

		Thread.sleep(1000);
		SearchUserClick.click();
		Thread.sleep(1000);
		IconMenu.click();
		Thread.sleep(1000);
		EditClick.click();
		Thread.sleep(5000);

		FirstNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "businessadminfname");
		LastNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "businessadminlname");
		Thread.sleep(3000);
		DropDownSelection(EditStatus, "Active");
		Thread.sleep(3000);

		UpdateClick.click();

	}

	public void ValidateManageUserWithRoleasBAdminAndDeactivatetheUser() throws Throwable {

		Thread.sleep(1000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingbusinessadmin");
		Thread.sleep(3000);
		DropDownSelection(RoleDropDown, "Business Admin");
		Thread.sleep(3000);

		FirstNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "businessadminfname");
		LastNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "businessadminlname");

		Thread.sleep(3000);
		SearchUserClick.click();
		Thread.sleep(1000);
		IconMenu.click();
		Thread.sleep(1000);

		DeactivateClick.click();
		Thread.sleep(1000);
		yesDeactivateitClick.click();
		Thread.sleep(1000);

	}

	public void ValidateManageUserWithRoleasBAdminAndActivatetheUser() throws Throwable {

		Thread.sleep(1000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingbusinessadmin");
		Thread.sleep(3000);
		DropDownSelection(RoleDropDown, "Business Admin");
		Thread.sleep(3000);

		FirstNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "businessadminfname");
		LastNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "businessadminlname");

		Thread.sleep(3000);
		SearchUserClick.click();
		Thread.sleep(1000);
		IconMenu.click();
		Thread.sleep(1000);

		ActivateClick.click();
		Thread.sleep(1000);
		yesActivateitClick.click();
		Thread.sleep(1000);

	}

	public void ValidateManageUserWithRoleasBAdminAndDeletetheUser() throws Throwable {

		Thread.sleep(1000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingbusinessadmin");
		Thread.sleep(3000);
		DropDownSelection(RoleDropDown, "Business Admin");
		Thread.sleep(3000);

		FirstNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "businessadminfname");
		LastNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "businessadminlname");

		Thread.sleep(3000);
		SearchUserClick.click();

		Thread.sleep(1000);
		IconMenu.click();
		Thread.sleep(1000);

		DeleteClick.click();

		yesDeleteitClick.click();
		Thread.sleep(1000);

	}

	/////////////////////////////////////////////////////////////////////////////////////////
	

	public void ValidateManageUserPagewithRoleasBUserOfvaliddata() throws Throwable {

		Thread.sleep(3000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingbusinessuser");
		Thread.sleep(3000);
		DropDownSelection(RoleDropDown, "Business User");
		Thread.sleep(3000);
		FirstNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "businessuserfirstname");
		LastNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "businessuserlastname");
		DropDownSelection(StatusDropDown, "Inactive");
		Thread.sleep(3000);
		SearchUserClick.click();

	}

	public void ValidateManageUserWithRoleasBUserAndEdittheUser() throws Throwable {

		Thread.sleep(1000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingbusinessuser");
		Thread.sleep(3000);
		DropDownSelection(RoleDropDown, "Business User");
		Thread.sleep(3000);

		FirstNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "businessuserfirstname");
		LastNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "businessuserlastname");

		Thread.sleep(1000);
		SearchUserClick.click();
		Thread.sleep(1000);
		IconMenu.click();
		Thread.sleep(1000);
		EditClick.click();
		Thread.sleep(5000);

		FirstNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "businessuserfname");
		LastNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "businessuserlname");
		Thread.sleep(3000);
		DropDownSelection(EditStatus, "Active");
		Thread.sleep(3000);

		UpdateClick.click();

	}

	public void ValidateManageUserWithRoleasBUserAndDeactivatetheUser() throws Throwable {

		Thread.sleep(1000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingbusinessuser");
		Thread.sleep(3000);
		DropDownSelection(RoleDropDown, "Business User");
		Thread.sleep(3000);

		FirstNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "businessuserfname");
		LastNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "businessuserlname");

		Thread.sleep(3000);
		SearchUserClick.click();
		Thread.sleep(1000);
		IconMenu.click();
		Thread.sleep(1000);

		DeactivateClick.click();
		Thread.sleep(1000);
		yesDeactivateitClick.click();
		Thread.sleep(1000);

	}

	public void ValidateManageUserWithRoleasBUserAndActivatetheUser() throws Throwable {

		Thread.sleep(1000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingbusinessuser");
		Thread.sleep(3000);
		DropDownSelection(RoleDropDown, "Business User");
		Thread.sleep(3000);

		FirstNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "businessuserfname");
		LastNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "businessuserlname");

		Thread.sleep(3000);
		SearchUserClick.click();
		Thread.sleep(1000);
		IconMenu.click();
		Thread.sleep(1000);

		ActivateClick.click();
		Thread.sleep(1000);
		yesActivateitClick.click();
		Thread.sleep(1000);

	}

	public void ValidateManageUserWithRoleasBUserAndDeletetheUser() throws Throwable {

		Thread.sleep(1000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingbusinessuser");
		Thread.sleep(3000);
		DropDownSelection(RoleDropDown, "Business User");
		Thread.sleep(3000);

		FirstNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "businessuserfname");
		LastNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "businessuserlname");

		Thread.sleep(3000);
		SearchUserClick.click();

		Thread.sleep(1000);
		IconMenu.click();
		Thread.sleep(1000);

		DeleteClick.click();

		yesDeleteitClick.click();
		Thread.sleep(1000);

	}

	/////////////////////////////////////////////////////////////////////////////////////////
	
	public void ValidateManageUserPagewithRoleasDataProcessorOfvaliddata() throws Throwable {

		Thread.sleep(3000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingdataprocessor");
		Thread.sleep(3000);
		DropDownSelection(RoleDropDown, "Data Processor");
		Thread.sleep(3000);
		FirstNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "dataprocessorfirstname");
		LastNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "dataprocessorlastname");
		DropDownSelection(StatusDropDown, "Inactive");
		Thread.sleep(3000);
		SearchUserClick.click();

	}

	public void ValidateManageUserWithRoleasDataProcessorAndEdittheUser() throws Throwable {

		Thread.sleep(1000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingdataprocessor");
		Thread.sleep(3000);
		DropDownSelection(RoleDropDown, "Data Processor");
		Thread.sleep(3000);

		FirstNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "dataprocessorfirstname");
		LastNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "dataprocessorlastname");

		Thread.sleep(1000);
		SearchUserClick.click();
		Thread.sleep(1000);
		IconMenu.click();
		Thread.sleep(1000);
		EditClick.click();
		Thread.sleep(5000);

		FirstNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "dataprocessorfname");
		LastNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "dataprocessorlname");
		Thread.sleep(3000);
		DropDownSelection(EditStatus, "Active");
		Thread.sleep(3000);

		UpdateClick.click();

	}

	public void ValidateManageUserWithRoleasDataProcessorAndDeactivatetheUser() throws Throwable {

		Thread.sleep(1000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingdataprocessor");
		Thread.sleep(3000);
		DropDownSelection(RoleDropDown, "Data Processor");
		Thread.sleep(3000);

		FirstNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "dataprocessorfname");
		LastNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "dataprocessorlname");

		Thread.sleep(3000);
		SearchUserClick.click();
		Thread.sleep(1000);
		IconMenu.click();
		Thread.sleep(1000);

		DeactivateClick.click();
		Thread.sleep(1000);
		yesDeactivateitClick.click();
		Thread.sleep(1000);

	}

	public void ValidateManageUserWithRoleasDataProcessorAndActivatetheUser() throws Throwable {

		Thread.sleep(1000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingdataprocessor");
		Thread.sleep(3000);
		DropDownSelection(RoleDropDown, "Data Processor");
		Thread.sleep(3000);

		FirstNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "dataprocessorfname");
		LastNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "dataprocessorlname");

		Thread.sleep(3000);
		SearchUserClick.click();
		Thread.sleep(1000);
		IconMenu.click();
		Thread.sleep(1000);

		ActivateClick.click();
		Thread.sleep(1000);
		yesActivateitClick.click();
		Thread.sleep(1000);

	}

	public void ValidateManageUserWithRoleasDataProcessorAndDeletetheUser() throws Throwable {

		Thread.sleep(1000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingdataprocessor");
		Thread.sleep(3000);
		DropDownSelection(RoleDropDown, "Data Processor");
		Thread.sleep(3000);

		FirstNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "dataprocessorfname");
		LastNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "dataprocessorlname");

		Thread.sleep(3000);
		SearchUserClick.click();

		Thread.sleep(1000);
		IconMenu.click();
		Thread.sleep(1000);

		DeleteClick.click();

		yesDeleteitClick.click();
		Thread.sleep(1000);

	}

	/////////////////////////////////////////////////////////////////////////////////////////
	
	public void ValidateManageUserPagewithRoleasDataProcessorResOfvaliddata() throws Throwable {

		Thread.sleep(3000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingdataprocessorrestricted");
		Thread.sleep(3000);
		DropDownSelection(RoleDropDown, "Data Processor Restricted");
		Thread.sleep(3000);
		FirstNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "dataprocessorrestrictedfirstname");
		LastNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "dataprocessorrestrictedlastname");
		DropDownSelection(StatusDropDown, "Inactive");
		Thread.sleep(3000);
		SearchUserClick.click();

	}

	public void ValidateManageUserWithRoleasDataProcessorResAndEdittheUser() throws Throwable {

		Thread.sleep(1000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingdataprocessorrestricted");
		Thread.sleep(3000);
		DropDownSelection(RoleDropDown, "Data Processor Restricted");
		Thread.sleep(3000);

		FirstNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "dataprocessorrestrictedfirstname");
		LastNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "dataprocessorrestrictedlastname");

		Thread.sleep(1000);
		SearchUserClick.click();
		Thread.sleep(1000);
		IconMenu.click();
		Thread.sleep(1000);
		EditClick.click();
		Thread.sleep(5000);

		FirstNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "dataprocessorrestrictedfname");
		LastNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "dataprocessorrestrictedlname");
		Thread.sleep(3000);
		DropDownSelection(EditStatus, "Active");
		Thread.sleep(3000);

		UpdateClick.click();

	}

	public void ValidateManageUserWithRoleasDataProcessorResAndDeactivatetheUser() throws Throwable {

		Thread.sleep(1000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingdataprocessorrestricted");
		Thread.sleep(3000);
		DropDownSelection(RoleDropDown, "Data Processor Restricted");
		Thread.sleep(3000);

		FirstNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "dataprocessorrestrictedfname");
		LastNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "dataprocessorrestrictedlname");

		Thread.sleep(3000);
		SearchUserClick.click();
		Thread.sleep(1000);
		IconMenu.click();
		Thread.sleep(1000);

		DeactivateClick.click();
		Thread.sleep(1000);
		yesDeactivateitClick.click();
		Thread.sleep(1000);

	}

	public void ValidateManageUserWithRoleasDataProcessorResAndActivatetheUser() throws Throwable {

		Thread.sleep(1000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingdataprocessorrestricted");
		Thread.sleep(3000);
		DropDownSelection(RoleDropDown, "Data Processor Restricted");
		Thread.sleep(3000);

		FirstNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "dataprocessorrestrictedfname");
		LastNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "dataprocessorrestrictedlname");

		Thread.sleep(3000);
		SearchUserClick.click();
		Thread.sleep(1000);
		IconMenu.click();
		Thread.sleep(1000);

		ActivateClick.click();
		Thread.sleep(1000);
		yesActivateitClick.click();
		Thread.sleep(1000);

	}

	public void ValidateManageUserWithRoleasDataProcessorResAndDeletetheUser() throws Throwable {

		Thread.sleep(1000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingdataprocessorrestricted");
		Thread.sleep(3000);
		DropDownSelection(RoleDropDown, "Data Processor Restricted");
		Thread.sleep(3000);

		FirstNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "dataprocessorrestrictedfname");
		LastNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "dataprocessorrestrictedlname");

		Thread.sleep(3000);
		SearchUserClick.click();

		Thread.sleep(1000);
		IconMenu.click();
		Thread.sleep(1000);

		DeleteClick.click();

		yesDeleteitClick.click();
		Thread.sleep(1000);

	}

	/////////////////////////////////////////////////////////////////////////////////////////


	public void ValidateManageuserPageErrorResults() throws Throwable {

		Thread.sleep(3000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "TestAdmin72");
		Thread.sleep(3000);
		DropDownSelection(RoleDropDown, "Admin");
		Thread.sleep(3000);
		FirstNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "TestAdmin72");
		LastNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "TestAdmin72");
		Thread.sleep(3000);
		DropDownSelection(StatusDropDown, "Inactive");
		Thread.sleep(3000);
		SearchUserClick.click();

	}

	/////////////////////////////////////////////////////////////////////////////////////

	public void validateMUPwithOnlyUserId() throws InterruptedException {

		Thread.sleep(1000);

		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingbuser");
		Thread.sleep(1000);
		SearchUserClick.click();
	}

	public void validateMUPwithOnlyUserIdAndEdittheUser() throws Throwable {

		Thread.sleep(1000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingbuser");
		Thread.sleep(1000);
		SearchUserClick.click();
		Thread.sleep(1000);
		IconMenu.click();
		Thread.sleep(1000);
		EditClick.click();
		Thread.sleep(4000);
		DropDownSelection(EditStatus, "Active");
		Thread.sleep(3000);
		FirstNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Testfname");
		LastNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Testlname");

		Thread.sleep(1000);

		UpdateClick.click();

	}

	public void validateMUPwithOnlyUserIdAndDeactivatetheUser() throws InterruptedException {

		Thread.sleep(3000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingbuser");
		Thread.sleep(1000);
		SearchUserClick.click();
		Thread.sleep(1000);
		IconMenu.click();
		Thread.sleep(1000);
		DeactivateClick.click();
		Thread.sleep(1000);
		yesDeactivateitClick.click();
		Thread.sleep(1000);
	}

	public void validateMUPwithOnlyUserIdAndActivatetheUser() throws InterruptedException {

		Thread.sleep(1000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingbuser");
		Thread.sleep(1000);
		SearchUserClick.click();
		Thread.sleep(1000);
		IconMenu.click();
		Thread.sleep(1000);

		ActivateClick.click();
		Thread.sleep(1000);
		yesActivateitClick.click();
		Thread.sleep(1000);

	}

	public void validateMUPwithOnlyUserIdAndDeletetheUser() throws InterruptedException {

		Thread.sleep(1000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("onlyuid"));
		Thread.sleep(1000);
		SearchUserClick.click();
		Thread.sleep(1000);
		IconMenu.click();
		Thread.sleep(1000);

		DeleteClick.click();

		yesDeleteitClick.click();
		Thread.sleep(1000);
	}

	////////////////////////////////////////////////////////////////////////////
	public void validateMUPwithOnlyRoleasUser() throws Throwable {

		// Actionselection(driver,AccessManagementClick);

		// Thread.sleep(3000);
		// Actionselection(driver, ManageUserClick);
		Thread.sleep(1000);
		DropDownSelection(RoleDropDown, "Business User");
		Thread.sleep(3000);
		SearchUserClick.click();
	}

	public void validateMUPwithOnlyRoleasUserAndEdittheUser() throws Throwable {

		// Actionselection(driver,AccessManagementClick);

		// Thread.sleep(3000);
		// Actionselection(driver, ManageUserClick);
		Thread.sleep(1000);
		DropDownSelection(RoleDropDown, "Business User");
		Thread.sleep(3000);
		SearchUserClick.click();
		IconMenu.click();
		Thread.sleep(1000);
		EditClick.click();
		Thread.sleep(4000);
		DropDownSelection(RoleDropDown, "Business User");
		Thread.sleep(3000);
		FirstNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Edgesfar");
		LastNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "pragmage");
		DropDownSelection(StatusDropDown, "Active");
		Thread.sleep(1000);
		// UserTypeDD.click();
		// SelectAssignPartners.click();
		// DropDownSelection(SelectAssignPartners, "1234@me");
		// Actionselection(driver, MoveAllPartnerClick);
		// DropDownSelection(SelectAssignGroups, "Test_Group_1");
		// Actionselection(driver, MoveAllGroupClick);
		// SaveUserInfoClick.click();
		UpdateClick.click();
	}

	public void validateMUPwithOnlyRoleasUserAndDeactivatetheUser() throws Throwable {

		// Actionselection(driver,AccessManagementClick);

		// Thread.sleep(3000);
		// Actionselection(driver, ManageUserClick);
		Thread.sleep(3000);
		DropDownSelection(RoleDropDown, "Business User");
		Thread.sleep(3000);
		SearchUserClick.click();
		IconMenu.click();
		Thread.sleep(1000);
		// Actionselection(driver, DeactivateClick);
		DeactivateClick.click();
		Thread.sleep(1000);
		yesDeactivateitClick.click();
		Thread.sleep(1000);
	}

	public void validateMUPwithOnlyRoleasUserAndActivatetheUser() throws Throwable {

		// Actionselection(driver,AccessManagementClick);

		// Thread.sleep(3000);
		// Actionselection(driver, ManageUserClick);
		Thread.sleep(1000);
		DropDownSelection(RoleDropDown, "Business User");
		Thread.sleep(3000);
		SearchUserClick.click();
		IconMenu.click();
		Thread.sleep(1000);
		// Actionselection(driver, DeactivateClick);
		ActivateClick.click();
		Thread.sleep(1000);
		yesActivateitClick.click();
		Thread.sleep(1000);

	}

	public void validateMUPwithOnlyRoleasUserAndDeletetheUser() throws Throwable {

		// Actionselection(driver,AccessManagementClick);

		// Thread.sleep(3000);
		// Actionselection(driver, ManageUserClick);
		Thread.sleep(1000);
		DropDownSelection(RoleDropDown, "Business User");
		Thread.sleep(3000);
		SearchUserClick.click();
		IconMenu.click();
		Thread.sleep(1000);
		// Actionselection(driver, DeleteClick);
		DeleteClick.click();
		// driver.switchTo().alert().accept();
		yesDeleteitClick.click();
		Thread.sleep(1000);

	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public void validateMUPwithOnlyRole() throws Throwable {

		Thread.sleep(1000);
		DropDownSelection(RoleDropDown, "Business User");
		Thread.sleep(3000);
		SearchUserClick.click();
	}

	public void validateMUPwithOnlyRoleAndEdittheUser() throws Throwable {

		Thread.sleep(1000);
		DropDownSelection(RoleDropDown, "Business User");
		Thread.sleep(3000);
		SearchUserClick.click();
		Thread.sleep(3000);
		IconMenu.click();
		Thread.sleep(1000);
		EditClick.click();
		Thread.sleep(4000);
		DropDownSelection(EditStatus, "Active");
		Thread.sleep(3000);

		UpdateClick.click();
	}

	public void validateMUPwithOnlyRoleAndDeactivatetheUser() throws Throwable {

		Thread.sleep(1000);
		DropDownSelection(RoleDropDown, "Business User");
		Thread.sleep(3000);
		SearchUserClick.click();
		Thread.sleep(1000);
		IconMenu.click();
		Thread.sleep(1000);

		DeactivateClick.click();
		Thread.sleep(1000);
		yesDeactivateitClick.click();
		Thread.sleep(1000);

	}

	public void validateMUPwithOnlyRoleAndActivatetheUser() throws Throwable {

		Thread.sleep(1000);
		DropDownSelection(RoleDropDown, "Business User");
		Thread.sleep(3000);
		SearchUserClick.click();
		Thread.sleep(1000);
		IconMenu.click();
		Thread.sleep(1000);

		ActivateClick.click();
		Thread.sleep(1000);
		yesActivateitClick.click();
		Thread.sleep(1000);

	}

	public void validateMUPwithOnlyRoleAndDeletetheUser() throws Throwable {

		Thread.sleep(1000);
		DropDownSelection(RoleDropDown, "Business User");
		Thread.sleep(3000);
		SearchUserClick.click();
		Thread.sleep(1000);
		IconMenu.click();
		Thread.sleep(1000);

		DeleteClick.click();
		Thread.sleep(1000);
		yesDeleteitClick.click();
		Thread.sleep(1000);
	}

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	/*
	 * public void validateMUPwithOnlyUserType() throws Throwable {
	 * 
	 * // Actionselection(driver,AccessManagementClick);
	 * 
	 * Thread.sleep(3000); Actionselection(driver, ManageUserClick);
	 * Thread.sleep(3000); DropDownSelection(UserTypeDD, "B2B User");
	 * Thread.sleep(3000); SearchUserClick.click(); }
	 * 
	 * public void validateMUPwithOnlyUserTypeAndEditUser() throws Throwable {
	 * 
	 * // Actionselection(driver,AccessManagementClick);
	 * 
	 * Thread.sleep(3000); Actionselection(driver, ManageUserClick);
	 * Thread.sleep(3000); DropDownSelection(UserTypeDD, "B2B User");
	 * Thread.sleep(5000); SearchUserClick.click(); Actionselection(driver,
	 * IconMenu); Actionselection(driver, EditClick);
	 * DropDownSelection(RoleDropDown, "User"); Thread.sleep(5000); //
	 * FirstNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "techsoft"); //
	 * LastNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "linux");
	 * DropDownSelection(StatusUpdateDropDown, "Active"); Thread.sleep(3000); //
	 * UserTypeDD.click(); // SelectAssignPartners.click(); //
	 * DropDownSelection(SelectAssignPartners, "1234@me"); //
	 * Actionselection(driver, MoveAllPartnerClick); //
	 * DropDownSelection(SelectAssignGroups, "Test_Group_1"); //
	 * Actionselection(driver, MoveAllGroupClick); SaveUserInfoClick.click(); }
	 * 
	 * public void validateMUPwithOnlyUserTypeAndDeactivateUser() throws Throwable {
	 * 
	 * // Actionselection(driver,AccessManagementClick);
	 * 
	 * Thread.sleep(3000); Actionselection(driver, ManageUserClick);
	 * Thread.sleep(3000); DropDownSelection(UserTypeDD, "B2B User");
	 * Thread.sleep(3000); SearchUserClick.click(); Actionselection(driver,
	 * IconMenu); Actionselection(driver, DeactivateClick); Thread.sleep(3000);
	 * 
	 * }
	 * 
	 * public void validateMUPwithOnlyUserTypeAndActivateUser() throws Throwable {
	 * 
	 * // Actionselection(driver,AccessManagementClick);
	 * 
	 * Thread.sleep(3000); Actionselection(driver, ManageUserClick);
	 * Thread.sleep(3000); DropDownSelection(UserTypeDD, "B2B User");
	 * Thread.sleep(3000); SearchUserClick.click(); Actionselection(driver,
	 * IconMenu); Actionselection(driver, ActivateClick); Thread.sleep(3000);
	 * 
	 * }
	 * 
	 * public void validateMUPwithOnlyUserTypeAndDeleteUser() throws Throwable {
	 * 
	 * // Actionselection(driver,AccessManagementClick);
	 * 
	 * Thread.sleep(3000); Actionselection(driver, ManageUserClick);
	 * Thread.sleep(3000); DropDownSelection(UserTypeDD, "B2B User");
	 * Thread.sleep(3000); SearchUserClick.click(); Actionselection(driver,
	 * IconMenu); Actionselection(driver, DeleteClick);
	 * driver.switchTo().alert().accept(); Thread.sleep(3000);
	 * 
	 * }
	 */

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public void validateMUPwithOnlyFirstName() throws InterruptedException {

		Thread.sleep(1000);
		FirstNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Testfname");
		Thread.sleep(1000);
		SearchUserClick.click();
	}

	public void validateMUPwithOnlyFirstNameAndEditUser() throws Throwable {

		Thread.sleep(1000);
		FirstNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Testfname");
		Thread.sleep(3000);
		SearchUserClick.click();
		Thread.sleep(1000);
		IconMenu.click();
		Thread.sleep(1000);
		EditClick.click();
		Thread.sleep(4000);
		FirstNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Testfname");
		Thread.sleep(1000);
		LastNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Testlname");
		Thread.sleep(3000);
		DropDownSelection(EditStatus, "Active");
		Thread.sleep(3000);

		UpdateClick.click();

	}

	public void validateMUPwithOnlyFirstNameAndDeactivateUser() throws InterruptedException {

		Thread.sleep(1000);
		FirstNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Testfname");
		Thread.sleep(3000);
		SearchUserClick.click();
		Thread.sleep(1000);
		IconMenu.click();
		Thread.sleep(1000);

		DeactivateClick.click();
		Thread.sleep(1000);
		yesDeactivateitClick.click();
		Thread.sleep(1000);
	}

	public void validateMUPwithOnlyFirstNameAndActivateUser() throws InterruptedException {

		Thread.sleep(1000);
		FirstNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Testfname");
		Thread.sleep(3000);
		SearchUserClick.click();
		Thread.sleep(1000);
		IconMenu.click();
		Thread.sleep(1000);

		ActivateClick.click();
		Thread.sleep(1000);
		yesActivateitClick.click();
		Thread.sleep(1000);

	}

	public void validateMUPwithOnlyFirstNameAndDeleteUser() throws InterruptedException {

		Thread.sleep(1000);
		FirstNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Testfname");
		Thread.sleep(3000);
		SearchUserClick.click();
		Thread.sleep(1000);
		IconMenu.click();
		Thread.sleep(1000);

		DeleteClick.click();
		Thread.sleep(1000);
		yesDeleteitClick.click();
		Thread.sleep(1000);
	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public void validateMUPwithOnlyLastName() throws InterruptedException {

		Thread.sleep(1000);
		LastNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Testlname");
		Thread.sleep(3000);
		SearchUserClick.click();
	}

	public void validateMUPwithOnlyLastNameAndEditUSer() throws Throwable {

		Thread.sleep(1000);
		LastNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Testlname");
		Thread.sleep(3000);
		SearchUserClick.click();
		Thread.sleep(1000);
		IconMenu.click();
		Thread.sleep(1000);
		EditClick.click();
		Thread.sleep(4000);
		FirstNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Testfname");
		LastNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Testlname");
		Thread.sleep(3000);
		DropDownSelection(EditStatus, "Active");
		Thread.sleep(3000);

		UpdateClick.click();

	}

	public void validateMUPwithOnlyLastNameAndDeactivateUser() throws InterruptedException {

		Thread.sleep(3000);
		LastNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Testlname");
		Thread.sleep(3000);
		SearchUserClick.click();
		Thread.sleep(1000);
		IconMenu.click();
		Thread.sleep(1000);
		DeactivateClick.click();
		Thread.sleep(1000);
		yesDeactivateitClick.click();
		Thread.sleep(1000);
	}

	public void validateMUPwithOnlyLastNameAndActivateUser() throws InterruptedException {

		Thread.sleep(1000);
		LastNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Testlname");
		Thread.sleep(3000);
		SearchUserClick.click();
		Thread.sleep(1000);
		IconMenu.click();
		Thread.sleep(1000);
		ActivateClick.click();
		Thread.sleep(1000);
		yesActivateitClick.click();
		Thread.sleep(1000);
	}

	public void validateMUPwithOnlyLastNameAndDeleteUser() throws InterruptedException {

		Thread.sleep(1000);
		LastNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Testlname");
		Thread.sleep(3000);
		SearchUserClick.click();
		IconMenu.click();
		Thread.sleep(1000);
		DeleteClick.click();
		Thread.sleep(1000);
		yesDeleteitClick.click();
		Thread.sleep(1000);
	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public void validateMUPwithOnlyStatus() throws Throwable {

		Thread.sleep(3000);
		DropDownSelection(StatusDropDown, "Active");
		Thread.sleep(3000);
		SearchUserClick.click();
	}

	public void validateMUPwithOnlyStatusAndEditUser() throws Throwable {

		Thread.sleep(3000);
		DropDownSelection(StatusDropDown, "Active");
		Thread.sleep(3000);
		FirstNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Testfname");
		Thread.sleep(1000);
		SearchUserClick.click();
		Thread.sleep(1000);
		IconMenu.click();
		Thread.sleep(1000);
		EditClick.click();
		Thread.sleep(4000);
		DropDownSelection(EditStatus, "Active");
		Thread.sleep(3000);
		UpdateClick.click();

	}

	public void validateMUPwithOnlyStatusAndDeactivateUser() throws Throwable {

		Thread.sleep(3000);
		DropDownSelection(StatusDropDown, "Active");
		Thread.sleep(3000);
		FirstNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Testfname");
		Thread.sleep(1000);
		SearchUserClick.click();
		Thread.sleep(1000);
		IconMenu.click();
		Thread.sleep(1000);
		DeactivateClick.click();
		Thread.sleep(1000);
		yesDeactivateitClick.click();
		Thread.sleep(1000);
	}

	public void validateMUPwithOnlyStatusAndDeleteUser() throws Throwable {

		Thread.sleep(3000);
		DropDownSelection(StatusDropDown, "Inactive");
		Thread.sleep(3000);
		FirstNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Testfname");
		Thread.sleep(1000);
		SearchUserClick.click();
		Thread.sleep(1000);
		IconMenu.click();
		Thread.sleep(1000);

		DeleteClick.click();
		Thread.sleep(1000);
		yesDeleteitClick.click();
		Thread.sleep(1000);
	}

	public void validateMUPwithOnlyStatusasInactive() throws Throwable {

		// Actionselection(driver,AccessManagementClick);

//		Thread.sleep(3000);
//		Actionselection(driver, ManageUserClick);
		Thread.sleep(3000);
		DropDownSelection(StatusDropDown, "Inactive");
		Thread.sleep(3000);
		SearchUserClick.click();
	}

	public void validateMUPwithOnlyStatusasInactiveAndEditUser() throws Throwable {

		// Actionselection(driver,AccessManagementClick);

//		Thread.sleep(3000);
//		Actionselection(driver, ManageUserClick);
		Thread.sleep(3000);
		DropDownSelection(StatusDropDown, "Inactive");
		Thread.sleep(3000);
		SearchUserClick.click();
		Thread.sleep(1000);
		EditClick.click();
		Thread.sleep(4000);
		DropDownSelection(RoleDropDown, "Business User");
		Thread.sleep(5000);
		// FirstNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Test_TestTest_Test
		// 12");
		// LastNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Test_TestTest_Test
		// 15");
		DropDownSelection(StatusUpdateDropDown, "Inactive");
		Thread.sleep(3000);
		// UserTypeDD.click();
		// SelectAssignPartners.click();
		// DropDownSelection(SelectAssignPartners, "1234@me");
		// Actionselection(driver, MoveAllPartnerClick);
		// DropDownSelection(SelectAssignGroups, "Test_Group_1");
		// Actionselection(driver, MoveAllGroupClick);
		UpdateClick.click();
	}

	public void validateMUPwithOnlyStatusasInactiveAndActivateUser() throws Throwable {

		// Actionselection(driver,AccessManagementClick);

//		Thread.sleep(3000);
//		Actionselection(driver, ManageUserClick);
		Thread.sleep(3000);
		DropDownSelection(StatusDropDown, "Inactive");
		Thread.sleep(3000);
		SearchUserClick.click();
		IconMenu.click();
		Thread.sleep(1000);
		// Actionselection(driver, DeactivateClick);
		ActivateClick.click();
		Thread.sleep(1000);
		yesActivateitClick.click();
		Thread.sleep(1000);
	}

	public void validateMUPwithOnlyStatusasInactiveAndDeleteUser() throws Throwable {

		// Actionselection(driver,AccessManagementClick);

//		Thread.sleep(3000);
//		Actionselection(driver, ManageUserClick);
		Thread.sleep(3000);
		DropDownSelection(StatusDropDown, "Inactive");
		Thread.sleep(3000);
		SearchUserClick.click();
		IconMenu.click();
		Thread.sleep(1000);
		// Actionselection(driver, DeleteClick);
		DeleteClick.click();
		// driver.switchTo().alert().accept();
		yesDeleteitClick.click();
		Thread.sleep(1000);
	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void updatefunctionality() throws InterruptedException {

		ResetSearchClick.click();
		Thread.sleep(3000);
		SearchUserClick.click();
		Thread.sleep(3000);
		// Actionselection(driver, Actionsicon);
		Actionsicon.click();
		Thread.sleep(3000);
		EditClick.click();
		// Actionselection(driver, EditClick);
		Thread.sleep(4000);
		// FirstNameData.sendKeys("updated");
		UpdateClick.click();
	}

	public void Deactivatefunctionality() throws InterruptedException {

		/*
		 * ResetSearchClick.click(); SearchUserClick.click();
		 * Actionselection(driver,Actionsicon); //Editicon.click();
		 * Actionselection(driver,DeactivateClick); FirstNameData.sendKeys("updated");
		 * UpdateClick.click();
		 */
	}

	public void Deletefunctionality() throws InterruptedException {
		// Actionselection(driver,AccessManagementClick);

		Thread.sleep(3000);
		Actionselection(driver, ManageUserClick);
		Thread.sleep(3000);
		// ManageFileNamePatternClick.click();
		SearchUserClick.click();
		Thread.sleep(3000);

		Actionsicon.click();
		Thread.sleep(3000);
		// Actionselection(driver,DeleteClick);
		Alert a = driver.switchTo().alert();
		a.accept();

	}

	public String Getuserid() throws Exception {

		Thread.sleep(3000);
		String name = driver.findElement(By.xpath("//tbody//tr[1]/td[2]//span")).getText();
		return name;

	}

	public String Getfirstname() throws Exception {

		Thread.sleep(3000);
		String name = driver.findElement(By.xpath("//tbody//tr[1]/td[3]//span")).getText();
		return name;

	}

	public String Getlastname() throws Exception {

		Thread.sleep(3000);
		String name = driver.findElement(By.xpath("//tbody//tr[1]/td[4]//span")).getText();
		return name;

	}

}
