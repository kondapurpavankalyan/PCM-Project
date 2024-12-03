package com.pcm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pcm.qa.base.TestBase;

public class DataFlowPage extends TestBase {

	@FindBy(xpath = "//span//mat-icon[contains(text(),'menu')]")
	public WebElement ControlMenuClick;

	@FindBy(xpath = "//span[contains(text(),'Reports')]")
	public WebElement ReportClick;

	@FindBy(xpath = "(//span[contains(text(),'Data Flow')])[1]")
	public WebElement DataFlowClick;

	@FindBy(xpath = "//input[@name='partnerName']")
	public WebElement PartnerNameData;

	@FindBy(xpath = "//input[@name='applicationName']")
	public WebElement ApplicationNameData;

	@FindBy(xpath = "//mat-select[@id='seqType']")
	public WebElement SEQTypeDropDown;

	@FindBy(xpath = "//mat-select[@id='flow']")
	public WebElement FlowDropDown;

	@FindBy(xpath = "//input[@name='fileType']")
	public WebElement FilenameData;

	@FindBy(xpath = "//input[@name='docType']")
	public WebElement DocTypeData;

	@FindBy(xpath = "//input[@name='transaction']")
	public WebElement TransactionData;

	@FindBy(xpath = "//input[@name='senderId']")
	public WebElement SenderIDData;

	@FindBy(xpath = "//input[@name='receiverId']")
	public WebElement ReceiverIDData;

	@FindBy(xpath = "//input[@name='ruleName']")
	public WebElement RuleNameData;

	@FindBy(xpath = "(//input[@name='ruleValue'])[1]")
	public WebElement RuleValueData;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	public WebElement SearchButtonClick;

	@FindBy(xpath = "//button[@class='btn btn-info']")
	public WebElement ResetSearchClick;

	@FindBy(xpath = "//button[@class='btn btn-info ml-auto']")
	public WebElement ExportWorkflowClick;

	@FindBy(xpath = "//div[@id='swal2-content']")
	public WebElement ActionMsg;

	@FindBy(xpath = "//div[@id='swal2-content']")
	public WebElement ErrorMsg;

	@FindBy(xpath = "(//mat-panel-title)[1]")
	public WebElement DataflowTitle;

	@FindBy(xpath = "//*[text()[contains(.,'OK')]]")
	public WebElement OKbtn;

	@FindBy(xpath = "//*[text()[contains(.,' Advanced Search ')]]")
	public WebElement AdvanceSearchClick;

	@FindBy(xpath = "//mat-select[@aria-label='Rule Name']")
	public WebElement RulenameDD;

	@FindBy(xpath = "//mat-select[@aria-label='Rule Property Name']")
	public WebElement RulepropertynameDD;
	
	@FindBy(xpath = "(//mat-select[@aria-label='Rule Property Name'])[2]")
	public WebElement RulepropertynameDD1;

	@FindBy(xpath = "//input[@placeholder='Rule Property Value']")
	public WebElement RulepropertyvalueData;
	
	@FindBy(xpath = "(//input[@placeholder='Rule Property Value'])[2]")
	public WebElement RulepropertyvalueData1;

	// Initializing the Page Objects:
	public DataFlowPage() {
		PageFactory.initElements(driver, this);
	}

	public String validateDataFlowPageTitle() throws Exception {

		Thread.sleep(1000);

		ReportClick.click();
		Thread.sleep(1000);

		DataFlowClick.click();
		Thread.sleep(5000);
		return DataflowTitle.getText();
	}

	public void ValidateDataFlowResultWithInvalidData() throws Throwable {

		PartnerNameData.sendKeys("partnerName");
		Thread.sleep(1000);
		ApplicationNameData.sendKeys("Application Name");
		DropDownSelection(SEQTypeDropDown, "DocHandling");
		Thread.sleep(2000);
		DropDownSelection(FlowDropDown, "Inbound");
		Thread.sleep(2000);
		FilenameData.sendKeys("filename");
		DocTypeData.sendKeys("PDF");
		TransactionData.sendKeys("transaction");
		SenderIDData.sendKeys("456");
		ReceiverIDData.sendKeys("987");
		RuleNameData.sendKeys("rulename");
		RuleValueData.sendKeys("159");
		Thread.sleep(1000);
		SearchButtonClick.click();

	}

