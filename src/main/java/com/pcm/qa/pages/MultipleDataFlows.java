package com.pcm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pcm.qa.base.TestBase;

public class MultipleDataFlows extends TestBase {

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
	
	@FindBy(xpath = "//button[@class='btn btn-pcm-6']")
	public WebElement SetUPMultipleWorkFlowClick;

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
	
	@FindBy(xpath = "//input[@placeholder='Partner Name']")
	public WebElement PartnernameData;
	
	@FindBy(xpath = "//input[@placeholder='Application Name']")
	public WebElement ApplicationnameData;
	
	@FindBy(xpath = "//mat-select[@aria-label='SEQ Type']")
	public WebElement SeqtypeDD;
	
	@FindBy(xpath = "//mat-select[@aria-label='Flow']")
	public WebElement FlowDD;
	
	@FindBy(xpath = "//input[@placeholder='FileName']")
	public WebElement FilenameData;
	
	@FindBy(xpath = "//input[@placeholder='Doc Type']")
	public WebElement DoctypeData;
	
	@FindBy(xpath = "//input[@placeholder='Transaction']")
	public WebElement TransactionData;
	
	@FindBy(xpath = "//input[@placeholder='Sender Id']")
	public WebElement SenderIdData;
	
	@FindBy(xpath = "//input[@placeholder='Receiver Id']")
	public WebElement ReceiverIdData;
	
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	public WebElement SearchWorkFlowClick1;
	
	@FindBy(xpath = "//button[@class='btn btn-info']")
	public WebElement ResetButton;
	
	@FindBy(xpath = "(//div//h3)[2]")
	public WebElement BuildDataFlowPagetitle;
	

	public MultipleDataFlows() {
		PageFactory.initElements(driver, this);
	}

	public void setup() throws InterruptedException {

		DataFlowsModuleClick.click();
		Thread.sleep(1000);

		BuildDataFlowModuleClick.click();
		Thread.sleep(2000);

	}
	
	
	public void DFProfileSelection(String PartnerProfile, String ApplicationProfile) throws Throwable {
		Thread.sleep(2000);
		DropDownSelection(PartnerProfileDD, PartnerProfile);
		Thread.sleep(2000);
		DropDownSelection(ApplicationProfileDD, ApplicationProfile);
	}

}
