package com.pcm.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pcm.qa.base.TestBase;

public class BuildDataFlowPage extends TestBase {

	@FindBy(xpath = "//span[contains(text(),'Data Flows')]")
	public WebElement DataFlowsModuleClick;

	@FindBy(xpath = "//span[text()[contains(.,'Build Data Flow')]]")
	public WebElement BuildDataFlowModuleClick;

	@FindBy(xpath = "//mat-select[@aria-label='Partner/Producer']")
	public WebElement PartnerProfileDD;
	
	@FindBy(xpath = "(//mat-select[@aria-label='Partner/Producer'])[2]")
	public WebElement PartnerProfileDD1;

	@FindBy(xpath = "//mat-select[@aria-label='Application/Consumer']")
	public WebElement ApplicationProfileDD;
	
	@FindBy(xpath = "//mat-select[@aria-label='Application/Consumer'])[2]")
	public WebElement ApplicationProfileDD1;

	@FindBy(xpath = "//button[@class='btn btn-primary ng-star-inserted']")
	public WebElement SearchWorkFlowClick;

	@FindBy(xpath = "//button[@class='btn btn-pcm-3']")
	public WebElement ImportWorkFlowClick;

	@FindBy(xpath = "//button[@class='btn btn-pcm-1']")
	public WebElement SetUPWorkFlowClick;

	@FindBy(xpath = "(//button[@class='btn btn-info'])[1]")
	public WebElement ResetSearchClick;

	@FindBy(xpath = "(//div[@class='mat-form-field-infix'])[3]")
	public WebElement ImportWorkFlowChooseFileClick;

	@FindBy(xpath = "//button[@class='btn btn-primary mat-raised-button mat-primary']")
	public WebElement ImportWorkFlowSubmitClick;

	@FindBy(xpath = "//div[@class='mat-tab-label-content' and contains(text(),'INBOUND File Handling')]")
	public WebElement InboundClick;

	@FindBy(xpath = "//div[@class='mat-tab-label-content' and contains(text(),'OUTBOUND File Handling')]")
	public WebElement OutboundClick;

	@FindBy(xpath = "//div[@class='mat-tab-label-content' and contains(text(),'ACTIVITY')]")
	public WebElement ActivityClick;

	@FindBy(xpath = "//table[@id='pcmFaxActivityHistoryTbl']/tbody/tr")
	public WebElement ActivityLogTable;

	@FindBy(xpath = "//a[contains(text(),'Add Flow')]")
	public WebElement AddFlowbtn;

	@FindBy(xpath = "(//div[@class='mat-radio-inner-circle'])[1]")
	public WebElement IMFTRadiobuttonClick;

	@FindBy(xpath = " //div[contains(text(),' DocHandling ')] ")
	public WebElement IDocHandlingRadiobuttonClick;

	@FindBy(xpath = "(//input[@placeholder='File Name *'])[1]")
	public WebElement IMFTFilenameData;

	@FindBy(xpath = "(//input[@placeholder='Filter'])[1]")
	public WebElement IMFTFilterData;

	@FindBy(xpath = "//input[@id='inMftVersion']")
	public WebElement IMFTVersionData;

	@FindBy(xpath = "//input[@id='inMftTransaction']")
	public WebElement IMFTTransactionData;

	@FindBy(xpath = "//input[@id='inMftPartnerId']")
	public WebElement IMFTSenderIdData;

	@FindBy(xpath = "//input[@id='inMftReceiverId']")
	public WebElement IMFTReceiverIdData;

	@FindBy(xpath = "(//input[@placeholder='File Name'])[1]")
	public WebElement IDocFilenameData;

	@FindBy(xpath = "(//input[@placeholder='Doc Type *'])[1]")
	public WebElement IDocDocumentTypeData;

	@FindBy(xpath = "(//input[@placeholder='Version'])[1]")
	public WebElement IDocVersionData;

	@FindBy(xpath = "(//input[@placeholder='Transaction *'])[1]")
	public WebElement IDocTransactionData;

	@FindBy(xpath = "(//input[@placeholder='Sender Id *'])[1]")
	public WebElement IdocSenderIdData;

	@FindBy(xpath = "(//input[@placeholder='Receiver Id *'])[1]")
	public WebElement IDocReceiverIdData;

