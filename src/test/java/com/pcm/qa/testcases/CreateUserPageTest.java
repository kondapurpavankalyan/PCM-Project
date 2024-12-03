package com.pcm.qa.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pcm.qa.base.TestBase;
import com.pcm.qa.pages.CreateUserPage;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class CreateUserPageTest extends TestBase {

	CreateUserPage CUP;
	CreateUserPageTest CUPT;

	public ExtentTest Parent13;
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
	public ExtentTest child21;
	public ExtentTest child22;
	public ExtentTest child23;
	public ExtentTest child24;
	public ExtentTest child25;

	public CreateUserPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {

		CUP = new CreateUserPage();
		CUPT = new CreateUserPageTest();
	}

	@BeforeTest
	public void setup() throws Exception {

		Extentreport();
		initialization();

	}

	@Test(priority = 1, enabled = true)
	public void ParentNodeCreation() throws Exception {

		_test_logger6 = _extent_report.startTest("Access Management");
		Parent13 = _extent_report.startTest("CreateUser");

	}

	@Test(priority = 2, enabled = true, description = "Verifying Access management Page Title")
	public void verifyAccessmanagementPageTitle() throws Exception {

		child1 = _extent_report.startTest("Verifying Access Management Page Title");

		try {
			Thread.sleep(2000);
			String title = CUP.verifyAccessManagementpagetitle();
			System.out.println(title);
			if (title.equals("Home / Access Management")) {
				child1.log(LogStatus.PASS,
						"Validation successful because we are getting  User Page  title as '" + title + "'");
			} else {
				child1.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting User Page title as '" + title
						+ "' instead of Home / Access Management");
			}
		}

		catch (Exception e) {
			Thread.sleep(1000);
			child1.log(LogStatus.FAIL, e.fillInStackTrace());

		} finally {
			_extent_report.endTest(child1);
		}

	}

	@Test(priority = 3, enabled = true, description = "Verifying Create User Page Title")
	public void verifyCreateUserPageTitle() throws Exception {

		child2 = _extent_report.startTest("Verifying Create User Page Title");
		child2.assignCategory("Create User");
		Thread.sleep(1000);
		try {

			String title = CUP.CreateUsertitle.getText();
			System.out.println(title);
			if (title.equals("Create User")) {
				child2.log(LogStatus.PASS,
						"Validation successful because we are getting  User Page  title as '" + title + "'");
			} else {
				child2.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting User Page title as '" + title
						+ "' instead of Create User");
			}
		}

		catch (Exception e) {
			Thread.sleep(1000);
			child2.log(LogStatus.FAIL, e.fillInStackTrace());

		} finally {
			_extent_report.endTest(child2);
		}

	}

	@Test(priority = 4, enabled = true, description = "Verifying New User Creation with valid details and Role as Admin")
	public void verifyCreateUserPageAdminwithvalidData() throws Throwable {

		child3 = _extent_report.startTest("Verifying New User Creation with valid details and Role as Admin");
		child3.assignCategory("Create User");
		Thread.sleep(2000);
		try {
			Thread.sleep(2000);
			CUP.verifyAdminwithvalidData();
			String title = CUP.Actionmsg.getText();
			System.out.println(title);
			Thread.sleep(3000);
			if (title.equals("User created successfully")) {
				child3.log(LogStatus.PASS, "Validation successful because we are getting Message as  '" + title
						+ "' when we create New User with valid data and Role as Admin");
			} else {
				child3.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Message as '" + title
						+ "'  when we create New User with valid data and Role as Admin");

			}
		}

		catch (Exception e) {
			Thread.sleep(1000);
			child3.log(LogStatus.FAIL, e.fillInStackTrace());
			String title4 = CUP.Error1.getText();
			child3.log(LogStatus.INFO, title4);
		}

		finally {
			_extent_report.endTest(child3);
		}
	}

	@Test(priority = 5, enabled = true, description = "Verifying New User Creation with valid details and Role as BusinessUser")
	public void verifyCreateUserPagewithvalidData() throws Throwable {

		child4 = _extent_report.startTest("Verifying New User Creation with valid details and Role as BusinessUser");
		child4.assignCategory("Create User");
		try {
			CUP.verifyUserwithvalidData();
			String title = CUP.Actionmsg.getText();
			Thread.sleep(3000);
			if (title.equals("User created successfully")) {
				child4.log(LogStatus.PASS, "Validation successful because we are getting Message as  '" + title
						+ "' when we create New User with valid data and Role as BusinessUser");
			} else {
				child4.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Message as '" + title
						+ "'  when we create New User with valid data and Role as BusinessUser");

			}
		}

		catch (Exception e) {
			Thread.sleep(1000);
			child4.log(LogStatus.FAIL, e.fillInStackTrace());
			String title4 = CUP.Error1.getText();
			child4.log(LogStatus.INFO, title4);
		}

		finally {
			_extent_report.endTest(child4);
		}

	}

	@Test(priority = 6, enabled = true, description = "Verifying New User Creation with valid details and Role as OnBoarder")
	public void verifyCreateUserPageforOnBoarderwithvalidData() throws Throwable {

		child5 = _extent_report.startTest("Verifying New User Creation with valid details and Role as OnBoarder");
		child5.assignCategory("Create User");
		try {
			CUP.verifyOnboardwithvalidData();
			String title = CUP.Actionmsg.getText();
			Thread.sleep(3000);
			if (title.equals("User created successfully")) {
				child5.log(LogStatus.PASS, "Validation successful because we are getting Message as  '" + title
						+ "' when we create New User with valid data and Role as OnBoarder");
			} else {
				child5.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Message as '" + title
						+ "'  when we create New User with valid data and Role as OnBoarder");

			}
		}

		catch (Exception e) {
			Thread.sleep(1000);
			child5.log(LogStatus.FAIL, e.fillInStackTrace());
			String title4 = CUP.Error1.getText();
			child5.log(LogStatus.INFO, title4);
		}

		finally {
			_extent_report.endTest(child5);
		}

	}

	@Test(priority = 7, enabled = true, description = "Verifying New User Creation with valid details and Role as Business Admin")
	public void verifyCreateUserPageforBusinessAdminwithvalidData() throws Throwable {

		child6 = _extent_report.startTest("Verifying New User Creation with valid details and Role as Business Admin");
		child6.assignCategory("Create User");
		try {
			CUP.verifyBusinessAdminwithvalidData();
			String title = CUP.Actionmsg.getText();
			Thread.sleep(3000);
			if (title.equals("User created successfully")) {
				child6.log(LogStatus.PASS, "Validation successful because we are getting Message as  '" + title
						+ "' when we create New User with valid data and Role as Business Admin");
			} else {
				child6.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Message as '" + title
						+ "'  when we create New User with valid data and Role as Business Admin");

			}
		}

		catch (Exception e) {
			Thread.sleep(1000);
			child6.log(LogStatus.FAIL, e.fillInStackTrace());
			String title4 = CUP.Error1.getText();
			child6.log(LogStatus.INFO, title4);
		}

		finally {
			_extent_report.endTest(child6);
		}

	}

	@Test(priority = 8, enabled = true, description = "Verifying New User Creation with valid details and Role as DataProcessor")
	public void verifyCreateUserPageforDataProcessorwithvalidData() throws Throwable {

		child7 = _extent_report.startTest("Verifying New User Creation with valid details and Role as DataProcessor");
		child7.assignCategory("Create User");
		try {
			CUP.verifyDataProcessorwithvalidData();
			String title = CUP.Actionmsg.getText();
			Thread.sleep(3000);
			if (title.equals("User created successfully")) {
				child7.log(LogStatus.PASS, "Validation successful because we are getting Message as  '" + title
						+ "' when we create New User with valid data and Role as DataProcessor");
			} else {
				child7.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Message as '" + title
						+ "'  when we create New User with valid data and Role as DataProcessor");

			}
		}

		catch (Exception e) {
			Thread.sleep(1000);
			child7.log(LogStatus.FAIL, e.fillInStackTrace());
			String title4 = CUP.Error1.getText();
			child7.log(LogStatus.INFO, title4);
		}

		finally {
			_extent_report.endTest(child7);
		}

	}

	@Test(priority = 9, enabled = true, description = "Verifying New User Creation with valid details and Role as DataProcessor Restricted")
	public void verifyCreateUserPageforDataProcessorRestrictedwithvalidData() throws Throwable {

		child8 = _extent_report
				.startTest("Verifying New User Creation with valid details and Role as DataProcessor Restricted");
		child8.assignCategory("Create User");
		try {
			CUP.verifyDataProcessorReswithvalidData();
			String title = CUP.Actionmsg.getText();
			Thread.sleep(3000);
			if (title.equals("User created successfully")) {
				child8.log(LogStatus.PASS, "Validation successful because we are getting Message as  '" + title
						+ "' when we create New User with valid data and Role as DataProcessor Restricted");
			} else {
				child8.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Message as '" + title
						+ "'  when we create New User with valid data and Role as DataProcessor Restricted");

			}
		}

		catch (Exception e) {
			Thread.sleep(1000);
			child8.log(LogStatus.FAIL, e.fillInStackTrace());
			String title4 = CUP.Error1.getText();
			child8.log(LogStatus.INFO, title4);
		}

		finally {
			_extent_report.endTest(child8);
		}

	}

	@Test(priority = 10, enabled = true, description = "Verifying New User Creation with Only Mandatory fields and Role as User")
	public void verifyNewUserPageWithOnlyMandatoryFieldsAndRoleAsUser() throws Throwable {

		child9 = _extent_report
				.startTest("Verifying New User Creation with Only Mandatory fields and Role as BusinessUser");
		child9.assignCategory("Create User");
		try {
			CUP.verifyNewUserwithOnlyMandatoryFieldsAndRoleAsUser();
			String title = CUP.Actionmsg.getText();
			Thread.sleep(3000);
			if (title.equals("User created successfully")) {
				child9.log(LogStatus.PASS, "Validation successful because we are getting Message as  '" + title
						+ "' when we create New User with only mandatory fields and role as BusinessUser ");
			} else {
				child9.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Message as '" + title
						+ "'  when we create New User with only mandatory fields and role as BusinessUser");

			}
		}

		catch (Exception e) {
			Thread.sleep(1000);
			child9.log(LogStatus.FAIL, e.fillInStackTrace());
			String title4 = CUP.Error1.getText();
			child9.log(LogStatus.INFO, title4);
		}

		finally {
			_extent_report.endTest(child9);
		}

	}

	@Test(priority = 11, enabled = true, description = "Verifying New Admin Creation with Only Mandatory fields and Role as Admin")
	public void verifyNewAdminPageWithOnlyMandatoryFieldsAndRoleAsAdmin() throws Throwable {

		child10 = _extent_report.startTest("Verifying New Admin Creation with Only Mandatory fields and Role as Admin");
		child10.assignCategory("Create User");
		try {
			CUP.verifyNewAdminwithOnlyMandatoryFieldsAndRoleAsAdmin();
			String title = CUP.Actionmsg.getText();
			Thread.sleep(3000);
			if (title.equals("User created successfully")) {
				child10.log(LogStatus.PASS, "Validation successful because we are getting Message as  '" + title
						+ "' when we create New Admin with only mandatory fields and role as Admin");
			} else {
				child10.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Message as '" + title
						+ "'  when we create New Admin with only mandatory fields and role as Admin");

			}
		}

		catch (Exception e) {
			Thread.sleep(1000);
			child10.log(LogStatus.FAIL, e.fillInStackTrace());
			String title4 = CUP.Error1.getText();
			child10.log(LogStatus.INFO, title4);
		}

		finally {
			_extent_report.endTest(child10);
		}

	}

	@Test(priority = 12, enabled = true, description = "Verifying New User Page creation without mandatory fields")
	public void verifyCreateUserPagewithoutMandatoryfields() throws InterruptedException {

		child11 = _extent_report.startTest("Verifying New User Page creation without mandatory fields");
		child11.assignCategory("Create User");
		Thread.sleep(2000);
		try {
			CUP.createUserClick.click();
			Thread.sleep(1000);
			CUP.SaveUserInfoClick.click();
			String title = CUP.Error1.getText();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']")).click(); // OK btn
			Thread.sleep(1000);

			if (title.contains("(*) field are required to submit.")) {
				child11.log(LogStatus.PASS, "Validation successful because we are getting Message as  '" + title
						+ "' when we create New User without mandatory fields");
			} else {
				child11.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Message as '" + title
						+ "'  when we create New User without mandatory fields");

			}
		}

		catch (Exception e) {
			Thread.sleep(1000);
			child11.log(LogStatus.FAIL, e.fillInStackTrace());
			String title4 = CUP.Error1.getText();
			child11.log(LogStatus.INFO, title4);

		}

		finally {
			_extent_report.endTest(child11);
		}

	}

	@Test(priority = 13, enabled = true, description = "Verifying New User Page creation with Only Non mandatory fields")
	public void verifyCreateUserPagewithOnlyNonMandatoryfields() throws InterruptedException {

		child12 = _extent_report.startTest("Verifying New User Page creation with Only Non mandatory fields");
		child12.assignCategory("Create User");
		Thread.sleep(2000);
		try {
			Thread.sleep(2000);

			CUP.validateCUPwithOnlyNoNmandatoryfields();
			Thread.sleep(2000);
			String title = CUP.Error1.getText();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']")).click(); // ok btn
			Thread.sleep(1000);
			CUP.CancelClick.click();
			driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']")).click(); // yes cancel it btn
			if (title.contains("(*) field are required to submit.")) {
				child12.log(LogStatus.PASS, "Validation successful because we are getting Message as  '" + title
						+ "' when we create New User with only Non mandatory fields");
			} else {
				child12.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Message as '" + title
						+ "'  when we create New User with only Non mandatory fields");

			}
		}

		catch (Exception e) {
			Thread.sleep(1000);
			child12.log(LogStatus.FAIL, e.fillInStackTrace());
			String title4 = CUP.Error1.getText();
			child12.log(LogStatus.INFO, title4);

		}

		finally {
			_extent_report.endTest(child12);
		}

	}

	@Test(priority = 14, enabled = true, description = "Verifying New User Page creation without UserId")
	public void ValidateCUPwithOUTUserId() throws Throwable {

		child13 = _extent_report.startTest("Verifying New User Page creation without UserId");
		child13.assignCategory("Create User");
		Thread.sleep(2000);
		try {
			CUP.CreateUserwithoutUserID();
			Thread.sleep(2000);
			String title = CUP.Error1.getText();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']")).click();
			Thread.sleep(1000);
			CUP.CancelClick.click();
			driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']")).click();
			if (title.contains("(*) field are required to submit.")) {
				child13.log(LogStatus.PASS, "Validation successful because we are getting Message as  '" + title
						+ "' when we create New User Page creation without UserId");
			} else {
				child13.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Message as '" + title
						+ "'  when we create New New User Page creation without UserId");

			}
		}

		catch (Exception e) {
			Thread.sleep(1000);
			child13.log(LogStatus.FAIL, e.fillInStackTrace());
			String title4 = CUP.Error1.getText();
			child13.log(LogStatus.INFO, title4);

		}

		finally {
			_extent_report.endTest(child13);
		}

	}

	@Test(priority = 15, enabled = true, description = "Veriying New User Page creation without FirstName")
	public void ValidateCUPwithoutFirstName() throws Throwable {

		child14 = _extent_report.startTest("Verifying New User Page creation without FirstName");
		child14.assignCategory("Create User");
		Thread.sleep(2000);
		try {

			CUP.CreateUserwithoutFirstName();
			Thread.sleep(2000);
			String title = CUP.Error1.getText();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']")).click();
			Thread.sleep(1000);
			CUP.CancelClick.click();
			driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']")).click();
			if (title.contains("(*) field are required to submit.")) {
				child14.log(LogStatus.PASS, "Validation successful because we are getting Message as  '" + title
						+ "' when we create New User Page creation without FirstName");
			} else {
				child14.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Message as '" + title
						+ "'  when we create New User Page creation without FirstName");

			}
		}

		catch (Exception e) {
			Thread.sleep(1000);
			child14.log(LogStatus.FAIL, e.fillInStackTrace());
			String title4 = CUP.Error1.getText();
			child14.log(LogStatus.INFO, title4);

		}

		finally {
			_extent_report.endTest(child14);
		}

	}

	@Test(priority = 16, enabled = true, description = "Verifying New User Page creation without LastName")
	public void ValidateCUPwithoutLastName() throws Throwable {

		child15 = _extent_report.startTest("Verifying New User Page creation without LastName");
		child15.assignCategory("Create User");
		Thread.sleep(2000);
		try {

			CUP.CreateUserwithoutLastName();
			Thread.sleep(2000);
			String title = CUP.Error1.getText();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']")).click();
			Thread.sleep(1000);
			CUP.CancelClick.click();
			driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']")).click();
			if (title.contains("(*) field are required to submit.")) {
				child15.log(LogStatus.PASS, "Validation successful because we are getting Message as  '" + title
						+ "' when we create New User Page creation without LastName");
			} else {
				child15.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Message as '" + title
						+ "'  when we create New User Page creation without LastName");

			}
		}

		catch (Exception e) {
			Thread.sleep(1000);
			child15.log(LogStatus.FAIL, e.fillInStackTrace());
			String title4 = CUP.Error1.getText();
			child15.log(LogStatus.INFO, title4);

		}

		finally {
			_extent_report.endTest(child15);
		}

	}

	@Test(priority = 17, enabled = true, description = "Verifying New User Page creation without Email")
	public void ValidateCUPwithoutEmail() throws Throwable {

		child16 = _extent_report.startTest("Verifying New User Page creation without  Email");
		child16.assignCategory("Create User");
		Thread.sleep(2000);
		try {
			Thread.sleep(3000);
			CUP.CreateUserwithoutEmail();
			Thread.sleep(2000);
			String title = CUP.Error1.getText();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']")).click();
			Thread.sleep(1000);
			CUP.CancelClick.click();
			driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']")).click();
			if (title.contains("(*) field are required to submit.")) {
				child16.log(LogStatus.PASS, "Validation successful because we are getting Message as  '" + title
						+ "' when we create New User Page creation without  Email");
			} else {
				child16.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Message as '" + title
						+ "'  when we create New User Page creation without  Email");

			}
		}

		catch (Exception e) {
			Thread.sleep(1000);
			child16.log(LogStatus.FAIL, e.fillInStackTrace());
			String title4 = CUP.Error1.getText();
			child16.log(LogStatus.INFO, title4);

		}

		finally {
			_extent_report.endTest(child16);
		}

	}

	@Test(priority = 18, enabled = true, description = "Verifying New User Page creation without ExternalId")
	public void ValidateCUPwithoutExternalId() throws Throwable {

		child17 = _extent_report.startTest("Verifying New User Page creation without  ExternalId");
		child17.assignCategory("Create User");
		Thread.sleep(2000);
		try {

			Thread.sleep(3000);
			CUP.CreateUserwithoutExternalid();
			Thread.sleep(2000);
			String title = CUP.Error1.getText();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']")).click();
			Thread.sleep(1000);
			CUP.CancelClick.click();
			driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']")).click();
			if (title.contains("(*) field are required to submit.")) {
				child17.log(LogStatus.PASS, "Validation successful because we are getting Message as  '" + title
						+ "' when we create New User Page creation without  ExternalId");
			} else {
				child17.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Message as '" + title
						+ "'  when we create New User Page creation without  ExternalId");

			}
		}

		catch (Exception e) {
			Thread.sleep(1000);
			child17.log(LogStatus.FAIL, e.fillInStackTrace());
			String title4 = CUP.Error1.getText();
			child17.log(LogStatus.INFO, title4);

		}

		finally {
			_extent_report.endTest(child17);
		}

	}

	@Test(priority = 19, enabled = true, description = "Verifying New User Page creation with Invalid Email")
	public void ValidateCUPwithInvalidEmail() throws Throwable {

		child18 = _extent_report.startTest("Verifying New User Page creation with Invalid Email");
		child18.assignCategory("Create User");
		Thread.sleep(2000);
		try {

			Thread.sleep(3000);
			CUP.CreateUserwithInvalidEmail();
			Thread.sleep(2000);
			String title = CUP.Error1.getText();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']")).click();
			Thread.sleep(1000);
			CUP.CancelClick.click();
			driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']")).click();
			if (title.contains("(*) field are required to submit.")) {
				child18.log(LogStatus.PASS, "Validation successful because we are getting Message as  '" + title
						+ "' when we create New User Page creation with Invalid Email");
			} else {
				child18.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Message as '" + title
						+ "'  when we create New User Page creation with Invalid Email");

			}
		}

		catch (Exception e) {
			Thread.sleep(1000);
			child18.log(LogStatus.FAIL, e.fillInStackTrace());
			String title4 = CUP.Error1.getText();
			child18.log(LogStatus.INFO, title4);

		}

		finally {
			_extent_report.endTest(child18);
		}

	}

	@Test(priority = 20, enabled = true, description = "Verifying New Admin Page creation without UserId")
	public void ValidateNewAdminCreationwithOUTUserId() throws Throwable {

		child19 = _extent_report.startTest("Verifying New Admin Page creation without UserId");
		child19.assignCategory("Create User");
		Thread.sleep(2000);
		try {

			Thread.sleep(3000);
			CUP.CreateAdminwithoutUserID();
			Thread.sleep(2000);
			String title = CUP.Error1.getText();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']")).click();
			Thread.sleep(1000);
			CUP.CancelClick.click();
			driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']")).click();
			if (title.contains("(*) field are required to submit.")) {
				child19.log(LogStatus.PASS, "Validation successful because we are getting Message as  '" + title
						+ "' when we create New Admin Page creation without UserId");
			} else {
				child19.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Message as '" + title
						+ "'  when we create New Admin Page creation without UserId");

			}
		}

		catch (Exception e) {
			Thread.sleep(1000);
			child19.log(LogStatus.FAIL, e.fillInStackTrace());
			String title4 = CUP.Error1.getText();
			child19.log(LogStatus.INFO, title4);

		}

		finally {
			_extent_report.endTest(child19);
		}

	}

	@Test(priority = 21, enabled = true, description = "Verifying New Admin Page creation without FirstName")
	public void ValidateNewAdminCreationwithoutFirstName() throws Throwable {

		child20 = _extent_report.startTest("Verifying New Admin Page creation without FirstName");
		child20.assignCategory("Create User");
		Thread.sleep(2000);
		try {

			CUP.CreateAdminwithoutFirstName();
			Thread.sleep(2000);
			String title = CUP.Error1.getText();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']")).click();
			Thread.sleep(1000);
			CUP.CancelClick.click();
			driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']")).click();
			if (title.contains("(*) field are required to submit.")) {
				child20.log(LogStatus.PASS, "Validation successful because we are getting Message as  '" + title
						+ "' when we create New Admin Page creation without FirstName");
			} else {
				child20.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Message as '" + title
						+ "'  when we create New Admin Page creation without FirstName");

			}
		}

		catch (Exception e) {
			Thread.sleep(1000);
			child20.log(LogStatus.FAIL, e.fillInStackTrace());
			String title4 = CUP.Error1.getText();
			child20.log(LogStatus.INFO, title4);

		}

		finally {
			_extent_report.endTest(child20);
		}

	}

	@Test(priority = 22, enabled = true, description = "Verifying New Admin Page creation without LastName")
	public void ValidateNewAdminCreationwithoutLastName() throws Throwable {

		child21 = _extent_report.startTest("verifying New Admin Page creation without LastName");
		child21.assignCategory("Create User");
		Thread.sleep(2000);
		try {

			CUP.CreateAdminwithoutLastName();
			Thread.sleep(2000);
			String title = CUP.Error1.getText();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']")).click();
			Thread.sleep(1000);
			CUP.CancelClick.click();
			driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']")).click();
			if (title.contains("(*) field are required to submit.")) {
				child21.log(LogStatus.PASS, "Validation successful because we are getting Message as  '" + title
						+ "' when we create New Admin Page creation without LastName");
			} else {
				child21.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Message as '" + title
						+ "'  when we create New Admin Page creation without LastName");

			}
		}

		catch (Exception e) {
			Thread.sleep(1000);
			child21.log(LogStatus.FAIL, e.fillInStackTrace());
			String title4 = CUP.Error1.getText();
			child21.log(LogStatus.INFO, title4);

		}

		finally {
			_extent_report.endTest(child21);
		}

	}

	@Test(priority = 23, enabled = true, description = "Verifying New Admin Page creation without Email")
	public void ValidateNewAdminCreationwithoutEmail() throws Throwable {

		child22 = _extent_report.startTest("Verifying New Admin Page creation without Email");
		child22.assignCategory("Create User");
		Thread.sleep(2000);
		try {

			Thread.sleep(3000);
			CUP.CreateAdminwithoutEmail();
			Thread.sleep(2000);
			String title = CUP.Error1.getText();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']")).click();
			Thread.sleep(1000);
			CUP.CancelClick.click();
			driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']")).click();
			if (title.contains("(*) field are required to submit.")) {
				child22.log(LogStatus.PASS, "Validation successful because we are getting Message as  '" + title
						+ "' when we create New Admin Page creation without Email");
			} else {
				child22.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Message as '" + title
						+ "'  when we create New Admin Page creation without Email");

			}
		}

		catch (Exception e) {
			Thread.sleep(1000);
			child22.log(LogStatus.FAIL, e.fillInStackTrace());
			String title4 = CUP.Error1.getText();
			child22.log(LogStatus.INFO, title4);

		}

		finally {
			_extent_report.endTest(child22);
		}

	}

	@Test(priority = 24, enabled = true, description = "Verifying New Admin Page creation with Invalid Email")
	public void ValidateNewAdminCreationwithInvalidEmail() throws Throwable {

		child23 = _extent_report.startTest("Verifying New Admin Page creation with Invalid  Email");
		child23.assignCategory("Create User");
		Thread.sleep(2000);
		try {

			Thread.sleep(3000);
			CUP.CreateNewAdminwithInvalidEmail();
			Thread.sleep(2000);
			String title = CUP.Error1.getText();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']")).click();
			Thread.sleep(1000);
			CUP.CancelClick.click();
			driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']")).click();
			if (title.contains("(*) field are required to submit.")) {
				child23.log(LogStatus.PASS, "Validation successful because we are getting Message as  '" + title
						+ "' when we create New Admin Page creation with Invalid  Email");
			} else {
				child23.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Message as '" + title
						+ "' when we create New Admin Page creation with Invalid  Email");

			}
		}

		catch (Exception e) {
			Thread.sleep(1000);
			child23.log(LogStatus.FAIL, e.fillInStackTrace());
			String title4 = CUP.Error1.getText();
			child23.log(LogStatus.INFO, title4);

		}

		finally {
			_extent_report.endTest(child23);
		}

	}

	@Test(priority = 25, enabled = true, description = "Verifying New User Creation with Existing details and Role as User")
	public void verifyCreateUserPagewithExistingData() throws Throwable {

		child24 = _extent_report.startTest("Verifying New User Creation with Existing details and Role as User");
		child24.assignCategory("Create User");

		try {
			CUP.verifyNewUserwithExistingData();
			Thread.sleep(2000);
			String title = CUP.Error1.getText();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']")).click();
			Thread.sleep(1000);
			CUP.CancelClick.click();
			driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']")).click();
			if (title.contains("User already exists.")) {
				child24.log(LogStatus.PASS, "Validation successful because we are getting Message as  '" + title
						+ "' when we create New User Creation with Existing details and Role as User");
			} else {
				child24.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Message as '" + title
						+ "' when we create New User Creation with Existing details and Role as User");

			}
		}

		catch (Exception e) {
			Thread.sleep(1000);
			child24.log(LogStatus.FAIL, e.fillInStackTrace());
			String title4 = CUP.Error1.getText();
			child24.log(LogStatus.INFO, title4);

		}

		finally {
			_extent_report.endTest(child24);
		}

	}

	@Test(priority = 26, enabled = true, description = "Verifying New Admin Creation with Existing details and Role as Admin")
	public void verifyCreateAdminPagewithExistingData() throws Throwable {

		child25 = _extent_report.startTest("Verifying New Admin Creation with Existing details and Role as Admin");
		child25.assignCategory("Create User");

		try {
			CUP.verifyNewAdminwithExistingData();
			Thread.sleep(2000);
			String title = CUP.Error1.getText();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']")).click();
			Thread.sleep(1000);
			CUP.CancelClick.click();
			driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']")).click();
			if (title.contains("User already exists.")) {
				child25.log(LogStatus.PASS, "Validation successful because we are getting Message as  '" + title
						+ "' when we create New Admin Creation with Existing details and Role as Admin");
			} else {
				child25.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Message as '" + title
						+ "' when we create New Admin Creation with Existing details and Role as Admin");

			}
		}

		catch (Exception e) {
			Thread.sleep(1000);
			child25.log(LogStatus.FAIL, e.fillInStackTrace());
			String title4 = CUP.Error1.getText();
			child25.log(LogStatus.INFO, title4);

		}

		finally {
			_extent_report.endTest(child25);
		}

	}

	@AfterTest
	public void tearDown() {

		_test_logger6.appendChild(Parent13);

		Parent13.appendChild(child1).appendChild(child2).appendChild(child3).appendChild(child4).appendChild(child5)
				.appendChild(child6).appendChild(child7).appendChild(child8).appendChild(child9).appendChild(child10)
				.appendChild(child11).appendChild(child12).appendChild(child13).appendChild(child14)
				.appendChild(child15).appendChild(child16).appendChild(child17).appendChild(child18)
				.appendChild(child19).appendChild(child20).appendChild(child21).appendChild(child22)
				.appendChild(child23).appendChild(child24).appendChild(child25);

		_extent_report.endTest(Parent13);

	//	_extent_report.endTest(_test_logger6);

		_extent_report.flush();

	}

}
