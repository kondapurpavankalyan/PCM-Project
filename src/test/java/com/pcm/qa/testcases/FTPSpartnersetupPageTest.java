package com.pcm.qa.testcases;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pcm.qa.base.TestBase;
import com.pcm.qa.pages.FTPSpartnersetupPage;
import com.pcm.qa.pages.FTPpartnersetupPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class FTPSpartnersetupPageTest extends TestBase {

	FTPSpartnersetupPage FTPS;
	FTPSpartnersetupPageTest FTPST;

	public ExtentTest Parent1;
	public ExtentTest child1;
	public ExtentTest child2;

	public FTPSpartnersetupPageTest() {
		super();
	}

	@BeforeTest
	public void setUp() throws Exception {

		Extentreport();
		initialization();

	}

	@BeforeMethod
	public void setup() {

		FTPS = new FTPSpartnersetupPage();
		FTPST = new FTPSpartnersetupPageTest();
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

			FTPS.FTPS_Protocoltype(FTPS.connectiontype); // partner Creation
			Thread.sleep(4000);
			FTPS.ValidateAppMailbox(); // Application Creation
			Thread.sleep(5000);
			FTPS.DFProfileSelection(FTPS.partnername, FTPS.applicationname); // Build Data Flow Thread.sleep(1000);
			FTPS.FTPS_FileType(FTPS.directiontype, FTPS.transfertype);
			Thread.sleep(3000);
			FTPS.TableMFT(FTPS.filename, 2, "Rule");
			Thread.sleep(2000);
			FTPS.InboundRules(FTPS.directiontype);
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

			// --------------------------------------------------------------------------------------------------------------

			if (FTPS.connectiontype.equalsIgnoreCase("H2P")) {

				if (FTPS.directiontype.equalsIgnoreCase("INBOUND")) {

					// Partner SI Mailbox ---------------------------------------

					driver.switchTo().window(partnermailboxwindowid);
					System.out.println("Partner mailbox title :" + driver.getTitle());

					Thread.sleep(2000);

					driver.findElement(By.xpath("//input[@name='userid']")).sendKeys("admin");

					driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password");

					driver.findElement(By.xpath("//input[@name='submit']")).click();

					Thread.sleep(2000);

					driver.switchTo().frame("contents"); // leftside contents in Mailbox SI

					WebDriverWait wait = new WebDriverWait(driver, 10);

					WebElement element = wait.until(
							ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Mailbox Send')]")));
					((JavascriptExecutor) driver).executeScript("arguments[0].click();", element); // mailbox send

					Thread.sleep(3000);

					driver.switchTo().defaultContent();

					driver.switchTo().frame("view_body"); // main body

					Thread.sleep(1000);

					driver.findElement(By.xpath("//td[contains(text(),'Filename')]//..//td[2]")).click(); // upload file

					if (FTPS.transfertype.equalsIgnoreCase("MFT")) {

						Thread.sleep(1000);

						FileUpload("C:\\RequiredFiles\\Fileprocressing.exe");

						Thread.sleep(3000);

					} else if (FTPS.transfertype.equalsIgnoreCase("DOCHANDLING")) {

						Thread.sleep(1000);

						FileUpload("C:\\RequiredFiles\\DocFileprocressing.exe");

						Thread.sleep(3000);

					}

					driver.findElement(By.xpath("//input[@id='filterInput']")).sendKeys(FTPS.partnerindir); // filter

					Thread.sleep(5000);

					// FTPS.SImailboxpathfilter("/ftptest123");

					driver.findElement(By.xpath("//a[text()='" + FTPS.partnerindir + "']")).click();

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

					FTPS.SIDashboardConnection();

					Thread.sleep(1000);

					FTPS.Minutecheckboxactivity();

					Thread.sleep(2000);

				} else if (FTPS.directiontype.equalsIgnoreCase("OUTBOUND")) {

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

					if (FTPS.transfertype.equalsIgnoreCase("MFT")) {

						Thread.sleep(1000);

						FileUpload("C:\\RequiredFiles\\Fileprocressing.exe");

						Thread.sleep(3000);

					} else if (FTPS.transfertype.equalsIgnoreCase("DOCHANDLING")) {

						Thread.sleep(1000);

						FileUpload("C:\\RequiredFiles\\DocFileprocressing.exe");

						Thread.sleep(3000);

					}

					driver.findElement(By.xpath("//input[@id='filterInput']")).sendKeys("/" + FTPS.applicationname); // filter

					Thread.sleep(5000);

					String fname = FTPS.filtername.getAttribute("value");
					System.out.println(fname);

					// FTPS.SImailboxpathfilter("/ftptest123");

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

					FTPS.SIDashboardConnection();

					Thread.sleep(1000);

					FTPS.Minutecheckboxactivity();

					Thread.sleep(2000);

				}

			}

			else if (FTPS.connectiontype.equalsIgnoreCase("P2H")) {

				if (FTPS.directiontype.equalsIgnoreCase("INBOUND")) {

					// Application SI Dashboard -----------------------------------------

					Thread.sleep(2000);

					driver.switchTo().window(applicationmailboxwindowid);
					System.out.println("mailbox title :" + driver.getTitle());

					Thread.sleep(2000);

					driver.findElement(By.xpath("//input[@name='userid']")).sendKeys(FTPS.p2husername);

					driver.findElement(By.xpath("//input[@name='password']")).sendKeys(FTPS.p2hpassword);

					driver.findElement(By.xpath("//input[@name='submit']")).click();

					driver.switchTo().frame("contents"); // leftside contents in Mailbox SI

					WebDriverWait wait = new WebDriverWait(driver, 10);

					WebElement element = wait.until(
							ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Mailbox Send')]")));
					((JavascriptExecutor) driver).executeScript("arguments[0].click();", element); // mailbox send

					Thread.sleep(3000);

					driver.switchTo().defaultContent();

					driver.switchTo().frame("view_body"); // main body

					Thread.sleep(1000);

					driver.findElement(By.xpath("//td[contains(text(),'Filename')]//..//td[2]")).click(); // upload file

					if (FTPS.transfertype.equalsIgnoreCase("MFT")) {

						Thread.sleep(1000);

						FileUpload("C:\\RequiredFiles\\Fileprocressing.exe");

						Thread.sleep(3000);

					} else if (FTPS.transfertype.equalsIgnoreCase("DOCHANDLING")) {

						Thread.sleep(1000);

						FileUpload("C:\\RequiredFiles\\DocFileprocressing.exe");

						Thread.sleep(3000);

					}

//					driver.findElement(By.xpath("//input[@id='filterInput']")).sendKeys("/" + FTPS.applicationname); // filter
//
//					Thread.sleep(5000);
//					
//					String fname = FTPS.filtername.getAttribute("value");
//					System.out.println(fname);
//
//					 FTPS.SImailboxpathfilter("/ftptest123");
//
//					driver.findElement(By.xpath("//a[text()='"+fname+"']")).click();

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

					FTPS.SIDashboardConnection();

					Thread.sleep(1000);

					FTPS.Minutecheckboxactivity();

					Thread.sleep(2000);

				} else if (FTPS.directiontype.equalsIgnoreCase("OUTBOUND")) {

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

					if (FTPS.transfertype.equalsIgnoreCase("MFT")) {

						Thread.sleep(1000);

						FileUpload("C:\\RequiredFiles\\Fileprocressing.exe");

						Thread.sleep(3000);

					} else if (FTPS.transfertype.equalsIgnoreCase("DOCHANDLING")) {

						Thread.sleep(1000);

						FileUpload("C:\\RequiredFiles\\DocFileprocressing.exe");

						Thread.sleep(3000);

					}

					driver.findElement(By.xpath("//input[@id='filterInput']")).sendKeys("/" + FTPS.applicationname); // filter

					Thread.sleep(5000);

					String fname = FTPS.filtername.getAttribute("value");
					System.out.println(fname);

					// FTPS.SImailboxpathfilter("/ftptest123");

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

					FTPS.SIDashboardConnection();

					Thread.sleep(1000);

					FTPS.Minutecheckboxactivity();

					Thread.sleep(2000);

				}

			}

			// PCM ------------------------------------------------------------------

			driver.switchTo().window(PCMwindowid);
			System.out.println("dashboard title :" + driver.getTitle());

			Thread.sleep(5000);

			FTPS.ValidateSearchResultWithStatus();

			String title = FTPS.filevalidation(FTPS.filename);

			if (title.equalsIgnoreCase(FTPS.filename)) {

				child1.log(LogStatus.PASS,
						"Validation successful because File Processed Successfully For FTP Inbound MFT File");
			}

			else if (driver.findElement(By.xpath("//mat-icon[@svgicon='menu-bar']")).getSize().equals("0")) {

				child1.log(LogStatus.FAIL, "Validation Unsuccessful because File not Processed Successfully For FTPS");

			}

			else {

				child1.log(LogStatus.FAIL, "Validation Unsuccessful because File not Processed Successfully For FTPS");
			}

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
