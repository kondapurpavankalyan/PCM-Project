package com.pcm.qa.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pcm.qa.base.TestBase;

import com.pcm.qa.pages.EndpointFlowPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class EndpointFlowPageTest extends TestBase {

	EndpointFlowPage EPFP;
	EndpointFlowPageTest EPFPT;

	public StringBuffer ActivitylogData;

	public ExtentTest Parent8;
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

	public EndpointFlowPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {

		EPFP = new EndpointFlowPage();
		EPFPT = new EndpointFlowPageTest();
	}

	@BeforeTest
	public void setup() throws Exception {

		Extentreport();
		initialization();

	}

	@Test(priority = 1, enabled = true)
	public void ParentNodeCreation() throws Exception {

		_test_logger3 = _extent_report.startTest("API Endpoint");
		Parent8 = _extent_report.startTest("Endpoint Flow");

	}

	@Test(priority = 2, enabled = true, description = "Verifying Endpoint Flow page title")
	public void EndPointFlowPageTitleTest() throws Exception {

		child1 = _extent_report.startTest("Endpoint Flow Page Title Verification");
		child1.assignCategory("EndPoint Flow");
		try {

			Thread.sleep(3000);			String title = EPFP.validateEndPointFlowPageTitle();
			System.out.println(title);

			if (title.equals("Endpoint Flow")) {

				child1.log(LogStatus.PASS,
						"Validation successful because we are getting Endpoint Flow Page title as '" + title + "'.");
			} else {
				child1.log(LogStatus.FAIL,
						"Validation  unsuccessful because we are getting Endpoint Flow Page title as '" + title
								+ "' instead of Endpoint flow.");
			}

		} catch (Exception e) {
			Thread.sleep(2000);
			child1.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child1);
	}

	@Test(priority = 3, enabled = true, description = "Verifying whether the user should able to add Endpoint while setup flow")
	public void AddSetUpFlowVerification() throws Throwable {
		child2 = _extent_report.startTest("Verifying whether the user should able to add Endpoint while setup flow");
		child2.assignCategory("EndPoint Flow");
		try {
			String title = "testingtest2";

			Thread.sleep(3000);
			EPFP.EPFProfileSelection("testingsetup2");

			EPFP.SearchFlowClick.click();
			Thread.sleep(2000);
			EPFP.SetUPFlowClick.click();
			Thread.sleep(2000);
			EPFP.AddFlowClick.click();
			Thread.sleep(2000);
			EPFP.EndpointValues(title, "test2", "test2");
			Thread.sleep(3000);
			EPFP.Createclick.click();
			Thread.sleep(2000);

			List<WebElement> col = driver.findElements(By.xpath("//table[@class='mat-table']//tbody//tr//td[2]"));
			int status = 0;
			for (int i = 0; i < col.size(); i++) {
				if (title.equals(col.get(i).getText())) {
					status++;
					System.out.println(col.get(i).getText());
					child2.log(LogStatus.PASS, "Validation successful, because we are getting Messge as '" + title
							+ " has added'. When we submit");
					break;
				}
			}
			if (status != 0) {
				System.out.println(title);
				child2.log(LogStatus.PASS, "Validation successful, because we are getting Messge as '" + title
						+ " has added'. When we submit");
			} else {
				System.out.println("not added");
				child2.log(LogStatus.FAIL, "Validation  unsuccessful because Endpoint has not added.");
			}

			EPFP.SaveFlowClick.click();
			Thread.sleep(2000);
			EPFP.ErrorMessageOKbtn.click();
		} catch (Exception e) {
			Thread.sleep(2000);
			child2.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child2);
	}

	@Test(priority = 4, enabled = true, description = "Verifying Endpoint Flow Page setupflow without adding any file")
	public void EndpointFlowPageSetupwithoutdata() throws Throwable {

		child3 = _extent_report.startTest("Verifying Endpoint Flow Page setupflow without adding any file");
		child3.assignCategory("EndPoint Flow");
		try {
			Thread.sleep(3000);
			EPFP.ResetSearchClick.click();
			Thread.sleep(2000);
			EPFP.EPFProfileSelection("testingsetup3");
			Thread.sleep(3000);
			EPFP.SearchFlowClick.click();
			Thread.sleep(3000);
		
			EPFP.SetUPFlowClick.click();
			Thread.sleep(2000);
			EPFP.SaveFlowClick.click();

			String title = EPFP.ActionMessage.getText();

			if (title.equals("Please create at least one Transaction.")) {

				child3.log(LogStatus.PASS, "Validation successful, because we are getting Messge as '" + title
						+ " has added'. When we save Endpoint flow without data");
			} else {
				child3.log(LogStatus.FAIL, "Validation  unsuccessful because we are not getting Messge as '" + title
						+ " has added'. When we save Endpoint flow without data");
			}

			EPFP.ErrorMessageOKbtn.click();
			Thread.sleep(2000);
		} catch (Exception e) {
			Thread.sleep(2000);
			child3.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child3);
	}

	@Test(priority = 5, enabled = true, description = "Endpoint Flow Page Search Result Verification with Reset Search")
	public void EndpointFlowSearchTestWithResetSearch() throws Throwable {
		child4 = _extent_report.startTest("Endpoint Flow Page Search Result Verification with Reset Search");
		child4.assignCategory("EndPoint Flow");
		try {
			Thread.sleep(3000);
			EPFP.ResetSearchClick.click();
			Thread.sleep(2000);
			EPFP.EPFProfileSelection("testingsetup4");
			Thread.sleep(2000);

			EPFP.SearchFlowClick.click();
			Thread.sleep(2000);

			EPFP.ResetSearchClick.click();
			Thread.sleep(2000);
			Boolean flag = EPFP.SearchFlowClick.isEnabled();
			String title = flag.toString();
			if (title.equalsIgnoreCase("false")) {
				System.out.println("pass");
				child4.log(LogStatus.PASS,
						"Validation successful because Reset Search is Resetting All the Fields in Endpoint flow page");
			} else {
				System.out.println("fail");
				child4.log(LogStatus.FAIL,
						"Validation Unsuccessful because Reset Search is not Resetting All the Fields in Endpoint flow page");
			}
		} catch (Exception e) {
			child4.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child4);
	}

	@Test(priority = 6, enabled = true, description = "Verifying whether the user should able to add Endpoint with valid details while setup flow")
	public void AddSetUpFlowVerificationWithValidData() throws Throwable {
		child5 = _extent_report.startTest(
				"Verifying whether the user should able to add Endpoint with valid details while setup flow");
		child5.assignCategory("EndPoint Flow");
		try {
			String title = "testingtest5";

			Thread.sleep(3000);
			EPFP.EPFProfileSelection("testingsetup5");
			Thread.sleep(3000);
			EPFP.SearchFlowClick.click();
			Thread.sleep(2000);
			EPFP.SetUPFlowClick.click();
			Thread.sleep(2000);
			EPFP.AddFlowClick.click();
			Thread.sleep(2000);
			EPFP.EndpointValues(title, "test5", "test5");
			EPFP.Createclick.click();
			Thread.sleep(2000);

			List<WebElement> col = driver.findElements(By.xpath("//table[@class='mat-table']//tbody//tr//td[2]"));
			int status = 0;
			for (int i = 0; i < col.size(); i++) {
				if (title.equals(col.get(i).getText())) {
					status++;
					System.out.println(col.get(i).getText());
					child5.log(LogStatus.PASS, "Validation successful, because we are getting Messge as '" + title
							+ " has added'. When we submit");
					break;
				}
			}
			if (status != 0) {
				System.out.println(title);
				child5.log(LogStatus.PASS, "Validation successful, because we are getting Messge as '" + title
						+ " has added'. When we submit");
			} else {
				System.out.println("not added");
				child5.log(LogStatus.FAIL, "Validation  unsuccessful because Endpoint has not added.");
			}

			EPFP.SaveFlowClick.click();
			Thread.sleep(2000);
			EPFP.ErrorMessageOKbtn.click();
		} catch (Exception e) {
			Thread.sleep(2000);
			child5.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child5);
	}

	@Test(priority = 7, enabled = true, description = "Verifying whether the user should able to add Endpoint without mandatory fields while setup flow")
	public void EndpointFlowPageSetupwithoutMandatoryFields() throws Throwable {

		child6 = _extent_report.startTest(
				"Verifying whether the user should able to add Endpoint without mandatory fields while setup flow");
		child6.assignCategory("EndPoint Flow");
		try {

			Thread.sleep(3000);
			EPFP.ResetSearchClick.click();
			Thread.sleep(2000);
			EPFP.EPFProfileSelection("testingsetup6");
			Thread.sleep(3000);
			EPFP.SearchFlowClick.click();
			Thread.sleep(3000);
			Thread.sleep(2000);
			EPFP.SetUPFlowClick.click();
			Thread.sleep(2000);
			EPFP.AddFlowClick.click();
			Thread.sleep(2000);

			EPFP.FilterData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Test6");
			Thread.sleep(3000);
			EPFP.DescriptionData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Test6");
			Thread.sleep(3000);
			EPFP.Createclick.click();
			Thread.sleep(2000);

			String title = EPFP.ActionMessage.getText();

			if (title.equals("Please fill in the Mandatory fields marked with (*).")) {

				child6.log(LogStatus.PASS, "Validation successful, because we are getting Messge as '" + title
						+ "'. When we create Endpoint flow without mandatory fields");
			} else {
				child6.log(LogStatus.FAIL, "Validation  unsuccessful because we are not getting Messge as '" + title
						+ "'. When we save Endpoint flow without  mandatory fields");
			}

			EPFP.ErrorMessageOKbtn.click();
			Thread.sleep(2000);
		} catch (Exception e) {
			Thread.sleep(2000);
			child6.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child6);
	}

	@Test(priority = 8, enabled = true, description = "Verifying whether the user should able to add Endpoint with only mandatory fields while setup flow")
	public void EndpointFlowPageSetupwithMandatoryFields() throws Throwable {

		child7 = _extent_report.startTest(
				"Verifying whether the user should able to add Endpoint with only mandatory fields while setup flow");
		child7.assignCategory("EndPoint Flow");
		try {

			String title = "testingtest7";

			Thread.sleep(3000);
			EPFP.ResetSearchClick.click();
			Thread.sleep(2000);
			EPFP.EPFProfileSelection("testingsetup7");
			Thread.sleep(3000);
			EPFP.SearchFlowClick.click();
			Thread.sleep(3000);
			Thread.sleep(2000);
			EPFP.SetUPFlowClick.click();
			Thread.sleep(2000);
			EPFP.AddFlowClick.click();
			Thread.sleep(2000);

			EPFP.MethodNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), title);
			Thread.sleep(3000);
			EPFP.Createclick.click();
			Thread.sleep(2000);

			List<WebElement> col = driver.findElements(By.xpath("//table[@class='mat-table']//tbody//tr//td[2]"));
			int status = 0;
			for (int i = 0; i < col.size(); i++) {
				if (title.equals(col.get(i).getText())) {
					status++;
					System.out.println(col.get(i).getText());
					child7.log(LogStatus.PASS, "Validation successful, because we are getting Messge as '" + title
							+ " has added'. When we submit");
					break;
				}
			}
			if (status != 0) {
				System.out.println(title);
				child7.log(LogStatus.PASS, "Validation successful, because we are getting Messge as '" + title
						+ " has added'. When we submit");
			} else {
				System.out.println("not added");
				child7.log(LogStatus.FAIL, "Validation  unsuccessful because Endpoint has not added.");
			}

			EPFP.SaveFlowClick.click();
			Thread.sleep(2000);
			EPFP.ErrorMessageOKbtn.click();
		} catch (Exception e) {
			Thread.sleep(2000);
			child7.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child7);
	}

	@Test(priority = 9, enabled = true, description = "Verifying whether the user should able to setup flow by adding rules to Endpoint")
	public void EndpointVerificationByAddingRules() throws Throwable {

		child8 = _extent_report
				.startTest("Verifying whether the user should able to setup flow by adding rules to Endpoint");
		child8.assignCategory("EndPoint Flow");
		try {
			Thread.sleep(3000);
			EPFP.ResetSearchClick.click();
			Thread.sleep(2000);
			EPFP.EPFProfileSelection("testingsetup8");
			Thread.sleep(3000);
			EPFP.SearchFlowClick.click();
			Thread.sleep(3000);
			Thread.sleep(2000);
			EPFP.SetUPFlowClick.click();
			Thread.sleep(2000);

			EPFP.AddFlowClick.click(); // rule 1
			Thread.sleep(2000);
			EPFP.EndpointValues("test8", "test8", "test8");

			Thread.sleep(2000);

			EPFP.Createclick.click();
			Thread.sleep(2000);
			EPFP.Table("test8", 2, "Rule");
			Thread.sleep(2000);
			EPFP.RulesList1Click.click();
			EPFP.RulesList1Click.click();
			Thread.sleep(2000);
			EPFP.IAddRulesClick.click();
			Thread.sleep(2000);

			EPFP.BuildTestProperty1Data.sendKeys("Propertyasdfg1");
			EPFP.BuildTestProperty2Data.sendKeys("Propertyasdfg2");
			Thread.sleep(3000);
			EPFP.SavePropertiesClick.click();
			Thread.sleep(2000);
			EPFP.minimizerules.click();
			Thread.sleep(2000);
			EPFP.SaveRulesClick.click();
			Thread.sleep(2000);
//			EPFP.AddFlowClick.click(); // rule 2
//			Thread.sleep(2000);
//			EPFP.EndpointValues("test121", "test121", "test121");
//
//			Thread.sleep(2000);
//
//			EPFP.Createclick.click();
//			Thread.sleep(2000);
//			EPFP.Table("test121", 2, "Rule");
//			Thread.sleep(2000);
//			EPFP.RulesList2Click.click();
//			EPFP.RulesList2Click.click();
//
//			Thread.sleep(2000);
//			EPFP.IAddRulesClick.click();
//			Thread.sleep(2000);
//
//			EPFP.BuildTestProperty1Data.sendKeys("Propertyasdfg1");
//			EPFP.BuildTestProperty2Data.sendKeys("Propertyasdfg2");
//
//			EPFP.SavePropertiesClick.click();
//			Thread.sleep(2000);
//			EPFP.minimizerules.click();
//			Thread.sleep(2000);
//			EPFP.SaveRulesClick.click();
//
//			Thread.sleep(2000);

			EPFP.SaveFlowClick.click();

			String title = EPFP.ActionMessage.getText();
			System.out.println(title);
			if (title.equals("Workflow created successfully")) {
				child8.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title + "'");
			} else {
				child8.log(LogStatus.FAIL, "Validation  unsuccessful because we are getting Message as '" + title
						+ "' instead of 'Workflow created successfully'");
			}
		} catch (Exception e) {
			Thread.sleep(2000);
			child8.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child8);
	}

	@Test(priority = 10, enabled = true, description = "Verifying whether the user should able to edit the details of Endpoint")
	public void EndpointVerificationByEditingRules() throws Throwable {
		child9 = _extent_report.startTest("Verifying whether the user should able to edit the details of Endpoint");
		child9.assignCategory("EndPoint Flow");

		try {

			Thread.sleep(3000);
			EPFP.ResetSearchClick.click();
			Thread.sleep(2000);
			EPFP.EPFProfileSelection("testingsetup8");
			Thread.sleep(3000);
			EPFP.SearchFlowClick.click();
			Thread.sleep(2000);
			EPFP.Table("test8", 2, "Edit");
			Thread.sleep(2000);
			String title = "test08";
			EPFP.EndpointValues(title, "test08", "test08");
			Thread.sleep(2000);
			EPFP.UpdateClick.click();
			Thread.sleep(2000);

			EPFP.SaveFlowClick.click();
			Thread.sleep(3000);

			EPFP.ResetSearchClick.click();
			Thread.sleep(2000);
			EPFP.EPFProfileSelection("testingsetup8");
			Thread.sleep(3000);
			EPFP.SearchFlowClick.click();

			List<WebElement> col = driver.findElements(By.xpath("//table//tbody/tr//td[2]"));
			int status = 0;
			for (int i = 0; i < col.size(); i++) {
				if (title.equals(col.get(i).getText())) {
					status++;
					System.out.println("Updated");
					child9.log(LogStatus.PASS, "Validation successful, because we are getting Messge as '" + title
							+ " has added'. When we submit Ednpoint with Edit");
					break;
				}
			}
			if (status != 0) {
				System.out.println("Updated");
				child9.log(LogStatus.PASS, "Validation successful, because we are getting Messge as '" + title
						+ " has added'. When we submit endpoint with Edit");
			} else {
				System.out.println("not Updated");
				child9.log(LogStatus.FAIL, "Validation  unsuccessful because endpoint has not updated.");
			}

			EPFP.SaveFlowClick.click();
			Thread.sleep(2000);
		} catch (Exception e) {
			Thread.sleep(2000);
			child9.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child9);
	}

	@Test(priority = 11, enabled = true, description = "Verifying whether the user should able to Delete the details of Endpoint")
	public void EndpointVerificationByDeletingRules() throws Throwable {
		child10 = _extent_report.startTest("Verifying whether the user should able to Delete the details of Endpoint");
		child10.assignCategory("EndPoint Flow");
		try {

			Thread.sleep(3000);

			EPFP.ResetSearchClick.click();
			Thread.sleep(2000);
			EPFP.EPFProfileSelection("testingsetup8");
			Thread.sleep(2000);
			EPFP.SearchFlowClick.click();

			Thread.sleep(2000);
			String title = "test08";
			EPFP.Table("test08", 2, "Delete");
			Thread.sleep(2000);
			EPFP.SaveFlowClick.click();
			Thread.sleep(2000);

//			EPFP.ResetSearchClick.click();
//			Thread.sleep(2000);
//			EPFP.EPFProfileSelection("testingsetup8");
//
//			EPFP.SearchFlowClick.click();
//
//			Thread.sleep(2000);
			List<WebElement> col = driver.findElements(By.xpath("//table//tbody/tr//td[2]"));
			int status = 0;
			for (int i = 0; i < col.size(); i++) {
				if (title.equals(col.get(i).getText())) {
					status++;
					System.out.println("not deleted");
					child10.log(LogStatus.FAIL, "Validation unsuccessful, because we are getting Messge as '" + title
							+ " has not deleted'. When we submit ednpoint with delete");
					break;
				}
			}
			if (status != 0) {
				System.out.println("not deleted");
				child10.log(LogStatus.FAIL, "Validation unsuccessful, because we are getting Messge as '" + title
						+ " has not deleted'. When we submit endpoint with delete");
			} else {
				System.out.println("deleted");
				child10.log(LogStatus.PASS, "Validation  successful because endpoint  has deleted.");
			}

			EPFP.ErrorMessageOKbtn.click();
			Thread.sleep(2000);
		} catch (Exception e) {
			Thread.sleep(2000);
			child10.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child10);
	}

	@Test(priority = 12, enabled = true, description = "Verifying whether the user should able to save flow without adding any rules to Endpoint")
	public void EndpointVerificationWithoutRules() throws Throwable {
		child11 = _extent_report
				.startTest("Verifying whether the user should able to save flow without adding any rules to Endpoint");
		child11.assignCategory("EndPoint Flow");

		try {
			String title = "testingtest9";

			Thread.sleep(3000);
			EPFP.ResetSearchClick.click();
			Thread.sleep(2000);
			EPFP.EPFProfileSelection("testingsetup9");

			EPFP.SearchFlowClick.click();
			Thread.sleep(2000);
			EPFP.SetUPFlowClick.click();
			Thread.sleep(2000);
			EPFP.AddFlowClick.click();
			Thread.sleep(2000);
			EPFP.EndpointValues(title, "test9", "test9");
			EPFP.Createclick.click();
			Thread.sleep(2000);

			EPFP.SaveFlowClick.click();

			String text = EPFP.ActionMessage.getText();
			System.out.println(text);

			if (text.contains("Please select at least one Rule under for the record")) {

				child11.log(LogStatus.PASS, "Validation successful, because we are getting Messge as '" + title
						+ "' has added. When we submit endpoint without any rule");
			}

			else {

				child11.log(LogStatus.FAIL, "Validation successful, because we are not getting Messge as '" + title
						+ "' has added. When we submit endpoint without any rule");
			}
			Thread.sleep(2000);
			EPFP.ErrorMessageOKbtn.click();
			Thread.sleep(2000);

		} catch (Exception e) {
			Thread.sleep(2000);
			child11.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child11);
	}

	@Test(priority = 13, enabled = true, description = "Verify whether the user should able to add more then one rule to Endpoint")
	public void EndpointflowVerificationWithMorethanOneRules() throws Throwable {

		child12 = _extent_report.startTest("Verify whether the user should able to add more then one rule to Endpoint");
		child12.assignCategory("EndPoint Flow");
		try {
			Thread.sleep(3000);
			EPFP.ResetSearchClick.click();
			Thread.sleep(2000);
			EPFP.EPFProfileSelection("testingsetup12");
			Thread.sleep(3000);
			EPFP.SearchFlowClick.click();

			Thread.sleep(2000);
			EPFP.SetUPFlowClick.click();
			Thread.sleep(2000);

			EPFP.AddFlowClick.click(); // rule 1
			Thread.sleep(2000);
			EPFP.EndpointValues("test12", "test12", "test12");

			Thread.sleep(2000);

			EPFP.Createclick.click();
			Thread.sleep(2000);
			EPFP.Table("test12", 2, "Rule");
			Thread.sleep(2000);
			EPFP.RulesList1Click.click();
			EPFP.RulesList1Click.click();
			Thread.sleep(2000);
			EPFP.IAddRulesClick.click();
			Thread.sleep(2000);

			EPFP.BuildTestProperty1Data.sendKeys("Propertyasdfg1");
			EPFP.BuildTestProperty2Data.sendKeys("Propertyasdfg2");
			Thread.sleep(3000);
			EPFP.SavePropertiesClick.click();
			Thread.sleep(2000);

			EPFP.RulesList2Click.click();
			EPFP.RulesList2Click.click();

			Thread.sleep(2000);
			EPFP.IAddRulesClick.click();
			Thread.sleep(2000);

			EPFP.BuildTestProperty1Data.sendKeys("Propertyasdfg1");
			EPFP.BuildTestProperty2Data.sendKeys("Propertyasdfg2");
			Thread.sleep(3000);
			EPFP.SavePropertiesClick.click();
			Thread.sleep(2000);
			EPFP.minimizerules.click();
			Thread.sleep(2000);
			EPFP.SaveRulesClick.click();

			Thread.sleep(2000);

			EPFP.SaveFlowClick.click();

			String title = EPFP.ActionMessage.getText();
			System.out.println(title);
			if (title.equals("Workflow created successfully")) {
				child12.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title + "'");
			} else {
				child12.log(LogStatus.FAIL, "Validation  unsuccessful because we are getting Message as '" + title
						+ "' instead of 'Workflow created successfully'");
			}
		} catch (Exception e) {
			Thread.sleep(2000);
			child12.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child12);
	}

	@Test(priority = 14, enabled = true, description = "Verifying whether the user should able to edit the rule after added the rule toEndpoint")
	public void EndpointFLowVerificationWithEditRule() throws Throwable {
		child13 = _extent_report
				.startTest("Verifying whether the user should able to edit the rule after added the rule toEndpoint");
		child13.assignCategory("EndPoint Flow");
		try {
			Thread.sleep(3000);
			EPFP.ResetSearchClick.click();
			Thread.sleep(2000);
			EPFP.EPFProfileSelection("testingsetup12");
			Thread.sleep(2000);
			EPFP.SearchFlowClick.click();
			Thread.sleep(2000);

			String beforetext = "Propertyasdfg11";

			EPFP.Table("test12", 2, "Rule");

			Thread.sleep(2000);

			EPFP.IAppliedRulesListClick.click();
			EPFP.IAppliedRulesListClick.click();

			Thread.sleep(2000);
			EPFP.Editrulebtn.click();
			Thread.sleep(2000);
			EPFP.BuildTestProperty1Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), beforetext);
			Thread.sleep(2000);
			EPFP.SavePropertiesClick.click();
			Thread.sleep(2000);
			EPFP.minimizerules.click();
			Thread.sleep(2000);
			EPFP.SaveRulesClick.click();
			Thread.sleep(2000);
			EPFP.SaveFlowClick.click();
			Thread.sleep(2000);
			String result1 = EPFP.ActionMessage.getText();
			System.out.println(result1);
			Thread.sleep(2000);
			EPFP.ResetSearchClick.click();
			Thread.sleep(2000);
			EPFP.EPFProfileSelection("testingsetup12");
			Thread.sleep(2000);
			EPFP.SearchFlowClick.click();
			Thread.sleep(2000);

			EPFP.Table("test12", 2, "Rule");
			Thread.sleep(2000);
			EPFP.IAppliedRulesListClick.click();
			Thread.sleep(2000);
			EPFP.Editrulebtn.click();
			Thread.sleep(2000);
			String aftertext = EPFP.BuildTestProperty1Data.getAttribute("value");
			System.out.println(aftertext);

			if (beforetext.equals(aftertext)) {
				System.out.println("pass");
				child13.log(LogStatus.PASS,
						"Validation successful because we are getting Message as '" + result1 + "'");
			} else {
				System.out.println("fail");
				child13.log(LogStatus.FAIL, "Validation  unsuccessful because we are getting Message as '" + result1
						+ "' instead of 'Workflow created successfully'");
			}
			Thread.sleep(2000);
			EPFP.SavePropertiesClick.click();
			Thread.sleep(2000);
			EPFP.minimizerules.click();
			Thread.sleep(2000);
			EPFP.SaveRulesClick.click();
			Thread.sleep(2000);
			EPFP.SaveFlowClick.click();
		} catch (Exception e) {
			Thread.sleep(2000);
			child13.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child13);
	}

	@Test(priority = 15, enabled = true, description = "Verify whether the user should able to move the rule from down to up after added the rule to Endpoint")
	public void EndpointFlowVerificationWithMoveUp() throws Throwable {

		child14 = _extent_report.startTest(
				"Verify whether the user should able to move the rule from down to up after added the rule to Endpoint");
		child14.assignCategory("EndPoint Flow");
		try {
			Thread.sleep(3000);
			EPFP.ResetSearchClick.click();
			Thread.sleep(2000);
			EPFP.EPFProfileSelection("testingsetup12");
			Thread.sleep(2000);
			EPFP.SearchFlowClick.click();
			Thread.sleep(2000);

			EPFP.Table("test12", 2, "Rule");
			Thread.sleep(2000);

			String beforetext = driver.findElement(By.xpath("//div[@class='selected-list']//ul//li[2]")).getText();

			Thread.sleep(2000);
			EPFP.OAppliedRulesListClick1.click();

			Thread.sleep(2000);
			EPFP.OMoveUpClick.click();
			Thread.sleep(2000);

			EPFP.minimizerules.click();
			Thread.sleep(2000);
			EPFP.SaveRulesClick.click();

			Thread.sleep(2000);
			EPFP.SaveFlowClick.click();
			Thread.sleep(2000);
			EPFP.ResetSearchClick.click();
			EPFP.EPFProfileSelection("testingsetup12");
			Thread.sleep(2000);
			EPFP.SearchFlowClick.click();
			Thread.sleep(2000);
			EPFP.Table("test12", 2, "Rule");
			Thread.sleep(2000);
			String aftertext = driver.findElement(By.xpath("//div[@class='selected-list']//ul//li[1]")).getText();

			if (aftertext.equals(beforetext)) {
				System.out.println("pass");
				child14.log(LogStatus.PASS, "Validation Unsuccessful because Rule has moved up");
			} else {
				System.out.println("fail");
				child14.log(LogStatus.FAIL, "Validation  successful Rule has not moved up");
			}
			Thread.sleep(2000);
			EPFP.minimizerules.click();
			Thread.sleep(2000);
			EPFP.SaveRulesClick.click();
			Thread.sleep(2000);
			EPFP.SaveFlowClick.click();
		} catch (Exception e) {
			Thread.sleep(2000);
			child14.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child14);
	}

	@Test(priority = 16, enabled = true, description = "Verify whether the user should able to move the rule from Up to down after added the rule to Endpoint")
	public void EndpointFlowVerificationWithMoveDown() throws Throwable {

		child15 = _extent_report.startTest(
				"Verify whether the user should able to move the rule from Up to down after added the rule to Endpoint");
		child15.assignCategory("EndPoint Flow");
		try {
			Thread.sleep(3000);
			EPFP.ResetSearchClick.click();
			Thread.sleep(2000);
			EPFP.EPFProfileSelection("testingsetup12");
			Thread.sleep(2000);
			EPFP.SearchFlowClick.click();
			Thread.sleep(2000);

			EPFP.Table("test12", 2, "Rule");
			Thread.sleep(2000);

			String beforetext = driver.findElement(By.xpath("//div[@class='selected-list']//ul//li[1]")).getText();

			Thread.sleep(2000);
			EPFP.OAppliedRulesListClick1.click();

			Thread.sleep(2000);
			EPFP.OMoveDownClick.click();
			Thread.sleep(2000);

			EPFP.minimizerules.click();
			Thread.sleep(2000);
			EPFP.SaveRulesClick.click();

			Thread.sleep(2000);
			EPFP.SaveFlowClick.click();
			Thread.sleep(2000);
			EPFP.ResetSearchClick.click();
			EPFP.EPFProfileSelection("testingsetup12");
			Thread.sleep(2000);
			EPFP.SearchFlowClick.click();
			Thread.sleep(2000);
			EPFP.Table("test12", 2, "Rule");
			Thread.sleep(2000);
			String aftertext = driver.findElement(By.xpath("//div[@class='selected-list']//ul//li[2]")).getText();

			if (aftertext.equals(beforetext)) {
				System.out.println("pass");
				child15.log(LogStatus.PASS, "Validation Unsuccessful because Rule has moved Down");
			} else {
				System.out.println("fail");
				child15.log(LogStatus.FAIL, "Validation  successful Rule has not moved Down");
			}
			Thread.sleep(2000);
			EPFP.minimizerules.click();
			Thread.sleep(2000);
			EPFP.SaveRulesClick.click();
			Thread.sleep(2000);
			EPFP.SaveFlowClick.click();
		} catch (Exception e) {
			Thread.sleep(2000);
			child15.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child15);
	}

	@Test(priority = 17, enabled = true, description = "Verify whether the user should able to remove the rule which is added to Endpoint")
	public void EndpointFlowVerificationWithRuleRemove() throws Throwable {

		child16 = _extent_report
				.startTest("Verify whether the user should able to remove the rule which is added to Endpoint");
		child16.assignCategory("EndPoint Flow");

		try {

			Thread.sleep(3000);
			EPFP.ResetSearchClick.click();
			Thread.sleep(2000);
			EPFP.EPFProfileSelection("testingsetup12");
			Thread.sleep(2000);
			EPFP.SearchFlowClick.click();
			Thread.sleep(2000);
			EPFP.Table("test12", 2, "Rule");

			Thread.sleep(2000);
			List<WebElement> RuleListBeforeAdd = driver.findElements(By.xpath("//div[@class='selected-list']//ul//li"));
			System.out.println(RuleListBeforeAdd.size());// RuleListBeforeAdd.size();

			Thread.sleep(2000);
			EPFP.IAppliedRulesListClick.click();
			Thread.sleep(2000);

			EPFP.IRemoveRulesClick.click();
			Thread.sleep(2000);
			EPFP.minimizerules.click();
			Thread.sleep(2000);
			EPFP.SaveRulesClick.click();
			Thread.sleep(2000);
			EPFP.SaveFlowClick.click();
			Thread.sleep(3000);
			EPFP.ResetSearchClick.click();
			Thread.sleep(2000);

			EPFP.EPFProfileSelection("testingsetup12");
			Thread.sleep(2000);
			EPFP.SearchFlowClick.click();
			Thread.sleep(2000);

			EPFP.Table("test12", 2, "Rule");

			List<WebElement> RuleListAfterAdd = driver.findElements(By.xpath("//div[@class='selected-list']//ul//li"));
			System.out.println(RuleListAfterAdd.size());// RuleListAfterAdd.size();

			if (RuleListAfterAdd.size() < RuleListBeforeAdd.size()) {
				System.out.println("pass");
				child16.log(LogStatus.PASS, "Validation successful because Rule has removed");
			} else {
				System.out.println("fail");
				child16.log(LogStatus.FAIL, "Validation  unsuccessful because Rule has not removed");
			}
			Thread.sleep(2000);
			EPFP.minimizerules.click();
			Thread.sleep(2000);
			EPFP.SaveRulesClick.click();
			Thread.sleep(2000);
			EPFP.SaveFlowClick.click();
		} catch (Exception e) {
			Thread.sleep(2000);
			child16.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child16);
	}

	@Test(priority = 18, enabled = true, description = "Verifying whether the user should able to add Endpoint for Existed flow")
	public void EndpointFlowVerificationWithExistedFlow() throws Throwable {

		child17 = _extent_report.startTest("Verifying whether the user should able to add Endpoint for Existed flow");
		child17.assignCategory("EndPoint Flow");

		try {

			Thread.sleep(3000);
			EPFP.ResetSearchClick.click();
			Thread.sleep(2000);
			String title = "testingtest16";
			Thread.sleep(2000);
			EPFP.EPFProfileSelection("testingsetup12");
			EPFP.SearchFlowClick.click();
			Thread.sleep(2000);
			EPFP.AddFlowClick.click();
			Thread.sleep(2000);
			EPFP.EndpointValues(title, "test16", "test16");
			EPFP.Createclick.click();
			Thread.sleep(2000);

			List<WebElement> col = driver.findElements(By.xpath("//table[@class='mat-table']//tbody//tr//td[2]"));
			int status = 0;
			for (int i = 0; i < col.size(); i++) {
				if (title.equals(col.get(i).getText())) {
					status++;
					System.out.println(col.get(i).getText());
					child17.log(LogStatus.PASS, "Validation successful, because we are getting Messge as '" + title
							+ " has added'. When we submit");
					break;
				}
			}
			if (status != 0) {
				System.out.println(title);
				child17.log(LogStatus.PASS, "Validation successful, because we are getting Messge as '" + title
						+ " has added'. When we submit");
			} else {
				System.out.println("not added");
				child17.log(LogStatus.FAIL, "Validation  unsuccessful because Endpoint has not added.");
			}

			EPFP.SaveFlowClick.click();
			Thread.sleep(2000);
			EPFP.ErrorMessageOKbtn.click();
		} catch (Exception e) {
			Thread.sleep(2000);
			child17.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child17);
	}

	@Test(priority = 19, enabled = true, description = "Verifying whether the user should able to save flow by adding rules to Endpoint for Existed flow")
	public void EndpointVerificationByAddingRulestoexistedflow() throws Throwable {

		child18 = _extent_report.startTest(
				"Verifying whether the user should able to save flow by adding rules to Endpoint for Existed flow");
		child18.assignCategory("EndPoint Flow");
		try {
			Thread.sleep(3000);
			EPFP.ResetSearchClick.click();
			Thread.sleep(2000);
			EPFP.EPFProfileSelection("testingsetup12");

			EPFP.SearchFlowClick.click();

			Thread.sleep(2000);

			EPFP.Table("test12", 2, "Rule");
			Thread.sleep(2000);
			EPFP.RulesList3Click.click();
			EPFP.RulesList3Click.click();
			Thread.sleep(2000);
			EPFP.IAddRulesClick.click();
			Thread.sleep(2000);

			EPFP.SavePropertiesClick.click();
			Thread.sleep(2000);
			EPFP.minimizerules.click();
			Thread.sleep(2000);
			EPFP.SaveRulesClick.click();

			Thread.sleep(2000);

			EPFP.SaveFlowClick.click();

			String title = EPFP.ActionMessage.getText();
			System.out.println(title);
			if (title.equals("Workflow created successfully")) {
				child18.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title + "'");
			} else {
				child18.log(LogStatus.FAIL, "Validation  unsuccessful because we are getting Message as '" + title
						+ "' instead of 'Workflow created successfully'");
			}
		} catch (Exception e) {
			Thread.sleep(2000);
			child18.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child18);
	}

	@Test(priority = 20, enabled = true, description = "Verify whether the user should able to edit properties values of existed rules of Endpoint for existed flow")
	public void EndpointFLowVerificationWithExistedEditRule() throws Throwable {
		child19 = _extent_report.startTest(
				"Verify whether the user should able to edit properties values of existed rules of Endpoint for existed flow");
		child19.assignCategory("EndPoint Flow");
		try {
			Thread.sleep(3000);
			EPFP.ResetSearchClick.click();
			Thread.sleep(2000);
			EPFP.EPFProfileSelection("testingsetup12");
			Thread.sleep(2000);
			EPFP.SearchFlowClick.click();
			Thread.sleep(2000);

			String beforetext = "Propertyasdfg111";

			EPFP.Table("test12", 2, "Rule");

			Thread.sleep(2000);

			EPFP.IAppliedRulesListClick2.click();
			Thread.sleep(2000);
			EPFP.Editrulebtn.click();
			Thread.sleep(2000);
			EPFP.BuildTestProperty1Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), beforetext);
			Thread.sleep(2000);
			EPFP.SavePropertiesClick.click();
			Thread.sleep(2000);
			EPFP.minimizerules.click();
			Thread.sleep(2000);
			EPFP.SaveRulesClick.click();
			Thread.sleep(2000);
			EPFP.SaveFlowClick.click();
			Thread.sleep(2000);
			String result1 = EPFP.ActionMessage.getText();
			System.out.println(result1);
			Thread.sleep(2000);
			EPFP.ResetSearchClick.click();
			Thread.sleep(2000);
			EPFP.EPFProfileSelection("testingsetup12");
			Thread.sleep(2000);
			EPFP.SearchFlowClick.click();
			Thread.sleep(2000);

			EPFP.Table("test12", 2, "Rule");
			Thread.sleep(2000);
			EPFP.IAppliedRulesListClick2.click();
			Thread.sleep(2000);
			EPFP.Editrulebtn.click();
			Thread.sleep(2000);
			String aftertext = EPFP.BuildTestProperty1Data.getAttribute("value");
			System.out.println(aftertext);

			if (beforetext.equals(aftertext)) {
				System.out.println("pass");
				child19.log(LogStatus.PASS,
						"Validation successful because we are getting Message as '" + result1 + "'");
			} else {
				System.out.println("fail");
				child19.log(LogStatus.FAIL, "Validation  unsuccessful because we are getting Message as '" + result1
						+ "' instead of 'Work flow saved successful'");
			}
			Thread.sleep(2000);
			EPFP.SavePropertiesClick.click();
			Thread.sleep(2000);
			EPFP.minimizerules.click();
			Thread.sleep(2000);
			EPFP.SaveRulesClick.click();
			Thread.sleep(2000);
			EPFP.SaveFlowClick.click();
		} catch (Exception e) {
			Thread.sleep(2000);
			child19.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child19);
	}

	@Test(priority = 21, enabled = true, description = "Verify whether the user should able to remove the existed rule of Endpoint for existed flow")
	public void EndpointFlowVerificationWithRuleRemoveforExisted() throws Throwable {

		child20 = _extent_report.startTest(
				"Verify whether the user should able to remove the existed rule of Endpoint for existed flow");
		child20.assignCategory("EndPoint Flow");

		try {

			Thread.sleep(3000);
			EPFP.ResetSearchClick.click();
			Thread.sleep(2000);
			EPFP.EPFProfileSelection("testingsetup12");
			Thread.sleep(2000);
			EPFP.SearchFlowClick.click();
			Thread.sleep(2000);
			EPFP.Table("test12", 2, "Rule");

			Thread.sleep(2000);
			List<WebElement> RuleListBeforeAdd = driver.findElements(By.xpath("//div[@class='selected-list']//ul//li"));
			System.out.println(RuleListBeforeAdd.size());// RuleListBeforeAdd.size();

			Thread.sleep(2000);
			EPFP.IAppliedRulesListClick1.click();
			Thread.sleep(2000);

			EPFP.IRemoveRulesClick.click();
			Thread.sleep(2000);
			EPFP.minimizerules.click();
			Thread.sleep(2000);
			EPFP.SaveRulesClick.click();
			Thread.sleep(2000);
			EPFP.SaveFlowClick.click();
			Thread.sleep(3000);
			EPFP.ResetSearchClick.click();
			Thread.sleep(2000);

			EPFP.EPFProfileSelection("testingsetup12");
			Thread.sleep(2000);
			EPFP.SearchFlowClick.click();
			Thread.sleep(2000);

			EPFP.Table("test12", 2, "Rule");

			List<WebElement> RuleListAfterAdd = driver.findElements(By.xpath("//div[@class='selected-list']//ul//li"));
			System.out.println(RuleListAfterAdd.size());// RuleListAfterAdd.size();

			if (RuleListAfterAdd.size() < RuleListBeforeAdd.size()) {
				System.out.println("pass");
				child20.log(LogStatus.PASS, "Validation successful because Rule has removed");
			} else {
				System.out.println("fail");
				child20.log(LogStatus.FAIL, "Validation  unsuccessful because Rule has not removed");
			}
			Thread.sleep(2000);
			EPFP.minimizerules.click();
			Thread.sleep(2000);
			EPFP.SaveRulesClick.click();
			Thread.sleep(2000);
			EPFP.SaveFlowClick.click();
		} catch (Exception e) {
			Thread.sleep(2000);
			child20.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child20);
	}

	@Test(priority = 22, enabled = true, description = "Verifying whether the user should able to edit the endpoint details for existed workflow.")
	public void EndpointVerificationByEditingForExisted() throws Throwable {
		child21 = _extent_report
				.startTest("Verifying whether the user should able to edit the endpoint details for existed workflow.");
		child21.assignCategory("EndPoint Flow");

		try {

			Thread.sleep(3000);
			EPFP.ResetSearchClick.click();
			Thread.sleep(2000);
			EPFP.EPFProfileSelection("testingsetup12");
			Thread.sleep(3000);
			EPFP.SearchFlowClick.click();
			Thread.sleep(2000);
			EPFP.Table("test12", 2, "Edit");
			Thread.sleep(2000);
			String title = "test12";
			EPFP.EndpointValues(title, "test122", "test122");
			Thread.sleep(2000);
			EPFP.UpdateClick.click();
			Thread.sleep(2000);

			EPFP.SaveFlowClick.click();
			Thread.sleep(3000);

			EPFP.ResetSearchClick.click();
			Thread.sleep(2000);
			EPFP.EPFProfileSelection("testingsetup12");
			EPFP.SearchFlowClick.click();

			List<WebElement> col = driver.findElements(By.xpath("//table//tbody/tr//td[2]"));
			int status = 0;
			for (int i = 0; i < col.size(); i++) {
				if (title.equals(col.get(i).getText())) {
					status++;
					System.out.println("Updated");
					child21.log(LogStatus.PASS, "Validation successful, because we are getting Messge as '" + title
							+ " has added'. When we submit Ednpoint with Edit");
					break;
				}
			}
			if (status != 0) {
				System.out.println("Updated");
				child21.log(LogStatus.PASS, "Validation successful, because we are getting Messge as '" + title
						+ " has added'. When we submit endpoint with Edit");
			} else {
				System.out.println("not Updated");
				child21.log(LogStatus.FAIL, "Validation  unsuccessful because endpoint has not updated.");
			}

			EPFP.SaveFlowClick.click();
			Thread.sleep(2000);
		} catch (Exception e) {
			Thread.sleep(2000);
			child21.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child21);
	}

	@Test(priority = 23, enabled = true, description = "Verifying whether the user should able to delete Endpoint for existed flow")
	public void EndpointVerificationByDeletingRulesForExistedFlow() throws Throwable {
		child22 = _extent_report
				.startTest("Verifying whether the user should able to delete Endpoint for existed flow");
		child22.assignCategory("EndPoint Flow");
		try {

			Thread.sleep(3000);

			EPFP.ResetSearchClick.click();
			Thread.sleep(2000);
			EPFP.EPFProfileSelection("testingsetup12");
			Thread.sleep(2000);
			EPFP.SearchFlowClick.click();

			Thread.sleep(2000);
			String title = "test12";
			EPFP.Table("test12", 2, "Delete");
			Thread.sleep(2000);
			EPFP.SaveFlowClick.click();
			Thread.sleep(2000);

//			EPFP.ResetSearchClick.click();
//			Thread.sleep(2000);
//			EPFP.EPFProfileSelection("testingsetup8");
//
//			EPFP.SearchFlowClick.click();
//
//			Thread.sleep(2000);
			List<WebElement> col = driver.findElements(By.xpath("//table//tbody/tr//td[2]"));
			int status = 0;
			for (int i = 0; i < col.size(); i++) {
				if (title.equals(col.get(i).getText())) {
					status++;
					System.out.println("not deleted");
					child22.log(LogStatus.FAIL, "Validation unsuccessful, because we are getting Messge as '" + title
							+ " has not deleted'. When we submit ednpoint with delete");
					break;
				}
			}
			if (status != 0) {
				System.out.println("not deleted");
				child22.log(LogStatus.FAIL, "Validation unsuccessful, because we are getting Messge as '" + title
						+ " has not deleted'. When we submit endpoint with delete");
			} else {
				System.out.println("deleted");
				child22.log(LogStatus.PASS, "Validation  successful because endpoint  has deleted.");
			}

			EPFP.ErrorMessageOKbtn.click();
			Thread.sleep(2000);
		} catch (Exception e) {
			Thread.sleep(2000);
			child22.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child22);
	}

	@Test(priority = 24, enabled = true, description = "Verifying Endpoint Flow page with Reset Search for existing Profile.")
	public void EndpointFlowSearchTestWithResetSearchForExistedFlow() throws Throwable {
		child23 = _extent_report.startTest("Verifying Endpoint Flow page with Reset Search for existing Profile.");
		child23.assignCategory("EndPoint Flow");
		try {
			Thread.sleep(3000);
			EPFP.ResetSearchClick.click();
			Thread.sleep(2000);
			EPFP.EPFProfileSelection("testingsetup8");
			Thread.sleep(2000);

			EPFP.SearchFlowClick.click();
			Thread.sleep(2000);

			EPFP.ResetSearchClick.click();
			Thread.sleep(2000);
			Boolean flag = EPFP.SearchFlowClick.isEnabled();
			String title = flag.toString();
			if (title.equalsIgnoreCase("false")) {
				System.out.println("pass");
				child23.log(LogStatus.PASS,
						"Validation successful because Reset Search is Resetting All the Fields in Endpoint flow page");
			} else {
				System.out.println("fail");
				child23.log(LogStatus.FAIL,
						"Validation Unsuccessful because Reset Search is not Resetting All the Fields in Endpoint flow page");
			}
		} catch (Exception e) {
			child23.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child23);
	}

	@Test(priority = 25, enabled = true, description = "Verifying whether the user should able to create flow by giving duplicate Method names to Endpoint")
	public void AddSetUpFlowVerificationWithDuplicateMethodName() throws Throwable {
		child24 = _extent_report.startTest(
				"Verifying whether the user should able to create flow by giving duplicate Method names to Endpoint");
		child24.assignCategory("EndPoint Flow");
		try {
			String title = "test12";

			Thread.sleep(3000);
			EPFP.EPFProfileSelection("testingsetup13");

			EPFP.SearchFlowClick.click();
			Thread.sleep(2000);
			EPFP.SetUPFlowClick.click();
			Thread.sleep(2000);
			EPFP.AddFlowClick.click();
			Thread.sleep(2000);
			EPFP.EndpointValues(title, "test12", "test12");
			EPFP.Createclick.click();
			Thread.sleep(2000);

			List<WebElement> col = driver.findElements(By.xpath("//table[@class='mat-table']//tbody//tr//td[2]"));
			int status = 0;
			for (int i = 0; i < col.size(); i++) {
				if (title.equals(col.get(i).getText())) {
					status++;
					System.out.println(col.get(i).getText());
					child24.log(LogStatus.PASS, "Validation successful, because we are getting Messge as '" + title
							+ " has added'. When we submit");
					break;
				}
			}
			if (status != 0) {
				System.out.println(title);
				child24.log(LogStatus.PASS, "Validation successful, because we are getting Messge as '" + title
						+ " has added'. When we submit");
			} else {
				System.out.println("not added");
				child24.log(LogStatus.FAIL, "Validation  unsuccessful because Endpoint has not added.");
			}

			EPFP.SaveFlowClick.click();
			Thread.sleep(2000);
			EPFP.ErrorMessageOKbtn.click();
		} catch (Exception e) {
			Thread.sleep(2000);
			child24.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child24);
	}

	@AfterTest
	public void afterTest() {

		_test_logger3.appendChild(Parent8);

		Parent8.appendChild(child1).appendChild(child2).appendChild(child3).appendChild(child4).appendChild(child5)
				.appendChild(child6).appendChild(child7).appendChild(child8).appendChild(child9).appendChild(child10)
				.appendChild(child11).appendChild(child12).appendChild(child13).appendChild(child14)
				.appendChild(child15).appendChild(child16).appendChild(child17).appendChild(child18)
				.appendChild(child19).appendChild(child20).appendChild(child21).appendChild(child22)
				.appendChild(child23).appendChild(child24);

		_extent_report.endTest(Parent8);
		_extent_report.endTest(_test_logger3);
		_extent_report.flush();

	}

}
