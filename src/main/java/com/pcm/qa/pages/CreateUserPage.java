package com.pcm.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pcm.qa.base.TestBase;

public class CreateUserPage extends TestBase {

	public static int uid = 8310; // partnerid
	public static int e = 8310;   // email
	public static int eid = 8310; // email

	@FindBy(xpath = "//span[contains(text(),'Access Management')]")
	public WebElement AccessManagementClick;

	@FindBy(xpath = "//span[contains(text(),'Create User')]")
	public WebElement createUserClick;

	@FindBy(xpath = "//input[@name='userId']")
	public WebElement UserIdData;

	@FindBy(xpath = "//input[@name='password']")
	public WebElement PasswordData;

	@FindBy(xpath = "//input[@name='firstName']")
	public WebElement firstNameData;

	@FindBy(xpath = "//input[@name='lastName']")
	public WebElement lastNameData;

	@FindBy(xpath = "//input[@name='middleName']")
	public WebElement MiddleNameData;

	@FindBy(xpath = "//input[@name='email']")
	public WebElement EmailData;

	@FindBy(xpath = "//input[@name='phone']")
	public WebElement PhonenumberData;

	@FindBy(xpath = "//mat-select[@aria-label='Role *']")
	public WebElement UserRoleDropDown;

	@FindBy(xpath = "//mat-select[@aria-label='Status']")
	public WebElement statusDropDown;

	@FindBy(xpath = "//input[@name='externalId']")
	public WebElement ExternalidData;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	public WebElement SaveUserInfoClick; // create user btn

	@FindBy(xpath = "//button[@class='btn btn-info']")
	public WebElement CancelClick;

	@FindBy(xpath = "(//button[@class='mat-button-toggle-button'])[1]")
	public WebElement MoveAllPartnerClick;

	@FindBy(xpath = "(//button[@class='mat-button-toggle-button'])[5]")
	public WebElement MoveAllGroupClick;

	@FindBy(xpath = "(//button[@class='mat-button-toggle-button'])[2]")
	public WebElement MoveselectPartnerClick;

	@FindBy(xpath = "(//button[@class='mat-button-toggle-button'])[4]")
	public WebElement RemoveAllPartnerClick;

	@FindBy(xpath = "(//button[@class='mat-button-toggle-button'])[3]")
	public WebElement RemoveselectPartnerClick;

	@FindBy(xpath = "(//button[@class='mat-button-toggle-button'])[6]")
	public WebElement MoveselectGroupClick;

	@FindBy(xpath = "(//button[@class='mat-button-toggle-button'])[8]")
	public WebElement RemoveAllGroupClick;

	@FindBy(xpath = "(//button[@class='mat-button-toggle-button'])[7]")
	public WebElement RemoveselectGroupClick;

	@FindBy(xpath = "(//i[@class='icon-pencil3 position-right'])[1]")
	public WebElement EditClick;

	@FindBy(xpath = "(//input[@formcontrolname='availableSearchInput'])[1]")
	public WebElement Partnerfilter1;

	@FindBy(xpath = "(//input[@formcontrolname='selectedSearchInput'])[1]")
	public WebElement Partnerfilter2;

	@FindBy(xpath = "(//input[@formcontrolname='availableSearchInput'])[2]")
	public WebElement Groupfilter1;

	@FindBy(xpath = "(//input[@formcontrolname='selectedSearchInput'])[2]")
	public WebElement Groupfilter2;

	@FindBy(xpath = "//button[@class='btn bg-pink-400 btn-sm legitRipple']")
	public WebElement DeleteClick;

	@FindBy(xpath = "//div[@id='swal2-content']")
	public WebElement Actionmsg;

	@FindBy(xpath = "//ul[@class='errorMessage']")
	public List<WebElement> ErrorMsg;

	@FindBy(xpath = "//div[@id='swal2-content']")
	public WebElement Error1;

	@FindBy(xpath = "(//button[@type='button' and contains(text(),'OK')])")
	public WebElement Errorokbtn;

	@FindBy(xpath = "(//h3)[1]")
	public WebElement AccessManagementpagetitle;

	@FindBy(xpath = "(//h4)[1]")
	public WebElement CreateUsertitle;

