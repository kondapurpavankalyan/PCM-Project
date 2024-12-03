package com.pcm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pcm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//Page Factory - Object Repository
	
	@FindBy(xpath = "//input[@formcontrolname='username']")
	public WebElement username;
	
	@FindBy(xpath = "//input[@formcontrolname='password']")
	public WebElement password;
	
	@FindBy(xpath = "//button[@class='btn__login mat-flat-button mat-warn']")
	public WebElement loginbtn;
	
	@FindBy(xpath = "//a[contains(text(),'Forgot Password?')]")
	public WebElement forgotpwd;
	
	@FindBy(xpath = "//div//h3")
	public WebElement LoginPageheadertitle;
	
	@FindBy(xpath = "//h3")
	public WebElement HPheadertitle;
	
	@FindBy(xpath = "//span//mat-icon[contains(text(),'account_box')]")
	public WebElement useraccountbtn;
	
	@FindBy(xpath = "//button[contains(text(),'Logout')]")
	public WebElement logoutbtn;
	
	@FindBy(xpath = "//h4")
	public WebElement forgotpasswordheadertitle;
	
	@FindBy(xpath = "//button//span[contains(text(),' Close ')]")
	public WebElement forgotpasswordclosebtn;
	
	@FindBy(xpath = "//h2")
	public WebElement invalidloginmsg;
	
	@FindBy(xpath = "//button[contains(text(),'OK')]")
	public WebElement invalidloginokbtn;
	
	@FindBy(xpath = "(//div//mat-error)[1]")
	public WebElement usernameisreqmsg;
	
	@FindBy(xpath = "(//div//mat-error)[2]")
	public WebElement passwordisreqmsg;
	
	@FindBy(xpath = "//button[contains(text(),'Change Password')]")
	public WebElement Changepassword;
	
	
	//Page Factory initialization
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	public String validateloginpageheadertitle() {
		
		return LoginPageheadertitle.getText();
		
	}
	
	public String validateloginwithvaliddata() throws Exception {
		
		username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		//Actionselection(driver, loginbtn);
		loginbtn.click();
		
		Thread.sleep(3000);
		
		return HPheadertitle.getText();
	}
	
	public String validateloginwithinvaliddata(String un , String pwd) throws Exception {
		username.clear();
		username.sendKeys(un);
		password.clear();
		password.sendKeys(pwd);
		//Actionselection(driver, loginbtn);
		loginbtn.click();
		String title = invalidloginmsg.getText();
		Thread.sleep(1000);
		invalidloginokbtn.click();
		//driver.navigate().refresh();
		return title;
	}
	
/*	public void logout() throws Exception {
		
		useraccountbtn.click();
		//Actionselection(driver, useraccountbtn);
		Thread.sleep(1000);
		logoutbtn.click();
		//Actionselection(driver, logoutbtn);
		Thread.sleep(1000);
	}*/
	
	public String validateforgotpassword() throws Exception {
		
		forgotpwd.click();
		Thread.sleep(1000);
		//Actionselection(driver, forgotpwd);
		String text = forgotpasswordheadertitle.getText();
		forgotpasswordclosebtn.click();
		Thread.sleep(1000);
		//Actionselection(driver, forgotpasswordclosebtn);
		
		return text;
		
	}
	
	

}
