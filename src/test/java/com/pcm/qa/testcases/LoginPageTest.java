package com.pcm.qa.testcases;


import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pcm.qa.base.TestBase;
import com.pcm.qa.pages.LoginPage;
import com.pcm.qa.util.TestUtil;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class LoginPageTest extends TestBase {
	
	public LoginPage loginpage;
	
	public ExtentTest Parent1;	public ExtentTest child1;	public ExtentTest child2;	public ExtentTest child3;
	public ExtentTest child4;	public ExtentTest child5;	public ExtentTest child6;	public ExtentTest child7;
	public ExtentTest child8;
	
	
	public LoginPageTest() {
		super();
	}
	
	
	@BeforeMethod(enabled = true)
	public void basic() {
		
	loginpage = new LoginPage();
		
	}
	
	
	
	@BeforeTest
	public void setup() throws Exception {
		
		Extentreport();
		initialization();
		
		
	}
	
	@Test(priority=1, enabled=true)
	public void ParentNodeCreation() {
		_test_logger1 = _extent_report.startTest("login Page");
		
		Parent1 = _extent_report.startTest("Login Page TestCases");
		
	}
	
	@Test(priority=2,enabled=true,description="validating login page header title")
	public void validatingloginpageheadertitleTest() throws Exception {
		
		child1 = _extent_report.startTest("Login Page Title Verification");
		child1.assignCategory("Login Page TestCases");
		
		try {
			
			Thread.sleep(2000);
			loginpage.logout();
			Thread.sleep(2000);
			
			String title = loginpage.validateloginpageheadertitle();
			if(title.equals("Login to your account"))
			{
				child1.log(LogStatus.PASS, "Validation successful because we are getting Login Page Header title as '"+title+"'.");
				}
			else {
				child1.log(LogStatus.FAIL, "Validation  unsuccessful because we are getting Login Page Header title as '"+title+"' instead of Login to your account.");  
			 }
		} catch (Exception e) {
			child1.log(LogStatus.FAIL,e.fillInStackTrace());
		}
		_extent_report.endTest(child1); 
	}
	
	@Test(priority=3,enabled=true,description="validating login with valid data")
	public void validatingloginwithvaliddataTest() {
		
		child2 = _extent_report.startTest("Login Verification with valid data");
		child2.assignCategory("Login Page TestCases");
		
		try {
			
			String title = loginpage.validateloginwithvaliddata();
			
			if(title.equals("Home / File Transfers"))
			{
				child2.log(LogStatus.PASS, "Validation successful because we are getting Home Page header title after login as '"+title+"'.");
				}
			else {
				child2.log(LogStatus.FAIL, "Validation  unsuccessful because we are getting Home Page header title as '"+title+"' instead of Home / File Transfers.");  
			 }
			
			Thread.sleep(2000);
			
			loginpage.logout();
			
		} catch (Exception e) {
			child2.log(LogStatus.FAIL,e.fillInStackTrace());
		}
		_extent_report.endTest(child2); 
	}
	
	
	@Test(priority=4,enabled=true,description="validating login with invalid data")
	public void validatingloginwithinvaliddataTest() {
		
		child3 = _extent_report.startTest("Login Verification with invalid data");
		child3.assignCategory("Login Page TestCases");
		
		try {
			
			String title = loginpage.validateloginwithinvaliddata("testusername", "testpassword");
			
			if(title.equals("Invalid Login"))
			{
				child3.log(LogStatus.PASS, "Validation successful because we are getting message as '"+title+"'.");
				}
			else {
				child3.log(LogStatus.FAIL, "Validation  unsuccessful because we are getting message as '"+title+"' instead of Invalid Login.");  
			 }
		} catch (Exception e) {
			child3.log(LogStatus.FAIL,e.fillInStackTrace());
		}
		_extent_report.endTest(child3); 
	}
		
	@Test(priority=5,enabled=true,description="validating login with valid username and invalid password")
	public void validatingloginwithvalidusernameandinvalidpasswordTest() {
		
		child4 = _extent_report.startTest("Login Verification with valid username and invalid password");
		child4.assignCategory("Login Page TestCases");
		
		try {
			String title = loginpage.validateloginwithinvaliddata("cm_user", "testpassword");
			
			if(title.equals("Invalid Login"))
			{
				child4.log(LogStatus.PASS, "Validation successful because we are error getting message as '"+title+"'.");
				}
			else {
				child4.log(LogStatus.FAIL, "Validation  unsuccessful because we are getting error message as '"+title+"' instead of Invalid Login.");  
			 }
		} catch (Exception e) {
			child4.log(LogStatus.FAIL,e.fillInStackTrace());
		}
		_extent_report.endTest(child4); 
	}	
	
	@Test(priority=6,enabled=true,description="validating login with invalid username and valid password")
	public void validatingloginwithinvalidusernameandvalidpasswordTest() {
		
		child5 = _extent_report.startTest("validating login with invalid username and valid password");
		child5.assignCategory("Login Page TestCases");
		
		try {
			String title = loginpage.validateloginwithinvaliddata("testusername", "password");
			
		System.out.println(title);
			
			if(title.equals("Invalid Login"))
			{
				child5.log(LogStatus.PASS, "Validation successful because we are error getting message as '"+title+"'.");
				}
			else {
				child5.log(LogStatus.FAIL, "Validation  unsuccessful because we are getting error message as '"+title+"' instead of Invalid Login.");  
			 }
		} catch (Exception e) {
			child5.log(LogStatus.FAIL,e.fillInStackTrace());
		}
		_extent_report.endTest(child5); 
	}
	
	@Test(priority=7,enabled=true,description="validating login with username & password as empty")
	public void validatingloginwithusernameasemptyTest() {
		
		child6 = _extent_report.startTest("validating login with username & password as empty");
		child6.assignCategory("Login Page TestCases");
		
		try {
			
			driver.navigate().refresh();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//mat-icon[contains(text(),'account_circle')]")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//mat-icon[contains(text(),'lock')]")).click();
			
			Thread.sleep(1000);
			
			loginpage.loginbtn.click();
			
			Thread.sleep(1000);
			
			
			String title1 = loginpage.usernameisreqmsg.getText();
			
			String title2 = loginpage.passwordisreqmsg.getText();
			
			System.out.println(title1);
			System.out.println(title2);
			
			if(title1.equals("User Name is required") && title2.equals("Password is required"))
			{
				child6.log(LogStatus.PASS, "Validation successful because we are error getting message as '"+title1+"' and '"+title2+"' ");
				}
			else {
				child6.log(LogStatus.FAIL, "Validation  unsuccessful because we are not getting error message as '"+title1+"' and '"+title2+"'");  
			 }
		} catch (Exception e) {
			child6.log(LogStatus.FAIL,e.fillInStackTrace());
		}
		_extent_report.endTest(child6); 
	}
	
	
	@Test(priority=8,enabled=true,description="validating forgot password")
	public void validatingforgotpasswordTest() {
		
		child7 = _extent_report.startTest("validating forgot password");
		child7.assignCategory("Login Page TestCases");
		
		try {
			String title = loginpage.validateforgotpassword();
			
			if(title.equals("Forgot Password"))
			{
				child7.log(LogStatus.PASS, "Validation successful because we are error getting message as '"+title+"'.");
				}
			else {
				child7.log(LogStatus.FAIL, "Validation  unsuccessful because we are getting error message as '"+title+"' instead of Invalid Login.");  
			 }
		} catch (Exception e) {
			child7.log(LogStatus.FAIL,e.fillInStackTrace());
		}
		_extent_report.endTest(child7); 
	}
	
	
	
	
	
	@AfterTest(enabled=true)
	  public void afterTest() {
		  
			_test_logger1.appendChild(Parent1);
			
			 Parent1.appendChild(child1).appendChild(child2).appendChild(child3).appendChild(child4).
			 appendChild(child5).appendChild(child6).appendChild(child7);
			
			 _extent_report.endTest(Parent1);
			_extent_report.endTest(_test_logger1);
			
			 _extent_report.flush(); 
			  
			  driver.close();
	  }
	

}