	// Initializing the Page Objects:
	public CreateUserPage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyAccessManagementpagetitle() throws InterruptedException {
		Thread.sleep(1000);

		AccessManagementClick.click();
		Thread.sleep(1000);
		createUserClick.click();
		Thread.sleep(3000);
		return AccessManagementpagetitle.getText();

	}

	/*
	 * public String verifyCreateUserPageTitle() throws InterruptedException {
	 * Actionselection(driver, createUserClick); Thread.sleep(2000); return
	 * CreateUsertitle.getText(); }
	 */

	public void validateCUPwithoutmandatoryfields() throws InterruptedException {

		Actionselection(driver, createUserClick);
		SaveUserInfoClick.click();
		Thread.sleep(2000);
		CancelClick.click();
	}

	public void validateCUPwithOnlyNoNmandatoryfields() throws InterruptedException {

		createUserClick.click();
		Thread.sleep(1000);
		MiddleNameData.sendKeys("MiddleName5");

		SaveUserInfoClick.click();
		Thread.sleep(1000);
	}

	public void verifyAdminwithvalidData() throws Throwable {

		Thread.sleep(1000);
		DropDownSelection(UserRoleDropDown, "Admin");
		Thread.sleep(2000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingadmin");
		Thread.sleep(1000);
		firstNameData.sendKeys("adminfirstname");
		Thread.sleep(1000);
		lastNameData.sendKeys("adminlastname");
		Thread.sleep(1000);
		MiddleNameData.sendKeys("adminmiddlename");
		Thread.sleep(1000);
		EmailData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Partner" + e++ + "@gmail.com");
		Thread.sleep(1000);
		PhonenumberData.sendKeys("1234567890");
		Thread.sleep(1000);
		ExternalidData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "EID" + eid++);
		Thread.sleep(1000);
		SaveUserInfoClick.click();
		Thread.sleep(1000);

	}

	public void verifyUserwithvalidData() throws Throwable {

		Thread.sleep(2000);
		createUserClick.click();
		Thread.sleep(2000);
		DropDownSelection(UserRoleDropDown, "Business User");
		Thread.sleep(2000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingbusinessuser");
		firstNameData.sendKeys("businessuserfirstname");
		lastNameData.sendKeys("businessuserlastname");
		Thread.sleep(1000);
		MiddleNameData.sendKeys("businessusermiddlename");
		EmailData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Partner" + e++ + "@gmail.com");
		Thread.sleep(1000);
		PhonenumberData.sendKeys("1234567890");
		Thread.sleep(1000);
		ExternalidData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "EID" + eid++);
		Thread.sleep(1000);
		MoveAllPartnerClick.click();
		Thread.sleep(1000);
		MoveAllGroupClick.click();
		Thread.sleep(1000);
		SaveUserInfoClick.click();
		Thread.sleep(1000);

	}

	public void verifyOnboardwithvalidData() throws Throwable {

		Thread.sleep(2000);
		createUserClick.click();
		Thread.sleep(2000);
		DropDownSelection(UserRoleDropDown, "On Boarder");
		Thread.sleep(2000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingonboarder");
		firstNameData.sendKeys("onboarderfirstname");
		lastNameData.sendKeys("onboarderlastname");
		Thread.sleep(1000);
		MiddleNameData.sendKeys("onboardermiddlename");
		EmailData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Partner" + e++ + "@gmail.com");
		Thread.sleep(1000);
		PhonenumberData.sendKeys("1234567890");
		Thread.sleep(1000);
		ExternalidData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "EID" + eid++);
		Thread.sleep(1000);
		MoveAllPartnerClick.click();
		Thread.sleep(1000);
		MoveAllGroupClick.click();
		Thread.sleep(1000);
		SaveUserInfoClick.click();
		Thread.sleep(1000);

	}

	public void verifyBusinessAdminwithvalidData() throws Throwable {

		Thread.sleep(2000);
		createUserClick.click();
		Thread.sleep(2000);
		DropDownSelection(UserRoleDropDown, "Business Admin");
		Thread.sleep(2000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingbusinessadmin");
		firstNameData.sendKeys("businessadminfirstname");
		lastNameData.sendKeys("businessadminlastname");
		Thread.sleep(1000);
		MiddleNameData.sendKeys("businessadminmiddlename");
		EmailData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Partner" + e++ + "@gmail.com");
		Thread.sleep(1000);
		PhonenumberData.sendKeys("1234567890");
		Thread.sleep(1000);
		ExternalidData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "EID" + eid++);
		Thread.sleep(1000);
		MoveAllPartnerClick.click();
		Thread.sleep(1000);
		MoveAllGroupClick.click();
		Thread.sleep(1000);
		SaveUserInfoClick.click();
		Thread.sleep(1000);

	}

