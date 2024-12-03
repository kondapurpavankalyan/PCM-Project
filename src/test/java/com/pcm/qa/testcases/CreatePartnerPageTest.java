package com.pcm.qa.testcases;

import org.testng.annotations.Test;

import com.jacob.com.LibraryLoader;
import com.pcm.qa.base.TestBase;
import com.pcm.qa.pages.CreatePartnerPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import autoitx4java.AutoItX;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class CreatePartnerPageTest extends TestBase {

	CreatePartnerPage CPP;
	CreatePartnerPageTest CPPT;
	public AutoItX x;

	public ExtentTest Parent9;
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

	public CreatePartnerPageTest() {
		super();
	}

	@BeforeTest(enabled = true)
	public void setup() throws Exception {

		Extentreport();
		initialization();

	}

	@BeforeMethod
	public void setUp() throws Exception {

		CPP = new CreatePartnerPage();
		CPPT = new CreatePartnerPageTest();

	}

	@Test(priority = 1, enabled = true)
	public void ParentNodeCreation() throws Exception {

		_test_logger4 = _extent_report.startTest("Partner");
		Parent9 = _extent_report.startTest("Create Partner");

	}

	@Test(priority = 2, enabled = true, description = "Create Partner Page Title Verification")
	public void CreatePartnerPageTitleTest() throws InterruptedException {

		child1 = _extent_report.startTest("Create Partner Page Title Verification");
		child1.assignCategory("Create Partner");
		try {
			Thread.sleep(2000);
			String title = CPP.validateCreatePartnerPageTitle();
			System.out.println(title);

			if (title.equals("Create Partner / Frontend Gateway")) {

				child1.log(LogStatus.PASS,
						"Validation successful because we are getting Create Partner Page title as '" + title + "'.");
			} else {
				child1.log(LogStatus.FAIL,
						"Validation  unsuccessful because we are getting Create Partner Page title as '" + title
								+ "' instead of Create Partner / Frontend Gateway");
			}
		} catch (Exception e) {
			child1.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child1);
	}

	@Test(priority = 3, enabled = true, description = "Verifying Create Partner Page With Protocol as Mandatory Field")
	public void ProtocolTestVerification() throws Throwable {
		child2 = _extent_report.startTest("Verifying Create Partner Page With Protocol as Mandatory Field");
		child2.assignCategory("Create Partner");
		try {
			CPP.Commondata();
			Thread.sleep(1000);

			CPP.SubmitClick.click();
			Thread.sleep(1000);
			String title = CPP.Actionmsg.getText();
			System.out.println(title);
			if (title.equals("(*) field are required to submit.")) {
				child2.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we submit with Partner Name as Mandatory Field'");
			} else {
				child2.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of 'Please select Protocol.' when we submit with Partner Name as Mandatory Field'");
			}

			CPP.Error1MessageOkclick.click();
			CPP.Cancelbtn.click();
			CPP.YesCancelitbtn.click();
			Thread.sleep(2000);
		} catch (Exception e) {
			child2.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child2);

	}

	///////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Test(priority = 4, enabled = true, description = "Verifying Create Partner Page With Protocol as AS2 and Organization Yes along with Valid Data")
	public void AS2YTestVerificationWithValidData() throws Throwable {
		child3 = _extent_report.startTest(
				"Verifying Create Partner Page With Protocol as AS2 and Organization Yes along with Valid Data");
		child3.assignCategory("Create Partner");
		try {
			Thread.sleep(2000);

			CPP.CreatePartnerClick.click();
			Thread.sleep(2000);
			CPP.ValidateAS2YWithValidData();
			Thread.sleep(1000);

			String title = CPP.Actionmsg.getText();
			System.out.println(title);
			if (title.contains("Partner created successfully")) {

				child3.log(LogStatus.PASS, "Validation successful because we are getting message as " + title
						+ "  when we submit With Protocol as AS2 and Organization as Yes along with Valid Data");
			}

			else if (title.contains(
					"could not execute statement; SQL [n/a]; constraint [SQLNSFG.OBJECT_NAME]; nested exception")) {

				Thread.sleep(3000);
				CPP.Error1MessageOkclick.click();
				Thread.sleep(3000);
				CPP.Cancelbtn.click();
				CPP.YesCancelitbtn.click();

				child3.log(LogStatus.FAIL, "Validation unsuccessful because we are getting message as " + title
						+ " instead of 'Partner / Producer Created Successfully' when we submit With Protocol as AS2 and Organization as Yes along with Valid Data");

			}

			else {

				child3.log(LogStatus.FAIL, "Validation unsuccessful because we are getting message as " + title
						+ " instead of 'Partner / Producer Created Successfully' when we submit With Protocol as AS2 and Organization as Yes along with Valid Data");
			}

		} catch (Exception e) {

			child3.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child3);

	}

	@Test(priority = 5, enabled = true, description = "Verifying Create Partner Page With protocol as AS2 and Organization as No, along with With Valid Data")
	public void AS2NTestVerificationWithValidData() throws Throwable {
		child4 = _extent_report.startTest(
				"Verifying Create Partner Page With protocol as AS2 and Organization as No, along With Valid Data");
		child4.assignCategory("Create Partner");
		Thread.sleep(2000);
		try {

			WebDriverWait wait = new WebDriverWait(driver, 10);

			WebElement createpart = wait.until(ExpectedConditions
					.elementToBeClickable(By.xpath("//div//mat-nav-list//span[contains(text(),'Create Partner')]")));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", createpart); // create partner

			Thread.sleep(2000);
			CPP.ValidateAS2NWithValidData();

			Thread.sleep(1000);
			String title = CPP.Actionmsg.getText();
			System.out.println(title);
			if (title.contains("Partner created successfully")) {
				child4.log(LogStatus.PASS, "Validation successful because we are getting message as " + title
						+ "  when we submit With Protocol as AS2 and Organization as No along with Valid Data");
			} else if (title.contains(
					"could not execute statement; SQL [n/a]; constraint [SQLNSFG.OBJECT_NAME]; nested exception")) {

				Thread.sleep(3000);
				CPP.Error1MessageOkclick.click();
				Thread.sleep(3000);
				CPP.Cancelbtn.click();
				CPP.YesCancelitbtn.click();

				child4.log(LogStatus.FAIL, "Validation unsuccessful because we are getting message as " + title
						+ " instead of 'Partner / Producer Created Successfully' when we submit With Protocol as AS2 and Organization as No along with Valid Data");

			}

			else {
				child4.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as " + title
						+ " instead of 'Partner / Producer Created Successfully' when we submit With Protocol as AS2 and Organization as No along with Valid Data");
			}
		} catch (Exception e) {

			child4.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child4);

	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Test(priority = 6, enabled = true, description = "Verifying Create Partner Page With protocol as AWS-S3 With Valid Data")
	public void ValidateAWS_S3WithValidData() throws Throwable {
		child5 = _extent_report.startTest("Verifying Create Partner Page With protocol as AWS-S3 With Valid Data");
		child5.assignCategory("Create Partner");
		try {
			Thread.sleep(2000);
			CPP.CreatePartnerClick.click();
			Thread.sleep(2000);
			CPP.CommondataAWSS3();
			Thread.sleep(2000);
			CPP.ValidateAWSS3WithValidData("AWS-S3", "Inactive", "1 Minute");

			String title = CPP.Actionmsg.getText();
			System.out.println(title);
			if (title.contains("Partner created successfully")) {

				child5.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "'  when we submit With Protocol as AWS-S3 along with Valid Data ");
			}

			else if (title.contains(
					"could not execute statement; SQL [n/a]; constraint [SQLNSFG.OBJECT_NAME]; nested exception")) {

				Thread.sleep(3000);
				CPP.Error1MessageOkclick.click();
				Thread.sleep(3000);
				CPP.Cancelbtn.click();
				CPP.YesCancelitbtn.click();

				child5.log(LogStatus.FAIL, "Validation unsuccessful because we are getting message as " + title
						+ " instead of 'Partner / Producer Created Successfully' when we submit With Protocol as AWS-S3 along with Valid Data");

			}

			else {
				child5.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as " + title
						+ " instead of 'Partner / Producer Created Successfully' when we submit With Protocol as AWS-S3 along with Valid Data");
			}
		} catch (Exception e) {
			child5.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child5);
	}

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Test(priority = 7, enabled = true, description = "Verifying Create Partner Page With protocol as B2bBi-Connect-Direct With SSP as Yes and secure as Enable")
	public void B2biCD_Y_EnableTestVerificationWithValidData() throws Throwable {
		child6 = _extent_report.startTest(
				"Verifying Create Partner Page With protocol as B2bBi-Connect-Direct With SSP as Yes and secure as Enable");
		child6.assignCategory("Create Partner");
		try {
			Thread.sleep(2000);
			CPP.CreatePartnerClick.click();
			Thread.sleep(2000);
			CPP.Commondata();
			Thread.sleep(1000);
			CPP.ValidateConnectDirectWithValidData("B2Bi-CONNECT-DIRECT", "Inactive", "Yes", "Enable", "1 Minute");
			Thread.sleep(1000);
			String title = CPP.Actionmsg.getText();
			System.out.println(title);
			if (title.contains("Partner created successfully")) {
				child6.log(LogStatus.PASS, "Validation successful because we are getting message as " + title
						+ "  when we submit With Protocol as Connect:Direct along with Valid Data");
			} else if (title.contains(
					"could not execute statement; SQL [n/a]; constraint [SQLNSFG.OBJECT_NAME]; nested exception")) {

				Thread.sleep(3000);
				CPP.Error1MessageOkclick.click();
				Thread.sleep(3000);
				CPP.Cancelbtn.click();
				CPP.YesCancelitbtn.click();

				child6.log(LogStatus.FAIL, "Validation unsuccessful because we are getting message as " + title
						+ " instead of 'Partner / Producer Created Successfully' when we submit With Protocol as Connect:Direct along with Valid Data");

			}

			else {
				child6.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as' " + title
						+ " 'instead of 'Partner created successfully' when we submit With Protocol as Connect:Direct along with Valid Data");
			}
		} catch (Exception e) {
			child6.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child6);

	}

	@Test(priority = 8, enabled = true, description = "Verifying Create Partner Page With protocol as B2bBi-Connect-Direct With SSP as Yes and secure as Disable")
	public void B2biCD_Y_DisableTestVerificationWithValidData() throws Throwable {
		child7 = _extent_report.startTest(
				"Verifying Create Partner Page With protocol as B2bBi-Connect-Direct With SSP as Yes and secure as Disable");
		child7.assignCategory("Create Partner");
		try {
			Thread.sleep(2000);
			CPP.CreatePartnerClick.click();
			Thread.sleep(2000);
			CPP.CommondataCDyes();
			Thread.sleep(1000);
			CPP.ValidateConnectDirectWithValidData("B2Bi-CONNECT-DIRECT", "Inactive", "Yes", "Disable", "1 Minute");
			Thread.sleep(1000);
			String title = CPP.Actionmsg.getText();
			System.out.println(title);
			if (title.contains("Partner created successfully")) {
				child7.log(LogStatus.PASS, "Validation successful because we are getting message as " + title
						+ "  when we submit With Protocol as Connect:Direct along with Valid Data");
			} else if (title.contains(
					"could not execute statement; SQL [n/a]; constraint [SQLNSFG.OBJECT_NAME]; nested exception")) {

				Thread.sleep(3000);
				CPP.Error1MessageOkclick.click();
				Thread.sleep(3000);
				CPP.Cancelbtn.click();
				CPP.YesCancelitbtn.click();

				child7.log(LogStatus.FAIL, "Validation unsuccessful because we are getting message as " + title
						+ " instead of 'Partner / Producer Created Successfully' when we submit With Protocol as Connect:Direct along with Valid Data");

			}

			else {
				child7.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as' " + title
						+ " 'instead of 'Partner created successfully' when we submit With Protocol as Connect:Direct along with Valid Data");
			}
		} catch (Exception e) {
			child7.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child7);

	}

	@Test(priority = 9, enabled = true, description = "Verifying Create Partner Page With protocol as B2bBi-Connect-Direct With SSP as No and secure as Enable")
	public void B2biCD_N_EnableTestVerificationWithValidData() throws Throwable {
		child8 = _extent_report.startTest(
				"Verifying Create Partner Page With protocol as B2bBi-Connect-Direct With SSP as No and secure as Enable");
		child8.assignCategory("Create Partner");
		try {
			Thread.sleep(2000);
			CPP.CreatePartnerClick.click();
			Thread.sleep(2000);
			CPP.Commondata();
			Thread.sleep(1000);
			CPP.ValidateConnectDirectWithValidData("B2Bi-CONNECT-DIRECT", "Inactive", "No", "Enable", "1 Minute");
			Thread.sleep(1000);
			String title = CPP.Actionmsg.getText();
			System.out.println(title);
			if (title.contains("Partner created successfully")) {
				child8.log(LogStatus.PASS, "Validation successful because we are getting message as " + title
						+ "  when we submit With Protocol as Connect:Direct along with Valid Data");
			} else if (title.contains(
					"could not execute statement; SQL [n/a]; constraint [SQLNSFG.OBJECT_NAME]; nested exception")) {

				Thread.sleep(3000);
				CPP.Error1MessageOkclick.click();
				Thread.sleep(3000);
				CPP.Cancelbtn.click();
				CPP.YesCancelitbtn.click();

				child8.log(LogStatus.FAIL, "Validation unsuccessful because we are getting message as " + title
						+ " instead of 'Partner / Producer Created Successfully' when we submit With Protocol as Connect:Direct along with Valid Data");

			}

			else {
				child8.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as' " + title
						+ " 'instead of 'Partner created successfully' when we submit With Protocol as Connect:Direct along with Valid Data");
			}
		} catch (Exception e) {
			child8.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child8);

	}

	@Test(priority = 10, enabled = true, description = "Verifying Create Partner Page With protocol as B2bBi-Connect-Direct With SSP as No and secure as Disable")
	public void B2biCD_N_DisableTestVerificationWithValidData() throws Throwable {
		child9 = _extent_report.startTest(
				"Verifying Create Partner Page With protocol as B2bBi-Connect-Direct With SSP as No and secure as Disable");
		child9.assignCategory("Create Partner");
		try {
			Thread.sleep(2000);
			CPP.CreatePartnerClick.click();
			Thread.sleep(2000);
			CPP.CommondataCDNo();
			Thread.sleep(1000);
			CPP.ValidateConnectDirectWithValidData("B2Bi-CONNECT-DIRECT", "Inactive", "No", "Disable", "1 Minute");
			Thread.sleep(1000);
			String title = CPP.Actionmsg.getText();
			System.out.println(title);
			if (title.contains("Partner created successfully")) {
				child9.log(LogStatus.PASS, "Validation successful because we are getting message as " + title
						+ "  when we submit With Protocol as Connect:Direct along with Valid Data");
			} else if (title.contains(
					"could not execute statement; SQL [n/a]; constraint [SQLNSFG.OBJECT_NAME]; nested exception")) {

				Thread.sleep(3000);
				CPP.Error1MessageOkclick.click();
				Thread.sleep(3000);
				CPP.Cancelbtn.click();
				CPP.YesCancelitbtn.click();

				child9.log(LogStatus.FAIL, "Validation unsuccessful because we are getting message as " + title
						+ " instead of 'Partner / Producer Created Successfully' when we submit With Protocol as Connect:Direct along with Valid Data");

			}

			else {
				child9.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as' " + title
						+ " 'instead of 'Partner created successfully' when we submit With Protocol as Connect:Direct along with Valid Data");
			}
		} catch (Exception e) {
			child9.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child9);

	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Test(priority = 11, enabled = true, description = "Verifying Create Partner Page With protocol as B2Bi-FTP H2P Verification With all Valid data")
	public void FTPH2PTestVerificationWithValidData() throws Throwable {
		child10 = _extent_report
				.startTest("Verifying Create Partner Page With protocol as B2Bi-FTP H2P with all valid data");
		child10.assignCategory("Create Partner");
		try {
			Thread.sleep(2000);
			CPP.CreatePartnerClick.click();
			Thread.sleep(2000);
			CPP.CommondataFTPH2P();
			CPP.ValidateFTPH2PWithValidData("B2Bi-FTP", "Inactive", "1 Minute");

			String title = CPP.Actionmsg.getText();
			System.out.println(title);
			if (title.contains("Partner created successfully")) {
				child10.log(LogStatus.PASS, "Validation successful because we are getting message as " + title
						+ "  when we submit With Protocol as B2Bi-FTP along with Valid Data");
			}

			else if (title.contains(
					"could not execute statement; SQL [n/a]; constraint [SQLNSFG.OBJECT_NAME]; nested exception")) {

				Thread.sleep(3000);
				CPP.Error1MessageOkclick.click();
				Thread.sleep(3000);
				CPP.Cancelbtn.click();
				CPP.YesCancelitbtn.click();

				child10.log(LogStatus.FAIL, "Validation unsuccessful because we are getting message as " + title
						+ " instead of 'Partner / Producer Created Successfully' when we submit With Protocol as B2Bi-FTP along with Valid Data");

			}

			else {
				child10.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as " + title
						+ " instead of 'Partner / Producer Created Successfully'  when we submit With Protocol as B2Bi-FTP along with Valid Data");
			}
		} catch (Exception e) {
			child10.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child10);
	}

	@Test(priority = 12, enabled = true, description = "Verifying Create Partner Page With protocol as B2Bi-FTP P2H Verification With all Valid data")
	public void FTPP2HTestVerificationWithValidData() throws Throwable {
		child11 = _extent_report
				.startTest("Verifying Create Partner Page With protocol as FTP P2H with all valid data");
		child11.assignCategory("Create Partner");
		try {
			Thread.sleep(2000);
			CPP.CreatePartnerClick.click();
			Thread.sleep(2000);
			CPP.CommondataFTPP2H();
			CPP.ValidateFTPP2HWithValidData("B2Bi-FTP", "Inactive", "1 Minute");

			String title = CPP.Actionmsg.getText();
			System.out.println(title);
			if (title.contains("Partner created successfully")) {
				child11.log(LogStatus.PASS, "Validation successful because we are getting message as " + title
						+ "  when we submit With Protocol as FTP along with Valid Data");
			} else if (title.contains(
					"could not execute statement; SQL [n/a]; constraint [SQLNSFG.OBJECT_NAME]; nested exception")) {

				Thread.sleep(3000);
				CPP.Error1MessageOkclick.click();
				Thread.sleep(3000);
				CPP.Cancelbtn.click();
				CPP.YesCancelitbtn.click();

				child11.log(LogStatus.FAIL, "Validation unsuccessful because we are getting message as " + title
						+ " instead of 'Partner / Producer Created Successfully' when we submit With Protocol as FTP along with Valid Data");

			}

			else {
				child11.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as " + title
						+ " instead of 'Partner / Producer Created Successfully'  when we submit With Protocol as FTP along with Valid Data");
			}
		} catch (Exception e) {
			child11.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child11);
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Test(priority = 13, enabled = true, description = "Verifying Create Partner Page With protocol as FTPS B2Bi-FTPS along with Valid Data")
	public void FTPSH2PTestVerificationwithValidData() throws Throwable {
		child12 = _extent_report
				.startTest("Verifying Create Partner Page With protocol as B2Bi-FTPS H2P along with Valid Data");
		child12.assignCategory("Create Partner");
		try {
			Thread.sleep(2000);
			CPP.CreatePartnerClick.click();
			Thread.sleep(2000);
			CPP.CommondataFTPSH2P();
			CPP.ValidateFTPSH2PWithValidData("B2Bi-FTPS", "Inactive", "1 Minute");
			Thread.sleep(1000);
			String title = CPP.Actionmsg.getText();
			System.out.println(title);
			if (title.contains("Partner created successfully")) {
				child12.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "'  when we submit With Protocol as B2Bi-FTPS along with Valid Data");
			}

			else if (title.contains(
					"could not execute statement; SQL [n/a]; constraint [SQLNSFG.OBJECT_NAME]; nested exception")) {

				Thread.sleep(3000);
				CPP.Error1MessageOkclick.click();
				Thread.sleep(3000);
				CPP.Cancelbtn.click();
				CPP.YesCancelitbtn.click();

				child12.log(LogStatus.FAIL, "Validation unsuccessful because we are getting message as " + title
						+ " instead of 'Partner / Producer Created Successfully' when we submit With Protocol as B2Bi-FTPS along with Valid Data");

			}

			else {
				child12.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ " 'instead of 'Partner / Producer Created Successfully' when we submit With Protocol as B2Bi-FTPS along with Valid Data");
			}
		} catch (Exception e) {
			child12.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child12);
	}

	@Test(priority = 14, enabled = true, description = "Verifying Create Partner Page With protocol as B2Bi-FTPS P2H along with Valid Data")
	public void FTPSP2HTestVerificationwithValidData() throws Throwable {
		child13 = _extent_report
				.startTest("Verifying Create Partner Page With protocol as B2Bi-FTPS P2H along with Valid Data");
		child13.assignCategory("Create Partner");
		try {
			Thread.sleep(2000);
			CPP.CreatePartnerClick.click();
			Thread.sleep(2000);
			CPP.CommondataFTPSP2H();
			CPP.ValidateFTPSP2HWithValidData("B2Bi-FTPS", "Inactive", "1 Minute");
			Thread.sleep(1000);
			String title = CPP.Actionmsg.getText();
			System.out.println(title);
			if (title.contains("Partner created successfully")) {
				child13.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "'  when we submit With Protocol as B2Bi-FTPS along with Valid Data");
			} else if (title.contains(
					"could not execute statement; SQL [n/a]; constraint [SQLNSFG.OBJECT_NAME]; nested exception")) {

				Thread.sleep(3000);
				CPP.Error1MessageOkclick.click();
				Thread.sleep(3000);
				CPP.Cancelbtn.click();
				CPP.YesCancelitbtn.click();

				child13.log(LogStatus.FAIL, "Validation unsuccessful because we are getting message as " + title
						+ " instead of 'Partner / Producer Created Successfully' when we submit With Protocol as B2Bi-FTPS along with Valid Data");

			}

			else {
				child13.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ " 'instead of 'Partner / Producer Created Successfully' when we submit With Protocol as B2Bi-FTPS along with Valid Data");
			}
		} catch (Exception e) {
			child13.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child13);
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Test(priority = 15, enabled = true, description = "Verifying Create Partner Page With protocol as B2Bi-SFTP H2P and Auth Type as Pwd along with valid data")
	public void SFTP_H2P_PwdTestVerificationWithValidData() throws Throwable {
		child14 = _extent_report.startTest(
				"Verifying Create Partner Page With protocol as B2Bi-SFTP H2P and Auth Type as Pwd along with valid data");
		child14.assignCategory("Create Partner");
		try {
			Thread.sleep(2000);
			CPP.CreatePartnerClick.click();
			Thread.sleep(2000);
			CPP.CommondataSFTPH2P();
			CPP.ValidateSFTP_H2P_PwdWithValidData("B2Bi-SFTP", "Inactive", "1 Minute");
			String title = CPP.Actionmsg.getText();
			System.out.println(title);
			if (title.contains("Partner created successfully")) {
				child14.log(LogStatus.PASS, "Validation successful because we are getting message as " + title
						+ "  when we submit With Protocol as B2Bi-SFTP along with Valid Data");
			}

			else if (title.contains(
					"could not execute statement; SQL [n/a]; constraint [SQLNSFG.OBJECT_NAME]; nested exception")) {

				Thread.sleep(3000);
				CPP.Error1MessageOkclick.click();
				Thread.sleep(3000);
				CPP.Cancelbtn.click();
				CPP.YesCancelitbtn.click();

				child14.log(LogStatus.FAIL, "Validation unsuccessful because we are getting message as " + title
						+ " instead of 'Partner / Producer Created Successfully' when we submit With Protocol as B2Bi-SFTP along with Valid Data");

			}

			else {
				child14.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as " + title
						+ "  instead of 'Partner / Producer Created Successfully'  when we submit With Protocol as B2Bi-SFTP along with Valid Data");
			}
		} catch (Exception e) {
			child14.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child14);
	}

	@Test(priority = 16, enabled = true, description = "Verifying Create Partner Page With protocol as B2Bi-SFTP H2P and Auth Type as Public key along with valid data")
	public void SFTP_H2P_PublickeyTestVerificationWithValidData() throws Throwable {
		child15 = _extent_report.startTest(
				"Verifying Create Partner Page With protocol as B2Bi-SFTP H2P and Auth Type as Public key along with valid data");
		child15.assignCategory("Create Partner");
		try {
			Thread.sleep(2000);
			CPP.CreatePartnerClick.click();
			Thread.sleep(2000);
			CPP.Commondata();
			CPP.ValidateSFTP_H2P_PublickeyWithValidData("B2Bi-SFTP", "Inactive", "1 Minute");
			String title = CPP.Actionmsg.getText();
			System.out.println(title);
			if (title.contains("Partner created successfully")) {
				child15.log(LogStatus.PASS, "Validation successful because we are getting message as " + title
						+ "  when we submit With Protocol as B2Bi-SFTP along with Valid Data");
			}

			else if (title.contains(
					"could not execute statement; SQL [n/a]; constraint [SQLNSFG.OBJECT_NAME]; nested exception")) {

				Thread.sleep(3000);
				CPP.Error1MessageOkclick.click();
				Thread.sleep(3000);
				CPP.Cancelbtn.click();
				CPP.YesCancelitbtn.click();

				child15.log(LogStatus.FAIL, "Validation unsuccessful because we are getting message as " + title
						+ " instead of 'Partner / Producer Created Successfully' when we submit With Protocol as B2Bi-SFTP along with Valid Data");

			}

			else {
				child15.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as " + title
						+ "  instead of 'Partner / Producer Created Successfully'  when we submit With Protocol as B2Bi-SFTP along with Valid Data");
			}
		} catch (Exception e) {
			child15.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child15);
	}

	@Test(priority = 17, enabled = true, description = "Verifying Create Partner Page With protocol as B2Bi-SFTP P2H and Auth Type as Pwd along with valid data")
	public void SFTP_P2H_PwdTestVerificationWithValidData() throws Throwable {
		child16 = _extent_report.startTest(
				"Verifying Create Partner Page With protocol as SFTP P2H and Auth Type as Pwd along with valid data");
		child16.assignCategory("Create Partner");
		try {
			Thread.sleep(2000);
			CPP.CreatePartnerClick.click();
			Thread.sleep(2000);
			CPP.CommondataSFTPP2H();
			CPP.ValidateSFTP_P2H_PwdWithValidData("B2Bi-SFTP", "Inactive", "1 Minute");
			String title = CPP.Actionmsg.getText();
			System.out.println(title);
			if (title.contains("Partner created successfully")) {
				child16.log(LogStatus.PASS, "Validation successful because we are getting message as " + title
						+ "  when we submit With Protocol as SFTP along with Valid Data");
			}

			else if (title.contains(
					"could not execute statement; SQL [n/a]; constraint [SQLNSFG.OBJECT_NAME]; nested exception")) {

				Thread.sleep(3000);
				CPP.Error1MessageOkclick.click();
				Thread.sleep(3000);
				CPP.Cancelbtn.click();
				CPP.YesCancelitbtn.click();

				child16.log(LogStatus.FAIL, "Validation unsuccessful because we are getting message as " + title
						+ " instead of 'Partner / Producer Created Successfully' when we submit With Protocol as B2Bi-SFTP along with Valid Data");

			}

			else {
				child16.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as " + title
						+ "  instead of 'Partner / Producer Created Successfully'  when we submit With Protocol as B2Bi-SFTP along with Valid Data");
			}
		} catch (Exception e) {
			child16.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child16);
	}

	@Test(priority = 18, enabled = true, description = "Verifying Create Partner Page With protocol as B2Bi-SFTP P2H and Auth Type as Public key along with valid data")
	public void SFTP_P2H_PublickeyTestVerificationWithValidData() throws Throwable {
		child17 = _extent_report.startTest(
				"Verifying Create Partner Page With protocol as SFTP P2H and Auth Type as Public key along with valid data");
		child17.assignCategory("Create Partner");
		try {
			Thread.sleep(2000);
			CPP.CreatePartnerClick.click();
			Thread.sleep(2000);
			CPP.Commondata();
			CPP.ValidateSFTP_P2H_PublickeyWithValidData("B2Bi-SFTP", "Inactive", "1 Minute");
			String title = CPP.Actionmsg.getText();
			System.out.println(title);
			if (title.contains("Partner created successfully")) {
				child17.log(LogStatus.PASS, "Validation successful because we are getting message as " + title
						+ "  when we submit With Protocol as SFTP along with Valid Data");
			}

			else if (title.contains(
					"could not execute statement; SQL [n/a]; constraint [SQLNSFG.OBJECT_NAME]; nested exception")) {

				Thread.sleep(3000);
				CPP.Error1MessageOkclick.click();
				Thread.sleep(3000);
				CPP.Cancelbtn.click();
				CPP.YesCancelitbtn.click();

				child17.log(LogStatus.FAIL, "Validation unsuccessful because we are getting message as " + title
						+ " instead of 'Partner / Producer Created Successfully' when we submit With Protocol as B2Bi-SFTP along with Valid Data");

			}

			else {
				child17.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as " + title
						+ "  instead of 'Partner / Producer Created Successfully'  when we submit With Protocol as B2Bi-SFTP along with Valid Data");
			}
		} catch (Exception e) {
			child17.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child17);
	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Test(priority = 19, enabled = true, description = "Verifying Create Partner Page With protocol as ExistingConnection  along with Valid Data ")
	public void ValidateExistingConnection() throws Throwable {
		child18 = _extent_report
				.startTest("Verifying Create Partner Page With protocol as ExistingConnection along with Valid Data ");
		child18.assignCategory("Create Partner");
		try {
			Thread.sleep(2000);
			CPP.CreatePartnerClick.click();
			Thread.sleep(2000);
			CPP.CommondataExistingConnection();
			Thread.sleep(2000);
			CPP.ValidateExistingConnectionWithValidData();

			String title = CPP.Actionmsg.getText();
			System.out.println(title);
			if (title.contains("Partner created successfully")) {

				child18.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "'  when we submit With Protocol as ExistingConnecion along with Valid Data ");
			}

			else if (title.contains(
					"could not execute statement; SQL [n/a]; constraint [SQLNSFG.OBJECT_NAME]; nested exception")) {

				Thread.sleep(3000);
				CPP.Error1MessageOkclick.click();
				Thread.sleep(3000);
				CPP.Cancelbtn.click();
				CPP.YesCancelitbtn.click();

				child18.log(LogStatus.FAIL, "Validation unsuccessful because we are getting message as " + title
						+ " instead of 'Partner / Producer Created Successfully' when we submit With Protocol as ExistingConnecion along with Valid Data");

			}

			else {
				child18.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ "' instead of 'Partner / Producer Created Successfully' when we submit With Protocol as ExistingConnecion along with Valid Data");
			}
		} catch (Exception e) {

			child18.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child18);
	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Test(priority = 20, enabled = true, description = "Verifying Create Partner Page With protocol as FileSystem With Valid Data")
	public void ValidateFileSystemWithValidData() throws Throwable {
		child19 = _extent_report.startTest("Verifying Create Partner Page With protocol as FileSystem With Valid Data");
		child19.assignCategory("Create Partner");
		try {
			Thread.sleep(2000);
			CPP.CreatePartnerClick.click();
			Thread.sleep(2000);

			CPP.CommondataFileSystem();
			CPP.ValidateFileSystemWithValidData("FileSystem", "Inactive", "1 Minute");

			String title = CPP.Actionmsg.getText();
			System.out.println(title);
			if (title.contains("Partner created successfully")) {

				child19.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "'  when we submit With Protocol as FileSystem along with Valid Data ");
			}

			else if (title.contains(
					"could not execute statement; SQL [n/a]; constraint [SQLNSFG.OBJECT_NAME]; nested exception")) {

				Thread.sleep(3000);
				CPP.Error1MessageOkclick.click();
				Thread.sleep(3000);
				CPP.Cancelbtn.click();
				CPP.YesCancelitbtn.click();

				child19.log(LogStatus.FAIL, "Validation unsuccessful because we are getting message as " + title
						+ " instead of 'Partner / Producer Created Successfully' when we submit With Protocol as FileSystem along with Valid Data");

			}

			else {
				child19.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as " + title
						+ " instead of 'Partner / Producer Created Successfully' when we submit With Protocol as FileSystem along with Valid Data");
			}
		} catch (Exception e) {
			child19.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child19);
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Test(priority = 21, enabled = true, description = "Verifying Create Partner Page With protocol as HTTP along with valid data")
	public void HTTPTestVerificationWithValidData() throws Throwable {
		child20 = _extent_report.startTest("Verifying Create Partner Page With protocol as HTTP along with valid data");
		child20.assignCategory("Create Partner");
		try {

			Thread.sleep(2000);
			CPP.CreatePartnerClick.click();
			Thread.sleep(2000);

			CPP.CommondataHTTP();
			CPP.ValidateHTTPWithValidData("HTTP", "Inactive", "1 Minute");

			String title = CPP.Actionmsg.getText();
			System.out.println(title);
			if (title.contains("Partner created successfully")) {
				child20.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "'    when we submit With Protocol as HTTP along with Valid Data");
			}

			else if (title.contains(
					"could not execute statement; SQL [n/a]; constraint [SQLNSFG.OBJECT_NAME]; nested exception")) {

				Thread.sleep(3000);
				CPP.Error1MessageOkclick.click();
				Thread.sleep(3000);
				CPP.Cancelbtn.click();
				CPP.YesCancelitbtn.click();

				child20.log(LogStatus.FAIL, "Validation unsuccessful because we are getting message as " + title
						+ " instead of 'Partner / Producer Created Successfully' when we submit With Protocol as HTTP along with Valid Data");

			} else {
				child20.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ "'   instead of 'Partner / Producer Created Successfully' when we submit With Protocol as HTTP along with Valid Data");
			}
		} catch (Exception e) {
			child20.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child20);
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	

	@Test(priority = 22, enabled = true, description = "Verifying Create Partner Page With protocol as HTTPS along with valid data")
	public void HTTPSTestVerificationwithValidData() throws Throwable {
		child21 = _extent_report
				.startTest("Verifying Create Partner Page With protocol as HTTPS along with valid data");
		child21.assignCategory("Create Partner");
		try {

			Thread.sleep(2000);
			CPP.CreatePartnerClick.click();
			Thread.sleep(2000);

			CPP.CommondataHTTPS();

			CPP.ValidateHTTPSWithValidData("HTTPS", "Inactive", "1 Minute");

			String title = CPP.Actionmsg.getText();
			System.out.println(title);
			if (title.contains("Partner created successfully")) {

				child21.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "'  when we submit With Protocol as HTTPS along with Valid Data");
			}

			else if (title.contains(
					"could not execute statement; SQL [n/a]; constraint [SQLNSFG.OBJECT_NAME]; nested exception")) {

				Thread.sleep(3000);
				CPP.Error1MessageOkclick.click();
				Thread.sleep(3000);
				CPP.Cancelbtn.click();
				CPP.YesCancelitbtn.click();

				child21.log(LogStatus.FAIL, "Validation unsuccessful because we are getting message as " + title
						+ " instead of 'Partner / Producer Created Successfully' when we submit With Protocol as HTTPS along with Valid Data");

			}

			else {
				child21.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ "' instead of 'Partner / Producer Created Successfully'  when we submit With Protocol as HTTPS along with Valid Data");
			}
		}

		catch (Exception e) {

			child21.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child21);
	}

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Test(priority = 23, enabled = true, description = "Verifying Create Partner Page With protocol as Mailbox along with valid data")
	public void MailboxTestVerification() throws Throwable {
		child22 = _extent_report
				.startTest("Verifying Create Partner Page With protocol as Mailbox along with valid data");
		child22.assignCategory("Create Partner");
		try {
			Thread.sleep(2000);
			CPP.CreatePartnerClick.click();
			Thread.sleep(2000);

			CPP.CommondataMailbox();

			CPP.ValidateMailboxWithValidData("MAILBOX", "Inactive", "1 Minute");

			String title = CPP.Actionmsg.getText();
			System.out.println(title);
			if (title.contains("Partner created successfully")) {

				child22.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "'  when we submit With Protocol as Mailbox along with Valid Data");
			} else if (title.contains(
					"could not execute statement; SQL [n/a]; constraint [SQLNSFG.OBJECT_NAME]; nested exception")) {

				Thread.sleep(3000);
				CPP.Error1MessageOkclick.click();
				Thread.sleep(3000);
				CPP.Cancelbtn.click();
				CPP.YesCancelitbtn.click();

				child22.log(LogStatus.FAIL, "Validation unsuccessful because we are getting message as " + title
						+ " instead of 'Partner / Producer Created Successfully' when we submit With Protocol as Mailbox along with  Valid Data");

			} else {
				child22.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ "' instead of 'Partner / Producer Created Successfully'  when we submit With Protocol as Mailbox along with  Valid Data");
			}
		} catch (Exception e) {
			child22.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child22);
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	

	@Test(priority = 24, enabled = true, description = "Verifying Create Partner Page With protocol as MQ along with valid data")
	public void MQTestVerificationwithValidData() throws Throwable {
		child23 = _extent_report.startTest("Verifying Create Partner Page With protocol as MQ along with valid data");
		child23.assignCategory("Create Partner");
		try {
			Thread.sleep(2000);

			CPP.CreatePartnerClick.click();
			Thread.sleep(2000);

			CPP.CommondataMQ();

			CPP.ValidateMQWithValidData("MQ/JMS", "Inactive", "1 Minute");

			String title = CPP.Actionmsg.getText();
			System.out.println(title);
			Thread.sleep(1000);

			if (title.contains("Partner created successfully")) {

				child23.log(LogStatus.PASS, "Validation successful because we are getting message as " + title
						+ "  when we submit With Protocol as MQ along with Valid Data");
			} else if (title.contains(
					"could not execute statement; SQL [n/a]; constraint [SQLNSFG.OBJECT_NAME]; nested exception")) {

				Thread.sleep(3000);
				CPP.Error1MessageOkclick.click();
				Thread.sleep(3000);
				CPP.Cancelbtn.click();
				CPP.YesCancelitbtn.click();

				child23.log(LogStatus.FAIL, "Validation unsuccessful because we are getting message as " + title
						+ " instead of 'Partner / Producer Created Successfully' when we submit With Protocol as MQ along with Valid Data");

			} else {

				child23.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ "' instead of 'Partner / Producer Created Successfully'  when we submit With Protocol as MQ along with Valid Data");
			}
		} catch (Exception e) {
			child23.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child23);
	}

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Test(priority = 25, enabled = true, description = "Verifying Create Partner Page With protocol as SAP along with valid data.")
	public void SAPTestVerificationwithValidData() throws Throwable {
		child24 = _extent_report.startTest("Verifying Create Partner Page With protocol as SAP along with valid data.");
		child24.assignCategory("Create Partner");
		try {
			Thread.sleep(2000);

			CPP.CreatePartnerClick.click();
			Thread.sleep(2000);

			CPP.CommondataSAP();

			CPP.ValidateSAPWithValidData("SAP", "Inactive");

			String title = CPP.Actionmsg.getText();
			System.out.println(title);
			if (title.contains("Partner created successfully")) {

				child24.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "'  when we submit With Protocol as SAP along with Valid Data");
			}

			else if (title.contains(
					"could not execute statement; SQL [n/a]; constraint [SQLNSFG.OBJECT_NAME]; nested exception")) {

				Thread.sleep(3000);
				CPP.Error1MessageOkclick.click();
				Thread.sleep(3000);
				CPP.Cancelbtn.click();
				CPP.YesCancelitbtn.click();

				child24.log(LogStatus.FAIL, "Validation unsuccessful because we are getting message as " + title
						+ " instead of 'Partner / Producer Created Successfully' when we submit With Protocol as SAP along with Valid Data");

			}

			else {
				child24.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ "' instead of 'Partner / Producer Created Successfully'  when we submit With Protocol as SAP along with Valid Data");
			}
		} catch (Exception e) {
			child24.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child24);
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Test(priority = 26, enabled = true, description = "Verifying Create Partner Page With protocol as WebService along with Valid Data")
	public void WebServicesTestVerificationwithValidData() throws Throwable {
		child25 = _extent_report
				.startTest("Verifying Create Partner Page With protocol as WebService along with Valid Data");
		child25.assignCategory("Create Partner");
		try {
			Thread.sleep(2000);

			CPP.CreatePartnerClick.click();
			Thread.sleep(2000);

			CPP.CommondataWebservice();
			CPP.ValidateWebServicesWithValidData("Webservice", "Inactive", "1 Minute");

			String title = CPP.Actionmsg.getText();
			System.out.println(title);
			if (title.contains("Partner created successfully")) {
				child25.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "'  when we submit With Protocol as WebService along with Valid Data");
			}

			else if (title.contains(
					"could not execute statement; SQL [n/a]; constraint [SQLNSFG.OBJECT_NAME]; nested exception")) {

				Thread.sleep(3000);
				CPP.Error1MessageOkclick.click();
				Thread.sleep(3000);
				CPP.Cancelbtn.click();
				CPP.YesCancelitbtn.click();

				child25.log(LogStatus.FAIL, "Validation unsuccessful because we are getting message as " + title
						+ " instead of 'Partner / Producer Created Successfully' when we submit With Protocol as WebService along with Valid Data");

			}

			else {
				child25.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ "' instead of 'Partner created successfully' when we submit With Protocol as WebService along with Valid Data");
			}
		} catch (Exception e) {
			child25.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child25);
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Test(priority = 27, enabled = true, description = "Verifying Create Partner")
	public void createSAPpartner() throws Throwable {
		child26 = _extent_report.startTest("Verifying Create Partner");
		child26.assignCategory("Create Partner");
		try {
			Thread.sleep(2000);

			CPP.CreatePartnerClick.click();
			Thread.sleep(2000);

			CPP.Commondata1();
			Thread.sleep(1000);
			DropDownSelection(CPP.ProtocolDD, "SAP");
			Thread.sleep(2000);
			DropDownSelection(CPP.StatusDD, "Inactive");
			Thread.sleep(2000);
			CPP.SAPAdapNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "SAPAdapName");
			Thread.sleep(1000);
			CPP.SAPRouteData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "SAPRoute");
			Thread.sleep(1000);
			CPP.SubmitClick.click();
			String title = CPP.Actionmsg.getText();
			System.out.println(title);
			if (title.contains("Partner created successfully")) {

				child26.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "'  when we submit With Protocol as SAP along with Valid Data");
			}

			else if (title.contains(
					"could not execute statement; SQL [n/a]; constraint [SQLNSFG.OBJECT_NAME]; nested exception")) {

				Thread.sleep(3000);
				CPP.Error1MessageOkclick.click();
				Thread.sleep(3000);
				CPP.Cancelbtn.click();
				CPP.YesCancelitbtn.click();

				child26.log(LogStatus.FAIL, "Validation unsuccessful because we are getting message as " + title
						+ " instead of 'Partner / Producer Created Successfully' when we submit With Protocol as SAP along with Valid Data");

			}

			else {
				child26.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ "' instead of 'Partner / Producer Created Successfully'  when we submit With Protocol as SAP along with Valid Data");
			}
		} catch (Exception e) {
			child26.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child26);
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Test(priority = 28, enabled = true, description = "Verifying Create Partner Page With Existing Partner Name ")
	public void PartnerNameTestVerification() throws Throwable {
		child27 = _extent_report.startTest("Verifying Create Partner Page With Existing Partner Name ");
		child27.assignCategory("Create Partner");
		try {
			Thread.sleep(2000);

			CPP.CreatePartnerClick.click();
			Thread.sleep(2000);

			CPP.Commondata1();
			Thread.sleep(2000);

			DropDownSelection(CPP.ProtocolDD, "SAP");
			Thread.sleep(2000);
			DropDownSelection(CPP.StatusDD, "Inactive");
			Thread.sleep(2000);
			CPP.SAPAdapNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "SAPAdapName");
			Thread.sleep(1000);
			CPP.SAPRouteData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "SAPRoute");
			Thread.sleep(1000);

			CPP.SubmitClick.click();
			Thread.sleep(1000);
			String title1 = CPP.Error1.getText();
			System.out.println(title1);

			if (title1.equals("Partner already exists.")) {
				child27.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title1
						+ "' when we submit with Existing Partner Name'");
			}

			else {
				child27.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title1
						+ "'instead of 'Trading Partner Name is required' when we submit with Existing Partner Name '");
			}

			CPP.Error1MessageOkclick.click();
			CPP.Cancelbtn.click();
			CPP.YesCancelitbtn.click();
		}

		catch (Exception e) {
			child27.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child27);

	}

	@Test(priority = 29, enabled = true, description = "Verifying Create Partner Page With Existing Partner Id ")
	public void PartnerIDTestVerification() throws Throwable {
		child28 = _extent_report.startTest("Verifying Create Partner Page With Existing Partner Id");
		child28.assignCategory("Create Partner");
		try {
			Thread.sleep(2000);

			CPP.CreatePartnerClick.click();
			Thread.sleep(2000);
			CPP.Commondata1();
			Thread.sleep(2000);

			DropDownSelection(CPP.ProtocolDD, "SAP");
			Thread.sleep(2000);
			DropDownSelection(CPP.StatusDD, "Inactive");
			Thread.sleep(2000);
			CPP.SAPAdapNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "SAPAdapName");
			Thread.sleep(1000);
			CPP.SAPRouteData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "SAPRoute");
			Thread.sleep(1000);

			CPP.SubmitClick.click();
			Thread.sleep(2000);
			String title1 = CPP.Error1.getText();

			if (title1.equals("Partner already exists.")) {
				child28.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title1
						+ "'' when we submit with Existing Partner Id '");
			} else {
				child28.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title1
						+ "'instead of 'Trading Partner Id is required' when we submit with Existing Partner ID '");
			}

			CPP.Error1MessageOkclick.click();
			CPP.Cancelbtn.click();
			CPP.YesCancelitbtn.click();

		} catch (Exception e) {
			child28.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child28);

	}

	@Test(priority = 30, enabled = true, description = "Verifying Create Partner Page")
	public void CreatePartnerForManage() throws Throwable {
		child29 = _extent_report.startTest("Verifying Create Partner Page");
		child29.assignCategory("Create Partner");
		try {
			Thread.sleep(2000);
			CPP.CreatePartnerClick.click();
			Thread.sleep(2000);
			CPP.PartnerNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "PartnerAutomationTest");
			Thread.sleep(1000);
			CPP.PartnerIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "PartnerAutomationTest");
			CPP.EmailData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Partner@gmail.com");
			CPP.PhoneData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "1001001009");
			CPP.AddressLine1Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), "ADDr1");
			CPP.AddressLine2Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), "ADDR2");
			Thread.sleep(2000);
			DropDownSelection(CPP.ProtocolDD, "SAP");
			Thread.sleep(2000);
			DropDownSelection(CPP.StatusDD, "Inactive");
			Thread.sleep(2000);
			CPP.SAPAdapNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "SAPAdapName123");
			Thread.sleep(1000);
			CPP.SAPRouteData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "SAPRoute123");
			Thread.sleep(1000);
			CPP.SubmitClick.click();
			Thread.sleep(2000);
			String title1 = CPP.Actionmsg.getText();

			if (title1.equals("Partner created successfully")) {

				child29.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title1
						+ "'");
			}

			else if (title1.contains(
					"could not execute statement; SQL [n/a]; constraint [SQLNSFG.OBJECT_NAME]; nested exception")) {

				Thread.sleep(3000);
				CPP.Error1MessageOkclick.click();
				Thread.sleep(3000);
				CPP.Cancelbtn.click();
				CPP.YesCancelitbtn.click();

				child26.log(LogStatus.FAIL, "Validation unsuccessful because we are getting message as " + title1
						+ " ");

			}

			else {
				child29.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title1
						+ "' ");
			}

			Thread.sleep(2000);
			CPP.CreatePartnerClick.click();
			Thread.sleep(2000);

		} catch (Exception e) {
			child29.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child29);

	}

	@AfterTest
	public void afterTest() {

		_test_logger4.appendChild(Parent9);

		Parent9.appendChild(child1).appendChild(child2).appendChild(child3).appendChild(child4).appendChild(child5)
				.appendChild(child6).appendChild(child7).appendChild(child8).appendChild(child9).appendChild(child10)
				.appendChild(child11).appendChild(child12).appendChild(child13).appendChild(child14)
				.appendChild(child15).appendChild(child16).appendChild(child17).appendChild(child18)
				.appendChild(child19).appendChild(child20).appendChild(child21).appendChild(child22)
				.appendChild(child23).appendChild(child24).appendChild(child25).appendChild(child26)
				.appendChild(child27).appendChild(child28).appendChild(child29);

		_extent_report.endTest(Parent9);

		_extent_report.endTest(_test_logger4);

		_extent_report.flush();

	}

}