	@FindBy(xpath = "//a[contains(text(),'Add Flow')]")
	public WebElement InboundAddClick;
	
	@FindBy(xpath = "//a[contains(text(),'Create')]")
	public WebElement Createclick;
	
	@FindBy(xpath = "//a[contains(text(),'Rules')]")
	public WebElement Rulesclick;

	@FindBy(xpath = "//a[contains(.,'Update')]")
	public WebElement InboundUpdateClick;

	@FindBy(xpath = "//a[contains(text(),'Add Flow')]")
	public WebElement OutboundAddClick;

	@FindBy(xpath = "//a[contains(.,'Update')]")
	public WebElement OutboundUpdateClick;

	@FindBy(xpath = "(//div[@class='mat-radio-inner-circle'])[1]")
	public WebElement OutMFTClick;

	@FindBy(xpath = " //div[contains(text(),' DocHandling ')] ")
	public WebElement OutDocHandlingClick;

	@FindBy(xpath = "(//input[@placeholder='File Name *'])[1]")
	public WebElement OMftFileNameData;

	@FindBy(xpath = "(//input[@placeholder='Filter'])[1]")
	public WebElement OMftFilterData;

	@FindBy(xpath = "//input[@id='outMftVersion']")
	public WebElement OMftVersionData;

	@FindBy(xpath = "//input[@id='outMftTransaction']")
	public WebElement OMftTransactionData;

	@FindBy(xpath = "//input[@id='outMftPartnerId']")
	public WebElement OMftSenderIdData;

	@FindBy(xpath = "//input[@id='outMftReceiverId']")
	public WebElement OMftReceiverIdData;

	@FindBy(xpath = "(//input[@placeholder='File Name'])[1]")
	public WebElement ODocFileNameData;

	@FindBy(xpath = "(//input[@placeholder='Doc Type *'])[1]")
	public WebElement ODocDocTypeData;

	@FindBy(xpath = "//input[@placeholder='Version']")
	public WebElement ODocVersionData;

	@FindBy(xpath = "//input[@placeholder='Transaction *']")
	public WebElement ODocTransactionData;

	@FindBy(xpath = "//input[@placeholder='Sender Id *']")
	public WebElement ODocSenderIdData;

	@FindBy(xpath = "//input[@placeholder='Receiver Id *']")
	public WebElement ODocReceiverIdData;

	@FindBy(xpath = "//ul//li[text()='SourceFileArchive']")
	public WebElement OutboundRulesList1Click;

	@FindBy(xpath = "//ul//li[text()='DestFileArchive']")
	public WebElement OutboundRulesList2Click;

	@FindBy(xpath = "//ul//li[text()='SourceFileArchive']")
	public WebElement InboundRulesList1Click;

	@FindBy(xpath = "//ul//li[text()='DestFileArchive']")
	public WebElement InboundRulesList2Click;

	@FindBy(xpath = "(//button[@class='btn btn-info'])[2]")
	public WebElement CancelClick;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	public WebElement SaveWorkFlowClick;

	@FindBy(xpath = "(//input[@placeholder='Search'])[1]")
	public WebElement SearchRulesclick;
	
	@FindBy(xpath = "//button[contains(text(),' ADD ')]")
	public WebElement IAddRulesClick;

	@FindBy(xpath = "//button[contains(text(),' ADD ')]")
	public WebElement OAddRulesClick;

	@FindBy(xpath = "//button[contains(text(),' REMOVE ')]")
	public WebElement IRemoveRulesClick;

	@FindBy(xpath = "//button[contains(text(),' REMOVE ')]")
	public WebElement ORemoveRulesClick;

	@FindBy(xpath = "//button[@mattooltip='Move up']")
	public WebElement IMoveUpClick;

	@FindBy(xpath = "//button[@mattooltip='Move down']")
	public WebElement IMoveDownClick;

	@FindBy(xpath = "//button[@mattooltip='Move up']")
	public WebElement OMoveUpClick;

	@FindBy(xpath = "//button[@mattooltip='Move down']")
	public WebElement OMoveDownClick;
	
	@FindBy(xpath = "//button[@mattooltip='Edit Rule']")
	public WebElement Editrulebtn;

	@FindBy(xpath = "//button[@id='move-props-in']")
	public WebElement IPropertiesClick;

