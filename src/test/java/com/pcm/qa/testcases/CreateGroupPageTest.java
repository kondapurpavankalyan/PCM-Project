package com.pcm.qa.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pcm.qa.base.TestBase;
import com.pcm.qa.pages.CreateGroupPage;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class CreateGroupPageTest extends TestBase {

	CreateGroupPage CGP;
	CreateGroupPageTest CGPT;

	public CreateGroupPageTest() {
		super();
	}

	public ExtentTest Parent15;
	public ExtentTest child1;
	public ExtentTest child2;
	public ExtentTest child3;
	public ExtentTest child4;
	public ExtentTest child5;
	public ExtentTest child6;
	public ExtentTest child7;
	public ExtentTest child8;

	@BeforeMethod
	public void setUp() {

		CGP = new CreateGroupPage();
		CGPT = new CreateGroupPageTest();

	}

	@BeforeTest(enabled = false)
	public void setup() throws Exception {

		Extentreport();
		initialization();
	}

	@Test(priority = 1, enabled = true)
	public void ParentNodeCreation() {

	//	_test_logger6 = _extent_report.startTest("Access Management");
		Parent15 = _extent_report.startTest("Create Group");

	}

	@Test(priority = 2, enabled = true, description = "Verifying Create Group Page Title")
	public void verificationOfCreateGroupPageTitle() throws InterruptedException {

		child1 = _extent_report.startTest("Verifying Create Group Page Title");
		child1.assignCategory("Create Group");
		Thread.sleep(1000);

		try {
			Thread.sleep(2000);

			CGP.CreateGroupPageTitleVerification();
			String title = CGP.CreateGrouptitle.getText();
			System.out.println(title);

			if (title.equals("Create Group")) {
				child1.log(LogStatus.PASS,
						"Validation successful because we are getting Create Group page  title as '" + title + "'");

			} else {
				child1.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Create Group page title as '"
						+ title + "' instead of Create Group");

			}
		}

		catch (Exception e) {
			Thread.sleep(1000);

			child1.log(LogStatus.FAIL, e.fillInStackTrace());

			_extent_report.endTest(child1);
		}

	}

	@Test(priority = 3, enabled = true, description = "Verifying Create Group With Valid Data")
	public void verificationOfCreateGroupWithValidData() throws InterruptedException {

		child2 = _extent_report.startTest("Verifying Create Group With Valid Data");
		child2.assignCategory("Create Group");
		Thread.sleep(2000);
		try {

			CGP.ValidateCreateGroupwithvaliddata();

			String title = CGP.ActionMsg.getText();
			if (title.equals("Group created successfully")) {

				child2.log(LogStatus.PASS, "Validation successful because we are getting Create Group page  title as '"
						+ title + "'When we Create Group With Valid Data");
			} else {
				child2.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Create Group page title as '"
						+ title + "'When we Create Group With Valid Data");

			}
		}

		catch (Exception e) {
			Thread.sleep(1000);

			child2.log(LogStatus.FAIL, e.fillInStackTrace());

			_extent_report.endTest(child2);
		}

	}

	@Test(priority = 4, enabled = true, description = "Verifying Create Group With Mandatory Field")
	public void verificationOfCreateGroupWithMandatoryField() throws InterruptedException {

		child3 = _extent_report.startTest("Verifying Create Group With Mandatory Field");
		child3.assignCategory("Create Group");
		Thread.sleep(1000);
		try {
			Thread.sleep(2000);
			CGP.createGroupClick.click();
			Thread.sleep(2000);
			CGP.ValidateCreateGroupwithOnlyMandatoryField();
			Thread.sleep(2000);
			String title = CGP.ActionMsg.getText();
			if (title.contains("Group created successfully")) {
				child3.log(LogStatus.PASS, "Validation successful because we are getting Create Group page  title as '"
						+ title + "'When we Create Group With Mandatory");
			} else {
				child3.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Create Group page title as '"
						+ title + "'When we Create Group With Mandatory");

			}
		}

		catch (Exception e) {
			Thread.sleep(1000);

			child3.log(LogStatus.FAIL, e.fillInStackTrace());

			_extent_report.endTest(child3);
		}

	}

	@Test(priority = 5, enabled = true, description = "Verifying Create Group Without Mandatory Field")
	public void verificationOfCreateGroupWithOutMandatoryField() throws InterruptedException {

		child4 = _extent_report.startTest("Verifying Create Group Without Mandatory Field");
		child4.assignCategory("Create Group");
		Thread.sleep(1000);
		try {

			Thread.sleep(2000);
			CGP.createGroupClick.click();
			Thread.sleep(2000);
			CGP.ValidateCreateGroupwithOutOnlyMandatoryField();
			Thread.sleep(2000);
			String title = CGP.Errormsg.getText();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']")).click();
			Thread.sleep(1000);
			if (title.contains("(*) field are required to submit.")) {
				child4.log(LogStatus.PASS, "Validation successful because we are getting Create Group page  title as '"
						+ title + "'When we Create Group Without Mandatory");
			} else {
				child4.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Create Group page title as '"
						+ title + "'When we Create Group Without Mandatory");

			}
		}

		catch (Exception e) {
			Thread.sleep(1000);

			child4.log(LogStatus.FAIL, e.fillInStackTrace());

			_extent_report.endTest(child4);
		}

	}

	@Test(priority = 6, enabled = true, description = "Verifying Create Group With Invalid Or ExistingData")
	public void verificationOfCreateGroupWithInvalidOrExistingData() throws InterruptedException {

		child5 = _extent_report.startTest("Verifying Create Group With Invalid Or ExistingData");
		child5.assignCategory("Create Group");
		Thread.sleep(10000);
		try {
			Thread.sleep(2000);
			CGP.createGroupClick.click();
			Thread.sleep(1000);
			CGP.ValidateCreateGroupwithInvalidOrExistingData();
			Thread.sleep(1000);
			String title = CGP.Errormsg.getText();
			driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']")).click();
			Thread.sleep(1000);
			if (title.contains("Group already exists.")) {
				child5.log(LogStatus.PASS, "Validation successful because we are getting Create Group page  title as '"
						+ title + "'When we Create Group With Invalid Or ExistingData");
			} else {
				child5.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Create Group page title as '"
						+ title + "'When we Create Group With Invalid Or ExistingData");

			}
		}

		catch (Exception e) {
			Thread.sleep(1000);

			child5.log(LogStatus.FAIL, e.fillInStackTrace());

			_extent_report.endTest(child5);
		}

	}

	@Test(priority = 7, enabled = true, description = "Verifying Create Group With Cancel Button")
	public void verificationOfCreateGroupWithCancleButton() throws InterruptedException {

		child6 = _extent_report.startTest("Verifying Create Group With Cancel Button");
		child6.assignCategory("Create Group");
		Thread.sleep(10000);
		try {
			CGP.createGroupClick.click();
			Thread.sleep(1000);
			CGP.ValidateCreateGroupwithCancelButton();
			Thread.sleep(1000);
			// driver.findElement(By.xpath("//button[@class='swal2-confirm
			// swal2-styled']")).click();
			String title = CGP.SearchGrouptitle.getText();
			if (title.contains("Search Group")) {
				child6.log(LogStatus.PASS, "Validation successful because we are getting Create Group page  title as '"
						+ title + "'When we Create Group With Cancel Button");
			} else {
				child6.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Create Group page title as '"
						+ title + "'When we Create Group With cancel Button");

			}
		}

		catch (Exception e) {
			Thread.sleep(1000);

			child6.log(LogStatus.FAIL, e.fillInStackTrace());

			String title4 = CGP.Errormsg.getText();
			child6.log(LogStatus.INFO, title4);

			_extent_report.endTest(child6);
		}

	}

	@Test(priority = 8, enabled = true, description = "Verifying Create Group With Filter1 Search")
	public void verificationOfCreateGroupWithFilter1Search() throws InterruptedException {

		child7 = _extent_report.startTest("Verifying Create Group With Filter1 Search");
		child7.assignCategory("Create Group");
		Thread.sleep(5000);
		try {

			CGP.ValidateCreateGroupWithFilter1Search();
			Thread.sleep(1000);
			String title = CGP.ActionMsg.getText();
			if (title.contains("Group created successfully")) {
				child7.log(LogStatus.PASS, "Validation successful because we are getting Create Group page  title as '"
						+ title + "'When we Create Group With Filter1 Search");
			} else {
				child7.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Create Group page title as '"
						+ title + "'When we Create Group With Filter1 Search");

			}
		}

		catch (Exception e) {
			Thread.sleep(1000);

			child7.log(LogStatus.FAIL, e.fillInStackTrace());
			String title4 = CGP.Errormsg.getText();
			child7.log(LogStatus.INFO, title4);

			_extent_report.endTest(child7);
		}

	}

	@Test(priority = 9, enabled = true, description = "Verifying Create Group With Filter2 Search")
	public void verificationOfCreateGroupWithFilter2Search() throws InterruptedException {

		child8 = _extent_report.startTest("Verifying Create Group With Filter2 Search");
		child8.assignCategory("Create Group");
		Thread.sleep(5000);
		try {

			CGP.ValidateCreateGroupWithFilter2Search();
			Thread.sleep(1000);
			String title = CGP.ActionMsg.getText();
			if (title.contains("Group created successfully")) {
				child8.log(LogStatus.PASS, "Validation successful because we are getting Create Group page  title as '"
						+ title + "'When we Create Group With Filter2 Search");
			} else {
				child8.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Create Group page title as '"
						+ title + "'When we Create Group With Filter2 Search");

			}
			Thread.sleep(1000);
			CGP.createGroupClick.click();
			Thread.sleep(2000);
		}

		catch (Exception e) {
			Thread.sleep(1000);

			child8.log(LogStatus.FAIL, e.fillInStackTrace());

			String title4 = CGP.Errormsg.getText();

			child8.log(LogStatus.INFO, title4);

			_extent_report.endTest(child8);
		}

	}

	@AfterTest
	public void tearDown() {

		_test_logger6.appendChild(Parent15);

		Parent15.appendChild(child1).appendChild(child2).appendChild(child3).appendChild(child4).appendChild(child5)
				.appendChild(child6).appendChild(child7).appendChild(child8);

		_extent_report.endTest(Parent15);
		_extent_report.endTest(_test_logger6);
		_extent_report.flush();

	}

}
