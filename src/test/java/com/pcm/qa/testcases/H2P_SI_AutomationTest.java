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
import com.pcm.qa.pages.CreatePartnerPage;
import com.pcm.qa.pages.H2P_SI_Automation;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import autoitx4java.AutoItX;

public class H2P_SI_AutomationTest extends TestBase {

	public H2P_SI_Automation H2P;
	public H2P_SI_AutomationTest H2PT;
	public AutoItX x;

	public ExtentTest Parent301;
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

	public H2P_SI_AutomationTest() {
		super();
	}

	@BeforeTest(enabled = true)
	public void setup() throws Exception {
		initialization();
		Extentreport();

		Thread.sleep(2000);

	}

	@BeforeMethod(enabled = true)
	public void obu() throws Exception {

		H2P = new H2P_SI_Automation();
		H2PT = new H2P_SI_AutomationTest();

	}

	@Test(priority = 1, enabled = true) // 61
	public void ParentNodeCreation() {

		_test_logger301 = _extent_report.startTest("SI Automation");
		Parent301 = _extent_report.startTest("H2P in SI");

	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Test(priority = 2, enabled = true, description = "Verifying B2Bi-SFTP H2P Partner In SI")
	public void SFTP_H2P() throws Throwable {
		child1 = _extent_report.startTest("Verifying B2Bi-SFTP H2P Partner SI");
		child1.assignCategory("SI Automation");

		try {
			H2P.PartnerClick.click();
			Thread.sleep(1000);
			H2P.CreatePartnerClick.click();
			Thread.sleep(2000);

			H2P.Commondata();
			Thread.sleep(1000);

			DropDownSelection(H2P.ProtocolDD, "B2Bi-SFTP");
			Thread.sleep(2000);

			DropDownSelection(H2P.StatusDD, "Inactive");
			Thread.sleep(2000);

			H2P.H2PSIconnection("SFTP");

			Thread.sleep(3000);

			H2P.ManageSearchClick.click();

			Thread.sleep(2000);

			String pname = H2P.ManagePartnerNameData.getText();
			System.out.println(pname);

			Thread.sleep(3000);

			String dashboardurl = "http://35.173.166.147:10000/dashboard/Login";
			((JavascriptExecutor) driver).executeScript("window.open(arguments[0])", dashboardurl);

			Thread.sleep(3000);

			Set<String> handler = driver.getWindowHandles();
			System.out.println(handler.size());

			Iterator<String> iterator = handler.iterator();

			String PCMwindowid = iterator.next();
			System.out.println("PCMwindowid:" + PCMwindowid);

			Thread.sleep(2000);

			String SIMailboxwindowid = iterator.next();
			System.out.println("SIDashboardwindowid:" + SIMailboxwindowid);

			Thread.sleep(2000);

			//////////////// SI DASHBOARD //////////////////////////////

			driver.switchTo().window(SIMailboxwindowid);
			System.out.println("mailbox title :" + driver.getTitle());

			Thread.sleep(2000);

			driver.findElement(By.xpath("//input[@name='autho']")).sendKeys("fg_sysadmin");

			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password");

			driver.findElement(By.xpath("//input[@name='submit']")).click();

			Thread.sleep(4000);

			driver.findElement(By.xpath("//a[contains(text(),'Trading Partner')]")).click(); // Trading Partner

			Thread.sleep(2000);

			driver.findElement(By.xpath("(//a[contains(text(),'SSH')])[1]")).click(); // SSH

			Thread.sleep(2000);

			driver.findElement(By.xpath("(//a[contains(text(),'Remote Profiles')])[1]")).click(); // Remote Profiles

			Thread.sleep(2000);

			driver.switchTo().frame(0);

			driver.findElement(By.xpath("//input[@name='name']")).sendKeys(pname); // entering Profilename

			Thread.sleep(1000);

			driver.findElement(By.xpath("//input[@name='Go2']")).click(); // go btn

			Thread.sleep(4000);

			String p1name = driver.findElement(By.xpath("(//tbody//tr//td[@class='editSelection'])[5]//a")).getText();
			
			System.out.println(p1name);

			if (pname.contains(p1name)) {

				child1.log(LogStatus.PASS, "Validation Successful because partner is created in PCM and SI");
			} else {
				child1.log(LogStatus.FAIL, "Validation Unsuccessful because partner is not created in PCM and SI");
			}
			
			driver.findElement(By.xpath("//input[@name='Return']")).click(); // click on return 

		} catch (Exception e) {
			child1.log(LogStatus.FAIL, e.fillInStackTrace());
		}

		_extent_report.endTest(child1);
	}

	@Test(priority = 3, enabled = true, description = "Deleting B2Bi-SFTP H2P Partner In SI")
	public void Delete_SFTP_H2P() throws Throwable {
		child2 = _extent_report.startTest("Deleting B2Bi-SFTP H2P Partner SI");
		child2.assignCategory("SI Automation");

		try {

			Thread.sleep(3000);

			Set<String> handler = driver.getWindowHandles();
			System.out.println(handler.size());

			Iterator<String> iterator = handler.iterator();

			String PCMwindowid = iterator.next();
			System.out.println("PCMwindowid:" + PCMwindowid);

			Thread.sleep(2000);

			String SIMailboxwindowid = iterator.next();
			System.out.println("SIDashboardwindowid:" + SIMailboxwindowid);

			Thread.sleep(2000);

			driver.switchTo().window(PCMwindowid);
			System.out.println("PCM title :" + driver.getTitle());

			Thread.sleep(2000);

			// ---- Deleting Partner from SI 
			
			
			H2P.ManageSearchClick.click();

			Thread.sleep(2000);

			String pname = H2P.ManagePartnerNameData.getText();
			System.out.println(pname);

			driver.findElement(By.xpath("(//tbody[@role='rowgroup']//tr//td/mat-icon)[1]")).click();

			Thread.sleep(2000);

			driver.findElement(By.xpath("//button[normalize-space()='Delete']")).click();

			Thread.sleep(1000);

			driver.findElement(By.xpath("//input[@type='checkbox' and @id='user']")).click(); // delete in si
			
			Thread.sleep(1000);

			driver.findElement(By.xpath("//input[@type='checkbox' and @id='mailbox']")).click(); // delete in mailbox
			
			Thread.sleep(1000);

			driver.findElement(By.xpath("//button[text()='Yes, delete it!']")).click(); // yes delete it

			Thread.sleep(4000);
			
			driver.switchTo().window(SIMailboxwindowid);
			System.out.println("mailbox title :" + driver.getTitle());

			Thread.sleep(2000);

			driver.switchTo().frame(0);

			driver.findElement(By.xpath("//input[@name='name']")).sendKeys(pname); // entering Profilename

			Thread.sleep(1000);

			driver.findElement(By.xpath("//input[@name='Go2']")).click(); // go btn

			Thread.sleep(4000);

			String alertmsg = driver.findElement(By.xpath("(//tbody//tr[2]//td[@valign='top'])[1]")).getText();
			
			System.out.println(alertmsg);

			if (alertmsg.contains("No SSH Remote Profile configurations satisfy your search criteria. Please try again.")) {

				child2.log(LogStatus.PASS, "Validation Successful because partner is deleted in PCM and SI");
			} else {
				child2.log(LogStatus.FAIL, "Validation Unsuccessful because partner is not deleted in PCM and SI");
			}

		} catch (Exception e) {
			child2.log(LogStatus.FAIL, e.fillInStackTrace());
		}

		_extent_report.endTest(child2);
	}

	
	@Test(priority = 4, enabled = true, description = "Verifying B2Bi-FTP H2P Partner In SI")
	public void FTP_H2P() throws Throwable {
		child3 = _extent_report.startTest("Verifying B2Bi-FTP H2P Partner SI");
		child3.assignCategory("SI Automation");

		try {
			Thread.sleep(3000);

			Set<String> handler = driver.getWindowHandles();
			System.out.println(handler.size());

			Iterator<String> iterator = handler.iterator();

			String PCMwindowid = iterator.next();
			System.out.println("PCMwindowid:" + PCMwindowid);

			Thread.sleep(2000);

			String SIMailboxwindowid = iterator.next();
			System.out.println("SIDashboardwindowid:" + SIMailboxwindowid);

			Thread.sleep(2000);

			driver.switchTo().window(PCMwindowid);
			System.out.println("PCM title :" + driver.getTitle());

			Thread.sleep(2000);

			// ---- Creating Partner from SI 
			
			
			H2P.CreatePartnerClick.click();

			Thread.sleep(2000);

			H2P.Commondata();
			Thread.sleep(1000);

			DropDownSelection(H2P.ProtocolDD, "B2Bi-FTP");
			Thread.sleep(2000);

			DropDownSelection(H2P.StatusDD, "Inactive");
			Thread.sleep(2000);

			H2P.H2PSIconnection("FTP");

			Thread.sleep(3000);

			H2P.ManageSearchClick.click();

			Thread.sleep(2000);

			String pname = H2P.ManagePartnerNameData.getText();
			System.out.println(pname);

			Thread.sleep(3000);

			//////////////// SI DASHBOARD //////////////////////////////

			driver.switchTo().window(SIMailboxwindowid);
			System.out.println("mailbox title :" + driver.getTitle());

			Thread.sleep(2000);

			driver.findElement(By.xpath("(//a[contains(text(),'Setup')])[1]")).click(); // SetUp

			Thread.sleep(2000);

			driver.findElement(By.xpath("(//a[text()='Advanced'])[1]")).click(); // Advanced

			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//a[contains(text(),'Profiles')])[1]")).click(); // profiles

			Thread.sleep(2000);

			driver.switchTo().frame(0);

			driver.findElement(By.xpath("//input[@name='profname']")).sendKeys(pname); // entering Profilename

			Thread.sleep(1000);

			driver.findElement(By.xpath("//input[@name='Go2']")).click(); // go btn

			Thread.sleep(4000);

			String p1name = driver.findElement(By.xpath("//tbody//tr[5]//td[6]//a")).getText();
			
			System.out.println(p1name);

			if (pname.contains( "profile_"+p1name)) {

				child3.log(LogStatus.PASS, "Validation Successful because partner is created in PCM and SI");
			} else {
				child3.log(LogStatus.FAIL, "Validation Unsuccessful because partner is not created in PCM and SI");
			}
			
			driver.findElement(By.xpath("//input[@name='Return']")).click(); // click on return 

		} catch (Exception e) {
			child3.log(LogStatus.FAIL, e.fillInStackTrace());
		}

		_extent_report.endTest(child3);
	}

	@Test(priority = 5, enabled = true, description = "Deleting B2Bi-FTP H2P Partner In SI")
	public void Delete_FTP_H2P() throws Throwable {
		child4 = _extent_report.startTest("Deleting B2Bi-FTP H2P Partner SI");
		child4.assignCategory("SI Automation");

		try {

			Thread.sleep(3000);

			Set<String> handler = driver.getWindowHandles();
			System.out.println(handler.size());

			Iterator<String> iterator = handler.iterator();

			String PCMwindowid = iterator.next();
			System.out.println("PCMwindowid:" + PCMwindowid);

			Thread.sleep(2000);

			String SIMailboxwindowid = iterator.next();
			System.out.println("SIDashboardwindowid:" + SIMailboxwindowid);

			Thread.sleep(2000);

			driver.switchTo().window(PCMwindowid);
			System.out.println("PCM title :" + driver.getTitle());

			Thread.sleep(2000);

			// ---- Deleting Partner from SI 
			
			
			H2P.ManageSearchClick.click();

			Thread.sleep(2000);

			String pname = H2P.ManagePartnerNameData.getText();
			System.out.println(pname);

			driver.findElement(By.xpath("(//tbody[@role='rowgroup']//tr//td/mat-icon)[1]")).click();

			Thread.sleep(2000);

			driver.findElement(By.xpath("//button[normalize-space()='Delete']")).click();

			Thread.sleep(1000);

			driver.findElement(By.xpath("//input[@type='checkbox' and @id='user']")).click(); // delete in si
			
			Thread.sleep(1000);

			driver.findElement(By.xpath("//input[@type='checkbox' and @id='mailbox']")).click(); // delete in mailbox
			
			Thread.sleep(1000);

			driver.findElement(By.xpath("//button[text()='Yes, delete it!']")).click(); // yes delete it

			Thread.sleep(4000);
			
			driver.switchTo().window(SIMailboxwindowid);
			System.out.println("mailbox title :" + driver.getTitle());

			Thread.sleep(2000);

			driver.switchTo().frame(0);

			driver.findElement(By.xpath("//input[@name='profname']")).sendKeys(pname); // entering Profilename

			Thread.sleep(1000);

			driver.findElement(By.xpath("//input[@name='Go2']")).click(); // go btn

			Thread.sleep(4000);

			Boolean flag = driver.findElement(By.xpath("(//tbody//tr[2]//td[@valign='top'])[1]")).isDisplayed();
			
			String alertmsg = flag.toString();
			
			System.out.println(alertmsg);

			if (alertmsg.contains("true")) {

				child4.log(LogStatus.PASS, "Validation Successful because partner is deleted in PCM and SI");
			} else {
				child4.log(LogStatus.FAIL, "Validation Unsuccessful because partner is not deleted in PCM and SI");
			}

		} catch (Exception e) {
			child4.log(LogStatus.FAIL, e.fillInStackTrace());
		}

		_extent_report.endTest(child4);
	}
	
	
	@Test(priority = 6, enabled = true, description = "Verifying B2Bi-FTPS H2P Partner In SI")
	public void FTPS_H2P() throws Throwable {
		child5 = _extent_report.startTest("Verifying B2Bi-FTPS H2P Partner SI");
		child5.assignCategory("SI Automation");

		try {
			Thread.sleep(3000);

			Set<String> handler = driver.getWindowHandles();
			System.out.println(handler.size());

			Iterator<String> iterator = handler.iterator();

			String PCMwindowid = iterator.next();
			System.out.println("PCMwindowid:" + PCMwindowid);

			Thread.sleep(2000);

			String SIMailboxwindowid = iterator.next();
			System.out.println("SIDashboardwindowid:" + SIMailboxwindowid);

			Thread.sleep(2000);

			driver.switchTo().window(PCMwindowid);
			System.out.println("PCM title :" + driver.getTitle());

			Thread.sleep(2000);

			// ---- Creating Partner from SI 
			
			
			H2P.CreatePartnerClick.click();

			Thread.sleep(2000);

			H2P.Commondata();
			Thread.sleep(1000);

			DropDownSelection(H2P.ProtocolDD, "B2Bi-FTPS");
			Thread.sleep(2000);

			DropDownSelection(H2P.StatusDD, "Inactive");
			Thread.sleep(2000);

			H2P.H2PSIconnection("FTPS");

			Thread.sleep(3000);

			H2P.ManageSearchClick.click();

			Thread.sleep(2000);

			String pname = H2P.ManagePartnerNameData.getText();
			System.out.println(pname);

			Thread.sleep(3000);

			//////////////// SI DASHBOARD //////////////////////////////

			driver.switchTo().window(SIMailboxwindowid);
			System.out.println("mailbox title :" + driver.getTitle());

			Thread.sleep(2000);

			driver.switchTo().frame(0);

			driver.findElement(By.xpath("//input[@name='profname']")).sendKeys(pname); // entering Profilename

			Thread.sleep(1000);

			driver.findElement(By.xpath("//input[@name='Go2']")).click(); // go btn

			Thread.sleep(4000);

			String p1name = driver.findElement(By.xpath("//tbody//tr[5]//td[6]//a")).getText();
			
			System.out.println(p1name);

			if (pname.contains("profile_"+p1name)) {

				child5.log(LogStatus.PASS, "Validation Successful because partner is created in PCM and SI");
			} else {
				child5.log(LogStatus.FAIL, "Validation Unsuccessful because partner is not created in PCM and SI");
			}
			
			driver.findElement(By.xpath("//input[@name='Return']")).click(); // click on return 

		} catch (Exception e) {
			child5.log(LogStatus.FAIL, e.fillInStackTrace());
		}

		_extent_report.endTest(child5);
	}

	@Test(priority = 7, enabled = true, description = "Deleting B2Bi-FTPS H2P Partner In SI")
	public void Delete_FTPS_H2P() throws Throwable {
		child6 = _extent_report.startTest("Deleting B2Bi-FTPS H2P Partner SI");
		child6.assignCategory("SI Automation");

		try {

			Thread.sleep(3000);

			Set<String> handler = driver.getWindowHandles();
			System.out.println(handler.size());

			Iterator<String> iterator = handler.iterator();

			String PCMwindowid = iterator.next();
			System.out.println("PCMwindowid:" + PCMwindowid);

			Thread.sleep(2000);

			String SIMailboxwindowid = iterator.next();
			System.out.println("SIDashboardwindowid:" + SIMailboxwindowid);

			Thread.sleep(2000);

			driver.switchTo().window(PCMwindowid);
			System.out.println("PCM title :" + driver.getTitle());

			Thread.sleep(2000);

			// ---- Deleting Partner from SI 
			
			
			H2P.ManageSearchClick.click();

			Thread.sleep(2000);

			String pname = H2P.ManagePartnerNameData.getText();
			System.out.println(pname);

			driver.findElement(By.xpath("(//tbody[@role='rowgroup']//tr//td/mat-icon)[1]")).click();

			Thread.sleep(2000);

			driver.findElement(By.xpath("//button[normalize-space()='Delete']")).click();

			Thread.sleep(1000);

			driver.findElement(By.xpath("//input[@type='checkbox' and @id='user']")).click(); // delete in si
			
			Thread.sleep(1000);

			driver.findElement(By.xpath("//input[@type='checkbox' and @id='mailbox']")).click(); // delete in mailbox
			
			Thread.sleep(1000);

			driver.findElement(By.xpath("//button[text()='Yes, delete it!']")).click(); // yes delete it

			Thread.sleep(4000);
			
			driver.switchTo().window(SIMailboxwindowid);
			System.out.println("mailbox title :" + driver.getTitle());

			Thread.sleep(2000);

			driver.switchTo().frame(0);

			driver.findElement(By.xpath("//input[@name='profname']")).sendKeys(pname); // entering Profilename

			Thread.sleep(1000);

			driver.findElement(By.xpath("//input[@name='Go2']")).click(); // go btn

			Thread.sleep(4000);

			Boolean flag = driver.findElement(By.xpath("(//tbody//tr[2]//td[@valign='top'])[1]")).isDisplayed();
			
			String alertmsg = flag.toString();
			
			System.out.println(alertmsg);

			if (alertmsg.contains("true")) {

				child6.log(LogStatus.PASS, "Validation Successful because partner is created in PCM and SI");
			} else {
				child6.log(LogStatus.FAIL, "Validation Unsuccessful because partner is not created in PCM and SI");
			}

		} catch (Exception e) {
			child6.log(LogStatus.FAIL, e.fillInStackTrace());
		}

		_extent_report.endTest(child6);
	}
	

	
	
	
	
	@AfterTest
	public void teardown() {

		_test_logger301.appendChild(Parent301);

		Parent301.appendChild(child1).appendChild(child2).appendChild(child3).appendChild(child4).appendChild(child5).appendChild(child6);

		_extent_report.endTest(Parent301);

		_extent_report.endTest(_test_logger301);

		_extent_report.flush();

	}

}