	@FindBy(xpath = "//button[@id='move-props-out']")
	public WebElement OPropertiesClick;

	@FindBy(xpath = "//input[@id='manageRulePropForm_ruleBean_propertyName1']")
	public WebElement IBuildTestProperty1Data;

	@FindBy(xpath = "//input[@id='manageRulePropForm_ruleBean_propertyName2']")
	public WebElement IBuildTestProperty2Data;

	@FindBy(xpath = "//div[@class='selected-list']//li[contains(.,' SourceFileArchive ')]")
	public WebElement IAppliedRulesListClick;
	
	

	@FindBy(xpath = "//input[@id='manageRulePropForm_submitBtn']")
	public WebElement ISavePropertiesClick;

	@FindBy(xpath = "//div[@id='swal2-content']")
	public WebElement ActionMessage;

	@FindBy(xpath = "//div[@id='swal2-content']")
	public WebElement MFTErrorMsg;

	@FindBy(xpath = "//input[@placeholder='FilePreFix']")
	public WebElement BuildTestProperty1Data;

	@FindBy(xpath = "//input[@placeholder='DateTimeFormate']")
	public WebElement BuildTestProperty2Data;

	@FindBy(xpath = "(//button[text()=' SAVE '])[1]")
	public WebElement SavePropertiesClick;
	
	@FindBy(xpath = "//mat-panel-title[contains(text(),' RULES ')]")
	public WebElement minimizerules;

	@FindBy(xpath = "(//button[text()=' SAVE '])[2]")
	public WebElement SaveRulesClick;
	
	@FindBy(xpath = "//div[@class='selected-list']//li[contains(.,' SourceFileArchive ')]")
	public WebElement OAppliedRulesListClick;

	@FindBy(xpath = "//div[@id='swal2-content']")
	public WebElement ErrorMessage;

	@FindBy(xpath = "//div[@id='swal2-content']")
	public WebElement ErrorMessageImport;
	
	@FindBy(xpath = "//button[contains(text(),'OK')]")
	public WebElement ErrorMessageOKbtn;

	@FindBy(xpath = "//button[@id='exportRulesButton']")
	public WebElement ExportClick;

	@FindBy(xpath = "//button[contains(text(),' COPY DATAFLOW ')]")
	public WebElement CopyWorkflowClick;

	@FindBy(xpath = "(//input[@placeholder='Sender Id'])[1]")
	public WebElement CopyInSenderID;

	@FindBy(xpath = "(//input[@placeholder='Receiver Id'])[1]")
	public WebElement CopyInReceiverID;

	@FindBy(xpath = "(//input[@placeholder='Sender Id'])[2]")
	public WebElement CopyOutSenderID;

	@FindBy(xpath = "(//input[@placeholder='Receiver Id'])[2]")
	public WebElement CopyOutReceiverID;

	@FindBy(xpath = "//button[contains(.,' UPDATE ')]")
	public WebElement CopyUpdateClick;

	@FindBy(xpath = "//button[contains(.,' DELETE DATAFLOW ')]")
	public WebElement DeleteWorkflowClick;
	
	@FindBy(xpath = "//button[contains(.,'Delete')]")
	public WebElement yesDelete;
	
	@FindBy(xpath = "(//div//h3)[2]")
	public WebElement BuildDataFlowtitle;

	public BuildDataFlowPage() {
		PageFactory.initElements(driver, this);
	}

	public String validateBuildDataFlowPageTitle() throws InterruptedException {

		
		DataFlowsModuleClick.click();
		Thread.sleep(1000);
	
		BuildDataFlowModuleClick.click();
		Thread.sleep(2000);
		
		return BuildDataFlowtitle.getText();
	}

	public void DFProfileSelection(String PartnerProfile, String ApplicationProfile) throws Throwable {
		Thread.sleep(1000);
		DropDownSelection(PartnerProfileDD, PartnerProfile);
		Thread.sleep(1000);
		DropDownSelection(ApplicationProfileDD, ApplicationProfile);
	}

	public void DFProfileSelection1(String PartnerProfile, String ApplicationProfile) throws Throwable {
		DropDownSelection(PartnerProfileDD1, PartnerProfile);
		Thread.sleep(1000);
		DropDownSelection(ApplicationProfileDD1, ApplicationProfile);
	}
	
