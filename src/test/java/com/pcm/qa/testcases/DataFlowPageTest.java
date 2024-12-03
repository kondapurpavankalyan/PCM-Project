package com.pcm.qa.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pcm.qa.base.TestBase;
import com.pcm.qa.pages.DataFlowPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class DataFlowPageTest extends TestBase {

	DataFlowPage DFP;
	DataFlowPageTest DFPT;

	ExtentTest Parent2;
	ExtentTest child1;
	ExtentTest child2;
	ExtentTest child3;
	ExtentTest child4;
	ExtentTest child5;
	ExtentTest child6;
	ExtentTest child7;
	ExtentTest child8;
	ExtentTest child9;
	ExtentTest child10;
	ExtentTest child11;
	ExtentTest child12;
	ExtentTest child13;
	ExtentTest child14;
	ExtentTest child15;
	ExtentTest child16;
	ExtentTest child17;
	ExtentTest child18;
	ExtentTest child19;
	ExtentTest child20;
	ExtentTest child21;

	public DataFlowPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {

		DFPT = new DataFlowPageTest();
		DFP = new DataFlowPage();

	}

	@BeforeTest(enabled = true)
	public void setup() throws Exception {

		Extentreport();
		initialization();

	}

	@Test(priority = 1, enabled = true)
	public void ParentNodeCreation() throws Exception {

		_test_logger2 = _extent_report.startTest("Reports");
		Parent2 = _extent_report.startTest("Data Flow");

	}

	@Test(priority = 2, enabled = true, description = "Data Flow Page Title Verification")
	public void DataFlowTitleTest() throws Exception {

		child1 = _extent_report.startTest("Data Flow Page Title Verification");
		child1.assignCategory("Data Flow");

		try {

			Thread.sleep(2000);
			String title = DFP.validateDataFlowPageTitle();
			System.out.println(title);
			if (title.equals("DataFlow Reports")) {

				child1.log(LogStatus.PASS,
						"Validation successful because we are getting DataFlow Page title as '" + title + "'");

			} else {

				child1.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting DataFlow Page title as '"
						+ title + "' instead of  DataFlow Reports ");

			}
		} catch (Exception e) {

			child1.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child1);

	}

	@Test(priority = 3, enabled = true, description = "Verifying Data Flow page reports search with only  Partner Name")
	public void DataFlowSearchTestWithPartnername() throws Exception {

		child2 = _extent_report.startTest("Verifying Data Flow page reports search with only  Partner Name");
		child2.assignCategory("Data Flow");

		try {

			Thread.sleep(2000);
			DFP.ResetSearchClick.click();
			Thread.sleep(2000);
			DFP.SearchButtonClick.click();
			Thread.sleep(2000);
			String pname = DFP.Getpartnername();
			System.out.println(pname);
			Thread.sleep(1000);
			DFP.ResetSearchClick.click();
			Thread.sleep(2000);
			DFP.PartnerNameData.sendKeys(pname);
			Thread.sleep(2000);
			DFP.SearchButtonClick.click();
			Thread.sleep(2000);
			String title = driver.findElement(By.xpath("(//span[@class='pcm-link'])[1]")).getText();

			System.out.println(title);

			if (title.contains("1")) {

				child2.log(LogStatus.PASS,
						"Validation Successful because results are displayed when we search with only Partner Name");

			} else {

				child2.log(LogStatus.FAIL,
						"Validation Unsuccessful because results are not displayed when we search with only Partner Name");

			}
		} catch (Exception e) {

			child2.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child2);
	}

	@Test(priority = 4, enabled = true, description = "Verifying Data Flow page reports search with only  Application Name")
	public void DataFlowSearchTestWithApplicationName() throws Exception {

		child3 = _extent_report.startTest("Verifying Data Flow page reports search with only  Application Name");
		child3.assignCategory("Data Flow");

		try {

			Thread.sleep(2000);
			DFP.ResetSearchClick.click();
			Thread.sleep(2000);
			DFP.SearchButtonClick.click();
			Thread.sleep(2000);
			String appname = DFP.Getappname();
			System.out.println(appname);
			Thread.sleep(1000);
			DFP.ResetSearchClick.click();
			Thread.sleep(2000);
			DFP.ApplicationNameData.sendKeys(appname);
			Thread.sleep(1000);

			DFP.SearchButtonClick.click();
			Thread.sleep(2000);
			String title = driver.findElement(By.xpath("(//span[@class='pcm-link'])[1]")).getText();

			if (title.contains("1")) {

				child3.log(LogStatus.PASS,
						"Validation Successful because results are displayed when we search with only Application Name");

			} else {

				child3.log(LogStatus.FAIL,
						"Validation Unsuccessful because results are not displayed when we search with only Application Name");

			}
		} catch (Exception e) {

			child3.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child3);

	}

	@Test(priority = 5, enabled = true, description = "Verifying Data Flow page reports search with only  SEQ Type")
	public void DataFlowSearchTestWithSEQType() throws Throwable {

		child4 = _extent_report.startTest("Verifying Data Flow page reports search with only  SEQ Type");
		child4.assignCategory("Data Flow");

		try {

			Thread.sleep(2000);
			DFP.ResetSearchClick.click();
			Thread.sleep(2000);
			DropDownSelection(DFP.SEQTypeDropDown, "DocHandling");
			Thread.sleep(2000);

			DFP.SearchButtonClick.click();
			Thread.sleep(2000);
			String title = driver.findElement(By.xpath("(//span[@class='pcm-link'])[1]")).getText();

			if (title.contains("1")) {

				child4.log(LogStatus.PASS,
						"Validation Successful because results are displayed when we search with only SEQ Type");

			} else {

				child4.log(LogStatus.FAIL,
						"Validation Unsuccessful because results are not displayed when we search with only SEQ Type");

			}
		} catch (Exception e) {

			child4.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child4);

	}

	@Test(priority = 6, enabled = true, description = "Verifying Data Flow page reports search with only Flow")
	public void DataFlowSearchTestWithFlow() throws Throwable {

		child5 = _extent_report.startTest("Verifying Data Flow page reports search with only Flow");
		child5.assignCategory("Data Flow");

		try {

			Thread.sleep(2000);
			DFP.ResetSearchClick.click();
			Thread.sleep(2000);
			DropDownSelection(DFP.FlowDropDown, "Inbound");
			Thread.sleep(2000);
			DFP.SearchButtonClick.click();
			Thread.sleep(2000);

			String title = driver.findElement(By.xpath("(//span[@class='pcm-link'])[1]")).getText();

			if (title.contains("1")) {

				child5.log(LogStatus.PASS,
						"Validation Successful because results are displayed when we search with only Flow");

			} else {

				child5.log(LogStatus.FAIL,
						"Validation Unsuccessful because results are not displayed when we search with only Flow");

			}
		} catch (Exception e) {

			child5.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child5);

	}

	@Test(priority = 7, enabled = true, description = "Verifying Data Flow page reports search with only Transaction")
	public void DataFlowSearchTestWithTransaction() throws Exception {

		child6 = _extent_report.startTest("Verifying Data Flow page reports search with only Transaction");
		child6.assignCategory("Data Flow");

		try {

			Thread.sleep(2000);
			DFP.ResetSearchClick.click();
			Thread.sleep(2000);
			DFP.TransactionData.sendKeys("850");
			Thread.sleep(1000);
			DFP.SearchButtonClick.click();
			Thread.sleep(2000);
			String title = driver.findElement(By.xpath("(//span[@class='pcm-link'])[1]")).getText();

			if (title.contains("1")) {

				child6.log(LogStatus.PASS,
						"Validation Successful because results are displayed when we search with only Transaction");

			} else {

				child6.log(LogStatus.FAIL,
						"Validation Unsuccessful because results are not displayed when we search with only Transaction");

			}
		} catch (Exception e) {

			child6.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child6);

	}

	@Test(priority = 8, enabled = true, description = "Verifying Data Flow page reports search with only DOC Type")
	public void DataFlowSearchTestWithDOCType() throws Exception {

		child7 = _extent_report.startTest("Verifying Data Flow page reports search with only DOC Type");
		child7.assignCategory("Data Flow");

		try {

			Thread.sleep(2000);
			DFP.ResetSearchClick.click();
			Thread.sleep(2000);
			DFP.DocTypeData.sendKeys("X12");
			Thread.sleep(1000);

			DFP.SearchButtonClick.click();
			Thread.sleep(2000);

			String title = driver.findElement(By.xpath("(//span[@class='pcm-link'])[1]")).getText();

			if (title.contains("1")) {

				child7.log(LogStatus.PASS,
						"Validation Successful because results are displayed when we search with only DOC Type");

			} else {

				child7.log(LogStatus.FAIL,
						"Validation Unsuccessful because results are not displayed when we search with only DOC Type");

			}
		} catch (Exception e) {

			child7.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child7);

	}

	@Test(priority = 9, enabled = true, description = "Verifying Data Flow page reports search with only SenderID")
	public void DataFlowSearchTestWithSenderID() throws Exception {

		child8 = _extent_report.startTest("Verifying Data Flow page reports search with only SenderID");
		child8.assignCategory("Data Flow");

		try {

			Thread.sleep(2000);
			DFP.ResetSearchClick.click();
			Thread.sleep(2000);
			DFP.SearchButtonClick.click();
			Thread.sleep(2000);
			String senderid = DFP.GetsenderId();
			System.out.println(senderid);
			Thread.sleep(1000);
			DFP.ResetSearchClick.click();
			Thread.sleep(2000);

			DFP.SenderIDData.sendKeys(senderid);

			Thread.sleep(1000);

			DFP.SearchButtonClick.click();
			Thread.sleep(2000);

			String title = driver.findElement(By.xpath("(//span[@class='pcm-link'])[1]")).getText();

			if (title.contains("1")) {

				child8.log(LogStatus.PASS,
						"Validation Successful because results are displayed when we search with only SenderId");

			} else {

				child8.log(LogStatus.FAIL,
						"Validation Unsuccessful because results are not displayed when we search with only SenderId");

			}
		} catch (Exception e) {

			child8.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child8);

	}

	@Test(priority = 10, enabled = true, description = "Verifying Data Flow page reports search with only Reciever ID")
	public void DataFlowSearchTestWithReciverID() throws Exception {

		child9 = _extent_report.startTest("Verifying Data Flow page reports search with only Reciever ID");
		child9.assignCategory("Data Flow");

		try {

			Thread.sleep(2000);
			DFP.ResetSearchClick.click();
			Thread.sleep(2000);
			DFP.SearchButtonClick.click();
			Thread.sleep(2000);
			String receiverid = DFP.GetreceiverId();
			System.out.println(receiverid);
			Thread.sleep(1000);
			DFP.ResetSearchClick.click();
			Thread.sleep(2000);
			DFP.ReceiverIDData.sendKeys(receiverid);
			Thread.sleep(1000);

			DFP.SearchButtonClick.click();
			Thread.sleep(2000);

			String title = driver.findElement(By.xpath("(//span[@class='pcm-link'])[1]")).getText();

			if (title.contains("1")) {

				child9.log(LogStatus.PASS,
						"Validation Successful because results are displayed when we search with only ReceiverId");

			} else {

				child9.log(LogStatus.FAIL,
						"Validation Unsuccessful because results are not displayed when we search with only ReceiverId");

			}
		} catch (Exception e) {

			child9.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child9);

	}

	@Test(priority = 11, enabled = true, description = "Verifying Data Flow page reports search with only Rule Name")
	public void DataFlowSearchTestWithRuleName() throws Exception {

		child10 = _extent_report.startTest("Verifying Data Flow page reports search with only Rule Name");
		child10.assignCategory("Data Flow");

		try {

			Thread.sleep(2000);
			DFP.ResetSearchClick.click();
			Thread.sleep(2000);
			DFP.RuleNameData.sendKeys("DropProcess");
			Thread.sleep(1000);

			DFP.SearchButtonClick.click();
			Thread.sleep(2000);

			String title = driver.findElement(By.xpath("(//span[@class='pcm-link'])[1]")).getText();

			if (title.contains("1")) {

				child10.log(LogStatus.PASS,
						"Validation Successful because results are displayed when we search with only RuleName");

			} else {

				child10.log(LogStatus.FAIL,
						"Validation Unsuccessful because results are not displayed when we search with only RuleName");

			}
		} catch (Exception e) {

			child10.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child10);

	}

	@Test(priority = 12, enabled = true, description = "Verifying Data Flow page reports search with only Rule Value")
	public void DataFlowSearchTestWithRuleValue() throws Exception {

		child11 = _extent_report.startTest("Verifying Data Flow page reports search with only Rule Value");
		child11.assignCategory("Data Flow");

		try {

			Thread.sleep(2000);
			DFP.ResetSearchClick.click();
			Thread.sleep(2000);
			DFP.RuleValueData.sendKeys("Mailbox");
			Thread.sleep(1000);

			DFP.SearchButtonClick.click();
			Thread.sleep(2000);
			String title = driver.findElement(By.xpath("(//span[@class='pcm-link'])[1]")).getText();

			if (title.contains("1")) {

				child11.log(LogStatus.PASS,
						"Validation Successful because results are displayed when we search with only Rule Value");

			} else {

				child11.log(LogStatus.FAIL,
						"Validation Unsuccessful because results are not displayed when we search with only Rule Value");

			}
		} catch (Exception e) {

			child11.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child11);

	}

	@Test(priority = 13, enabled = true, description = "Verifying Data Flow page reports search with only Filename")
	public void DataFlowSearchTestWithFilename() throws Exception {

		child12 = _extent_report.startTest("Verifying Data Flow page reports search with only Filename");
		child12.assignCategory("Data Flow");

		try {

			Thread.sleep(2000);
			DFP.ResetSearchClick.click();
			Thread.sleep(2000);
			DFP.SearchButtonClick.click();
			Thread.sleep(2000);
			String filename = DFP.Getfilename();
			System.out.println(filename);
			Thread.sleep(1000);
			DFP.ResetSearchClick.click();
			Thread.sleep(2000);
			DFP.FilenameData.sendKeys(filename);
			Thread.sleep(1000);

			DFP.SearchButtonClick.click();
			Thread.sleep(2000);
			String title = driver.findElement(By.xpath("(//span[@class='pcm-link'])[1]")).getText();

			if (title.contains("1")) {

				child12.log(LogStatus.PASS,
						"Validation Successful because results are displayed when we search with only File Name");

			} else {

				child12.log(LogStatus.FAIL,
						"Validation Unsuccessful because results are not displayed when we search with only File Name");

			}
		} catch (Exception e) {

			child12.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child12);

	}

	@Test(priority = 14, enabled = true, description = "Verifying Data Flow page reports search with Valid Data")
	public void DataFlowSearchTestWithValidData() throws Throwable {

		child13 = _extent_report.startTest("Verifying Data Flow page reports search with Valid Data");
		child13.assignCategory("Data Flow");

		try {

			Thread.sleep(2000);
			DFP.ResetSearchClick.click();
			Thread.sleep(2000);
			DFP.SearchButtonClick.click();
			Thread.sleep(2000);
			String pname = DFP.Getpartnername();
			System.out.println(pname);
			String appname = DFP.Getappname();
			System.out.println(appname);
			Thread.sleep(1000);
			DFP.ResetSearchClick.click();
			Thread.sleep(2000);
			DFP.PartnerNameData.sendKeys(pname);
			Thread.sleep(2000);
			DFP.ApplicationNameData.sendKeys(appname);
			Thread.sleep(2000);
			DFP.SearchButtonClick.click();
			Thread.sleep(2000);
			String title = driver.findElement(By.xpath("(//span[@class='pcm-link'])[1]")).getText();

			System.out.println(title);

			if (title.contains("1")) {

				child13.log(LogStatus.PASS,
						"Validation Successful because because we are getting Message as '" + title + "'");

			} else {

				child13.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Message as '" + title
						+ "' instead of Matches Found");

			}
		} catch (Exception e) {

			child13.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child13);

	}

	@Test(priority = 15, enabled = true, description = "Verifying Data Flow page reports with Export All Work Flows")
	public void DataFlowSearchTestWithExportAllWorkFlows() throws Throwable {

		child14 = _extent_report.startTest("Verifying Data Flow page reports with Export All Work Flows");
		child14.assignCategory("Data Flow");

		try {

			Thread.sleep(2000);
			DFP.ResetSearchClick.click();

			Thread.sleep(2000);

			DFP.SearchButtonClick.click();
			Thread.sleep(2000);

			DFP.ExportWorkflowClick.click();

			Thread.sleep(3000);

			FileUpload("C:\\RequiredFiles\\reportexport.exe");
			Thread.sleep(1000);

			String title = DFP.ActionMsg.getText();
			Thread.sleep(2000);
			DFP.OKbtn.click();
			Thread.sleep(2000);
			System.out.println(title);

			if (title.contains("File got exported successfully.")) {

				child14.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title + "';");

			} else {

				child14.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Message as '" + title
						+ "' instead of File got exported successfully.");

			}
		} catch (Exception e) {

			child14.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child14);

	}

	@Test(priority = 16, enabled = true, description = "Verifying Data Flow page reports search with Invalid Data")
	public void DataFlowSearchTestWithInvalidData() throws Throwable {

		child15 = _extent_report.startTest("Verifying Data Flow page reports search with Invalid Data");
		child15.assignCategory("Data Flow");

		try {

			Thread.sleep(2000);
			DFP.ResetSearchClick.click();
			Thread.sleep(2000);
			DFP.ValidateDataFlowResultWithInvalidData();
			Thread.sleep(1000);

			DFP.SearchButtonClick.click();
			Thread.sleep(2000);
			String title = driver.findElement(By.xpath("(//h3)[2]")).getText();

			if (title.contains("No results found !")) {

				child15.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title + "'");

			} else {

				child15.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Message as '" + title
						+ "' instead of  No results found ! ");

			}
		} catch (Exception e) {

			child15.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child15);

	}

	@Test(priority = 17, enabled = true, description = "Verifying Data Flow page reports search with AdvanceSearch")
	public void DataFlowSearchTestWithAdvanceSearch() throws Throwable {

		child16 = _extent_report.startTest("Verifying Data Flow page reports search with AdvanceSearch");
		child16.assignCategory("Data Flow");

		try {

			Thread.sleep(2000);
			DFP.ResetSearchClick.click();
			Thread.sleep(2000);
			String title = DFP.verifyingadvancesearch();
			Thread.sleep(1000);
			System.out.println(title);
			if (title.contains("Advanced Search")) {

				child16.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title + "'");

			} else {

				child16.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Message as '" + title);

			}
		} catch (Exception e) {

			child16.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child16);

	}

	@Test(priority = 18, enabled = true, description = "Verifying Data Flow page Advance Search with Rule Name")
	public void DataFlowAdvanceSearchwithRuleName() throws Throwable {

		child17 = _extent_report.startTest("Verifying Data Flow page Advance Search with Rule Name");
		child17.assignCategory("Data Flow");

		try {

			Thread.sleep(2000);
			DFP.ResetSearchClick.click();
			Thread.sleep(2000);
			DFP.verifyingadvancesearchwithrulename();
			Thread.sleep(1000);
			String title = driver.findElement(By.xpath("(//span[@class='pcm-link'])[1]")).getText();

			if (title.contains("1")) {

				child17.log(LogStatus.PASS,
						"Validation Successful because results are displayed when we search with advance search Rule Name");

			} else {

				child17.log(LogStatus.FAIL,
						"Validation unsuccessful because results are not displayed when we search with advance search Rule Name");

			}
		} catch (Exception e) {

			child17.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child17);

	}

	@Test(priority = 19, enabled = true, description = "Verifying Data Flow page Advance Search with Rule property Name and Rule property value")
	public void DataFlowAdvanceSearchwithRPname_RPvalue() throws Throwable {

		child18 = _extent_report
				.startTest("Verifying Data Flow page Advance Search with Rule property Name and Rule property value");
		child18.assignCategory("Data Flow");

		try {

			Thread.sleep(2000);
			DFP.ResetSearchClick.click();
			Thread.sleep(2000);
			DFP.verifyingadvancesearchwithrpname_rpvalue();
			Thread.sleep(1000);
			String title = driver.findElement(By.xpath("(//span[@class='pcm-link'])[1]")).getText();

			if (title.contains("1")) {

				child18.log(LogStatus.PASS,
						"Validation Successful because results are displayed when we search with advance search Rule property Name and value");

			} else {

				child18.log(LogStatus.FAIL,
						"Validation unsuccessful because results are not displayed when we search with advance search Rule property Name and value");

			}
		} catch (Exception e) {

			child18.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child18);

	}

	@Test(priority = 20, enabled = true, description = "Verifying Data Flow page Advance search with more than one rule")
	public void DataFlowAdvanceSearchwithmorethanrule() throws Throwable {

		child19 = _extent_report.startTest("Verifying Data Flow page Advance search with more than one rule");
		child19.assignCategory("Data Flow");

		try {

			Thread.sleep(2000);
			DFP.ResetSearchClick.click();
			Thread.sleep(2000);
			DFP.verifyingadvancesearchwithmorethanrule();
			Thread.sleep(1000);
			String title = driver.findElement(By.xpath("(//span[@class='pcm-link'])[1]")).getText();

			if (title.contains("1")) {

				child19.log(LogStatus.PASS,
						"Validation Successful because results are displayed when we search with advance search Rule property Name and value");

			} else {

				child19.log(LogStatus.FAIL,
						"Validation unsuccessful because results are not displayed when we search with advance search Rule property Name and value");

			}
		} catch (Exception e) {

			child19.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child19);

	}

	@Test(priority = 21, enabled = true, description = "Verifying Data Flow page Advance search with adding and deleting rule")
	public void DataFlowAdvanceSearchwithdeletingrule() throws Throwable {

		child20 = _extent_report.startTest("Verifying Data Flow page Advance search with adding and deleting rule");
		child20.assignCategory("Data Flow");

		try {

			Thread.sleep(2000);
			DFP.ResetSearchClick.click();
			Thread.sleep(2000);
			DFP.verifyingadvancesearchwithdeletingrule();
			Thread.sleep(1000);
			String title = driver.findElement(By.xpath("(//span[@class='pcm-link'])[1]")).getText();

			if (title.contains("1")) {

				child20.log(LogStatus.PASS,
						"Validation Successful because results are displayed when we search with advance search with adding and deleting rule");

			} else {

				child20.log(LogStatus.FAIL,
						"Validation unsuccessful because results are not displayed when we search with advance search with adding and deleting rule");

			}
		} catch (Exception e) {

			child20.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child20);

	}

	@Test(priority = 22, enabled = true, description = "Verifying Data Flow page reports search with ResetSearch")
	public void DataFlowSearchTestWithResetSearch() throws Throwable {

		child21 = _extent_report.startTest("Verifying Data Flow page reports search with ResetSearch");
		child21.assignCategory("Data Flow");

		try {

			Thread.sleep(2000);
			DFP.ResetSearchClick.click();
			Thread.sleep(2000);
			DFP.ValidateDataFlowResultWithValidData();
			Thread.sleep(1000);

			DFP.SearchButtonClick.click();
			Thread.sleep(2000);

			DFP.ResetSearchClick.click();
			if (DFP.PartnerNameData.getText().isEmpty() && DFP.ApplicationNameData.getText().isEmpty()
					&& DFP.DocTypeData.getText().isEmpty() && DFP.TransactionData.getText().isEmpty()
					&& DFP.SenderIDData.getText().isEmpty() && DFP.ReceiverIDData.getText().isEmpty()
					&& DFP.RuleNameData.getText().isEmpty() && DFP.SEQTypeDropDown.getText() != null
					&& DFP.FlowDropDown.getText() != null) {

				child21.log(LogStatus.PASS,
						"Validation successful because Reset Search is Resetting All the Fields in DataFlow Page");

			} else {

				child21.log(LogStatus.FAIL,
						"Validation Unsuccessful because Reset Search is not Resetting All the Fields in DataFlow Page");

			}
		} catch (Exception e) {

			child21.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child21);

	}

	@AfterTest
	public void tearDown() {

		_test_logger2.appendChild(Parent2);

		Parent2.appendChild(child1).appendChild(child2).appendChild(child3).appendChild(child4).appendChild(child5)
				.appendChild(child6).appendChild(child7).appendChild(child8).appendChild(child9).appendChild(child10)
				.appendChild(child11).appendChild(child12).appendChild(child13).appendChild(child14)
				.appendChild(child15).appendChild(child16).appendChild(child17).appendChild(child18)
				.appendChild(child19).appendChild(child20).appendChild(child21);

		_extent_report.endTest(Parent2);

		_extent_report.endTest(_test_logger2);

		_extent_report.flush();

	}

}
