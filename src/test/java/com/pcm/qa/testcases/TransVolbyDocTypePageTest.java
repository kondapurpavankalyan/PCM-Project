package com.pcm.qa.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pcm.qa.base.TestBase;
import com.pcm.qa.pages.TransVolbyDocTypePage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TransVolbyDocTypePageTest extends TestBase {

	TransVolbyDocTypePage TVDTP;
	TransVolbyDocTypePageTest TVDTPT;

	public ExtentTest Parent4;
	public ExtentTest child1;
	public ExtentTest child2;
	public ExtentTest child3;
	public ExtentTest child4;

	public TransVolbyDocTypePageTest() {
		super();
	}

	@BeforeTest(enabled = false)
	public void setup() throws Exception {

		Extentreport();
		initialization();
		
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {

		TVDTP = new TransVolbyDocTypePage();
		TVDTPT = new TransVolbyDocTypePageTest();
	}

	@Test(priority = 1, enabled = true)
	public void ParentNodeCreation() {

		_test_logger2 = _extent_report.startTest("Reports");
		Parent4 = _extent_report.startTest("Transaction Volume By DocType");
		
	}

	@Test(priority = 2, enabled = true, description = "Verifying Transactions Volumes By DocType Page Title")
	public void TransVolbyDocTypePageTitleTest() throws Exception {
	
		child1 = _extent_report.startTest("Transaction Volume By DocType Page Title Verification");
		child1.assignCategory("Transaction Volume By DocType");
		
		try {
			
			Thread.sleep(2000);
	//		TVDTP.ReportClick.click();
			String title = TVDTP.validateTransVolbyDocTypePageTitle();
			if (title.equals("Document Type Reports")) {
				
				child1.log(LogStatus.PASS,
						"Validation successful because we are getting TransVolbyDocTypePage title as '" + title + ";");
				
			} else {
				
				child1.log(LogStatus.FAIL,
						"Validation Unsuccessful because we are getting TransVolbyDocTypePage title as '" + title
								+ "' instead of Search DocType Reports");
			}
		} catch (Exception e) {
			
			child1.log(LogStatus.FAIL, e.fillInStackTrace());
			
		}
		
		_extent_report.endTest(child1);
		
	}

	@Test(priority = 3, enabled = true, description = "Verifying Transactions Volumes By DocType Page Search with  Invalid Data")
	public void AValidateTransVolReportPageSearchErrorResultsVerification() throws InterruptedException {
	
		child2 = _extent_report
				.startTest("Verifying Transactions Volumes By DocType Page Search with  Invalid Data");
		child2.assignCategory("Transaction Volume By DocType");
		
		try {
			
			Thread.sleep(2000);
			TVDTP.ResetSearchClick.click();
			Thread.sleep(2000);
			TVDTP.ValidatTransVolbyDocTypeResultWithInvalidData();
			Thread.sleep(1000);

			String title = TVDTP.ErrorMsg.getText();
			if (title.equals("No results found !")) {
				
				child2.log(LogStatus.PASS, "Validation successful because '" + title
						+ "' text is being displayed when we search with invalid data");
				
			} else {
				
				child2.log(LogStatus.FAIL, "Validation Unsuccessful because '" + title
						+ "' text is being displayed instead of 'No data' when we search with invalid data");
				
			}
		} catch (Exception e) {
			
			child2.log(LogStatus.FAIL, e.fillInStackTrace());
			
		}
		_extent_report.endTest(child2);
	}

	@Test(priority = 4, enabled = true, description = "Verifying Transactions Volumes By DocType Page Search with  Valid Data")
	public void BValidateTransVolReportPageSearchResultsVerification() throws InterruptedException {
		
		child3 = _extent_report.startTest("Verifying Transactions Volumes By DocType Page Search with  Valid Data");
		child3.assignCategory("Transaction Volume By DocType");
		
		try {
			
			Thread.sleep(2000);
			TVDTP.ResetSearchClick.click();
			Thread.sleep(2000);

			TVDTP.ValidatTransVolbyDocTypeResultWithvalidData();
			Thread.sleep(5000);
			String screenShotPath = takeScreenshotAtEndOfTest(driver, "translDocTypeReportfinal");
			child3.log(LogStatus.PASS, "Snapshot below: " + child3.addScreenCapture(screenShotPath));

		} catch (Exception e) {
			
			child3.log(LogStatus.FAIL, e.fillInStackTrace());
			
		}
		
		_extent_report.endTest(child3);
		
	}

	@Test(priority = 5, enabled = true, description = "Transaction Volume By DocType Page Search Result Verification with Invalid format Data")
	public void AValidateTransVolReportPageSearchResultsVerificationWithInvalidFormat() throws InterruptedException {
		
		child4 = _extent_report
				.startTest("Transaction Volume Report Page Search Result Verification With Invalid format Data");
		child4.assignCategory("Transaction Volume By DocType");
		
		try {
			
			Thread.sleep(2000);
			TVDTP.ResetSearchClick.click();
			Thread.sleep(2000);
			TVDTP.ValidatTransVolbyDocTypeResultWithInvalidFormat();
			Thread.sleep(1000);
			String title = TVDTP.ErrorMsg1.getText();
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

		_test_logger2.appendChild(Parent4);

		Parent4.appendChild(child1).appendChild(child2).appendChild(child3).appendChild(child4);

		_extent_report.endTest(Parent4);

		_extent_report.endTest(_test_logger2);

		_extent_report.flush();

	}

}