	public void InboundMFTClick() throws InterruptedException {
		//Actionselection(driver, InboundClick);
		InboundClick.click();
		Thread.sleep(1000);
		//Actionselection(driver, IMFTRadiobuttonClick);
		IMFTRadiobuttonClick.click();
		Thread.sleep(1000);
	}

	public void InboundDocClick() throws InterruptedException {
		//Actionselection(driver, InboundClick);
		InboundClick.click();
		Thread.sleep(1000);
		//Actionselection(driver, IDocHandlingRadiobuttonClick);
		IDocHandlingRadiobuttonClick.click();
		Thread.sleep(1000);
		
	}

	public void IMFTValues(String IMFTFileNameValue, String IMFTFilterValue) {
		IMFTFilenameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), IMFTFileNameValue);
		IMFTFilterData.sendKeys(Keys.chord(Keys.CONTROL, "a"), IMFTFilterValue);
	}

	public void IDocValues(String IDocFName, String IDocDocumentType, String IDocVersion, String IDocTransaction,
			String IdocSenderId, String IDocReceiverId) throws InterruptedException {
		IDocFilenameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), IDocFName);
		IDocDocumentTypeData.sendKeys(Keys.chord(Keys.CONTROL, "a"), IDocDocumentType);
		IDocVersionData.sendKeys(Keys.chord(Keys.CONTROL, "a"), IDocVersion);
		IDocTransactionData.sendKeys(Keys.chord(Keys.CONTROL, "a"), IDocTransaction);
		IdocSenderIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), IdocSenderId);
		IDocReceiverIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), IDocReceiverId);
	}

	public void OutboundMFTClick() throws InterruptedException {
	
		OutboundClick.click();
		Thread.sleep(1000);
		OutMFTClick.click();
		Thread.sleep(1000);
	}

	public void OutboundDocHClick() throws InterruptedException {
		OutboundClick.click();
		Thread.sleep(1000);
		OutDocHandlingClick.click();
		Thread.sleep(1000);
	}

	public void OMFTValues(String OMFTFileNameValue, String OMFTFilterValue) {
		OMftFileNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), OMFTFileNameValue);
		OMftFilterData.sendKeys(Keys.chord(Keys.CONTROL, "a"), OMFTFilterValue); // "MFT"
	}

	public void ODocValues(String ODocFName, String ODocDocumentType, String ODocVersion, String ODocTransaction,
			String OdocSenderId, String ODocReceiverId) {
		ODocFileNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), ODocFName);
		ODocDocTypeData.sendKeys(Keys.chord(Keys.CONTROL, "a"), ODocDocumentType);
		ODocVersionData.sendKeys(Keys.chord(Keys.CONTROL, "a"), ODocVersion);
		ODocTransactionData.sendKeys(Keys.chord(Keys.CONTROL, "a"), ODocTransaction);
		ODocSenderIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), OdocSenderId);
		ODocReceiverIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), ODocReceiverId);
	}

	public void TableInbound(String title, int colnum, String Rule_Edit_Delete) throws InterruptedException {
		List<WebElement> col = driver
				.findElements(By.xpath("//table//tbody/tr//td[" + colnum + "]"));
		for (int i = 0; i < col.size(); i++) {
			System.out.println(col.get(i).getText());
			if (Rule_Edit_Delete.equals("Rule") && (title.equals(col.get(i).getText()))) {
				i = i + 1;
			
				driver.findElement(By.xpath("(//table//tbody/tr[" + i + "]/td[4]//a)[1]")).click();
				break;
				
			} else if (Rule_Edit_Delete.equals("Edit") && (title.equals(col.get(i).getText()))) {
				i = i + 1;
				Thread.sleep(1000);
				driver.findElement(By.xpath("(//table//tbody/tr[" + i + "]/td[4]//a)[2]")).click();
				break;
				
			} else if (Rule_Edit_Delete.equals("Delete") && (title.equals(col.get(i).getText()))) {
				i = i + 1;
				
				Thread.sleep(1000);
				driver.findElement(By.xpath("(//table//tbody/tr[" + i + "]/td[4]//a)[3]")).click();
				yesDelete.click();
				
				break;
				
			}
		}
	}
	
	public void TableDoc(String title, int colnum, String Rule_Edit_Delete) throws InterruptedException {
		List<WebElement> col = driver
				.findElements(By.xpath("//table//tbody/tr//td[" + colnum + "]"));
		for (int i = 0; i < col.size(); i++) {
			System.out.println(col.get(i).getText());
			if (Rule_Edit_Delete.equals("Rule") && (title.equals(col.get(i).getText()))) {
				i = i + 1;
			
				driver.findElement(By.xpath("(//table//tbody/tr[" + i + "]/td[8]//a)[1]")).click();
				break;
				
			} else if (Rule_Edit_Delete.equals("Edit") && (title.equals(col.get(i).getText()))) {
				i = i + 1;
				Thread.sleep(1000);
				driver.findElement(By.xpath("(//table//tbody/tr[" + i + "]/td[8]//a)[2]")).click();
				break;
				
			} else if (Rule_Edit_Delete.equals("Delete") && (title.equals(col.get(i).getText()))) {
				i = i + 1;
				
				Thread.sleep(1000);
				driver.findElement(By.xpath("(//table//tbody/tr[" + i + "]/td[8]//a)[3]")).click();
				yesDelete.click();
				
				break;
				
			}
		}
	}

	public void TableOutbound(String title, int colnum, String Rule_Edit_Delete) throws InterruptedException {
		List<WebElement> col = driver
				.findElements(By.xpath("//table//tbody//tr//td[" + colnum + "]"));
		for (int i = 0; i < col.size(); i++) {
			System.out.println(col.get(i).getText());
			if (Rule_Edit_Delete.equals("Rule") && (title.equals(col.get(i).getText()))) {
				i = i + 1;
				driver.findElement(By.xpath("(//table//tbody/tr[" + i + "]/td[4]//a)[1]")).click();
				break;
			} else if (Rule_Edit_Delete.equals("Edit") && (title.equals(col.get(i).getText()))) {
				i = i + 1;
				driver.findElement(By.xpath("(//table//tbody/tr[" + i + "]/td[4]//a)[2]")).click();
				break;
			} else if (Rule_Edit_Delete.equals("Delete") && (title.equals(col.get(i).getText()))) {
				i = i + 1;
				driver.findElement(By.xpath("(//table//tbody/tr[" + i + "]/td[4]//a)[3]")).click();
				yesDelete.click();
				break;
			}
		}
	}

	public void InboundRules() throws Throwable {

		//Actionselection(driver, InboundRulesList1Click);
		InboundRulesList1Click.click();
		InboundRulesList1Click.click();
		//Actionselection(driver, IAddRulesClick);
		IAddRulesClick.click();
		Thread.sleep(1000);
		//driver.switchTo().frame(0);
		BuildTestProperty1Data.sendKeys("Propertyasdfg1");
		BuildTestProperty2Data.sendKeys("Propertyasdfg2");
		//Actionselection(driver, SavePropertiesClick);
		SavePropertiesClick.click();
		//String result1 = ActionMessage.getText();
		//System.out.println(result1);

		//driver.switchTo().defaultContent();
		//driver.switchTo().window(driver.getWindowHandle());
		//driver.findElement(By.xpath("//div[@id='addRuleWindow']/div[1]//img[@title='Close']")).click();

		Thread.sleep(2000);
		//Actionselection(driver, InboundRulesList2Click);
		InboundRulesList2Click.click();
		InboundRulesList2Click.click();
		//Actionselection(driver, IAddRulesClick);
		IAddRulesClick.click();
		//driver.switchTo().frame(0);
		BuildTestProperty1Data.sendKeys("Propertyasdfg1");
		BuildTestProperty2Data.sendKeys("Propertyasdfg2");
		//////// switch to window or frame/////////
		//Actionselection(driver, SavePropertiesClick);
		SavePropertiesClick.click();
	//	String result2 = ActionMessage.getText();
		//System.out.println(result2);

		//driver.switchTo().defaultContent();
		//driver.switchTo().window(driver.getWindowHandle());
		//driver.findElement(By.xpath("//div[@id='addRuleWindow']/div[1]//img[@title='Close']")).click();

		//Actionselection(driver, IAppliedRulesListClick);
		IAppliedRulesListClick.click();
		
		//Actionselection(driver, IMoveUpClick);
		IMoveUpClick.click();
		Thread.sleep(1000);
		//Actionselection(driver, IMoveDownClick);
		IMoveDownClick.click();
		Thread.sleep(1000);
		IRemoveRulesClick.click();
		Thread.sleep(1000);
		//Actionselection(driver, IPropertiesClick);
		//driver.switchTo().frame(1);
		//Thread.sleep(2000);
		//Actionselection(driver, SavePropertiesClick);
		minimizerules.click();
		SaveRulesClick.click();
		//String result3 = ActionMessage.getText();
		//System.out.println(result3);

	/*	driver.switchTo().defaultContent();
		for (String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
			System.out.println(handle);
			driver.findElement(By.xpath("(//img[@title='Close'])[2]")).click();

		}*/
		
		//Actionselection(driver, IRemoveRulesClick);
		

	}

	public void ODocAdd() throws InterruptedException {
		Actionselection(driver, OutboundClick);
		Actionselection(driver, OutDocHandlingClick);
		ODocFileNameData.sendKeys("answei");

		ODocDocTypeData.sendKeys("anstyji");
		ODocVersionData.sendKeys("12.0");
		ODocTransactionData.sendKeys("23645");
		ODocSenderIdData.sendKeys("efug");
		ODocReceiverIdData.sendKeys("wwetrr");
		Actionselection(driver, InboundAddClick);
	}

	public void OutboundRules() throws Throwable {

		//Actionselection(driver, OutboundRulesList1Click);
		OutboundRulesList1Click.click();
		OutboundRulesList1Click.click();
		//Actionselection(driver, OAddRulesClick);
		OAddRulesClick.click();
		//driver.switchTo().frame(0);
		BuildTestProperty1Data.sendKeys("Propertyasdfg1");
		BuildTestProperty2Data.sendKeys("Propertyasdfg2");
		//Actionselection(driver, SavePropertiesClick);
		SavePropertiesClick.click();
		//String result1 = ActionMessage.getText();
		//System.out.println(result1);

		//driver.switchTo().defaultContent();
		//driver.switchTo().window(driver.getWindowHandle());
		//driver.findElement(By.xpath("//div[@id='addRuleWindow']/div[1]//img[@title='Close']")).click();

		Thread.sleep(2000);
		//Actionselection(driver, OutboundRulesList2Click);
		OutboundRulesList2Click.click();
		OutboundRulesList2Click.click();
		//Actionselection(driver, OAddRulesClick);
		OAddRulesClick.click();
		//driver.switchTo().frame(0);
		//////// switch to window or frame/////////
		//Actionselection(driver, SavePropertiesClick);
		SavePropertiesClick.click();
		//String result2 = ActionMessage.getText();
		//System.out.println(result2);

		//driver.switchTo().defaultContent();
		//driver.switchTo().window(driver.getWindowHandle());
		//driver.findElement(By.xpath("//div[@id='addRuleWindow']/div[1]//img[@title='Close']")).click();

		//Actionselection(driver, OAppliedRulesListClick);
		OAppliedRulesListClick.click();
		//Actionselection(driver, OMoveUpClick);
		OMoveUpClick.click();
		//Actionselection(driver, OMoveDownClick);
		OMoveDownClick.click();
		//Actionselection(driver, OPropertiesClick);
		//driver.switchTo().frame(1);
		Thread.sleep(2000);
		//Actionselection(driver, SavePropertiesClick);
		minimizerules.click();
		SaveRulesClick.click();
		//String result3 = ActionMessage.getText();
		//System.out.println(result3);

//		//driver.switchTo().defaultContent();
//		for (String handle : driver.getWindowHandles()) {
//			driver.switchTo().window(handle);
//			System.out.println(handle);
//			driver.findElement(By.xpath("(//img[@title='Close'])[2]")).click();
//
//		}
		//Actionselection(driver, ORemoveRulesClick);

	}
	
	
	public void selectrule(String rulename) {
		
		List<WebElement> list = driver.findElements(By.xpath("//ul//li"));
		
		for(int i=0;i<=list.size();i++) {
			
			if(list.get(i).getText().equals(rulename)) {
				
				list.get(i).click();
				break;
				
			}
			
			
		}
	}

}
