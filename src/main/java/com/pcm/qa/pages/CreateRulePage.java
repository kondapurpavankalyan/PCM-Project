package com.pcm.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pcm.qa.base.TestBase;

public class CreateRulePage extends TestBase {

	@FindBy(xpath = "//input[@placeholder='Rule Name']")
	public WebElement RuleNameData;

	@FindBy(xpath = "//span[contains(text(),'Business Process')]")
	public WebElement BuisinessProcessDD;

	@FindBy(xpath = "//input[@placeholder='PropertyName1']")
	public WebElement Property1Data;

	@FindBy(xpath = "//input[@placeholder='PropertyName2']")
	public WebElement Property2Data;

	@FindBy(xpath = "//input[@placeholder='PropertyName3']")
	public WebElement Property3Data;

	@FindBy(xpath = "//input[@placeholder='PropertyName4']")
	public WebElement Property4Data;

	@FindBy(xpath = "//input[@placeholder='PropertyName5']")
	public WebElement Property5Data;

	@FindBy(xpath = "//input[@placeholder='PropertyName6']")
	public WebElement Property6Data;

	@FindBy(xpath = "//input[@placeholder='PropertyName7']")
	public WebElement Property7Data;

	@FindBy(xpath = "//input[@placeholder='PropertyName8']")
	public WebElement Property8Data;

	@FindBy(xpath = "//input[@placeholder='PropertyName9']")
	public WebElement Property9Data;

	@FindBy(xpath = "//input[@placeholder='PropertyName10']")
	public WebElement Property10Data;

	@FindBy(xpath = "//input[@placeholder='PropertyName11']")
	public WebElement Property11Data;

	@FindBy(xpath = "//input[@placeholder='PropertyName12']")
	public WebElement Property12Data;

	@FindBy(xpath = "//input[@placeholder='PropertyName13']")
	public WebElement Property13Data;

	@FindBy(xpath = "//input[@placeholder='PropertyName14']")
	public WebElement Property14Data;

	@FindBy(xpath = "//input[@placeholder='PropertyName15']")
	public WebElement Property15Data;
	
	@FindBy(xpath = "//input[@placeholder='PropertyName16']")
	public WebElement Property16Data;

	@FindBy(xpath = "//input[@placeholder='PropertyName17']")
	public WebElement Property17Data;

	@FindBy(xpath = "//input[@placeholder='PropertyName18']")
	public WebElement Property18Data;

	@FindBy(xpath = "//input[@placeholder='PropertyName19']")
	public WebElement Property19Data;

	@FindBy(xpath = "//input[@placeholder='PropertyName20']")
	public WebElement Property20Data;

	@FindBy(xpath = "//input[@placeholder='PropertyName21']")
	public WebElement Property21Data;

	@FindBy(xpath = "//input[@placeholder='PropertyName22']")
	public WebElement Property22Data;

	@FindBy(xpath = "//input[@placeholder='PropertyName23']")
	public WebElement Property23Data;

	@FindBy(xpath = "//input[@placeholder='PropertyName24']")
	public WebElement Property24Data;

	@FindBy(xpath = "//input[@placeholder='PropertyName25']")
	public WebElement Property25Data;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	public WebElement CreateRuleButtonClick;

	@FindBy(xpath = "//button[@class='btn btn-info']")
	public WebElement CancelClick;

	@FindBy(xpath = "//span[contains(text(),'Create Rule')]")
	public WebElement CreateRuleModuleClick;

	@FindBy(xpath = "//span[contains(text(),'Data Flows')]")
	public WebElement DataFlowsModuleClick;
	
	@FindBy(xpath = "//span[contains(text(),'Manage Rule')]")
	public WebElement ManageRuleModuleClick;

	@FindBy(xpath = "//div[@id='swal2-content']")
	public WebElement ActionMsg;

	@FindBy(xpath = "//div[@id='swal2-content']")
	public WebElement ErrorMsg;

	@FindBy(xpath = "(//ul[@class='errorMessage']/li/span)[1]")
	public WebElement ErrorMsg1;

	@FindBy(xpath = "(//ul[@class='errorMessage']/li/span)[2]")
	public WebElement ErrorMsg2;

	@FindBy(xpath = "(//ul[@class='errorMessage']/li/span)[3]")
	public WebElement ErrorMsg3;
	
	@FindBy(xpath = "//button[contains(text(),'Yes, cancel it!')]")
	public WebElement yesActivateitClick;
	
	@FindBy(xpath = "(//div//h4)[1]")
	public WebElement CreateRuletitle;
	
	@FindBy(xpath = "//button[@type='button' and contains(text(),'OK')]")
	public WebElement Errorokbtn;
	
	@FindBy(xpath = "//button[text()=' CANCEL ']")
	public WebElement Cancelbtn;
	
	@FindBy(xpath = "//button[text()='Yes, cancel it!']")
	public WebElement YesCancelitbtn;
	
	
	

	public CreateRulePage() {
		PageFactory.initElements(driver, this);
	}

	public String ValidateCreateRulePageTitle() throws Throwable {
		
		Thread.sleep(2000);
		DataFlowsModuleClick.click();
		Thread.sleep(1000);
		CreateRuleModuleClick.click();
		Thread.sleep(3000);
		return CreateRuletitle.getText();

	}

	public void ValidateCreateRulePageWithValidData(String rulename, String BusinessProcess) throws Throwable {
		
		Thread.sleep(1000);
		RuleNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), rulename);
		Thread.sleep(3000);
		DropDownSelection(BuisinessProcessDD, BusinessProcess);
		Thread.sleep(3000);
		Property1Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), "a");
		Property2Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), "b");
		Property3Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), "c");
		//Actionselection(driver, CreateRuleButtonClick);
		CreateRuleButtonClick.click();

	}

	
	public void ValidateCreateRulePageWithOnlyMandatoryFields(String rulename, String BusinessProcess) throws Throwable {
		//Actionselection(driver, CreateRuleModuleClick);
		
		
		Thread.sleep(2000);
		RuleNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), rulename);
		Thread.sleep(3000);
		DropDownSelection(BuisinessProcessDD, BusinessProcess);
		Thread.sleep(3000);
		//Actionselection(driver, CreateRuleButtonClick);
		CreateRuleButtonClick.click();

	}
	public void ValidateCreateRulePageWithOnlyRuleName(String rulename) throws Throwable {
		
		Thread.sleep(2000);
		RuleNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), rulename);
		//Actionselection(driver, CreateRuleButtonClick);
		CreateRuleButtonClick.click();

	}

	public void ValidateCreateRulePageWithOnlyBusinessProcess(String BusinessProcess) throws Throwable {
		//Actionselection(driver, CreateRuleModuleClick);
		
		Thread.sleep(3000);
		DropDownSelection(BuisinessProcessDD, BusinessProcess);
		Thread.sleep(3000);
		//Actionselection(driver, CreateRuleButtonClick);
		CreateRuleButtonClick.click();

	}

	public void ValidateCreateRulePageWithEmptyFields() throws Throwable {
		driver.navigate().refresh();
		Thread.sleep(2000);
		Actionselection(driver, CreateRuleModuleClick);
		Actionselection(driver, CreateRuleButtonClick);
	}

	public void ValidateCreaterulepageCancelButton() throws Throwable {
		driver.navigate().refresh();
		Actionselection(driver, CreateRuleModuleClick);
		Actionselection(driver, CancelClick);
	}

}
