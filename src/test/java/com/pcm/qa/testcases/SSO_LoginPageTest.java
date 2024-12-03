package com.pcm.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pcm.qa.base.TestBase;

import com.pcm.qa.pages.SSO_LoginPage;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SSO_LoginPageTest extends TestBase {

	SSO_LoginPage SSO;

	public ExtentTest Parent201;
	public ExtentTest child1;
	public ExtentTest child2;
	public ExtentTest child3;
	public ExtentTest child4;
	public ExtentTest child5;
	public ExtentTest child6;
	public ExtentTest child7;
	public ExtentTest child8;
	public ExtentTest child9;
	public ExtentTest child10;
	public ExtentTest child11;
	public ExtentTest child12;
	public ExtentTest child13;
	public ExtentTest child14;
	public ExtentTest child15;
	public ExtentTest child16;
	public ExtentTest child17;
	public ExtentTest child18;
	public ExtentTest child19;
	public ExtentTest child20;

	public SSO_LoginPageTest() {
		super();
	}

	@BeforeTest(enabled = true)
	public void setup() throws Exception {

		Extentreport();
		initialization();
	}

	@BeforeMethod
	public void basic() {
		SSO = new SSO_LoginPage();
	}

	@Test(priority = 1, enabled = true)
	public void ParentNodeCreation() {

		_test_logger201 = _extent_report.startTest("PCM SSO");
		Parent201 = _extent_report.startTest("SSO Functionality TestCases");

	}

	@Test(priority = 2, enabled = true, description = "validating login page header title")
	public void validatingloginpageheadertitleTest() throws Exception {

		child1 = _extent_report.startTest("Login Page Title Verification");
		child1.assignCategory("SSO Functionality TestCases");

		try {

			SSO.logoutmethod();

			String title = SSO.validateloginpageheadertitle();

			if (title.equals("Login to your account")) {
				child1.log(LogStatus.PASS,
						"Validation successful because we are getting Login Page Header title as '" + title + "'.");
			} else {
				child1.log(LogStatus.FAIL,
						"Validation  unsuccessful because we are getting Login Page Header title as '" + title
								+ "' instead of Login to your account.");
			}
		} catch (Exception e) {
			child1.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child1);
	}

	@Test(priority = 3, enabled = true, description = "validating login page functionality with role as Superadmin")
	public void verifyingloginwithSuperadmin() throws Exception {

		child2 = _extent_report.startTest("validating login page functionality with role as Superadmin");
		child2.assignCategory("SSO Functionality TestCases");

		try {

			String username = "nagaraj";
			String password = "Pragma@05";

			SSO.username.sendKeys(Keys.chord(Keys.CONTROL, "a"), username);
			Thread.sleep(1000);
			SSO.password.sendKeys(Keys.chord(Keys.CONTROL, "a"), password);
			Thread.sleep(1000);
			SSO.loginbtn.click();
			Thread.sleep(3000);
			String title = SSO.useraccountbtn.getText();
			System.out.println(title);

			if (SSO.FileTransfersClick.isDisplayed() && SSO.ReportClick.isDisplayed() && SSO.PartnerClick.isDisplayed()
					&& SSO.ApplicationClick.isDisplayed() && SSO.DataFlowsModuleClick.isDisplayed()
					&& SSO.AccessManagementClick.isDisplayed() && SSO.SettingClick.isDisplayed()) {
				
				child2.log(LogStatus.PASS, "Validation successful because Superadmin Modules has been displayed");
			} else {
				child2.log(LogStatus.FAIL, "Validation Unsuccessful because Superadmin Modules has not been displayed");
			}

		} catch (Exception e) {
			child2.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child2);
		
	}
	
	
	@Test(priority = 4, enabled = true, description = "verifying Change password Visibility")
	public void validatingChangePasswordVisibility() {

		child3 = _extent_report.startTest("verifying Change password Visibility");
		child3.assignCategory("SSO Functionality TestCases");

		try {

			Thread.sleep(2000);

			SSO.useraccountbtn.click();
			Thread.sleep(2000);

			String title = driver.findElement(By.xpath("(//div[@class='mat-menu-content']//button)[1]")).getText();
			System.out.println(title);
			SSO.logoutbtn.click();

			if (title.equals("Change Password")) {
				child3.log(LogStatus.FAIL, "Validation Unsuccessful because change password field is visible");
			} else {
				child3.log(LogStatus.PASS, "Validation Successful because Change password field is not visible");
			}
			
		} catch (Exception e) {
			child3.log(LogStatus.FAIL, e.fillInStackTrace());
			
			
		}
		_extent_report.endTest(child3);
	}
	
	@Test(priority = 5, enabled = true, description = "verifying usertype as External")
	public void VerifyingusertypeasExternal() {

		child4 = _extent_report.startTest("verifying usertype as External");
		child4.assignCategory("SSO Functionality TestCases");

		try {
			
			Thread.sleep(2000);
			SSO.Loginmethod();
			Thread.sleep(2000);
			
			SSO.AccessManagementClick.click();
			Thread.sleep(1000);
			SSO.createUserClick.click();

			String title = SSO.UserTypeDD.getText();
			System.out.println(title);

			if (title.equals("EXTERNAL")) {
				child4.log(LogStatus.PASS, "Validation Successful because Usertype is external and uneditable");
			} else {
				child4.log(LogStatus.FAIL,
						"Validation Unsuccessful because Usertype is not external and uneditable");
			}
		} catch (Exception e) {
			child4.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child4);
	}

	@Test(priority = 6, enabled = true, description = "verifying delete External user and try to login")
	public void VerifyingdeleteExternaluserandLogin() {

		child5 = _extent_report.startTest("verifying delete External user and try to login");
		child5.assignCategory("SSO Functionality TestCases");

		try {

			String username = "pradeep";
			String password = "Pragma@05";

			Thread.sleep(2000);
			SSO.ManageUserClick.click();

			Thread.sleep(1000);
			SSO.UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "pradeep");
			DropDownSelection(SSO.RoleDropDown, "Data Processor Restricted");
			Thread.sleep(2000);
			
			SSO.SearchUserClick.click();

			Thread.sleep(2000);
			SSO.IconMenu.click();
			Thread.sleep(1000);

			SSO.DeleteClick.click();
			Thread.sleep(1000);
			SSO.yesDeleteitClick.click();
			Thread.sleep(1000);

			String title = SSO.ActionMsg.getText();
			System.out.println(title);
			
			SSO.logoutmethod();

			driver.findElement(By.xpath("//input[@formcontrolname='username']")).sendKeys(username);
			driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys(password);
			driver.findElement(By.xpath("//span[contains(text(),'Login ')]")).click();

			Thread.sleep(2000);

			String title1 = driver.findElement(By.xpath("//div//h3")).getText();
			System.out.println(title1);
			
			if (title1.equals("Home / File Transfers")) {
				child5.log(LogStatus.PASS,
						"Validation successful because we are getting message as '"+title+"' when we delete external user and login");
			} else {
				child5.log(LogStatus.FAIL,
						"Validation Unsuccessful because we are getting message as '"+title+"' Instead of Home / File Transfers when we delete external user and login");
			}

			SSO.logoutmethod();

		} catch (Exception e) {
			child5.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child5);
	}
	
	@Test(priority = 7, enabled = true, description = "verifying forgot password visibility")
	public void validatingforgotpasswordVisibility() {

		child6 = _extent_report.startTest("verifying forgot password visibility");
		child6.assignCategory("SSO Functionality TestCases");

		try {

			boolean flag = SSO.forgotpwd.isDisplayed();
			String title = String.valueOf(flag);

			if (title.equals("flase")) {
				child6.log(LogStatus.PASS, "Validation Successful because Forgot password field is not visible");
			} else {
				child6.log(LogStatus.FAIL, "Validation Unsuccessful becauseForgot password field is visible");
			}
		} catch (Exception e) {
			child6.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child6);
	}
	
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	

	@Test(priority = 8, enabled = true, description = "validating login page functionality with role as Admin")
	public void verifyingloginwithAdmin() throws Exception {

		child7 = _extent_report.startTest("validating login page functionality with role as Admin");
		child7.assignCategory("SSO Functionality TestCases");

		try {
			String username = "kiran";
			String password = "Pragma@05";

			SSO.username.sendKeys(Keys.chord(Keys.CONTROL, "a"), username);
			Thread.sleep(1000);
			SSO.password.sendKeys(Keys.chord(Keys.CONTROL, "a"), password);
			Thread.sleep(1000);
			SSO.loginbtn.click();
			Thread.sleep(5000);
			String title = SSO.useraccountbtn.getText();
			System.out.println(title);

			if (SSO.AccessManagementClick.isDisplayed() && SSO.SettingClick.isDisplayed()) {
				child7.log(LogStatus.PASS, "Validation successful because Admin Modules has been displayed");
			} else {
				child7.log(LogStatus.FAIL, "Validation Unsuccessful because Admin Modules has not been displayed");
			}

			SSO.logoutmethod();

		} catch (Exception e) {
			child7.log(LogStatus.FAIL, e.fillInStackTrace());
			System.out.println(SSO.ActionMsg.getText());

			SSO.OKbtn.click();

		}
		_extent_report.endTest(child7);
	}

	@Test(priority = 9, enabled = true, description = "validating login page functionality with role as OnBoarder")
	public void verifyingloginwithOnBoarder() throws Exception {

		child8 = _extent_report.startTest("validating login page functionality with role as OnBoarder");
		child8.assignCategory("SSO Functionality TestCases");

		try {
			String username = "Pavan.m";
			String password = "Pragma@05";

			SSO.username.sendKeys(Keys.chord(Keys.CONTROL, "a"), username);
			Thread.sleep(1000);
			SSO.password.sendKeys(Keys.chord(Keys.CONTROL, "a"), password);
			Thread.sleep(1000);
			SSO.loginbtn.click();
			Thread.sleep(5000);
			String title = SSO.useraccountbtn.getText();
			System.out.println(title);

			if (SSO.PartnerClick.isDisplayed() && SSO.ApplicationClick.isDisplayed()
					&& SSO.DataFlowsModuleClick.isDisplayed()) {
				child8.log(LogStatus.PASS, "Validation successful because OnBoarder Modules has been displayed");
			} else {
				child8.log(LogStatus.FAIL, "Validation Unsuccessful because OnBoarder Modules has not been displayed");
			}

			SSO.logoutmethod();

		} catch (Exception e) {
			child8.log(LogStatus.FAIL, e.fillInStackTrace());
			System.out.println(SSO.ActionMsg.getText());

			SSO.OKbtn.click();
		}
		_extent_report.endTest(child8);
	}

	@Test(priority = 10, enabled = true, description = "validating login page functionality with role as Business Admin")
	public void verifyingloginwithBusinessAdmin() throws Exception {

		child9 = _extent_report.startTest("validating login page functionality with role as Business Admin");
		child9.assignCategory("SSO Functionality TestCases");

		try {
			String username = "kiran.e";
			String password = "Pragma@05";

			SSO.username.sendKeys(Keys.chord(Keys.CONTROL, "a"), username);
			Thread.sleep(1000);
			SSO.password.sendKeys(Keys.chord(Keys.CONTROL, "a"), password);
			Thread.sleep(1000);
			SSO.loginbtn.click();
			Thread.sleep(5000);
			String title = SSO.useraccountbtn.getText();
			System.out.println(title);

			if (SSO.FileTransfersClick.isDisplayed() && SSO.ReportClick.isDisplayed() && SSO.PartnerClick.isDisplayed()
					&& SSO.ApplicationClick.isDisplayed() && SSO.DataFlowsModuleClick.isDisplayed()) {
				child9.log(LogStatus.PASS, "Validation successful because Business Admin Modules has been displayed");
			} else {
				child9.log(LogStatus.FAIL,
						"Validation Unsuccessful because Business Admin Modules has not been displayed");
			}

			SSO.logoutmethod();

		} catch (Exception e) {
			child9.log(LogStatus.FAIL, e.fillInStackTrace());
			System.out.println(SSO.ActionMsg.getText());

			SSO.OKbtn.click();
		}
		_extent_report.endTest(child9);
	}

	@Test(priority = 11, enabled = true, description = "validating login page functionality with role as Business User")
	public void verifyingloginwithBusinessUser() throws Exception {

		child10 = _extent_report.startTest("validating login page functionality with role as Business user");
		child10.assignCategory("SSO Functionality TestCases");

		try {
			String username = "divya.k";
			String password = "Pragma@05";

			SSO.username.sendKeys(Keys.chord(Keys.CONTROL, "a"), username);
			Thread.sleep(1000);
			SSO.password.sendKeys(Keys.chord(Keys.CONTROL, "a"), password);
			Thread.sleep(1000);
			SSO.loginbtn.click();
			Thread.sleep(5000);

			String title = SSO.useraccountbtn.getText();
			System.out.println(title);

			if (SSO.FileTransfersClick.isDisplayed() && SSO.ReportClick.isDisplayed() && SSO.PartnerClick.isDisplayed()
					&& SSO.ApplicationClick.isDisplayed() && SSO.DataFlowsModuleClick.isDisplayed()) {
				child10.log(LogStatus.PASS, "Validation successful because Business user Modules has been displayed");
			} else {
				child10.log(LogStatus.FAIL,
						"Validation Unsuccessful because Business user Modules has not been displayed");
			}

			SSO.logoutmethod();

		} catch (Exception e) {
			child10.log(LogStatus.FAIL, e.fillInStackTrace());
			System.out.println(SSO.ActionMsg.getText());

			SSO.OKbtn.click();
		}
		_extent_report.endTest(child10);
	}

	@Test(priority = 12, enabled = true, description = "validating login page functionality with role as Dataprocessor")
	public void verifyingloginwithDataprocessor() throws Exception {

		child11 = _extent_report.startTest("validating login page functionality with role as Dataprocessor");
		child11.assignCategory("SSO Functionality TestCases");

		try {
			String username = "Ranadeep";
			String password = "Pragma@05";

			SSO.username.sendKeys(Keys.chord(Keys.CONTROL, "a"), username);
			Thread.sleep(1000);
			SSO.password.sendKeys(Keys.chord(Keys.CONTROL, "a"), password);
			Thread.sleep(1000);
			SSO.loginbtn.click();
			Thread.sleep(5000);
			String title = SSO.useraccountbtn.getText();
			System.out.println(title);

			if (SSO.FileTransfersClick.isDisplayed() && SSO.ReportClick.isDisplayed()) {
				child11.log(LogStatus.PASS, "Validation successful because Dataprocessor  Modules has been displayed");
			} else {
				child11.log(LogStatus.FAIL,
						"Validation Unsuccessful because Dataprocessor Modules has not been displayed");
			}

			SSO.logoutmethod();

		} catch (Exception e) {
			child11.log(LogStatus.FAIL, e.fillInStackTrace());
			System.out.println(SSO.ActionMsg.getText());
			SSO.OKbtn.click();
		}
		_extent_report.endTest(child11);
	}

	@Test(priority = 13, enabled = true, description = "validating login page functionality with role as Dataprocessor Restricted")
	public void verifyingloginwithDataprocessorRes() throws Exception {

		child12 = _extent_report.startTest("validating login page functionality with role as Dataprocessor Restricted");
		child12.assignCategory("SSO Functionality TestCases");

		try {
			String username = "pradeep";
			String password = "Pragma@05";

			SSO.username.sendKeys(Keys.chord(Keys.CONTROL, "a"), username);
			Thread.sleep(1000);
			SSO.password.sendKeys(Keys.chord(Keys.CONTROL, "a"), password);
			Thread.sleep(1000);
			SSO.loginbtn.click();
			Thread.sleep(5000);

			String title = SSO.useraccountbtn.getText();
			System.out.println(title);

			if (SSO.FileTransfersClick.isDisplayed() && SSO.ReportClick.isDisplayed()) {
				child12.log(LogStatus.PASS,
						"Validation successful because Dataprocessor Res  Modules has been displayed");
			} else {
				child12.log(LogStatus.FAIL,
						"Validation Unsuccessful because  Dataprocessor Res Modules has not been displayed");
			}

			SSO.logoutmethod();

		} catch (Exception e) {
			child12.log(LogStatus.FAIL, e.fillInStackTrace());
			System.out.println(SSO.ActionMsg.getText());

			SSO.OKbtn.click();
		}
		_extent_report.endTest(child12);
	}

	@Test(priority = 14, enabled = true, description = "validating login page functionality with with invalid LDAP details")
	public void verifyingloginwithinvaliddataTest() throws Exception {

		child13 = _extent_report.startTest("validating login page functionality with invalid LDAP details");
		child13.assignCategory("SSO Functionality TestCases");

		try {

			String username = "testing";
			String password = "testing";

			SSO.username.sendKeys(Keys.chord(Keys.CONTROL, "a"), username);
			Thread.sleep(1000);
			SSO.password.sendKeys(Keys.chord(Keys.CONTROL, "a"), password);
			Thread.sleep(1000);
			SSO.loginbtn.click();
			Thread.sleep(1000);
			String title = SSO.ActionMsg.getText();
			System.out.println(title);

			if (title.equals("username/password invalid.")) {
				child13.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title + "' when we try to login with Invalid LDAP details");
			} else {
				child13.log(LogStatus.FAIL, "Validation unsuccessful because we are getting Message as '" + title + "' instead of username/password invalid.");
			}

			SSO.OKbtn.click();

		} catch (Exception e) {
			child13.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child13);
	}

	@Test(priority = 15, enabled = true, description = "Updating External user Role and try to login")
	public void UpdatingExternaluserRoleandLogin() {

		child14 = _extent_report.startTest("Updating External user Role and try to login");
		child14.assignCategory("SSO Functionality TestCases");

		try {

			driver.navigate().refresh();
			
			String username = "pradeep";
			String password = "Pragma@05";
			
			SSO.Loginmethod();
			Thread.sleep(2000);
			SSO.AccessManagementClick.click();
			Thread.sleep(1000);
			SSO.ManageUserClick.click();

			Thread.sleep(1000);
			SSO.UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), username);
			Thread.sleep(1000);
			DropDownSelection(SSO.RoleDropDown, "Data Processor Restricted");
			Thread.sleep(2000);
			SSO.SearchUserClick.click();

			Thread.sleep(2000);
			SSO.IconMenu.click();
			Thread.sleep(1000);

			SSO.EditClick.click();
			Thread.sleep(4000);

			DropDownSelection(SSO.updateRoleDD, "Admin");
			Thread.sleep(2000);

			SSO.UpdateClick.click();
			Thread.sleep(2000);
			
			SSO.logoutmethod();
			Thread.sleep(2000);
			
			SSO.username.sendKeys(Keys.chord(Keys.CONTROL, "a"), username);
			Thread.sleep(1000);
			SSO.password.sendKeys(Keys.chord(Keys.CONTROL, "a"), password);
			Thread.sleep(1000);
			SSO.loginbtn.click();

			Thread.sleep(1000);

			String title = SSO.ActionMsg.getText();
			System.out.println(title);

			if (title.equals(
					"Unauthorized to access the resource. Please contact system admin.")) {
				child14.log(LogStatus.PASS, "Validation successful because we are getting error message as '" + title + "' ");
			} else {
				child14.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting error has '" + title + "' ");
			}

			SSO.OKbtn.click();

		} catch (Exception e) {
			child14.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child14);
	}
	
	
	@Test(priority = 16, enabled = true, description = "Updating External user Role to Default and try to login")
	public void UpdatingExternaluserRoleDefaultandLogin() {

		child15 = _extent_report.startTest("Updating External user Role to Default and try to login");
		child15.assignCategory("SSO Functionality TestCases");

		try {

			driver.navigate().refresh();
			
			String username = "pradeep";
			String password = "Pragma@05";
			
			SSO.Loginmethod();
			Thread.sleep(2000);
			SSO.AccessManagementClick.click();
			Thread.sleep(1000);
			SSO.ManageUserClick.click();

			Thread.sleep(1000);
			SSO.UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), username);
			Thread.sleep(1000);
			DropDownSelection(SSO.RoleDropDown, "Admin");
			Thread.sleep(2000);
			SSO.SearchUserClick.click();

			Thread.sleep(2000);
			SSO.IconMenu.click();
			Thread.sleep(1000);

			SSO.EditClick.click();
			Thread.sleep(4000);

			DropDownSelection(SSO.updateRoleDD, "Data Processor Restricted");
			Thread.sleep(2000);
			DropDownSelection(SSO.StatusDropDown, "Active");
			Thread.sleep(2000);
			
			SSO.UpdateClick.click();
			Thread.sleep(2000);
			
			SSO.logoutmethod();
			Thread.sleep(2000);
			
			SSO.username.sendKeys(Keys.chord(Keys.CONTROL, "a"), username);
			Thread.sleep(1000);
			SSO.password.sendKeys(Keys.chord(Keys.CONTROL, "a"), password);
			Thread.sleep(1000);
			SSO.loginbtn.click();

			Thread.sleep(2000);

			String title = driver.findElement(By.xpath("//div//h3")).getText();
			System.out.println(title);
			
			if (title.equals("Home / File Transfers")) {
				child15.log(LogStatus.PASS, "Validation successful because we are getting msg has '" + title + "' ");
			} else {
				child15.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting msg has '" + title + "' ");
			}

		} catch (Exception e) {
			child15.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child15);
	}
	

	@Test(priority = 17, enabled = true, description = "Updating External user Id and try to login")
	public void UpdatingExternaluserIdandLogin() {

		child16 = _extent_report.startTest("Updating External user Id and try to login");
		child16.assignCategory("SSO Functionality TestCases");

		try {

		SSO.logoutmethod();
			
			String username = "pradeep";
			String password = "Pragma@05";
			
			SSO.Loginmethod();
			Thread.sleep(2000);
			SSO.AccessManagementClick.click();
			Thread.sleep(1000);
			SSO.ManageUserClick.click();

			Thread.sleep(1000);
			SSO.UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), username);
			Thread.sleep(1000);
			SSO.SearchUserClick.click();

			Thread.sleep(2000);
			SSO.IconMenu.click();
			Thread.sleep(1000);

			SSO.EditClick.click();
			Thread.sleep(4000);

			SSO.ExternalId.sendKeys(Keys.chord(Keys.CONTROL, "a"), "110266");

			SSO.UpdateClick.click();
			Thread.sleep(2000);
			
			SSO.logoutmethod();
			Thread.sleep(2000);
			
			SSO.username.sendKeys(Keys.chord(Keys.CONTROL, "a"), username);
			Thread.sleep(1000);
			SSO.password.sendKeys(Keys.chord(Keys.CONTROL, "a"), password);
			Thread.sleep(1000);
			SSO.loginbtn.click();

			Thread.sleep(1000);

			String title = SSO.ActionMsg.getText();
			System.out.println(title);

			if (title.equals(
					"Unauthorized to access the resource. Please contact system admin.")) {
				child16.log(LogStatus.PASS, "Validation successful because we are getting error has '" + title + "' ");
			} else {
				child16.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting error has '" + title + "' ");
			}

			SSO.OKbtn.click();

		} catch (Exception e) {
			child16.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child16);
	}
	
	
	@Test(priority = 18, enabled = true, description = "Updating External user Id to default and try to login")
	public void UpdatingExternaluserIdDefaultandLogin() {

		child17 = _extent_report.startTest("Updating External user Id to default and try to login");
		child17.assignCategory("SSO Functionality TestCases");

		try {

		driver.navigate().refresh();
			
			String username = "pradeep";
			String password = "Pragma@05";
			
			SSO.Loginmethod();
			Thread.sleep(2000);
			SSO.AccessManagementClick.click();
			Thread.sleep(1000);
			SSO.ManageUserClick.click();

			Thread.sleep(1000);
			SSO.UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), username);
			Thread.sleep(1000);
			SSO.SearchUserClick.click();

			Thread.sleep(2000);
			SSO.IconMenu.click();
			Thread.sleep(1000);

			SSO.EditClick.click();
			Thread.sleep(4000);

			SSO.ExternalId.sendKeys(Keys.chord(Keys.CONTROL, "a"), "110255");
			Thread.sleep(2000);
			DropDownSelection(SSO.StatusDropDown, "Active");
			Thread.sleep(2000);
			
			SSO.UpdateClick.click();
			Thread.sleep(2000);
			
			SSO.logoutmethod();
			Thread.sleep(2000);
			
			SSO.username.sendKeys(Keys.chord(Keys.CONTROL, "a"), username);
			Thread.sleep(1000);
			SSO.password.sendKeys(Keys.chord(Keys.CONTROL, "a"), password);
			Thread.sleep(1000);
			SSO.loginbtn.click();

			Thread.sleep(2000);

			String title = driver.findElement(By.xpath("//div//h3")).getText();
			System.out.println(title);
			
			if (title.equals("Home / File Transfers")) {
				child17.log(LogStatus.PASS, "Validation successful because we are getting msg has '" + title + "' ");
			} else {
				child17.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting msg has '" + title + "' ");
			}
			
			SSO.logoutmethod();

		} catch (Exception e) {
			child17.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child17);
	}

	
	@Test(priority = 19, enabled = true, description = "Verifying duplicate External user Id")
	public void verifyingDuplicateExternalId() {

		child18 = _extent_report.startTest("Verifying duplicate External user Id");
		child18.assignCategory("SSO Functionality TestCases");

		try {
			
			String username = "pradeep";
			String password = "Pragma@05";
			
			SSO.Loginmethod();
			Thread.sleep(2000);
			SSO.AccessManagementClick.click();
			Thread.sleep(1000);
			SSO.ManageUserClick.click();

			Thread.sleep(1000);
			SSO.UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), username);
			Thread.sleep(1000);
			SSO.SearchUserClick.click();

			Thread.sleep(2000);
			SSO.IconMenu.click();
			Thread.sleep(1000);

			SSO.EditClick.click();
			Thread.sleep(4000);

			SSO.ExternalId.sendKeys(Keys.chord(Keys.CONTROL, "a"), "110256");

			SSO.UpdateClick.click();
			Thread.sleep(2000);
			
			String title = SSO.ActionMsg.getText();
			System.out.println(title);

			if (title.equals(
					"ExternalId already exists.")) {
				child18.log(LogStatus.PASS, "Validation successful because we are getting error has '" + title + "' ");
			} else {
				child18.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting error has '" + title + "' ");
			}

			SSO.OKbtn.click();
			Thread.sleep(2000);
			
			SSO.logoutmethod();

		} catch (Exception e) {
			child18.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child18);
	}
	
	@Test(priority = 20, enabled = true, description = "Updating user details except external id and try to login")
	public void UpdatingdetailsexceptIDandLogin() {

		child19 = _extent_report.startTest("Updating user details except external id and try to login");
		child19.assignCategory("SSO Functionality TestCases");

		try {
			
			String username = "pradeep";
			String password = "Pragma@05";
			
			SSO.Loginmethod();
			Thread.sleep(2000);
			SSO.AccessManagementClick.click();
			Thread.sleep(1000);
			SSO.ManageUserClick.click();

			Thread.sleep(1000);
			SSO.UserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), username);
			Thread.sleep(1000);
			SSO.SearchUserClick.click();

			Thread.sleep(2000);
			SSO.IconMenu.click();
			Thread.sleep(1000);

			SSO.EditClick.click();
			Thread.sleep(4000);

			
			SSO.MiddleNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testing");
			SSO.PhoneData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "1234567890");

			SSO.UpdateClick.click();
			Thread.sleep(2000);
			
			SSO.logoutmethod();
			Thread.sleep(2000);
			
			SSO.username.sendKeys(Keys.chord(Keys.CONTROL, "a"), username);
			Thread.sleep(1000);
			SSO.password.sendKeys(Keys.chord(Keys.CONTROL, "a"), password);
			Thread.sleep(1000);
			SSO.loginbtn.click();

			Thread.sleep(2000);

			String title = driver.findElement(By.xpath("//div//h3")).getText();
			System.out.println(title);
			
			if (title.equals("Home / File Transfers")) {
				child19.log(LogStatus.PASS, "Validation successful because we are getting msg has '" + title + "' ");
			} else {
				child19.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting msg has '" + title + "' ");
			}
			
			SSO.logoutmethod();

		} catch (Exception e) {
			child19.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child19);
	}
	
	
	@Test(priority = 21, enabled = true, description = "Verifying ExternalId as Mandatory")
	public void VerifyingExternalIdasMandatory() throws Throwable {

		child20 = _extent_report.startTest("Verifying ExternalId as Mandatory");
		child20.assignCategory("SSO Functionality TestCases");

		try {
			
			SSO.Loginmethod();
			Thread.sleep(2000);
			SSO.AccessManagementClick.click();
			Thread.sleep(1000);
			SSO.createUserClick.click();
			Thread.sleep(1000);
			
		SSO.verifyAdminwithvalidData();
			
			String title = SSO.ActionMsg.getText();
			System.out.println(title);

			if (title.equals(
					"Please Provide a valid data for externalId")) {
				child20.log(LogStatus.PASS, "Validation successful because we are getting msg has '" + title + "' ");
			} else {
				child20.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting msg has '" + title + "' ");
			}
			
			SSO.OKbtn.click();
			SSO.logoutmethod();

		} catch (Exception e) {
			child20.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child20);
	}
	
	
	@AfterTest
	public void teardown() {

		_test_logger201.appendChild(Parent201);

		Parent201.appendChild(child1).appendChild(child2).appendChild(child3).appendChild(child4).appendChild(child5)
				.appendChild(child6).appendChild(child7).appendChild(child8).appendChild(child9).appendChild(child10)
				.appendChild(child11).appendChild(child12).appendChild(child13).appendChild(child14)
				.appendChild(child15).appendChild(child16).appendChild(child17).appendChild(child18).appendChild(child19).appendChild(child20);

		_extent_report.endTest(Parent201);
		_extent_report.endTest(_test_logger201);
		_extent_report.flush();

	}

}
