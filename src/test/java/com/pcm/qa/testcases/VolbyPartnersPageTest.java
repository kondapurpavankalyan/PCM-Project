package com.pcm.qa.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pcm.qa.base.TestBase;
import com.pcm.qa.pages.VolbyPartnersPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class VolbyPartnersPageTest extends TestBase {

	VolbyPartnersPage VPP;
	VolbyPartnersPageTest VPPT;

	public ExtentTest Parent5;
	public ExtentTest child1;
	public ExtentTest child2;
	public ExtentTest child3;
	public ExtentTest child4;

	public VolbyPartnersPageTest() {
		super();
	}

	@BeforeTest(enabled = false)
	public void setup() throws Exception {

		Extentreport();
		initialization();

	}

	@BeforeMethod
	public void setUp() throws InterruptedException {

		VPP = new VolbyPartnersPage();
		VPPT = new VolbyPartnersPageTest();
	}

	@Test(priority = 1, enabled = true)
	public void BParentNodeCreation() {

		_test_logger2 = _extent_report.startTest("Reports");
		Parent5 = _extent_report.startTest("Volume By Partners");

	}

	@Test(priority = 2, enabled = true, description = "Verifying Volumes By Partners Page Title")
	public void AvolbyPartnersPageTitleTest() throws Exception {

		child1 = _extent_report.startTest("Verifying Volumes By Partners Page Title");
		child1.assignCategory("Volume By Partners");

		try {

			Thread.sleep(2000);
//			VPP.ReportClick.click();
			String title = VPP.validateVolbyPartnersPageTitle();

			if (title.equals("Partners Volume Reports")) {

				child1.log(LogStatus.PASS,
						"Validation successful because we are getting volbyPartnersPage title as '" + title + "");

			} else {

				child1.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting volbyPartnersPage title as '"
						+ title + "' instead of Search Partners Reports");

			}
		} catch (Exception e) {

			child1.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child1);
	}

	@Test(priority = 3, enabled = true, description = "Verifying Volumes By Partners Page Search with  Invalid Data")
	public void BValidateTransVolReportPageSearchErrorResultsVerification() throws InterruptedException {

		child2 = _extent_report.startTest("Verifying Volumes By Partners Page Search with  Invalid Data");
		child2.assignCategory("Volume By Partners");

		try {

			Thread.sleep(2000);
			VPP.ResetSearchClick.click();
			Thread.sleep(2000);
			VPP.ValidatTransVolReportResultWithInvalidData();
			Thread.sleep(1000);
			String title = VPP.ErrorMsg.getText();
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

	@Test(priority = 4, enabled = true, description = "Verifying Volumes By Partners Page Search with  Valid Data")
	public void AValidateTransVolReportPageSearchResultsVerification() throws InterruptedException {

		child3 = _extent_report.startTest("Verifying Volumes By Partners Page Search with  Valid Data");
		child3.assignCategory("Volume By Partners");

		try {

			Thread.sleep(2000);
			VPP.ResetSearchClick.click();
			Thread.sleep(2000);
			VPP.ValidatTransVolReportResultWithvalidData();
			Thread.sleep(5000);
			String screenShotPath = takeScreenshotAtEndOfTest(driver, "transVolPartnerreportfinal");
			child3.log(LogStatus.PASS, "Snapshot below: " + child3.addScreenCapture(screenShotPath));

		} catch (Exception e) {

			child3.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child3);
	}

	@Test(priority = 5, enabled = true, description = "Volume By Partners Page Search Result Verification with Invalid format Data")
	public void BValidateTransVolReportPageSearchResultsVerificationWithInvalidFormat() throws InterruptedException {

		child4 = _extent_report
				.startTest("Transaction Volume Report Page Search Result Verification With Invalid format Data");
		child4.assignCategory("Volume By Partners");

		try {

			Thread.sleep(2000);
			VPP.ResetSearchClick.click();
			Thread.sleep(2000);
			VPP.ValidatTransVolReportResultWithInvalidFormat();

			Thread.sleep(5000);
			String title = VPP.ErrorMsg1.getText();
			driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
			if (title.contains("Invalid Form Submit")) {

				child4.log(LogStatus.PASS, "Validation successful because '" + title
						+ "' text is being displayed when we search with invalid data");

			} else {

				child4.log(LogStatus.FAIL, "Validation Unsuccessful because '" + title
						+ "' text is being displayed instead of 'dateFormatTransform(HH:mm:ss,dd-MMM-yy hh:mm:ss a) failed.' when we search with invalid data");

			}

		} catch (Exception e) {

			child4.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child4);
	}

	@AfterTest
	public void tearDown() {

		_test_logger2.appendChild(Parent5);

		Parent5.appendChild(child1).appendChild(child2).appendChild(child3).appendChild(child4);

		_extent_report.endTest(Parent5);

		_extent_report.endTest(_test_logger2);

		_extent_report.flush();

	}

}
