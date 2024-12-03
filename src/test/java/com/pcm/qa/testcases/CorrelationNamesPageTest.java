package com.pcm.qa.testcases;



import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pcm.qa.base.TestBase;
import com.pcm.qa.pages.CorrelationNamesPage;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class CorrelationNamesPageTest extends TestBase {

	CorrelationNamesPage CNP;
	CorrelationNamesPageTest CNPT;

	public ExtentTest Parent17;
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

	public CorrelationNamesPageTest() {
		super();
	}

	@BeforeMethod
	public void beforeTest() {

		CNP = new CorrelationNamesPage();
		CNPT = new CorrelationNamesPageTest();

	}

	@BeforeTest(enabled = true)
	public void setup() throws Exception {

		Extentreport();
		initialization();
	}

	@Test(priority = 1, enabled = true)
	public void ParentNodeCreation() throws Exception {

		_test_logger7 = _extent_report.startTest("Settings");
		Parent17 = _extent_report.startTest("CorrelationNames");

	}

	@Test(priority = 2, enabled = true, description = "Verifying Correlation Names Page Title")
	public void CorrelationNamesPageTitleTest() throws InterruptedException {

		child1 = _extent_report.startTest("Verifying Correlation Names Page Title ");
		child1.assignCategory("CorrelationNames");

		try {

			Thread.sleep(2000);
			String title = CNP.ValidateCorrelationNamesPageTitle();
			System.out.println(title);

			if (title.equals("Manage Correlations")) {

				child1.log(LogStatus.PASS,
						"Validation successful because we are getting Correlation Names Page title as '" + title + "'");

			} else {

				child1.log(LogStatus.FAIL,
						"Validation  unsuccessful because we are getting Correlation Names Page title as '" + title
								+ "' instead of 'Manage Correlations'");
			}
		} catch (Exception e) {

			child1.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child1);
	}

	@Test(priority = 3, enabled = true, description = "Verifying Correlation Names Page With Correlation Name 1")
	public void CNTestVerificationWithCN1() throws Exception {

		child2 = _extent_report.startTest("Verifying Correlation Names Page With Correlation Name 1");
		child2.assignCategory("CorrelationNames");

		try {

			String title = "PONUMBER";

			CNP.CorrelationName1Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), title);
			Thread.sleep(2000);

			CNP.UpdateCorrelationsClick.click();

			String text = CNP.Actionmessage.getText();
			System.out.println(text);
			Thread.sleep(2000);

			CNP.FileTransferClick.click();

			Thread.sleep(1000);

			CNP.SearchClick.click();

			Thread.sleep(1000);

			CNP.ShowHideAdvancedSearch.click();

			Thread.sleep(1000);
			CNP.AdvancedSearchSelectCorrelationDD1.click();

			CNP.selectcorrelation(title);
			Thread.sleep(1000);
			String title2 = driver.findElement(By.xpath("(//mat-select//div//span//span)[7]")).getText();
			System.out.println(title2);
			Thread.sleep(1000);

			if (title2.contains(title)) {

				child2.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Correlation Name 1");

			} else {

				child2.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ " when we Search with Correlation Name 1");

			}
		} catch (Exception e) {

			Thread.sleep(1000);
			child2.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child2);

	}

	@Test(priority = 4, enabled = true, description = "Verifying Correlation Names Page With Correlation Name 2")
	public void CNTestVerificationWithCN2() throws Exception {

		child3 = _extent_report.startTest("Verifying Correlation Names Page With Correlation Name 2");
		child3.assignCategory("CorrelationNames");

		try {

			String title = "CUSTOMERID";
			Thread.sleep(2000);

			CNP.SettingClick.click();
			Thread.sleep(1000);
			CNP.CorrelationNamesClick.click();
			Thread.sleep(1000);

			CNP.CorrelationName2Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), title);
			Thread.sleep(2000);

			CNP.UpdateCorrelationsClick.click();

			String text = CNP.Actionmessage.getText();
			System.out.println(text);
			Thread.sleep(2000);

			CNP.FileTransferClick.click();

			Thread.sleep(1000);

			CNP.SearchClick.click();

			Thread.sleep(1000);

			CNP.ShowHideAdvancedSearch.click();
			Thread.sleep(1000);
			CNP.AdvancedSearchSelectCorrelationDD1.click();
			CNP.selectcorrelation(title);
			Thread.sleep(1000);
			String title2 = driver.findElement(By.xpath("(//mat-select//div//span//span)[7]")).getText();
			System.out.println(title2);
			Thread.sleep(1000);

			if (title2.contains(title)) {

				child3.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Correlation Name 2");

			} else {

				child3.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ " when we Search with Correlation Name 2");

			}
		} catch (Exception e) {

			Thread.sleep(1000);
			child3.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child3);

	}

	@Test(priority = 5, enabled = true, description = "Verifying Correlation Names Page With Correlation Name 3")
	public void CNTestVerificationWithCN3() throws Exception {

		child4 = _extent_report.startTest("Verifying Correlation Names Page With Correlation Name 3");
		child4.assignCategory("CorrelationNames");

		try {

			String title = "PACKETID";
			Thread.sleep(2000);
			CNP.SettingClick.click();
			Thread.sleep(1000);
			CNP.CorrelationNamesClick.click();

			Thread.sleep(1000);
			CNP.CorrelationName3Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), title);
			Thread.sleep(1000);

			CNP.UpdateCorrelationsClick.click();

			String text = CNP.Actionmessage.getText();
			System.out.println(text);
			Thread.sleep(2000);

			CNP.FileTransferClick.click();

			Thread.sleep(1000);

			CNP.SearchClick.click();

			Thread.sleep(1000);

			CNP.ShowHideAdvancedSearch.click();
			Thread.sleep(1000);

			CNP.AdvancedSearchSelectCorrelationDD1.click();
			CNP.selectcorrelation(title);
			Thread.sleep(1000);
			String title2 = driver.findElement(By.xpath("(//mat-select//div//span//span)[7]")).getText();
			System.out.println(title2);
			Thread.sleep(1000);

			if (title2.contains(title)) {

				child4.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Correlation Name 3");

			} else {

				child4.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ " when we Search with Correlation Name 3");

			}
		} catch (Exception e) {

			Thread.sleep(1000);
			child4.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child4);

	}

	@Test(priority = 6, enabled = true, description = "Verifying Correlation Names Page With Correlation Name 4")
	public void CNTestVerificationWithCN4() throws Exception {

		child5 = _extent_report.startTest("Verifying Correlation Names Page With Correlation Name 4");
		child5.assignCategory("CorrelationNames");

		try {

			String title = "ACTIONCODE";
			Thread.sleep(2000);

			CNP.SettingClick.click();
			Thread.sleep(1000);
			CNP.CorrelationNamesClick.click();
			Thread.sleep(1000);
			CNP.CorrelationName4Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), title);
			Thread.sleep(2000);

			CNP.UpdateCorrelationsClick.click();

			String text = CNP.Actionmessage.getText();
			System.out.println(text);
			Thread.sleep(2000);

			CNP.FileTransferClick.click();

			Thread.sleep(1000);

			CNP.SearchClick.click();

			Thread.sleep(1000);

			CNP.ShowHideAdvancedSearch.click();
			Thread.sleep(2000);
			CNP.AdvancedSearchSelectCorrelationDD1.click();
			CNP.selectcorrelation(title);
			Thread.sleep(1000);
			String title2 = driver.findElement(By.xpath("(//mat-select//div//span//span)[7]")).getText();
			System.out.println(title2);
			Thread.sleep(1000);

			if (title2.contains(title)) {

				child5.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Correlation Name 4");

			} else {

				child5.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ " when we Search with Correlation Name 4");

			}
		} catch (Exception e) {

			Thread.sleep(1000);
			child5.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child5);

	}

	@Test(priority = 7, enabled = true, description = "Verifying Correlation Names Page With Correlation Name 5")
	public void CNTestVerificationWithCN5() throws Exception {

		child6 = _extent_report.startTest("Verifying Correlation Names Page With Correlation Name 5");
		child6.assignCategory("CorrelationNames");

		try {

			String title = "INVOICENUMBER";
			Thread.sleep(2000);

			CNP.SettingClick.click();
			Thread.sleep(1000);
			CNP.CorrelationNamesClick.click();
			Thread.sleep(2000);
			CNP.CorrelationName5Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), title);
			Thread.sleep(2000);

			CNP.UpdateCorrelationsClick.click();

			String text = CNP.Actionmessage.getText();
			System.out.println(text);
			Thread.sleep(2000);

			CNP.FileTransferClick.click();

			Thread.sleep(1000);

			CNP.SearchClick.click();

			Thread.sleep(1000);

			CNP.ShowHideAdvancedSearch.click();
			Thread.sleep(2000);
			CNP.AdvancedSearchSelectCorrelationDD1.click();
			CNP.selectcorrelation(title);
			Thread.sleep(1000);
			String title2 = driver.findElement(By.xpath("(//mat-select//div//span//span)[7]")).getText();
			System.out.println(title2);
			Thread.sleep(1000);

			if (title2.contains(title)) {

				child6.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Correlation Name 5");

			} else {

				child6.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ " when we Search with Correlation Name 5");

			}
		} catch (Exception e) {

			Thread.sleep(1000);
			child6.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child6);

	}

	@Test(priority = 8, enabled = true, description = "Verifying Correlation Names Page With Correlation Name 6")
	public void CNTestVerificationWithCN6() throws Exception {

		child7 = _extent_report.startTest("Verifying Correlation Names Page With Correlation Name 6");
		child7.assignCategory("CorrelationNames");

		try {

			String title = "Name6";
			Thread.sleep(2000);

			CNP.SettingClick.click();
			Thread.sleep(1000);
			CNP.CorrelationNamesClick.click();
			Thread.sleep(2000);

			CNP.CorrelationName6Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), title);
			Thread.sleep(2000);

			CNP.UpdateCorrelationsClick.click();

			String text = CNP.Actionmessage.getText();
			System.out.println(text);
			Thread.sleep(2000);

			CNP.FileTransferClick.click();

			Thread.sleep(1000);

			CNP.SearchClick.click();

			Thread.sleep(1000);

			CNP.ShowHideAdvancedSearch.click();

			Thread.sleep(1000);
			CNP.AdvancedSearchSelectCorrelationDD1.click();

			CNP.selectcorrelation(title);
			Thread.sleep(1000);
			String title2 = driver.findElement(By.xpath("(//mat-select//div//span//span)[7]")).getText();
			System.out.println(title2);
			Thread.sleep(1000);

			if (title2.contains(title)) {

				child7.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Correlation Name 6");

			} else {

				child7.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ " when we Search with Correlation Name 6");

			}
		} catch (Exception e) {

			Thread.sleep(1000);
			child7.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child7);

	}

	@Test(priority = 9, enabled = true, description = "Verifying Correlation Names Page With Correlation Name 7")
	public void CNTestVerificationWithCN7() throws Exception {

		child8 = _extent_report.startTest("Verifying Correlation Names Page With Correlation Name 7");
		child8.assignCategory("CorrelationNames");

		try {

			String title = "Name7";
			Thread.sleep(2000);

			CNP.SettingClick.click();
			Thread.sleep(1000);

			CNP.CorrelationNamesClick.click();

			Thread.sleep(1000);
			CNP.CorrelationName7Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), title);
			Thread.sleep(2000);

			CNP.UpdateCorrelationsClick.click();

			String text = CNP.Actionmessage.getText();
			System.out.println(text);
			Thread.sleep(2000);

			CNP.FileTransferClick.click();

			Thread.sleep(1000);

			CNP.SearchClick.click();

			Thread.sleep(1000);

			CNP.ShowHideAdvancedSearch.click();
			Thread.sleep(1000);
			CNP.AdvancedSearchSelectCorrelationDD1.click();
			CNP.selectcorrelation(title);
			Thread.sleep(1000);
			String title2 = driver.findElement(By.xpath("(//mat-select//div//span//span)[7]")).getText();
			System.out.println(title2);
			Thread.sleep(1000);

			if (title2.contains(title)) {

				child8.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Correlation Name 7");

			} else {

				child8.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ " when we Search with Correlation Name 7");

			}
		} catch (Exception e) {

			Thread.sleep(1000);
			child8.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child8);

	}

	@Test(priority = 10, enabled = true, description = "Verifying Correlation Names Page With Correlation Name 8")
	public void CNTestVerificationWithCN8() throws Exception {

		child9 = _extent_report.startTest("Verifying Correlation Names Page With Correlation Name 8");
		child9.assignCategory("CorrelationNames");

		try {

			String title = "Name8";
			Thread.sleep(2000);

			CNP.SettingClick.click();
			Thread.sleep(1000);
			CNP.CorrelationNamesClick.click();
			Thread.sleep(2000);
			CNP.CorrelationName8Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), title);
			Thread.sleep(1000);

			CNP.UpdateCorrelationsClick.click();

			String text = CNP.Actionmessage.getText();
			System.out.println(text);
			Thread.sleep(2000);

			CNP.FileTransferClick.click();

			Thread.sleep(1000);

			CNP.SearchClick.click();

			Thread.sleep(1000);

			CNP.ShowHideAdvancedSearch.click();
			Thread.sleep(1000);

			CNP.AdvancedSearchSelectCorrelationDD1.click();
			CNP.selectcorrelation(title);
			Thread.sleep(1000);
			String title2 = driver.findElement(By.xpath("(//mat-select//div//span//span)[7]")).getText();
			System.out.println(title2);
			Thread.sleep(1000);

			if (title2.contains(title)) {

				child9.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Correlation Name 8");

			} else {

				child9.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ " when we Search with Correlation Name 8");

			}
		} catch (Exception e) {

			Thread.sleep(1000);
			child9.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child9);

	}

	@Test(priority = 11, enabled = true, description = "Verifying Correlation Names Page With Correlation Name 9")
	public void CNTestVerificationWithCN9() throws Exception {

		child10 = _extent_report.startTest("Verifying Correlation Names Page With Correlation Name 9");
		child10.assignCategory("CorrelationNames");

		try {

			String title = "Name9";
			Thread.sleep(2000);

			CNP.SettingClick.click();
			Thread.sleep(1000);
			CNP.CorrelationNamesClick.click();
			Thread.sleep(2000);
			CNP.CorrelationName9Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), title);
			Thread.sleep(2000);

			CNP.UpdateCorrelationsClick.click();

			String text = CNP.Actionmessage.getText();
			System.out.println(text);
			Thread.sleep(2000);

			CNP.FileTransferClick.click();

			Thread.sleep(1000);

			CNP.SearchClick.click();

			Thread.sleep(1000);

			CNP.ShowHideAdvancedSearch.click();
			Thread.sleep(2000);
			CNP.AdvancedSearchSelectCorrelationDD1.click();
			CNP.selectcorrelation(title);
			Thread.sleep(1000);
			String title2 = driver.findElement(By.xpath("(//mat-select//div//span//span)[7]")).getText();
			System.out.println(title2);
			Thread.sleep(1000);

			if (title2.contains(title)) {

				child10.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Correlation Name 9");

			} else {

				child10.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ " when we Search with Correlation Name 9");

			}
		} catch (Exception e) {

			Thread.sleep(1000);
			child10.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child10);

	}

	@Test(priority = 12, enabled = true, description = "Verifying Correlation Names Page With Correlation Name 10")
	public void CNTestVerificationWithCN10() throws Exception {

		child11 = _extent_report.startTest("Verifying Correlation Names Page With Correlation Name 10");
		child11.assignCategory("CorrelationNames");

		try {

			String title = "Name10";
			Thread.sleep(2000);

			CNP.SettingClick.click();
			Thread.sleep(1000);
			CNP.CorrelationNamesClick.click();
			Thread.sleep(2000);
			CNP.CorrelationName10Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), title);
			Thread.sleep(2000);

			CNP.UpdateCorrelationsClick.click();

			String text = CNP.Actionmessage.getText();
			System.out.println(text);
			Thread.sleep(2000);

			CNP.FileTransferClick.click();

			Thread.sleep(1000);

			CNP.SearchClick.click();

			Thread.sleep(1000);

			CNP.ShowHideAdvancedSearch.click();
			Thread.sleep(2000);
			CNP.AdvancedSearchSelectCorrelationDD1.click();
			CNP.selectcorrelation(title);
			Thread.sleep(1000);
			String title2 = driver.findElement(By.xpath("(//mat-select//div//span//span)[7]")).getText();
			System.out.println(title2);
			Thread.sleep(1000);

			if (title2.contains(title)) {

				child11.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Correlation Name 10");

			} else {

				child11.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ " when we Search with Correlation Name 10");

			}
		} catch (Exception e) {

			Thread.sleep(1000);
			child11.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child11);

	}

	@Test(priority = 13, enabled = true, description = "Verifying Correlation Names Page With Correlation Name 11")
	public void CNTestVerificationWithCN11() throws Exception {

		child12 = _extent_report.startTest("Verifying Correlation Names Page With Correlation Name 11");
		child12.assignCategory("CorrelationNames");

		try {

			String title = "Name11";
			Thread.sleep(2000);

			CNP.SettingClick.click();
			Thread.sleep(1000);
			CNP.CorrelationNamesClick.click();
			Thread.sleep(2000);

			CNP.CorrelationName11Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), title);
			Thread.sleep(2000);

			CNP.UpdateCorrelationsClick.click();

			String text = CNP.Actionmessage.getText();
			System.out.println(text);
			Thread.sleep(2000);

			CNP.FileTransferClick.click();

			Thread.sleep(1000);

			CNP.SearchClick.click();

			Thread.sleep(1000);

			CNP.ShowHideAdvancedSearch.click();

			Thread.sleep(1000);
			CNP.AdvancedSearchSelectCorrelationDD1.click();

			CNP.selectcorrelation(title);
			Thread.sleep(1000);
			String title2 = driver.findElement(By.xpath("(//mat-select//div//span//span)[7]")).getText();
			System.out.println(title2);
			Thread.sleep(1000);

			if (title2.contains(title)) {

				child12.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Correlation Name 11");

			} else {

				child12.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ " when we Search with Correlation Name 11");

			}
		} catch (Exception e) {

			Thread.sleep(1000);
			child12.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child12);

	}

	@Test(priority = 14, enabled = true, description = "Verifying Correlation Names Page With Correlation Name 12")
	public void CNTestVerificationWithCN12() throws Exception {

		child13 = _extent_report.startTest("Verifying Correlation Names Page With Correlation Name 12");
		child13.assignCategory("CorrelationNames");

		try {

			String title = "Name12";
			Thread.sleep(2000);

			CNP.SettingClick.click();
			Thread.sleep(1000);

			CNP.CorrelationNamesClick.click();

			Thread.sleep(1000);
			CNP.CorrelationName12Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), title);
			Thread.sleep(2000);

			CNP.UpdateCorrelationsClick.click();

			String text = CNP.Actionmessage.getText();
			System.out.println(text);
			Thread.sleep(2000);

			CNP.FileTransferClick.click();

			Thread.sleep(1000);

			CNP.SearchClick.click();

			Thread.sleep(1000);

			CNP.ShowHideAdvancedSearch.click();
			Thread.sleep(1000);
			CNP.AdvancedSearchSelectCorrelationDD1.click();
			CNP.selectcorrelation(title);
			Thread.sleep(1000);
			String title2 = driver.findElement(By.xpath("(//mat-select//div//span//span)[7]")).getText();
			System.out.println(title2);
			Thread.sleep(1000);

			if (title2.contains(title)) {

				child13.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Correlation Name 12");

			} else {

				child13.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ " when we Search with Correlation Name 12");

			}
		} catch (Exception e) {

			Thread.sleep(1000);
			child13.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child13);

	}

	@Test(priority = 15, enabled = true, description = "Verifying Correlation Names Page With Correlation Name 13")
	public void CNTestVerificationWithCN13() throws Exception {

		child14 = _extent_report.startTest("Verifying Correlation Names Page With Correlation Name 13");
		child14.assignCategory("CorrelationNames");

		try {

			String title = "Name13";
			Thread.sleep(2000);

			CNP.SettingClick.click();
			Thread.sleep(1000);
			CNP.CorrelationNamesClick.click();
			Thread.sleep(2000);
			CNP.CorrelationName13Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), title);
			Thread.sleep(1000);

			CNP.UpdateCorrelationsClick.click();

			String text = CNP.Actionmessage.getText();
			System.out.println(text);
			Thread.sleep(2000);

			CNP.FileTransferClick.click();

			Thread.sleep(1000);

			CNP.SearchClick.click();

			Thread.sleep(1000);

			CNP.ShowHideAdvancedSearch.click();
			Thread.sleep(1000);

			CNP.AdvancedSearchSelectCorrelationDD1.click();
			CNP.selectcorrelation(title);
			Thread.sleep(1000);
			String title2 = driver.findElement(By.xpath("(//mat-select//div//span//span)[7]")).getText();
			System.out.println(title2);
			Thread.sleep(1000);

			if (title2.contains(title)) {

				child14.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Correlation Name 13");

			} else {

				child14.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ " when we Search with Correlation Name 13");

			}
		} catch (Exception e) {

			Thread.sleep(1000);
			child14.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child14);

	}

	@Test(priority = 16, enabled = true, description = "Verifying Correlation Names Page With Correlation Name 14")
	public void CNTestVerificationWithCN14() throws Exception {

		child15 = _extent_report.startTest("Verifying Correlation Names Page With Correlation Name 14");
		child15.assignCategory("CorrelationNames");

		try {

			String title = "Name14";
			Thread.sleep(2000);

			CNP.SettingClick.click();
			Thread.sleep(1000);
			CNP.CorrelationNamesClick.click();
			Thread.sleep(2000);
			CNP.CorrelationName14Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), title);
			Thread.sleep(2000);

			CNP.UpdateCorrelationsClick.click();

			String text = CNP.Actionmessage.getText();
			System.out.println(text);
			Thread.sleep(2000);

			CNP.FileTransferClick.click();

			Thread.sleep(1000);

			CNP.SearchClick.click();

			Thread.sleep(1000);

			CNP.ShowHideAdvancedSearch.click();
			Thread.sleep(2000);
			CNP.AdvancedSearchSelectCorrelationDD1.click();
			CNP.selectcorrelation(title);
			Thread.sleep(1000);
			String title2 = driver.findElement(By.xpath("(//mat-select//div//span//span)[7]")).getText();
			System.out.println(title2);
			Thread.sleep(1000);

			if (title2.contains(title)) {

				child15.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Correlation Name 14");

			} else {

				child15.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ " when we Search with Correlation Name 14");

			}
		} catch (Exception e) {

			Thread.sleep(1000);
			child15.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child15);

	}

	@Test(priority = 17, enabled = true, description = "Verifying Correlation Names Page With Correlation Name 15")
	public void CNTestVerificationWithCN15() throws Exception {

		child16 = _extent_report.startTest("Verifying Correlation Names Page With Correlation Name 15");
		child16.assignCategory("CorrelationNames");

		try {

			String title = "Name15";
			Thread.sleep(2000);

			CNP.SettingClick.click();
			Thread.sleep(1000);
			CNP.CorrelationNamesClick.click();
			Thread.sleep(2000);
			CNP.CorrelationName15Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), title);
			Thread.sleep(2000);

			CNP.UpdateCorrelationsClick.click();

			String text = CNP.Actionmessage.getText();
			System.out.println(text);
			Thread.sleep(2000);

			CNP.FileTransferClick.click();

			Thread.sleep(1000);

			CNP.SearchClick.click();

			Thread.sleep(1000);

			CNP.ShowHideAdvancedSearch.click();
			Thread.sleep(2000);
			CNP.AdvancedSearchSelectCorrelationDD1.click();
			CNP.selectcorrelation(title);
			Thread.sleep(1000);
			String title2 = driver.findElement(By.xpath("(//mat-select//div//span//span)[7]")).getText();
			System.out.println(title2);
			Thread.sleep(1000);

			if (title2.contains(title)) {

				child16.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Correlation Name 15");

			} else {

				child16.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ " when we Search with Correlation Name 15");

			}
		} catch (Exception e) {

			Thread.sleep(1000);
			child16.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child16);

	}

	@Test(priority = 18, enabled = true, description = "Verifying Correlation Names Page With Correlation Name 16")
	public void CNTestVerificationWithCN16() throws Exception {

		child17 = _extent_report.startTest("Verifying Correlation Names Page With Correlation Name 16");
		child17.assignCategory("CorrelationNames");

		try {

			String title = "Name16";
			Thread.sleep(2000);

			CNP.SettingClick.click();
			Thread.sleep(1000);
			CNP.CorrelationNamesClick.click();
			Thread.sleep(2000);

			CNP.CorrelationName16Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), title);
			Thread.sleep(2000);

			CNP.UpdateCorrelationsClick.click();

			String text = CNP.Actionmessage.getText();
			System.out.println(text);
			Thread.sleep(2000);

			CNP.FileTransferClick.click();

			Thread.sleep(1000);

			CNP.SearchClick.click();

			Thread.sleep(1000);

			CNP.ShowHideAdvancedSearch.click();

			Thread.sleep(1000);
			CNP.AdvancedSearchSelectCorrelationDD1.click();

			CNP.selectcorrelation(title);
			Thread.sleep(1000);
			String title2 = driver.findElement(By.xpath("(//mat-select//div//span//span)[7]")).getText();
			System.out.println(title2);
			Thread.sleep(1000);

			if (title2.contains(title)) {

				child17.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Correlation Name 16");

			} else {

				child17.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ " when we Search with Correlation Name 16");

			}
		} catch (Exception e) {

			Thread.sleep(1000);
			child17.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child17);

	}

	@Test(priority = 19, enabled = true, description = "Verifying Correlation Names Page With Correlation Name 17")
	public void CNTestVerificationWithCN17() throws Exception {

		child18 = _extent_report.startTest("Verifying Correlation Names Page With Correlation Name 17");
		child18.assignCategory("CorrelationNames");

		try {

			String title = "Name17";
			Thread.sleep(2000);

			CNP.SettingClick.click();
			Thread.sleep(1000);

			CNP.CorrelationNamesClick.click();

			Thread.sleep(1000);
			CNP.CorrelationName17Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), title);
			Thread.sleep(2000);

			CNP.UpdateCorrelationsClick.click();

			String text = CNP.Actionmessage.getText();
			System.out.println(text);
			Thread.sleep(2000);

			CNP.FileTransferClick.click();

			Thread.sleep(1000);

			CNP.SearchClick.click();

			Thread.sleep(1000);

			CNP.ShowHideAdvancedSearch.click();
			Thread.sleep(1000);
			CNP.AdvancedSearchSelectCorrelationDD1.click();
			CNP.selectcorrelation(title);
			Thread.sleep(1000);
			String title2 = driver.findElement(By.xpath("(//mat-select//div//span//span)[7]")).getText();
			System.out.println(title2);
			Thread.sleep(1000);

			if (title2.contains(title)) {

				child18.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Correlation Name 17");

			} else {

				child18.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ " when we Search with Correlation Name 17");

			}
		} catch (Exception e) {

			Thread.sleep(1000);
			child18.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child18);

	}

	@Test(priority = 20, enabled = true, description = "Verifying Correlation Names Page With Correlation Name 18")
	public void CNTestVerificationWithCN18() throws Exception {

		child19 = _extent_report.startTest("Verifying Correlation Names Page With Correlation Name 18");
		child19.assignCategory("CorrelationNames");

		try {

			String title = "Name18";
			Thread.sleep(2000);

			CNP.SettingClick.click();
			Thread.sleep(1000);
			CNP.CorrelationNamesClick.click();
			Thread.sleep(2000);

			CNP.CorrelationName18Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), title);
			Thread.sleep(1000);

			CNP.UpdateCorrelationsClick.click();

			String text = CNP.Actionmessage.getText();
			System.out.println(text);
			Thread.sleep(2000);

			CNP.FileTransferClick.click();

			Thread.sleep(1000);

			CNP.SearchClick.click();

			Thread.sleep(1000);

			CNP.ShowHideAdvancedSearch.click();
			Thread.sleep(1000);

			CNP.AdvancedSearchSelectCorrelationDD1.click();
			CNP.selectcorrelation(title);
			Thread.sleep(1000);
			String title2 = driver.findElement(By.xpath("(//mat-select//div//span//span)[7]")).getText();
			System.out.println(title2);
			Thread.sleep(1000);

			if (title2.contains(title)) {

				child19.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Correlation Name 18");

			} else {

				child19.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ " when we Search with Correlation Name 18");

			}
		} catch (Exception e) {

			Thread.sleep(1000);
			child19.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child19);

	}

	@Test(priority = 21, enabled = true, description = "Verifying Correlation Names Page With Correlation Name 19")
	public void CNTestVerificationWithCN19() throws Exception {

		child20 = _extent_report.startTest("Verifying Correlation Names Page With Correlation Name 19");
		child20.assignCategory("CorrelationNames");

		try {

			String title = "Name19";
			Thread.sleep(2000);

			CNP.SettingClick.click();
			Thread.sleep(1000);
			CNP.CorrelationNamesClick.click();
			Thread.sleep(2000);
			CNP.CorrelationName19Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), title);
			Thread.sleep(2000);

			CNP.UpdateCorrelationsClick.click();

			String text = CNP.Actionmessage.getText();
			System.out.println(text);
			Thread.sleep(2000);

			CNP.FileTransferClick.click();

			Thread.sleep(1000);

			CNP.SearchClick.click();

			Thread.sleep(1000);

			CNP.ShowHideAdvancedSearch.click();
			Thread.sleep(2000);
			CNP.AdvancedSearchSelectCorrelationDD1.click();
			CNP.selectcorrelation(title);
			Thread.sleep(1000);
			String title2 = driver.findElement(By.xpath("(//mat-select//div//span//span)[7]")).getText();
			System.out.println(title2);
			Thread.sleep(1000);

			if (title2.contains(title)) {

				child20.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Correlation Name 19");

			} else {

				child20.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ " when we Search with Correlation Name 19");

			}
		} catch (Exception e) {

			Thread.sleep(1000);
			child20.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child20);

	}

	@Test(priority = 22, enabled = true, description = "Verifying Correlation Names Page With Correlation Name 20")
	public void CNTestVerificationWithCN20() throws Exception {

		child21 = _extent_report.startTest("Verifying Correlation Names Page With Correlation Name 20");
		child21.assignCategory("CorrelationNames");

		try {

			String title = "Name20";
			Thread.sleep(2000);

			CNP.SettingClick.click();
			Thread.sleep(1000);
			CNP.CorrelationNamesClick.click();
			Thread.sleep(2000);
			CNP.CorrelationName20Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), title);
			Thread.sleep(2000);

			CNP.UpdateCorrelationsClick.click();

			String text = CNP.Actionmessage.getText();
			System.out.println(text);
			Thread.sleep(2000);

			CNP.FileTransferClick.click();

			Thread.sleep(1000);

			CNP.SearchClick.click();

			Thread.sleep(1000);

			CNP.ShowHideAdvancedSearch.click();
			Thread.sleep(2000);
			CNP.AdvancedSearchSelectCorrelationDD1.click();
			CNP.selectcorrelation(title);
			Thread.sleep(1000);
			String title2 = driver.findElement(By.xpath("(//mat-select//div//span//span)[7]")).getText();
			System.out.println(title2);
			Thread.sleep(1000);

			if (title2.contains(title)) {

				child21.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Correlation Name 20");

			} else {

				child21.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ " when we Search with Correlation Name 20");

			}
		} catch (Exception e) {

			Thread.sleep(1000);
			child21.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child21);

	}

	@Test(priority = 23, enabled = true, description = "Verifying Correlation Names Page With Correlation Name 21")
	public void CNTestVerificationWithCN21() throws Exception {

		child22 = _extent_report.startTest("Verifying Correlation Names Page With Correlation Name 21");
		child22.assignCategory("CorrelationNames");

		try {

			String title = "Name21";
			Thread.sleep(2000);

			CNP.SettingClick.click();
			Thread.sleep(1000);
			CNP.CorrelationNamesClick.click();
			Thread.sleep(2000);

			CNP.CorrelationName21Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), title);
			Thread.sleep(2000);

			CNP.UpdateCorrelationsClick.click();

			String text = CNP.Actionmessage.getText();
			System.out.println(text);
			Thread.sleep(2000);

			CNP.FileTransferClick.click();

			Thread.sleep(1000);

			CNP.SearchClick.click();

			Thread.sleep(1000);

			CNP.ShowHideAdvancedSearch.click();

			Thread.sleep(1000);
			CNP.AdvancedSearchSelectCorrelationDD1.click();

			CNP.selectcorrelation(title);
			Thread.sleep(1000);
			String title2 = driver.findElement(By.xpath("(//mat-select//div//span//span)[7]")).getText();
			System.out.println(title2);
			Thread.sleep(1000);

			if (title2.contains(title)) {

				child22.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Correlation Name 21");

			} else {

				child22.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ " when we Search with Correlation Name 21");

			}
		} catch (Exception e) {

			Thread.sleep(1000);
			child22.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child22);

	}

	@Test(priority = 24, enabled = true, description = "Verifying Correlation Names Page With Correlation Name 22")
	public void CNTestVerificationWithCN22() throws Exception {

		child23 = _extent_report.startTest("Verifying Correlation Names Page With Correlation Name 22");
		child23.assignCategory("CorrelationNames");

		try {

			String title = "Name22";
			Thread.sleep(2000);

			CNP.SettingClick.click();
			Thread.sleep(1000);

			CNP.CorrelationNamesClick.click();

			Thread.sleep(1000);
			CNP.CorrelationName22Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), title);
			Thread.sleep(2000);

			CNP.UpdateCorrelationsClick.click();

			String text = CNP.Actionmessage.getText();
			System.out.println(text);
			Thread.sleep(2000);

			CNP.FileTransferClick.click();

			Thread.sleep(1000);

			CNP.SearchClick.click();

			Thread.sleep(1000);

			CNP.ShowHideAdvancedSearch.click();
			Thread.sleep(1000);
			CNP.AdvancedSearchSelectCorrelationDD1.click();
			CNP.selectcorrelation(title);
			Thread.sleep(1000);
			String title2 = driver.findElement(By.xpath("(//mat-select//div//span//span)[7]")).getText();
			System.out.println(title2);
			Thread.sleep(1000);

			if (title2.contains(title)) {

				child23.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Correlation Name 22");

			} else {

				child23.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ " when we Search with Correlation Name 22");

			}
		} catch (Exception e) {

			Thread.sleep(1000);
			child23.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child23);

	}

	@Test(priority = 25, enabled = true, description = "Verifying Correlation Names Page With Correlation Name 23")
	public void CNTestVerificationWithCN23() throws Exception {

		child24 = _extent_report.startTest("Verifying Correlation Names Page With Correlation Name 23");
		child24.assignCategory("CorrelationNames");

		try {

			String title = "Name23";
			Thread.sleep(2000);

			CNP.SettingClick.click();
			Thread.sleep(1000);
			CNP.CorrelationNamesClick.click();
			Thread.sleep(2000);
			CNP.CorrelationName23Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), title);
			Thread.sleep(1000);

			CNP.UpdateCorrelationsClick.click();

			String text = CNP.Actionmessage.getText();
			System.out.println(text);
			Thread.sleep(2000);

			CNP.FileTransferClick.click();

			Thread.sleep(1000);

			CNP.SearchClick.click();

			Thread.sleep(1000);

			CNP.ShowHideAdvancedSearch.click();
			Thread.sleep(1000);

			CNP.AdvancedSearchSelectCorrelationDD1.click();
			CNP.selectcorrelation(title);
			Thread.sleep(1000);
			String title2 = driver.findElement(By.xpath("(//mat-select//div//span//span)[7]")).getText();
			System.out.println(title2);
			Thread.sleep(1000);

			if (title2.contains(title)) {

				child24.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Correlation Name 23");

			} else {

				child24.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ " when we Search with Correlation Name 23");

			}
		} catch (Exception e) {

			Thread.sleep(1000);
			child24.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child24);

	}

	@Test(priority = 26, enabled = true, description = "Verifying Correlation Names Page With Correlation Name 24")
	public void CNTestVerificationWithCN24() throws Exception {

		child25 = _extent_report.startTest("Verifying Correlation Names Page With Correlation Name 24");
		child25.assignCategory("CorrelationNames");

		try {

			String title = "Name24";
			Thread.sleep(2000);

			CNP.SettingClick.click();
			Thread.sleep(1000);
			CNP.CorrelationNamesClick.click();
			Thread.sleep(2000);
			CNP.CorrelationName24Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), title);
			Thread.sleep(2000);

			CNP.UpdateCorrelationsClick.click();

			String text = CNP.Actionmessage.getText();
			System.out.println(text);
			Thread.sleep(2000);

			CNP.FileTransferClick.click();

			Thread.sleep(1000);

			CNP.SearchClick.click();

			Thread.sleep(1000);

			CNP.ShowHideAdvancedSearch.click();
			Thread.sleep(2000);
			CNP.AdvancedSearchSelectCorrelationDD1.click();
			CNP.selectcorrelation(title);
			Thread.sleep(1000);
			String title2 = driver.findElement(By.xpath("(//mat-select//div//span//span)[7]")).getText();
			System.out.println(title2);
			Thread.sleep(1000);

			if (title2.contains(title)) {

				child25.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Correlation Name 24");

			} else {

				child25.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ " when we Search with Correlation Name 24");

			}
		} catch (Exception e) {

			Thread.sleep(1000);
			child25.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child25);

	}

	@Test(priority = 27, enabled = true, description = "Verifying Correlation Names Page With Correlation Name 25")
	public void CNTestVerificationWithCN25() throws Exception {

		child26 = _extent_report.startTest("Verifying Correlation Names Page With Correlation Name 25");
		child26.assignCategory("CorrelationNames");

		try {

			String title = "ABCD ID";
			Thread.sleep(2000);

			CNP.SettingClick.click();
			Thread.sleep(1000);
			CNP.CorrelationNamesClick.click();
			Thread.sleep(2000);
			CNP.CorrelationName25Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), title);
			Thread.sleep(2000);

			CNP.UpdateCorrelationsClick.click();

			String text = CNP.Actionmessage.getText();
			System.out.println(text);
			Thread.sleep(2000);

			CNP.FileTransferClick.click();

			Thread.sleep(1000);

			CNP.SearchClick.click();

			Thread.sleep(1000);

			CNP.ShowHideAdvancedSearch.click();
			Thread.sleep(2000);
			CNP.AdvancedSearchSelectCorrelationDD1.click();
			CNP.selectcorrelation(title);
			Thread.sleep(1000);
			String title2 = driver.findElement(By.xpath("(//mat-select//div//span//span)[7]")).getText();
			System.out.println(title2);
			Thread.sleep(1000);

			System.out.println(title2);
			if (title2.contains(title)) {

				child26.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Correlation Name 25");

			} else {

				child26.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ " when we Search with Correlation Name 25");

			}
		} catch (Exception e) {

			Thread.sleep(1000);
			child26.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child26);

	}

	@Test(priority = 28, enabled = true, description = "Verifying Correlation Names Page With Correlation Name 26")
	public void CNTestVerificationWithCN26() throws Exception {

		child27 = _extent_report.startTest("Verifying Correlation Names Page With Correlation Name 26");
		child27.assignCategory("CorrelationNames");

		try {

			String title = "Name26";
			Thread.sleep(2000);

			CNP.SettingClick.click();
			Thread.sleep(1000);
			CNP.CorrelationNamesClick.click();
			Thread.sleep(2000);

			CNP.CorrelationName26Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), title);
			Thread.sleep(2000);

			CNP.UpdateCorrelationsClick.click();

			String text = CNP.Actionmessage.getText();
			System.out.println(text);
			Thread.sleep(2000);

			CNP.FileTransferClick.click();

			Thread.sleep(1000);

			CNP.SearchClick.click();

			Thread.sleep(1000);

			CNP.ShowHideAdvancedSearch.click();

			Thread.sleep(1000);
			CNP.AdvancedSearchSelectCorrelationDD1.click();

			CNP.selectcorrelation(title);
			Thread.sleep(1000);
			String title2 = driver.findElement(By.xpath("(//mat-select//div//span//span)[7]")).getText();
			System.out.println(title2);
			Thread.sleep(1000);

			if (title2.contains(title)) {

				child27.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Correlation Name 26");

			} else {

				child27.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ " when we Search with Correlation Name 26");

			}
		} catch (Exception e) {

			Thread.sleep(1000);
			child27.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child27);

	}

	@Test(priority = 29, enabled = true, description = "Verifying Correlation Names Page With Correlation Name 27")
	public void CNTestVerificationWithCN27() throws Exception {

		child28 = _extent_report.startTest("Verifying Correlation Names Page With Correlation Name 27");
		child28.assignCategory("CorrelationNames");

		try {

			String title = "Name27";
			Thread.sleep(2000);

			CNP.SettingClick.click();
			Thread.sleep(1000);

			CNP.CorrelationNamesClick.click();

			Thread.sleep(1000);
			CNP.CorrelationName27Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), title);
			Thread.sleep(2000);

			CNP.UpdateCorrelationsClick.click();

			String text = CNP.Actionmessage.getText();
			System.out.println(text);
			Thread.sleep(2000);

			CNP.FileTransferClick.click();

			Thread.sleep(1000);

			CNP.SearchClick.click();

			Thread.sleep(1000);

			CNP.ShowHideAdvancedSearch.click();
			Thread.sleep(1000);
			CNP.AdvancedSearchSelectCorrelationDD1.click();
			CNP.selectcorrelation(title);
			Thread.sleep(1000);
			String title2 = driver.findElement(By.xpath("(//mat-select//div//span//span)[7]")).getText();
			System.out.println(title2);
			Thread.sleep(1000);

			if (title2.contains(title)) {

				child28.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Correlation Name 27");

			} else {

				child28.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ " when we Search with Correlation Name 27");

			}
		} catch (Exception e) {

			Thread.sleep(1000);
			child28.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child28);

	}

	@Test(priority = 30, enabled = true, description = "Verifying Correlation Names Page With Correlation Name 28")
	public void CNTestVerificationWithCN28() throws Exception {

		child29 = _extent_report.startTest("Verifying Correlation Names Page With Correlation Name 28");
		child29.assignCategory("CorrelationNames");

		try {

			String title = "Name28";
			Thread.sleep(2000);

			CNP.SettingClick.click();
			Thread.sleep(1000);
			CNP.CorrelationNamesClick.click();
			Thread.sleep(2000);
			CNP.CorrelationName28Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), title);
			Thread.sleep(1000);

			CNP.UpdateCorrelationsClick.click();

			String text = CNP.Actionmessage.getText();
			System.out.println(text);
			Thread.sleep(2000);

			CNP.FileTransferClick.click();

			Thread.sleep(1000);

			CNP.SearchClick.click();

			Thread.sleep(1000);

			CNP.ShowHideAdvancedSearch.click();
			Thread.sleep(1000);

			CNP.AdvancedSearchSelectCorrelationDD1.click();
			CNP.selectcorrelation(title);
			Thread.sleep(1000);
			String title2 = driver.findElement(By.xpath("(//mat-select//div//span//span)[7]")).getText();
			System.out.println(title2);
			Thread.sleep(1000);

			if (title2.contains(title)) {

				child29.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Correlation Name 28");

			} else {

				child29.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ " when we Search with Correlation Name 28");

			}
		} catch (Exception e) {

			Thread.sleep(1000);
			child29.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child29);

	}

	@Test(priority = 31, enabled = true, description = "Verifying Correlation Names Page With Correlation Name 29")
	public void CNTestVerificationWithCN29() throws Exception {

		child30 = _extent_report.startTest("Verifying Correlation Names Page With Correlation Name 29");
		child30.assignCategory("CorrelationNames");

		try {

			String title = "Name29";
			Thread.sleep(2000);

			CNP.SettingClick.click();
			Thread.sleep(1000);
			CNP.CorrelationNamesClick.click();
			Thread.sleep(2000);
			CNP.CorrelationName29Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), title);
			Thread.sleep(2000);

			CNP.UpdateCorrelationsClick.click();

			String text = CNP.Actionmessage.getText();
			System.out.println(text);
			Thread.sleep(2000);

			CNP.FileTransferClick.click();

			Thread.sleep(1000);

			CNP.SearchClick.click();

			Thread.sleep(1000);

			CNP.ShowHideAdvancedSearch.click();
			Thread.sleep(2000);
			CNP.AdvancedSearchSelectCorrelationDD1.click();
			CNP.selectcorrelation(title);
			Thread.sleep(1000);
			String title2 = driver.findElement(By.xpath("(//mat-select//div//span//span)[7]")).getText();
			System.out.println(title2);
			Thread.sleep(1000);

			if (title2.contains(title)) {

				child30.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Correlation Name 29");

			} else {

				child30.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ " when we Search with Correlation Name 29");

			}
		} catch (Exception e) {

			Thread.sleep(1000);
			child30.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child30);

	}

	@Test(priority = 32, enabled = true, description = "Verifying Correlation Names Page With Correlation Name 30")
	public void CNTestVerificationWithCN30() throws Exception {

		child31 = _extent_report.startTest("Verifying Correlation Names Page With Correlation Name 30");
		child31.assignCategory("CorrelationNames");

		try {

			String title = "Name30";
			Thread.sleep(2000);

			CNP.SettingClick.click();
			Thread.sleep(1000);
			CNP.CorrelationNamesClick.click();
			Thread.sleep(2000);
			CNP.CorrelationName30Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), title);
			Thread.sleep(2000);

			CNP.UpdateCorrelationsClick.click();

			String text = CNP.Actionmessage.getText();
			System.out.println(text);
			Thread.sleep(2000);

			CNP.FileTransferClick.click();

			Thread.sleep(1000);

			CNP.SearchClick.click();

			Thread.sleep(1000);

			CNP.ShowHideAdvancedSearch.click();
			Thread.sleep(2000);
			CNP.AdvancedSearchSelectCorrelationDD1.click();
			CNP.selectcorrelation(title);
			Thread.sleep(1000);
			String title2 = driver.findElement(By.xpath("(//mat-select//div//span//span)[7]")).getText();
			System.out.println(title2);
			Thread.sleep(1000);

			if (title2.contains(title)) {

				child31.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Correlation Name 30");

			} else {

				child31.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ " when we Search with Correlation Name 30");

			}
		} catch (Exception e) {

			Thread.sleep(1000);
			child31.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child31);

	}

	@Test(priority = 33, enabled = true, description = "Verifying Correlation Names Page With Correlation Name 31")
	public void CNTestVerificationWithCN31() throws Exception {

		child32 = _extent_report.startTest("Verifying Correlation Names Page With Correlation Name 31");
		child32.assignCategory("CorrelationNames");

		try {

			String title = "Name31";
			Thread.sleep(2000);

			CNP.SettingClick.click();
			Thread.sleep(1000);
			CNP.CorrelationNamesClick.click();
			Thread.sleep(2000);

			CNP.CorrelationName31Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), title);
			Thread.sleep(2000);

			CNP.UpdateCorrelationsClick.click();

			String text = CNP.Actionmessage.getText();
			System.out.println(text);
			Thread.sleep(2000);

			CNP.FileTransferClick.click();

			Thread.sleep(1000);

			CNP.SearchClick.click();

			Thread.sleep(1000);

			CNP.ShowHideAdvancedSearch.click();

			Thread.sleep(1000);
			CNP.AdvancedSearchSelectCorrelationDD1.click();

			CNP.selectcorrelation(title);
			Thread.sleep(1000);
			String title2 = driver.findElement(By.xpath("(//mat-select//div//span//span)[7]")).getText();
			System.out.println(title2);
			Thread.sleep(1000);

			if (title2.contains(title)) {

				child32.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Correlation Name 31");

			} else {

				child32.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ " when we Search with Correlation Name 31");

			}
		} catch (Exception e) {

			Thread.sleep(1000);
			child32.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child32);

	}

	@Test(priority = 34, enabled = true, description = "Verifying Correlation Names Page With Correlation Name 32")
	public void CNTestVerificationWithCN32() throws Exception {

		child33 = _extent_report.startTest("Verifying Correlation Names Page With Correlation Name 32");
		child33.assignCategory("CorrelationNames");

		try {

			String title = "Name32";
			Thread.sleep(2000);

			CNP.SettingClick.click();
			Thread.sleep(1000);

			CNP.CorrelationNamesClick.click();

			Thread.sleep(1000);
			CNP.CorrelationName32Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), title);
			Thread.sleep(2000);

			CNP.UpdateCorrelationsClick.click();

			String text = CNP.Actionmessage.getText();
			System.out.println(text);
			Thread.sleep(2000);

			CNP.FileTransferClick.click();

			Thread.sleep(1000);

			CNP.SearchClick.click();

			Thread.sleep(1000);

			CNP.ShowHideAdvancedSearch.click();
			Thread.sleep(1000);
			CNP.AdvancedSearchSelectCorrelationDD1.click();
			CNP.selectcorrelation(title);
			Thread.sleep(1000);
			String title2 = driver.findElement(By.xpath("(//mat-select//div//span//span)[7]")).getText();
			System.out.println(title2);
			Thread.sleep(1000);

			if (title2.contains(title)) {

				child33.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Correlation Name 32");

			} else {

				child33.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ " when we Search with Correlation Name 32");

			}
		} catch (Exception e) {

			Thread.sleep(1000);
			child33.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child33);

	}

	@Test(priority = 35, enabled = true, description = "Verifying Correlation Names Page With Correlation Name 33")
	public void CNTestVerificationWithCN33() throws Exception {

		child34 = _extent_report.startTest("Verifying Correlation Names Page With Correlation Name 33");
		child34.assignCategory("CorrelationNames");

		try {

			String title = "Name33";
			Thread.sleep(2000);

			CNP.SettingClick.click();
			Thread.sleep(1000);
			CNP.CorrelationNamesClick.click();
			Thread.sleep(2000);

			Thread.sleep(1000);
			CNP.CorrelationName33Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), title);
			Thread.sleep(1000);

			CNP.UpdateCorrelationsClick.click();

			String text = CNP.Actionmessage.getText();
			System.out.println(text);
			Thread.sleep(2000);

			CNP.FileTransferClick.click();

			Thread.sleep(1000);

			CNP.SearchClick.click();

			Thread.sleep(1000);

			CNP.ShowHideAdvancedSearch.click();
			Thread.sleep(1000);

			CNP.AdvancedSearchSelectCorrelationDD1.click();
			CNP.selectcorrelation(title);
			Thread.sleep(1000);
			String title2 = driver.findElement(By.xpath("(//mat-select//div//span//span)[7]")).getText();
			System.out.println(title2);
			Thread.sleep(1000);

			if (title2.contains(title)) {

				child34.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Correlation Name 33");

			} else {

				child34.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ " when we Search with Correlation Name 33");

			}
		} catch (Exception e) {

			Thread.sleep(1000);
			child34.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child34);

	}

	@Test(priority = 36, enabled = true, description = "Verifying Correlation Names Page With Correlation Name 34")
	public void CNTestVerificationWithCN34() throws Exception {

		child35 = _extent_report.startTest("Verifying Correlation Names Page With Correlation Name 34");
		child35.assignCategory("CorrelationNames");

		try {

			String title = "Name34";
			Thread.sleep(2000);

			CNP.SettingClick.click();
			Thread.sleep(1000);
			CNP.CorrelationNamesClick.click();
			Thread.sleep(2000);

			Thread.sleep(2000);
			CNP.CorrelationName34Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), title);
			Thread.sleep(2000);

			CNP.UpdateCorrelationsClick.click();

			String text = CNP.Actionmessage.getText();
			System.out.println(text);
			Thread.sleep(2000);

			CNP.FileTransferClick.click();

			Thread.sleep(1000);

			CNP.SearchClick.click();

			Thread.sleep(1000);

			CNP.ShowHideAdvancedSearch.click();
			Thread.sleep(2000);
			CNP.AdvancedSearchSelectCorrelationDD1.click();
			CNP.selectcorrelation(title);
			Thread.sleep(1000);
			String title2 = driver.findElement(By.xpath("(//mat-select//div//span//span)[7]")).getText();
			System.out.println(title2);
			Thread.sleep(1000);

			if (title2.contains(title)) {

				child35.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Correlation Name 34");

			} else {

				child35.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ " when we Search with Correlation Name 34");

			}
		} catch (Exception e) {

			Thread.sleep(1000);
			child35.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child35);

	}

	@Test(priority = 37, enabled = true, description = "Verifying Correlation Names Page With Correlation Name 35")
	public void CNTestVerificationWithCN35() throws Exception {

		child36 = _extent_report.startTest("Verifying Correlation Names Page With Correlation Name 35");
		child36.assignCategory("CorrelationNames");

		try {

			String title = "Name35";
			Thread.sleep(2000);

			CNP.SettingClick.click();
			Thread.sleep(1000);
			CNP.CorrelationNamesClick.click();
			Thread.sleep(2000);
			CNP.CorrelationName35Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), title);
			Thread.sleep(2000);

			CNP.UpdateCorrelationsClick.click();

			String text = CNP.Actionmessage.getText();
			System.out.println(text);
			Thread.sleep(2000);

			CNP.FileTransferClick.click();

			Thread.sleep(1000);

			CNP.SearchClick.click();

			Thread.sleep(1000);

			CNP.ShowHideAdvancedSearch.click();
			Thread.sleep(2000);
			CNP.AdvancedSearchSelectCorrelationDD1.click();
			CNP.selectcorrelation(title);
			Thread.sleep(1000);
			String title2 = driver.findElement(By.xpath("(//mat-select//div//span//span)[7]")).getText();
			System.out.println(title2);
			Thread.sleep(1000);

			if (title2.contains(title)) {

				child36.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Correlation Name 35");

			} else {

				child36.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ " when we Search with Correlation Name 35");

			}
		} catch (Exception e) {

			Thread.sleep(1000);
			child36.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child36);

	}

	@Test(priority = 38, enabled = true, description = "Verifying Correlation Names Page With Correlation Name 36")
	public void CNTestVerificationWithCN36() throws Exception {

		child37 = _extent_report.startTest("Verifying Correlation Names Page With Correlation Name 36");
		child37.assignCategory("CorrelationNames");

		try {

			String title = "Name36";
			Thread.sleep(2000);

			CNP.SettingClick.click();
			Thread.sleep(1000);
			CNP.CorrelationNamesClick.click();
			Thread.sleep(2000);

			CNP.CorrelationName36Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), title);
			Thread.sleep(2000);

			CNP.UpdateCorrelationsClick.click();

			String text = CNP.Actionmessage.getText();
			System.out.println(text);
			Thread.sleep(2000);

			CNP.FileTransferClick.click();

			Thread.sleep(1000);

			CNP.SearchClick.click();

			Thread.sleep(1000);

			CNP.ShowHideAdvancedSearch.click();

			Thread.sleep(1000);
			CNP.AdvancedSearchSelectCorrelationDD1.click();

			CNP.selectcorrelation(title);
			Thread.sleep(1000);
			String title2 = driver.findElement(By.xpath("(//mat-select//div//span//span)[7]")).getText();
			System.out.println(title2);
			Thread.sleep(1000);

			if (title2.contains(title)) {

				child37.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Correlation Name 36");

			} else {

				child37.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ " when we Search with Correlation Name 36");

			}
		} catch (Exception e) {

			Thread.sleep(1000);
			child37.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child37);

	}

	@Test(priority = 39, enabled = true, description = "Verifying Correlation Names Page With Correlation Name 37")
	public void CNTestVerificationWithCN37() throws Exception {

		child38 = _extent_report.startTest("Verifying Correlation Names Page With Correlation Name 37");
		child38.assignCategory("CorrelationNames");

		try {

			String title = "Name37";
			Thread.sleep(2000);

			CNP.SettingClick.click();
			Thread.sleep(1000);

			CNP.CorrelationNamesClick.click();

			Thread.sleep(1000);
			CNP.CorrelationName37Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), title);
			Thread.sleep(2000);

			CNP.UpdateCorrelationsClick.click();

			String text = CNP.Actionmessage.getText();
			System.out.println(text);
			Thread.sleep(2000);

			CNP.FileTransferClick.click();

			Thread.sleep(1000);

			CNP.SearchClick.click();

			Thread.sleep(1000);

			CNP.ShowHideAdvancedSearch.click();
			Thread.sleep(1000);
			CNP.AdvancedSearchSelectCorrelationDD1.click();
			CNP.selectcorrelation(title);
			Thread.sleep(1000);
			String title2 = driver.findElement(By.xpath("(//mat-select//div//span//span)[7]")).getText();
			System.out.println(title2);
			Thread.sleep(1000);

			if (title2.contains(title)) {

				child38.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Correlation Name 37");

			} else {

				child38.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ " when we Search with Correlation Name 37");

			}
		} catch (Exception e) {

			Thread.sleep(1000);
			child38.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child38);

	}

	@Test(priority = 40, enabled = true, description = "Verifying Correlation Names Page With Correlation Name 38")
	public void CNTestVerificationWithCN38() throws Exception {

		child39 = _extent_report.startTest("Verifying Correlation Names Page With Correlation Name 38");
		child39.assignCategory("CorrelationNames");

		try {

			String title = "Name38";
			Thread.sleep(2000);

			CNP.SettingClick.click();
			Thread.sleep(1000);
			CNP.CorrelationNamesClick.click();
			Thread.sleep(2000);
			CNP.CorrelationName38Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), title);
			Thread.sleep(1000);

			CNP.UpdateCorrelationsClick.click();

			String text = CNP.Actionmessage.getText();
			System.out.println(text);
			Thread.sleep(2000);

			CNP.FileTransferClick.click();

			Thread.sleep(1000);

			CNP.SearchClick.click();

			Thread.sleep(1000);

			CNP.ShowHideAdvancedSearch.click();
			Thread.sleep(1000);

			CNP.AdvancedSearchSelectCorrelationDD1.click();
			CNP.selectcorrelation(title);
			Thread.sleep(1000);
			String title2 = driver.findElement(By.xpath("(//mat-select//div//span//span)[7]")).getText();
			System.out.println(title2);
			Thread.sleep(1000);

			if (title2.contains(title)) {

				child39.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Correlation Name 38");

			} else {

				child39.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ " when we Search with Correlation Name 38");

			}
		} catch (Exception e) {

			Thread.sleep(1000);
			child39.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child39);

	}

	@Test(priority = 41, enabled = true, description = "Verifying Correlation Names Page With Correlation Name 39")
	public void CNTestVerificationWithCN39() throws Exception {

		child40 = _extent_report.startTest("Verifying Correlation Names Page With Correlation Name 39");
		child40.assignCategory("CorrelationNames");

		try {

			String title = "Name39";
			Thread.sleep(2000);

			CNP.SettingClick.click();
			Thread.sleep(1000);
			CNP.CorrelationNamesClick.click();
			Thread.sleep(2000);
			CNP.CorrelationName39Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), title);
			Thread.sleep(2000);

			CNP.UpdateCorrelationsClick.click();

			String text = CNP.Actionmessage.getText();
			System.out.println(text);
			Thread.sleep(2000);

			CNP.FileTransferClick.click();

			Thread.sleep(1000);

			CNP.SearchClick.click();

			Thread.sleep(1000);

			CNP.ShowHideAdvancedSearch.click();
			Thread.sleep(2000);
			CNP.AdvancedSearchSelectCorrelationDD1.click();
			CNP.selectcorrelation(title);
			Thread.sleep(1000);
			String title2 = driver.findElement(By.xpath("(//mat-select//div//span//span)[7]")).getText();
			System.out.println(title2);
			Thread.sleep(1000);

			if (title2.contains(title)) {

				child40.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Correlation Name 39");

			} else {

				child40.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ " when we Search with Correlation Name 39");

			}
		} catch (Exception e) {

			Thread.sleep(1000);
			child40.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child40);

	}

	@Test(priority = 42, enabled = true, description = "Verifying Correlation Names Page With Correlation Name 40")
	public void CNTestVerificationWithCN40() throws Exception {

		child41 = _extent_report.startTest("Verifying Correlation Names Page With Correlation Name 40");
		child41.assignCategory("CorrelationNames");

		try {

			String title = "Name40";
			Thread.sleep(2000);

			CNP.SettingClick.click();
			Thread.sleep(1000);
			CNP.CorrelationNamesClick.click();
			Thread.sleep(2000);
			CNP.CorrelationName40Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), title);
			Thread.sleep(2000);

			CNP.UpdateCorrelationsClick.click();

			String text = CNP.Actionmessage.getText();
			System.out.println(text);
			Thread.sleep(2000);

			CNP.FileTransferClick.click();

			Thread.sleep(1000);

			CNP.SearchClick.click();

			Thread.sleep(1000);

			CNP.ShowHideAdvancedSearch.click();
			Thread.sleep(2000);
			CNP.AdvancedSearchSelectCorrelationDD1.click();
			CNP.selectcorrelation(title);
			Thread.sleep(1000);
			String title2 = driver.findElement(By.xpath("(//mat-select//div//span//span)[7]")).getText();
			System.out.println(title2);
			Thread.sleep(1000);

			if (title2.contains(title)) {

				child41.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Correlation Name 40");

			} else {

				child41.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ " when we Search with Correlation Name 40");

			}
		} catch (Exception e) {

			Thread.sleep(1000);
			child41.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child41);

	}

	@Test(priority = 43, enabled = true, description = "Verifying Correlation Names Page With Correlation Name 41")
	public void CNTestVerificationWithCN41() throws Exception {

		child42 = _extent_report.startTest("Verifying Correlation Names Page With Correlation Name 41");
		child42.assignCategory("CorrelationNames");

		try {

			String title = "Name41";
			Thread.sleep(2000);

			CNP.SettingClick.click();
			Thread.sleep(1000);
			CNP.CorrelationNamesClick.click();
			Thread.sleep(2000);

			CNP.CorrelationName41Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), title);
			Thread.sleep(2000);

			CNP.UpdateCorrelationsClick.click();

			String text = CNP.Actionmessage.getText();
			System.out.println(text);
			Thread.sleep(2000);

			CNP.FileTransferClick.click();

			Thread.sleep(1000);

			CNP.SearchClick.click();

			Thread.sleep(1000);

			CNP.ShowHideAdvancedSearch.click();

			Thread.sleep(1000);
			CNP.AdvancedSearchSelectCorrelationDD1.click();

			CNP.selectcorrelation(title);
			Thread.sleep(1000);
			String title2 = driver.findElement(By.xpath("(//mat-select//div//span//span)[7]")).getText();
			System.out.println(title2);
			Thread.sleep(1000);

			if (title2.contains(title)) {

				child42.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Correlation Name 41");

			} else {

				child42.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ " when we Search with Correlation Name 41");

			}
		} catch (Exception e) {

			Thread.sleep(1000);
			child42.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child42);

	}

	@Test(priority = 44, enabled = true, description = "Verifying Correlation Names Page With Correlation Name 42")
	public void CNTestVerificationWithCN42() throws Exception {

		child43 = _extent_report.startTest("Verifying Correlation Names Page With Correlation Name 42");
		child43.assignCategory("CorrelationNames");

		try {

			String title = "Name42";
			Thread.sleep(2000);

			CNP.SettingClick.click();
			Thread.sleep(1000);

			CNP.CorrelationNamesClick.click();

			Thread.sleep(1000);
			CNP.CorrelationName42Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), title);
			Thread.sleep(2000);

			CNP.UpdateCorrelationsClick.click();

			String text = CNP.Actionmessage.getText();
			System.out.println(text);
			Thread.sleep(2000);

			CNP.FileTransferClick.click();

			Thread.sleep(1000);

			CNP.SearchClick.click();

			Thread.sleep(1000);

			CNP.ShowHideAdvancedSearch.click();
			Thread.sleep(1000);
			CNP.AdvancedSearchSelectCorrelationDD1.click();
			CNP.selectcorrelation(title);
			Thread.sleep(1000);
			String title2 = driver.findElement(By.xpath("(//mat-select//div//span//span)[7]")).getText();
			System.out.println(title2);
			Thread.sleep(1000);

			if (title2.contains(title)) {

				child43.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Correlation Name 42");

			} else {

				child43.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ " when we Search with Correlation Name 42");

			}
		} catch (Exception e) {

			Thread.sleep(1000);
			child43.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child43);

	}

	@Test(priority = 45, enabled = true, description = "Verifying Correlation Names Page With Correlation Name 43")
	public void CNTestVerificationWithCN43() throws Exception {

		child44 = _extent_report.startTest("Verifying Correlation Names Page With Correlation Name 43");
		child44.assignCategory("CorrelationNames");

		try {

			String title = "Name43";
			Thread.sleep(2000);

			CNP.SettingClick.click();
			Thread.sleep(1000);
			CNP.CorrelationNamesClick.click();
			Thread.sleep(2000);
			CNP.CorrelationName43Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), title);
			Thread.sleep(1000);

			CNP.UpdateCorrelationsClick.click();

			String text = CNP.Actionmessage.getText();
			System.out.println(text);
			Thread.sleep(2000);

			CNP.FileTransferClick.click();

			Thread.sleep(1000);

			CNP.SearchClick.click();

			Thread.sleep(1000);

			CNP.ShowHideAdvancedSearch.click();
			Thread.sleep(1000);

			CNP.AdvancedSearchSelectCorrelationDD1.click();
			CNP.selectcorrelation(title);
			Thread.sleep(1000);
			String title2 = driver.findElement(By.xpath("(//mat-select//div//span//span)[7]")).getText();
			System.out.println(title2);
			Thread.sleep(1000);

			if (title2.contains(title)) {

				child44.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Correlation Name 43");

			} else {

				child44.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ " when we Search with Correlation Name 43");

			}
		} catch (Exception e) {

			Thread.sleep(1000);
			child44.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child44);

	}

	@Test(priority = 46, enabled = true, description = "Verifying Correlation Names Page With Correlation Name 44")
	public void CNTestVerificationWithCN44() throws Exception {

		child45 = _extent_report.startTest("Verifying Correlation Names Page With Correlation Name 44");
		child45.assignCategory("CorrelationNames");

		try {

			String title = "Name44";
			Thread.sleep(2000);

			CNP.SettingClick.click();
			Thread.sleep(1000);
			CNP.CorrelationNamesClick.click();
			Thread.sleep(2000);
			CNP.CorrelationName44Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), title);
			Thread.sleep(2000);

			CNP.UpdateCorrelationsClick.click();

			String text = CNP.Actionmessage.getText();
			System.out.println(text);
			Thread.sleep(2000);

			CNP.FileTransferClick.click();

			Thread.sleep(1000);

			CNP.SearchClick.click();

			Thread.sleep(1000);

			CNP.ShowHideAdvancedSearch.click();
			Thread.sleep(2000);
			CNP.AdvancedSearchSelectCorrelationDD1.click();
			CNP.selectcorrelation(title);
			Thread.sleep(1000);
			String title2 = driver.findElement(By.xpath("(//mat-select//div//span//span)[7]")).getText();
			System.out.println(title2);
			Thread.sleep(1000);

			if (title2.contains(title)) {

				child45.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Correlation Name 44");

			} else {

				child45.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ " when we Search with Correlation Name 44");

			}
		} catch (Exception e) {

			Thread.sleep(1000);
			child45.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child45);

	}

	@Test(priority = 47, enabled = true, description = "Verifying Correlation Names Page With Correlation Name 45")
	public void CNTestVerificationWithCN45() throws Exception {

		child46 = _extent_report.startTest("Verifying Correlation Names Page With Correlation Name 45");
		child46.assignCategory("CorrelationNames");

		try {

			String title = "Name45";
			Thread.sleep(2000);

			CNP.SettingClick.click();
			Thread.sleep(1000);
			CNP.CorrelationNamesClick.click();
			Thread.sleep(2000);
			CNP.CorrelationName45Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), title);
			Thread.sleep(2000);

			CNP.UpdateCorrelationsClick.click();

			String text = CNP.Actionmessage.getText();
			System.out.println(text);
			Thread.sleep(2000);

			CNP.FileTransferClick.click();

			Thread.sleep(1000);

			CNP.SearchClick.click();

			Thread.sleep(1000);

			CNP.ShowHideAdvancedSearch.click();
			Thread.sleep(2000);
			CNP.AdvancedSearchSelectCorrelationDD1.click();
			CNP.selectcorrelation(title);
			Thread.sleep(1000);
			String title2 = driver.findElement(By.xpath("(//mat-select//div//span//span)[7]")).getText();
			System.out.println(title2);
			Thread.sleep(1000);

			if (title2.contains(title)) {

				child46.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Correlation Name 45");

			} else {

				child46.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ " when we Search with Correlation Name 45");

			}
		} catch (Exception e) {

			Thread.sleep(1000);
			child46.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child46);

	}

	@Test(priority = 48, enabled = true, description = "Verifying Correlation Names Page With Correlation Name 46")
	public void CNTestVerificationWithCN46() throws Exception {

		child47 = _extent_report.startTest("Verifying Correlation Names Page With Correlation Name 46");
		child47.assignCategory("CorrelationNames");

		try {

			String title = "Name46";
			Thread.sleep(2000);

			CNP.SettingClick.click();
			Thread.sleep(1000);
			CNP.CorrelationNamesClick.click();
			Thread.sleep(2000);

			CNP.CorrelationName46Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), title);
			Thread.sleep(2000);

			CNP.UpdateCorrelationsClick.click();

			String text = CNP.Actionmessage.getText();
			System.out.println(text);
			Thread.sleep(2000);

			CNP.FileTransferClick.click();

			Thread.sleep(1000);

			CNP.SearchClick.click();

			Thread.sleep(1000);

			CNP.ShowHideAdvancedSearch.click();

			Thread.sleep(1000);
			CNP.AdvancedSearchSelectCorrelationDD1.click();

			CNP.selectcorrelation(title);
			Thread.sleep(1000);
			String title2 = driver.findElement(By.xpath("(//mat-select//div//span//span)[7]")).getText();
			System.out.println(title2);
			Thread.sleep(1000);

			if (title2.contains(title)) {

				child47.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Correlation Name 46");

			} else {

				child47.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ " when we Search with Correlation Name 46");

			}
		} catch (Exception e) {

			Thread.sleep(1000);
			child47.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child47);

	}

	@Test(priority = 49, enabled = true, description = "Verifying Correlation Names Page With Correlation Name 47")
	public void CNTestVerificationWithCN47() throws Exception {

		child48 = _extent_report.startTest("Verifying Correlation Names Page With Correlation Name 47");
		child48.assignCategory("CorrelationNames");

		try {

			String title = "Name47";
			Thread.sleep(2000);

			CNP.SettingClick.click();
			Thread.sleep(1000);

			CNP.CorrelationNamesClick.click();

			Thread.sleep(1000);
			CNP.CorrelationName47Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), title);
			Thread.sleep(2000);

			CNP.UpdateCorrelationsClick.click();

			String text = CNP.Actionmessage.getText();
			System.out.println(text);
			Thread.sleep(2000);

			CNP.FileTransferClick.click();

			Thread.sleep(1000);

			CNP.SearchClick.click();

			Thread.sleep(1000);

			CNP.ShowHideAdvancedSearch.click();
			Thread.sleep(1000);
			CNP.AdvancedSearchSelectCorrelationDD1.click();
			CNP.selectcorrelation(title);
			Thread.sleep(1000);
			String title2 = driver.findElement(By.xpath("(//mat-select//div//span//span)[7]")).getText();
			System.out.println(title2);
			Thread.sleep(1000);

			if (title2.contains(title)) {

				child48.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Correlation Name 47");

			} else {

				child48.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ " when we Search with Correlation Name 47");

			}
		} catch (Exception e) {

			Thread.sleep(1000);
			child48.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child48);

	}

	@Test(priority = 50, enabled = true, description = "Verifying Correlation Names Page With Correlation Name 48")
	public void CNTestVerificationWithCN48() throws Exception {

		child49 = _extent_report.startTest("Verifying Correlation Names Page With Correlation Name 48");
		child49.assignCategory("CorrelationNames");

		try {

			String title = "Name48";
			Thread.sleep(2000);

			CNP.SettingClick.click();
			Thread.sleep(1000);
			CNP.CorrelationNamesClick.click();
			Thread.sleep(2000);
			CNP.CorrelationName48Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), title);
			Thread.sleep(1000);

			CNP.UpdateCorrelationsClick.click();

			String text = CNP.Actionmessage.getText();
			System.out.println(text);
			Thread.sleep(2000);

			CNP.FileTransferClick.click();

			Thread.sleep(1000);

			CNP.SearchClick.click();

			Thread.sleep(1000);

			CNP.ShowHideAdvancedSearch.click();
			Thread.sleep(1000);

			CNP.AdvancedSearchSelectCorrelationDD1.click();
			CNP.selectcorrelation(title);
			Thread.sleep(1000);
			String title2 = driver.findElement(By.xpath("(//mat-select//div//span//span)[7]")).getText();
			System.out.println(title2);
			Thread.sleep(1000);

			if (title2.contains(title)) {

				child49.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Correlation Name 48");

			} else {

				child49.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ " when we Search with Correlation Name 48");

			}
		} catch (Exception e) {

			Thread.sleep(1000);
			child49.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child49);

	}

	@Test(priority = 51, enabled = true, description = "Verifying Correlation Names Page With Correlation Name 49")
	public void CNTestVerificationWithCN49() throws Exception {

		child50 = _extent_report.startTest("Verifying Correlation Names Page With Correlation Name 49");
		child50.assignCategory("CorrelationNames");

		try {

			String title = "Name49";
			Thread.sleep(2000);

			CNP.SettingClick.click();
			Thread.sleep(1000);
			CNP.CorrelationNamesClick.click();
			Thread.sleep(2000);
			CNP.CorrelationName49Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), title);
			Thread.sleep(2000);

			CNP.UpdateCorrelationsClick.click();

			String text = CNP.Actionmessage.getText();
			System.out.println(text);
			Thread.sleep(2000);

			CNP.FileTransferClick.click();

			Thread.sleep(1000);

			CNP.SearchClick.click();

			Thread.sleep(1000);

			CNP.ShowHideAdvancedSearch.click();
			Thread.sleep(2000);
			CNP.AdvancedSearchSelectCorrelationDD1.click();
			CNP.selectcorrelation(title);
			Thread.sleep(1000);
			String title2 = driver.findElement(By.xpath("(//mat-select//div//span//span)[7]")).getText();
			System.out.println(title2);
			Thread.sleep(1000);

			if (title2.contains(title)) {

				child50.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Correlation Name 49");

			} else {

				child50.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ " when we Search with Correlation Name 49");

			}
		} catch (Exception e) {

			Thread.sleep(1000);
			child50.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child50);

	}

	@Test(priority = 52, enabled = true, description = "Verifying Correlation Names Page With Correlation Name 50")
	public void CNTestVerificationWithCN50() throws Exception {

		child51 = _extent_report.startTest("Verifying Correlation Names Page With Correlation Name 50");
		child51.assignCategory("CorrelationNames");

		try {

			String title = "Name50";
			Thread.sleep(2000);

			CNP.SettingClick.click();
			Thread.sleep(1000);
			CNP.CorrelationNamesClick.click();
			Thread.sleep(2000);
			CNP.CorrelationName50Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), title);
			Thread.sleep(2000);

			CNP.UpdateCorrelationsClick.click();

			String text = CNP.Actionmessage.getText();
			System.out.println(text);
			Thread.sleep(2000);

			CNP.FileTransferClick.click();

			Thread.sleep(1000);

			CNP.SearchClick.click();

			Thread.sleep(1000);

			CNP.ShowHideAdvancedSearch.click();
			Thread.sleep(1000);
			CNP.AdvancedSearchSelectCorrelationDD1.click();
			CNP.selectcorrelation(title);
			Thread.sleep(1000);
			String title2 = driver.findElement(By.xpath("(//mat-select//div//span//span)[7]")).getText();
			System.out.println(title2);
			Thread.sleep(1000);

			if (title2.contains(title)) {

				child51.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Correlation Name 50");

			} else {

				child51.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ " when we Search with Correlation Name 50");

			}
		} catch (Exception e) {

			Thread.sleep(1000);
			child51.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child51);

	}

	@Test(priority = 53, enabled = true, description = "Verifying Correlation Names Page With Cancel")
	public void CNTestVerificationWithCancel() throws Exception {

		child52 = _extent_report.startTest("Verifying Correlation Names Page With Cancel");
		child52.assignCategory("CorrelationNames");

		try {

			Thread.sleep(1000);

			CNP.SettingClick.click();
			Thread.sleep(1000);

			CNP.CorrelationNamesClick.click();
			Thread.sleep(2000);

			CNP.CancelClick.click();
			Thread.sleep(1000);
			String title = driver.findElement(By.xpath("(//h3)[1]")).getText();
			System.out.println(title);
			if (title.equals("Home / File Transfers")) {

				child52.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Cancel");

			} else {

				child52.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ " when we Search with Cancel");

			}
		} catch (Exception e) {

			Thread.sleep(1000);
			child52.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child52);

	}

	@Test(priority = 54, enabled = true, description = "Verifying Correlation Names Page With update")
	public void CNTestVerificationWithUpdate() throws Exception {

		child53 = _extent_report.startTest("Verifying Correlation Names Page With update");
		child53.assignCategory("CorrelationNames");

		try {

			Thread.sleep(1000);

			CNP.SettingClick.click();
			Thread.sleep(1000);

			CNP.CorrelationNamesClick.click();
			Thread.sleep(2000);

			CNP.UpdateCorrelationsClick.click();
			Thread.sleep(1000);
			String title = CNP.Actionmessage.getText();
			System.out.println(title);
			if (title.equals("Correlation create/update successfully")) {

				child53.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with update");

			} else {

				child53.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ " when we Search with update");

			}
		} catch (Exception e) {

			Thread.sleep(1000);
			child53.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child53);

	}

	@AfterTest
	public void tearDown() {

		_test_logger7.appendChild(Parent17);

		Parent17.appendChild(child1).appendChild(child2).appendChild(child3).appendChild(child4).appendChild(child5)
				.appendChild(child6).appendChild(child7).appendChild(child8).appendChild(child9).appendChild(child10)
				.appendChild(child11).appendChild(child12).appendChild(child13).appendChild(child14)
				.appendChild(child15).appendChild(child16).appendChild(child17).appendChild(child18)
				.appendChild(child19).appendChild(child20).appendChild(child21).appendChild(child22)
				.appendChild(child23).appendChild(child24).appendChild(child25).appendChild(child26)
				.appendChild(child27).appendChild(child28).appendChild(child29).appendChild(child30)
				.appendChild(child31).appendChild(child32).appendChild(child33).appendChild(child34)
				.appendChild(child35).appendChild(child36).appendChild(child37).appendChild(child38)
				.appendChild(child39).appendChild(child40).appendChild(child41).appendChild(child42)
				.appendChild(child43).appendChild(child44).appendChild(child45).appendChild(child46)
				.appendChild(child47).appendChild(child48).appendChild(child49).appendChild(child50)
				.appendChild(child51).appendChild(child52).appendChild(child53);

		_extent_report.endTest(Parent17);

		_extent_report.endTest(_test_logger7);

		_extent_report.flush();

	}

}
