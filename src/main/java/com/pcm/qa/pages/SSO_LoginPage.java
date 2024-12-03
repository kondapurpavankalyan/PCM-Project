package com.pcm.qa.pages;

	import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import com.pcm.qa.base.TestBase;

	public class SSO_LoginPage extends TestBase{
		
		///PCM UI///
		
		@FindBy(xpath = "//input[@formcontrolname='username']")
		public WebElement username;
		
		@FindBy(xpath = "//input[@formcontrolname='password']")
		public WebElement password;
		
		@FindBy(xpath = "//span[contains(text(),'Login ')]")
		public WebElement loginbtn;
		
		///IBM UI///
		
		@FindBy(xpath = "//input[@id='user']")
		public WebElement username1;
		
		@FindBy(xpath = "//input[@id='password']")
		public WebElement password1;
		
		@FindBy(xpath = "//input[@id='logonSubmit']")
		public WebElement signinbtn;
		
		/////
		
		@FindBy(xpath = "(//span[@class='mat-button-wrapper'])[3]")
		public WebElement useraccountbtn;
		
		@FindBy(xpath = "//button[contains(text(),'Change Password')]")
		public WebElement changepwd;
		
		@FindBy(xpath = "//button[contains(text(),'Logout')]")
		public WebElement logoutbtn;
		
		@FindBy(xpath = "//a[contains(text(),'here')]")
		public WebElement clickherelink;
		
		@FindBy(xpath = "//span[contains(text(),'Access Management')]")
		public WebElement accessmanagement;
		
		@FindBy(xpath = "//span[contains(text(),'Manage User')]")
		public WebElement manageuser;
		
		@FindBy(xpath = "//input[@placeholder='User Id']")
		public WebElement userid;
		
		@FindBy(xpath = "//button[@type='submit']")
		public WebElement searchbtn;
		
		@FindBy(xpath = "//tr[1]//td//mat-icon[@svgicon='menu-bar']")
		public WebElement actionsbtn;
		
		@FindBy(xpath = "//button[contains(text(),'EDIT')]")
		public WebElement editbtn;
		
		@FindBy(xpath = "//mat-select[@aria-label='Role *']")
		public WebElement role;
		
		@FindBy(xpath = "//button[contains(text(),'UPDATE USER')]")
		public WebElement updateuserbtn;
		
		@FindBy(xpath = "//button[contains(text(),'ACTIVATE')]")
		public WebElement activatebtn;
		
		@FindBy(xpath = "//button[contains(text(),'DEACTIVATE')]")
		public WebElement deactivatebtn;
		
		@FindBy(xpath = "//button[contains(text(),'Yes, activate it!')]")
		public WebElement yesactivatebtn;
		
		@FindBy(xpath = "//button[contains(text(),'Yes, deactivate it!')]")
		public WebElement yesdeactivatebtn;
		
		@FindBy(xpath = "//button[contains(text(),'DELETE')]")
		public WebElement deletebtn;
		
		@FindBy(xpath = "//button[contains(text(),'Yes, delete it!')]")
		public WebElement yesdeletebtn;
		
		@FindBy(xpath = "//button[contains(text(),'Ok')]")
		public WebElement errorokbtn;
		
		@FindBy(xpath = "//button[contains(text(),'RESET SEARCH')]")
		public WebElement resetbtn;
		
		@FindBy(xpath = "//div//h3")
		public WebElement LoginPageheadertitle;
		
		@FindBy(xpath = "//a[contains(text(),'Forgot Password?')]")
		public WebElement forgotpwd;
		
		///
		
		@FindBy(xpath = "//span[contains(text(),'File Transfer')]")
		public  WebElement FileTransfersClick;
		
		@FindBy(xpath = "//span[contains(text(),'Reports')]")
		public WebElement ReportClick;
		
		@FindBy(xpath = "//mat-drawer//mat-nav-list[3]//span[contains(text(),'Partner')]")
		public WebElement PartnerClick;
		
		@FindBy(xpath = "//mat-drawer//mat-nav-list[4]//span[contains(text(),'Application')]")
		public WebElement ApplicationClick;
		
		@FindBy(xpath = "//span[contains(text(),'Data Flows')]")
		public WebElement DataFlowsModuleClick;
		
		@FindBy(xpath = "//span[contains(text(),'Access Management')]")
		public WebElement AccessManagementClick;
		
		@FindBy(xpath = "//span[contains(text(),'Create User')]")
		public WebElement createUserClick;
		
		@FindBy(xpath = "(//*[text()[contains(.,'Setting')]])[1]")
		public WebElement SettingClick;
		
		@FindBy(xpath = "//div[@id='swal2-content']")
		public WebElement ActionMsg;

		@FindBy(xpath = "//div[@id='swal2-content']")
		public WebElement ErrorMsg;
		
		@FindBy(xpath = "//mat-select[@aria-label='User Type']")
		public WebElement UserTypeDD;
		
		@FindBy(xpath = "//span[contains(text(),'Manage User')]")
		public WebElement ManageUserClick;
		
		@FindBy(xpath = "//input[@name='userId']")
		public WebElement UserIdData;

		@FindBy(xpath = "//mat-select[@aria-label='Role']")
		public WebElement RoleDropDown;
		
		@FindBy(xpath = "//mat-select[@aria-label='Role *']")
		public WebElement updateRoleDD;
		
		@FindBy(xpath = "//input[@name='externalId']")
		public WebElement ExternalId;

		@FindBy(xpath = "//input[@name='firstName']")
		public WebElement FirstNameData;

		@FindBy(xpath = "//input[@name='lastName']")
		public WebElement LastNameData;
		
		@FindBy(xpath = "//input[@name='middleName']")
		public WebElement MiddleNameData;
		
		@FindBy(xpath = "//input[@name='phone']")
		public WebElement PhoneData;
		
		@FindBy(xpath = "//input[@name='email']")
		public WebElement EmailData;

		@FindBy(xpath = "//mat-select[@aria-label='Status']")
		public WebElement StatusDropDown;
		
		@FindBy(xpath = "(//*[@svgicon='menu-bar'])[1]")
		public WebElement IconMenu;
		
		@FindBy(xpath = "//button[@class='btn btn-primary']")
		public WebElement SearchUserClick;
		
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
		
		@FindBy(xpath = "//button[text()='EDIT']")
		public WebElement EditClick;
		
		@FindBy(xpath = "//button[contains(text(),'UPDATE USER')]")
		public WebElement UpdateClick;
		
		@FindBy(xpath = "//*[text()[contains(.,'OK')]]")
		public WebElement OKbtn;
		
		
	

		@FindBy(xpath = "//input[@name='firstName']")
		public WebElement firstNameData;

		@FindBy(xpath = "//input[@name='lastName']")
		public WebElement lastNameData;

	
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
		
		
		public SSO_LoginPage() {
			
			PageFactory.initElements(driver, this);
			
		}
		
		public String validateloginpageheadertitle() {
			
			return LoginPageheadertitle.getText();
			
		}
		
		public void Loginmethod() throws InterruptedException {
			
		username.sendKeys(prop.getProperty("username"));
		Thread.sleep(1000);
		password.sendKeys(prop.getProperty("password"));
		Thread.sleep(1000);
		loginbtn.click();
		
		}
		
		public void loginmethod1(String un, String pwd) throws Exception {
			
			username.sendKeys(un);
			password.sendKeys(pwd);
			signinbtn.click();
			
			Thread.sleep(5000);
			
			}
		
		public void logoutmethod() throws Exception {
			
			Thread.sleep(2000);
			
			useraccountbtn.click();
			
			Thread.sleep(1000);
			
			logoutbtn.click();
			
			Thread.sleep(3000);
			
		}
		
		public void logoutmethod1() throws Exception {
			
			Thread.sleep(3000);
			
			Actionselection(driver, useraccountbtn);
			
			Thread.sleep(2000);
			
			Actionselection(driver, logoutbtn);
			
			Thread.sleep(3000);
			
			clickherelink.click();
			
			Thread.sleep(2000);
			
			
		}
		
		
		public void userroleupdate(String name , String updaterolename) throws Exception {
			
			Thread.sleep(2000);
			
			userid.sendKeys(name);
			
			searchbtn.click();
			
			Thread.sleep(2000);
			
			actionsbtn.click();
			
			editbtn.click();
			
			Thread.sleep(3000);
			
			DropDownSelection(role, updaterolename);
			
			updateuserbtn.click();
			
			Thread.sleep(3000);
			
		}
		
		
		
		public void actionsmethod(String name , String actionname) throws Exception {
			
			Actionselection(driver, resetbtn);
			
			Thread.sleep(2000);
			
			userid.sendKeys(name);
			
			searchbtn.click();
			
			Thread.sleep(2000);
			
			actionsbtn.click();
		
			 if(actionname.equalsIgnoreCase("ACTIVATE")) {
							
					activatebtn.click();
					
					yesactivatebtn.click();
				 
				 
			 }else if(actionname.equalsIgnoreCase("DEACTIVATE")){
							
					deactivatebtn.click();
					
					yesdeactivatebtn.click();
					
				 
			 }else if(actionname.equalsIgnoreCase("DELETE")) {
				 
				 	deletebtn.click();
				 	
				 	yesdeletebtn.click();
					
					Thread.sleep(3000);
				 
			 }
			
		}
		
		public void verifyAdminwithvalidData() throws Throwable {

			
			Thread.sleep(1000);
			DropDownSelection(UserRoleDropDown, "Admin");
			Thread.sleep(2000);
			UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testuser1200");
			Thread.sleep(1000);
			firstNameData.sendKeys("FirstName1200");
			Thread.sleep(1000);
			lastNameData.sendKeys("LastName1200");
			Thread.sleep(1000);
			MiddleNameData.sendKeys("MiddleName1200");
			Thread.sleep(1000);
			EmailData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Partner1200@gmail.com");
			Thread.sleep(1000);
			PhonenumberData.sendKeys("1234567690");
			Thread.sleep(1000);
			SaveUserInfoClick.click();
			Thread.sleep(1000);
			
		}
		
		
		
		
		
	}