	public void verifyDataProcessorwithvalidData() throws Throwable {

		Thread.sleep(2000);
		createUserClick.click();
		Thread.sleep(2000);
		DropDownSelection(UserRoleDropDown, "Data Processor");
		Thread.sleep(2000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingdataprocessor");
		firstNameData.sendKeys("dataprocessorfirstname");
		lastNameData.sendKeys("dataprocessorlastname");
		Thread.sleep(1000);
		MiddleNameData.sendKeys("dataprocessormiddlename");
		EmailData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Partner" + e++ + "@gmail.com");
		Thread.sleep(1000);
		PhonenumberData.sendKeys("1234567890");
		Thread.sleep(1000);
		ExternalidData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "EID" + eid++);
		Thread.sleep(1000);
		MoveAllPartnerClick.click();
		Thread.sleep(1000);
		MoveAllGroupClick.click();
		Thread.sleep(1000);
		SaveUserInfoClick.click();
		Thread.sleep(1000);

	}

	public void verifyDataProcessorReswithvalidData() throws Throwable {

		Thread.sleep(2000);
		createUserClick.click();
		Thread.sleep(2000);
		DropDownSelection(UserRoleDropDown, "Data Processor Restricted");
		Thread.sleep(2000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingdataprocessorrestricted");
		firstNameData.sendKeys("dataprocessorrestrictedfirstname");
		lastNameData.sendKeys("dataprocessorrestrictedlastname");
		Thread.sleep(1000);
		MiddleNameData.sendKeys("dataprocessorrestrictedmiddlename");
		EmailData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Partner" + e++ + "@gmail.com");
		Thread.sleep(1000);
		PhonenumberData.sendKeys("1234567890");
		Thread.sleep(1000);
		ExternalidData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "EID" + eid++);
		Thread.sleep(1000);
		MoveAllPartnerClick.click();
		Thread.sleep(1000);
		MoveAllGroupClick.click();
		Thread.sleep(1000);
		SaveUserInfoClick.click();
		Thread.sleep(1000);

	}

	public void verifyNewUserwithOnlyMandatoryFieldsAndRoleAsUser() throws Throwable {

		Thread.sleep(2000);
		createUserClick.click();

		Thread.sleep(2000);
		DropDownSelection(UserRoleDropDown, "Business User");
		Thread.sleep(2000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingbuser");
		firstNameData.sendKeys("TestFirstName");
		lastNameData.sendKeys("TestLastName");

		EmailData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingbuser@gmail.com");
		PhonenumberData.sendKeys("1234567690");

		Thread.sleep(1000);
		ExternalidData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "EID" + eid++);
		Thread.sleep(1000);
		MoveAllPartnerClick.click();
		Thread.sleep(1000);

		MoveAllGroupClick.click();
		Thread.sleep(2000);
		SaveUserInfoClick.click();
		Thread.sleep(1000);
	}

	public void verifyNewAdminwithOnlyMandatoryFieldsAndRoleAsAdmin() throws Throwable {

		Thread.sleep(2000);
		createUserClick.click();

		Thread.sleep(2000);
		DropDownSelection(UserRoleDropDown, "Admin");
		Thread.sleep(2000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testinguser" + uid++);
		firstNameData.sendKeys("FirstName85");
		lastNameData.sendKeys("LastName85");
		Thread.sleep(2000);
		EmailData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Partner" + e++ + "@gmail.com");
		PhonenumberData.sendKeys("1234567690");
		Thread.sleep(1000);
		ExternalidData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "EID" + eid++);
		Thread.sleep(2000);
		SaveUserInfoClick.click();
		Thread.sleep(2000);
	}

