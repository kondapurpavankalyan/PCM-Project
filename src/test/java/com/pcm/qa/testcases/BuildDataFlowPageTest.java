package com.pcm.qa.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pcm.qa.base.TestBase;
import com.pcm.qa.pages.BuildDataFlowPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BuildDataFlowPageTest extends TestBase {

	BuildDataFlowPage BDFP;
	BuildDataFlowPageTest BDFPT;

	public StringBuffer ActivitylogData;

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

	public BuildDataFlowPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {

		BDFP = new BuildDataFlowPage();
		BDFPT = new BuildDataFlowPageTest();
	}

	@BeforeTest
	public void setup() throws Exception {

		Extentreport();
		initialization();

	}

	@Test(priority = 1, enabled = true)
	public void ParentNodeCreation() throws Exception {

		_test_logger5 = _extent_report.startTest("Data Flows");
		Parent10 = _extent_report.startTest("Build Data Flow");

	}

	@Test(priority = 2, enabled = true, description = "Build Data Flow Page Title Verification")
	public void BuildDataFlowPageTitleTest() throws Exception {

		child1 = _extent_report.startTest("Build Data Flow Page Title Verification");
		child1.assignCategory("Build Data Flow");
		try {

			Thread.sleep(2000);
			String title = BDFP.validateBuildDataFlowPageTitle();
			System.out.println(title);

			if (title.equals("Build Data Flow")) {

				child1.log(LogStatus.PASS,
						"Validation successful because we are getting Build Data Flow Page title as '" + title + "'.");
			} else {
				child1.log(LogStatus.FAIL,
						"Validation  unsuccessful because we are getting Build Data Flow Page title as '" + title
								+ "' instead of Build Workflow.");
			}

		} catch (Exception e) {
			Thread.sleep(2000);
			child1.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child1);
	}

	@Test(priority = 3, enabled = true, description = "Verifying Build Data Flow page and Inbound File handling as MFT with add")
	public void IMFTValidDetailsVerification() throws Throwable {
		child2 = _extent_report.startTest("Verifying Build Data Flow page and Inbound File handling as MFT with add");
		child2.assignCategory("Build Data Flow");
		try {
			String title = "IMFTFile01";

			Thread.sleep(2000);
			BDFP.DFProfileSelection("1FTP07301", prop.getProperty("appname"));

			BDFP.SearchWorkFlowClick.click();
			Thread.sleep(2000);
			BDFP.SetUPWorkFlowClick.click();
			Thread.sleep(2000);
			BDFP.InboundMFTClick();
			Thread.sleep(2000);
			BDFP.InboundAddClick.click();
			Thread.sleep(2000);
			BDFP.IMFTValues(title, "IMFT01");
			BDFP.Createclick.click();
			Thread.sleep(2000);

			List<WebElement> col = driver.findElements(By.xpath("//table[@class='mat-table']//tbody//tr//td[2]"));
			int status = 0;
			for (int i = 0; i < col.size(); i++) {
				if (title.equals(col.get(i).getText())) {
					status++;
					System.out.println(col.get(i).getText());
					child2.log(LogStatus.PASS, "Validation successful, because we are getting Messge as '" + title
							+ " has added'. When we submit with Inbound MFT file Add");
					break;
				}
			}
			if (status != 0) {
				System.out.println(title);
				child2.log(LogStatus.PASS, "Validation successful, because we are getting Messge as '" + title
						+ " has added'. When we submit with Inbound MFT file Add");
			} else {
				System.out.println("not added");
				child2.log(LogStatus.FAIL, "Validation  unsuccessful because Inbound MFT file has not added.");
			}

			BDFP.SaveWorkFlowClick.click();
			Thread.sleep(2000);
			BDFP.ErrorMessageOKbtn.click();
		} catch (Exception e) {
			Thread.sleep(2000);
			child2.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child2);
	}

	@Test(priority = 4, enabled = true, description = "Verifying Build Data Flow page and Outbound File handling as MFT  with add")
	public void OMFTValidDetailsVerification() throws Throwable {
		child3 = _extent_report.startTest("Verifying Build Data Flow page and Outbound File handling as MFT  with add");
		child3.assignCategory("Build Data Flow");
		try {

			BDFP.ResetSearchClick.click();

			BDFP.DFProfileSelection("ABCDEF_1015_2", prop.getProperty("appname"));

			BDFP.SearchWorkFlowClick.click();
			BDFP.SetUPWorkFlowClick.click();
			BDFP.OutboundMFTClick();
			BDFP.OutboundAddClick.click();
			String title = "OMFTFile01";
			BDFP.OMFTValues(title, "OMFT01");
			BDFP.Createclick.click();

			List<WebElement> col = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
			int status = 0;
			for (int i = 0; i < col.size(); i++) {
				if (title.equals(col.get(i).getText())) {
					status++;
					System.out.println("added");
					child3.log(LogStatus.PASS, "Validation successful, because we are getting Messge as '" + title
							+ " has added'. When we submit with Outbound MFT with Add");
					break;
				}
			}
			if (status != 0) {
				System.out.println("added");
				child3.log(LogStatus.PASS, "Validation successful, because we are getting Messge as '" + title
						+ " has added'. When we submit with Outbound MFT with Add");
			} else {
				System.out.println("fail");
				child3.log(LogStatus.FAIL, "Validation  unsuccessful because Outbound MFT has not added.");
			}
			BDFP.SaveWorkFlowClick.click();
			Thread.sleep(2000);
			BDFP.ErrorMessageOKbtn.click();
		} catch (Exception e) {
			Thread.sleep(2000);
			child3.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child3);
	}

	@Test(priority = 5, enabled = true, description = "Verifying Build Data Flow Page Inbound DocHandling Test Verification With Add")
	public void IDocHTestVerificationWithAdd() throws Throwable {
		child4 = _extent_report
				.startTest("Verifying Build Data Flow Page Inbound DocHandling Test Verification With Add");
		child4.assignCategory("Build Data Flow");
		try {

			BDFP.ResetSearchClick.click();

			BDFP.DFProfileSelection("ABCDEF_as2_1021_1", prop.getProperty("appname"));

			BDFP.SearchWorkFlowClick.click();
			Thread.sleep(2000);
			BDFP.SetUPWorkFlowClick.click();
			Thread.sleep(2000);
			BDFP.InboundDocClick();
			Thread.sleep(2000);
			BDFP.InboundAddClick.click();
			String title = "Idoc1type";
			BDFP.IDocValues("Idoc1FN", title, "2.10", "1230", "SeId1", "ReId1");

			BDFP.Createclick.click();

			List<WebElement> col = driver.findElements(By.xpath("//table/tbody/tr/td[3]"));
			int status = 0;
			for (int i = 0; i < col.size(); i++) {
				if (title.equals(col.get(i).getText())) {
					status++;
					System.out.println("added");
					child4.log(LogStatus.PASS, "Validation successful, because we are getting Messge as '" + title
							+ " has added'. When we submit with Inbound DocHandling with Add");
					break;
				}
			}
			if (status != 0) {
				System.out.println("added");
				child4.log(LogStatus.PASS, "Validation successful, because we are getting Messge as '" + title
						+ " has added'. When we submit with Inbound DocHandling with Add");
			} else {
				System.out.println("fail");
				child4.log(LogStatus.FAIL, "Validation  unsuccessful because Inbound DocHandling has not added.");
			}
			BDFP.SaveWorkFlowClick.click();
			Thread.sleep(2000);
			BDFP.ErrorMessageOKbtn.click();
		} catch (Exception e) {
			Thread.sleep(2000);
			child4.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child4);
	}

	@Test(priority = 6, enabled = true, description = "Verifying Build Data Flow Page Outbound DocHandling Test Verification With Add")
	public void ODocHTestVerificationWithAdd() throws Throwable {

		child5 = _extent_report
				.startTest("Verifying Build Data Flow Page Outbound DocHandling Test Verification With Add");
		child5.assignCategory("Build Data Flow");
		try {

			BDFP.ResetSearchClick.click();
			BDFP.DFProfileSelection("ABCDEF_pgp_1020_1-Hub", prop.getProperty("appname"));

			BDFP.SearchWorkFlowClick.click();
			Thread.sleep(2000);
			BDFP.SetUPWorkFlowClick.click();
			Thread.sleep(2000);
			BDFP.OutboundDocHClick();
			String title = "Odoc1type";
			BDFP.OutboundAddClick.click();
			BDFP.ODocValues("Odoc1FN", title, "2.0", "1230", "SeId1", "ReId1");
			BDFP.Createclick.click();

			List<WebElement> col = driver.findElements(By.xpath("//table/tbody/tr/td[3]"));
			int status = 0;
			for (int i = 0; i < col.size(); i++) {
				if (title.equals(col.get(i).getText())) {
					status++;
					System.out.println("added");
					child5.log(LogStatus.PASS, "Validation successful, because we are getting Messge as '" + title
							+ " has added'. When we submit with Outbound DocHandling with Add");
				}
			}
			if (status != 0) {
				System.out.println("added");
				child5.log(LogStatus.PASS, "Validation successful, because we are getting Messge as '" + title
						+ " has added'. When we submit with Outbound DocHandling with Add");
			} else {
				System.out.println("fail");
				child5.log(LogStatus.FAIL, "Validation  unsuccessful because Outbound DocHandling file has not added.");
			}

			BDFP.SaveWorkFlowClick.click();
			BDFP.ErrorMessageOKbtn.click();
		} catch (Exception e) {
			Thread.sleep(2000);
			child5.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child5);
	}

	@Test(priority = 7, enabled = true, description = "Verifying Build Data Flow Page setupworkflow without adding any file")
	public void BuildDataFlowPageSetupwithoutdata() throws Throwable {

		child6 = _extent_report.startTest("Verifying Build Data Flow Page setupworkflow without adding any file");
		child6.assignCategory("Build Data Flow");
		try {

			BDFP.ResetSearchClick.click();
			BDFP.DFProfileSelection("ABCDE_pushpull657657-Hub", prop.getProperty("appname"));

			BDFP.SearchWorkFlowClick.click();

			Thread.sleep(2000);
			BDFP.SetUPWorkFlowClick.click();
			Thread.sleep(2000);
			BDFP.SaveWorkFlowClick.click();

			String title = BDFP.ActionMessage.getText();

			if (title.equals("Please create at least one Transaction.")) {

				child6.log(LogStatus.PASS, "Validation successful, because we are getting Messge as '" + title
						+ " has added'. When we save dataflow without data");
			} else {
				child6.log(LogStatus.FAIL, "Validation  unsuccessful because we are not getting Messge as '" + title
						+ " has added'. When we save dataflow without data");
			}

			BDFP.ErrorMessageOKbtn.click();
			Thread.sleep(2000);
		} catch (Exception e) {
			Thread.sleep(2000);
			child6.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child6);
	}

	@Test(priority = 8, enabled = true, description = "Verifying Build Data Flow page and Import workflow with valid file for new Profile.")
	public void ImportWorkFlowVerificationWithValidFile() throws Throwable {
		child7 = _extent_report
				.startTest("Verifying Build Data Flow page and Import workflow with valid file for new Profile.");
		child7.assignCategory("Build Data Flow");
		try {

			BDFP.ResetSearchClick.click();
			Thread.sleep(2000);
			BDFP.DFProfileSelection("ABCDE_sftp876-Hub", prop.getProperty("appname"));

			BDFP.SearchWorkFlowClick.click();
			Thread.sleep(2000);

			BDFP.ImportWorkFlowClick.click();
			Thread.sleep(2000);
			BDFP.ImportWorkFlowChooseFileClick.click();

			FileUpload("C:\\RequiredFiles\\importworkflowupload1.exe");

			Thread.sleep(4000);

			BDFP.ImportWorkFlowSubmitClick.click();

			String title = BDFP.ActionMessage.getText();

			if (title.contains("File got imported successfully")) {
				child7.log(LogStatus.PASS, "Validation successful, because we are getting Messge as '" + title
						+ "'. When we import a new workflow.");
			} else {
				child7.log(LogStatus.FAIL, "Validation  unsuccessful because we are getting message as '" + title
						+ "' instead of Imported successfully.");
			}

		} catch (Exception e) {
			Thread.sleep(2000);
			child7.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child7);
	}

	@Test(priority = 9, enabled = true, description = "Build Data Flow Page Search Result Verification with Reset Search")
	public void BuildDataFlowSearchTestWithResetSearch() throws Throwable {
		child8 = _extent_report.startTest("Build Data Flow Page Search Result Verification with Reset Search");
		child8.assignCategory("Build Data Flow");
		try {
			Thread.sleep(2000);
			BDFP.ResetSearchClick.click();
			Thread.sleep(2000);
			BDFP.DFProfileSelection("ABCDE_sftp_071021_v9", prop.getProperty("appname"));
			Thread.sleep(2000);

			BDFP.SearchWorkFlowClick.click();
			Thread.sleep(2000);

			BDFP.ResetSearchClick.click();
			Thread.sleep(2000);
			Boolean flag = BDFP.SearchWorkFlowClick.isEnabled();
			String title = flag.toString();
			if (title.equalsIgnoreCase("false")) {
				System.out.println("pass");
				child8.log(LogStatus.PASS,
						"Validation successful because Reset Search is Resetting All the Fields in Build dataflow page");
			} else {
				System.out.println("fail");
				child8.log(LogStatus.FAIL,
						"Validation Unsuccessful because Reset Search is not Resetting All the Fields in Build dataflow page");
			}
		} catch (Exception e) {
			child8.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child8);
	}

	@Test(priority = 10, enabled = true, description = "Verifying Build Data Flow Page Inbound MFT Test Verification With Rules")
	public void IMFTTestVerificationWithRules() throws Throwable {

		child9 = _extent_report.startTest("Verifying Build Data Flow Page Inbound MFT Test Verification With Rules");
		child9.assignCategory("Build Data Flow");
		try {
			Thread.sleep(2000);
			BDFP.DFProfileSelection("ABCDE_sftp_071021_v9-Hub", prop.getProperty("appname"));

			BDFP.SearchWorkFlowClick.click();

			Thread.sleep(2000);
			BDFP.SetUPWorkFlowClick.click();
			Thread.sleep(2000);
			BDFP.InboundMFTClick();
			Thread.sleep(2000);
			BDFP.InboundAddClick.click(); // rule 1
			Thread.sleep(2000);
			BDFP.IMFTValues("MFTFile02", "MFT02");

			Thread.sleep(2000);

			BDFP.Createclick.click();
			Thread.sleep(2000);
			BDFP.TableInbound("MFTFile02", 2, "Rule");
			Thread.sleep(2000);
			BDFP.InboundRulesList1Click.click();
			BDFP.InboundRulesList1Click.click();
			Thread.sleep(2000);
			BDFP.IAddRulesClick.click();
			Thread.sleep(2000);

			BDFP.BuildTestProperty1Data.sendKeys("Propertyasdfg1");
			BDFP.BuildTestProperty2Data.sendKeys("Propertyasdfg2");

			BDFP.SavePropertiesClick.click();
			Thread.sleep(2000);
			BDFP.minimizerules.click();
			Thread.sleep(2000);
			BDFP.SaveRulesClick.click();

			Thread.sleep(2000);

			BDFP.InboundAddClick.click(); // rule 2
			Thread.sleep(2000);

			BDFP.IMFTValues("MFTFile021", "MFT021");

			Thread.sleep(2000);

			BDFP.Createclick.click();
			Thread.sleep(2000);
			BDFP.TableInbound("MFTFile021", 2, "Rule");
			Thread.sleep(2000);
			BDFP.InboundRulesList1Click.click();

			Thread.sleep(2000);
			BDFP.IAddRulesClick.click();
			Thread.sleep(2000);

			BDFP.BuildTestProperty1Data.sendKeys("Propertyasdfg1");
			BDFP.BuildTestProperty2Data.sendKeys("Propertyasdfg2");

			BDFP.SavePropertiesClick.click();
			Thread.sleep(2000);
			BDFP.minimizerules.click();
			Thread.sleep(2000);
			BDFP.SaveRulesClick.click();

			Thread.sleep(2000);

			BDFP.SaveWorkFlowClick.click();

			String title = BDFP.ActionMessage.getText();
			System.out.println(title);
			if (title.equals("Work flow saved successful")) {
				child9.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title + "'");
			} else {
				child9.log(LogStatus.FAIL, "Validation  unsuccessful because we are getting Message as '" + title
						+ "' instead of 'Workflow Updated Successfully.'");
			}
		} catch (Exception e) {
			Thread.sleep(2000);
			child9.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child9);
	}

	@Test(priority = 11, enabled = true, description = "Verifying Build Data Flow page and Inbound File handling as MFT  with Edit")
	public void IMFTEditVerification() throws Throwable {
		child10 = _extent_report
				.startTest("Verifying Build Data Flow page and Inbound File handling as MFT with Edit");
		child10.assignCategory("Build Data Flow");
		try {
			Thread.sleep(2000);

			BDFP.ResetSearchClick.click();
			BDFP.DFProfileSelection("ABCDE_sftp_071021_v9-Hub", prop.getProperty("appname"));

			BDFP.SearchWorkFlowClick.click();
			Thread.sleep(2000);
			BDFP.TableInbound("MFTFile02", 2, "Edit");
			Thread.sleep(2000);
			String title = "MFTFile03";
			BDFP.IMFTValues(title, "MFT5");
			Thread.sleep(2000);
			BDFP.InboundUpdateClick.click();
			Thread.sleep(2000);

			BDFP.SaveWorkFlowClick.click();
			Thread.sleep(3000);

			BDFP.ResetSearchClick.click();
			Thread.sleep(2000);
			BDFP.DFProfileSelection("ABCDE_sftp_071021_v9-Hub", prop.getProperty("appname"));

			BDFP.SearchWorkFlowClick.click();

			List<WebElement> col = driver.findElements(By.xpath("//table//tbody/tr//td[2]"));
			int status = 0;
			for (int i = 0; i < col.size(); i++) {
				if (title.equals(col.get(i).getText())) {
					status++;
					System.out.println("Updated");
					child10.log(LogStatus.PASS, "Validation successful, because we are getting Messge as '" + title
							+ " has added'. When we submit with Inbound MFT with Edit");
					break;
				}
			}
			if (status != 0) {
				System.out.println("Updated");
				child10.log(LogStatus.PASS, "Validation successful, because we are getting Messge as '" + title
						+ " has added'. When we submit with INbound MFT with Edit");
			} else {
				System.out.println("not Updated");
				child10.log(LogStatus.FAIL, "Validation  unsuccessful because Inbound MFT has not updated.");
			}

			BDFP.SaveWorkFlowClick.click();
			Thread.sleep(2000);
		} catch (Exception e) {
			Thread.sleep(2000);
			child10.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child10);
	}

	@Test(priority = 12, enabled = true, description = "Verifying Build Data Flow page and Inbound File handling as MFT  with Delete")
	public void IMFTDeleteVerification() throws Throwable {
		child11 = _extent_report
				.startTest("Verifying Build Data Flow page and Inbound File handling as MFT  with Delete");
		child11.assignCategory("Build Data Flow");
		try {

			Thread.sleep(2000);

			BDFP.ResetSearchClick.click();
			Thread.sleep(2000);
			BDFP.DFProfileSelection("ABCDE_sftp_071021_v9-Hub", prop.getProperty("appname"));
			Thread.sleep(2000);
			BDFP.SearchWorkFlowClick.click();

			Thread.sleep(2000);
			String title = "MFTFile03";
			BDFP.TableInbound("MFTFile03", 2, "Delete");
			Thread.sleep(2000);
			BDFP.SaveWorkFlowClick.click();
			Thread.sleep(2000);

			BDFP.ResetSearchClick.click();
			Thread.sleep(2000);
			BDFP.DFProfileSelection("ABCDE_sftp_071021_v9-Hub", prop.getProperty("appname"));

			BDFP.SearchWorkFlowClick.click();

			Thread.sleep(2000);
			List<WebElement> col = driver.findElements(By.xpath("//table//tbody/tr//td[2]"));
			int status = 0;
			for (int i = 0; i < col.size(); i++) {
				if (title.equals(col.get(i).getText())) {
					status++;
					System.out.println("not deleted");
					child11.log(LogStatus.FAIL, "Validation unsuccessful, because we are getting Messge as '" + title
							+ " has not deleted'. When we submit with Inbound MFT with delete");
					break;
				}
			}
			if (status != 0) {
				System.out.println("not deleted");
				child11.log(LogStatus.FAIL, "Validation unsuccessful, because we are getting Messge as '" + title
						+ " has not deleted'. When we submit with Inbound MFT with delete");
			} else {
				System.out.println("deleted");
				child11.log(LogStatus.PASS, "Validation  successful because Inbound MFT file has deleted.");
			}

			Thread.sleep(2000);
		} catch (Exception e) {
			Thread.sleep(2000);
			child11.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child11);
	}

	@Test(priority = 13, enabled = true, description = "Verifying Build Data Flow Page Outbound MFT Test Verification With Rules")
	public void OMFTTestVerificationWithRules() throws Throwable {

		child12 = _extent_report.startTest("Verifying Build Data Flow Page Outbound MFT Test Verification With Rules");
		child12.assignCategory("Build Data Flow");
		try {
			Thread.sleep(2000);
			BDFP.ResetSearchClick.click();
			Thread.sleep(2000);
			BDFP.DFProfileSelection("ABCDE_sftp_push-Hub", prop.getProperty("appname"));

			BDFP.SearchWorkFlowClick.click();
			Thread.sleep(2000);
			BDFP.SetUPWorkFlowClick.click();
			Thread.sleep(2000);
			BDFP.OutboundMFTClick();
			Thread.sleep(2000);
			BDFP.OutboundAddClick.click(); // rule 1
			Thread.sleep(2000);
			BDFP.OMFTValues("MFTFile05", "MFT");
			Thread.sleep(2000);
			BDFP.Createclick.click();

			Thread.sleep(2000);
			BDFP.TableOutbound("MFTFile05", 2, "Rule");
			Thread.sleep(2000);
			BDFP.OutboundRulesList1Click.click();
			BDFP.OutboundRulesList1Click.click();
			Thread.sleep(2000);
			BDFP.OAddRulesClick.click();
			Thread.sleep(2000);
			BDFP.BuildTestProperty1Data.sendKeys("Propertyasdfg1");
			BDFP.BuildTestProperty2Data.sendKeys("Propertyasdfg2");

			BDFP.SavePropertiesClick.click();
			Thread.sleep(2000);
			BDFP.minimizerules.click();
			Thread.sleep(2000);
			BDFP.SaveRulesClick.click();
			Thread.sleep(2000);

			BDFP.OutboundAddClick.click(); // rule 2
			BDFP.OMFTValues("MFTFile051", "MFT");
			BDFP.Createclick.click();

			Thread.sleep(2000);
			BDFP.TableOutbound("MFTFile051", 2, "Rule");
			Thread.sleep(2000);
			BDFP.OutboundRulesList1Click.click();
			BDFP.OutboundRulesList1Click.click();
			Thread.sleep(2000);
			BDFP.OAddRulesClick.click();
			Thread.sleep(2000);
			BDFP.BuildTestProperty1Data.sendKeys("Propertyasdfg1");
			BDFP.BuildTestProperty2Data.sendKeys("Propertyasdfg2");

			BDFP.SavePropertiesClick.click();
			Thread.sleep(2000);
			BDFP.minimizerules.click();
			Thread.sleep(2000);
			BDFP.SaveRulesClick.click();
			Thread.sleep(2000);

			BDFP.SaveWorkFlowClick.click();
			String title = BDFP.ActionMessage.getText();
			if (title.equals("Work flow saved successful")) {
				child12.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title + "'");
			} else {
				child12.log(LogStatus.FAIL, "Validation  unsuccessful because we are getting Message as '" + title
						+ "' instead of 'Workflow Updated Successfully.'");
			}
		} catch (Exception e) {
			Thread.sleep(2000);
			child12.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child12);
	}

	@Test(priority = 14, enabled = true, description = "Verifying Build Data Flow page and Outbound File handling as MFT  with Edit")
	public void OMFTEditVerification() throws Throwable {
		child13 = _extent_report
				.startTest("Verifying Build Data Flow page and Outbound File handling as MFT with Edit");
		child13.assignCategory("Build Data Flow");
		try {
			Thread.sleep(2000);

			BDFP.ResetSearchClick.click();
			Thread.sleep(2000);
			BDFP.DFProfileSelection("ABCDE_sftp_push-Hub", prop.getProperty("appname"));
			BDFP.SearchWorkFlowClick.click();

			BDFP.OutboundMFTClick();
			Thread.sleep(2000);

			BDFP.TableOutbound("MFTFile05", 2, "Edit");
			String title = "MFTFile06";
			Thread.sleep(4000);
			BDFP.OMFTValues(title, "MFT06");
			Thread.sleep(3000);
			BDFP.OutboundUpdateClick.click();
			Thread.sleep(2000);
			BDFP.SaveWorkFlowClick.click();
			Thread.sleep(3000);
			BDFP.ResetSearchClick.click();
			BDFP.DFProfileSelection("ABCDE_sftp_push-Hub", prop.getProperty("appname"));
			BDFP.SearchWorkFlowClick.click();
			Thread.sleep(2000);
			BDFP.OutboundMFTClick();
			Thread.sleep(3000);
			List<WebElement> col = driver.findElements(By.xpath("//table//tbody//tr/td[2]"));
			int status = 0;
			for (int i = 0; i < col.size(); i++) {
				if (title.equals(col.get(i).getText())) {
					status++;
					System.out.println("Updated");
					child13.log(LogStatus.PASS, "Validation successful, because we are getting Messge as '" + title
							+ " has updated'. When we submit with Outbound MFT with Edit");
					break;
				}
			}
			if (status != 0) {
				System.out.println("updated");
				child13.log(LogStatus.PASS, "Validation successful, because we are getting Messge as '" + title
						+ " has updated'. When we submit with Outbound MFT with Edit");
			} else {
				System.out.println("not updated");
				child13.log(LogStatus.FAIL, "Validation  unsuccessful because Outbound MFT has not Updated.");
			}
			BDFP.SaveWorkFlowClick.click();
			Thread.sleep(2000);
		} catch (Exception e) {
			Thread.sleep(2000);
			child13.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child13);
	}

	@Test(priority = 15, enabled = true, description = "Verifying Build Data Flow page and Outbound File handling as MFT  with Delete")
	public void OMFTDeleteVerification() throws Throwable {
		child14 = _extent_report
				.startTest("Verifying Build Data Flow page and Outbound File handling as MFT  with Delete");
		child14.assignCategory("Build Data Flow");
		try {

			Thread.sleep(2000);

			BDFP.ResetSearchClick.click();
			Thread.sleep(2000);
			BDFP.DFProfileSelection("ABCDE_sftp_push-Hub", prop.getProperty("appname"));

			BDFP.SearchWorkFlowClick.click();

			BDFP.OutboundMFTClick();

			Thread.sleep(2000);
			String title = "MFTFile06";
			BDFP.TableOutbound(title, 2, "Delete");

			BDFP.SaveWorkFlowClick.click();
			Thread.sleep(2000);

			BDFP.ResetSearchClick.click();
			BDFP.DFProfileSelection("ABCDE_sftp_push-Hub", prop.getProperty("appname"));
			BDFP.SearchWorkFlowClick.click();
			Thread.sleep(2000);
			BDFP.OutboundMFTClick();
			Thread.sleep(2000);
			List<WebElement> col = driver.findElements(By.xpath("//table//tbody/tr//td[2]"));
			int status = 0;
			for (int i = 0; i < col.size(); i++) {
				if (title.equals(col.get(i).getText())) {
					status++;
					System.out.println("not deleted");
					child14.log(LogStatus.FAIL,
							"Validation unsuccessful, because file has not deleted'. When we submit with Outbound MFT with Delete");
					break;
				}
			}
			if (status != 0) {
				System.out.println("not deleted");
				child14.log(LogStatus.FAIL,
						"Validation unsuccessful, because file has not deleted'. When we submit with Outbound MFT with Delete");
			} else {
				System.out.println("deleted");
				child14.log(LogStatus.PASS, "Validation successful because Outbound MFT has deleted.");
			}

		} catch (Exception e) {
			Thread.sleep(2000);
			child14.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child14);
	}

	@Test(priority = 16, enabled = true, description = "Verifying Build Data Flow Page Inbound DocHandling Test Verification With Rules")
	public void IDocHTestVerificationWithRules() throws Throwable {

		child15 = _extent_report
				.startTest("Verifying Build Data Flow Page Inbound DocHandling Test Verification With Rules");
		child15.assignCategory("Build Data Flow");
		try {
			Thread.sleep(2000);
			BDFP.ResetSearchClick.click();
			Thread.sleep(2000);
			BDFP.DFProfileSelection("ABCDE_sftp_rej", prop.getProperty("appname"));

			BDFP.SearchWorkFlowClick.click();
			BDFP.SetUPWorkFlowClick.click();
			Thread.sleep(2000);
			BDFP.InboundDocClick();
			Thread.sleep(2000);
			BDFP.InboundAddClick.click(); // rule 1
			Thread.sleep(2000);
			BDFP.IDocValues("Idoc4FN", "Idoc4type", "2.13", "1233", "SeId4", "ReId4");
			Thread.sleep(2000);
			BDFP.Createclick.click();

			Thread.sleep(2000);
			BDFP.TableDoc("Idoc4type", 3, "Rule");
			Thread.sleep(2000);
			BDFP.InboundRulesList1Click.click();
			BDFP.InboundRulesList1Click.click();
			Thread.sleep(2000);
			BDFP.IAddRulesClick.click();
			Thread.sleep(2000);

			BDFP.BuildTestProperty1Data.sendKeys("Propertyasdfg1");
			BDFP.BuildTestProperty2Data.sendKeys("Propertyasdfg2");

			BDFP.SavePropertiesClick.click();
			Thread.sleep(2000);
			BDFP.minimizerules.click();
			Thread.sleep(2000);
			BDFP.SaveRulesClick.click();

			Thread.sleep(2000);

			BDFP.InboundAddClick.click(); // rule 2
			BDFP.IDocValues("Idoc40FN", "Idoc40type", "2.13", "12330", "SeId40", "ReId40");
			Thread.sleep(2000);
			BDFP.Createclick.click();

			Thread.sleep(2000);
			BDFP.TableDoc("Idoc40type", 3, "Rule");
			Thread.sleep(2000);
			BDFP.InboundRulesList1Click.click();
			BDFP.InboundRulesList1Click.click();
			Thread.sleep(2000);
			BDFP.IAddRulesClick.click();
			Thread.sleep(2000);

			BDFP.BuildTestProperty1Data.sendKeys("Propertyasdfg1");
			BDFP.BuildTestProperty2Data.sendKeys("Propertyasdfg2");

			BDFP.SavePropertiesClick.click();
			Thread.sleep(2000);
			BDFP.minimizerules.click();
			Thread.sleep(2000);
			BDFP.SaveRulesClick.click();

			Thread.sleep(2000);

			BDFP.SaveWorkFlowClick.click();
			String title = BDFP.ActionMessage.getText();
			if (title.equals("Work flow saved successful")) {
				child15.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title + "'");
			} else {
				child15.log(LogStatus.FAIL, "Validation  unsuccessful because we are getting Message as '" + title
						+ "' instead of 'Workflow Updated Successfully.'");
			}
		} catch (Exception e) {
			Thread.sleep(2000);
			child15.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child15);
	}

	@Test(priority = 17, enabled = true, description = "Verifying Build Data Flow Page Inbound DocHandling Test Verification With Edit")
	public void IDocHTestVerificationWithEdit() throws Throwable {

		child16 = _extent_report
				.startTest("Verifying Build Data Flow Page Inbound DocHandling Test Verification With Edit");
		child16.assignCategory("Build Data Flow");
		try {
			Thread.sleep(2000);
			BDFP.ResetSearchClick.click();
			Thread.sleep(2000);
			BDFP.DFProfileSelection("ABCDE_sftp_rej", prop.getProperty("appname"));
			Thread.sleep(2000);
			BDFP.SearchWorkFlowClick.click();
			Thread.sleep(2000);
			BDFP.InboundDocClick();
			Thread.sleep(2000);
			BDFP.TableDoc("Idoc4type", 3, "Edit");
			Thread.sleep(2000);
			String title = "Idoc05type";
			BDFP.IDocDocumentTypeData.sendKeys(Keys.chord(Keys.CONTROL, "a"), title);
			Thread.sleep(2000);
			BDFP.InboundUpdateClick.click();
			Thread.sleep(2000);
			BDFP.SaveWorkFlowClick.click();
			Thread.sleep(2000);
			BDFP.ResetSearchClick.click();
			Thread.sleep(2000);
			BDFP.DFProfileSelection("ABCDE_sftp_rej", prop.getProperty("appname"));
			Thread.sleep(2000);
			BDFP.SearchWorkFlowClick.click();
			Thread.sleep(2000);
			BDFP.InboundDocClick();
			Thread.sleep(2000);
			List<WebElement> col = driver.findElements(By.xpath("//table//tbody//tr//td[3]"));
			int status = 0;
			for (int i = 0; i < col.size(); i++) {
				if (title.equals(col.get(i).getText())) {
					status++;
					System.out.println("updated");
					child16.log(LogStatus.PASS, "Validation successful, because we are getting Messge as '" + title
							+ " has Updated'. When we submit Inbound DocHandling with Edit");
					break;
				}
			}
			if (status != 0) {
				System.out.println("Updated");
				child16.log(LogStatus.PASS, "Validation successful, because we are getting Messge as '" + title
						+ " has Updated'. When we submit with Inbound DocHandling with Edit");
			} else {
				System.out.println("not Updated");
				child16.log(LogStatus.FAIL, "Validation  unsuccessful because Inbound docHandling has not Updated.");
			}

			BDFP.SaveWorkFlowClick.click();
			Thread.sleep(2000);
		} catch (Exception e) {
			Thread.sleep(2000);
			child16.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child16);
	}

	@Test(priority = 18, enabled = true, description = "Verifying Build Data Flow Page Inbound DocHandling Test Verification With Delete")
	public void IDocHTestVerificationWithDelete() throws Throwable {

		child17 = _extent_report
				.startTest("Verifying Build Data Flow Page Inbound DocHandling Test Verification With Delete");
		child17.assignCategory("Build Data Flow");
		try {
			Thread.sleep(2000);
			BDFP.ResetSearchClick.click();
			Thread.sleep(2000);
			BDFP.DFProfileSelection("ABCDE_sftp_rej", prop.getProperty("appname"));

			BDFP.SearchWorkFlowClick.click();

			BDFP.InboundDocClick();
			String title = "Idoc05type";
			BDFP.TableDoc(title, 3, "Delete");

			Thread.sleep(2000);
			List<WebElement> col = driver.findElements(By.xpath("//table//tbody//tr//td[3]"));
			int status = 0;
			for (int i = 0; i < col.size(); i++) {
				if (title.equals(col.get(i).getText())) {
					status++;
					System.out.println("not deleted");
					child17.log(LogStatus.FAIL,
							"Validation unsuccessful, because file has not deleted'. When we submit with Inbound DocHandling with Delete");
					break;
				}
			}
			if (status != 0) {
				System.out.println("not deleted");
				child17.log(LogStatus.FAIL,
						"Validation unsuccessful, because file has not deleted'. When we submit with Inbound DocHandling with Delete");
			} else {
				System.out.println("deleted");
				child17.log(LogStatus.PASS, "Validation successful because Inbound DocHandling file has deleted.");
			}
			Thread.sleep(2000);
		} catch (Exception e) {
			Thread.sleep(2000);
			child17.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child17);
	}

	@Test(priority = 19, enabled = true, description = "Verifying Build Data Flow Page Outbound DocHandling Test Verification With Rules")
	public void ODocHTestVerificationWithRules() throws Throwable {

		child18 = _extent_report
				.startTest("Verifying Build Data Flow Page Outbound DocHandling Test Verification With Rules");
		child18.assignCategory("Build Data Flow");
		try {
			Thread.sleep(2000);
			BDFP.ResetSearchClick.click();
			Thread.sleep(2000);
			BDFP.DFProfileSelection("ABCDE_sftp_rej-Hub", prop.getProperty("appname"));
			Thread.sleep(2000);
			BDFP.SearchWorkFlowClick.click();
			Thread.sleep(2000);
			BDFP.SetUPWorkFlowClick.click();
			Thread.sleep(2000);
			BDFP.OutboundDocHClick();
			Thread.sleep(2000);
			BDFP.OutboundAddClick.click(); // rule 1
			Thread.sleep(2000);
			BDFP.ODocValues("Odoc4FN", "Odoc4type", "2.03", "1234", "SeId4", "ReId4");
			Thread.sleep(2000);
			BDFP.Createclick.click();
			Thread.sleep(3000);
			BDFP.TableDoc("Odoc4type", 3, "Rule");
			Thread.sleep(2000);
			BDFP.OutboundRulesList1Click.click();
			BDFP.OutboundRulesList1Click.click();
			Thread.sleep(2000);
			BDFP.OAddRulesClick.click();
			Thread.sleep(2000);

			BDFP.BuildTestProperty1Data.sendKeys("Propertyasdfg1");
			BDFP.BuildTestProperty2Data.sendKeys("Propertyasdfg2");

			BDFP.SavePropertiesClick.click();
			Thread.sleep(2000);
			BDFP.minimizerules.click();
			Thread.sleep(2000);
			BDFP.SaveRulesClick.click();

			Thread.sleep(2000);

			BDFP.OutboundAddClick.click(); // rule 2
			Thread.sleep(2000);
			BDFP.ODocValues("Odoc41FN", "Odoc41type", "2.03", "12341", "SeId41", "ReId41");
			Thread.sleep(2000);
			BDFP.Createclick.click();
			Thread.sleep(3000);
			BDFP.TableDoc("Odoc41type", 3, "Rule");
			Thread.sleep(2000);
			BDFP.OutboundRulesList1Click.click();
			BDFP.OutboundRulesList1Click.click();
			Thread.sleep(2000);
			BDFP.OAddRulesClick.click();
			Thread.sleep(2000);

			BDFP.BuildTestProperty1Data.sendKeys("Propertyasdfg1");
			BDFP.BuildTestProperty2Data.sendKeys("Propertyasdfg2");

			BDFP.SavePropertiesClick.click();
			Thread.sleep(2000);
			BDFP.minimizerules.click();
			Thread.sleep(2000);
			BDFP.SaveRulesClick.click();

			Thread.sleep(2000);

			BDFP.SaveWorkFlowClick.click();

			String title = BDFP.ActionMessage.getText();
			if (title.equals("Work flow saved successful")) {
				child18.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title + "'");
			} else {
				child18.log(LogStatus.FAIL, "Validation  unsuccessful because we are getting Message as '" + title
						+ "' instead of 'Workflow Updated Successfully.'");
			}
		} catch (Exception e) {
			Thread.sleep(2000);
			child18.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child18);
	}

	@Test(priority = 20, enabled = true, description = "Verifying Build Data Flow Page Outbound DocHandling Test Verification With Edit")
	public void ODocHTestVerificationWithEdit() throws Throwable {

		child19 = _extent_report
				.startTest("Verifying Build Data Flow Page Outbound DocHandling Test Verification With Edit");
		child19.assignCategory("Build Data Flow");
		try {

			Thread.sleep(2000);
			BDFP.ResetSearchClick.click();
			Thread.sleep(2000);
			BDFP.DFProfileSelection("ABCDE_sftp_rej-Hub", prop.getProperty("appname"));
			Thread.sleep(2000);
			BDFP.SearchWorkFlowClick.click();
			Thread.sleep(2000);
			BDFP.OutboundDocHClick();
			Thread.sleep(3000);

			BDFP.TableDoc("Odoc4type", 3, "Edit");
			Thread.sleep(4000);
			String title = "Odoc004type";
			BDFP.ODocDocTypeData.sendKeys(Keys.chord(Keys.CONTROL, "a"), title);
			Thread.sleep(3000);
			BDFP.OutboundUpdateClick.click();
			Thread.sleep(2000);
			BDFP.SaveWorkFlowClick.click();
			Thread.sleep(2000);
			BDFP.ResetSearchClick.click();
			Thread.sleep(2000);
			BDFP.DFProfileSelection("ABCDE_sftp_rej-Hub", prop.getProperty("appname"));
			Thread.sleep(2000);
			BDFP.SearchWorkFlowClick.click();
			Thread.sleep(2000);
			BDFP.OutboundDocHClick();
			Thread.sleep(3000);
			List<WebElement> col = driver.findElements(By.xpath("//table//tbody//tr//td[3]"));

			int status = 0;
			for (int i = 0; i < col.size(); i++) {
				if (title.equals(col.get(i).getText())) {
					status++;
					System.out.println("updated");
					child19.log(LogStatus.PASS, "Validation successful, because we are getting Messge as '" + title
							+ " has Updated'. When we submit Outbound DocHandling with Edit");
					break;
				}
			}
			if (status != 0) {
				System.out.println("Updated");
				child19.log(LogStatus.PASS, "Validation successful, because we are getting Messge as '" + title
						+ " has Updated'. When we submit with Outbound DocHandling with Edit");
			} else {
				System.out.println("not Updated");
				child19.log(LogStatus.FAIL, "Validation  unsuccessful because Outbound docHandling has not Updated.");
			}
			BDFP.SaveWorkFlowClick.click();

		} catch (Exception e) {
			Thread.sleep(2000);
			child19.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child19);
	}

	@Test(priority = 21, enabled = true, description = "Verifying Build Data Flow Page Outbound DocHandling Test Verification With Delete")
	public void ODocHTestVerificationWithDelete() throws Throwable {

		child20 = _extent_report
				.startTest("Verifying Build Data Flow Page Outbound DocHandling Test Verification With Delete");
		child20.assignCategory("Build Data Flow");
		try {
			Thread.sleep(2000);
			BDFP.ResetSearchClick.click();
			Thread.sleep(2000);
			BDFP.DFProfileSelection("ABCDE_sftp_rej-Hub", prop.getProperty("appname"));
			Thread.sleep(2000);
			BDFP.SearchWorkFlowClick.click();
			Thread.sleep(2000);
			BDFP.OutboundDocHClick();
			String title = "Odoc004type";
			BDFP.TableDoc(title, 3, "Delete");
			Thread.sleep(2000);
			BDFP.SaveWorkFlowClick.click();
			Thread.sleep(2000);
			BDFP.ResetSearchClick.click();
			BDFP.DFProfileSelection("ABCDE_sftp_rej-Hub", prop.getProperty("appname"));
			Thread.sleep(2000);
			BDFP.SearchWorkFlowClick.click();
			Thread.sleep(2000);
			BDFP.OutboundDocHClick();
			Thread.sleep(2000);
			List<WebElement> col = driver.findElements(By.xpath("//table//tbody//tr//td[3]"));
			int status = 0;
			for (int i = 0; i < col.size(); i++) {
				if (title.equals(col.get(i).getText())) {
					status++;
					System.out.println("not deleted");
					child20.log(LogStatus.FAIL,
							"Validation unsuccessful, because file has not deleted'. When we submit with Outbound DocHandling with Delete");
					break;
				}
			}
			if (status != 0) {
				System.out.println("not deleted");
				child20.log(LogStatus.FAIL,
						"Validation unsuccessful, because file has not deleted'. When we submit with Outbound DocHandling with Delete");
			} else {
				System.out.println("deleted");
				child20.log(LogStatus.PASS, "Validation successful because Outbound docHandling has deleted.");
			}

			BDFP.SaveWorkFlowClick.click();
			Thread.sleep(2000);
		} catch (Exception e) {
			Thread.sleep(2000);
			child20.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child20);
	}

	@Test(priority = 22, enabled = true, description = "Verifying Build Data Flow page and Inbound/outbound File handling as MFT  without rules")
	public void DataflowPageMFTwithoutrules() throws Throwable {
		child21 = _extent_report
				.startTest("Verifying Build Data Flow page and Inbound/outbound File handling as MFT  without rules");
		child21.assignCategory("Build Data Flow");
		try {
			String title = "MFTFile200";

			Thread.sleep(2000);
			BDFP.ResetSearchClick.click();
			Thread.sleep(2000);
			BDFP.DFProfileSelection("ABCDE_ttest_sftp0521v1-Hub", prop.getProperty("appname"));

			BDFP.SearchWorkFlowClick.click();
			Thread.sleep(2000);
			BDFP.SetUPWorkFlowClick.click();
			Thread.sleep(2000);
			BDFP.InboundMFTClick();
			Thread.sleep(2000);
			BDFP.InboundAddClick.click();
			Thread.sleep(2000);
			BDFP.IMFTValues(title, "MFT200");
			BDFP.Createclick.click();
			Thread.sleep(2000);

			BDFP.SaveWorkFlowClick.click();

			String text = BDFP.ActionMessage.getText();
			System.out.println(text);

			if (text.equals("Please select at least one Rule under Inbound - MFT for the record MFTFile200")) {

				child21.log(LogStatus.PASS, "Validation successful, because we are getting Messge as '" + title
						+ "' has added. When we submit with Inbound/outbound MFT file without any rule");
			}

			else {

				child21.log(LogStatus.FAIL, "Validation successful, because we are not getting Messge as '" + title
						+ "' has added. When we submit with Inbound MFT file without any rule");
			}
			Thread.sleep(2000);
			BDFP.ErrorMessageOKbtn.click();
			Thread.sleep(2000);

		} catch (Exception e) {
			Thread.sleep(2000);
			child21.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child21);
	}

	@Test(priority = 23, enabled = true, description = "Verifying Build Data Flow page and Inbound/outbound File handling as DocHandling  without rules")
	public void DataflowPageDocHwithoutrules() throws Throwable {
		child22 = _extent_report.startTest(
				"Verifying Build Data Flow page and Inbound/outbound File handling as DocHandling  without rules");
		child22.assignCategory("Build Data Flow");
		try {
			String title = "Odoc1type";
			String fname = "abc1";
			String version = "2.0";
			String tranname = "abc112";
			String Sid = "23dfg";
			String Rid = "abc112s";

			Thread.sleep(2000);
			BDFP.ResetSearchClick.click();
			Thread.sleep(2000);
			BDFP.DFProfileSelection("ACME_Test", prop.getProperty("appname"));
			Thread.sleep(2000);
			BDFP.SearchWorkFlowClick.click();
			Thread.sleep(2000);
			BDFP.SetUPWorkFlowClick.click();
			Thread.sleep(2000);
			BDFP.OutboundDocHClick();
			Thread.sleep(2000);
			BDFP.OutboundAddClick.click();
			Thread.sleep(2000);
			BDFP.ODocValues(fname, title, version, tranname, Sid, Rid);
			BDFP.Createclick.click();
			Thread.sleep(2000);

			BDFP.SaveWorkFlowClick.click();

			String text = BDFP.ActionMessage.getText();
			System.out.println(text);
			if (text.contains(
					"Please select at least one Rule under Outbound - DocHandling for the record Odoc1type-abc112-23dfg-abc112s")) {

				child22.log(LogStatus.PASS, "Validation successful, because we are getting Messge as '" + title
						+ " has added'. When we submit with Inbound/outbound DocHandling file without any rule");
			}

			else {

				child22.log(LogStatus.FAIL, "Validation successful, because we are not getting Messge as '" + title
						+ " has added'. When we submit with Inbound/outbound DocHandling file without any rule");
			}
			Thread.sleep(2000);
			BDFP.ErrorMessageOKbtn.click();
			Thread.sleep(2000);

		} catch (Exception e) {
			Thread.sleep(2000);
			child22.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child22);
	}

	@Test(priority = 24, enabled = true, description = "Verifying Build Data Flow Page Inbound/Outbound MFT Test Verification With Rule Add")
	public void IMFTTestVerificationWithRuleAdd() throws Throwable {
		child23 = _extent_report
				.startTest("Verifying Build Data Flow Page Inbound/Outbound MFT Test Verification With Rule Add");
		child23.assignCategory("Build Data Flow");
		try {
			Thread.sleep(2000);
			BDFP.ResetSearchClick.click();
			Thread.sleep(2000);
			BDFP.DFProfileSelection("AJPRODUCTION", prop.getProperty("appname"));
			Thread.sleep(2000);
			BDFP.SearchWorkFlowClick.click();
			Thread.sleep(2000);
			BDFP.SetUPWorkFlowClick.click();
			Thread.sleep(2000);
			BDFP.InboundMFTClick();
			Thread.sleep(2000);
			BDFP.InboundAddClick.click();
			Thread.sleep(2000);
			BDFP.IMFTValues("MFTFile3", "MFT3");
			Thread.sleep(2000);
			BDFP.Createclick.click();
			Thread.sleep(3000);

			BDFP.TableInbound("MFTFile3", 2, "Rule");
			Thread.sleep(3000);
			List<WebElement> RuleListBeforeAdd = driver.findElements(By.xpath("//div[@class='selected-list']//ul//li"));
			System.out.println(RuleListBeforeAdd.size());// RuleListBeforeAdd.size();
			Thread.sleep(2000);
			BDFP.InboundRulesList1Click.click();
			BDFP.InboundRulesList1Click.click();
			Thread.sleep(2000);
			BDFP.IAddRulesClick.click();
			Thread.sleep(2000);
			BDFP.BuildTestProperty1Data.sendKeys("Propertyasdfg1");
			BDFP.BuildTestProperty2Data.sendKeys("Propertyasdfg2");
			Thread.sleep(2000);
			BDFP.SavePropertiesClick.click();
			Thread.sleep(2000);
			BDFP.InboundRulesList2Click.click();
			BDFP.InboundRulesList2Click.click();
			Thread.sleep(2000);
			BDFP.IAddRulesClick.click();
			Thread.sleep(2000);
			BDFP.BuildTestProperty1Data.sendKeys("Propertyasdfg1");
			BDFP.BuildTestProperty2Data.sendKeys("Propertyasdfg2");
			Thread.sleep(2000);
			BDFP.SavePropertiesClick.click();
			Thread.sleep(2000);
			BDFP.minimizerules.click();

			Thread.sleep(2000);
			BDFP.SaveRulesClick.click();
			Thread.sleep(2000);
			BDFP.SaveWorkFlowClick.click();
			String result1 = BDFP.ActionMessage.getText();
			System.out.println(result1);
			Thread.sleep(2000);
			BDFP.ResetSearchClick.click();
			Thread.sleep(2000);
			BDFP.DFProfileSelection("AJPRODUCTION", prop.getProperty("appname"));
			Thread.sleep(2000);
			BDFP.SearchWorkFlowClick.click();
			Thread.sleep(2000);
			BDFP.InboundMFTClick();
			Thread.sleep(2000);
			BDFP.TableInbound("MFTFile3", 2, "Rule");
			Thread.sleep(2000);
			List<WebElement> RuleListAfterAdd = driver.findElements(By.xpath("//div[@class='selected-list']//ul//li"));
			System.out.println(RuleListAfterAdd.size());// RuleListAfterAdd.size();
			if (RuleListAfterAdd.size() > RuleListBeforeAdd.size()) {
				System.out.println("pass");
				child23.log(LogStatus.PASS,
						"Validation successful because we are getting Message as '" + result1 + "'");
			} else {
				System.out.println("fail");
				child23.log(LogStatus.FAIL, "Validation  unsuccessful because we are getting Message as '" + result1
						+ "' instead of 'Properties Added Successfully.'");
			}
			Thread.sleep(2000);
			BDFP.minimizerules.click();
			Thread.sleep(2000);
			BDFP.SaveRulesClick.click();
			Thread.sleep(2000);
			BDFP.SaveWorkFlowClick.click();
			Thread.sleep(2000);

		} catch (Exception e) {
			Thread.sleep(2000);
			child23.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child23);
	}

	@Test(priority = 25, enabled = true, description = "Verifying Build Data Flow Page Inbound/Outbound DocHandling Test Verification With Rule Add")
	public void ODocHTestVerificationWithRuleAdd() throws Throwable {

		child24 = _extent_report.startTest(
				"Verifying Build Data Flow Page Inbound/Outbound DocHandling Test Verification With Rule Add");
		child24.assignCategory("Build Data Flow");
		try {
			Thread.sleep(2000);
			BDFP.ResetSearchClick.click();
			Thread.sleep(2000);
			BDFP.DFProfileSelection("AS2986", prop.getProperty("appname"));
			Thread.sleep(2000);
			BDFP.SearchWorkFlowClick.click();
			Thread.sleep(2000);
			BDFP.SetUPWorkFlowClick.click();
			Thread.sleep(2000);
			BDFP.OutboundDocHClick();
			Thread.sleep(2000);
			BDFP.OutboundAddClick.click();
			Thread.sleep(2000);
			BDFP.ODocValues("O1doc41FN", "Odoc41type", "1.031", "09876", "SeId410", "ReId410");
			Thread.sleep(2000);
			BDFP.Createclick.click();
			Thread.sleep(2000);
			BDFP.TableDoc("Odoc41type", 3, "Rule");
			Thread.sleep(2000);
			List<WebElement> RuleListBeforeAdd = driver.findElements(By.xpath("//div[@class='selected-list']//ul//li"));
			System.out.println(RuleListBeforeAdd.size());// RuleListBeforeAdd.size();
			BDFP.OutboundRulesList1Click.click();
			BDFP.OutboundRulesList1Click.click();
			Thread.sleep(2000);
			BDFP.OAddRulesClick.click();
			Thread.sleep(2000);
			BDFP.BuildTestProperty1Data.sendKeys("Propertyasdfg1");
			BDFP.BuildTestProperty2Data.sendKeys("Propertyasdfg2");
			Thread.sleep(2000);
			BDFP.SavePropertiesClick.click();
			Thread.sleep(2000);
			BDFP.OutboundRulesList2Click.click();
			BDFP.OutboundRulesList2Click.click();
			Thread.sleep(2000);
			BDFP.OAddRulesClick.click();
			Thread.sleep(2000);
			BDFP.BuildTestProperty1Data.sendKeys("Propertyasdfg1");
			BDFP.BuildTestProperty2Data.sendKeys("Propertyasdfg2");
			Thread.sleep(2000);
			BDFP.SavePropertiesClick.click();
			Thread.sleep(2000);

			BDFP.minimizerules.click();
			Thread.sleep(2000);
			BDFP.SaveRulesClick.click();

			Thread.sleep(2000);
			BDFP.SaveWorkFlowClick.click();
			String result1 = BDFP.ActionMessage.getText();
			System.out.println(result1);
			Thread.sleep(2000);
			BDFP.ResetSearchClick.click();
			Thread.sleep(2000);
			BDFP.DFProfileSelection("AS2986", prop.getProperty("appname"));
			Thread.sleep(2000);
			BDFP.SearchWorkFlowClick.click();
			Thread.sleep(2000);
			BDFP.OutboundDocHClick();
			Thread.sleep(2000);
			BDFP.TableDoc("Odoc41type", 3, "Rule");
			Thread.sleep(2000);
			List<WebElement> RuleListAfterAdd = driver.findElements(By.xpath("//div[@class='selected-list']//ul//li"));
			System.out.println(RuleListAfterAdd.size());// RuleListAfterAdd.size();
			if (RuleListAfterAdd.size() > RuleListBeforeAdd.size()) {
				System.out.println("pass");
				child24.log(LogStatus.PASS,
						"Validation successful because we are getting Message as '" + result1 + "'");
			} else {
				System.out.println("fail");
				child24.log(LogStatus.FAIL, "Validation  unsuccessful because we are getting Message as '" + result1
						+ "' instead of 'Properties Added Successfully.'");
			}

			Thread.sleep(2000);
			BDFP.minimizerules.click();
			Thread.sleep(2000);
			BDFP.SaveRulesClick.click();
			Thread.sleep(2000);
			BDFP.SaveWorkFlowClick.click();
			Thread.sleep(2000);
		} catch (Exception e) {
			Thread.sleep(2000);
			child24.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child24);
	}

	@Test(priority = 26, enabled = true, description = "Verifying Build Data Flow Page Inbound/Outbound MFT Test Verification With EditRule")
	public void IMFTTestVerificationWithEditRule() throws Throwable {
		child25 = _extent_report
				.startTest("Verifying Build Data Flow Page Inbound/Outbound MFT Test Verification With EditRule");
		child25.assignCategory("Build Data Flow");
		try {

			BDFP.ResetSearchClick.click();
			Thread.sleep(2000);
			BDFP.DFProfileSelection("AJPRODUCTION", prop.getProperty("appname"));
			Thread.sleep(2000);
			BDFP.SearchWorkFlowClick.click();
			Thread.sleep(2000);

			String beforetext = "Propertyasdfg11";

			BDFP.TableInbound("MFTFile3", 2, "Rule");

			Thread.sleep(2000);

			BDFP.IAppliedRulesListClick.click();
			Thread.sleep(2000);
			BDFP.Editrulebtn.click();
			Thread.sleep(2000);
			BDFP.BuildTestProperty1Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), beforetext);
			Thread.sleep(2000);
			BDFP.SavePropertiesClick.click();
			Thread.sleep(2000);
			BDFP.minimizerules.click();
			Thread.sleep(2000);
			BDFP.SaveRulesClick.click();
			Thread.sleep(2000);
			BDFP.SaveWorkFlowClick.click();
			Thread.sleep(2000);
			String result1 = BDFP.ActionMessage.getText();
			System.out.println(result1);
			Thread.sleep(2000);
			BDFP.ResetSearchClick.click();
			Thread.sleep(2000);
			BDFP.DFProfileSelection("AJPRODUCTION", prop.getProperty("appname"));
			Thread.sleep(2000);
			BDFP.SearchWorkFlowClick.click();
			Thread.sleep(2000);

			BDFP.InboundMFTClick();
			Thread.sleep(2000);
			BDFP.TableInbound("MFTFile3", 2, "Rule");
			Thread.sleep(2000);
			BDFP.IAppliedRulesListClick.click();
			Thread.sleep(2000);
			BDFP.Editrulebtn.click();
			Thread.sleep(2000);
			String aftertext = BDFP.BuildTestProperty1Data.getText();
			System.out.println(aftertext);

			if (beforetext.equals(aftertext)) {
				System.out.println("pass");
				child25.log(LogStatus.PASS,
						"Validation successful because we are getting Message as '" + result1 + "'");
			} else {
				System.out.println("fail");
				child25.log(LogStatus.FAIL, "Validation  unsuccessful because we are getting Message as '" + result1
						+ "' instead of 'Work flow saved successful'");
			}
			Thread.sleep(2000);
			BDFP.SavePropertiesClick.click();
			Thread.sleep(2000);
			BDFP.minimizerules.click();
			Thread.sleep(2000);
			BDFP.SaveRulesClick.click();
			Thread.sleep(2000);
			BDFP.SaveWorkFlowClick.click();
		} catch (Exception e) {
			Thread.sleep(2000);
			child25.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child25);
	}

	@Test(priority = 27, enabled = true, description = "Verifying Build Data Flow Page Inbound/Outbound DocHandling Test Verification With EditRule")
	public void ODocHTestVerificationWithEditRule() throws Throwable {

		child26 = _extent_report.startTest(
				"Verifying Build Data Flow Page Inbound/Outbound DocHandling Test Verification With EditRule");
		child26.assignCategory("Build Data Flow");
		try {
			Thread.sleep(2000);
			BDFP.ResetSearchClick.click();
			Thread.sleep(2000);
			BDFP.DFProfileSelection("AS2986", prop.getProperty("appname"));
			Thread.sleep(2000);
			BDFP.SearchWorkFlowClick.click();
			Thread.sleep(2000);
			BDFP.OutboundDocHClick();
			Thread.sleep(2000);

			BDFP.TableDoc("Odoc41type", 3, "Rule");

			String beforetext = "Propertyasdfg11";

			Thread.sleep(2000);
			BDFP.IAppliedRulesListClick.click();
			Thread.sleep(2000);
			BDFP.Editrulebtn.click();
			Thread.sleep(2000);
			BDFP.BuildTestProperty1Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), beforetext);
			Thread.sleep(2000);
			BDFP.SavePropertiesClick.click();
			Thread.sleep(2000);
			BDFP.minimizerules.click();
			Thread.sleep(2000);
			BDFP.SaveRulesClick.click();
			Thread.sleep(2000);
			BDFP.SaveWorkFlowClick.click();
			Thread.sleep(2000);
			String result1 = BDFP.ActionMessage.getText();
			System.out.println(result1);
			Thread.sleep(2000);
			BDFP.ResetSearchClick.click();
			Thread.sleep(2000);
			BDFP.DFProfileSelection("AS2986", prop.getProperty("appname"));
			Thread.sleep(2000);
			BDFP.SearchWorkFlowClick.click();
			Thread.sleep(2000);

			BDFP.OutboundDocHClick();
			Thread.sleep(2000);
			BDFP.TableDoc("Odoc41type", 3, "Rule");
			Thread.sleep(2000);
			BDFP.IAppliedRulesListClick.click();
			Thread.sleep(2000);
			BDFP.Editrulebtn.click();
			Thread.sleep(3000);
			String aftertext = BDFP.BuildTestProperty1Data.getText();
			System.out.println(aftertext);

			if (beforetext.contains(aftertext)) {
				System.out.println("pass");
				child26.log(LogStatus.PASS,
						"Validation successful because we are getting Message as '" + result1 + "'");
			} else {
				System.out.println("fail");
				child26.log(LogStatus.FAIL, "Validation  unsuccessful because we are getting Message as '" + result1
						+ "' instead of 'Work flow saved successful'");
			}
			BDFP.SavePropertiesClick.click();
			Thread.sleep(2000);
			BDFP.minimizerules.click();
			Thread.sleep(2000);
			BDFP.SaveRulesClick.click();
			Thread.sleep(2000);
			BDFP.SaveWorkFlowClick.click();
		} catch (Exception e) {
			Thread.sleep(2000);
			child26.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child26);
	}

	@Test(priority = 28, enabled = true, description = "Verifying Build Data Flow Page Inbound/Outbound MFT Test Verification With Rule MoveDown")
	public void OMFTTestVerificationWithMoveDown() throws Throwable {

		child27 = _extent_report
				.startTest("Verifying Build Data Flow Page Inbound/Outbound MFT Test Verification With Rule MoveDown");
		child27.assignCategory("Build Data Flow");
		try {
			Thread.sleep(2000);
			BDFP.ResetSearchClick.click();
			Thread.sleep(2000);
			BDFP.DFProfileSelection("AS299", prop.getProperty("appname"));
			Thread.sleep(2000);
			BDFP.SearchWorkFlowClick.click();
			Thread.sleep(2000);
			BDFP.SetUPWorkFlowClick.click();
			Thread.sleep(2000);
			BDFP.OutboundMFTClick();
			Thread.sleep(2000);
			BDFP.OutboundAddClick.click();
			Thread.sleep(2000);
			BDFP.OMFTValues("MFTFile08", "MFT");
			Thread.sleep(2000);
			BDFP.Createclick.click();
			Thread.sleep(2000);
			BDFP.TableOutbound("MFTFile08", 2, "Rule");
			Thread.sleep(2000);

			BDFP.OutboundRulesList1Click.click();
			Thread.sleep(2000);
			BDFP.OAddRulesClick.click();
			Thread.sleep(2000);
			BDFP.BuildTestProperty1Data.sendKeys("Propertyasdfg1");
			BDFP.BuildTestProperty2Data.sendKeys("Propertyasdfg2");
			Thread.sleep(2000);
			BDFP.SavePropertiesClick.click();
			Thread.sleep(2000);

			BDFP.OutboundRulesList2Click.click();
			Thread.sleep(2000);
			BDFP.OAddRulesClick.click();
			Thread.sleep(2000);
			BDFP.BuildTestProperty1Data.sendKeys("Propertyasdfg1");
			BDFP.BuildTestProperty2Data.sendKeys("Propertyasdfg2");
			Thread.sleep(2000);
			BDFP.SavePropertiesClick.click();
			Thread.sleep(2000);

			String beforetext = driver.findElement(By.xpath("//div[@class='selected-list']//ul//li[1]")).getText();

			Thread.sleep(2000);
			BDFP.OAppliedRulesListClick.click();

			Thread.sleep(2000);
			BDFP.OMoveDownClick.click();
			Thread.sleep(2000);

			BDFP.minimizerules.click();
			Thread.sleep(2000);
			BDFP.SaveRulesClick.click();

			Thread.sleep(2000);
			BDFP.SaveWorkFlowClick.click();
			Thread.sleep(2000);
			BDFP.ResetSearchClick.click();
			BDFP.DFProfileSelection("AS299", prop.getProperty("appname"));
			Thread.sleep(2000);
			BDFP.SearchWorkFlowClick.click();
			Thread.sleep(2000);
			BDFP.OutboundMFTClick();
			BDFP.TableOutbound("MFTFile08", 2, "Rule");
			Thread.sleep(2000);
			String aftertext = driver.findElement(By.xpath("//div[@class='selected-list']//ul//li[1]")).getText();

			if (aftertext.equals(beforetext)) {
				System.out.println("fail");
				child27.log(LogStatus.FAIL, "Validation Unsuccessful because Rule has not moved down");
			} else {
				System.out.println("pass");
				child27.log(LogStatus.PASS, "Validation  successful Rule has moved down");
			}
			Thread.sleep(2000);
			BDFP.minimizerules.click();
			Thread.sleep(2000);
			BDFP.SaveRulesClick.click();
			Thread.sleep(2000);
			BDFP.SaveWorkFlowClick.click();
		} catch (Exception e) {
			Thread.sleep(2000);
			child27.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child27);
	}

	@Test(priority = 29, enabled = true, description = "Verifying Build Data Flow Page Inbound/Outbound MFT Test Verification With Rule Remove")
	public void OMFTTestVerificationWithRuleRemove() throws Throwable {

		child28 = _extent_report
				.startTest("Verifying Build Data Flow Page Inbound/Outbound MFT Test Verification With Rule Remove");
		child28.assignCategory("Build Data Flow");

		try {

			Thread.sleep(2000);
			BDFP.ResetSearchClick.click();
			Thread.sleep(2000);
			BDFP.DFProfileSelection("AWSS3Check", prop.getProperty("appname"));
			Thread.sleep(2000);
			BDFP.SearchWorkFlowClick.click();
			Thread.sleep(2000);
			BDFP.SetUPWorkFlowClick.click();
			Thread.sleep(2000);
			BDFP.InboundMFTClick();
			Thread.sleep(2000);
			BDFP.InboundAddClick.click();
			Thread.sleep(2000);
			BDFP.IMFTValues("MFTFile08", "MFT");
			Thread.sleep(2000);
			BDFP.Createclick.click();
			Thread.sleep(2000);
			BDFP.TableInbound("MFTFile08", 2, "Rule");

			Thread.sleep(2000);

			BDFP.InboundRulesList1Click.click();
			Thread.sleep(2000);
			BDFP.IAddRulesClick.click();
			Thread.sleep(2000);
			BDFP.BuildTestProperty1Data.sendKeys("Propertyasdfg1");
			BDFP.BuildTestProperty2Data.sendKeys("Propertyasdfg2");
			Thread.sleep(2000);
			BDFP.SavePropertiesClick.click();
			Thread.sleep(2000);
			BDFP.InboundRulesList2Click.click();
			Thread.sleep(2000);
			BDFP.IAddRulesClick.click();
			Thread.sleep(2000);
			BDFP.BuildTestProperty1Data.sendKeys("Propertyasdfg1");
			BDFP.BuildTestProperty2Data.sendKeys("Propertyasdfg2");
			Thread.sleep(2000);
			BDFP.SavePropertiesClick.click();

			Thread.sleep(2000);
			List<WebElement> RuleListBeforeAdd = driver.findElements(By.xpath("//div[@class='selected-list']//ul//li"));
			System.out.println(RuleListBeforeAdd.size());// RuleListBeforeAdd.size();

			Thread.sleep(2000);
			BDFP.IAppliedRulesListClick.click();
			Thread.sleep(2000);

			BDFP.IRemoveRulesClick.click();
			Thread.sleep(2000);
			BDFP.minimizerules.click();
			Thread.sleep(2000);
			BDFP.SaveRulesClick.click();
			Thread.sleep(2000);
			BDFP.SaveWorkFlowClick.click();
			Thread.sleep(2000);
			BDFP.ResetSearchClick.click();
			Thread.sleep(2000);

			BDFP.DFProfileSelection("AWSS3Check", prop.getProperty("appname"));
			BDFP.SearchWorkFlowClick.click();
			Thread.sleep(2000);
			BDFP.InboundMFTClick();

			BDFP.TableInbound("MFTFile08", 2, prop.getProperty("appname"));

			List<WebElement> RuleListAfterAdd = driver.findElements(By.xpath("//div[@class='selected-list']//ul//li"));
			System.out.println(RuleListAfterAdd.size());// RuleListAfterAdd.size();

			if (RuleListAfterAdd.size() < RuleListBeforeAdd.size()) {
				System.out.println("pass");
				child28.log(LogStatus.PASS, "Validation successful because Rule has removed");
			} else {
				System.out.println("fail");
				child28.log(LogStatus.FAIL, "Validation  unsuccessful because Rule has not removed");
			}
			Thread.sleep(2000);
			BDFP.minimizerules.click();
			Thread.sleep(2000);
			BDFP.SaveRulesClick.click();
			Thread.sleep(2000);
			BDFP.SaveWorkFlowClick.click();
		} catch (Exception e) {
			Thread.sleep(2000);
			child28.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child28);
	}

	@Test(priority = 30, enabled = true, description = "Verifying Build Data Flow Page Inbound DocHandling Test Verification With Rule Remove")
	public void IDocHTestVerificationWithRuleRemove() throws Throwable {

		child29 = _extent_report.startTest(
				"Verifying Build Data Flow Page Inbound/Outbound DocHandling Test Verification With Rule Remove");
		child29.assignCategory("Build Data Flow");
		try {
			Thread.sleep(2000);
			BDFP.ResetSearchClick.click();
			Thread.sleep(2000);
			BDFP.DFProfileSelection("AWSS3Check1", prop.getProperty("appname"));
			Thread.sleep(2000);
			BDFP.SearchWorkFlowClick.click();
			Thread.sleep(2000);
			BDFP.SetUPWorkFlowClick.click();
			Thread.sleep(2000);
			BDFP.InboundDocClick();
			Thread.sleep(2000);
			BDFP.InboundAddClick.click();
			Thread.sleep(2000);
			BDFP.IDocValues("Idoc4FN", "Idoc4type", "2.13", "1233", "SeId4", "ReId4");
			Thread.sleep(2000);
			BDFP.Createclick.click();
			Thread.sleep(2000);
			BDFP.TableDoc("Idoc4type", 3, "Rule");

			Thread.sleep(2000);

			BDFP.InboundRulesList1Click.click();
			Thread.sleep(2000);
			BDFP.IAddRulesClick.click();
			Thread.sleep(2000);
			BDFP.BuildTestProperty1Data.sendKeys("Propertyasdfg1");
			BDFP.BuildTestProperty2Data.sendKeys("Propertyasdfg2");
			Thread.sleep(2000);
			BDFP.SavePropertiesClick.click();
			Thread.sleep(2000);
			BDFP.InboundRulesList2Click.click();
			Thread.sleep(2000);
			BDFP.IAddRulesClick.click();
			Thread.sleep(2000);
			BDFP.BuildTestProperty1Data.sendKeys("Propertyasdfg1");
			BDFP.BuildTestProperty2Data.sendKeys("Propertyasdfg2");
			Thread.sleep(2000);
			BDFP.SavePropertiesClick.click();
			Thread.sleep(2000);

			List<WebElement> RuleListBeforeAdd = driver.findElements(By.xpath("//div[@class='selected-list']//ul//li"));
			System.out.println(RuleListBeforeAdd.size());// RuleListBeforeAdd.size();
			Thread.sleep(2000);

			BDFP.IAppliedRulesListClick.click();
			Thread.sleep(2000);

			BDFP.IRemoveRulesClick.click();
			Thread.sleep(2000);
			BDFP.minimizerules.click();
			Thread.sleep(2000);
			BDFP.SaveRulesClick.click();
			Thread.sleep(2000);
			BDFP.SaveWorkFlowClick.click();
			Thread.sleep(2000);
			BDFP.ResetSearchClick.click();
			Thread.sleep(2000);

			BDFP.DFProfileSelection("AWSS3Check1", prop.getProperty("appname"));
			BDFP.SearchWorkFlowClick.click();
			Thread.sleep(2000);
			BDFP.InboundDocClick();
			BDFP.TableDoc("Idoc4type", 3, "Rule");

			List<WebElement> RuleListAfterAdd = driver.findElements(By.xpath("//div[@class='selected-list']//ul//li"));
			System.out.println(RuleListAfterAdd.size());// RuleListAfterAdd.size();

			if (RuleListAfterAdd.size() < RuleListBeforeAdd.size()) {
				System.out.println("pass");
				child29.log(LogStatus.PASS, "Validation successful because Rule has removed");
			} else {
				System.out.println("fail");
				child29.log(LogStatus.FAIL, "Validation  unsuccessful because Rule has not removed");
			}
			Thread.sleep(2000);
			BDFP.minimizerules.click();
			Thread.sleep(2000);
			BDFP.SaveRulesClick.click();
			Thread.sleep(2000);
			BDFP.SaveWorkFlowClick.click();
		} catch (Exception e) {
			Thread.sleep(2000);
			child29.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child29);
	}

	@AfterTest
	public void afterTest() {

		_test_logger5.appendChild(Parent10);

		Parent10.appendChild(child1).appendChild(child2).appendChild(child3).appendChild(child4).appendChild(child5)
				.appendChild(child6).appendChild(child7).appendChild(child8).appendChild(child9).appendChild(child10)
				.appendChild(child11).appendChild(child12).appendChild(child13).appendChild(child14)
				.appendChild(child15).appendChild(child16).appendChild(child17).appendChild(child18)
				.appendChild(child19).appendChild(child20).appendChild(child21).appendChild(child22)
				.appendChild(child23).appendChild(child24).appendChild(child25).appendChild(child26)
				.appendChild(child27).appendChild(child28).appendChild(child29);

		_extent_report.endTest(Parent10);
		_extent_report.endTest(_test_logger5);
		_extent_report.flush();

	}

}
