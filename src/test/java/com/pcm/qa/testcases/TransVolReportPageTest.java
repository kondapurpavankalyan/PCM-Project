package com.pcm.qa.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pcm.qa.base.TestBase;
//import com.pcm.qa.pages.SearchPage;
import com.pcm.qa.pages.TransVolReportPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TransVolReportPageTest extends TestBase {

	TransVolReportPage TVRP;
	TransVolReportPageTest TVRPT;

	public ExtentTest Parent3;
	public ExtentTest child1;
	public ExtentTest child2;
	public ExtentTest child3;
	public ExtentTest child4;

	public TransVolReportPageTest() {
		super();
	}

	@BeforeTest(enabled = false)
	public void setup() throws Exception {

		Extentreport();
		initialization();

	}

	@BeforeMethod
	public void setUp() throws InterruptedException {

		TVRP = new TransVolReportPage();
		TVRPT = new TransVolReportPageTest();

	}

	@Test(priority = 1, enabled = true)
	public void ParentNodeCreation() {

		_test_logger2 = _extent_report.startTest("Reports");
		Parent3 = _extent_report.startTest("Transaction Volume Report");

	}

	@Test(priority = 2, enabled = true, description = "Transaction Volume Report Page Title Verification")
	public void ATransVolReportTitleTest() throws Exception {

		child1 = _extent_report.startTest("Transaction Volume Report Page Title Verification");
		child1.assignCategory("Transaction Volume Report");

		try {

			Thread.sleep(2000);
		//	 TVRP.ReportClick.click();
			String title = TVRP.validateTransVolReportPageTitle();
			if (title.equals("Transaction Volume Reports")) {

				child1.log(LogStatus.PASS,
						"Validation successful because we are getting Transaction Volume Report page title as '" + title
								+ ";");

			} else {

				child1.log(LogStatus.FAIL,
						"Validation Unsuccessful because we are getting Transaction Volume Report page title as '"
								+ title + "' instead of Search Volume Reports");

			}
		} catch (Exception e) {

			child1.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child1);

	}

	@Test(priority = 3, enabled = true, description = "Transaction Volume Report Page Search Result Verification with Invalid Data")
	public void BValidateTransVolReportPageSearchErrorResultsVerification() throws InterruptedException {

		child2 = _extent_report
				.startTest("Transaction Volume Report Page Search Result Verification With Invalid Data");
		child2.assignCategory("Transaction Volume Report");

		try {

			Thread.sleep(2000);
			TVRP.ResetSearchClick.click();
			Thread.sleep(2000);
			TVRP.ValidatTransVolReportResultWithInvalidData();
			Thread.sleep(5000);
			String title = TVRP.ErrorMsg.getText();
			if (title.equals("No results found !")) {

				child2.log(LogStatus.PASS, "Validation successful because '" + title
						+ "' text is being displayed when we search with invalid data");

			} else {

				child2.log(LogStatus.FAIL, "Validation Unsuccessful because '" + title
						+ "' text is being displayed instead of 'No Data to Display' when we search with invalid data");

			}
		} catch (Exception e) {

			child2.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child2);

	}

	@Test(priority = 4, enabled = true, description = "Transaction Volume Report Page Search Result Verification with valid Data")
	public void AValidateTransVolReportPageSearchResultsVerification() throws InterruptedException {

		child3 = _extent_report.startTest("Transaction Volume Report Page Search Result Verification With valid Data");
		child3.assignCategory("Transaction Volume Report");

		try {

			Thread.sleep(2000);
			TVRP.ResetSearchClick.click();
			Thread.sleep(2000);
			TVRP.ValidatTransVolReportResultWithvalidData();
			Thread.sleep(5000);
			String screenShotPath = takeScreenshotAtEndOfTest(driver, "translvolreportfinal");
			child3.log(LogStatus.PASS, "Snapshot below: " + child3.addScreenCapture(screenShotPath));

		} catch (Exception e) {

			child3.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child3);

	}

	@Test(priority = 5, enabled = true, description = "Transaction Volume Report Page Search Result Verification with Invalid format Data")
	public void BValidateTransVolReportPageSearchResultsVerificationWithInvalidFormat() throws InterruptedException {

		child4 = _extent_report
				.startTest("Transaction Volume Report Page Search Result Verification With Invalid format Data");
		child4.assignCategory("Transaction Volume Report");

		try {

			Thread.sleep(2000);
			TVRP.ResetSearchClick.click();
			Thread.sleep(2000);
			TVRP.ValidatTransVolReportResultWithInvalidFormat();

			Thread.sleep(5000);
			String title = TVRP.ErrorMsg1.getText();
			driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
			if (title.contains("(*) field are required to submit")) {

				child4.log(LogStatus.PASS, "Validation successful because '" + title
						+ "' text is being displayed when we search with invalid data");

			} else {

				child4.log(LogStatus.FAIL, "Validation Unsuccessful because '" + title
						+ "' text is being displayed instead of 'No Data to Display' when we search with invalid data");

			}

			TVRP.Error1MessageOkclick.click();

		} catch (Exception e) {

			child4.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child4);

	}

	@AfterTest
	public void tearDown() {

		_test_logger2.appendChild(Parent3);

		Parent3.appendChild(child1).appendChild(child2).appendChild(child3).appendChild(child4);

		_extent_report.endTest(Parent3);

		 _extent_report.endTest(_test_logger2);

		_extent_report.flush();

	}

}