	public void CreateUserwithoutUserID() throws Throwable {

		Thread.sleep(2000);
		createUserClick.click();
		Thread.sleep(2000);
		DropDownSelection(UserRoleDropDown, "Business User");
		Thread.sleep(2000);
		firstNameData.sendKeys("FirstName");
		lastNameData.sendKeys("LastName");
		Thread.sleep(1000);
		MiddleNameData.sendKeys("MiddleName");
		EmailData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Partner" + e++ + "@gmail.com");
		Thread.sleep(1000);
		PhonenumberData.sendKeys("1234567890");
		Thread.sleep(2000);
		SaveUserInfoClick.click();
		Thread.sleep(2000);

	}

	public void CreateUserwithoutFirstName() throws Throwable {

		Thread.sleep(2000);
		createUserClick.click();
		Thread.sleep(2000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testuser" + uid++);
		Thread.sleep(1000);
		DropDownSelection(UserRoleDropDown, "Business User");
		Thread.sleep(2000);

		lastNameData.sendKeys("LastName");
		MiddleNameData.sendKeys("MiddleName");
		Thread.sleep(1000);
		EmailData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Partner" + e++ + "@gmail.com");
		PhonenumberData.sendKeys("1234567890");

		Thread.sleep(2000);
		SaveUserInfoClick.click();
		Thread.sleep(2000);

	}

	public void CreateUserwithoutLastName() throws Throwable {

		// Actionselection(driver, createUserClick);
		createUserClick.click();
		Thread.sleep(1000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testuser" + uid++);
		// PasswordData.sendKeys("Password231");
		// driver.findElement(By.xpath("//mat-select[@aria-label='Role']")).click();
		// driver.findElement(By.xpath("//mat-option/span[contains(.,'User')]")).click();
		DropDownSelection(UserRoleDropDown, "Business User");
		Thread.sleep(2000);
		firstNameData.sendKeys("FirstName");
		// lastNameData.sendKeys("LastName");
		MiddleNameData.sendKeys("MiddleName");
		EmailData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Partner" + e++ + "@gmail.com");
		PhonenumberData.sendKeys("1234567890");
		// driver.findElement(By.xpath("//mat-select[@aria-label='Status']")).click();
		// driver.findElement(By.xpath("//mat-option/span[contains(.,'Active')]")).click();
		// DropDownSelection(statusDropDown,"Active");
		Thread.sleep(2000);
		SaveUserInfoClick.click();
		Thread.sleep(2000);

	}

	public void CreateUserwithoutEmail() throws Throwable {

		// Actionselection(driver, createUserClick);
		createUserClick.click();
		Thread.sleep(1000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testuser" + uid++);
		// PasswordData.sendKeys("Password231");
		// driver.findElement(By.xpath("//mat-select[@aria-label='Role']")).click();
		// driver.findElement(By.xpath("//mat-option/span[contains(.,'User')]")).click();
		DropDownSelection(UserRoleDropDown, "Business User");
		Thread.sleep(2000);
		firstNameData.sendKeys("FirstName");
		lastNameData.sendKeys("LastName");
		MiddleNameData.sendKeys("MiddleName");
		// EmailData.sendKeys("Test@mail.com");
		PhonenumberData.sendKeys("1234567890");
		// driver.findElement(By.xpath("//mat-select[@aria-label='Status']")).click();
		// driver.findElement(By.xpath("//mat-option/span[contains(.,'Active')]")).click();
		// DropDownSelection(statusDropDown,"Active");
		Thread.sleep(2000);
		SaveUserInfoClick.click();
		Thread.sleep(2000);

	}

	public void CreateUserwithoutExternalid() throws Throwable {

		createUserClick.click();
		Thread.sleep(1000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testuser" + uid++);

		DropDownSelection(UserRoleDropDown, "Business User");
		Thread.sleep(2000);
		firstNameData.sendKeys("FirstName");
		lastNameData.sendKeys("LastName");
		MiddleNameData.sendKeys("MiddleName");

		PhonenumberData.sendKeys("1234567890");

		Thread.sleep(2000);
		SaveUserInfoClick.click();
		Thread.sleep(2000);

	}

	public void CreateUserwithInvalidEmail() throws Throwable {

		// Actionselection(driver, createUserClick);
		createUserClick.click();
		Thread.sleep(1000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testuser" + uid++);
		Thread.sleep(2000);
		// PasswordData.sendKeys("Password231");
		// driver.findElement(By.xpath("//mat-select[@aria-label='Role']")).click();
		// driver.findElement(By.xpath("//mat-option/span[contains(.,'User')]")).click();
		DropDownSelection(UserRoleDropDown, "Business User");
		Thread.sleep(2000);
		firstNameData.sendKeys("FirstName");
		lastNameData.sendKeys("LastName");
		MiddleNameData.sendKeys("MiddleName");
		EmailData.sendKeys("fdhhfdffdfdf");
		PhonenumberData.sendKeys("1234522563");
		// driver.findElement(By.xpath("//mat-select[@aria-label='Status']")).click();
		// driver.findElement(By.xpath("//mat-option/span[contains(.,'Active')]")).click();
		// DropDownSelection(statusDropDown,"Active");
		Thread.sleep(2000);
		SaveUserInfoClick.click();
		Thread.sleep(2000);

	}

///////////////////////////////////////////////////////////////

	public void CreateAdminwithoutUserID() throws Throwable {

		// Actionselection(driver, createUserClick);
		createUserClick.click();
		Thread.sleep(3000);
		// UserIdData.sendKeys("TestAdmin1");
		// PasswordData.sendKeys("Password231");
		// driver.findElement(By.xpath("//mat-select[@aria-label='Role']")).click();
		// driver.findElement(By.xpath("//mat-option/span[contains(.,'Admin')]")).click();
		DropDownSelection(UserRoleDropDown, "Admin");
		Thread.sleep(2000);
		firstNameData.sendKeys("FirstName");
		lastNameData.sendKeys("LastName");
		MiddleNameData.sendKeys("MiddleName");
		EmailData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Partner" + e++ + "@gmail.com");
		PhonenumberData.sendKeys("1234567899");
		// driver.findElement(By.xpath("//mat-select[@aria-label='Status']")).click();
		// driver.findElement(By.xpath("//mat-option/span[contains(.,'Active')]")).click();
		// DropDownSelection(statusDropDown,"Active");
		Thread.sleep(2000);
		SaveUserInfoClick.click();
		Thread.sleep(2000);

	}

	public void CreateAdminwithoutFirstName() throws Throwable {

		// Actionselection(driver, createUserClick);
		createUserClick.click();
		Thread.sleep(3000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testuser" + uid++);
		Thread.sleep(2000);
		// PasswordData.sendKeys("Password231");
		// driver.findElement(By.xpath("//mat-select[@aria-label='Role']")).click();
		// driver.findElement(By.xpath("//mat-option/span[contains(.,'Admin')]")).click();
		DropDownSelection(UserRoleDropDown, "Admin");
		Thread.sleep(2000);
		// firstNameData.sendKeys("FirstName");
		lastNameData.sendKeys("LastName");
		MiddleNameData.sendKeys("MiddleName");
		EmailData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Partner" + e++ + "@gmail.com");
		Thread.sleep(2000);
		PhonenumberData.sendKeys("1234567849");
		// driver.findElement(By.xpath("//mat-select[@aria-label='Status']")).click();
		// driver.findElement(By.xpath("//mat-option/span[contains(.,'Active')]")).click();
		// DropDownSelection(statusDropDown,"Active");
		Thread.sleep(2000);
		SaveUserInfoClick.click();
		Thread.sleep(2000);

	}

	public void CreateAdminwithoutLastName() throws Throwable {

		// Actionselection(driver, createUserClick);
		createUserClick.click();
		Thread.sleep(3000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testuser" + uid++);
		Thread.sleep(2000);
		// PasswordData.sendKeys("Password231");
		// driver.findElement(By.xpath("//mat-select[@aria-label='Role']")).click();
		// driver.findElement(By.xpath("//mat-option/span[contains(.,'Admin')]")).click();
		DropDownSelection(UserRoleDropDown, "Admin");
		Thread.sleep(2000);
		firstNameData.sendKeys("FirstName");
		// lastNameData.sendKeys("LastName");
		MiddleNameData.sendKeys("MiddleName");
		EmailData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Partner" + e++ + "@gmail.com");
		Thread.sleep(2000);
		PhonenumberData.sendKeys("1223456789");
		// driver.findElement(By.xpath("//mat-select[@aria-label='Status']")).click();
		// driver.findElement(By.xpath("//mat-option/span[contains(.,'Active')]")).click();
		// DropDownSelection(statusDropDown,"Active");
		Thread.sleep(2000);
		SaveUserInfoClick.click();
		Thread.sleep(2000);

	}

	public void CreateAdminwithoutEmail() throws Throwable {

		// Actionselection(driver, createUserClick);
		createUserClick.click();
		Thread.sleep(3000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testuser" + uid++);
		// PasswordData.sendKeys("Password231");
		// driver.findElement(By.xpath("//mat-select[@aria-label='Role']")).click();
		// driver.findElement(By.xpath("//mat-option/span[contains(.,'Admin')]")).click();
		DropDownSelection(UserRoleDropDown, "Admin");
		Thread.sleep(2000);
		firstNameData.sendKeys("FirstName");
		lastNameData.sendKeys("LastName");
		MiddleNameData.sendKeys("MiddleName");
		// EmailData.sendKeys("Test@mail.com");
		PhonenumberData.sendKeys("1234567789");
		// driver.findElement(By.xpath("//mat-select[@aria-label='Status']")).click();
		// driver.findElement(By.xpath("//mat-option/span[contains(.,'Active')]")).click();
		// DropDownSelection(statusDropDown,"Active");
		Thread.sleep(2000);
		SaveUserInfoClick.click();
		Thread.sleep(2000);

	}

	public void CreateNewAdminwithInvalidEmail() throws Throwable {

		// Actionselection(driver, createUserClick);
		createUserClick.click();
		Thread.sleep(3000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testuser" + uid++);
		// PasswordData.sendKeys("Password231");
		// driver.findElement(By.xpath("//mat-select[@aria-label='Role']")).click();
		// driver.findElement(By.xpath("//mat-option/span[contains(.,'Admin')]")).click();
		DropDownSelection(UserRoleDropDown, "Admin");
		Thread.sleep(2000);
		firstNameData.sendKeys("FirstName");
		lastNameData.sendKeys("LastName");
		MiddleNameData.sendKeys("MiddleName");
		EmailData.sendKeys("mnvjdujdff");
		PhonenumberData.sendKeys("12345225683");
		// driver.findElement(By.xpath("//mat-select[@aria-label='Status']")).click();
		// driver.findElement(By.xpath("//mat-option/span[contains(.,'Active')]")).click();
		// DropDownSelection(statusDropDown,"Active");
		Thread.sleep(2000);
		SaveUserInfoClick.click();
		Thread.sleep(2000);

	}

	public void verifyNewUserwithExistingData() throws Throwable {

		createUserClick.click();
		Thread.sleep(3000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingbuser");
		Thread.sleep(1000);

		DropDownSelection(UserRoleDropDown, "Business User");
		Thread.sleep(2000);
		firstNameData.sendKeys("firstname");
		lastNameData.sendKeys("lastname");
		MiddleNameData.sendKeys("MiddleName5");
		EmailData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingbuser@gmail.com");
		PhonenumberData.sendKeys("1234567690");
		Thread.sleep(1000);
		ExternalidData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "EID" + eid++);
		MoveAllPartnerClick.click();
		Thread.sleep(1000);
		// Actionselection(driver, MoveAllGroupClick);
		MoveAllGroupClick.click();
		Thread.sleep(2000);
		SaveUserInfoClick.click();
		Thread.sleep(2000);

	}

	public void verifyNewAdminwithExistingData() throws Throwable {

		createUserClick.click();
		Thread.sleep(3000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingbuser");

		DropDownSelection(UserRoleDropDown, "Admin");
		Thread.sleep(2000);
		firstNameData.sendKeys("firstname");
		lastNameData.sendKeys("firstname");
		MiddleNameData.sendKeys("MiddleName5");
		EmailData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "userautomation@gmail.com");
		PhonenumberData.sendKeys("1234567690");
		Thread.sleep(1000);
		ExternalidData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "EID" + eid++);
		SaveUserInfoClick.click();
		Thread.sleep(2000);

	}
	
	public void createadminuserformanage1() throws Throwable {

		createUserClick.click();
		Thread.sleep(3000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingbuser");

		DropDownSelection(UserRoleDropDown, "Business User");
		Thread.sleep(2000);
		firstNameData.sendKeys("firstname");
		lastNameData.sendKeys("lastname");
		MiddleNameData.sendKeys("MiddleName5");
		EmailData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "userautomation@gmail.com");
		PhonenumberData.sendKeys("1234567690");
		Thread.sleep(1000);
		ExternalidData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "224407");
		SaveUserInfoClick.click();
		Thread.sleep(2000);

	}

	public void createadminuserformanage() throws Throwable {

		createUserClick.click();
		Thread.sleep(3000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingadmin");

		DropDownSelection(UserRoleDropDown, "Admin");
		Thread.sleep(2000);
		firstNameData.sendKeys("firstname");
		lastNameData.sendKeys("lastname");
		MiddleNameData.sendKeys("MiddleName5");
		EmailData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingadmin@gmail.com");
		PhonenumberData.sendKeys("1234567690");
		Thread.sleep(1000);
		ExternalidData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "22440780");
		SaveUserInfoClick.click();
		Thread.sleep(2000);

	}

	public void createonboarderuserformanage() throws Throwable {

		createUserClick.click();
		Thread.sleep(3000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingonboarder");

		DropDownSelection(UserRoleDropDown, "On Boarder");
		Thread.sleep(2000);
		firstNameData.sendKeys("firstname");
		lastNameData.sendKeys("lastname");
		MiddleNameData.sendKeys("MiddleName5");
		EmailData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingonboarder@gmail.com");
		PhonenumberData.sendKeys("1234567690");
		Thread.sleep(1000);
		ExternalidData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "2244011");
		SaveUserInfoClick.click();
		Thread.sleep(2000);

	}
	
	public void createbusinessadminformanage() throws Throwable {

		createUserClick.click();
		Thread.sleep(3000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingbusinessadmin");

		DropDownSelection(UserRoleDropDown, "Business Admin");
		Thread.sleep(2000);
		firstNameData.sendKeys("firstname");
		lastNameData.sendKeys("lastname");
		MiddleNameData.sendKeys("MiddleName5");
		EmailData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingbusinessadmin@gmail.com");
		PhonenumberData.sendKeys("1234567690");
		Thread.sleep(1000);
		ExternalidData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "334456780");
		SaveUserInfoClick.click();
		Thread.sleep(2000);

	}

	public void createbusinessuserformanage() throws Throwable {

		createUserClick.click();
		Thread.sleep(3000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingbusinessuser");

		DropDownSelection(UserRoleDropDown, "Business User");
		Thread.sleep(2000);
		firstNameData.sendKeys("firstname");
		lastNameData.sendKeys("lastname");
		MiddleNameData.sendKeys("MiddleName5");
		EmailData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingbuser@gmail.com");
		PhonenumberData.sendKeys("1234567690");
		Thread.sleep(1000);
		ExternalidData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "3344378940");
		SaveUserInfoClick.click();
		Thread.sleep(2000);

	}
	
	public void createdataprocessorformanage() throws Throwable {

		createUserClick.click();
		Thread.sleep(3000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingdataprocessor");

		DropDownSelection(UserRoleDropDown, "Data Processor");
		Thread.sleep(2000);
		firstNameData.sendKeys("firstname");
		lastNameData.sendKeys("lastname");
		MiddleNameData.sendKeys("MiddleName5");
		EmailData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingdataprocessor@gmail.com");
		PhonenumberData.sendKeys("1234567690");
		Thread.sleep(1000);
		ExternalidData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "3908903440");
		SaveUserInfoClick.click();
		Thread.sleep(2000);

	}
	
	public void createdataprocessorresformanage() throws Throwable {

		createUserClick.click();
		Thread.sleep(3000);
		UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingdataprocessorrestricted");

		DropDownSelection(UserRoleDropDown, "Data Processor Restricted");
		Thread.sleep(2000);
		firstNameData.sendKeys("firstname");
		lastNameData.sendKeys("lastname");
		MiddleNameData.sendKeys("MiddleName5");
		EmailData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testingdataprocessorrestricted@gmail.com");
		PhonenumberData.sendKeys("1234567690");
		Thread.sleep(1000);
		ExternalidData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "336423440");
		SaveUserInfoClick.click();
		Thread.sleep(2000);

	}



}