	public void ValidateDataFlowResultWithValidData() throws Throwable {

		driver.findElement(By.xpath("//*[text()[contains(.,' DataFlow Reports ')]]")).click();
		Thread.sleep(2000);
		PartnerNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "CDtest16071");
		Thread.sleep(1000);
		ApplicationNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Template_App0513");
		// DropDownSelection(SEQTypeDropDown, "DocHandling");
		Thread.sleep(1000);
		// DropDownSelection(FlowDropDown, "Inbound");
		Thread.sleep(1000);
		FilenameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Odoc4FN");
		DocTypeData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Odoc4type");
		TransactionData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "1234");
		SenderIDData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "SeId4");
		ReceiverIDData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "ReId4");
		RuleNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "DestFileArchive");
		// RuleValueData.sendKeys("CM_DropProcess");
	}

	public String Getpartnername() throws Exception {

		Thread.sleep(2000);
		String name = driver.findElement(By.xpath("//tbody//tr[1]/td[2]//span")).getText();
		return name;

	}

	public String Getappname() throws Exception {

		Thread.sleep(2000);
		String name = driver.findElement(By.xpath("//tbody//tr[1]/td[3]//span")).getText();
		return name;

	}

	public String GetsenderId() throws Exception {

		Thread.sleep(2000);
		String name = driver.findElement(By.xpath("//tbody//tr[1]/td[9]//span")).getText();
		return name;

	}

	public String GetreceiverId() throws Exception {

		Thread.sleep(2000);
		String name = driver.findElement(By.xpath("//tbody//tr[1]/td[10]//span")).getText();
		return name;

	}

	public String Getfilename() throws Exception {

		Thread.sleep(2000);
		String name = driver.findElement(By.xpath("//tbody//tr[1]/td[6]//span")).getText();
		return name;

	}

	public String verifyingadvancesearch() throws Exception {

		Thread.sleep(2000);
		String name = AdvanceSearchClick.getText();
		return name;

	}

	public void verifyingadvancesearchwithrulename() throws Exception {

		Thread.sleep(2000);
		AdvanceSearchClick.click();
		Thread.sleep(2000);
		DropDownSelection(RulenameDD, "SourceFileArchive");
		Thread.sleep(2000);
		SearchButtonClick.click();

	}

	public void verifyingadvancesearchwithrpname_rpvalue() throws Exception {

		Thread.sleep(2000);
		DropDownSelection(RulenameDD, "SourceFileArchive");
		Thread.sleep(2000);
		DropDownSelection(RulepropertynameDD, "FilePreFix");
		Thread.sleep(2000);
		RulepropertyvalueData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "src");
		Thread.sleep(2000);

		SearchButtonClick.click();

	}

	public void verifyingadvancesearchwithmorethanrule() throws Exception {
		

		Thread.sleep(2000);
		DropDownSelection(RulenameDD, "SourceFileArchive");
		Thread.sleep(2000);
		DropDownSelection(RulepropertynameDD, "FilePreFix");
		Thread.sleep(2000);
		RulepropertyvalueData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "src");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//mat-icon[contains(text(),'add')]")).click();
		Thread.sleep(2000);
		DropDownSelection(RulepropertynameDD1, "Extension");
		Thread.sleep(2000);
		RulepropertyvalueData1.sendKeys(Keys.chord(Keys.CONTROL, "a"), "txt");
		Thread.sleep(2000);

		SearchButtonClick.click();

	}

	public void verifyingadvancesearchwithdeletingrule() throws Exception {
	

		Thread.sleep(2000);
		DropDownSelection(RulenameDD, "SourceFileArchive");
		Thread.sleep(2000);
		DropDownSelection(RulepropertynameDD, "FilePreFix");
		Thread.sleep(2000);
		RulepropertyvalueData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "src");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//mat-icon[contains(text(),'add')]")).click();
		Thread.sleep(2000);
		DropDownSelection(RulepropertynameDD1, "Extension");
		Thread.sleep(2000);
		RulepropertyvalueData1.sendKeys(Keys.chord(Keys.CONTROL, "a"), "txt");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//mat-icon[contains(text(),'delete')]")).click();
		Thread.sleep(2000);
		SearchButtonClick.click();

	}

}
