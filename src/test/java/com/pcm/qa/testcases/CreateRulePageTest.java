
package com.pcm.qa.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pcm.qa.base.TestBase;
import com.pcm.qa.pages.CreateRulePage;
import com.pcm.qa.pages.ManageRulePage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class CreateRulePageTest extends TestBase {

	CreateRulePage CRP;
	 ManageRulePage	MRP;

	public ExtentTest Parent11;
	public ExtentTest child1;
	public ExtentTest child2;
	public ExtentTest child3;
	public ExtentTest child4;
	public ExtentTest child5;
	public ExtentTest child6;
	public ExtentTest child7;
	public ExtentTest child8;

	public CreateRulePageTest() {
		super();
	}

	@BeforeMethod
	public void beforeTest() {

		CRP = new CreateRulePage();
		MRP = new ManageRulePage();

	}
	
	@BeforeTest(enabled = true)
	public void setup() throws Exception {
		
		Extentreport();
		initialization();
		
	}

	@Test(priority = 1, enabled = true)
	public void ParentNodeCreation() {

		_test_logger5 = _extent_report.startTest("Data Flows");
		Parent11 = _extent_report.startTest("Create Rule");

	}

	@Test(priority = 2, enabled = true, description = "Verifying Create Rule Page Title")
	public void CreateRulePageTitleTest() throws Throwable {

		child1 = _extent_report.startTest("Verifying Create Rule Page Title ");
		child1.assignCategory("Create Rule");
		try {
			Thread.sleep(2000);
			
			String title = CRP.ValidateCreateRulePageTitle();

			if (title.equals("Create Rule")) {
				child1.log(LogStatus.PASS,
						"Validation successful because we are getting Create Rule Page title as '" + title + "'");
			} else {
				child1.log(LogStatus.FAIL, "Validation  unsuccessful because we are getting Create Rule Page title as '"
						+ title + "' instead of 'New Action'");
			}
			
			
		} catch (Exception e) {
			child1.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child1);
	}

	@Test(priority = 3, enabled = true, description = "Verifying Create Rule Page With Valid Data")
	public void CRTestVerificationWithValidData() throws Throwable {
		child2 = _extent_report.startTest("Verifying Create Rule Page With Valid Data");
		child2.assignCategory("Create Rule");
		try {
			CRP.ValidateCreateRulePageWithValidData("RuleTest1", "AFTRoute");
			String title = CRP.ActionMsg.getText();

			if (title.equals("Rule created successfully")) {
				child2.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Valid Data");
			} else {
				child2.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ "' instead of 'Rule Created Successfully' , when we Search with Valid Data");
			}
			
			Thread.sleep(2000);
			
		} catch (org.openqa.selenium.InvalidSelectorException e) {
			child2.log(LogStatus.FAIL, e.fillInStackTrace());
			String error = CRP.ErrorMsg.getText();
			child2.log(LogStatus.INFO, error);
		}
		_extent_report.endTest(child2);

	}
	
	@Test(priority = 4, enabled = true, description = "Verifying Create Rule Page With only mandatory fields")
	public void CRTestVerificationWithOnlyMadatoryFields() throws Throwable {
		child3 = _extent_report.startTest("Verifying Create Rule Page With Only MadatoryFields");
		child3.assignCategory("Create Rule");
		try {
			Thread.sleep(2000);
			CRP.CreateRuleModuleClick.click();
			CRP.ValidateCreateRulePageWithOnlyMandatoryFields("RuleTest2","AFTRoute");
			String title = CRP.ActionMsg.getText();

			if (title.equals("Rule created successfully")) {
				child3.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with only mandatory fields");
			} else {
				child3.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ "' instead of 'Rule Created Successfully' , when we Search with only mandatroy fields");
			}
			
			Thread.sleep(2000);
			
		} catch (org.openqa.selenium.InvalidSelectorException e) {
			child3.log(LogStatus.FAIL, e.fillInStackTrace());
			String error = CRP.ErrorMsg.getText();
			child3.log(LogStatus.INFO, error);
		}
		_extent_report.endTest(child3);
	}



	@Test(priority = 5, enabled = true, description = "Verifying Create Rule Page With Only Rule Name")
	public void CRTestVerificationWithOnlyRuleName() throws Throwable {
		child4 = _extent_report.startTest("Verifying Create Rule Page With Only Rule Name");
		child4.assignCategory("Create Rule");
		try {
			Thread.sleep(2000);
			CRP.CreateRuleModuleClick.click();
			CRP.ValidateCreateRulePageWithOnlyRuleName("abcde");
			String title1 = CRP.ErrorMsg.getText();
		
			if ((title1.equals("(*) field are required to submit"))) {
				child4.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title1
						+ "' when we Search with Only Rule Name");
			} else {
				child4.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title1
						+ "' instead of 'Clear All Errors before you proceed' , when we Search with Only Rule Name");
			}
			
			Thread.sleep(2000);
			CRP.Errorokbtn.click();
			Thread.sleep(1000);
			CRP.Cancelbtn.click();
			Thread.sleep(1000);
			CRP.YesCancelitbtn.click();
			
		} catch (org.openqa.selenium.InvalidSelectorException e) {
			child4.log(LogStatus.FAIL, e.fillInStackTrace());
			String error = CRP.ActionMsg.getText();
			child4.log(LogStatus.INFO, error);
		}
		_extent_report.endTest(child4);

	}

	@Test(priority = 6, enabled = true, description = "Verifying Create Rule Page With Only Business Process")
	public void CRTestVerificationWithOnlyBusinessProcess() throws Throwable {
		child5 = _extent_report.startTest("Verifying Create Rule Page With Only Business Process");
		child5.assignCategory("Create Rule");
		try {
			CRP.CreateRuleModuleClick.click();
			Thread.sleep(2000);
			CRP.ValidateCreateRulePageWithOnlyBusinessProcess("AFTRoute");
			String title1 = CRP.ErrorMsg.getText();
			if ((title1.equals("(*) field are required to submit"))) {
				child5.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title1
						+ "' when we Search with Only Business Process");
			} else {
				child5.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title1
						+ "' instead of '(*) field are required to submit' , when we Search with Only Business Process");
			}
			
			CRP.Errorokbtn.click();
			CRP.Cancelbtn.click();
			CRP.YesCancelitbtn.click();
			
		} catch (org.openqa.selenium.InvalidSelectorException e) {
			child5.log(LogStatus.FAIL, e.fillInStackTrace());
			String error = CRP.ActionMsg.getText();
			child5.log(LogStatus.INFO, error);
		}
		_extent_report.endTest(child5);

	}

	@Test(priority = 7, enabled = true, description = "Verifying Create Rule Page With Existed RuleName")
	public void CRTestVerificationWithExistedRuleName() throws Throwable {
		child6= _extent_report.startTest("Verifying Create Rule Page With Existed RuleName");
		child6.assignCategory("Create Rule");
		try {
			CRP.CreateRuleModuleClick.click();
			Thread.sleep(2000);
			CRP.ValidateCreateRulePageWithValidData("RuleTest1", "AFTRoute");
			String title1 = CRP.ErrorMsg.getText();
			
			if ((title1.equals("Rule already exists."))) {
				child6.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title1
						+ "' when we Search with ExistedRuleName");
			} else {
				child6.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title1
						+ "' instead of 'Rule Name already exists' , when we Search with Existed RuleName");
			}
			
			CRP.Errorokbtn.click();
			CRP.Cancelbtn.click();
			CRP.YesCancelitbtn.click();
			
		} catch (org.openqa.selenium.InvalidSelectorException e) {
			child6.log(LogStatus.FAIL, e.fillInStackTrace());
			String error = CRP.ActionMsg.getText();
			child6.log(LogStatus.INFO, error);
		}
		_extent_report.endTest(child6);

	}

	@Test(priority = 8, enabled = true, description = "Creating Rule for managerule")
	public void CreatingRuleforManage() throws Throwable {
		child7 = _extent_report.startTest("Creating Rule for managerule");
		child7.assignCategory("Create Rule");
		try {
			CRP.CreateRuleModuleClick.click();
			Thread.sleep(2000);
			CRP.ValidateCreateRulePageWithValidData("RuleTest3", "AFTRoute");
			String title = CRP.ActionMsg.getText();

			if (title.equals("Rule created successfully")) {
				child7.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Valid Data");
			} else {
				child7.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ "' instead of 'Rule Created Successfully' , when we Search with Valid Data");
			}
			
			Thread.sleep(2000);
			
		} catch (org.openqa.selenium.InvalidSelectorException e) {
			child7.log(LogStatus.FAIL, e.fillInStackTrace());
			String error = CRP.ErrorMsg.getText();
			child7.log(LogStatus.INFO, error);
		}
		_extent_report.endTest(child7);

	}
	
	@Test(priority = 9, enabled = true, description = "Verifying Create Rule Page With Cancel button")
	public void CRPTestVerificationWithCancelbutton() throws Throwable {
		child8 = _extent_report.startTest("Verifying Create Rule Page With Cancel button");
		child8.assignCategory("Create Rule");
		try {
			CRP.CreateRuleModuleClick.click();
			Thread.sleep(2000);
			CRP.CancelClick.click();
			driver.findElement(By.xpath("//button[contains(text(),'Yes, cancel it!')]")).click();
			Thread.sleep(2000);
			String title = MRP.ValidateManageRulePageTitle();

			if (title.equals("Search Rule")) {
				child8.log(LogStatus.PASS,
						"Validation successful because we are navigated '" + title + "' page ");
			} else {
				child8.log(LogStatus.FAIL, "Validation unsuccessful because we are not navigated to Search Rule page");
			}
			CRP.CreateRuleModuleClick.click();
			
			Thread.sleep(2000);
			
		} catch (Exception e) {
			child8.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child8);
	}

	
	@AfterTest
	public void tearDown() {

		_test_logger5.appendChild(Parent11);

		Parent11.appendChild(child1)
		.appendChild(child2)
		.appendChild(child3)
		.appendChild(child4)
		.appendChild(child5)
		.appendChild(child6)
		.appendChild(child7)
		.appendChild(child8);

		_extent_report.endTest(Parent11);
		
		_extent_report.endTest(_test_logger5);
		
		_extent_report.flush();

		
	}

}
