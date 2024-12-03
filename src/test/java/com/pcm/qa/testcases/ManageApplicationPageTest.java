package com.pcm.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pcm.qa.base.TestBase;
import com.pcm.qa.pages.CreateApplicationPage;
import com.pcm.qa.pages.ManageApplicationPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ManageApplicationPageTest extends TestBase {

	public ManageApplicationPage MAP;
	ManageApplicationPageTest MAPT;
	CreateApplicationPage CPP;

	public ExtentTest Parent12;
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
	public ExtentTest child26;
	public ExtentTest child27;
	public ExtentTest child28;
	public ExtentTest child29;
	public ExtentTest child30;
	public ExtentTest child31;
	public ExtentTest child32;
	public ExtentTest child33;
	public ExtentTest child34;
	public ExtentTest child35;
	public ExtentTest child36;
	public ExtentTest child37;
	public ExtentTest child38;
	public ExtentTest child39;
	public ExtentTest child40;
	public ExtentTest child41;
	public ExtentTest child42;
	public ExtentTest child43;
	public ExtentTest child44;
	public ExtentTest child45;
	public ExtentTest child46;
	public ExtentTest child47;
	public ExtentTest child48;
	public ExtentTest child49;
	public ExtentTest child50;
	public ExtentTest child51;
	public ExtentTest child52;
	public ExtentTest child53;
	public ExtentTest child54;
	public ExtentTest child55;
	public ExtentTest child56;
	public ExtentTest child57;
	public ExtentTest child58;
	public ExtentTest child59;
	public ExtentTest child60;
	public ExtentTest child61;
	public ExtentTest child62;
	public ExtentTest child63;
	public ExtentTest child64;
	public ExtentTest child65;
	public ExtentTest child66;
	public ExtentTest child67;
	public ExtentTest child68;
	public ExtentTest child69;
	public ExtentTest child70;
	public ExtentTest child71;
	public ExtentTest child72;
	public ExtentTest child73;
	public ExtentTest child74;
	public ExtentTest child75;
	public ExtentTest child76;
	public ExtentTest child77;
	public ExtentTest child78;
	public ExtentTest child79;
	public ExtentTest child80;
	public ExtentTest child81;
	public ExtentTest child82;
	public ExtentTest child83;
	public ExtentTest child84;
	public ExtentTest child85;
	public ExtentTest child86;
	public ExtentTest child87;
	public ExtentTest child88;
	public ExtentTest child89;
	public ExtentTest child90;
	public ExtentTest child91;
	public ExtentTest child92;
	public ExtentTest child93;
	public ExtentTest child94;
	public ExtentTest child95;
	public ExtentTest child96;
	public ExtentTest child97;
	public ExtentTest child98;
	public ExtentTest child99;
	public ExtentTest child100;
	public ExtentTest child101;
	public ExtentTest child102;
	public ExtentTest child103;
	public ExtentTest child104;
	public ExtentTest child105;
	public ExtentTest child106;
	public ExtentTest child107;
	public ExtentTest child108;
	public ExtentTest child109;
	public ExtentTest child110;
	public ExtentTest child111;
	public ExtentTest child112;
	public ExtentTest child113;
	public ExtentTest child114;
	public ExtentTest child115;
	public ExtentTest child116;
	public ExtentTest child117;
	public ExtentTest child118;
	public ExtentTest child119;
	public ExtentTest child120;
	public ExtentTest child121;
	public ExtentTest child122;
	public ExtentTest child123;
	public ExtentTest child124;
	public ExtentTest child125;
	public ExtentTest child126;
	public ExtentTest child127;
	public ExtentTest child128;
	public ExtentTest child129;
	public ExtentTest child130;
	public ExtentTest child131;


	public ManageApplicationPageTest() {
		super();
	}

	@BeforeMethod
	public void beforeTest() {

		MAP = new ManageApplicationPage();
		MAPT = new ManageApplicationPageTest();
		CPP = new CreateApplicationPage();
	}

	@BeforeTest(enabled = true)
	public void setup() throws Exception {

		Extentreport();
		initialization();
	}

	@Test(priority = 1, enabled = true) 
	public void ParentNodeCreation() {
		 _test_logger5 = _extent_report.startTest("Application");
		Parent12 = _extent_report.startTest("Manage Application");

	}

	@Test(priority = 2, enabled = true, description = "Verifying Manage Application Page Title")
	public void loginPageTitleTest() throws InterruptedException {
		child1 = _extent_report.startTest("Verifying Manage Application Page Title ");
		child1.assignCategory("Manage Application");
		try {
			Thread.sleep(2000);

			String title = MAP.ValidateManageApplicationPageTitle();
			System.out.println(title);
			if (title.equals("Manage Application / Consumer")) {
				child1.log(LogStatus.PASS,
						"Validation successful because we are getting Manage Application Page title as '" + title
								+ "'");
			} else {
				child1.log(LogStatus.FAIL,
						"Validation  unsuccessful because we are getting Manage Application Page title as '" + title
								+ "'  instead of 'Search Trading Application'");
			}
		} catch (Exception e) {
			child1.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child1);
	}

	@Test(priority = 3, enabled = true, description = "Verifying Manage Application Page With Invalid Data")
	public void MPTestVerificationWithInvalidData() throws Exception {
		child2 = _extent_report.startTest("Verifying Manage Application Page With Invalid Data");
		child2.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.ValidateManageApplicationWithInvalidData();
			Thread.sleep(2000);
			String title = MAP.ErrorMsg.getText();

			if (title.equals("No results found !")) {
				child2.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Invalid Data");
			} else {
				child2.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ "' instead of 'No results found !' ,when we Search with Invalid Data");
			}
		} catch (Exception e) {
			child2.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child2);
	}

	@Test(priority = 4, enabled = true, description = "Verifying Manage Application Page With valid Data")
	public void MPTestVerificationWithvalidData() throws Exception {
		child3 = _extent_report.startTest("Verifying Manage Application Page With valid Data");
		child3.assignCategory("Manage Application");
		try {
			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.ValidateManageApplicationWithvalidData();
			Thread.sleep(2000);
			Boolean flag = MAP.Actionsicon.isDisplayed();
			String title = flag.toString();
			System.out.println(title);
			if (title.contains("true")) {

				child3.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with valid Data");
			} else {
				child3.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ "' instead of 'No Matching Trading Application found' ,when we Search with valid Data");
			}
		} catch (Exception e) {
			child3.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child3);
	}

	@Test(priority = 5, enabled = true, description = "Manage Application Page Search Result Verification with valid data and edit")
	public void ManageApplicationPageTestWithvalidDataEdit() throws Throwable {
		child4 = _extent_report
				.startTest("Manage Application Page Search Result Verification with valid data and edit");
		child4.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.ValidateManageApplicationWithvalidData();
			Thread.sleep(2000);

			MAP.Actionsicon.click();
			Thread.sleep(1000);
			MAP.Editbtn.click();
			Thread.sleep(5000);
			MAP.EditSubmitClick.click();

			String title = MAP.ActionMsg.getText();

			if (title.equalsIgnoreCase("Application updated successfully")) {
				child4.log(LogStatus.PASS,
						"Validation successful because we are getting Manage Application Page title as '" + title
								+ "' ");
			} else {
				child4.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting Manage Application Page title as '" + title
								+ "' ");
			}
		} catch (Exception e) {
			child4.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child4);
	}

	@Test(priority = 6, enabled = true, description = "Manage Application Page Search Result Verification with valid data and Activitylog")
	public void ManageApplicationPageTestWithValidDataActivitylog() throws Throwable {
		child5 = _extent_report
				.startTest("Manage Application Page Search Result Verification with valid data and Activitylog");
		child5.assignCategory("Manage Application");

		try {
			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.ValidateManageApplicationWithvalidData();
			Thread.sleep(2000);
			MAP.ValidateMpRecordWithViewActivity("ApplicationAutomation", 2);
			Thread.sleep(2000);
			child5.log(LogStatus.INFO, MAP.ActivitylogData.toString());
			child5.log(LogStatus.PASS, "Validation successful because we are getting activity history");

			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			Thread.sleep(2000);
		}

		catch (Exception e) {
			child5.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child5);

	}

	@Test(priority = 7, enabled = true, description = "Manage Application Page Search Result Verification with valid data and activate")
	public void ManageApplicationPageTestWithValidDataActivate() throws Throwable {
		child6 = _extent_report
				.startTest("Manage Application Page Search Result Verification with valid data and Activate");
		child6.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.ValidateManageApplicationWithvalidData();
			Thread.sleep(2000);
			MAP.Actionbtn.click();
			Thread.sleep(1000);
			MAP.ActivateClick.click();
			Thread.sleep(1000);
			MAP.yesActivateitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();
			System.out.println(title);
			if (title.equalsIgnoreCase("Status updated successfully")) {
				child6.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title + "' ");
			} else {
				child6.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child6.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child6);
	}

	@Test(priority = 8, enabled = true, description = "Manage Application Page Search Result Verification with valid data and deactivate")
	public void ManageApplicationPageTestWithValidDataDeactivate() throws Throwable {
		child7 = _extent_report
				.startTest("Manage Application Page Search Result Verification with valid data and Deactivate");
		child7.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.ValidateManageApplicationWithvalidData();
			Thread.sleep(2000);
			MAP.Actionbtn.click();
			Thread.sleep(1000);
			MAP.DeactivateClick.click();
			Thread.sleep(1000);
			MAP.yesDeactivateitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();
			System.out.println(title);
			if (title.equalsIgnoreCase("Status updated successfully")) {
				child7.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title + "' ");
			} else {
				child7.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child7.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child7);
	}

	@Test(priority = 9, enabled = true, description = "Verifying Manage Application Page With Only Application Name")
	public void MPTestVerificationWithOnlyApplicationName() throws Exception {
		child8 = _extent_report.startTest("Verifying Manage Application Page With Only Application Name");
		child8.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);

			MAP.validateManageApplicationWithOnlyApplicationName("Applicationautomationtest");
			Thread.sleep(2000);

			Boolean flag = MAP.Actionsicon.isDisplayed();
			String title = flag.toString();
			System.out.println(title);
			if (title.contains("true")) {
				child8.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title + "' ");
			} else {
				child8.log(LogStatus.FAIL,
						"Validation successful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child8.log(LogStatus.FAIL, e.fillInStackTrace());
			String title2 = MAP.ErrorMsg.getText();
			child8.log(LogStatus.INFO, title2);
		}
		_extent_report.endTest(child8);
	}

	@Test(priority = 10, enabled = true, description = "Verifying Manage Application Page With Only Application Name and edit")
	public void MPTestVerificationWithOnlyApplicationNameandEdit() throws Exception {
		child9 = _extent_report.startTest("Verifying Manage Application Page With Only Application Name and edit");
		child9.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);

			MAP.validateManageApplicationWithOnlyApplicationName("Applicationautomationtest");
			Thread.sleep(2000);

			MAP.Actionsicon.click();
			Thread.sleep(1000);
			MAP.Editbtn.click();
			Thread.sleep(5000);
			MAP.EditSubmitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();

			if (title.equalsIgnoreCase("Application updated successfully")) {

				child9.log(LogStatus.PASS,
						"Validation successful because we are getting Applications with Only Application Name and edit");
			} else {
				child9.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting Applications with Only Application Name and edit");
			}
		} catch (Exception e) {
			child9.log(LogStatus.FAIL, e.fillInStackTrace());
			String title2 = MAP.ErrorMsg.getText();
			child9.log(LogStatus.INFO, title2);
		}
		_extent_report.endTest(child9);
	}

	@Test(priority = 11, enabled = true, description = "Manage Application Page Search Result Verification with Application Name and Activitylog")
	public void ManageApplicationPageTestWithApplicationnameandActivitylog() throws Throwable {
		child10 = _extent_report
				.startTest("Manage Application Page Search Result Verification with Application Name and Activitylog");
		child10.assignCategory("Manage Application");

		try {
			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyApplicationName("Applicationautomationtest");
			Thread.sleep(2000);
			MAP.ValidateMpRecordWithViewActivity("Applicationautomationtest", 2);
			Thread.sleep(2000);
			child10.log(LogStatus.INFO, MAP.ActivitylogData.toString());
			child10.log(LogStatus.PASS, "Validation successful because we are getting activity history");

			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			Thread.sleep(2000);
		}

		catch (Exception e) {
			child10.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child10);

	}

	@Test(priority = 12, enabled = true, description = "Manage Application Page Search Result Verification with Applicationname and Activate")

	public void ManageApplicationPageTestWithApplicationnameandActivate() throws Throwable {
		child11 = _extent_report
				.startTest("Manage Application Page Search Result Verification with Applicationname and Activate");
		child11.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyApplicationName("Applicationautomationtest");
			Thread.sleep(2000);
			MAP.Actionbtn.click();
			Thread.sleep(1000);
			MAP.ActivateClick.click();
			Thread.sleep(1000);
			MAP.yesActivateitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();
			System.out.println(title);
			if (title.equalsIgnoreCase("Status updated successfully")) {
				child11.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title + "' ");
			} else {
				child11.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child11.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child11);
	}

	@Test(priority = 13, enabled = true, description = "Manage Application Page Search Result Verification with Applicationname and Deactivate")

	public void ManageApplicationPageTestWithApplicationnameandDeactivate() throws Throwable {
		child12 = _extent_report
				.startTest("Manage Application Page Search Result Verification with Applicationname and Deactivate");
		child12.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyApplicationName("Applicationautomationtest");
			Thread.sleep(2000);
			MAP.Actionbtn.click();
			Thread.sleep(1000);
			MAP.DeactivateClick.click();
			Thread.sleep(1000);
			MAP.yesDeactivateitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();
			System.out.println(title);
			if (title.equalsIgnoreCase("Status updated successfully")) {
				child12.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title + "' ");
			} else {
				child12.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child12.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child12);
	}

	@Test(priority = 14, enabled = true, description = "Verifying Manage Application Page With Only Application ID")
	public void MPTestVerificationWithOnlyApplicationId() throws Exception {
		child13 = _extent_report.startTest("Verifying Manage Application Page With Only Application ID");
		child13.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);

			MAP.validateManageApplicationWithOnlyApplicationId("Applicationautomationtest");
			Thread.sleep(2000);

			Boolean flag = MAP.Actionsicon.isDisplayed();
			String title = flag.toString();
			System.out.println(title);
			if (title.contains("true")) {
				child13.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title + "' ");
			} else {
				child13.log(LogStatus.FAIL,
						"Validation successful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child13.log(LogStatus.FAIL, e.fillInStackTrace());
			String title2 = MAP.ErrorMsg.getText();
			child13.log(LogStatus.INFO, title2);
		}
		_extent_report.endTest(child13);
	}

	@Test(priority = 15, enabled = true, description = "Verifying Manage Application Page With Only Application Id and edit")
	public void MPTestVerificationWithOnlyApplicationIdandEdit() throws Exception {
		child14 = _extent_report.startTest("Verifying Manage Application Page With Only Application Id and edit");
		child14.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);

			MAP.validateManageApplicationWithOnlyApplicationId("Applicationautomationtest");
			Thread.sleep(2000);

			MAP.Actionsicon.click();
			Thread.sleep(1000);
			MAP.Editbtn.click();
			Thread.sleep(5000);
			MAP.EditSubmitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();

			if (title.equalsIgnoreCase("Application updated successfully")) {

				child14.log(LogStatus.PASS,
						"Validation successful because we are getting Applications with Only Application Id and edit");
			} else {
				child14.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting Applications with Only Application Id and edit");
			}
		} catch (Exception e) {
			child14.log(LogStatus.FAIL, e.fillInStackTrace());
			String title2 = MAP.ErrorMsg.getText();
			child14.log(LogStatus.INFO, title2);
		}
		_extent_report.endTest(child14);
	}

	@Test(priority = 16, enabled = true, description = "Manage Application Page Search Result Verification with Application Id and Activitylog")
	public void ManageApplicationPageTestWithApplicationIdandActivitylog() throws Throwable {
		child15 = _extent_report
				.startTest("Manage Application Page Search Result Verification with Application Id and Activitylog");
		child15.assignCategory("Manage Application");

		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyApplicationId("Applicationautomationtest");
			Thread.sleep(2000);
			MAP.ValidateMpRecordWithViewActivity("Applicationautomationtest", 2);
			Thread.sleep(2000);
			child15.log(LogStatus.INFO, MAP.ActivitylogData.toString());
			child15.log(LogStatus.PASS, "Validation successful because we are getting activity history");

			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			Thread.sleep(2000);
		}

		catch (Exception e) {
			child15.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child15);

	}

	@Test(priority = 17, enabled = true, description = "Manage Application Page Search Result Verification with Application Id and Activate")

	public void ManageApplicationPageTestWithApplicationIdandActivate() throws Throwable {
		child16 = _extent_report
				.startTest("Manage Application Page Search Result Verification with Application Id and Activate");
		child16.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyApplicationId("Applicationautomationtest");
			Thread.sleep(2000);
			MAP.Actionbtn.click();
			Thread.sleep(1000);
			MAP.ActivateClick.click();
			Thread.sleep(1000);
			MAP.yesActivateitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();
			System.out.println(title);
			if (title.equalsIgnoreCase("Status updated successfully")) {
				child16.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title + "' ");
			} else {
				child16.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child16.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child16);
	}

	@Test(priority = 18, enabled = true, description = "Manage Application Page Search Result Verification with ApplicationId and Deactivate")

	public void ManageApplicationPageTestWithApplicationIdandDeactivate() throws Throwable {
		child17 = _extent_report
				.startTest("Manage Application Page Search Result Verification with ApplicationId and Deactivate");
		child17.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyApplicationId("Applicationautomationtest");
			Thread.sleep(2000);
			MAP.Actionbtn.click();
			Thread.sleep(1000);
			MAP.DeactivateClick.click();
			Thread.sleep(1000);
			MAP.yesDeactivateitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();
			System.out.println(title);
			if (title.equalsIgnoreCase("Status updated successfully")) {
				child17.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title + "' ");
			} else {
				child17.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child17.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child17);
	}

	@Test(priority = 19, enabled = true, description = "Verifying Manage Application Page With Only Status as Inactive")
	public void

			MPTestVerificationWithOnlyStatusInactive() throws Exception {
		child18 = _extent_report.startTest("Verifying Manage Application Page With Only Status as Inactive");
		child18.assignCategory("Manage Application");

		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);

			MAP.validateManageApplicationWithOnlyStatus("Inactive", "Applicationautomationtest");

			Boolean flag = MAP.Actionsicon.isDisplayed();
			String title = flag.toString();
			System.out.println(title);

			if (title.contains("true")) {
				child18.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Only Status as Inactive");
			} else {
				child18.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ "'  instead of 'Matches Found' ,when we Search with Only Status as Inactive");
			}
		} catch (Exception e) {
			child18.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child18);

	}

	@Test(priority = 20, enabled = true, description = "Verifying Manage Application Page With Only Status as Inactive and edit")
	public void MPTestVerificationWithOnlyStatusasInactiveandEdit() throws Exception {
		child19 = _extent_report.startTest("Verifying Manage Application Page With Only Status as Inactive and edit");
		child19.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);

			MAP.validateManageApplicationWithOnlyStatus("Inactive", "Applicationautomationtest");
			Thread.sleep(2000);

			MAP.Actionsicon.click();
			Thread.sleep(1000);
			MAP.Editbtn.click();
			Thread.sleep(5000);
			MAP.EditSubmitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();

			if (title.equalsIgnoreCase("Application updated successfully")) {

				child19.log(LogStatus.PASS,
						"Validation successful because we are getting Applications with Only Status as Inactive and edit");
			} else {
				child19.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting Applications with Only Status as Inactive and edit");
			}
		} catch (Exception e) {
			child19.log(LogStatus.FAIL, e.fillInStackTrace());
			String title2 = MAP.ErrorMsg.getText();
			child19.log(LogStatus.INFO, title2);
		}
		_extent_report.endTest(child18);
	}

	@Test(priority = 21, enabled = true, description = "Manage Application Page Search Result Verification with Status as Inactive and Activitylog")
	public void ManageApplicationPageTestWithStatusasInactiveandActivitylog() throws Throwable {
		child20 = _extent_report
				.startTest("Manage Application Page Search Result Verification with Status as Inactive and Activitylog");
		child20.assignCategory("Manage Application");

		try {
			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyStatus("Inactive", "Applicationautomationtest");
			Thread.sleep(2000);
			MAP.ValidateMpRecordWithViewActivity("Applicationautomationtest", 2);
			Thread.sleep(2000);
			child20.log(LogStatus.INFO, MAP.ActivitylogData.toString());
			child20.log(LogStatus.PASS, "Validation successful because we are getting activity history");

			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			Thread.sleep(2000);
		}

		catch (Exception e) {
			child20.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child20);

	}

	@Test(priority = 22, enabled = true, description = "Manage Application Page Search Result Verification with Application Id and Activate")
	public void ManageApplicationPageTestWithStatusasInactiveandActivate() throws Throwable {
		child21 = _extent_report
				.startTest("Manage Application Page Search Result Verification with Status as Inactive and Activate");
		child21.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyStatus("Inactive", "Applicationautomationtest");
			Thread.sleep(2000);
			MAP.Actionbtn.click();
			Thread.sleep(1000);
			MAP.ActivateClick.click();
			Thread.sleep(1000);
			MAP.yesActivateitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();
			System.out.println(title);
			if (title.equalsIgnoreCase("Status updated successfully")) {
				child21.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title + "' ");
			} else {
				child21.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child21.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child21);
	}

	@Test(priority = 23, enabled = true, description = "Verifying Manage Application Page With Only Status as Active")
	public void

			MPTestVerificationWithOnlyStatusActive() throws Exception {
		child22 = _extent_report.startTest("Verifying Manage Application Page With Only Status as Active");
		child22.assignCategory("Manage Application");

		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);

			MAP.validateManageApplicationWithOnlyStatus("Active", "Applicationautomationtest");

			Boolean flag = MAP.Actionsicon.isDisplayed();
			String title = flag.toString();
			System.out.println(title);

			if (title.contains("true")) {
				child22.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Only Status as Active");
			} else {
				child22.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ "'  instead of 'Matches Found' ,when we Search with Only Status as Active");
			}
		} catch (Exception e) {
			child22.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child22);

	}

	@Test(priority = 24, enabled = true, description = "Verifying Manage Application Page With Only Status as Active and edit")
	public void MPTestVerificationWithOnlyStatusasActiveandEdit() throws Exception {
		child23 = _extent_report.startTest("Verifying Manage Application Page With Only Status as Active and edit");
		child23.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);

			MAP.validateManageApplicationWithOnlyStatus("Active", "Applicationautomationtest");
			Thread.sleep(2000);

			MAP.Actionsicon.click();
			Thread.sleep(1000);
			MAP.Editbtn.click();
			Thread.sleep(5000);
			MAP.EditSubmitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();

			if (title.equalsIgnoreCase("Application updated successfully")) {

				child23.log(LogStatus.PASS,
						"Validation successful because we are getting Applications with Only Status as Active and edit");
			} else {
				child23.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting Applications with Only Status as Active and edit");
			}
		} catch (Exception e) {
			child23.log(LogStatus.FAIL, e.fillInStackTrace());
			String title2 = MAP.ErrorMsg.getText();
			child23.log(LogStatus.INFO, title2);
		}
		_extent_report.endTest(child23);
	}

	@Test(priority = 25, enabled = true, description = "Manage Application Page Search Result Verification with Status as Active and Activitylog")
	public void ManageApplicationPageTestWithStatusasActiveandActivitylog() throws Throwable {
		child24 = _extent_report
				.startTest("Manage Application Page Search Result Verification with Status as Active and Activitylog");
		child24.assignCategory("Manage Application");

		try {
			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyStatus("Active", "Applicationautomationtest");
			Thread.sleep(2000);
			MAP.ValidateMpRecordWithViewActivity("Applicationautomationtest", 2);
			Thread.sleep(2000);
			child24.log(LogStatus.INFO, MAP.ActivitylogData.toString());
			child24.log(LogStatus.PASS, "Validation successful because we are getting activity history");

			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			Thread.sleep(2000);
		}

		catch (Exception e) {
			child24.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child24);

	}

	@Test(priority = 26, enabled = true, description = "Manage Application Page Search Result Verification with Status as Active and Deactivate")

	public void ManageApplicationPageTestWithStatusasActiveandDeactivate() throws Throwable {
		child25 = _extent_report
				.startTest("Manage Application Page Search Result Verification with Status as Active and Deactivate");
		child25.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyStatus("Active", "Applicationautomationtest");
			Thread.sleep(2000);
			MAP.Actionbtn.click();
			Thread.sleep(1000);
			MAP.DeactivateClick.click();
			Thread.sleep(1000);
			MAP.yesDeactivateitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();
			System.out.println(title);
			if (title.equalsIgnoreCase("Status updated successfully")) {
				child25.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title + "' ");
			} else {
				child25.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child25.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child25);
	}

	@Test(priority = 27, enabled = true, description = "Verifying Manage Application Page With Only Protocol")
	public void MPTestVerificationWithOnlyProtocol() throws Exception {
		child26 = _extent_report.startTest("Verifying Manage Application Page With Only Protocol");
		child26.assignCategory("Manage Application");

		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);

			MAP.validateManageApplicationWithOnlyProtocol("SAP", "Applicationautomationtest");

			Boolean flag = MAP.Actionsicon.isDisplayed();
			String title = flag.toString();
			System.out.println(title);

			if (title.contains("true")) {

				child26.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Only Protocol ");
			} else {
				child26.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ "'  instead of 'Matches Found' ,when we Search with Only Protocol ");
			}
		} catch (Exception e) {
			child26.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child26);

	}

	@Test(priority = 28, enabled = true, description = "Verifying Manage Application Page With Only Protocol and edit")
	public void MPTestVerificationWithOnlyProtocolandEdit() throws Exception {
		child27 = _extent_report.startTest("Verifying Manage Application Page With Only Protocol and edit");
		child27.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);

			MAP.validateManageApplicationWithOnlyProtocol("SAP", "Applicationautomationtest");
			Thread.sleep(2000);

			MAP.Actionsicon.click();
			Thread.sleep(1000);
			MAP.Editbtn.click();
			Thread.sleep(5000);
			MAP.EditSubmitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();

			if (title.equalsIgnoreCase("Application updated successfully")) {

				child27.log(LogStatus.PASS,
						"Validation successful because we are getting Applications with Only Protocol and edit");
			} else {
				child27.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting Applications with Only Protocol and edit");
			}
		} catch (Exception e) {
			child27.log(LogStatus.FAIL, e.fillInStackTrace());
			String title2 = MAP.ErrorMsg.getText();
			child27.log(LogStatus.INFO, title2);
		}
		_extent_report.endTest(child27);
	}

	@Test(priority = 29, enabled = true, description = "Manage Application Page Search Result Verification with Protocol and Activitylog")
	public void ManageApplicationPageTestWithProtocolandActivitylog() throws Throwable {
		child28 = _extent_report
				.startTest("Manage Application Page Search Result Verification with Protocol and Activitylog");
		child28.assignCategory("Manage Application");

		try {
			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("SAP", "Applicationautomationtest");
			Thread.sleep(2000);
			MAP.ValidateMpRecordWithViewActivity("Applicationautomationtest", 2);
			Thread.sleep(2000);
			child28.log(LogStatus.INFO, MAP.ActivitylogData.toString());
			child28.log(LogStatus.PASS, "Validation successful because we are getting activity history");

			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			Thread.sleep(2000);
		}

		catch (Exception e) {
			child28.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child28);

	}

	@Test(priority = 30, enabled = true, description = "Manage Application Page Search Result Verification with Protocol and Activate")

	public void ManageApplicationPageTestWithProtocolandActivate() throws Throwable {
		child29 = _extent_report.startTest("Manage Application Page Search Result Verification with Protocol and Activate");
		child29.assignCategory("Manage Application");
		try {
			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("SAP", "Applicationautomationtest");
			Thread.sleep(2000);
			MAP.Actionbtn.click();
			Thread.sleep(1000);
			MAP.ActivateClick.click();
			Thread.sleep(1000);
			MAP.yesActivateitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();
			System.out.println(title);
			if (title.equalsIgnoreCase("Status updated successfully")) {
				child29.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title + "' ");
			} else {
				child29.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child29.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child29);
	}

	@Test(priority = 31, enabled = true, description = "Manage Application Page Search Result Verification with Protocol and Deactivate")
	public void ManageApplicationPageTestWithProtocolandDeactivate() throws Throwable {
		child30 = _extent_report
				.startTest("Manage Application Page Search Result Verification with Protocol and Deactivate");
		child30.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("SAP", "Applicationautomationtest");
			Thread.sleep(2000);
			MAP.Actionbtn.click();
			Thread.sleep(1000);
			MAP.DeactivateClick.click();
			Thread.sleep(1000);
			MAP.yesDeactivateitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();
			System.out.println(title);
			if (title.equalsIgnoreCase("Status updated successfully")) {
				child30.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title + "' ");
			} else {
				child30.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child30.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child30);
	}

	@Test(priority = 32, enabled = true, description = "Verifying Manage Application Page With Only Application Name,Applicationid,Protocol,Status as Inactive")
	public void MPTestVerificationWithApplicationName_ApplicationId_Protocol_StatusasInactive() throws Exception {
		child31 = _extent_report.startTest(
				"Verifying Manage Application Page With Only Application Name,Applicationid,Protocol,Status as Inactive");
		child31.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);

			MAP.validateManageApplicationWithOnlyApplicationName_Applicationid_protocol_statusasInactive("Applicationautomationtest",
					"Applicationautomationtest", "SAP", "Inactive");
			Thread.sleep(2000);

			Boolean flag = MAP.Actionsicon.isDisplayed();
			String title = flag.toString();
			System.out.println(title);
			if (title.contains("true")) {
				child31.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title + "' ");
			} else {
				child31.log(LogStatus.FAIL,
						"Validation successful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child31.log(LogStatus.FAIL, e.fillInStackTrace());
			String title2 = MAP.ErrorMsg.getText();
			child31.log(LogStatus.INFO, title2);
		}
		_extent_report.endTest(child31);
	}

	@Test(priority = 33, enabled = true, description = "Verifying Manage Application Page With Only Application Name,Applicationid,Protocol,Status as Inactive and edit")
	public void MPTestVerificationWithApplicationName_ApplicationId_Protocol_StatusasInactiveandEdit() throws Exception {
		child32 = _extent_report.startTest(
				"Verifying Manage Application Page With Only Application Name,Applicationid,Protocol,Status as Inactive and edit");
		child32.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);

			MAP.validateManageApplicationWithOnlyApplicationName_Applicationid_protocol_statusasInactive("Applicationautomationtest",
					"Applicationautomationtest", "SAP", "Inactive");
			Thread.sleep(2000);

			MAP.Actionsicon.click();
			Thread.sleep(1000);
			MAP.Editbtn.click();
			Thread.sleep(5000);
			MAP.EditSubmitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();

			if (title.equalsIgnoreCase("Application updated successfully")) {

				child32.log(LogStatus.PASS,
						"Validation successful because we are getting Applications with Verifying Manage Application Page With Only Application Name,Applicationid,Protocol,Status as Inactive and edit");
			} else {
				child32.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting Applications with Verifying Manage Application Page With Only Application Name,Applicationid,Protocol,Status as Inactive and edit");
			}
		} catch (Exception e) {
			child32.log(LogStatus.FAIL, e.fillInStackTrace());
			String title2 = MAP.ErrorMsg.getText();
			child32.log(LogStatus.INFO, title2);
		}
		_extent_report.endTest(child32);
	}

	@Test(priority = 34, enabled = true, description = "Verification with Verifying Manage Application Page With Only Application Name,Applicationid,Protocol,Status as Inactive and Activitylog")
	public void ManageApplicationPageTestWithApplicationName_ApplicationId_Protocol_StatusasInactiveandActivitylog()
			throws Throwable {
		child33 = _extent_report.startTest(
				"Verifying Manage Application Page With Only Application Name,Applicationid,Protocol,Status as Inactive and Activitylog");
		child33.assignCategory("Manage Application");

		try {
			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyApplicationName_Applicationid_protocol_statusasInactive("Applicationautomationtest",
					"Applicationautomationtest", "SAP", "Inactive");
			Thread.sleep(2000);
			MAP.ValidateMpRecordWithViewActivity("Applicationautomationtest", 2);
			Thread.sleep(2000);
			child33.log(LogStatus.INFO, MAP.ActivitylogData.toString());
			child33.log(LogStatus.PASS, "Validation successful because we are getting activity history");

			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			Thread.sleep(2000);
		}

		catch (Exception e) {
			child33.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child33);

	}

	@Test(priority = 35, enabled = true, description = "Verification with Verifying Manage Application Page With Only Application Name,Applicationid,Protocol,Status as Inactive and Activate")
	public void ManageApplicationPageTestWithApplicationName_ApplicationId_Protocol_StatusasInactiveandActivate() throws Throwable {
		child34 = _extent_report.startTest(
				"Verifying Manage Application Page With Only Application Name,Applicationid,Protocol,Status as Inactive and Activate");
		child34.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyApplicationName_Applicationid_protocol_statusasInactive("Applicationautomationtest",
					"Applicationautomationtest", "SAP", "Inactive");
			Thread.sleep(2000);
			MAP.Actionbtn.click();
			Thread.sleep(1000);
			MAP.ActivateClick.click();
			Thread.sleep(1000);
			MAP.yesActivateitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();
			System.out.println(title);
			if (title.equalsIgnoreCase("Status updated successfully")) {
				child34.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title + "' ");
			} else {
				child34.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child34.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child34);
	}

	@Test(priority = 36, enabled = true, description = "Verifying Manage Application Page With Only Application Name,Applicationid,Protocol,Status as Active")
	public void

			MPTestVerificationWithApplicationName_ApplicationId_Protocol_StatusasActive() throws Exception {
		child35 = _extent_report
				.startTest("Verifying Manage Application Page With Only Application Name,Applicationid,Protocol,Status as Active");
		child35.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);

			MAP.validateManageApplicationWithOnlyApplicationName_Applicationid_protocol_statusasActive("Applicationautomationtest",
					"Applicationautomationtest", "SAP", "Active");
			Thread.sleep(2000);

			Boolean flag = MAP.Actionsicon.isDisplayed();
			String title = flag.toString();
			System.out.println(title);
			if (title.contains("true")) {
				child35.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title + "' ");
			} else {
				child35.log(LogStatus.FAIL,
						"Validation successful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child35.log(LogStatus.FAIL, e.fillInStackTrace());
			String title2 = MAP.ErrorMsg.getText();
			child35.log(LogStatus.INFO, title2);
		}
		_extent_report.endTest(child35);
	}

	@Test(priority = 37, enabled = true, description = "Verifying Manage Application Page With Only Application Name,Applicationid,Protocol,Status as Active and edit")
	public void MPTestVerificationWithApplicationName_ApplicationId_Protocol_StatusasActiveandEdit() throws Exception {
		child36 = _extent_report.startTest(
				"Verifying Manage Application Page With Only Application Name,Applicationid,Protocol,Status as Active and edit");
		child36.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);

			MAP.validateManageApplicationWithOnlyApplicationName_Applicationid_protocol_statusasActive("Applicationautomationtest",
					"Applicationautomationtest", "SAP", "Active");
			Thread.sleep(2000);

			MAP.Actionsicon.click();
			Thread.sleep(1000);
			MAP.Editbtn.click();
			Thread.sleep(5000);
			MAP.EditSubmitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();

			if (title.equalsIgnoreCase("Application updated successfully")) {

				child36.log(LogStatus.PASS,
						"Validation successful because we are getting Applications with Verifying Manage Application Page With Only Application Name,Applicationid,Protocol,Status as Active and edit");
			} else {
				child36.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting Applications with Verifying Manage Application Page With Only Application Name,Applicationid,Protocol,Status as Active and edit");
			}
		} catch (Exception e) {
			child36.log(LogStatus.FAIL, e.fillInStackTrace());
			String title2 = MAP.ErrorMsg.getText();
			child36.log(LogStatus.INFO, title2);
		}
		_extent_report.endTest(child36);
	}

	@Test(priority = 38, enabled = true, description = "Verification with Verifying Manage Application Page With Only Application Name,Applicationid,Protocol,Status as Active and Activitylog")
	public void ManageApplicationPageTestWithApplicationName_ApplicationId_Protocol_StatusasActiveandActivitylog()
			throws Throwable {
		child37 = _extent_report.startTest(
				"Verifying Manage Application Page With Only Application Name,Applicationid,Protocol,Status as Inactive and Activitylog");
		child37.assignCategory("Manage Application");

		try {
			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyApplicationName_Applicationid_protocol_statusasInactive("Applicationautomationtest",
					"Applicationautomationtest", "SAP", "Active");
			Thread.sleep(2000);
			MAP.ValidateMpRecordWithViewActivity("Applicationautomationtest", 2);
			Thread.sleep(2000);
			child37.log(LogStatus.INFO, MAP.ActivitylogData.toString());
			child37.log(LogStatus.PASS, "Validation successful because we are getting activity history");

			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			Thread.sleep(2000);
		}

		catch (Exception e) {
			child37.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child37);

	}

	@Test(priority = 39, enabled = true, description = "Verifying Manage Application Page With Only Application Name,Applicationid,Protocol,Status as Active and Deactivate")
	public void ManageApplicationPageTestWithApplicationName_ApplicationId_Protocol_StatusasInactiveandDeactivate()
			throws Throwable {
		child38 = _extent_report.startTest(
				"Verifying Manage Application Page With Only Application Name,Applicationid,Protocol,Status as Active and Deactivate");
		child38.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyApplicationName_Applicationid_protocol_statusasInactive("Applicationautomationtest",
					"Applicationautomationtest", "SAP", "Active");
			Thread.sleep(2000);
			MAP.Actionbtn.click();
			Thread.sleep(1000);
			MAP.DeactivateClick.click();
			Thread.sleep(1000);
			MAP.yesDeactivateitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();
			System.out.println(title);
			if (title.equalsIgnoreCase("Status updated successfully")) {
				child38.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title + "' ");
			} else {
				child38.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child38.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child38);
	}

	@Test(priority = 40, enabled = false, description = "Verifying Manage Application Page With Protocol as AS2 organization as yes")

	public void MPTestVerificationWithProtocolAsAS2Yes() throws Exception {
		child39 = _extent_report.startTest("Verifying Manage Application Page With Protocol as AS2 organization as yes");
		child39.assignCategory("Manage Application");
		try {
			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("AS2", "ApplicationAutomationAS2yes");
			Boolean flag = MAP.Actionsicon.isDisplayed();
			String title = flag.toString();
			System.out.println(title);
			if (title.contains("true")) {
				child39.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Protocol as AS2 organization as yes");
			} else {
				child39.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ "'  instead of 'Matches Found' ,when we Search with Protocol as AS2 organization as yes");
			}
		} catch (Exception e) {
			child39.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child39);
	}

	@Test(priority = 41, enabled = false, description = "Verifying Manage Application Page With Protocol as AS2 organization as yes and edit")
	public void MPTestVerificationWithProtocolAsAS2YesandEdit() throws Exception {
		child40 = _extent_report
				.startTest("Verifying Manage Application Page With Protocol as AS2 organization as yes and edit");
		child40.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);

			MAP.validateManageApplicationWithOnlyProtocol("AS2", "ApplicationAutomationAS2yes");
			Thread.sleep(2000);

			MAP.Actionsicon.click();
			Thread.sleep(1000);
			MAP.Editbtn.click();
			Thread.sleep(3000);
			MAP.EditSubmitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();

			if (title.equalsIgnoreCase("Application updated successfully")) {

				child40.log(LogStatus.PASS,
						"Validation successful because we are getting Applications with Protocol as AS2 organization as yes and edit");
			} else {
				child40.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting Applications with Protocol as AS2 organization as yes and edit");
			}
		} catch (Exception e) {
			child40.log(LogStatus.FAIL, e.fillInStackTrace());
			String title2 = MAP.ErrorMsg.getText();
			child40.log(LogStatus.INFO, title2);
		}
		_extent_report.endTest(child40);
	}

	@Test(priority = 42, enabled = false, description = "Manage Application Page Search Result Verification with Protocol as AS2 organization as yes and Activitylog")

	public void ManageApplicationPageTestWithProtocolAsAS2YesandActivitylog() throws Throwable {
		child41 = _extent_report.startTest(
				"Manage Application Page Search Result Verification with Protocol as AS2 organization as yes and Activitylog");
		child41.assignCategory("Manage Application");
		try {
			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("AS2", "ApplicationAutomationAS2yes");
			Thread.sleep(2000);
			MAP.ValidateMpRecordWithViewActivity("ApplicationAutomationAS2yes", 2);
			Thread.sleep(2000);
			child41.log(LogStatus.INFO, MAP.ActivitylogData.toString());
			child41.log(LogStatus.PASS, "Validation successful because we are getting activity history");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			child41.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child41);
	}

	@Test(priority = 43, enabled = false, description = "Manage Application Page Search Result Verification with Protocol as AS2 organization as yes and Activate")
	public void ManageApplicationPageTestWithProtocolAsAS2YesandActivate() throws Throwable {
		child42 = _extent_report.startTest(
				"Manage Application Page Search Result Verification with Protocol as AS2 organization as yes and Activate");
		child42.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("AS2", "ApplicationAutomationAS2yes");
			Thread.sleep(2000);
			MAP.Actionbtn.click();
			Thread.sleep(1000);
			MAP.ActivateClick.click();
			Thread.sleep(1000);
			MAP.yesActivateitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();
			System.out.println(title);
			if (title.equalsIgnoreCase("Status updated successfully")) {
				child42.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title + "' ");
			} else {
				child42.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child42.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child42);
	}

	@Test(priority = 44, enabled = false, description = "Manage Application Page Search Result Verification with Protocol as AS2 organization as yes and Deactivate")

	public void ManageApplicationPageTestWithProtocolAsAS2YesandDeactivate() throws Throwable {
		child43 = _extent_report.startTest(
				"Manage Application Page Search Result Verification with Protocol as AS2 organization as yes and Deactivate");
		child43.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("AS2", "ApplicationAutomationAS2yes");
			Thread.sleep(2000);
			MAP.Actionbtn.click();
			Thread.sleep(1000);
			MAP.DeactivateClick.click();
			Thread.sleep(1000);
			MAP.yesDeactivateitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();
			System.out.println(title);
			if (title.equalsIgnoreCase("Status updated successfully")) {
				child43.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title + "' ");
			} else {
				child43.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child43.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child43);
	}

	@Test(priority = 45, enabled = false, description = "Verifying Manage Application Page With Protocol as AS2 organization as No")

	public void MPTestVerificationWithProtocolAsAS2No() throws Exception {
		child44 = _extent_report.startTest("Verifying Manage Application Page With Protocol as AS2 organization as No");
		child44.assignCategory("Manage Application");
		try {
			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("AS2", "ApplicationAutomationAS2no");
			Boolean flag = MAP.Actionsicon.isDisplayed();
			String title = flag.toString();
			System.out.println(title);
			if (title.contains("true")) {
				child44.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Protocol as AS2 organization as No");
			} else {
				child44.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ "'  instead of 'Matches Found' ,when we Search with Protocol as AS2 organization as No");
			}
		} catch (Exception e) {
			child44.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child44);
	}

	@Test(priority = 46, enabled = false, description = "Verifying Manage Application Page With Protocol as AS2 organization as No and edit")
	public void MPTestVerificationWithProtocolAsAS2NoandEdit() throws Exception {
		child45 = _extent_report
				.startTest("Verifying Manage Application Page With Protocol as AS2 organization as No and edit");
		child45.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);

			MAP.validateManageApplicationWithOnlyProtocol("AS2", "ApplicationAutomationAS2no");
			Thread.sleep(2000);

			MAP.Actionsicon.click();
			Thread.sleep(1000);
			MAP.Editbtn.click();
			Thread.sleep(3000);
			MAP.EditSubmitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();

			if (title.equalsIgnoreCase("Application updated successfully")) {

				child45.log(LogStatus.PASS,
						"Validation successful because we are getting Applications with Protocol as AS2 organization as No and edit");
			} else {
				child45.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting Applications with Protocol as AS2 organization as No and edit");
			}
		} catch (Exception e) {
			child45.log(LogStatus.FAIL, e.fillInStackTrace());
			String title2 = MAP.ErrorMsg.getText();
			child45.log(LogStatus.INFO, title2);
		}
		_extent_report.endTest(child45);
	}

	@Test(priority = 47, enabled = false, description = "Manage Application Page Search Result Verification with Protocol as AS2 organization as No and Activitylog")

	public void ManageApplicationPageTestWithProtocolAsAS2NoandActivitylog() throws Throwable {
		child46 = _extent_report.startTest(
				"Manage Application Page Search Result Verification with Protocol as AS2 organization as No and Activitylog");
		child46.assignCategory("Manage Application");

		try {
			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("AS2", "ApplicationAutomationAS2no");
			Thread.sleep(2000);
			MAP.ValidateMpRecordWithViewActivity("ApplicationAutomationAS2no", 2);
			Thread.sleep(2000);
			child46.log(LogStatus.INFO, MAP.ActivitylogData.toString());
			child46.log(LogStatus.PASS, "Validation successful because we are getting activity history");

			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			Thread.sleep(2000);
		}

		catch (Exception e) {
			child46.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child46);

	}

	@Test(priority = 48, enabled = false, description = "Manage Application Page Search Result Verification with Protocol as AS2 organization as No and Activate")

	public void ManageApplicationPageTestWithProtocolAsAS2NoandActivate() throws Throwable {
		child47 = _extent_report.startTest(
				"Manage Application Page Search Result Verification with Protocol as AS2 organization as No and Activate");
		child47.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("AS2", "ApplicationAutomationAS2no");
			Thread.sleep(2000);
			MAP.Actionbtn.click();
			Thread.sleep(1000);
			MAP.ActivateClick.click();
			Thread.sleep(1000);
			MAP.yesActivateitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();
			System.out.println(title);
			if (title.equalsIgnoreCase("Status updated successfully")) {
				child47.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title + "' ");
			} else {
				child47.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child47.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child47);
	}

	@Test(priority = 49, enabled = false, description = "Manage Application Page Search Result Verification with Protocol as AS2 organization as No and Deactivate")

	public void ManageApplicationPageTestWithProtocolAsAS2NoandDeactivate() throws Throwable {
		child48 = _extent_report.startTest(
				"Manage Application Page Search Result Verification with Protocol as AS2 organization as No and Deactivate");
		child48.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("AS2", "ApplicationAutomationAS2no");
			Thread.sleep(2000);
			MAP.Actionbtn.click();
			Thread.sleep(1000);
			MAP.DeactivateClick.click();
			Thread.sleep(1000);
			MAP.yesDeactivateitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();
			System.out.println(title);
			if (title.equalsIgnoreCase("Status updated successfully")) {
				child48.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title + "' ");
			} else {
				child48.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child48.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child48);
	}

	@Test(priority = 50, enabled = false, description = "Verifying Manage Application Page With Protocol as AWSS3")
	public void

			MPTestVerificationWithProtocolasAWSS3() throws Exception {
		child49 = _extent_report.startTest("Verifying Manage Application Page With Protocol as AWSS3");
		child49.assignCategory("Manage Application");

		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);

			MAP.validateManageApplicationWithOnlyProtocol("AWS-S3", "ApplicationAutomationAWSS3");

			Boolean flag = MAP.Actionsicon.isDisplayed();
			String title = flag.toString();
			System.out.println(title);

			if (title.contains("true")) {

				child49.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Protocol as AWSS3");
			} else {
				child49.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ "'  instead of 'Matches Found' ,when we Search with Protocol as AWSS3");
			}
		} catch (Exception e) {
			child49.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child49);

	}

	@Test(priority = 51, enabled = false, description = "Verifying Manage Application Page With Protocol as AWSS3 and edit")
	public void MPTestVerificationWithProtocolasAWSS3andEdit() throws Exception {
		child50 = _extent_report.startTest("Verifying Manage Application Page With Protocol as AWSS3 and edit");
		child50.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);

			MAP.validateManageApplicationWithOnlyProtocol("AWS-S3", "ApplicationAutomationAWSS3");
			Thread.sleep(2000);

			MAP.Actionsicon.click();
			Thread.sleep(1000);
			MAP.Editbtn.click();
			Thread.sleep(3000);
			MAP.EditSubmitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();

			if (title.equalsIgnoreCase("Application updated successfully")) {

				child50.log(LogStatus.PASS,
						"Validation successful because we are getting Applications with Protocol as AWSS3 and edit");
			} else {
				child50.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting Applications with Protocol as AWSS3 and edit");
			}
		} catch (Exception e) {
			child50.log(LogStatus.FAIL, e.fillInStackTrace());
			String title2 = MAP.ErrorMsg.getText();
			child50.log(LogStatus.INFO, title2);
		}
		_extent_report.endTest(child50);
	}

	@Test(priority = 52, enabled = false, description = "Manage Application Page Search Result Verification with Protocol as AWSS3 and Activitylog")
	public void ManageApplicationPageTestWithProtocolasAWSS3andActivitylog() throws Throwable {
		child51 = _extent_report
				.startTest("Manage Application Page Search Result Verification with Protocol as AWSS3 and Activitylog");
		child51.assignCategory("Manage Application");

		try {
			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("AWS-S3", "ApplicationAutomationAWSS3");
			Thread.sleep(2000);
			MAP.ValidateMpRecordWithViewActivity("ApplicationAutomationAWSS3", 2);
			Thread.sleep(2000);
			child51.log(LogStatus.INFO, MAP.ActivitylogData.toString());
			child51.log(LogStatus.PASS, "Validation successful because we are getting activity history");

			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			Thread.sleep(2000);
		}

		catch (Exception e) {
			child51.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child51);

	}

	@Test(priority = 53, enabled = false, description = "Manage Application Page Search Result Verification with Protocol as AWSS3 and Activate")

	public void ManageApplicationPageTestWithProtocolasAWSS3andActivate() throws Throwable {
		child52 = _extent_report
				.startTest("Manage Application Page Search Result Verification with Protocol as AWSS3 and Activate");
		child52.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("AWS-S3", "ApplicationAutomationAWSS3");
			Thread.sleep(2000);
			MAP.Actionbtn.click();
			Thread.sleep(1000);
			MAP.ActivateClick.click();
			Thread.sleep(1000);
			MAP.yesActivateitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();
			System.out.println(title);
			if (title.equalsIgnoreCase("Status updated successfully")) {
				child52.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title + "' ");
			} else {
				child52.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child52.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child52);
	}

	@Test(priority = 54, enabled = false, description = "Manage Application Page Search Result Verification with Protocol as AWSS3 and Deactivate")

	public void ManageApplicationPageTestWithProtocolasAWSS3andDeactivate() throws Throwable {
		child53 = _extent_report
				.startTest("Manage Application Page Search Result Verification with Protocol as AWSS3 and Deactivate");
		child53.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("AWS-S3", "ApplicationAutomationAWSS3");
			Thread.sleep(2000);
			MAP.Actionbtn.click();
			Thread.sleep(1000);
			MAP.DeactivateClick.click();
			Thread.sleep(1000);
			MAP.yesDeactivateitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();
			System.out.println(title);
			if (title.equalsIgnoreCase("Status updated successfully")) {
				child53.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title + "' ");
			} else {
				child53.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child53.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child53);
	}

	@Test(priority = 55, enabled = false, description = "Verifying Manage Application Page With Protocol as B2Bi Connect-Direct and SSP as Yes")
	public void MPTestVerificationWithProtocolasCDYes() throws Exception {
		child54 = _extent_report
				.startTest("Verifying Manage Application Page With Protocol as B2Bi Connect-Direct and SSP as Yes");
		child54.assignCategory("Manage Application");

		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);

			MAP.validateManageApplicationWithOnlyProtocol("B2Bi-CONNECT-DIRECT", "ApplicationAutomationCDyes");

			Boolean flag = MAP.Actionsicon.isDisplayed();
			String title = flag.toString();
			System.out.println(title);

			if (title.contains("true")) {

				child54.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Protocol as B2Bi Connect-Direct and SSP as Yes");
			} else {
				child54.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ "'  instead of 'Matches Found' ,when we Search with Protocol as B2Bi Connect-Direct and SSP as Yes");
			}
		} catch (Exception e) {
			child54.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child54);

	}

	@Test(priority = 56, enabled = false, description = "Verifying Manage Application Page With Protocol as B2Bi Connect-Direct and SSP as Yes and edit")
	public void MPTestVerificationWithProtocolasCDYesandEdit() throws Exception {
		child55 = _extent_report.startTest(
				"Verifying Manage Application Page With Protocol as B2Bi Connect-Direct and SSP as Yes and edit");
		child55.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);

			MAP.validateManageApplicationWithOnlyProtocol("B2Bi-CONNECT-DIRECT", "ApplicationAutomationCDyes");
			Thread.sleep(2000);

			MAP.Actionsicon.click();
			Thread.sleep(1000);
			MAP.Editbtn.click();
			Thread.sleep(3000);
			MAP.EditSubmitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();

			if (title.equalsIgnoreCase("Application updated successfully")) {

				child55.log(LogStatus.PASS,
						"Validation successful because we are getting Applications with Protocol as B2Bi Connect-Direct and SSP as Yes and edit");
			} else {
				child55.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting Applications with Protocol as B2Bi Connect-Direct and SSP as Yes and edit");
			}

			Thread.sleep(4000);

		} catch (Exception e) {
			child55.log(LogStatus.FAIL, e.fillInStackTrace());
			String title2 = MAP.ErrorMsg.getText();
			child55.log(LogStatus.INFO, title2);
		}
		_extent_report.endTest(child55);
	}

	@Test(priority = 57, enabled = false, description = "Manage Application Page Search Result Verification with Protocol as B2Bi Connect-Direct and SSP as Yes and Activitylog")
	public void ManageApplicationPageTestWithProtocolasCDYesandActivitylog() throws Throwable {
		child56 = _extent_report.startTest(
				"Manage Application Page Search Result Verification with Protocol as B2Bi Connect-Direct and SSP as Yes and Activitylog");
		child56.assignCategory("Manage Application");

		try {
			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("B2Bi-CONNECT-DIRECT", "ApplicationAutomationCDyes");
			Thread.sleep(2000);
			MAP.ValidateMpRecordWithViewActivity("ApplicationAutomationCDyes", 2);
			Thread.sleep(2000);
			child56.log(LogStatus.INFO, MAP.ActivitylogData.toString());
			child56.log(LogStatus.PASS, "Validation successful because we are getting activity history");

			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	Thread.sleep(2000);

	}

	catch(Exception e)
	{
			child56.log(LogStatus.FAIL, e.fillInStackTrace());
		}

	_extent_report.endTest(child56);

	}

	@Test(priority = 58, enabled = false, description = "Manage Application Page Search Result Verification with Protocol as B2Bi Connect-Direct and SSP as Yes and Activate")
	public void ManageApplicationPageTestWithProtocolasCDYesandActivate() throws Throwable {
		child57 = _extent_report.startTest(
				"Manage Application Page Search Result Verification with Protocol as B2Bi Connect-Direct and SSP as Yes and Activate");
		child57.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("B2Bi-CONNECT-DIRECT", "ApplicationAutomationCDyes");
			Thread.sleep(2000);
			MAP.Actionbtn.click();
			Thread.sleep(2000);


			WebDriverWait wait = new WebDriverWait(driver, 10);

			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Activate']"))).click();
			 MAP.ActivateClick.click();

			Thread.sleep(1000);
			MAP.yesActivateitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();
			System.out.println(title);
			if (title.equalsIgnoreCase("Status updated successfully")) {
				child57.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title + "' ");
			} else {
				child57.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child57.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child57);
	}

	@Test(priority = 59, enabled = false, description = "Manage Application Page Search Result Verification with Protocol as B2Bi Connect-Direct and SSP as Yes and Deactivate")
	public void ManageApplicationPageTestWithProtocolasCDYesandDeactivate() throws Throwable {
		child58 = _extent_report.startTest(
				"Manage Application Page Search Result Verification with Protocol as B2Bi Connect-Direct and SSP as Yes and Deactivate");
		child58.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("B2Bi-CONNECT-DIRECT", "ApplicationAutomationCDyes");
			Thread.sleep(2000);
			MAP.Actionbtn.click();
			Thread.sleep(2000);

			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions
					.or(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Deactivate']"))));

			MAP.DeactivateClick.click();
			Thread.sleep(1000);
			MAP.yesDeactivateitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();
			System.out.println(title);
			if (title.equalsIgnoreCase("Status updated successfully")) {
				child58.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title + "' ");
			} else {
				child58.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child58.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child58);
	}

	@Test(priority = 60, enabled = false, description = "Verifying Manage Application Page With Protocol as B2Bi Connect-Direct and SSP as No")
	public void MPTestVerificationWithProtocolasCDNo() throws Exception {
		child59 = _extent_report
				.startTest("Verifying Manage Application Page With Protocol as B2Bi Connect-Direct and SSP as No");
		child59.assignCategory("Manage Application");

		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);

			MAP.validateManageApplicationWithOnlyProtocol("B2Bi-CONNECT-DIRECT", "ApplicationAutomationCDno");

			Boolean flag = MAP.Actionsicon.isDisplayed();
			String title = flag.toString();
			System.out.println(title);

			if (title.contains("true")) {

				child59.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Protocol as B2Bi Connect-Direct and SSP as No");
			} else {
				child59.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ "'  instead of 'Matches Found' ,when we Search with Protocol as B2Bi Connect-Direct and SSP as No");
			}
		} catch (Exception e) {
			child59.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child59);

	}

	@Test(priority = 61, enabled = false, description = "Verifying Manage Application Page With Protocol as B2Bi Connect-Direct and SSP as No and edit")
	public void MPTestVerificationWithProtocolasCDNoandEdit() throws Exception {
		child60 = _extent_report
				.startTest("Verifying Manage Application Page With Protocol as B2Bi Connect-Direct and SSP as No and edit");
		child60.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);

			MAP.validateManageApplicationWithOnlyProtocol("B2Bi-CONNECT-DIRECT", "ApplicationAutomationCDno");
			Thread.sleep(2000);

			MAP.Actionsicon.click();
			Thread.sleep(1000);
			MAP.Editbtn.click();
			Thread.sleep(3000);
			MAP.EditSubmitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();

			if (title.equalsIgnoreCase("Application updated successfully")) {

				child60.log(LogStatus.PASS,
						"Validation successful because we are getting Applications with Protocol as B2Bi Connect-Direct and SSP as No and edit");
			} else {
				child60.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting Applications with Protocol as B2Bi Connect-Direct and SSP as No and edit");
			}
		} catch (Exception e) {
			child60.log(LogStatus.FAIL, e.fillInStackTrace());
			String title2 = MAP.ErrorMsg.getText();
			child60.log(LogStatus.INFO, title2);
		}
		_extent_report.endTest(child60);
	}

	@Test(priority = 62, enabled = false, description = "Manage Application Page Search Result Verification with Protocol as B2Bi Connect-Direct and SSP as No and Activitylog")
	public void ManageApplicationPageTestWithProtocolasCDNoandActivitylog() throws Throwable {
		child61 = _extent_report.startTest(
				"Manage Application Page Search Result Verification with Protocol as B2Bi Connect-Direct and SSP as No and Activitylog");
		child61.assignCategory("Manage Application");

		try {
			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("B2Bi-CONNECT-DIRECT", "ApplicationAutomationCDno");
			Thread.sleep(2000);
			MAP.ValidateMpRecordWithViewActivity("ApplicationAutomationCDno", 2);
			Thread.sleep(2000);
			child61.log(LogStatus.INFO, MAP.ActivitylogData.toString());
			child61.log(LogStatus.PASS, "Validation successful because we are getting activity history");

			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			Thread.sleep(2000);
		}

		catch (Exception e) {
			child61.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child61);

	}

	@Test(priority = 63, enabled = false, description = "Manage Application Page Search Result Verification with Protocol as B2Bi Connect-Direct and SSP as No and Activate")
	public void ManageApplicationPageTestWithProtocolasCDNoandActivate() throws Throwable {
		child62 = _extent_report.startTest(
				"Manage Application Page Search Result Verification with Protocol as B2Bi Connect-Direct and SSP as No and Activate");
		child62.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("B2Bi-CONNECT-DIRECT", "ApplicationAutomationCDno");
			Thread.sleep(2000);
			MAP.Actionbtn.click();
			Thread.sleep(2000);

			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions
					.or(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Activate']"))));

			MAP.ActivateClick.click();
			Thread.sleep(1000);
			MAP.yesActivateitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();
			System.out.println(title);
			if (title.equalsIgnoreCase("Status updated successfully")) {
				child62.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title + "' ");
			} else {
				child62.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child62.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child62);
	}

	@Test(priority = 64, enabled = false, description = "Manage Application Page Search Result Verification with Protocol as B2Bi Connect-Direct and SSP as No and Deactivate")
	public void ManageApplicationPageTestWithProtocolasCDNoandDeactivate() throws Throwable {
		child63 = _extent_report.startTest(
				"Manage Application Page Search Result Verification with Protocol as B2Bi Connect-Direct and SSP as No and Deactivate");
		child63.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("B2Bi-CONNECT-DIRECT", "ApplicationAutomationCDno");
			Thread.sleep(2000);
			MAP.Actionbtn.click();
			Thread.sleep(2000);

			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions
					.or(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Deactivate']"))));

			MAP.DeactivateClick.click();
			Thread.sleep(2000);
			MAP.yesDeactivateitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();
			System.out.println(title);
			if (title.equalsIgnoreCase("Status updated successfully")) {
				child63.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title + "' ");
			} else {
				child63.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child63.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child63);
	}

	@Test(priority = 65, enabled = false, description = "Verifying Manage Application Page With Protocol as B2Bi FTP and type as H2P")
	public void MPTestVerificationWithProtocolasFTPH2P() throws Exception {
		child64 = _extent_report.startTest("Verifying Manage Application Page With Protocol as B2Bi FTP and type as H2P");
		child64.assignCategory("Manage Application");

		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);

			MAP.validateManageApplicationWithOnlyProtocol("B2Bi-FTP", "ApplicationAutomationFTPh2p");

			Boolean flag = MAP.Actionsicon.isDisplayed();
			String title = flag.toString();
			System.out.println(title);

			if (title.contains("true")) {

				child64.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Protocol as B2Bi FTP and type as H2P");
			} else {
				child64.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ "'  instead of 'Matches Found' ,when we Search with Protocol as B2Bi FTP and type as H2P");
			}
		} catch (Exception e) {
			child64.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child64);

	}

	@Test(priority = 66, enabled = false, description = "Verifying Manage Application Page With Protocol as B2Bi FTP and type as H2P and edit")
	public void MPTestVerificationWithProtocolasFTPH2PandEdit() throws Exception {
		child65 = _extent_report
				.startTest("Verifying Manage Application Page With Protocol as B2Bi FTP and type as H2P and edit");
		child65.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);

			MAP.validateManageApplicationWithOnlyProtocol("B2Bi-FTP", "ApplicationAutomationFTPh2p");
			Thread.sleep(2000);

			MAP.Actionsicon.click();
			Thread.sleep(1000);
			MAP.Editbtn.click();
			Thread.sleep(3000);
			MAP.EditSubmitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();

			if (title.equalsIgnoreCase("Application updated successfully")) {

				child65.log(LogStatus.PASS,
						"Validation successful because we are getting Applications with Protocol as B2Bi FTP and type as H2P and edit");
			} else {
				child65.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting Applications with Protocol as B2Bi FTP and type as H2P and edit");
			}
		} catch (Exception e) {
			child65.log(LogStatus.FAIL, e.fillInStackTrace());
			String title2 = MAP.ErrorMsg.getText();
			child65.log(LogStatus.INFO, title2);
		}
		_extent_report.endTest(child65);
	}

	@Test(priority = 67, enabled = false, description = "Manage Application Page Search Result Verification with Protocol as B2Bi FTP and type as H2P and Activitylog")
	public void ManageApplicationPageTestWithProtocolasFTPH2PandActivitylog() throws Throwable {
		child66 = _extent_report.startTest(
				"Manage Application Page Search Result Verification with Protocol as B2Bi FTP and type as H2P and Activitylog");
		child66.assignCategory("Manage Application");

		try {
			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("B2Bi-FTP", "ApplicationAutomationFTPh2p");
			Thread.sleep(2000);
			MAP.ValidateMpRecordWithViewActivity("ApplicationAutomationFTPh2p", 2);
			Thread.sleep(2000);
			child66.log(LogStatus.INFO, MAP.ActivitylogData.toString());
			child66.log(LogStatus.PASS, "Validation successful because we are getting activity history");

			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			Thread.sleep(2000);
		}

		catch (Exception e) {
			child66.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child66);

	}

	@Test(priority = 68, enabled = false, description = "Manage Application Page Search Result Verification with Protocol as B2Bi FTP and type as H2P and Activate")
	public void ManageApplicationPageTestWithProtocolasFTPH2PandActivate() throws Throwable {
		child67 = _extent_report.startTest(
				"Manage Application Page Search Result Verification with Protocol as B2Bi FTP and type as H2P and Activate");
		child67.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("B2Bi-FTP", "ApplicationAutomationFTPh2p");
			Thread.sleep(2000);
			MAP.Actionbtn.click();
			Thread.sleep(1000);
			MAP.ActivateClick.click();
			Thread.sleep(1000);
			MAP.yesActivateitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();
			System.out.println(title);
			if (title.equalsIgnoreCase("Status updated successfully")) {
				child67.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title + "' ");
			} else {
				child67.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child67.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child67);
	}

	@Test(priority = 69, enabled = false, description = "Manage Application Page Search Result Verification with Protocol as B2Bi FTP and type as H2P and Deactivate")
	public void ManageApplicationPageTestWithProtocolasFTPH2PandDeactivate() throws Throwable {
		child68 = _extent_report.startTest(
				"Manage Application Page Search Result Verification with Protocol as B2Bi FTP and type as H2P and Deactivate");
		child68.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("B2Bi-FTP", "ApplicationAutomationFTPh2p");
			Thread.sleep(2000);
			MAP.Actionbtn.click();
			Thread.sleep(1000);
			MAP.DeactivateClick.click();
			Thread.sleep(1000);
			MAP.yesDeactivateitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();
			System.out.println(title);
			if (title.equalsIgnoreCase("Status updated successfully")) {
				child68.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title + "' ");
			} else {
				child68.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child68.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child68);
	}

	@Test(priority = 70, enabled = false, description = "Verifying Manage Application Page With Protocol as B2Bi FTP and type as P2H")
	public void MPTestVerificationWithProtocolasFTPP2H() throws Exception {
		child69 = _extent_report.startTest("Verifying Manage Application Page With Protocol as B2Bi FTP and type as P2H");
		child69.assignCategory("Manage Application");

		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);

			MAP.validateManageApplicationWithOnlyProtocol("B2Bi-FTP", "ApplicationAutomationFTPp2h");

			Boolean flag = MAP.Actionsicon.isDisplayed();
			String title = flag.toString();
			System.out.println(title);

			if (title.contains("true")) {

				child69.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Protocol as B2Bi FTP and type as P2H");
			} else {
				child69.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ "'  instead of 'Matches Found' ,when we Search with Protocol as B2Bi FTP and type as P2H");
			}
		} catch (Exception e) {
			child69.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child69);

	}

	@Test(priority = 71, enabled = false, description = "Verifying Manage Application Page With Protocol as B2Bi FTP and type as P2H and edit")
	public void MPTestVerificationWithProtocolasFTPP2HandEdit() throws Exception {
		child70 = _extent_report
				.startTest("Verifying Manage Application Page With Protocol as B2Bi FTP and type as P2H and edit");
		child70.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);

			MAP.validateManageApplicationWithOnlyProtocol("B2Bi-FTP", "ApplicationAutomationFTPp2h");
			Thread.sleep(2000);

			MAP.Actionsicon.click();
			Thread.sleep(1000);
			MAP.Editbtn.click();
			Thread.sleep(3000);
			MAP.EditSubmitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();

			if (title.equalsIgnoreCase("Application updated successfully")) {

				child70.log(LogStatus.PASS,
						"Validation successful because we are getting Applications with Protocol as B2Bi FTP and type as P2H and edit");
			} else {
				child70.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting Applications with Protocol as B2Bi FTP and type as P2H and edit");
			}
		} catch (Exception e) {
			child70.log(LogStatus.FAIL, e.fillInStackTrace());
			String title2 = MAP.ErrorMsg.getText();
			child70.log(LogStatus.INFO, title2);
		}
		_extent_report.endTest(child70);
	}

	@Test(priority = 72, enabled = false, description = "Manage Application Page Search Result Verification with Protocol as B2Bi FTP and type as P2H and Activitylog")
	public void ManageApplicationPageTestWithProtocolasFTPP2HandActivitylog() throws Throwable {
		child71 = _extent_report.startTest(
				"Manage Application Page Search Result Verification with Protocol as B2Bi FTP and type as P2H and Activitylog");
		child71.assignCategory("Manage Application");

		try {
			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("B2Bi-FTP", "ApplicationAutomationFTPp2h");
			Thread.sleep(2000);
			MAP.ValidateMpRecordWithViewActivity("ApplicationAutomationFTPp2h", 2);
			Thread.sleep(2000);
			child71.log(LogStatus.INFO, MAP.ActivitylogData.toString());
			child71.log(LogStatus.PASS, "Validation successful because we are getting activity history");

			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			Thread.sleep(2000);
		}

		catch (Exception e) {
			child71.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child71);

	}

	@Test(priority = 73, enabled = false, description = "Manage Application Page Search Result Verification with Protocol as B2Bi FTP and type as P2H and Activate")
	public void ManageApplicationPageTestWithProtocolasFTPP2HandActivate() throws Throwable {
		child72 = _extent_report.startTest(
				"Manage Application Page Search Result Verification with Protocol as B2Bi FTP and type as P2H and Activate");
		child72.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("B2Bi-FTP", "ApplicationAutomationFTPp2h");
			Thread.sleep(2000);
			MAP.Actionbtn.click();
			Thread.sleep(1000);
			MAP.ActivateClick.click();
			Thread.sleep(1000);
			MAP.yesActivateitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();
			System.out.println(title);
			if (title.equalsIgnoreCase("Status updated successfully")) {
				child72.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title + "' ");
			} else {
				child72.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child72.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child72);
	}

	@Test(priority = 74, enabled = false, description = "Manage Application Page Search Result Verification with Protocol as B2Bi FTP and type as P2H and Deactivate")
	public void ManageApplicationPageTestWithProtocolasFTPP2HandDeactivate() throws Throwable {
		child73 = _extent_report.startTest(
				"Manage Application Page Search Result Verification with Protocol as B2Bi FTP and type as P2H and Deactivate");
		child73.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("B2Bi-FTP", "ApplicationAutomationFTPp2h");
			Thread.sleep(2000);
			MAP.Actionbtn.click();
			Thread.sleep(1000);
			MAP.DeactivateClick.click();
			Thread.sleep(1000);
			MAP.yesDeactivateitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();
			System.out.println(title);
			if (title.equalsIgnoreCase("Status updated successfully")) {
				child73.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title + "' ");
			} else {
				child73.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child73.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child73);
	}

	@Test(priority = 75, enabled = false, description = "Verifying Manage Application Page With Protocol as B2Bi FTPS and type as H2P")
	public void MPTestVerificationWithProtocolasFTPSH2P() throws Exception {
		child74 = _extent_report.startTest("Verifying Manage Application Page With Protocol as B2Bi FTPS and type as H2P");
		child74.assignCategory("Manage Application");

		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);

			MAP.validateManageApplicationWithOnlyProtocol("B2Bi-FTPS", "ApplicationAutomationFTPSh2p");

			Boolean flag = MAP.Actionsicon.isDisplayed();
			String title = flag.toString();
			System.out.println(title);

			if (title.contains("true")) {

				child74.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Protocol as B2Bi FTPS and type as H2P");
			} else {
				child74.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ "'  instead of 'Matches Found' ,when we Search with Protocol as B2Bi FTPS and type as H2P");
			}
		} catch (Exception e) {
			child74.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child74);

	}

	@Test(priority = 76, enabled = false, description = "Verifying Manage Application Page With Protocol as B2Bi FTPS and type as H2P and edit")
	public void MPTestVerificationWithProtocolasFTPSH2PandEdit() throws Exception {
		child75 = _extent_report
				.startTest("Verifying Manage Application Page With Protocol as B2Bi FTPS and type as H2P and edit");
		child75.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);

			MAP.validateManageApplicationWithOnlyProtocol("B2Bi-FTPS", "ApplicationAutomationFTPSh2p");
			Thread.sleep(2000);

			MAP.Actionsicon.click();
			Thread.sleep(1000);
			MAP.Editbtn.click();
			Thread.sleep(3000);
			MAP.EditSubmitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();

			if (title.equalsIgnoreCase("Application updated successfully")) {

				child75.log(LogStatus.PASS,
						"Validation successful because we are getting Applications with Protocol as B2Bi FTPS and type as H2P and edit");
			} else {
				child75.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting Applications with Protocol as B2Bi FTPS and type as H2P and edit");
			}
		} catch (Exception e) {
			child75.log(LogStatus.FAIL, e.fillInStackTrace());
			String title2 = MAP.ErrorMsg.getText();
			child75.log(LogStatus.INFO, title2);
		}
		_extent_report.endTest(child75);
	}

	@Test(priority = 77, enabled = false, description = "Manage Application Page Search Result Verification with Protocol as B2Bi FTPS and type as H2P and Activitylog")
	public void ManageApplicationPageTestWithProtocolasFTPSH2PandActivitylog() throws Throwable {
		child76 = _extent_report.startTest(
				"Manage Application Page Search Result Verification with Protocol as B2Bi FTPS and type as H2P and Activitylog");
		child76.assignCategory("Manage Application");

		try {
			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("B2Bi-FTPS", "ApplicationAutomationFTPSh2p");
			Thread.sleep(2000);
			MAP.ValidateMpRecordWithViewActivity("ApplicationAutomationFTPSh2p", 2);
			Thread.sleep(2000);
			child76.log(LogStatus.INFO, MAP.ActivitylogData.toString());
			child76.log(LogStatus.PASS, "Validation successful because we are getting activity history");

			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			Thread.sleep(2000);
		}

		catch (Exception e) {
			child76.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child76);

	}

	@Test(priority = 78, enabled = false, description = "Manage Application Page Search Result Verification with Protocol as B2Bi FTPS and type as H2P and Activate")
	public void ManageApplicationPageTestWithProtocolasFTPSH2PandActivate() throws Throwable {
		child77 = _extent_report.startTest(
				"Manage Application Page Search Result Verification with Protocol as B2Bi FTPS and type as H2P and Activate");
		child77.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("B2Bi-FTPS", "ApplicationAutomationFTPSh2p");
			Thread.sleep(2000);
			MAP.Actionbtn.click();
			Thread.sleep(1000);
			MAP.ActivateClick.click();
			Thread.sleep(1000);
			MAP.yesActivateitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();
			System.out.println(title);
			if (title.equalsIgnoreCase("Status updated successfully")) {
				child77.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title + "' ");
			} else {
				child77.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child77.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child77);
	}

	@Test(priority = 79, enabled = false, description = "Manage Application Page Search Result Verification with Protocol as B2Bi FTPS and type as H2P and Deactivate")
	public void ManageApplicationPageTestWithProtocolasFTPSH2PandDeactivate() throws Throwable {
		child78 = _extent_report.startTest(
				"Manage Application Page Search Result Verification with Protocol as B2Bi FTPS and type as H2P and Deactivate");
		child78.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("B2Bi-FTPS", "ApplicationAutomationFTPSh2p");
			Thread.sleep(2000);
			MAP.Actionbtn.click();
			Thread.sleep(1000);
			MAP.DeactivateClick.click();
			Thread.sleep(1000);
			MAP.yesDeactivateitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();
			System.out.println(title);
			if (title.equalsIgnoreCase("Status updated successfully")) {
				child78.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title + "' ");
			} else {
				child78.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child78.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child78);
	}

	@Test(priority = 80, enabled = false, description = "Verifying Manage Application Page With Protocol as B2Bi FTPS and type as P2H")
	public void MPTestVerificationWithProtocolasFTPSP2H() throws Exception {
		child79 = _extent_report.startTest("Verifying Manage Application Page With Protocol as B2Bi FTPS and type as P2H");
		child79.assignCategory("Manage Application");

		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);

			MAP.validateManageApplicationWithOnlyProtocol("B2Bi-FTPS", "ApplicationAutomationFTPSp2h");

			Boolean flag = MAP.Actionsicon.isDisplayed();
			String title = flag.toString();
			System.out.println(title);

			if (title.contains("true")) {

				child79.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Protocol as B2Bi FTPS and type as P2H");
			} else {
				child79.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ "'  instead of 'Matches Found' ,when we Search with Protocol as B2Bi FTPS and type as P2H");
			}
		} catch (Exception e) {
			child79.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child79);

	}

	@Test(priority = 81, enabled = false, description = "Verifying Manage Application Page With Protocol as B2Bi FTPS and type as P2H and edit")
	public void MPTestVerificationWithProtocolasFTPSP2HandEdit() throws Exception {
		child80 = _extent_report
				.startTest("Verifying Manage Application Page With Protocol as B2Bi FTPS and type as P2H and edit");
		child80.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);

			MAP.validateManageApplicationWithOnlyProtocol("B2Bi-FTPS", "ApplicationAutomationFTPSp2h");
			Thread.sleep(2000);

			MAP.Actionsicon.click();
			Thread.sleep(1000);
			MAP.Editbtn.click();
			Thread.sleep(3000);
			MAP.EditSubmitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();

			if (title.equalsIgnoreCase("Application updated successfully")) {

				child80.log(LogStatus.PASS,
						"Validation successful because we are getting Applications with Protocol as B2Bi FTPS and type as P2H and edit");
			} else {
				child80.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting Applications with Protocol as B2Bi FTPS and type as P2H and edit");
			}
		} catch (Exception e) {
			child80.log(LogStatus.FAIL, e.fillInStackTrace());
			String title2 = MAP.ErrorMsg.getText();
			child80.log(LogStatus.INFO, title2);
		}
		_extent_report.endTest(child80);
	}

	@Test(priority = 82, enabled = false, description = "Manage Application Page Search Result Verification with Protocol as B2Bi FTPS and type as P2H and Activitylog")
	public void ManageApplicationPageTestWithProtocolasFTPSP2HandActivitylog() throws Throwable {
		child81 = _extent_report.startTest(
				"Manage Application Page Search Result Verification with Protocol as B2Bi FTPS and type as P2H and Activitylog");
		child81.assignCategory("Manage Application");

		try {
			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("B2Bi-FTPS", "ApplicationAutomationFTPSp2h");
			Thread.sleep(2000);
			MAP.ValidateMpRecordWithViewActivity("ApplicationAutomationFTPSp2h", 2);
			Thread.sleep(2000);
			child81.log(LogStatus.INFO, MAP.ActivitylogData.toString());
			child81.log(LogStatus.PASS, "Validation successful because we are getting activity history");

			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			Thread.sleep(2000);
		}

		catch (Exception e) {
			child81.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child81);

	}

	@Test(priority = 83, enabled = false, description = "Manage Application Page Search Result Verification with Protocol as B2Bi FTPS and type as P2H and Activate")
	public void ManageApplicationPageTestWithProtocolasFTPSP2HandActivate() throws Throwable {
		child82 = _extent_report.startTest(
				"Manage Application Page Search Result Verification with Protocol as B2Bi FTPS and type as P2H and Activate");
		child82.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("B2Bi-FTPS", "ApplicationAutomationFTPSp2h");
			Thread.sleep(2000);
			MAP.Actionbtn.click();
			Thread.sleep(1000);
			MAP.ActivateClick.click();
			Thread.sleep(1000);
			MAP.yesActivateitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();
			System.out.println(title);
			if (title.equalsIgnoreCase("Status updated successfully")) {
				child82.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title + "' ");
			} else {
				child82.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child82.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child82);
	}

	@Test(priority = 84, enabled = false, description = "Manage Application Page Search Result Verification with Protocol as B2Bi FTPS and type as P2H and Deactivate")
	public void ManageApplicationPageTestWithProtocolasFTPSP2HandDeactivate() throws Throwable {
		child83 = _extent_report.startTest(
				"Manage Application Page Search Result Verification with Protocol as B2Bi FTPS and type as P2H and Deactivate");
		child83.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("B2Bi-FTPS", "ApplicationAutomationFTPSp2h");
			Thread.sleep(2000);
			MAP.Actionbtn.click();
			Thread.sleep(1000);
			MAP.DeactivateClick.click();
			Thread.sleep(1000);
			MAP.yesDeactivateitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();
			System.out.println(title);
			if (title.equalsIgnoreCase("Status updated successfully")) {
				child83.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title + "' ");
			} else {
				child83.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child83.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child83);
	}

	@Test(priority = 85, enabled = false, description = "Verifying Manage Application Page With Protocol as B2Bi SFTP and type as H2P")
	public void MPTestVerificationWithProtocolasSFTPH2P() throws Exception {
		child84 = _extent_report.startTest("Verifying Manage Application Page With Protocol as B2Bi SFTP and type as H2P");
		child84.assignCategory("Manage Application");

		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);

			MAP.validateManageApplicationWithOnlyProtocol("B2Bi-SFTP", "ApplicationAutomationSFTPh2p");

			Boolean flag = MAP.Actionsicon.isDisplayed();
			String title = flag.toString();
			System.out.println(title);

			if (title.contains("true")) {

				child84.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Protocol as B2Bi SFTP and type as H2P");
			} else {
				child84.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ "'  instead of 'Matches Found' ,when we Search with Protocol as B2Bi SFTP and type as H2P");
			}
		} catch (Exception e) {
			child84.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child84);

	}

	@Test(priority = 86, enabled = false, description = "Verifying Manage Application Page With Protocol as B2Bi SFTP and type as H2P and edit")
	public void MPTestVerificationWithProtocolasSFTPH2PandEdit() throws Exception {
		child85 = _extent_report
				.startTest("Verifying Manage Application Page With Protocol as B2Bi SFTP and type as H2P and edit");
		child85.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);

			MAP.validateManageApplicationWithOnlyProtocol("B2Bi-SFTP", "ApplicationAutomationSFTPh2p");
			Thread.sleep(2000);

			MAP.Actionsicon.click();
			Thread.sleep(1000);
			MAP.Editbtn.click();
			Thread.sleep(3000);
			MAP.EditSubmitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();

			if (title.equalsIgnoreCase("Application updated successfully")) {

				child85.log(LogStatus.PASS,
						"Validation successful because we are getting Applications with Protocol as B2Bi SFTP and type as H2P and edit");
			} else {
				child85.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting Applications with Protocol as B2Bi SFTP and type as H2P and edit");
			}
		} catch (Exception e) {
			child85.log(LogStatus.FAIL, e.fillInStackTrace());
			String title2 = MAP.ErrorMsg.getText();
			child85.log(LogStatus.INFO, title2);
		}
		_extent_report.endTest(child85);
	}

	@Test(priority = 87, enabled = false, description = "Manage Application Page Search Result Verification with Protocol as B2Bi SFTP and type as H2P and Activitylog")
	public void ManageApplicationPageTestWithProtocolasSFTPH2PandActivitylog() throws Throwable {
		child86 = _extent_report.startTest(
				"Manage Application Page Search Result Verification with Protocol as B2Bi SFTP and type as H2P and Activitylog");
		child86.assignCategory("Manage Application");

		try {
			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("B2Bi-SFTP", "ApplicationAutomationSFTPh2p");
			Thread.sleep(2000);
			MAP.ValidateMpRecordWithViewActivity("ApplicationAutomationSFTPh2p", 2);
			Thread.sleep(2000);
			child86.log(LogStatus.INFO, MAP.ActivitylogData.toString());
			child86.log(LogStatus.PASS, "Validation successful because we are getting activity history");

			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			Thread.sleep(2000);
		}

		catch (Exception e) {
			child86.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child86);

	}

	@Test(priority = 88, enabled = false, description = "Manage Application Page Search Result Verification with Protocol as B2Bi SFTP and type as H2P and Activate")
	public void ManageApplicationPageTestWithProtocolasSFTPH2PandActivate() throws Throwable {
		child87 = _extent_report.startTest(
				"Manage Application Page Search Result Verification with Protocol as B2Bi SFTP and type as H2P and Activate");
		child87.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("B2Bi-SFTP", "ApplicationAutomationSFTPh2p");
			Thread.sleep(2000);
			MAP.Actionbtn.click();
			Thread.sleep(1000);
			MAP.ActivateClick.click();
			Thread.sleep(1000);
			MAP.yesActivateitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();
			System.out.println(title);
			if (title.equalsIgnoreCase("Status updated successfully")) {
				child87.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title + "' ");
			} else {
				child87.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child87.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child87);
	}

	@Test(priority = 89, enabled = false, description = "Manage Application Page Search Result Verification with Protocol as B2Bi SFTP and type as H2P and Deactivate")
	public void ManageApplicationPageTestWithProtocolasSFTPH2PandDeactivate() throws Throwable {
		child88 = _extent_report.startTest(
				"Manage Application Page Search Result Verification with Protocol as B2Bi SFTP and type as H2P and Deactivate");
		child88.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("B2Bi-SFTP", "ApplicationAutomationSFTPh2p");
			Thread.sleep(2000);
			MAP.Actionbtn.click();
			Thread.sleep(1000);
			MAP.DeactivateClick.click();
			Thread.sleep(1000);
			MAP.yesDeactivateitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();
			System.out.println(title);
			if (title.equalsIgnoreCase("Status updated successfully")) {
				child88.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title + "' ");
			} else {
				child88.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child88.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child88);
	}

	@Test(priority = 90, enabled = false, description = "Verifying Manage Application Page With Protocol as B2Bi SFTP and type as P2H")
	public void MPTestVerificationWithProtocolasSFTPP2H() throws Exception {
		child89 = _extent_report.startTest("Verifying Manage Application Page With Protocol as B2Bi SFTP and type as P2H");
		child89.assignCategory("Manage Application");

		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);

			MAP.validateManageApplicationWithOnlyProtocol("B2Bi-SFTP", "ApplicationAutomationSFTPp2h");

			Boolean flag = MAP.Actionsicon.isDisplayed();
			String title = flag.toString();
			System.out.println(title);

			if (title.contains("true")) {

				child89.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Protocol as B2Bi SFTP and type as P2H");
			} else {
				child89.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ "'  instead of 'Matches Found' ,when we Search with Protocol as B2Bi SFTP and type as P2H");
			}
		} catch (Exception e) {
			child89.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child89);

	}

	@Test(priority = 91, enabled = false, description = "Verifying Manage Application Page With Protocol as B2Bi SFTP and type as P2H and edit")
	public void MPTestVerificationWithProtocolasSFTPP2HandEdit() throws Exception {
		child90 = _extent_report
				.startTest("Verifying Manage Application Page With Protocol as B2Bi SFTP and type as P2H and edit");
		child90.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);

			MAP.validateManageApplicationWithOnlyProtocol("B2Bi-SFTP", "ApplicationAutomationSFTPp2h");
			Thread.sleep(2000);

			MAP.Actionsicon.click();
			Thread.sleep(1000);
			MAP.Editbtn.click();
			Thread.sleep(3000);
			MAP.EditSubmitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();

			if (title.equalsIgnoreCase("Application updated successfully")) {

				child90.log(LogStatus.PASS,
						"Validation successful because we are getting Applications with Protocol as B2Bi SFTP and type as P2H and edit");
			} else {
				child90.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting Applications with Protocol as B2Bi SFTP and type as P2H and edit");
			}
		} catch (Exception e) {
			child90.log(LogStatus.FAIL, e.fillInStackTrace());
			String title2 = MAP.ErrorMsg.getText();
			child90.log(LogStatus.INFO, title2);
		}
		_extent_report.endTest(child90);
	}

	@Test(priority = 92, enabled = false, description = "Manage Application Page Search Result Verification with Protocol as B2Bi SFTP and type as P2H and Activitylog")
	public void ManageApplicationPageTestWithProtocolasSFTPP2HandActivitylog() throws Throwable {
		child91 = _extent_report.startTest(
				"Manage Application Page Search Result Verification with Protocol as B2Bi SFTP and type as P2H and Activitylog");
		child91.assignCategory("Manage Application");

		try {
			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("B2Bi-SFTP", "ApplicationAutomationSFTPp2h");
			Thread.sleep(2000);
			MAP.ValidateMpRecordWithViewActivity("ApplicationAutomationSFTPp2h", 2);
			Thread.sleep(2000);
			child91.log(LogStatus.INFO, MAP.ActivitylogData.toString());
			child91.log(LogStatus.PASS, "Validation successful because we are getting activity history");

			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			Thread.sleep(2000);
		}

		catch (Exception e) {
			child91.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child91);

	}

	@Test(priority = 93, enabled = false, description = "Manage Application Page Search Result Verification with Protocol as B2Bi SFTP and type as P2H and Activate")
	public void ManageApplicationPageTestWithProtocolasSFTPP2HandActivate() throws Throwable {
		child92 = _extent_report.startTest(
				"Manage Application Page Search Result Verification with Protocol as B2Bi SFTP and type as P2H and Activate");
		child92.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("B2Bi-SFTP", "ApplicationAutomationSFTPp2h");
			Thread.sleep(2000);
			MAP.Actionbtn.click();
			Thread.sleep(1000);
			MAP.ActivateClick.click();
			Thread.sleep(1000);
			MAP.yesActivateitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();
			System.out.println(title);
			if (title.equalsIgnoreCase("Status updated successfully")) {
				child92.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title + "' ");
			} else {
				child92.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child92.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child92);
	}

	@Test(priority = 94, enabled = false, description = "Manage Application Page Search Result Verification with Protocol as B2Bi SFTP and type as P2H and Deactivate")
	public void ManageApplicationPageTestWithProtocolasSFTPP2HandDeactivate() throws Throwable {
		child93 = _extent_report.startTest(
				"Manage Application Page Search Result Verification with Protocol as B2Bi SFTP and type as P2H and Deactivate");
		child93.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("B2Bi-SFTP", "ApplicationAutomationSFTPp2h");
			Thread.sleep(2000);
			MAP.Actionbtn.click();
			Thread.sleep(1000);
			MAP.DeactivateClick.click();
			Thread.sleep(1000);
			MAP.yesDeactivateitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();
			System.out.println(title);
			if (title.equalsIgnoreCase("Status updated successfully")) {
				child93.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title + "' ");
			} else {
				child93.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child93.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child93);
	}

	

	@Test(priority = 95, enabled = false, description = "Verifying Manage Application Page With Protocol as FileSystem")
	public void MPTestVerificationWithProtocolasFileSystem() throws Exception {
		child94 = _extent_report.startTest("Verifying Manage Application Page With Protocol as FileSystem");
		child94.assignCategory("Manage Application");

		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);

			MAP.validateManageApplicationWithOnlyProtocol("FILESYSTEM", "ApplicationAutomationFileSystem");

			Boolean flag = MAP.Actionsicon.isDisplayed();
			String title = flag.toString();
			System.out.println(title);

			if (title.contains("true")) {

				child94.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Protocol as FileSystem");
			} else {
				child94.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ "'  instead of 'Matches Found' ,when we Search with Protocol as FileSystem");
			}
		} catch (Exception e) {
			child94.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child94);

	}

	@Test(priority = 96, enabled = false, description = "Verifying Manage Application Page With Protocol as FileSystem and edit")
	public void MPTestVerificationWithProtocolasFileSystemandEdit() throws Exception {
		child95 = _extent_report.startTest("Verifying Manage Application Page With Protocol as FileSystem and edit");
		child95.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);

			MAP.validateManageApplicationWithOnlyProtocol("FILESYSTEM", "ApplicationAutomationFileSystem");
			Thread.sleep(2000);

			MAP.Actionsicon.click();
			Thread.sleep(1000);
			MAP.Editbtn.click();
			Thread.sleep(3000);
			MAP.EditSubmitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();

			if (title.equalsIgnoreCase("Application updated successfully")) {

				child95.log(LogStatus.PASS,
						"Validation successful because we are getting Applications with Protocol as FileSystem and edit");
			} else {
				child95.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting Applications with Protocol as FileSystem and edit");
			}
		} catch (Exception e) {
			child95.log(LogStatus.FAIL, e.fillInStackTrace());
			String title2 = MAP.ErrorMsg.getText();
			child95.log(LogStatus.INFO, title2);
		}
		_extent_report.endTest(child95);
	}

	@Test(priority = 97, enabled = false, description = "Manage Application Page Search Result Verification with Protocol as FileSystem and Activitylog")
	public void ManageApplicationPageTestWithProtocolasFileSystemandActivitylog() throws Throwable {
		child96 = _extent_report.startTest(
				"Manage Application Page Search Result Verification with Protocol as FileSystem and Activitylog");
		child96.assignCategory("Manage Application");

		try {
			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("FILESYSTEM", "ApplicationAutomationFileSystem");
			Thread.sleep(2000);
			MAP.ValidateMpRecordWithViewActivity("ApplicationAutomationFileSystem", 2);
			Thread.sleep(2000);
			child96.log(LogStatus.INFO, MAP.ActivitylogData.toString());
			child96.log(LogStatus.PASS, "Validation successful because we are getting activity history");

			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			Thread.sleep(2000);
		}

		catch (Exception e) {
			child96.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child96);

	}

	@Test(priority = 98, enabled = false, description = "Manage Application Page Search Result Verification with Protocol as FileSystem and Activate")
	public void ManageApplicationPageTestWithProtocolasFileSystemandActivate() throws Throwable {
		child97 = _extent_report
				.startTest("Manage Application Page Search Result Verification with Protocol as FileSystem and Activate");
		child97.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("FILESYSTEM", "ApplicationAutomationFileSystem");
			Thread.sleep(2000);
			MAP.Actionbtn.click();
			Thread.sleep(1000);
			MAP.ActivateClick.click();
			Thread.sleep(1000);
			MAP.yesActivateitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();
			System.out.println(title);
			if (title.equalsIgnoreCase("Status updated successfully")) {
				child97.log(LogStatus.PASS,
						"Validation successful because we are getting message as '" + title + "' ");
			} else {
				child97.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child97.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child97);
	}

	@Test(priority = 99, enabled = false, description = "Manage Application Page Search Result Verification with Protocol as FileSystem and Deactivate")
	public void ManageApplicationPageTestWithProtocolasFileSystemandDeactivate() throws Throwable {
		child98 = _extent_report
				.startTest("Manage Application Page Search Result Verification with Protocol as FileSystem and Deactivate");
		child98.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("FILESYSTEM", "ApplicationAutomationFileSystem");
			Thread.sleep(2000);
			MAP.Actionbtn.click();
			Thread.sleep(1000);
			MAP.DeactivateClick.click();
			Thread.sleep(1000);
			MAP.yesDeactivateitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();
			System.out.println(title);
			if (title.equalsIgnoreCase("Status updated successfully")) {
				child98.log(LogStatus.PASS,
						"Validation successful because we are getting message as '" + title + "' ");
			} else {
				child98.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child98.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child98);
	}

	@Test(priority = 100, enabled = false, description = "Verifying Manage Application Page With Protocol as HTTP")
	public void MPTestVerificationWithProtocolasHTTP() throws Exception {
		child99 = _extent_report.startTest("Verifying Manage Application Page With Protocol as HTTP");
		child99.assignCategory("Manage Application");

		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);

			MAP.validateManageApplicationWithOnlyProtocol("HTTP", "ApplicationAutomationHTTP");

			Boolean flag = MAP.Actionsicon.isDisplayed();
			String title = flag.toString();
			System.out.println(title);

			if (title.contains("true")) {

				child99.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Protocol as HTTP");
			} else {
				child99.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ "'  instead of 'Matches Found' ,when we Search with Protocol as HTTP");
			}
		} catch (Exception e) {
			child99.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child99);

	}

	@Test(priority = 101, enabled = false, description = "Verifying Manage Application Page With Protocol as HTTP and edit")
	public void MPTestVerificationWithProtocolasHTTPandEdit() throws Exception {
		child100 = _extent_report.startTest("Verifying Manage Application Page With Protocol as HTTP and edit");
		child100.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);

			MAP.validateManageApplicationWithOnlyProtocol("HTTP", "ApplicationAutomationHTTP");
			Thread.sleep(2000);

			MAP.Actionsicon.click();
			Thread.sleep(1000);
			MAP.Editbtn.click();
			Thread.sleep(3000);
			MAP.EditSubmitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();

			if (title.equalsIgnoreCase("Application updated successfully")) {

				child100.log(LogStatus.PASS,
						"Validation successful because we are getting Applications with Protocol as HTTP and edit");
			} else {
				child100.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting Applications with Protocol as HTTP and edit");
			}
		} catch (Exception e) {
			child100.log(LogStatus.FAIL, e.fillInStackTrace());
			String title2 = MAP.ErrorMsg.getText();
			child100.log(LogStatus.INFO, title2);
		}
		_extent_report.endTest(child100);
	}

	@Test(priority = 102, enabled = false, description = "Manage Application Page Search Result Verification with Protocol as HTTP and Activitylog")
	public void ManageApplicationPageTestWithProtocolasHTTPandActivitylog() throws Throwable {
		child101 = _extent_report
				.startTest("Manage Application Page Search Result Verification with Protocol as HTTP and Activitylog");
		child101.assignCategory("Manage Application");

		try {
			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("HTTP", "ApplicationAutomationHTTP");
			Thread.sleep(2000);
			MAP.ValidateMpRecordWithViewActivity("ApplicationAutomationHTTP", 2);
			Thread.sleep(2000);
			child101.log(LogStatus.INFO, MAP.ActivitylogData.toString());
			child101.log(LogStatus.PASS, "Validation successful because we are getting activity history");

			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			Thread.sleep(2000);
		}

		catch (Exception e) {
			child101.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child101);

	}

	@Test(priority = 103, enabled = false, description = "Manage Application Page Search Result Verification with Protocol as HTTP and Activate")

	public void ManageApplicationPageTestWithProtocolasHTTPandActivate() throws Throwable {
		child102 = _extent_report
				.startTest("Manage Application Page Search Result Verification with Protocol as HTTP and Activate");
		child102.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("HTTP", "ApplicationAutomationHTTP");
			Thread.sleep(2000);
			MAP.Actionbtn.click();
			Thread.sleep(1000);
			MAP.ActivateClick.click();
			Thread.sleep(1000);
			MAP.yesActivateitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();
			System.out.println(title);
			if (title.equalsIgnoreCase("Status updated successfully")) {
				child102.log(LogStatus.PASS,
						"Validation successful because we are getting message as '" + title + "' ");
			} else {
				child102.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child102.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child102);
	}

	@Test(priority = 104, enabled = false, description = "Manage Application Page Search Result Verification with Protocol as HTTP and Deactivate")

	public void ManageApplicationPageTestWithProtocolasHTTPandDeactivate() throws Throwable {
		child103 = _extent_report
				.startTest("Manage Application Page Search Result Verification with Protocol as HTTP and Deactivate");
		child103.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("HTTP", "ApplicationAutomationHTTP");
			Thread.sleep(2000);
			MAP.Actionbtn.click();
			Thread.sleep(1000);
			MAP.DeactivateClick.click();
			Thread.sleep(1000);
			MAP.yesDeactivateitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();
			System.out.println(title);
			if (title.equalsIgnoreCase("Status updated successfully")) {
				child103.log(LogStatus.PASS,
						"Validation successful because we are getting message as '" + title + "' ");
			} else {
				child103.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child103.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child103);
	}

	@Test(priority = 105, enabled = false, description = "Verifying Manage Application Page With Protocol as HTTPS")
	public void

			MPTestVerificationWithProtocolasHTTPS() throws Exception {
		child104 = _extent_report.startTest("Verifying Manage Application Page With Protocol as HTTPS");
		child104.assignCategory("Manage Application");

		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);

			MAP.validateManageApplicationWithOnlyProtocol("HTTPS", "ApplicationAutomationHTTPS");

			Boolean flag = MAP.Actionsicon.isDisplayed();
			String title = flag.toString();
			System.out.println(title);

			if (title.contains("true")) {

				child104.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Protocol as HTTPS");
			} else {
				child104.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ "'  instead of 'Matches Found' ,when we Search with Protocol as HTTPS");
			}
		} catch (Exception e) {
			child104.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child104);

	}

	@Test(priority = 106, enabled = false, description = "Verifying Manage Application Page With Protocol as HTTPS and edit")
	public void MPTestVerificationWithProtocolasHTTPSandEdit() throws Exception {
		child105 = _extent_report.startTest("Verifying Manage Application Page With Protocol as HTTPS and edit");
		child105.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);

			MAP.validateManageApplicationWithOnlyProtocol("HTTPS", "ApplicationAutomationHTTPS");
			Thread.sleep(2000);

			MAP.Actionsicon.click();
			Thread.sleep(1000);
			MAP.Editbtn.click();
			Thread.sleep(3000);
			MAP.EditSubmitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();

			if (title.equalsIgnoreCase("Application updated successfully")) {

				child105.log(LogStatus.PASS,
						"Validation successful because we are getting Applications with Protocol as HTTPS and edit");
			} else {
				child105.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting Applications with Protocol as HTTPS and edit");
			}
		} catch (Exception e) {
			child105.log(LogStatus.FAIL, e.fillInStackTrace());
			String title2 = MAP.ErrorMsg.getText();
			child105.log(LogStatus.INFO, title2);
		}
		_extent_report.endTest(child105);
	}

	@Test(priority = 107, enabled = false, description = "Manage Application Page Search Result Verification with Protocol as HTTPS and Activitylog")
	public void ManageApplicationPageTestWithProtocolasHTTPSandActivitylog() throws Throwable {
		child106 = _extent_report
				.startTest("Manage Application Page Search Result Verification with Protocol as HTTPS and Activitylog");
		child106.assignCategory("Manage Application");

		try {
			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("HTTPS", "ApplicationAutomationHTTPS");
			Thread.sleep(2000);
			MAP.ValidateMpRecordWithViewActivity("ApplicationAutomationHTTPS", 2);
			Thread.sleep(2000);
			child106.log(LogStatus.INFO, MAP.ActivitylogData.toString());
			child106.log(LogStatus.PASS, "Validation successful because we are getting activity history");

			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			Thread.sleep(2000);
		}

		catch (Exception e) {
			child106.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child106);

	}

	@Test(priority = 108, enabled = false, description = "Manage Application Page Search Result Verification with Protocol as HTTPS and Activate")

	public void ManageApplicationPageTestWithProtocolasHTTPSandActivate() throws Throwable {
		child107 = _extent_report
				.startTest("Manage Application Page Search Result Verification with Protocol as HTTPS and Activate");
		child107.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("HTTPS", "ApplicationAutomationHTTPS");
			Thread.sleep(2000);
			MAP.Actionbtn.click();
			Thread.sleep(1000);
			MAP.ActivateClick.click();
			Thread.sleep(1000);
			MAP.yesActivateitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();
			System.out.println(title);
			if (title.equalsIgnoreCase("Status updated successfully")) {
				child107.log(LogStatus.PASS,
						"Validation successful because we are getting message as '" + title + "' ");
			} else {
				child107.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child107.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child107);
	}

	@Test(priority = 109, enabled = false, description = "Manage Application Page Search Result Verification with Protocol as HTTPS and Deactivate")

	public void ManageApplicationPageTestWithProtocolasHTTPSandDeactivate() throws Throwable {
		child108 = _extent_report
				.startTest("Manage Application Page Search Result Verification with Protocol as HTTPS and Deactivate");
		child108.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("HTTPS", "ApplicationAutomationHTTPS");
			Thread.sleep(2000);
			MAP.Actionbtn.click();
			Thread.sleep(1000);
			MAP.DeactivateClick.click();
			Thread.sleep(1000);
			MAP.yesDeactivateitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();
			System.out.println(title);
			if (title.equalsIgnoreCase("Status updated successfully")) {
				child108.log(LogStatus.PASS,
						"Validation successful because we are getting message as '" + title + "' ");
			} else {
				child108.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child108.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child108);
	}

	@Test(priority = 110, enabled = false, description = "Verifying Manage Application Page With Protocol as Mailbox")
	public void

			MPTestVerificationWithProtocolasMailbox() throws Exception {
		child109 = _extent_report.startTest("Verifying Manage Application Page With Protocol as Mailbox");
		child109.assignCategory("Manage Application");

		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);

			MAP.validateManageApplicationWithOnlyProtocol("MAILBOX", "ApplicationAutomationMailbox");

			Boolean flag = MAP.Actionsicon.isDisplayed();
			String title = flag.toString();
			System.out.println(title);

			if (title.contains("true")) {

				child109.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Protocol as Mailbox");
			} else {
				child109.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ "'  instead of 'Matches Found' ,when we Search with Protocol as Mailbox");
			}
		} catch (Exception e) {
			child109.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child109);

	}

	@Test(priority = 111, enabled = false, description = "Verifying Manage Application Page With Protocol as Mailbox and edit")
	public void MPTestVerificationWithProtocolasMailboxandEdit() throws Exception {
		child110 = _extent_report.startTest("Verifying Manage Application Page With Protocol as Mailbox and edit");
		child110.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);

			MAP.validateManageApplicationWithOnlyProtocol("MAILBOX", "ApplicationAutomationMailbox");
			Thread.sleep(2000);

			MAP.Actionsicon.click();
			Thread.sleep(1000);
			MAP.Editbtn.click();
			Thread.sleep(3000);
			MAP.EditSubmitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();

			if (title.equalsIgnoreCase("Application updated successfully")) {

				child110.log(LogStatus.PASS,
						"Validation successful because we are getting Applications with Protocol as Mailbox and edit");
			} else {
				child110.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting Applications with Protocol as Mailbox and edit");
			}
		} catch (Exception e) {
			child110.log(LogStatus.FAIL, e.fillInStackTrace());
			String title2 = MAP.ErrorMsg.getText();
			child110.log(LogStatus.INFO, title2);
		}
		_extent_report.endTest(child110);
	}

	@Test(priority = 112, enabled = false, description = "Manage Application Page Search Result Verification with Protocol as Mailbox and Activitylog")
	public void ManageApplicationPageTestWithProtocolasMailboxandActivitylog() throws Throwable {
		child111 = _extent_report
				.startTest("Manage Application Page Search Result Verification with Protocol as Mailbox and Activitylog");
		child111.assignCategory("Manage Application");

		try {
			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("MAILBOX", "ApplicationAutomationMailbox");
			Thread.sleep(2000);
			MAP.ValidateMpRecordWithViewActivity("ApplicationAutomationMailbox", 2);
			Thread.sleep(2000);
			child111.log(LogStatus.INFO, MAP.ActivitylogData.toString());
			child111.log(LogStatus.PASS, "Validation successful because we are getting activity history");

			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			Thread.sleep(2000);
		}

		catch (Exception e) {
			child111.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child111);

	}

	@Test(priority = 113, enabled = false, description = "Manage Application Page Search Result Verification with Protocol as Mailbox and Activate")
	public void ManageApplicationPageTestWithProtocolasMailboxandActivate() throws Throwable {
		child112 = _extent_report
				.startTest("Manage Application Page Search Result Verification with Protocol as Mailbox and Activate");
		child112.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("MAILBOX", "ApplicationAutomationMailbox");
			Thread.sleep(2000);
			MAP.Actionbtn.click();
			Thread.sleep(1000);
			MAP.ActivateClick.click();
			Thread.sleep(1000);
			MAP.yesActivateitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();
			System.out.println(title);
			if (title.equalsIgnoreCase("Status updated successfully")) {
				child112.log(LogStatus.PASS,
						"Validation successful because we are getting message as '" + title + "' ");
			} else {
				child112.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child112.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child112);
	}

	@Test(priority = 114, enabled = false, description = "Manage Application Page Search Result Verification with Protocol as Mailbox and Deactivate")

	public void ManageApplicationPageTestWithProtocolasMailboxandDeactivate() throws Throwable {
		child113 = _extent_report
				.startTest("Manage Application Page Search Result Verification with Protocol as Mailbox and Deactivate");
		child113.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("MAILBOX", "ApplicationAutomationMailbox");
			Thread.sleep(2000);
			MAP.Actionbtn.click();
			Thread.sleep(1000);
			MAP.DeactivateClick.click();
			Thread.sleep(1000);
			MAP.yesDeactivateitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();
			System.out.println(title);
			if (title.equalsIgnoreCase("Status updated successfully")) {
				child113.log(LogStatus.PASS,
						"Validation successful because we are getting message as '" + title + "' ");
			} else {
				child113.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child113.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child113);
	}

	@Test(priority = 115, enabled = false, description = "Verifying Manage Application Page With Protocol as MQ")
	public void MPTestVerificationWithProtocolasMQ() throws Exception {
		child114 = _extent_report.startTest("Verifying Manage Application Page With Protocol as MQ");
		child114.assignCategory("Manage Application");

		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);

			MAP.validateManageApplicationWithOnlyProtocol("MQ/JMS", "ApplicationAutomationMQ");

			Boolean flag = MAP.Actionsicon.isDisplayed();
			String title = flag.toString();
			System.out.println(title);

			if (title.contains("true")) {

				child114.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Protocol as MQ");
			} else {
				child114.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ "'  instead of 'Matches Found' ,when we Search with Protocol as MQ");
			}
		} catch (Exception e) {
			child114.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child114);

	}

	@Test(priority = 116, enabled = false, description = "Verifying Manage Application Page With Protocol as MQ and edit")
	public void MPTestVerificationWithProtocolasMQandEdit() throws Exception {
		child115 = _extent_report.startTest("Verifying Manage Application Page With Protocol as MQ and edit");
		child115.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);

			MAP.validateManageApplicationWithOnlyProtocol("MQ/JMS", "ApplicationAutomationMQ");
			Thread.sleep(2000);

			MAP.Actionsicon.click();
			Thread.sleep(1000);
			MAP.Editbtn.click();
			Thread.sleep(3000);
			MAP.EditSubmitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();

			if (title.equalsIgnoreCase("Application updated successfully")) {

				child115.log(LogStatus.PASS,
						"Validation successful because we are getting Applications with Protocol as MQ and edit");
			} else {
				child115.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting Applications with Protocol as MQ and edit");
			}
		} catch (Exception e) {
			child115.log(LogStatus.FAIL, e.fillInStackTrace());
			String title2 = MAP.ErrorMsg.getText();
			child115.log(LogStatus.INFO, title2);
		}
		_extent_report.endTest(child115);
	}

	@Test(priority = 117, enabled = false, description = "Manage Application Page Search Result Verification with Protocol as MQ and Activitylog")
	public void ManageApplicationPageTestWithProtocolasMQandActivitylog() throws Throwable {
		child116 = _extent_report
				.startTest("Manage Application Page Search Result Verification with Protocol as MQ and Activitylog");
		child116.assignCategory("Manage Application");

		try {
			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("MQ/JMS", "ApplicationAutomationMQ");
			Thread.sleep(2000);
			MAP.ValidateMpRecordWithViewActivity("ApplicationAutomationMQ", 2);
			Thread.sleep(2000);
			child116.log(LogStatus.INFO, MAP.ActivitylogData.toString());
			child116.log(LogStatus.PASS, "Validation successful because we are getting activity history");

			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			Thread.sleep(2000);
		}

		catch (Exception e) {
			child116.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child116);

	}

	@Test(priority = 118, enabled = false, description = "Manage Application Page Search Result Verification with Protocol as MQ and Activate")

	public void ManageApplicationPageTestWithProtocolasMQandActivate() throws Throwable {
		child117 = _extent_report
				.startTest("Manage Application Page Search Result Verification with Protocol as MQ and Activate");
		child117.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("MQ/JMS", "ApplicationAutomationMQ");
			Thread.sleep(2000);
			MAP.Actionbtn.click();
			Thread.sleep(1000);
			MAP.ActivateClick.click();
			Thread.sleep(1000);
			MAP.yesActivateitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();
			System.out.println(title);
			if (title.equalsIgnoreCase("Status updated successfully")) {
				child117.log(LogStatus.PASS,
						"Validation successful because we are getting message as '" + title + "' ");
			} else {
				child117.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child117.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child117);
	}

	@Test(priority = 119, enabled = false, description = "Manage Application Page Search Result Verification with Protocol as MQ and Deactivate")

	public void ManageApplicationPageTestWithProtocolasMQandDeactivate() throws Throwable {
		child118 = _extent_report
				.startTest("Manage Application Page Search Result Verification with Protocol as MQ and Deactivate");
		child118.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("MQ/JMS", "ApplicationAutomationMQ");
			Thread.sleep(2000);
			MAP.Actionbtn.click();
			Thread.sleep(1000);
			MAP.DeactivateClick.click();
			Thread.sleep(1000);
			MAP.yesDeactivateitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();
			System.out.println(title);
			if (title.equalsIgnoreCase("Status updated successfully")) {
				child118.log(LogStatus.PASS,
						"Validation successful because we are getting message as '" + title + "' ");
			} else {
				child118.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child118.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child118);
	}

	@Test(priority = 120, enabled = false, description = "Verifying Manage Application Page With Protocol as SAP")
	public void

			MPTestVerificationWithProtocolasSAP() throws Exception {
		child119 = _extent_report.startTest("Verifying Manage Application Page With Protocol as SAP");
		child119.assignCategory("Manage Application");

		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);

			MAP.validateManageApplicationWithOnlyProtocol("SAP", "ApplicationAutomationSAP");

			Boolean flag = MAP.Actionsicon.isDisplayed();
			String title = flag.toString();
			System.out.println(title);

			if (title.contains("true")) {

				child119.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Protocol as SAP");
			} else {
				child119.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ "'  instead of 'Matches Found' ,when we Search with Protocol as SAP");
			}
		} catch (Exception e) {
			child119.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child119);

	}

	@Test(priority = 121, enabled = false, description = "Verifying Manage Application Page With Protocol as SAP and edit")
	public void MPTestVerificationWithProtocolasSAPandEdit() throws Exception {
		child120 = _extent_report.startTest("Verifying Manage Application Page With Protocol as SAP and edit");
		child120.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);

			MAP.validateManageApplicationWithOnlyProtocol("SAP", "ApplicationAutomationSAP");
			Thread.sleep(2000);

			MAP.Actionsicon.click();
			Thread.sleep(1000);
			MAP.Editbtn.click();
			Thread.sleep(3000);
			MAP.EditSubmitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();

			if (title.equalsIgnoreCase("Application updated successfully")) {

				child120.log(LogStatus.PASS,
						"Validation successful because we are getting Applications with Protocol as SAP and edit");
			} else {
				child120.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting Applications with Protocol as SAP and edit");
			}
		} catch (Exception e) {
			child120.log(LogStatus.FAIL, e.fillInStackTrace());
			String title2 = MAP.ErrorMsg.getText();
			child120.log(LogStatus.INFO, title2);
		}
		_extent_report.endTest(child120);
	}

	@Test(priority = 122, enabled = false, description = "Manage Application Page Search Result Verification with Protocol as SAP and Activitylog")
	public void ManageApplicationPageTestWithProtocolasSAPandActivitylog() throws Throwable {
		child121 = _extent_report
				.startTest("Manage Application Page Search Result Verification with Protocol as SAP and Activitylog");
		child121.assignCategory("Manage Application");

		try {
			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("SAP", "ApplicationAutomationSAP");
			Thread.sleep(2000);
			MAP.ValidateMpRecordWithViewActivity("ApplicationAutomationSAP", 2);
			Thread.sleep(2000);
			child121.log(LogStatus.INFO, MAP.ActivitylogData.toString());
			child121.log(LogStatus.PASS, "Validation successful because we are getting activity history");

			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			Thread.sleep(2000);
		}

		catch (Exception e) {
			child121.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child121);

	}

	@Test(priority = 123, enabled = false, description = "Manage Application Page Search Result Verification with Protocol as SAP and Activate")

	public void ManageApplicationPageTestWithProtocolasSAPandActivate() throws Throwable {
		child122 = _extent_report
				.startTest("Manage Application Page Search Result Verification with Protocol as SAP and Activate");
		child122.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("SAP", "ApplicationAutomationSAP");
			Thread.sleep(2000);
			MAP.Actionbtn.click();
			Thread.sleep(1000);
			MAP.ActivateClick.click();
			Thread.sleep(1000);
			MAP.yesActivateitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();
			System.out.println(title);
			if (title.equalsIgnoreCase("Status updated successfully")) {
				child122.log(LogStatus.PASS,
						"Validation successful because we are getting message as '" + title + "' ");
			} else {
				child122.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child122.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child122);
	}

	@Test(priority = 124, enabled = false, description = "Manage Application Page Search Result Verification with Protocol as SAP and Deactivate")

	public void ManageApplicationPageTestWithProtocolasSAPandDeactivate() throws Throwable {
		child123 = _extent_report
				.startTest("Manage Application Page Search Result Verification with Protocol as SAP and Deactivate");
		child123.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("SAP", "ApplicationAutomationSAP");
			Thread.sleep(2000);
			MAP.Actionbtn.click();
			Thread.sleep(1000);
			MAP.DeactivateClick.click();
			Thread.sleep(1000);
			MAP.yesDeactivateitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();
			System.out.println(title);
			if (title.equalsIgnoreCase("Status updated successfully")) {
				child123.log(LogStatus.PASS,
						"Validation successful because we are getting message as '" + title + "' ");
			} else {
				child123.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child123.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child123);
	}

	@Test(priority = 125, enabled = false, description = "Verifying Manage Application Page With Protocol as WebService")
	public void MPTestVerificationWithProtocolasWebService() throws Exception {
		child124 = _extent_report.startTest("Verifying Manage Application Page With Protocol as WebService");
		child124.assignCategory("Manage Application");

		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);

			MAP.validateManageApplicationWithOnlyProtocol("WEBSERVICE", "ApplicationAutomationWebservice");

			Boolean flag = MAP.Actionsicon.isDisplayed();
			String title = flag.toString();
			System.out.println(title);

			if (title.contains("true")) {

				child124.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Protocol as WebService");
			} else {
				child124.log(LogStatus.FAIL,
						"Validation UnApplicationAutomationWebServicesuccessful because we are getting message as '" + title
								+ "'  instead of 'Matches Found' ,when we Search with Protocol as WebService");
			}
		} catch (Exception e) {
			child124.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child124);

	}

	@Test(priority = 126, enabled = false, description = "Verifying Manage Application Page With Protocol as WebService and edit")
	public void MPTestVerificationWithProtocolasWebServiceandEdit() throws Exception {
		child125 = _extent_report.startTest("Verifying Manage Application Page With Protocol as WebService and edit");
		child125.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);

			MAP.validateManageApplicationWithOnlyProtocol("WEBSERVICE", "ApplicationAutomationWebservice");
			Thread.sleep(2000);

			MAP.Actionsicon.click();
			Thread.sleep(1000);
			MAP.Editbtn.click();
			Thread.sleep(3000);
			MAP.EditSubmitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();

			if (title.equalsIgnoreCase("Application updated successfully")) {

				child125.log(LogStatus.PASS,
						"Validation successful because we are getting Applications with Protocol as WebService and edit");
			} else {
				child125.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting Applications with Protocol as WebService and edit");
			}
		} catch (Exception e) {
			child125.log(LogStatus.FAIL, e.fillInStackTrace());
			String title2 = MAP.ErrorMsg.getText();
			child125.log(LogStatus.INFO, title2);
		}
		_extent_report.endTest(child125);
	}

	@Test(priority = 127, enabled = false, description = "Manage Application Page Search Result Verification with Protocol as WebService and Activitylog")
	public void ManageApplicationPageTestWithProtocolasWebServiceandActivitylog() throws Throwable {
		child126 = _extent_report.startTest(
				"Manage Application Page Search Result Verification with Protocol as WebService and Activitylog");
		child126.assignCategory("Manage Application");

		try {
			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("WEBSERVICE", "ApplicationAutomationWebservice");
			Thread.sleep(2000);
			MAP.ValidateMpRecordWithViewActivity("ApplicationAutomationWebservice", 2);
			Thread.sleep(2000);
			child126.log(LogStatus.INFO, MAP.ActivitylogData.toString());
			child126.log(LogStatus.PASS, "Validation successful because we are getting activity history");

			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			Thread.sleep(2000);
		}

		catch (Exception e) {
			child126.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child126);

	}

	@Test(priority = 128, enabled = false, description = "Manage Application Page Search Result Verification with Protocol as WebService and Activate")
	public void ManageApplicationPageTestWithProtocolasWebServiceandActivate() throws Throwable {
		child127 = _extent_report
				.startTest("Manage Application Page Search Result Verification with Protocol as WebService and Activate");
		child127.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("WEBSERVICE", "ApplicationAutomationWebservice");
			Thread.sleep(2000);
			MAP.Actionbtn.click();
			Thread.sleep(1000);
			MAP.ActivateClick.click();
			Thread.sleep(1000);
			MAP.yesActivateitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();
			System.out.println(title);
			if (title.equalsIgnoreCase("Status updated successfully")) {
				child127.log(LogStatus.PASS,
						"Validation successful because we are getting message as '" + title + "' ");
			} else {
				child127.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child127.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child127);
	}

	@Test(priority = 129, enabled = false, description = "Manage Application Page Search Result Verification with Protocol as WebService and Deactivate")
	public void ManageApplicationPageTestWithProtocolasWebServiceandDeactivate() throws Throwable {
		child128 = _extent_report
				.startTest("Manage Application Page Search Result Verification with Protocol as WebService and Deactivate");
		child128.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.validateManageApplicationWithOnlyProtocol("WEBSERVICE", "ApplicationAutomationWebservice");
			Thread.sleep(2000);
			MAP.Actionbtn.click();
			Thread.sleep(1000);
			MAP.DeactivateClick.click();
			Thread.sleep(1000);
			MAP.yesDeactivateitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();
			System.out.println(title);
			if (title.equalsIgnoreCase("Status updated successfully")) {
				child128.log(LogStatus.PASS,
						"Validation successful because we are getting message as '" + title + "' ");
			} else {
				child128.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child128.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child128);
	}

	@Test(priority = 130, enabled = false, description = "Manage Application Page Search Result Verification with valid data and Delete")
	public void ManageApplicationPageTestWithValidDataDelete() throws Throwable {
		child129 = _extent_report
				.startTest("Manage Application Page Search Result Verification with valid data and Delete");
		child129.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);
			MAP.ValidateManageApplicationWithvalidData();
			Thread.sleep(2000);
			MAP.Actionbtn.click();
			Thread.sleep(1000);
			MAP.DeleteClick.click();

			MAP.yesDeleteitClick.click();
			Thread.sleep(1000);
			String title = MAP.ActionMsg.getText();

			if (title.equalsIgnoreCase("Application deleted successfully")) {
				child129.log(LogStatus.PASS,
						"Validation successful because we are getting message as '" + title + "' ");
			} else {
				child129.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child129.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child129);
	}

	@Test(priority = 131, enabled = false, description = "Manage Application Page Search Result Verification with search filter")
	public void ManageApplicationPageTestWithoutDataActivate() throws Throwable {
		child130 = _extent_report.startTest("Manage Application Page Search Result Verification with search filter");
		child130.assignCategory("Manage Application");
		try {

			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(2000);

			MAP.SearchClick.click();
			Thread.sleep(1000);

			driver.findElement(By.xpath("//input[@placeholder='Search ']")).sendKeys("ABCDE");
			Thread.sleep(1000);

			Boolean flag = MAP.Actionsicon.isDisplayed();
			String title = flag.toString();
			System.out.println(title);
			if (title.contains("true")) {

				child130.log(LogStatus.PASS,
						"Validation successful because we are getting Manage Application Page title as '" + title + "' ");
			} else {
				child130.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting Manage Application Page title as '" + title
								+ "' ");
			}
		} catch (Exception e) {
			child130.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child130);
	}

	@Test(priority = 132, enabled = false, description = "Manage Application Page Search Result Verification with Reset Search")
	public void ManageApplicationPageTestWithResetSearch() throws Throwable {
		child131 = _extent_report.startTest("Manage Application Page Search Result Verification with Reset Search");
		child131.assignCategory("Manage Application");
		try {
			Thread.sleep(2000);
			MAP.ResetClick.click();
			Thread.sleep(1000);
			MAP.ValidateManageApplicationWithvalidData();
			Thread.sleep(1000);
			MAP.ResetClick.click();
			Thread.sleep(3000);
			if (MAP.ApplicationNameData.getText().isEmpty() && MAP.ApplicationIdData.getText().isEmpty()
					&& MAP.StatusDD.getText() != null) {

				child131.log(LogStatus.PASS,
						"Validation successful because Reset Search is Resetting All the Fields in Manage Application Page");
			} else {
				child131.log(LogStatus.FAIL,
						"Validation Unsuccessful because Reset Search is not Resetting All the Fields in Manage Application page");
			}

		} catch (Exception e) {
			child131.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child131);
	}

	@AfterTest
	public void tearDown() throws Exception {

		_test_logger5.appendChild(Parent12);

		Parent12.appendChild(child1).appendChild(child2).appendChild(child3).appendChild(child4).appendChild(child5)
				.appendChild(child6).appendChild(child7).appendChild(child8).appendChild(child9).appendChild(child10)
				.appendChild(child11).appendChild(child12).appendChild(child13).appendChild(child14)
				.appendChild(child15).appendChild(child16).appendChild(child17).appendChild(child18)
				.appendChild(child19).appendChild(child20).appendChild(child21).appendChild(child22)
				.appendChild(child23).appendChild(child24).appendChild(child25).appendChild(child26)
				.appendChild(child27).appendChild(child28).appendChild(child29).appendChild(child30)
				.appendChild(child31).appendChild(child32).appendChild(child33).appendChild(child34)
				.appendChild(child35).appendChild(child36).appendChild(child37).appendChild(child38)
				/*.appendChild(child39).appendChild(child40).appendChild(child41).appendChild(child42)
				.appendChild(child43).appendChild(child44).appendChild(child45).appendChild(child46)
				.appendChild(child47).appendChild(child48).appendChild(child49).appendChild(child50)
				.appendChild(child51).appendChild(child52).appendChild(child53).appendChild(child54)
				.appendChild(child55).appendChild(child56) .appendChild(child57).appendChild(child58)
				.appendChild(child59).appendChild(child60) .appendChild(child61) .appendChild(child62)
				.appendChild(child63).appendChild(child64).appendChild(child65).appendChild(child66)
				.appendChild(child67).appendChild(child68).appendChild(child69).appendChild(child70)
				.appendChild(child71).appendChild(child72).appendChild(child73).appendChild(child74)
				.appendChild(child75).appendChild(child76).appendChild(child77).appendChild(child78)
				.appendChild(child79).appendChild(child80).appendChild(child81).appendChild(child82)
				.appendChild(child83).appendChild(child84).appendChild(child85).appendChild(child86)
				.appendChild(child87).appendChild(child88).appendChild(child89).appendChild(child90)
				.appendChild(child91).appendChild(child92).appendChild(child93).appendChild(child94)
				.appendChild(child95).appendChild(child96).appendChild(child97).appendChild(child98)
				.appendChild(child99).appendChild(child100).appendChild(child101).appendChild(child102)
				.appendChild(child103).appendChild(child104).appendChild(child105).appendChild(child106)
				.appendChild(child107).appendChild(child108).appendChild(child109).appendChild(child110)
				.appendChild(child111).appendChild(child112).appendChild(child113).appendChild(child114)
				.appendChild(child115).appendChild(child116).appendChild(child117).appendChild(child118)
				.appendChild(child119).appendChild(child120).appendChild(child121).appendChild(child122)
				.appendChild(child123).appendChild(child124).appendChild(child125).appendChild(child126)
				.appendChild(child127).appendChild(child128).appendChild(child129).appendChild(child130)
				.appendChild(child131)*/;

		_extent_report.endTest(Parent12);

		_extent_report.endTest(_test_logger5);
		_extent_report.flush();

	}

}