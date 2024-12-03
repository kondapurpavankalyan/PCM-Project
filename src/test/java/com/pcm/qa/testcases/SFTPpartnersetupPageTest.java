package com.pcm.qa.testcases;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pcm.qa.base.TestBase;
import com.pcm.qa.pages.SFTPpartnersetupPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SFTPpartnersetupPageTest extends TestBase {

	SFTPpartnersetupPage SFTP;
	SFTPpartnersetupPageTest SFTPT;

	public ExtentTest Parent1;
	public ExtentTest child1;
	public ExtentTest child2;

	public SFTPpartnersetupPageTest() {
		super();
	}

	@BeforeTest
	public void setUp() throws Exception {

		Extentreport();
		initialization();

	}

	@BeforeMethod
	public void setup() {

		SFTP = new SFTPpartnersetupPage();
		SFTPT = new SFTPpartnersetupPageTest();
	}

	@Test(priority = 1, enabled = true)
	public void ParentNodeCreation() {

		_test_logger100 = _extent_report.startTest("FTPS File Processing");
		Parent1 = _extent_report.startTest("FTPS File Processing");

	}

	@Test(priority = 2, enabled = true)
	public void FTPsetup() throws Throwable {

		child1 = _extent_report.startTest("FTP File Processing");
		child1.assignCategory("FTP File Processing");
		try {

			SFTP.SFTP_Protocoltype(SFTP.connectiontype); // partner Creation
			Thread.sleep(4000);
			SFTP.ValidateAppMailbox(); // Application Creation
			Thread.sleep(4000); 
			SFTP.DFProfileSelection(SFTP.partnername, SFTP.applicationname); // Build Data Flow Thread.sleep(1000);
			SFTP.SFTP_FileType(SFTP.directiontype, SFTP.transfertype);
			Thread.sleep(3000);
			SFTP.TableMFT(SFTP.filename, 2, "Rule");
			Thread.sleep(2000);
			SFTP.InboundRules(SFTP.directiontype);
			Thread.sleep(5000);   

			// -------------------------------------------------- //

			String appdashboardurl = prop.getProperty("applicationSIDashboardUrl");
			((JavascriptExecutor) driver).executeScript("window.open(arguments[0])", appdashboardurl);
			Thread.sleep(3000);

			String appmailboxurl = prop.getProperty("applicationSIMailboxUrl");
			((JavascriptExecutor) driver).executeScript("window.open(arguments[0])", appmailboxurl);

			Thread.sleep(3000);

			String partnerdashboardurl = prop.getProperty("partnerSIDashboardUrl");
			((JavascriptExecutor) driver).executeScript("window.open(arguments[0])", partnerdashboardurl);
			Thread.sleep(3000);

			String partnermailboxurl = prop.getProperty("partnerSIMailboxUrl");
			((JavascriptExecutor) driver).executeScript("window.open(arguments[0])", partnermailboxurl);

			Thread.sleep(3000);

			// --------------------------------------------//

			Set<String> handler = driver.getWindowHandles();
			System.out.println(handler.size());

			Iterator<String> iterator = handler.iterator();

			String PCMwindowid = iterator.next();
			System.out.println("PCMwindowid:" + PCMwindowid);

			Thread.sleep(2000);

			driver.switchTo().window(PCMwindowid);
			System.out.println("PCM window title :" + driver.getTitle());

			Thread.sleep(2000);

			String partnermailboxwindowid = iterator.next();
			System.out.println("Partner MailBox windowid:" + partnermailboxwindowid);

			Thread.sleep(2000);

			driver.switchTo().window(partnermailboxwindowid);
			System.out.println("Partner Mailbox title :" + driver.getTitle());

			Thread.sleep(2000);

			String partnerdashboardwindowid = iterator.next();
			System.out.println("Partner Dashboard windowid:" + partnerdashboardwindowid);

			Thread.sleep(2000);

			driver.switchTo().window(partnerdashboardwindowid);
			System.out.println("Partner Dashboard title :" + driver.getTitle());

			Thread.sleep(2000);

			String applicationmailboxwindowid = iterator.next();
			System.out.println("Application MailBox windowid:" + applicationmailboxwindowid);

			Thread.sleep(2000);

			driver.switchTo().window(applicationmailboxwindowid);
			System.out.println("Application Mailbox title :" + driver.getTitle());

			Thread.sleep(2000);

			String applicationdashboardwindowid = iterator.next();
			System.out.println("Application Dashboard windowid:" + applicationdashboardwindowid);

			Thread.sleep(2000);

			driver.switchTo().window(applicationdashboardwindowid);
			System.out.println("Application Dashboard title :" + driver.getTitle());

			Thread.sleep(2000);

			// ------------------------------------------------ //

			if (SFTP.connectiontype.equalsIgnoreCase("H2P")) {

				if (SFTP.directiontype.equalsIgnoreCase("INBOUND")) {

					// Partner SI Mailbox ---------------------------------------

					driver.switchTo().window(partnermailboxwindowid);
					System.out.println("Partner mailbox title :" + driver.getTitle());

					Thread.sleep(2000);

					driver.findElement(By.xpath("//input[@name='userid']")).sendKeys("admin");

					driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password");

					driver.findElement(By.xpath("//input[@name='submit']")).click();

					Thread.sleep(2000);

					driver.switchTo().frame("contents"); // leftside contents in Mailbox SI

					driver.findElement(By.xpath("//a[contains(text(),'Mailbox Send')]")).click();

					Thread.sleep(2000);

					driver.switchTo().defaultContent();

					driver.switchTo().frame("view_body"); // main body

					Thread.sleep(1000);

					driver.findElement(By.xpath("//td[contains(text(),'Filename')]//..//td[2]")).click(); // upload file

					if (SFTP.transfertype.equalsIgnoreCase("MFT")) {

						Thread.sleep(1000);

						FileUpload("C:\\RequiredFiles\\Fileprocressing.exe");

						Thread.sleep(3000);

					} else if (SFTP.transfertype.equalsIgnoreCase("DOCHANDLING")) {

						Thread.sleep(1000);

						FileUpload("C:\\RequiredFiles\\DocFileprocressing.exe");

						Thread.sleep(3000);

					}

					driver.findElement(By.xpath("//input[@id='filterInput']")).sendKeys(SFTP.partnerindir); // filter

					Thread.sleep(5000);

					// SFTP.SImailboxpathfilter("/ftptest123");

					driver.findElement(By.xpath("//a[text()='" + SFTP.partnerindir + "']")).click();

					Thread.sleep(2000);

					driver.findElement(By.xpath("//a[text()='/in']")).click();

					Thread.sleep(1000);

					driver.findElement(By.xpath("//img[@name='Go']")).click();

					Thread.sleep(1000);

					// Application SI Dashboard -----------------------------------------

					Thread.sleep(2000);

					driver.switchTo().window(applicationdashboardwindowid);
					System.out.println("dashboard title :" + driver.getTitle());

					Thread.sleep(1000);

					SFTP.SIDashboardConnection();

					Thread.sleep(1000);

					SFTP.Minutecheckboxactivity();

					Thread.sleep(2000);

				} else if (SFTP.directiontype.equalsIgnoreCase("OUTBOUND")) {

					// Application SI Dashboard -----------------------------------------

					Thread.sleep(2000);

					driver.switchTo().window(applicationmailboxwindowid);
					System.out.println("mailbox title :" + driver.getTitle());

					Thread.sleep(2000);

					driver.findElement(By.xpath("//input[@name='userid']")).sendKeys("fg_sysadmin");

					driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password");

					driver.findElement(By.xpath("//input[@name='submit']")).click();

					Thread.sleep(2000);

					driver.switchTo().frame("contents"); // leftside contents in Mailbox SI

					driver.findElement(By.xpath("//a[contains(text(),'Mailbox Send')]")).click();

					Thread.sleep(2000);

					driver.switchTo().defaultContent();

					driver.switchTo().frame("view_body"); // main body

					Thread.sleep(1000);

					driver.findElement(By.xpath("//td[contains(text(),'Filename')]//..//td[2]")).click(); // upload file

					if (SFTP.transfertype.equalsIgnoreCase("MFT")) {

						Thread.sleep(1000);

						FileUpload("C:\\RequiredFiles\\Fileprocressing.exe");

						Thread.sleep(3000);

					} else if (SFTP.transfertype.equalsIgnoreCase("DOCHANDLING")) {

						Thread.sleep(1000);

						FileUpload("C:\\RequiredFiles\\DocFileprocressing.exe");

						Thread.sleep(3000);

					}

					driver.findElement(By.xpath("//input[@id='filterInput']")).sendKeys("/" + SFTP.applicationname); // filter

					Thread.sleep(5000);

					String fname = SFTP.filtername.getAttribute("value");
					System.out.println(fname);

					// SFTP.SImailboxpathfilter("/ftptest123");

					driver.findElement(By.xpath("//a[text()='" + fname + "']")).click();

					Thread.sleep(2000);

					driver.findElement(By.xpath("//a[text()='/in']")).click();

					Thread.sleep(1000);

					driver.findElement(By.xpath("//img[@name='Go']")).click();

					Thread.sleep(1000);

					// Application SI Dashboard -----------------------------------------

					Thread.sleep(2000);

					driver.switchTo().window(applicationdashboardwindowid);
					System.out.println("dashboard title :" + driver.getTitle());

					Thread.sleep(1000);

					SFTP.SIDashboardConnection();

					Thread.sleep(1000);

					SFTP.Minutecheckboxactivity();

					Thread.sleep(2000);

				}

			}

			else if (SFTP.connectiontype.equalsIgnoreCase("P2H")) {

				if (SFTP.directiontype.equalsIgnoreCase("INBOUND")) {

					// Application SI Dashboard -----------------------------------------

					Thread.sleep(2000);

					driver.switchTo().window(applicationmailboxwindowid);
					System.out.println("mailbox title :" + driver.getTitle());

					Thread.sleep(2000);

					driver.findElement(By.xpath("//input[@name='userid']")).sendKeys(SFTP.p2husername);

					driver.findElement(By.xpath("//input[@name='password']")).sendKeys(SFTP.p2hpassword);

					driver.findElement(By.xpath("//input[@name='submit']")).click();

					driver.switchTo().frame("contents"); // leftside contents in Mailbox SI

					driver.findElement(By.xpath("//a[contains(text(),'Mailbox Send')]")).click();

					Thread.sleep(2000);

					driver.switchTo().defaultContent();

					driver.switchTo().frame("view_body"); // main body

					Thread.sleep(1000);

					driver.findElement(By.xpath("//td[contains(text(),'Filename')]//..//td[2]")).click(); // upload file

					if (SFTP.transfertype.equalsIgnoreCase("MFT")) {

						Thread.sleep(1000);

						FileUpload("C:\\RequiredFiles\\Fileprocressing.exe");

						Thread.sleep(3000);

					} else if (SFTP.transfertype.equalsIgnoreCase("DOCHANDLING")) {

						Thread.sleep(1000);

						FileUpload("C:\\RequiredFiles\\DocFileprocressing.exe");

						Thread.sleep(3000);

					}

//					driver.findElement(By.xpath("//input[@id='filterInput']")).sendKeys("/" + SFTP.applicationname); // filter
//
//					Thread.sleep(5000);
//					
//					String fname = SFTP.filtername.getAttribute("value");
//					System.out.println(fname);
//
//					 SFTP.SImailboxpathfilter("/ftptest123");
//
//					driver.findElement(By.xpath("//a[text()='"+fname+"']")).click();

					Thread.sleep(2000);

					driver.findElement(By.xpath("//a[text()='/in']")).click();

					Thread.sleep(1000);

					driver.findElement(By.xpath("//img[@name='Go']")).click();

					Thread.sleep(1000);
					
					driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();

					// Application SI Dashboard -----------------------------------------

					Thread.sleep(2000);

					driver.switchTo().window(applicationdashboardwindowid);
					System.out.println("dashboard title :" + driver.getTitle());

					Thread.sleep(1000);

					SFTP.SIDashboardConnection();

					Thread.sleep(1000);

					SFTP.Minutecheckboxactivity();

					Thread.sleep(2000);

				} else if (SFTP.directiontype.equalsIgnoreCase("OUTBOUND")) {

					// Application SI Dashboard -----------------------------------------

					Thread.sleep(2000);

					driver.switchTo().window(applicationmailboxwindowid);
					System.out.println("mailbox title :" + driver.getTitle());

					Thread.sleep(2000);

					driver.findElement(By.xpath("//input[@name='userid']")).sendKeys("fg_sysadmin");

					driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password");

					driver.findElement(By.xpath("//input[@name='submit']")).click();

					Thread.sleep(2000);

					driver.switchTo().frame("contents"); // leftside contents in Mailbox SI

					driver.findElement(By.xpath("//a[contains(text(),'Mailbox Send')]")).click();

					Thread.sleep(2000);

					driver.switchTo().defaultContent();

					driver.switchTo().frame("view_body"); // main body

					Thread.sleep(1000);

					driver.findElement(By.xpath("//td[contains(text(),'Filename')]//..//td[2]")).click(); // upload file

					if (SFTP.transfertype.equalsIgnoreCase("MFT")) {

						Thread.sleep(1000);

						FileUpload("C:\\RequiredFiles\\Fileprocressing.exe");

						Thread.sleep(3000);

					} else if (SFTP.transfertype.equalsIgnoreCase("DOCHANDLING")) {

						Thread.sleep(1000);

						FileUpload("C:\\RequiredFiles\\DocFileprocressing.exe");

						Thread.sleep(3000);

					}

					driver.findElement(By.xpath("//input[@id='filterInput']")).sendKeys("/" + SFTP.applicationname); // filter

					Thread.sleep(5000);

					String fname = SFTP.filtername.getAttribute("value");
					System.out.println(fname);

					// SFTP.SImailboxpathfilter("/ftptest123");

					driver.findElement(By.xpath("//a[text()='" + fname + "']")).click();

					Thread.sleep(2000);

					driver.findElement(By.xpath("//a[text()='/in']")).click();

					Thread.sleep(1000);

					driver.findElement(By.xpath("//img[@name='Go']")).click();

					Thread.sleep(1000);

					// Application SI Dashboard -----------------------------------------

					Thread.sleep(2000);

					driver.switchTo().window(applicationdashboardwindowid);
					System.out.println("dashboard title :" + driver.getTitle());

					Thread.sleep(1000);

					SFTP.SIDashboardConnection();

					Thread.sleep(1000);

					SFTP.Minutecheckboxactivity();

					Thread.sleep(2000);

				}

			}

			// PCM ------------------------------------------------------------------

			/*
			 * driver.switchTo().window(PCMwindowid); System.out.println("dashboard title :"
			 * + driver.getTitle());
			 * 
			 * Thread.sleep(5000);
			 * 
			 * SFTP.ValidateSearchResultWithStatus();
			 * 
			 * String title = SFTP.filevalidation(SFTP.filename);
			 * 
			 * String title = SFTP.filevalidation(filename);
			 * 
			 * if (title.equalsIgnoreCase(filename)) {
			 * 
			 * child1.log(LogStatus.PASS,
			 * "Validation successful because File Processed Successfully For FTP Inbound MFT File"
			 * ); } else {
			 * 
			 * child1.log(LogStatus.FAIL,
			 * "Validation Unsuccessful because File not Processed Successfully For FTP Inbound MFT File"
			 * ); }
			 */

		} catch (org.openqa.selenium.InvalidSelectorException e) {

			child1.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child1);

	}

	@AfterTest
	public void teardown() {

		_test_logger100.appendChild(Parent1);

		Parent1.appendChild(child1);

		_extent_report.endTest(Parent1);
		_extent_report.endTest(_test_logger100);
		_extent_report.flush();

	}

}

