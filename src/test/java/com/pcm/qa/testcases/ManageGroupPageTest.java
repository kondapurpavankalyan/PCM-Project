package com.pcm.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pcm.qa.base.TestBase;
import com.pcm.qa.pages.ManageGroupPage;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ManageGroupPageTest extends TestBase {

	ManageGroupPage MGP;
	ManageGroupPageTest MGPT;

	public ManageGroupPageTest() {
		super();

	}

	public ExtentTest Parent16;
	public ExtentTest child1;
	public ExtentTest child2;
	public ExtentTest child3;
	public ExtentTest child4;
	public ExtentTest child5;
	public ExtentTest child6;
	public ExtentTest child7;
	public ExtentTest child9;
	public ExtentTest child8;
	

	@BeforeMethod
	public void setUp() {

		MGP = new ManageGroupPage();
		MGPT = new ManageGroupPageTest();

	}

	@BeforeTest(enabled = false)
	public void setup() throws Exception {

		Extentreport();
		initialization();
	}

	@Test(priority = 1, enabled = true)
	public void ParentNodeCreation() {

//		_test_logger6 = _extent_report.startTest("Access Management");
		Parent16 = _extent_report.startTest("Manage Group");

	}

	
	@Test(priority = 2, enabled = true, description = "Verifying Manage Group Page Title Verification")
	public void validationOfManageGroupPageTitle() throws InterruptedException {

		child1 = _extent_report.startTest("Verifying Manage Group Page Title Verification");
		child1.assignCategory("Manage Group");

		try {
			Thread.sleep(2000);
		
		 MGP.validateManageGroupPageTitle();
			String title = MGP.ManageGrouptitle.getText();
			if (title.equals("Search Group")) {
				child1.log(LogStatus.PASS,
						"Validation successful because we are getting Manage Group Page title  as '" + title + "'");
			} else {
				child1.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Manage Group Page title as '"
						+ title + "' instead of Search Group");
			}
		}

		catch (Exception e) {
			Thread.sleep(1000);

			child1.log(LogStatus.FAIL, e.fillInStackTrace());

			_extent_report.endTest(child1);
		}

	}

	@Test(priority = 3, enabled = true, description = " Verifying Manage Group Page search with valid data")
	public void ValidationOfManageGroupPageWithValidData() throws InterruptedException {

		child2 = _extent_report.startTest("Verifying Manage Group Page search with valid data");
		child2.assignCategory("Manage Group");

		try {
			MGP.ValidateManageGroupPagewithValidData();
			Boolean flag = MGP.ActionIconClick.isDisplayed();
			String title = flag.toString();
			System.out.println(title);
			if (title.contains("true")) {
				child2.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we search with valid data");
			} else {
				child2.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Message as '" + title
						+ "' when we search with valid data");

			}
		}

		catch (Exception e) {
			Thread.sleep(1000);

			child2.log(LogStatus.FAIL, e.fillInStackTrace());

			_extent_report.endTest(child2);
		}
	}

	@Test(priority = 4, enabled = true, description = "Verifying Manage Group Page search with valid data And Edit Group with Move select")
	public void ValidationOfManageGroupPageWithValidDataAndEditGroupWithMoveselect() throws InterruptedException {

		child3 = _extent_report
				.startTest("Verifying Manage Group Page search with valid data And Edit Group with Move select");
		child3.assignCategory("Manage Group");

		try {
			Thread.sleep(2000);
			MGP.ResetSearchClick.click();
			Thread.sleep(1000);
			MGP.ValidateManageGroupPagewithValidDataAndEditGroupWithMoveselect();
			String title = MGP.ActionMsg.getText();
			if (title.contains("Group updated successfully")) {
				child3.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we search with valid data and Edit Group with Move select");
			} else {
				child3.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Message as '" + title
						+ "' when we search with valid data and Edit Group with Move select");

			}
		}

		catch (Exception e) {
			Thread.sleep(1000);

			child3.log(LogStatus.FAIL, e.fillInStackTrace());

			_extent_report.endTest(child3);
		}
	}

	@Test(priority = 5, enabled = true, description = "Verifying Manage Group Page search with valid data And Edit Group with Remove select")
	public void ValidationOfManageGroupPageWithValidDataAndEditGroupWithRemoveselect() throws InterruptedException {

		child4 = _extent_report
				.startTest("Verifying Manage Group Page search with valid data And Edit Group with Remove select");
		child4.assignCategory("Manage Group");

		try {
			Thread.sleep(2000);
			MGP.ResetSearchClick.click();
			Thread.sleep(1000);
			MGP.ValidateManageGroupPagewithValidDataAndEditGroupWithRemoveselect();
			String title = MGP.ActionMsg.getText();
			driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']")).click();
			Thread.sleep(1000);
			if (title.contains("Please provide at least one Partner to create/update the group.")) {
				child4.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we search with valid data and Edit Group with Remove select");
			} else {
				child4.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Message as '" + title
						+ "' when we search with valid data and Edit Group with Remove select");

			}
			
			
		}

		catch (Exception e) {
			Thread.sleep(1000);

			child4.log(LogStatus.FAIL, e.fillInStackTrace());

			_extent_report.endTest(child4);
		}
	}

	@Test(priority = 6, enabled = true, description = "Verifying Manage Group Page search with valid data And Delete Group")
	public void ValidationOfManageGroupPageWithValidDataAndDeleteGroup() throws InterruptedException {

		child5 = _extent_report.startTest("Verifying Manage Group Page search with valid data And Delete Group");
		child5.assignCategory("Manage Group");

		try {
			Thread.sleep(2000);
			MGP.CancelButtonclick.click();
			Thread.sleep(1000);
			MGP.yescancelitButton.click();
			Thread.sleep(1000);
			MGP.ValidateManageGroupPagewithValidDataAndDeleteGroup();
			String title = MGP.ActionMsg.getText();
			if (title.contains("Group deleted successfully")) {
				child5.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we search with valid data and Delete Group");
			} else {
				child5.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Message as '" + title
						+ "' when we search with valid data and Delete Group");

			}
		}

		catch (Exception e) {
			Thread.sleep(1000);

			child5.log(LogStatus.FAIL, e.fillInStackTrace());

			_extent_report.endTest(child5);
		}
	}

	@Test(priority = 7, enabled = true, description = "Verifying Manage Group Page search with invalid data")
	public void ValidationOfManageGroupPageWithInvalidData() throws InterruptedException {

		child6 = _extent_report.startTest("Verifying Manage Group Page search with invalid data");
		child6.assignCategory("Manage Group");

		try {
			Thread.sleep(2000);
			MGP.ResetSearchClick.click();
			Thread.sleep(1000);
			MGP.ValidateManageGroupPageWithInvalidData();
			String title = MGP.ErrorMsg.getText();
			System.out.println(title);
			if (title.equals("No results found !")) {
				child6.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we search with invalid data");
			} else {
				child6.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Message as '" + title
						+ "' when we search with invalid data");

			}
		} catch (WebDriverException e) {

			child6.log(LogStatus.FAIL, e.fillInStackTrace());

			_extent_report.endTest(child6);
		}

	}

	@Test(priority = 8, enabled = true, description = "Verifying Manage Group Page with Reset Search")
	public void ValidationOfManageGroupPageWithResetSearch() throws InterruptedException {

		child7 = _extent_report.startTest("Verifying Manage Group Page with Reset Search");
		child7.assignCategory("Manage Group");

		try {
			Thread.sleep(2000);
			MGP.ResetSearchClick.click();
			Thread.sleep(1000);
			MGP.ValidateManageGroupPagewithResetSearch();
			Thread.sleep(2000);
			String title = MGP.ManageGrouptitle.getText();

			if (title.equals("Search Group")) {
				child7.log(LogStatus.PASS,
						"Validation successful because we are getting Message as '" + title + "' when we Reset Search");
			} else {
				child7.log(LogStatus.FAIL, "Validation unsuccessful because we are getting Message as '" + title
						+ "' when we Reset Search");

			}
		}

		catch (Exception e) {
			Thread.sleep(1000);

			child7.log(LogStatus.FAIL, e.fillInStackTrace());

			_extent_report.endTest(child7);
		}

	}


	@Test(priority = 9, enabled = true, description = "Verifying Manage Group Page with Cancel Button")
	public void ValidationOfManageGroupPageWithCancelButton() throws InterruptedException {

		child8 = _extent_report.startTest("Verifying Manage Group Page with Cancel Button");
		child8.assignCategory("Manage Group");

		try {
			Thread.sleep(2000);
			MGP.ResetSearchClick.click();
			Thread.sleep(1000);
			MGP.ValidateManageGroupPagewithcancelButton();
			Thread.sleep(2000);
			String title = MGP.Actionmsg1.getText();

			if (title.equals("Search Group")) {
				child8.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we with Cancel Button");
			} else {
				child8.log(LogStatus.FAIL, "Validation unsuccessful because we are getting Message as '" + title
						+ "' when we with Cancel Button");

			}
			
		}

		catch (Exception e) {
			Thread.sleep(1000);

			child8.log(LogStatus.FAIL, e.fillInStackTrace());

			_extent_report.endTest(child8);
		}

	}

	

	@AfterTest
	public void tearDown() {

		_test_logger6.appendChild(Parent16);

		Parent16.appendChild(child1).appendChild(child2).appendChild(child3).appendChild(child4)
				.appendChild(child5).appendChild(child6).appendChild(child7).appendChild(child8);

		_extent_report.endTest(Parent16);
		_extent_report.endTest(_test_logger6);
		_extent_report.flush();

	}

}
