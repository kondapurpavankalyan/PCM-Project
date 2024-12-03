package com.pcm.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pcm.qa.base.TestBase;

import com.pcm.qa.pages.MultipleDataFlows;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class MultipleDataFlowsTest extends TestBase {

	MultipleDataFlows MDFP;
	MultipleDataFlowsTest MDFPT;

	public ExtentTest Parent10;
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
	
	public MultipleDataFlowsTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {

		MDFP = new MultipleDataFlows();
		MDFPT = new MultipleDataFlowsTest();
	}

	@BeforeTest
	public void setup() throws Exception {

		Extentreport();
		initialization();

	}

	@Test(priority = 1, enabled = true) // 150
	public void ParentNodeCreation() throws Exception {
		_test_logger401 = _extent_report.startTest("Multiple Data Flows");
		Parent10 = _extent_report.startTest("Multiple Data Flows");

	}

	@Test(priority = 2, enabled = true, description = "Verifying create from multiple flows page")
	public void multipledataflowpage() throws Throwable {

		child1 = _extent_report.startTest("Verifying create from multiple flows page");
		child1.assignCategory("Build Data Flow");
		try {
			Thread.sleep(3000);
			MDFP.setup();
			Thread.sleep(2000);
			MDFP.DFProfileSelection("CDnew08221", "AS2testbvc");
			MDFP.SearchWorkFlowClick.click();
			Thread.sleep(2000);
			MDFP.SetUPMultipleWorkFlowClick.click();

			String title = driver
					.findElement(By.xpath("//mat-panel-title[text()='  Create Flows from multiple dataflows. ']"))
					.getText();
			System.out.println(title);
			if (title.equalsIgnoreCase("Create Flows from multiple dataflows.")) {

				child1.log(LogStatus.PASS,
						"Validation successful because we are getting Multiple Data Flow Page title as '" + title
								+ "'.");
			} else {
				child1.log(LogStatus.FAIL,
						"Validation  unsuccessful because we are getting multiple Data Flow Page title as '" + title
								+ "' instead of Create Flows from multiple dataflows.");
			}

		} catch (Exception e) {
			Thread.sleep(1000);
			child1.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child1);
	}

	@Test(priority = 3, enabled = true, description = "Verifying create flows from multiple workflows page with partner name search")
	public void multipledataflowpagewithonlypartnername() throws Throwable {

		child2 = _extent_report
				.startTest("Verifying create flows from multiple workflows page with partner name search");
		child2.assignCategory("Build Data Flow");
		try {
			MDFP.CancelClick.click();
			Thread.sleep(2000);
			MDFP.DFProfileSelection("CDnew08221", "AS2testbvc");
			MDFP.SearchWorkFlowClick.click();
			Thread.sleep(2000);
			MDFP.SetUPMultipleWorkFlowClick.click();
			Thread.sleep(2000);
			MDFP.PartnernameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Test");
			Thread.sleep(1000);
			MDFP.SearchWorkFlowClick1.click();
			Boolean flag = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).isDisplayed();
			String title = flag.toString();

			System.out.println(title);
			if (title.equalsIgnoreCase("true")) {

				child2.log(LogStatus.PASS,
						"Validation successful because we are getting Data Flows with only Partner name");
			} else {
				child2.log(LogStatus.FAIL,
						"Validation Unsuccessful because we are not getting Data Flows with only Partner name");
			}

		} catch (Exception e) {
			Thread.sleep(1000);
			child2.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child2);
	}

	@Test(priority = 4, enabled = true, description = "Verifying create flows from multiple workflows page with application name search")
	public void multipledataflowpagewithonlyapplicationname() throws Throwable {

		child3 = _extent_report
				.startTest("Verifying create flows from multiple workflows page with application name search");
		child3.assignCategory("Build Data Flow");
		try {
			MDFP.CancelClick.click();
			Thread.sleep(2000);
			MDFP.DFProfileSelection("CDnew08221", "AS2testbvc");
			MDFP.SearchWorkFlowClick.click();
			Thread.sleep(2000);
			MDFP.SetUPMultipleWorkFlowClick.click();
			Thread.sleep(2000);
			MDFP.ApplicationnameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Test");
			Thread.sleep(1000);
			MDFP.SearchWorkFlowClick1.click();
			Boolean flag = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).isDisplayed();
			String title = flag.toString();

			System.out.println(title);
			if (title.equalsIgnoreCase("true")) {

				child3.log(LogStatus.PASS,
						"Validation successful because we are getting Data Flows with only application name");
			} else {
				child3.log(LogStatus.FAIL,
						"Validation Unsuccessful because we are not getting Data Flows with only application name");
			}

		} catch (Exception e) {
			Thread.sleep(1000);
			child3.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child3);
	}

	@Test(priority = 5, enabled = true, description = "Verifying create flows from multiple workflows page with SEQ Type as MFT search")
	public void multipledataflowpagewithonlyMFT() throws Throwable {

		child4 = _extent_report
				.startTest("Verifying create flows from multiple workflows page with SEQ Type as MFT search");
		child4.assignCategory("Build Data Flow");
		try {
			MDFP.CancelClick.click();
			Thread.sleep(2000);

			MDFP.DFProfileSelection("CDnew08221", "AS2testbvc");
			MDFP.SearchWorkFlowClick.click();
			Thread.sleep(2000);
			MDFP.SetUPMultipleWorkFlowClick.click();
			Thread.sleep(2000);
			DropDownSelection(MDFP.SeqtypeDD, "MFT");
			Thread.sleep(1000);
			MDFP.SearchWorkFlowClick1.click();
			Boolean flag = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).isDisplayed();
			String title = flag.toString();

			System.out.println(title);
			if (title.equalsIgnoreCase("true")) {

				child4.log(LogStatus.PASS,
						"Validation successful because we are getting Data Flows with SEQ Type as MFT search");
			} else {
				child4.log(LogStatus.FAIL,
						"Validation Unsuccessful because we are not getting Data Flows with SEQ Type as MFT search");
			}

		} catch (Exception e) {
			Thread.sleep(1000);
			child4.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child4);
	}

	@Test(priority = 6, enabled = true, description = "Verifying create flows from multiple workflows page with SEQ Type as DOCHANDLING search")
	public void multipledataflowpagewithonlyDocHandling() throws Throwable {

		child5 = _extent_report
				.startTest("Verifying create flows from multiple workflows page with SEQ Type as DOCHANDLING search");
		child5.assignCategory("Build Data Flow");
		try {
			MDFP.CancelClick.click();
			Thread.sleep(2000);

			MDFP.DFProfileSelection("CDnew08221", "AS2testbvc");
			MDFP.SearchWorkFlowClick.click();
			Thread.sleep(2000);
			MDFP.SetUPMultipleWorkFlowClick.click();
			Thread.sleep(2000);
			DropDownSelection(MDFP.SeqtypeDD, "DocHandling");
			Thread.sleep(1000);
			MDFP.SearchWorkFlowClick1.click();
			Boolean flag = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).isDisplayed();
			String title = flag.toString();

			System.out.println(title);
			if (title.equalsIgnoreCase("true")) {

				child5.log(LogStatus.PASS,
						"Validation successful because we are getting Data Flows with SEQ Type as DOCHANDLING search");
			} else {
				child5.log(LogStatus.FAIL,
						"Validation Unsuccessful because we are not getting Data Flows with SEQ Type as DOCHANDLING search");
			}

		} catch (Exception e) {
			Thread.sleep(1000);
			child5.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child5);
	}

	@Test(priority = 7, enabled = true, description = "Verifying create flows from multiple workflows page with Flow as Inbound search")
	public void multipledataflowpagewithonlyInbound() throws Throwable {

		child6 = _extent_report
				.startTest("Verifying create flows from multiple workflows page with Flow as Inbound search");
		child6.assignCategory("Build Data Flow");
		try {
			MDFP.CancelClick.click();
			Thread.sleep(2000);

			MDFP.DFProfileSelection("CDnew08221", "AS2testbvc");
			MDFP.SearchWorkFlowClick.click();
			Thread.sleep(2000);
			MDFP.SetUPMultipleWorkFlowClick.click();
			Thread.sleep(2000);
			DropDownSelection(MDFP.FlowDD, "Inbound");
			Thread.sleep(1000);
			MDFP.SearchWorkFlowClick1.click();
			Boolean flag = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).isDisplayed();
			String title = flag.toString();

			System.out.println(title);
			if (title.equalsIgnoreCase("true")) {

				child6.log(LogStatus.PASS,
						"Validation successful because we are getting Data Flows with Flow as Inbound search");
			} else {
				child6.log(LogStatus.FAIL,
						"Validation Unsuccessful because we are not getting Data Flows with Flow as Inbound search");
			}

		} catch (Exception e) {
			Thread.sleep(1000);
			child6.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child6);
	}

	@Test(priority = 8, enabled = true, description = "Verifying create flows from multiple workflows page with Flow as Outbound search")
	public void multipledataflowpagewithonlyOutbound() throws Throwable {

		child7 = _extent_report
				.startTest("Verifying create flows from multiple workflows page with Flow as Outbound search");
		child7.assignCategory("Build Data Flow");
		try {
			MDFP.CancelClick.click();
			Thread.sleep(2000);

			MDFP.DFProfileSelection("CDnew08221", "AS2testbvc");
			MDFP.SearchWorkFlowClick.click();
			Thread.sleep(2000);
			MDFP.SetUPMultipleWorkFlowClick.click();
			Thread.sleep(2000);
			DropDownSelection(MDFP.FlowDD, "Outbound");
			Thread.sleep(1000);
			MDFP.SearchWorkFlowClick1.click();
			Boolean flag = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).isDisplayed();
			String title = flag.toString();

			System.out.println(title);
			if (title.equalsIgnoreCase("true")) {

				child7.log(LogStatus.PASS,
						"Validation successful because we are getting Data Flows with Flow as Outbound search");
			} else {
				child7.log(LogStatus.FAIL,
						"Validation Unsuccessful because we are not getting Data Flows with Flow as Outbound search");
			}

		} catch (Exception e) {
			Thread.sleep(1000);
			child7.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child7);
	}

	@Test(priority = 9, enabled = true, description = "Verifying create flows from multiple workflows page with Filename search")
	public void multipledataflowpagewithonlyFilename() throws Throwable {

		child8 = _extent_report.startTest("Verifying create flows from multiple workflows page with Filename search");
		child8.assignCategory("Build Data Flow");
		try {
			MDFP.CancelClick.click();
			Thread.sleep(2000);

			MDFP.DFProfileSelection("CDnew08221", "AS2testbvc");
			MDFP.SearchWorkFlowClick.click();
			Thread.sleep(2000);
			MDFP.SetUPMultipleWorkFlowClick.click();
			Thread.sleep(2000);
			MDFP.FilenameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Test");
			Thread.sleep(1000);
			MDFP.SearchWorkFlowClick1.click();
			Boolean flag = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).isDisplayed();
			String title = flag.toString();

			System.out.println(title);
			if (title.equalsIgnoreCase("true")) {

				child8.log(LogStatus.PASS,
						"Validation successful because we are getting Data Flows with only Filename");
			} else {
				child8.log(LogStatus.FAIL,
						"Validation Unsuccessful because we are not getting Data Flows with only Filename");
			}

		} catch (Exception e) {
			Thread.sleep(1000);
			child8.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child8);
	}

	@Test(priority = 10, enabled = true, description = "Verifying create flows from multiple workflows page with Doctype search")
	public void multipledataflowpagewithonlyDoctype() throws Throwable {

		child9 = _extent_report.startTest("Verifying create flows from multiple workflows page with Doctype search");
		child9.assignCategory("Build Data Flow");
		try {
			MDFP.CancelClick.click();
			Thread.sleep(2000);

			MDFP.DFProfileSelection("CDnew08221", "AS2testbvc");
			MDFP.SearchWorkFlowClick.click();
			Thread.sleep(2000);
			MDFP.SetUPMultipleWorkFlowClick.click();
			Thread.sleep(2000);
			MDFP.DoctypeData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Test");
			Thread.sleep(1000);
			MDFP.SearchWorkFlowClick1.click();
			Boolean flag = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).isDisplayed();
			String title = flag.toString();

			System.out.println(title);
			if (title.equalsIgnoreCase("true")) {

				child9.log(LogStatus.PASS, "Validation successful because we are getting Data Flows with only Doctype");
			} else {
				child9.log(LogStatus.FAIL,
						"Validation Unsuccessful because we are not getting Data Flows with only Doctype");
			}

		} catch (Exception e) {
			Thread.sleep(1000);
			child9.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child9);
	}

	@Test(priority = 11, enabled = true, description = "Verifying create flows from multiple workflows page with SenderId search")
	public void multipledataflowpagewithonlySenderId() throws Throwable {

		child10 = _extent_report.startTest("Verifying create flows from multiple workflows page with SenderId search");
		child10.assignCategory("Build Data Flow");
		try {
			MDFP.CancelClick.click();
			Thread.sleep(2000);

			MDFP.DFProfileSelection("CDnew08221", "AS2testbvc");
			MDFP.SearchWorkFlowClick.click();
			Thread.sleep(2000);
			MDFP.SetUPMultipleWorkFlowClick.click();
			Thread.sleep(2000);
			MDFP.SenderIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Test");
			Thread.sleep(1000);
			MDFP.SearchWorkFlowClick1.click();
			Boolean flag = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).isDisplayed();
			String title = flag.toString();

			System.out.println(title);
			if (title.equalsIgnoreCase("true")) {

				child10.log(LogStatus.PASS,
						"Validation successful because we are getting Data Flows with only SenderId");
			} else {
				child10.log(LogStatus.FAIL,
						"Validation Unsuccessful because we are not getting Data Flows with only SenderId");
			}

		} catch (Exception e) {
			Thread.sleep(1000);
			child10.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child10);
	}

	@Test(priority = 12, enabled = true, description = "Verifying create flows from multiple workflows page with ReceiverId search")
	public void multipledataflowpagewithonlyReceiverId() throws Throwable {

		child11 = _extent_report
				.startTest("Verifying create flows from multiple workflows page with ReceiverId search");
		child11.assignCategory("Build Data Flow");
		try {
			MDFP.CancelClick.click();
			Thread.sleep(2000);

			MDFP.DFProfileSelection("CDnew08221", "AS2testbvc");
			MDFP.SearchWorkFlowClick.click();
			Thread.sleep(2000);
			MDFP.SetUPMultipleWorkFlowClick.click();
			Thread.sleep(2000);
			MDFP.ReceiverIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Test");
			Thread.sleep(1000);
			MDFP.SearchWorkFlowClick1.click();
			Boolean flag = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).isDisplayed();
			String title = flag.toString();

			System.out.println(title);
			if (title.equalsIgnoreCase("true")) {

				child11.log(LogStatus.PASS,
						"Validation successful because we are getting Data Flows with only ReceiverId");
			} else {
				child11.log(LogStatus.FAIL,
						"Validation Unsuccessful because we are not getting Data Flows with only ReceiverId");
			}

		} catch (Exception e) {
			Thread.sleep(1000);
			child11.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child11);
	}

	@Test(priority = 13, enabled = true, description = "Verifying create flows from multiple workflows page with Duplicate Partner Name")
	public void multipledataflowpagewithDuplicatePartnerName() throws Throwable {

		child12 = _extent_report
				.startTest("Verifying create flows from multiple workflows page with Duplicate Partner Name");
		child12.assignCategory("Build Data Flow");
		try {
			MDFP.CancelClick.click();
			Thread.sleep(2000);

			MDFP.DFProfileSelection("CDnew08221", "AS2testbvc");
			MDFP.SearchWorkFlowClick.click();
			Thread.sleep(2000);
			MDFP.SetUPMultipleWorkFlowClick.click();
			Thread.sleep(2000);
			MDFP.PartnernameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "TEMPLATE_EDI");
			Thread.sleep(1000);
			MDFP.SearchWorkFlowClick1.click();
			Boolean flag = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).isDisplayed();
			String title = flag.toString();

			System.out.println(title);
			if (title.equalsIgnoreCase("true")) {

				child12.log(LogStatus.PASS,
						"Validation successful because we are getting Data Flows with only Duplicate Partner Name");
			} else {
				child12.log(LogStatus.FAIL,
						"Validation Unsuccessful because we are not getting Data Flows with Duplicate Partner Name");
			}

		} catch (Exception e) {
			Thread.sleep(1000);
			child12.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child12);
	}

	@Test(priority = 14, enabled = true, description = "Verifying create flows from multiple workflows page with Search Workflows")
	public void multipledataflowpagewithSearchWorkflows() throws Throwable {

		child13 = _extent_report.startTest("Verifying create flows from multiple workflows page with Search Workflows");
		child13.assignCategory("Build Data Flow");
		try {
			MDFP.CancelClick.click();
			Thread.sleep(2000);

			MDFP.DFProfileSelection("CDnew08221", "AS2testbvc");
			MDFP.SearchWorkFlowClick.click();
			Thread.sleep(2000);
			MDFP.SetUPMultipleWorkFlowClick.click();
			Thread.sleep(2000);
			MDFP.SearchWorkFlowClick1.click();
			Boolean flag = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).isDisplayed();
			String title = flag.toString();

			System.out.println(title);
			if (title.equalsIgnoreCase("true")) {

				child13.log(LogStatus.PASS,
						"Validation successful because we are getting Data Flows with only Search Workflows");
			} else {
				child13.log(LogStatus.FAIL,
						"Validation Unsuccessful because we are not getting Data Flows with Search Workflows");
			}

		} catch (Exception e) {
			Thread.sleep(1000);
			child13.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child13);
	}

	@Test(priority = 15, enabled = true, description = "Verifying create flows from multiple workflows page with Page Nation")
	public void multipledataflowpagewithPageNation() throws Throwable {

		child14 = _extent_report.startTest("Verifying create flows from multiple workflows page with Page Nation");
		child14.assignCategory("Build Data Flow");
		try {
			MDFP.CancelClick.click();
			Thread.sleep(2000);

			MDFP.DFProfileSelection("CDnew08221", "AS2testbvc");
			MDFP.SearchWorkFlowClick.click();
			Thread.sleep(2000);
			MDFP.SetUPMultipleWorkFlowClick.click();
			Thread.sleep(2000);
			MDFP.PartnernameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "demo");
			Thread.sleep(1000);
			MDFP.SearchWorkFlowClick1.click();
			
			String count = driver.findElement(By.xpath("//div[@class='mat-paginator-range-label']")).getText();	
			System.out.println(count);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@aria-label='Last page']")).click();
			Thread.sleep(2000);
			Boolean flag = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).isDisplayed();
			String title = flag.toString();

			System.out.println(title);
			if (title.equalsIgnoreCase("true")) {

				child14.log(LogStatus.PASS,
						"Validation successful because we are getting Data Flows with only Page Nation");
			} else {
				child14.log(LogStatus.FAIL,
						"Validation Unsuccessful because we are not getting Data Flows with Page Nation");
			}

		} catch (Exception e) {
			Thread.sleep(1000);
			child14.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child14);
	}
	
	@Test(priority = 16, enabled = true, description = "Verifying create flows from multiple workflows page with Reset Button")
	public void multipledataflowpagewithResetButton() throws Throwable {

		child15 = _extent_report.startTest("Verifying create flows from multiple workflows page with Reset Button");
		child15.assignCategory("Build Data Flow");
		try {
			MDFP.CancelClick.click();
			Thread.sleep(2000);

			MDFP.DFProfileSelection("CDnew08221", "AS2testbvc");
			MDFP.SearchWorkFlowClick.click();
			Thread.sleep(2000);
			MDFP.SetUPMultipleWorkFlowClick.click();
			Thread.sleep(2000);
			MDFP.PartnernameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "demo");
			Thread.sleep(1000);
			MDFP.ApplicationnameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Test");
			Thread.sleep(1000);
			DropDownSelection(MDFP.SeqtypeDD, "MFT");
			Thread.sleep(1000);
			DropDownSelection(MDFP.FlowDD, "Inbound");
			Thread.sleep(1000);
			MDFP.SearchWorkFlowClick1.click();
			Thread.sleep(2000);
			MDFP.ResetButton.click();
			Thread.sleep(2000);
			if (MDFP.PartnernameData.getText().isEmpty() && MDFP.ApplicationnameData.getText().isEmpty()
					&& MDFP.SeqtypeDD != null && MDFP.FlowDD != null) {

				child15.log(LogStatus.PASS,
						"Validation successful because Reset Search is Resetting All the Fields");
			} else {
				child15.log(LogStatus.FAIL,
						"Validation successful because Reset Search is Resetting All the Fields");
			}

		} catch (Exception e) {
			Thread.sleep(1000);
			child15.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child15);
	}
	
	
	@Test(priority = 17, enabled = true, description = "Verifying create flows from multiple workflows page with Cancel Button")
	public void multipledataflowpagewithCancelButton() throws Throwable {

		child16 = _extent_report.startTest("Verifying create flows from multiple workflows page with Cancel Button");
		child16.assignCategory("Build Data Flow");
		try {
			MDFP.CancelClick.click();
			Thread.sleep(2000);

			MDFP.DFProfileSelection("CDnew08221", "AS2testbvc");
			MDFP.SearchWorkFlowClick.click();
			Thread.sleep(2000);
			MDFP.SetUPMultipleWorkFlowClick.click();
			Thread.sleep(2000);
			MDFP.PartnernameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "demo");
			Thread.sleep(1000);
			MDFP.ApplicationnameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Test");
			Thread.sleep(1000);
			MDFP.SearchWorkFlowClick1.click();
			Thread.sleep(2000);
			MDFP.CancelClick.click();
			Thread.sleep(2000);
			
			String title = MDFP.BuildDataFlowPagetitle.getText();
			if (title.contains("Build Data Flow")) {

				child16.log(LogStatus.PASS,
						"Validation successful because Build data flow is displayed when we click on Cancel button");
			} else {
				child16.log(LogStatus.FAIL,
						"Validation successful because Build data flow is not displayed when we click on Cancel button");
			}

		} catch (Exception e) {
			Thread.sleep(1000);
			child16.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child16);
	}

	@AfterTest
	public void afterTest() {

		_test_logger401.appendChild(Parent10);

		Parent10.appendChild(child1).appendChild(child2).appendChild(child3).appendChild(child4).appendChild(child5)
				.appendChild(child6).appendChild(child7).appendChild(child8).appendChild(child9).appendChild(child10)
				.appendChild(child11).appendChild(child12).appendChild(child13).appendChild(child14).appendChild(child15).appendChild(child16);

		_extent_report.endTest(Parent10);
		_extent_report.endTest(_test_logger401);
		_extent_report.flush();

	}

}
