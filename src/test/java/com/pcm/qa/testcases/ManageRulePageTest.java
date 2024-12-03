package com.pcm.qa.testcases;

import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pcm.qa.base.TestBase;
import com.pcm.qa.pages.CreateRulePage;
import com.pcm.qa.pages.ManageRulePage;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ManageRulePageTest extends TestBase {

	ManageRulePage MRP;
	ManageRulePageTest MRPT;
	CreateRulePage CRP;

	public ExtentTest Parent12;
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

	public ManageRulePageTest() {
		super();
	}

	@BeforeMethod
	public void beforeMethod() {
		MRP = new ManageRulePage();
		MRPT = new ManageRulePageTest();
		CRP = new CreateRulePage();

	}

	@BeforeTest(enabled = true)
	public void setup() throws Exception {

		Extentreport();
		initialization();

	}

	@Test(priority = 1, enabled = true) 
	public void ParentNodeCreation() {
		
		_test_logger5 = _extent_report.startTest("Data Flows");
		Parent12 = _extent_report.startTest("Manage Rule");

	}

	@Test(priority = 2, enabled = true, description = "Verifying Manage Rule Page Title")
	public void loginPageTitleTest() throws InterruptedException {

		child1 = _extent_report.startTest("Verifying Manage Rule Page Title ");
		child1.assignCategory("Manage Rule");
		try {
			Thread.sleep(2000);
			
			String title = MRP.ValidateManageRulePageTitle();
			Thread.sleep(2000);
			if (title.equals("Search Rule")) {
				child1.log(LogStatus.PASS,
						"Validation successful because we are getting Manage Rule Page title as '" + title + "'");
			} else {
				child1.log(LogStatus.FAIL, "Validation  unsuccessful because we are getting Manage Rule Page title as '"
						+ title + "' instead of 'Search Action'");
			}
		} catch (Exception e) {
			child1.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child1);
	}

	@Test(priority = 3, enabled = true, description = "Verifying Manage Rule Page With InValid Data")
	public void MRTestVerificationWithInValidData() throws Exception {
		child2 = _extent_report.startTest("Verifying Manage Rule Page With InValid Data");
		child2.assignCategory("Manage Rule");
		try {
			MRP.ValidateManageRuleWithInvalidData("abcdef", "ACHDeenvelope");
			Thread.sleep(1000);
			String title = MRP.ErrorMsg1.getText();

			if (title.equals("No results found !")) {
				System.out.println("InValid Data");
				child2.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Invalid Data");
			} else {
				child2.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ "' instead of 'No results found !' ,when we Search with Invalid Data");
			}
		} catch (Exception e) {
			child2.log(LogStatus.FAIL, e.fillInStackTrace());
			String title2 = MRP.ActionMsg.getText();
			child2.log(LogStatus.INFO, title2);
		}
		_extent_report.endTest(child2);

	}

	@Test(priority = 4, enabled = true, description = "Verifying Manage Rule Page With Valid Data")
	public void MRTestVerificationWithValidData() throws Exception {
		child3 = _extent_report.startTest("Verifying Manage Rule Page With Valid Data");
		child3.assignCategory("Manage Rule");
		try {
			MRP.ValidateManageRuleWithValidData("RuleTest1", "AFTRoute");
			Boolean flag = MRP.ActionIconClick.isDisplayed();
			String title = flag.toString();
			System.out.println(title);
			Thread.sleep(2000);
			if (title.contains("true")) {
				System.out.println("Valid Data");
				child3.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Valid Data");
			} else {
				child3.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ "' instead of 'True' ,when we Search with Valid Data");
			}
		} catch (Exception e) {
			child3.log(LogStatus.FAIL, e.fillInStackTrace());
			String title2 = MRP.ErrorMsg.getText();
			child3.log(LogStatus.INFO, title2);
		}
		_extent_report.endTest(child3);

	}

	@Test(priority = 5, enabled = true, description = "Verifying Manage Rule Page With only Rule Name")
	public void MRTestVerificationWithRuleName() throws Exception {
		child4 = _extent_report.startTest("Verifying Manage Rule Page With only Rule Name");
		child4.assignCategory("Manage Rule");
		try {
			MRP.ValidateManageRuleWithRuleName("RuleTest1");
			Boolean flag = MRP.ActionIconClick.isDisplayed();
			String title = flag.toString();
			System.out.println(title);
			Thread.sleep(2000);
			if (title.contains("true")) {
				System.out.println("RuleName");
				child4.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with only Rule Name");
			} else {
				child4.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ "' instead of 'True' ,when we Search with only Rule Name");
			}
		} catch (Exception e) {
			child4.log(LogStatus.FAIL, e.fillInStackTrace());
			String title2 = MRP.ErrorMsg.getText();
			child4.log(LogStatus.INFO, title2);
		}
		_extent_report.endTest(child4);

	}
	
	@Test(priority = 6, enabled = true, description = "Verifying Manage Rule Page with only Rule Name and Edit")
	public void MRTestVerificationWithRulenameandEdit() throws Exception {
		child5 = _extent_report.startTest("Verifying Manage Rule Page with only Rule Name and Edit");
		child5.assignCategory("Manage Rule");
		try {
			Thread.sleep(2000);	
			MRP.ResetSearchClick.click();
			Thread.sleep(2000);	
			MRP.RuleNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"),"RuleTest1");
			Thread.sleep(2000);	
			MRP.SearchActionClick.click();
			Thread.sleep(2000);	
			MRP.ActionIconClick.click();
			Thread.sleep(3000);
			MRP.EditIconClick.click();
		Thread.sleep(5000);	
		
		CRP.Property1Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), "pcmtest1");
		Thread.sleep(2000);	
			CRP.CreateRuleButtonClick.click();
			Thread.sleep(1000);
			String title = MRP.ActionMsg.getText();
			if (title.contains("Rule updated successfully")) {
				
				child5.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Edit a valid record");
			} else {
				child5.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ "' instead of 'Rule Updated Successfully' ,when we Edit a valid record");
			}
		} catch (Exception e) {
			child5.log(LogStatus.FAIL, e.fillInStackTrace());
			String title2 = MRP.ErrorMsg.getText();
			child5.log(LogStatus.INFO, title2);
		}
		_extent_report.endTest(child5);

	}

	@Test(priority = 7, enabled = true, description = "Verifying Manage Rule Page with only Rule Name and Delete")
	public void MRTestVerificationWithRulenameandDelete() throws Exception {
		child6 = _extent_report.startTest("Verifying Manage Rule Page with only Rule Name and Delete");
		child6.assignCategory("Manage Rule");
		try {
			Thread.sleep(2000);	
			MRP.ResetSearchClick.click();
			Thread.sleep(2000);	
			MRP.RuleNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"),"RuleTest1");
			Thread.sleep(2000);	
			MRP.SearchActionClick.click();
			Thread.sleep(2000);	
			MRP.ActionIconClick.click();
			Thread.sleep(2000);
			MRP.DeleteIconClick.click();
			Thread.sleep(2000);
			MRP.yesdeleteitButton.click();
			Thread.sleep(2000);
			String title = MRP.ActionMsg.getText();
			if (title.contains("Rule Deleted successfully")) {
				
				child6.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Delete a valid record");
			} else {
				child6.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ "' instead of 'Rule Deleted Successfully' ,when we Delete a valid record");
			}
		} catch (Exception e) {
			child6.log(LogStatus.FAIL, e.fillInStackTrace());
			String title2 = MRP.ErrorMsg.getText();
			child6.log(LogStatus.INFO, title2);
		}
		_extent_report.endTest(child6);

	}


	@Test(priority = 8, enabled = true, description = "Verifying Manage Rule Page With only Business Process")
	public void MRTestVerificationWithBusinessProcess() throws Exception {
		child7 = _extent_report.startTest("Verifying Manage Rule Page With only Business Process");
		child7.assignCategory("Manage Rule");
		try {
			MRP.ValidateManageRuleWithBP("AFTRoute");
			Boolean flag = MRP.ActionIconClick.isDisplayed();
			String title = flag.toString();
			System.out.println(title);
			Thread.sleep(2000);
			if (title.contains("true")) {
				System.out.println("Business Process");
				child7.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with only Business Process");
			} else {
				child7.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ "' instead of 'Matches Found' ,when we Search with only Business Process");
			}
		} catch (Exception e) {
			child7.log(LogStatus.FAIL, e.fillInStackTrace());
			String title2 = MRP.ErrorMsg.getText();
			child7.log(LogStatus.INFO, title2);
		}
		_extent_report.endTest(child7);

	}

	@Test(priority = 9, enabled = true, description = "Verifying Manage Rule Page with only Business Process and Edit")
	public void MRTestVerificationWithEdit() throws Exception {
		child8 = _extent_report.startTest("Verifying Manage Rule Page with only Business Process and Edit");
		child8.assignCategory("Manage Rule");
		try {
			Thread.sleep(2000);	
			MRP.ResetSearchClick.click();
			Thread.sleep(2000);	
			DropDownSelection(MRP.BuisinessProcessDD, "AFTRoute");
			Thread.sleep(2000);	
			MRP.SearchActionClick.click();
			Thread.sleep(2000);	
			MRP.ActionIconClick.click();
			Thread.sleep(3000);
			MRP.EditIconClick.click();
		Thread.sleep(3000);	
		CRP.Property1Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), "pcmtest2");
			CRP.CreateRuleButtonClick.click();
			Thread.sleep(1000);
			String title = MRP.ActionMsg.getText();
			if (title.contains("Rule updated successfully")) {
				
				child8.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Edit a valid record");
			} else {
				child8.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ "' instead of 'Rule Updated Successfully' ,when we Edit a valid record");
			}
		} catch (Exception e) {
			child8.log(LogStatus.FAIL, e.fillInStackTrace());
			String title2 = MRP.ErrorMsg.getText();
			child8.log(LogStatus.INFO, title2);
		}
		_extent_report.endTest(child8);

	}

	@Test(priority = 10, enabled = true, description = "Verifying Manage Rule Page with only Business Process and Delete")
	public void MRTestVerificationWithDelete() throws Exception {
		child9 = _extent_report.startTest("Verifying Manage Rule Page with only Business Process and Delete");
		child9.assignCategory("Manage Rule");
		try {
			Thread.sleep(2000);	
			MRP.ResetSearchClick.click();
			Thread.sleep(2000);	
			DropDownSelection(MRP.BuisinessProcessDD, "AFTRoute");
			Thread.sleep(2000);	
			MRP.SearchActionClick.click();
			Thread.sleep(2000);	
			MRP.ActionIconClick.click();
			Thread.sleep(2000);
			MRP.DeleteIconClick.click();
			Thread.sleep(2000);
			MRP.yesdeleteitButton.click();
			Thread.sleep(2000);
			String title = MRP.ActionMsg.getText();
			if (title.contains("Rule Deleted successfully")) {
				
				child9.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Delete a valid record");
			} else {
				child9.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ "' instead of 'Rule Deleted Successfully' ,when we Delete a valid record");
			}
		} catch (Exception e) {
			child9.log(LogStatus.FAIL, e.fillInStackTrace());
			String title2 = MRP.ErrorMsg.getText();
			child9.log(LogStatus.INFO, title2);
		}
		_extent_report.endTest(child9);

	}
	
	
	@Test(priority = 11, enabled = true, description = "Verifying Manage Rule Page With rulename and Business Process")
	public void MRTestVerificationWithruleandBusinessProcess() throws Exception {
		child10 = _extent_report.startTest("Verifying Manage Rule Page With rulename and Business Process");
		child10.assignCategory("Manage Rule");
		try {
			Thread.sleep(2000);	
			MRP.ValidateManageRuleWithValidData("RuleTest3", "AFTRoute");
			Boolean flag = MRP.ActionIconClick.isDisplayed();
			String title = flag.toString();
			System.out.println(title);
			Thread.sleep(2000);
			if (title.contains("true")) {
				System.out.println("Business Process");
				child10.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with only Business Process");
			} else {
				child10.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ "' instead of 'Matches Found' ,when we Search with only Business Process");
			}
		} catch (Exception e) {
			child10.log(LogStatus.FAIL, e.fillInStackTrace());
			String title2 = MRP.ErrorMsg.getText();
			child10.log(LogStatus.INFO, title2);
		}
		_extent_report.endTest(child10);

	}

	@Test(priority = 12, enabled = true, description = "Verifying Manage Rule Page with rulename and Business Process and Edit")
	public void MRTestVerificationWithRuleandBPEdit() throws Exception {
		child11 = _extent_report.startTest("Verifying Manage Rule Page with rulename and Business Process and Edit");
		child11.assignCategory("Manage Rule");
		try {
			Thread.sleep(2000);	
			MRP.ValidateManageRuleWithValidData("RuleTest3", "AFTRoute");
			Thread.sleep(2000);	
			MRP.ActionIconClick.click();
			Thread.sleep(3000);
			MRP.EditIconClick.click();
		Thread.sleep(3000);	
		CRP.Property1Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), "pcmtest3");
			CRP.CreateRuleButtonClick.click();
			Thread.sleep(1000);
			String title = MRP.ActionMsg.getText();
			if (title.contains("Rule updated successfully")) {
				
				child11.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Edit a valid record");
			} else {
				child11.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ "' instead of 'Rule Updated Successfully' ,when we Edit a valid record");
			}
		} catch (Exception e) {
			child11.log(LogStatus.FAIL, e.fillInStackTrace());
			String title2 = MRP.ErrorMsg.getText();
			child11.log(LogStatus.INFO, title2);
		}
		_extent_report.endTest(child11);

	}

	@Test(priority = 13, enabled = true, description = "Verifying Manage Rule Page with rulename and Business Process and Delete")
	public void MRTestVerificationWithRuleandBPDelete() throws Exception {
		child12 = _extent_report.startTest("Verifying Manage Rule Page with rulename and Business Process and Delete");
		child12.assignCategory("Manage Rule");
		try {
			Thread.sleep(2000);	
			MRP.ValidateManageRuleWithValidData("RuleTest3", "AFTRoute");
			Thread.sleep(2000);	
			MRP.ActionIconClick.click();
			Thread.sleep(2000);
			MRP.DeleteIconClick.click();
			Thread.sleep(2000);
			MRP.yesdeleteitButton.click();
			Thread.sleep(2000);
			String title = MRP.ActionMsg.getText();
			if (title.contains("Rule Deleted successfully")) {
				
				child12.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Delete a valid record");
			} else {
				child12.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ "' instead of 'Rule Deleted Successfully' ,when we Delete a valid record");
			}
		} catch (Exception e) {
			child12.log(LogStatus.FAIL, e.fillInStackTrace());
			String title2 = MRP.ErrorMsg.getText();
			child12.log(LogStatus.INFO, title2);
		}
		_extent_report.endTest(child12);

	}
	
	@Test(priority = 14, enabled = true, description = "Verifying Manage Rule Page With Reset Search button")
	public void MRPTestVerificationWithReset() throws Exception {
		child13 = _extent_report.startTest("Verifying Manage Rule Page With Reset Search button");
		child13.assignCategory("Manage Rule");
		try {
			MRP.ValidateManageRuleWithReset("fgh", "ACHDeenvelope");
			Thread.sleep(1000);
			if(MRP.RuleNameData.getText().isEmpty()){
				
				child13.log(LogStatus.PASS, "Validation successful because Reset Search is Resetting All the Fields in Manage Rule page");
	        }

		 else {
			 child13.log(LogStatus.FAIL, "Validation Unsuccessful because Reset Search is  not Resetting All the Fields in Manage Rule page");
			}
			
			
		} catch (Exception e) {
			child13.log(LogStatus.FAIL, e.fillInStackTrace());
			
		}
		_extent_report.endTest(child13);

	}

	@AfterTest
	public void afterTest() {

		_test_logger5.appendChild(Parent12);

		Parent12.appendChild(child1).appendChild(child2).appendChild(child3).appendChild(child4).appendChild(child5)
				.appendChild(child6).appendChild(child7).appendChild(child8).appendChild(child9).appendChild(child10).appendChild(child11).appendChild(child12).appendChild(child13);

		_extent_report.endTest(Parent12);
		_extent_report.endTest(_test_logger5);
		_extent_report.flush();
	}

}

