package com.pcm.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pcm.qa.base.TestBase;
import com.pcm.qa.pages.CreatePartnerPage;
import com.pcm.qa.pages.PollingIntervalPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class PollingIntervalPageTest extends TestBase {

	PollingIntervalPage PIP;
	PollingIntervalPageTest PIPT;
	CreatePartnerPage CPP;

	public ExtentTest Parent18;
	public ExtentTest child1;
	public ExtentTest child2;
	public ExtentTest child3;
	public ExtentTest child4;
	public ExtentTest child5;
	public ExtentTest child6;

	public PollingIntervalPageTest() {
		super();
	}

	@BeforeMethod
	public void beforeTest() {

		PIP = new PollingIntervalPage();
		PIPT = new PollingIntervalPageTest();
		CPP = new CreatePartnerPage();
	}

	@BeforeTest(enabled = false)
	public void setup() throws Exception {

		Extentreport();
		initialization();
	}

	@Test(priority = 1, enabled = true)
	public void ParentNodeCreation() {

//		_test_logger7 = _extent_report.startTest("Settings");
		Parent18 = _extent_report.startTest("pollingInterval");
	}

	@Test(priority = 2, enabled = true, description = "Verifying polling Interval Page Title")
	public void PoolingIntervalPageTitleTest() throws InterruptedException {

		child1 = _extent_report.startTest("Verifying polling Interval Page Title ");
		child1.assignCategory("Polling Interval");

		try {

			Thread.sleep(2000);
//			PIP.SettingClick.click();
			String title = PIP.ValidatePollingIntervalPageTitle();
			System.out.println(title);
			if (title.equals("Polling Interval")) {

				child1.log(LogStatus.PASS,
						"Validation successful because we are getting polling Interval Page title as '" + title + "'");

			} else {

				child1.log(LogStatus.FAIL,
						"Validation  unsuccessful because we are getting polling Interval Page title as '" + title
								+ "' instead of 'Polling Interval'");

			}
		} catch (Exception e) {

			child1.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child1);
	}

	@Test(priority = 3, enabled = true, description = "Verifying polling Interval Page with valid data")
	public void CorrelationNamesPagewithValiddata() throws InterruptedException {

		child2 = _extent_report.startTest("Verifying polling Interval Page with valid data");
		child2.assignCategory("PollingInterval");

		try {

			PIP.ValidatePollingIntervalwithValidData();
			String title = PIP.Actionmessage.getText();
			Thread.sleep(1000);
			System.out.println(title);
			Thread.sleep(1000);
			if (title.equals("Polling Intervals saved successfully")) {

				child2.log(LogStatus.PASS,
						"Validation successful because we are getting polling Interval Page with valid data as '"
								+ title + "'");

			} else {

				child2.log(LogStatus.FAIL,
						"Validation  unsuccessful because we are getting polling Interval Page with valid data as '"
								+ title + "' instead of 'polling Intervals saved successfully'");

			}
		} catch (Exception e) {

			child2.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child2);

	}

	@Test(priority = 4, enabled = true, description = "Verifying pooling Interval Page with Edit")
	public void CorrelationNamesPagewithEdit() throws InterruptedException {

		child3 = _extent_report.startTest("Verifying pooling Interval Page with Edit");
		child3.assignCategory("PollingInterval");

		try {

			PIP.CorrelationNamesClick.click();
			Thread.sleep(1000);
			PIP.PoolingIntervalClick.click();
			Thread.sleep(1000);
			PIP.ValidatePollingIntervalwithEdit();
			String title = PIP.Actionmessage.getText();
			Thread.sleep(1000);
			System.out.println(title);
			Thread.sleep(1000);
			if (title.equals("Polling Intervals saved successfully")) {

				child3.log(LogStatus.PASS,
						"Validation successful because we are getting pooling Interval Page with Edit as '" + title
								+ "'");

			} else {

				child3.log(LogStatus.FAIL,
						"Validation  unsuccessful because we are getting pooling Interval Page with Edit as '" + title
								+ "' instead of 'Pooling Intervals saved successfully'");

			}
		} catch (Exception e) {

			child3.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child3);

	}

	@Test(priority = 5, enabled = true, description = "Verifying pooling Interval Page with Delete")
	public void CorrelationNamesPagewithDelete() throws InterruptedException {

		child4 = _extent_report.startTest("Verifying pooling Interval Page with Delete");
		child4.assignCategory("PollingInterval");

		try {
			PIP.ValidatePollingIntervalwithDelete();
			String title = PIP.Actionmessage.getText();
			Thread.sleep(1000);
			System.out.println(title);
			Thread.sleep(1000);
			if (title.equals("Polling Intervals saved successfully")) {

				child4.log(LogStatus.PASS,
						"Validation successful because we are getting pooling Interval Page with Delete as '" + title
								+ "'");

			} else {

				child4.log(LogStatus.FAIL,
						"Validation  unsuccessful because we are getting pooling Interval Page with Delete as '" + title
								+ "' instead of 'Pooling Intervals saved successfully'");
			}
		} catch (Exception e) {

			child4.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child4);

	}

	@Test(priority = 6, enabled = true, description = "Verifying pooling Interval Page with EmptyFields")
	public void CorrelationNamesPagewithEmptyFields() throws InterruptedException {

		child5 = _extent_report.startTest("Verifying pooling Interval Page with EmptyFields");
		child5.assignCategory("PollingInterval");

		try {

			PIP.ValidatePollingIntervalwithEmptyFields();

			String title = PIP.Actionmessage.getText();

			System.out.println(title);
			Thread.sleep(1000);
			PIP.OkButtonClick.click();
			Thread.sleep(1000);
			PIP.CancelClick.click();
			Thread.sleep(1000);
			if (title.equals("(*) Fields are required to create")) {

				child5.log(LogStatus.PASS,
						"Validation successful because we are getting pooling Interval Page with EmptyFields as '"
								+ title + "'");

			} else {

				child5.log(LogStatus.FAIL,
						"Validation  unsuccessful because we are getting pooling Interval Page with EmptyFields as '"
								+ title + "' instead of 'Pooling Intervals saved successfully'");
			}

			Thread.sleep(2000);
			PIP.SavePoolingIntervalClick.click();

		} catch (Exception e) {

			child5.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child5);

	}

	@Test(priority = 7, enabled = false, description = "Verifying pooling Interval Page with DragandDrop")
	public void CorrelationNamesPagewithDragandDrop() throws InterruptedException {

		child6 = _extent_report.startTest("Verifying pooling Interval Page with DragandDrop");
		child6.assignCategory("PollingInterval");

		try {

			PIP.CorrelationNamesClick.click();
			Thread.sleep(1000);
			PIP.PoolingIntervalClick.click();
			Thread.sleep(1000);

			Thread.sleep(3000);

			String beforetext = driver.findElement(By.xpath("(//tr//td[3])[1]")).getText();

			Actions action = new Actions(driver);

			action.clickAndHold(driver.findElement(By.xpath("(//tr//td[3])[1]")))
					.moveToElement(driver.findElement(By.xpath("(//tr//td[3])[2]"))).release().build().perform();

			PIP.SavePoolingIntervalClick.click();

			String aftertext = driver.findElement(By.xpath("(//tr//td[3])[2]")).getText();

			if (aftertext.equals(beforetext)) {

				child6.log(LogStatus.PASS,
						"Validation successful because we are getting pooling Interval Page as arranged");

			} else {

				child6.log(LogStatus.FAIL,
						"Validation successful because we are not getting pooling Interval Page as arranged");

			}

			PIP.OkButtonClick.click();

		} catch (Exception e) {

			child6.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child6);

	}

	@AfterTest()
	public void tearDown() {

		_test_logger7.appendChild(Parent18);

		Parent18.appendChild(child1).appendChild(child2).appendChild(child3).appendChild(child4).appendChild(child5)
				/*.appendChild(child6)*/;

		_extent_report.endTest(Parent18);

//		_extent_report.endTest(_test_logger7);

		_extent_report.flush();

	}

}
